package date;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateController {
    @FXML
    private DatePicker datePicker;
    @FXML
    private Label label;

//    public void getDate(ActionEvent event) {
//        LocalDate date = datePicker.getValue();
//        label.setText(date.toString().replaceAll("-", " / "));
//        System.out.println(date);
//        System.out.println("Day of moth:" + date.getDayOfMonth());
//        System.out.println("Month value:" + date.getMonthValue());
//        System.out.println("Year:" + date.getYear());
//        System.out.println("Day of Week:" + date.getDayOfWeek());
//    }

    public void getDate(ActionEvent event) {
        LocalDate date = datePicker.getValue();
        String formattedDate = date.format(DateTimeFormatter.ofPattern("dd / MM / yyy"));
        label.setText(formattedDate);
    }
}
