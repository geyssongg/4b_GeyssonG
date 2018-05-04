/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author 04399704233
 */
public class MenuController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField  txtResultado; 
    @FXML
    private TextField txtNumero2;
    @FXML 
    private TextField txtNumero1;
    @FXML
    private Button btnSoma,btnMenos,btnVezes,btnDividir;
    
    @FXML
   private void soma (){
       Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double resultado = num1+num2;
       
       txtResultado.setText(resultado.toString());
   }
   @FXML
   private void menos(){
          Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double resultado = num1-num2;
       
       txtResultado.setText(resultado.toString());
   }
   @FXML
   private void vezes (){
          Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double resultado = num1*num2;
       
       txtResultado.setText(resultado.toString());
   }
   @FXML
   private void dividir (){
          Double num1 = Double.parseDouble(txtNumero1.getText());
       Double num2 = Double.parseDouble(txtNumero2.getText());
       Double resultado = num1/num2;
       
       txtResultado.setText(resultado.toString());
   }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
