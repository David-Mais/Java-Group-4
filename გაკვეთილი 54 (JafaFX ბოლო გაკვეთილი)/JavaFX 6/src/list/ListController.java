package list;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.net.URL;
import java.util.ResourceBundle;

public class ListController implements Initializable {
    @FXML
    private Label label;
    @FXML
    private ListView<String> listView;

    private final String[] cars = {
            "BMW",
            "Mercedes",
            "Honda",
            "Audi",
            "Ford",
            "Tesla",
            "Maclaren",
            "Pagani",
            "Maserati",
            "Subaru",
            "Toyota"
    };

    private String currentCar;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        listView.getItems().addAll(cars);

        listView
                .getSelectionModel()
                .selectedItemProperty()
                .addListener(new ChangeListener<String>() {
                    @Override
                    public void changed(ObservableValue<? extends String> observableValue, String s, String t1) {
                        System.out.println(s);
                        System.out.println(t1);
                        System.out.println(observableValue);

//                        currentCar = t1;
                        currentCar = listView.getSelectionModel().getSelectedItem();
                        label.setText(currentCar);
                    }
                });
    }
}
