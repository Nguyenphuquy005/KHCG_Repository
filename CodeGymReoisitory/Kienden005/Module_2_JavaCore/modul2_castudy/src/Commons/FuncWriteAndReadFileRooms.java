package Commons;

import Models.House;
import Models.Rooms;
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

public class FuncWriteAndReadFileRooms {
    private static final int NUM_OF_LINE_SKIP =1 ;
    // the dilimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for qoute elements
    private static final char DEFAULT_QUOTE = '"';
    // path file villa.csv
    private static final String pathRoom = "src/Data/room.csv";
    //header House.csv
    private static String[] headerRecordRoom = new String[]{"id", "nameServices", "areaUsed", "rentenCost", "maxPeople" ,
            "typeOfrent" , "freeCome"};
    public static void writeRoomToFileCSV(ArrayList<Rooms> arrayList){
        try (Writer writer = new FileWriter(pathRoom
        );
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordRoom);
            for (Rooms rooms : arrayList) {
                csvWriter.writeNext(new String[]{
                        rooms.getId(),
                        rooms.getNameServices(),
                        String.valueOf(rooms.getAreaUsed()),
                        String.valueOf(rooms.getRentenCost()),
                        String.valueOf(rooms.getMaxPeople()),
                        rooms.getTypeOfrent(),
                       String.valueOf(rooms.getFreeCome()) ,
                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    public static ArrayList<Rooms> getRoomFromCSV(){
        Path path = Paths.get(pathRoom);
        if( !Files.exists(path)){
            try {
                Writer writer =  new FileWriter(pathRoom);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Rooms> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Rooms.class);
        strategy.setColumnMapping(headerRecordRoom);
        CsvToBean<Rooms> csvToBean = null ;
        try {
            csvToBean = new CsvToBeanBuilder<Rooms>(new FileReader(pathRoom))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        return (ArrayList<Rooms>) csvToBean.parse();
    }
}
