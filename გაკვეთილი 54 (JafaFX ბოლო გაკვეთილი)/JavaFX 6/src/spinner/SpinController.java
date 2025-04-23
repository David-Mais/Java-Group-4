package spinner;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.util.StringConverter;

import java.net.URL;
import java.util.ResourceBundle;

public class SpinController implements Initializable {
    @FXML
    private Spinner<Double> spinner;
    @FXML
    private Label label;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        SpinnerValueFactory.DoubleSpinnerValueFactory svf =
                new SpinnerValueFactory.DoubleSpinnerValueFactory(
                        0.0,
                        Double.MAX_VALUE,
                        0.0,
                        1
                );
        svf.setConverter(new StringConverter<>() {

            @Override
            public String toString(Double value) {
                // format however you like
                return value == null ? "" : String.format("%.2f", value);
            }

            @Override
            public Double fromString(String text) {
                try {
                    if (text == null || text.isBlank()) {
                        return 0.0;                    // choose a default
                    }
                    double d = Double.parseDouble(text);
                    if (d < 0) {                       // extra validation
                        throw new NumberFormatException("must be ≥ 0");
                    }
                    return d;
                } catch (NumberFormatException ex) {
                    // 1. show an error (popup, tooltip, red border …)
                    // 2. revert the editor text to the last valid value
                    Platform.runLater(() ->
                            spinner.getEditor().setText(toString(spinner.getValue())));
                    return spinner.getValue();         // keep the old value
                }
            }
        });
        spinner.setValueFactory(svf);

        label.setText(spinner.getValue().toString());

        spinner.valueProperty().addListener(new ChangeListener<Double>() {
            @Override
            public void changed(ObservableValue<? extends Double> observableValue, Double aDouble, Double t1) {
                performUpdate();
            }
        });
    }

    private void performUpdate() {
        try {
            double currentValue = spinner.getValue();
            label.setText(String.format("%.2f", currentValue));
        } catch (Exception e) {
            label.setText("Error");
        }
    }

}
