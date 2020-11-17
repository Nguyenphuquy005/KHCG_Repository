package Commons;

import Models.Services;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.TreeSet;

public class FuncWriteAndReadFileCSV {
    private  static  final int NUM_OF_LINE_SKIP = 1 ;
    // the dilimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for qoute elements
    private static final char DEFAULT_QUOTE = '"';
    // path file villa.csv
    private static final String pathVilla = "src/Data/villa.csv";
    //header Villa.csv
    private static String[] headerRecordVilla = new String[]{"id", "nameServices", "areaUsed", "rentenCost", "maxPeople" ,
           "typeOfrent" , "roomStard", "describeConvenien", "areaSwim", "numFloot"};
    //funtion write Villa to File CSV
    public static void writeVillaToFileCSV(ArrayList<Villa> arrayList) {
        try (Writer writer = new FileWriter(pathVilla);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordVilla);
            for (Villa villa : arrayList) {
                csvWriter.writeNext(new String[]{
                        villa.getId(),
                        villa.getNameServices(),
                        String.valueOf(villa.getAreaUsed()),
                        String.valueOf(villa.getRentenCost()),
                        String.valueOf(villa.getMaxPeople()),
                        villa.getTypeOfrent(),
                        villa.getRoomStard(),
                        villa.getDescribeConvenien(),
                        String.valueOf(villa.getAreaSwim()),
                        String.valueOf(villa.getNumFloot()),
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
  public static ArrayList<Villa> getVillaFromCSV(){
      Path path = Paths.get(pathVilla);
      if( !Files.exists(path)){
          try {
              Writer writer =  new FileWriter(pathVilla);
          }catch (IOException ex){
              System.out.println(ex.getMessage());
          }
      }
      ColumnPositionMappingStrategy<Villa> strategy = new ColumnPositionMappingStrategy<>();
      strategy.setType(Villa.class);
      strategy.setColumnMapping(headerRecordVilla);
      CsvToBean<Villa> csvToBean = null ;
      try {
          csvToBean = new CsvToBeanBuilder<Villa>(new FileReader(pathVilla))
                  .withMappingStrategy(strategy)
                  .withSeparator(DEFAULT_SEPARATOR)
                  .withQuoteChar(DEFAULT_QUOTE)
                  .withSkipLines(NUM_OF_LINE_SKIP)
                  .withIgnoreLeadingWhiteSpace(true)
                  .build();
      }catch (FileNotFoundException ex){
          System.out.println(ex.getMessage());
      }
      return (ArrayList<Villa>) csvToBean.parse();
  }




}
