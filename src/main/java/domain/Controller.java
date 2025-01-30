package domain;

import data.CSVReader;
import data.DataAccessException;
import data.Record;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Controller {
    //filterByCategory()
    public List<Record> filterByCategory(String category) throws DataAccessException {
        ArrayList<Record> result = new ArrayList<>();
        for (Record record : getAllRecords()) {
            if (record.getCategory().equals(category)) {
                result.add(record);
            }
        }
        return result;
    }

    //getAllRecords()
    public List<data.Record> getAllRecords() throws DataAccessException {
        ArrayList<Record> result = CSVReader.readCSVFile();
        return result;

    }

    public void addNewRecord(Record record) {
        //in csv object to string, pass to csv
    }
}
