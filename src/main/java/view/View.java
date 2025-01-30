package view;

import domain.Controller;

import java.util.List;

public class View {
    //public void printAll() instant controller, for loop to print
    Controller controller = new Controller();

    public void printAllRecords() {
       for (data.Record record : controller.getAllRecords()) {
           System.out.println(record);
        }

    }
    public void printByCategory(String category) {
        System.out.println(category);
        for (data.Record record : controller.filterByCategory(category)) {
            System.out.println(record);
        }

    }
}


