package org.example.demo;


import javax.imageio.ImageIO;
import javax.imageio.ImageWriter;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class ImageIOConverter implements ImageConverter {

//    convert bufferedimage to specified format and writes it to a file
    @Override
    public void convert(BufferedImage image, File outputFile, String format) throws IOException {
        ImageIO.write(image, format, outputFile);
    }

    @Override
    public String getImageFormat(BufferedImage image) {
        String[] formats = ImageIO.getWriterFormatNames();
        for (String format : formats) {
            Iterator<ImageWriter> writers = ImageIO.getImageWritersByFormatName(format);
            if (writers.hasNext()) {
                return format;
            }
        }
        return "Unknown";
    }
}



