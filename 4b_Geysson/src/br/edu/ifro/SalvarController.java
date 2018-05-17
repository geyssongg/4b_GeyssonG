/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifro;

import br.edu.ifro.modelo.Aluno;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SalvarController implements Initializable {

  @FXML
 private TextField txtNome;
  
  
   @FXML
    private Button btnSalvar ;
    
  @FXML
  private void salvar (){
       EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula");
        EntityManager em = emf.createEntityManager();
        
      Aluno A = new Aluno();
      
     A.setNome(txtNome.getText());
     em.close();
     emf.close();
        
  }
  
   

    
        @Override
    public void initialize(URL url, ResourceBundle rb) {
   
    }    

 
    
}
