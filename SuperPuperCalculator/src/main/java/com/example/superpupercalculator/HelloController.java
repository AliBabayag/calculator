package com.example.superpupercalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class HelloController {

    @FXML
    private TextField textField;
    @FXML
    public String firstNumber = "";
    public String currentNumber = "";
    public String Calculation = "";
    public int iterationNum = 1;
    public boolean check = true;

    @FXML
    private Button btn0;
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;
    @FXML
    private Button btn7;
    @FXML
    private Button btn8;
    @FXML
    private Button btn9;
    @FXML
    private Button btnA;
    @FXML
    private Button btnB;
    @FXML
    private Button btnC;
    @FXML
    private Button btnD;
    @FXML
    private Button btnE;
    @FXML
    private Button btnF;
    @FXML
    private Button btnHex;
    @FXML
    private Button btnDec;
    @FXML
    private Button btnOct;
    @FXML
    private Button btnBin;
    @FXML
    private TextField txtBin;
    @FXML
    private TextField txtDec;
    @FXML
    private TextField txtHex;
    @FXML
    private TextField txtOct;


    public void digitClick(ActionEvent actionEvent) {
        String num = ((Button)actionEvent.getSource()).getText();

        if (check) {                               // проверка числа
            firstNumber = firstNumber + num;
        } else {
            currentNumber = currentNumber + num;
        }
        showText(actionEvent);
    }


    public void operationClick(ActionEvent actionEvent) {
        check = false;
        showText(actionEvent);
        if (iterationNum > 1) {
            solution();
        }
        currentNumber = "";
        Calculation = ((Button)actionEvent.getSource()).getText();
        iterationNum++;
    }


    public void clearClick(ActionEvent actionEvent) {
        textField.setText("");
        txtHex.setText("");
        txtDec.setText("");
        txtOct.setText("");
        txtBin.setText("");
        check = true;
        currentNumber = "";
        firstNumber = "";
        iterationNum = 1;
    }


    public void showText(ActionEvent actionEvent) {
        textField.setText(textField.getText() + ((Button)actionEvent.getSource()).getText());
    }


    public void solution() {
        int first = Integer.parseInt(firstNumber);
        int second = Integer.parseInt(currentNumber);
        int res;
        switch (Calculation) {
            case "*":
                res = first * second;
                firstNumber = "" + res;
                break;
            case "/":
                res = first / second;
                firstNumber = "" + res;
                break;
            case "+":
                res = first + second;
                firstNumber = "" + res;
                break;
            case "-":
                res = first - second;
                firstNumber = "" + res;
                break;
        }
    }

    @FXML
    void equalClick(ActionEvent actionEvent) {
        solution();
        textField.setText("");
        check = false;
        textField.setText(firstNumber);
        iterationNum = 1;
    }

    public void letClick(ActionEvent actionEvent) {
        String num = ((Button)actionEvent.getSource()).getText();

        if (check) {                               // проверка
            firstNumber = firstNumber + num;
        } else {
            currentNumber = currentNumber + num;
        }
        showText(actionEvent);
    }

    public void onHexClick(ActionEvent actionEvent) {
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btnA.setDisable(false);
        btnB.setDisable(false);
        btnC.setDisable(false);
        btnD.setDisable(false);
        btnE.setDisable(false);
        btnF.setDisable(false);
    }

    public void onOctClick(ActionEvent actionEvent) {
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(true);
        btn9.setDisable(true);
        btnA.setDisable(true);
        btnB.setDisable(true);
        btnC.setDisable(true);
        btnD.setDisable(true);
        btnE.setDisable(true);
        btnF.setDisable(true);
    }

    public void onDecClick(ActionEvent actionEvent) {
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(false);
        btn3.setDisable(false);
        btn4.setDisable(false);
        btn5.setDisable(false);
        btn6.setDisable(false);
        btn7.setDisable(false);
        btn8.setDisable(false);
        btn9.setDisable(false);
        btnA.setDisable(true);
        btnB.setDisable(true);
        btnC.setDisable(true);
        btnD.setDisable(true);
        btnE.setDisable(true);
        btnF.setDisable(true);
    }

    public void onBinClick(ActionEvent actionEvent) {
        btn0.setDisable(false);
        btn1.setDisable(false);
        btn2.setDisable(true);
        btn3.setDisable(true);
        btn4.setDisable(true);
        btn5.setDisable(true);
        btn6.setDisable(true);
        btn7.setDisable(true);
        btn8.setDisable(true);
        btn9.setDisable(true);
        btnA.setDisable(true);
        btnB.setDisable(true);
        btnC.setDisable(true);
        btnD.setDisable(true);
        btnE.setDisable(true);
        btnF.setDisable(true);
    }

    public void toDec() {
        int cc = Integer.parseInt(firstNumber);
        txtBin.setText(Integer.toBinaryString(cc));
        txtOct.setText(Integer.toOctalString(cc));
        txtHex.setText(Integer.toHexString(cc));
        txtDec.setText(textField.getText());
    }
    public void toBin() {
        int cc = Integer.parseInt(firstNumber);
        String as = textField.getText();
        txtBin.setText(textField.getText());
        txtOct.setText(Integer.toOctalString(Integer.parseInt(as, 2)));
        txtDec.setText(String.valueOf(Integer.parseInt(as, 2)));
        txtHex.setText(Integer.toHexString(Integer.parseInt(as, 2)));
    }
    public void toHex() {
        String as = textField.getText();
        txtBin.setText(Integer.toBinaryString(Integer.parseInt(as, 16)));
        txtOct.setText(Integer.toOctalString(Integer.parseInt(as, 16)));
        txtDec.setText(String.valueOf(Integer.parseInt(as, 16)));
        txtHex.setText(textField.getText());
    }
    public void toOct() {
        int cc = Integer.parseInt(firstNumber);
        String as = textField.getText();
        txtBin.setText(Integer.toBinaryString(Integer.parseInt(as, 8)));
        txtOct.setText(textField.getText());
        txtDec.setText(String.valueOf(Integer.parseInt(as, 8)));
        txtHex.setText(Integer.toHexString(Integer.parseInt(as, 8)));

    }

    public void decClick(ActionEvent actionEvent) {
        toDec();
    }
    public void binClick(ActionEvent actionEvent) {
        toBin();
    }
    public void hexClick(ActionEvent actionEvent) {
        toHex();
    }
    public void octClick(ActionEvent actionEvent) {
        toOct();
    }
}