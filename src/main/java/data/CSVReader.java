package data;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
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
                //create method to convert string to record
                //after record created, add to result
                String[] values = line.split(delimiter);
                System.out.println(Arrays.toString(values));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
