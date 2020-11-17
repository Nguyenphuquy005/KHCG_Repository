package com.example.demo;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class Test {
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {
            tesseract.setDatapath("D:\\CoLearn\\Code\\Tess4J\\tessdata");
            // the path of your tess data folder
            // inside the extracted file
            String text
                    = tesseract.doOCR(new File("D:\\tesseract\\14.png"));
            // path of your image file
            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
}