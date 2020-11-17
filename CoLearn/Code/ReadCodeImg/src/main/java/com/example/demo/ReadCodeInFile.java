package com.example.demo;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class ReadCodeInFile {
    public static void main(String[] args) {
        Tesseract tesseract = new Tesseract();
        try {

            tesseract.setDatapath("D:\\CoLearn\\Code\\Tess4j");

            // the path of your tess data folder
            // inside the extracted file
            String text
                    = tesseract.doOCR(new File("D:\\CoLearn\\Code\\tesseract\\18.png"));

            // path of your image file
            System.out.print(text);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
    }
