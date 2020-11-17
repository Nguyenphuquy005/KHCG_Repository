package Commons;

import Models.House;
import Models.Villa;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FuncWriteAndReadFileHouse {
    private static final int NUM_OF_LINE_SKIP =1 ;
    // the dilimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for qoute elements
    private static final char DEFAULT_QUOTE = '"';
    // path file villa.csv
    private static final String pathHouse = "src/Data/house.csv";
    //header House.csv
    private static String[] headerRecordHouse = new String[]{"id", "nameServices", "areaUsed", "rentenCost", "maxPeople" ,
            "typeOfrent" , "roomStard", "describeConvenien", "numFloot"};

    public static void writHouseToFileCSV(ArrayList<House> arrayList) {
        try (Writer writer = new FileWriter(pathHouse);
                CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordHouse);
            for (House house : arrayList) {
                csvWriter.writeNext(new String[]{
                        house.getId(),
                        house.getNameServices(),
                        String.valueOf(house.getAreaUsed()),
                        String.valueOf(house.getRentenCost()),
                        String.valueOf(house.getMaxPeople()),
                        house.getTypeOfrent(),
                        house.getRoomStard(),
                        house.getDescribeConvenien(),
                        String.valueOf(house.getNumFloot()),
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static ArrayList<House> getHouseFromCSV(){
        Path path = Paths.get(pathHouse);
        if( !Files.exists(path)){
            try {
                Writer writer =  new FileWriter(pathHouse);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<House> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(House.class);
        strategy.setColumnMapping(headerRecordHouse);
        CsvToBean<House> csvToBean = null ;
        try {
            csvToBean = new CsvToBeanBuilder<House>(new FileReader(pathHouse))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<House>) csvToBean.parse();
    }
}
