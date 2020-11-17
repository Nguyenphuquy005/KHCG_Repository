package com.example.demo;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ReadImages {
    public static void main(String[] args) throws TesseractException {
        ITesseract image = new Tesseract();
        String str =   image.doOCR(new File("D:\\tesseract\\14.png"));
        System.out.println("outPut: " + str);
    }
}
