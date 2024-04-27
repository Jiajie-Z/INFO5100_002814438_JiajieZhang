package org.example.demo;

import javafx.application.Application;
import javafx.embed.swing.SwingFXUtils;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import javafx.scene.control.ScrollPane;
import javafx.scene.control.ScrollPane.ScrollBarPolicy;


public class ImageUploaderApp extends Application {

    private VBox imageContainer;
    private ScrollPane scrollPane;
    private ImageConverter imageConverter;
    private AlertService alertService;

    @Override

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Image Converter");

        imageConverter = new ImageIOConverter();
        alertService = new AlertService();

        Button uploadButton = new Button("Upload Image");
        uploadButton.setOnAction(e -> uploadImage(primaryStage));

        CheckBox pngCheckbox = new CheckBox("PNG");
        CheckBox jpgCheckbox = new CheckBox("JPEG");
        CheckBox gifCheckbox = new CheckBox("GIF");

        Button convertButton = new Button("Convert and Download");
        convertButton.setOnAction(e -> convertAndDownloadImage(primaryStage, pngCheckbox.isSelected(), jpgCheckbox.isSelected(), gifCheckbox.isSelected()));

        // Container for displaying uploaded images and image formats
        imageContainer = new VBox();
        imageContainer.setPadding(new Insets(10));
        imageContainer.setSpacing(10);

        //  with scrollpane, all the info and buttons can be fit in the view port
        scrollPane = new ScrollPane();
        scrollPane.setContent(imageContainer);
        scrollPane.setFitToWidth(true);
        scrollPane.setVbarPolicy(ScrollBarPolicy.AS_NEEDED);
        scrollPane.setHbarPolicy(ScrollBarPolicy.NEVER);

        VBox root = new VBox(10);
        root.setPadding(new Insets(10));
        root.getChildren().addAll(uploadButton, scrollPane, pngCheckbox, jpgCheckbox, gifCheckbox, convertButton);

        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }
    private void uploadImage(Stage primaryStage) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select Images");
        fileChooser.getExtensionFilters().addAll(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*.jpg", "*.jpeg", "*.gif")
        );

        List<File> selectedFiles = fileChooser.showOpenMultipleDialog(primaryStage);
        if (selectedFiles != null && !((List<?>) selectedFiles).isEmpty()) {
            imageContainer.getChildren().clear();  // Clear the previous images

            for (File file : selectedFiles) {
                try (FileInputStream fis = new FileInputStream(file)) {
                    Image image = new Image(fis);
                    ImageView thumbnailView = new ImageView(image);
                    thumbnailView.setFitWidth(100);
                    thumbnailView.setFitHeight(100); //100*100 preview

                    Label propertiesLabel = new Label(String.format("Image Properties:\nWidth: %.0f\nHeight: %.0f\nFormat: %s",
                            image.getWidth(), image.getHeight(), getImageFormat(file)));

                    HBox imageBox = new HBox(10);
                    imageBox.getChildren().addAll(thumbnailView, propertiesLabel);
                    imageContainer.getChildren().add(imageBox);
                } catch (IOException e) {
                    alertService.showAlert(Alert.AlertType.ERROR, "Error", "Error reading file: " + e.getMessage());
                }
            }
        }
    }



    private String getImageFormat(File file) {
        String format = "";
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            format = bufferedImage != null ? imageConverter.getImageFormat(bufferedImage) : "Unknown";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return format; //return format to display
    }

    private void convertAndDownloadImage(Stage primaryStage, boolean toPNG, boolean toJPEG, boolean toGIF) {
        if (imageContainer.getChildren().isEmpty()) {
            alertService.showAlert(Alert.AlertType.ERROR, "Error", "Please upload an image before converting.");
            return;
        }

        HBox imageBox = (HBox) imageContainer.getChildren().get(0);
        ImageView thumbnailView = (ImageView) imageBox.getChildren().get(0);
        Image image = thumbnailView.getImage();

        BufferedImage bufferedImage = SwingFXUtils.fromFXImage(image, null);

        try {
            if (toPNG) {
                saveImage(primaryStage, bufferedImage, "png");
            }
            if (toJPEG) {
                saveImage(primaryStage, bufferedImage, "jpeg");
            }
            if (toGIF) {
                saveImage(primaryStage, bufferedImage, "gif");
            }
        } catch (IOException e) {
            alertService.showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during image conversion: " + e.getMessage());
        }
    }

    private void saveImage(Stage primaryStage, BufferedImage image, String format) throws IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialFileName("converted." + format);
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter(format.toUpperCase() + " files", "*." + format));
        File outputFile = fileChooser.showSaveDialog(primaryStage);
        if (outputFile != null) {
            try {
                imageConverter.convert(image, outputFile, format);
                alertService.showAlert(Alert.AlertType.INFORMATION, "Download", "Converted image saved in: " + outputFile.getAbsolutePath());
            } catch (IOException e) {
                alertService.showAlert(Alert.AlertType.ERROR, "Error", "An error occurred during file saving: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}


