package org.example.demo;

// ImageConverter.java
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public interface ImageConverter {
    void convert(BufferedImage image, File outputFile, String format) throws IOException;

    String getImageFormat(BufferedImage image);
}
