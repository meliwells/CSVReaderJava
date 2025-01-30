package data;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVReader {
//properties
//constructor
//method
    private static final String delimiter = ",";
    private static final String csvFile = "expense_report.csv";


    public static ArrayList<Record> readCSVFile() {
        ArrayList<Record> result = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(csvFile))) {
            reader.readLine(); //to ignore header
            String line;
            while ((line = reader.readLine()) != null) {
                Record record = deserialize(line);
                if (record != null) {
                    result.add(record);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    private static Record deserialize(String line) {
        String[] fields = line.split(delimiter, -1);
        if (fields.length == 5) {
            Record record = new Record();
            record.setDate(LocalDate.parse(fields[0]));
            record.setCategory((fields[1]));
            record.setDescription((fields[2]));
            record.setAmount(new BigDecimal(fields[3]).setScale(2, RoundingMode.HALF_UP));
            record.setPaymentMethod((fields[4]));
            return record;
        }
        return null;
    }

 }


 // this.date = date;
//        this.category = category;
//        Description = description;
//        this.amount = amount;
//        this.paymentMethod = paymentMethod;