package com.study.springframework.opencv.straightenimage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StraightenImage {
    @Autowired
    private IImageProcessing imageProcessing;


    public void straitenImage() {
        String inputPath = "E:\\Document\\Document\\skew-corner.PNG";
        String outputPath = "E:\\Document\\Document\\skew-corner-straighten.PNG";
        imageProcessing.straightenImage(inputPath, outputPath);
    }
}
