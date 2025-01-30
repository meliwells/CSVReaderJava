import data.CSVReader;
import data.Record;
import view.View;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//calling view and print
        View view = new View();
        view.printAllRecords();
        view.printByCategory("Meals: ");
    }
}
