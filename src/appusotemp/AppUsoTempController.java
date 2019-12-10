/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appusotemp;

import Temporizador.Temporizador;
import campotextonumerico.CampoTextoNumero;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventType;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class AppUsoTempController implements Initializable {

    @FXML
    private Label res;
    @FXML
    private Temporizador temp;
    @FXML
    private CampoTextoNumero ctn;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       ctn.setOnAction((ActionEvent value)->{
         
           temp.setTiempo(Integer.parseInt(ctn.getText()));
           temp.initTemporizador();                    
       });
       
       temp.addEventHandler(EventType.ROOT, eventHandler->{
           if(temp.getX()==0)
               res.setText("Temporizador finalizado");
       });
       
 
    }    
}
