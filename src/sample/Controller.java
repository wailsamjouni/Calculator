package sample;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;

public class Controller implements Initializable{
    @FXML
    private TextField output;
    private String operator = "";
    private double number1 = 0;
    private double number2 = 0;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button five;

    @FXML
    private Button four;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button three;

    @FXML
    private Button two;

    @FXML
    private Button one;

    @FXML
    private Button equals;

    @FXML
    private Button coma;

    @FXML
    private Button zero;

    @FXML
    private Button div;

    @FXML
    private Button plus;

    @FXML
    private Button minus;

    @FXML
    private Button mult;

    @FXML
    private Button clear;

    @FXML
    void numberClicked(ActionEvent event) {
        output.setText(output.getText() + ((Button)event.getSource()).getText());
    }

    public void comaclicked(ActionEvent event) {
        output.setText(output.getText() + ".");
    }

    public void clearClicked(ActionEvent event) {
        output.setText("");
    }

    /*
    @FXML
    void operatorClicked(ActionEvent event) {
        String operation = ((Button)event.getSource()).getText();
        if (!"=".equals(operation)){
            if (!operator.isEmpty())
                return;
            operator = operation;
            number1 = Long.parseLong(output.getText());
            output.setText("");
        }
        else {
            if (operator.isEmpty())
                return;
            number2 = Long.parseLong(output.getText());
            calculate(number1,number2,operator);
        }
        //Calculate
    }

     */

    @FXML
    void AddClicked(ActionEvent event) {
        String value = output.getText();
        number1 = Double.parseDouble(value);
        output.setText("");
        operator = "+";
    }

    @FXML
    void DivClicked(ActionEvent event) {
        String value = output.getText();
        number1 = Double.parseDouble(value);
        output.setText("");
        operator = "/";
    }

    @FXML
    void MinClicked(ActionEvent event) {
        String value = output.getText();
        number1 = Double.parseDouble(value);
        output.setText("");
        operator = "-";
    }

    @FXML
    void MulClicked(ActionEvent event) {
        String value = output.getText();
        number1 = Double.parseDouble(value);
        output.setText("");
        operator = "*";
    }

    @FXML
    void EqualsClicked(ActionEvent event) {
        String value = output.getText();
        switch (operator){
            case "+" :
                number2 = Double.parseDouble(value);
                output.setText(String.valueOf(number1 + number2));
                break;
            case "-" :
                number2 = Double.parseDouble(value);
                output.setText(String.valueOf(number1 - number2));
                break;
            case "/" :
                number2 = Double.parseDouble(value);
                if (number2 != 0)
                    output.setText(String.valueOf(number1 / number2));
                else
                    throw new ArithmeticException();
                break;
            case "*" :
                number2 = Double.parseDouble(value);
                double result = number1 * number2;
                output.setText(String.valueOf(result));
                break;
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
