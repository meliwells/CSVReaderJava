package data;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
//properties
//constructor
//method
    private static final String delimiter = ",";
    private final String filePath;
    //File file = new File("expense_report.csv");

    public CSVReader(String filePath) {
        this.filePath = filePath;
    }


    public void readCSVFile() {
        try(FileReader fileReader = new FileReader(filePath)) {
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
