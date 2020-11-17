package com.example.demo;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ReadCode {
    public static void main(String[] args) throws TesseractException {
        ITesseract image = new Tesseract() ;
        String str = image.doOCR(new File("D:\\CoLearn\\Code\\tesseract\\18.png"));
        System.out.println(str);
    }
}
