/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
/**
 * FXML Controller class
 *
 * @author 04399704233
 */
public class MenuuController implements Initializable {

    @FXML
    private void abrirCadastro (ActionEvent event){
        try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Salvar.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Cliente");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){
}
    } 
   
    @FXML
    private void abrirCalculadora(ActionEvent event){
     try{
    FXMLLoader fxmlLoader = new FXMLLoader();
    fxmlLoader.setLocation(getClass().getResource("Menu.fxml"));
    Scene scene = new Scene(fxmlLoader.load(),900,682);
    Stage stage = new Stage();
    stage.setTitle("Cadastrar Cliente");
    stage.setScene(scene);
    stage.show();
}
catch(IOException e){

}

    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      
    }    
    
}
