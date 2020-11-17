package Commons;

import Models.Customer;
import com.opencsv.CSVWriter;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class FruncWriteBokingCustommer {
    private  static  final int NUM_OF_LINE_SKIP = 1 ;
    // the dilimiter to use for separating entries
    private static final char DEFAULT_SEPARATOR = ',';
    // the character to use for qoute elements
    private static final char DEFAULT_QUOTE = '"';
    // path file villa.csv
    private static final String pathBookingCustommer = "src/Data/bookingcustommer.csv";
    //header Villa.csv
    private static String[] headerRecordCustommer = new String[]{ "idCustomer" ,"fullName", "Birthday", "Sex", "phoneNumber", "idCard" ,
            "email" , "styleGuest", "Address", "usedServices"};
    //funtion write Villa to File CSV
    public static void writeBookingCustommerToFileCSV(ArrayList<Customer> arrayList) {
        try (Writer writer = new FileWriter(pathBookingCustommer);
             CSVWriter csvWriter = new CSVWriter(writer, CSVWriter.DEFAULT_SEPARATOR,
                     CSVWriter.NO_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_ESCAPE_CHARACTER,
                     CSVWriter.DEFAULT_LINE_END)) {
            csvWriter.writeNext(headerRecordCustommer);
            for (Customer customer : arrayList) {
                csvWriter.writeNext(new String[]{
                        customer.getIdCustomer(),
                        customer.getFullName(),
                        customer.getBirthday(),
                        customer.getSex(),
                        String.valueOf(customer.getPhoneNumber()),
                        String.valueOf(customer.getIdCard() ),
                        customer.getEmail(),
                        customer.getStyleGuest(),
                        customer.getAddress(),


                });
            }

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static ArrayList<Customer> getCustommerFromCSV(){ //SAI O DAY ???? GET THIEU ID
        Path path = Paths.get(pathBookingCustommer);
        if( !Files.exists(path)){
            try {
                Writer writer =  new FileWriter(pathBookingCustommer);
            }catch (IOException ex){
                System.out.println(ex.getMessage());
            }
        }
        ColumnPositionMappingStrategy<Customer> strategy = new ColumnPositionMappingStrategy<>();
        strategy.setType(Customer.class);
        strategy.setColumnMapping(headerRecordCustommer);
        CsvToBean<Customer> csvToBean = null ;
        try {
            csvToBean = new CsvToBeanBuilder<Customer>(new FileReader(pathBookingCustommer))
                    .withMappingStrategy(strategy)
                    .withSeparator(DEFAULT_SEPARATOR)
                    .withQuoteChar(DEFAULT_QUOTE)
                    .withSkipLines(NUM_OF_LINE_SKIP)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
        }catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        assert csvToBean != null;
        return (ArrayList<Customer>) csvToBean.parse();
    }


}
