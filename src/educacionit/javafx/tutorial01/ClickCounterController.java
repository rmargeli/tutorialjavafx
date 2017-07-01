/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package educacionit.javafx.tutorial01;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.paint.Color;
import static javafx.scene.paint.Color.BLACK;
import javafx.util.Duration;


/**
 *
 * @author Rodolfo Durante
 */
public class ClickCounterController implements Initializable {

    @FXML
    
    private javafx.scene.control.TextField fld_cantidad;
    @FXML
    private javafx.scene.shape.Circle verde;
    @FXML
    private javafx.scene.shape.Circle amarillo;
    @FXML
    private javafx.scene.shape.Circle rojo;
    
    private int cantidad = 0;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
        System.out.println("You clicked me!");
        cantidad++;
        fld_cantidad.setText(String.valueOf(cantidad));
    }
    
    public void Restar(ActionEvent event) {
        
        System.out.println("You clicked me!");
        cantidad--;
        fld_cantidad.setText(String.valueOf(cantidad));
    }
    @FXML 
    private void ponerVerde(ActionEvent event) {     
         
        if(verde.getFill().equals(Color.GREEN))
            verde.setFill(Color.BLACK); 
        else{
            verde.setFill(Color.GREEN);
            amarillo.setFill(Color.BLACK);
            rojo.setFill(Color.BLACK);
            
        }
            
    }
    @FXML
    private void ponerAmarillo(ActionEvent event) {     
          
         if(amarillo.getFill().equals(Color.YELLOW))
            amarillo.setFill(Color.BLACK); 
         else{
            verde.setFill(Color.BLACK);
            amarillo.setFill(Color.YELLOW);
            rojo.setFill(Color.BLACK);
         }            
    }
    @FXML
    public void ponerRojo(ActionEvent event) {        
          
         if(rojo.getFill().equals(Color.RED)){
            rojo.setFill(Color.BLACK);                    
         }
         else            
            verde.setFill(Color.BLACK);
            amarillo.setFill(Color.BLACK);
            rojo.setFill(Color.RED);
    }
    
    @FXML
    public void activarSemaforo(ActionEvent event) {  
        Timeline timeline = new Timeline(new KeyFrame(
        Duration.millis(2500),
        ae -> cambiarColor())); 
        verde.setFill(Color.BLACK);
        amarillo.setFill(Color.BLACK);
        rojo.setFill(Color.RED);        
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();        
    }
    

    
    
    
    private void cambiarColor(){
        if(rojo.getFill().equals(Color.RED)){
            rojo.setFill(Color.BLACK);  
            amarillo.setFill(Color.YELLOW);
            verde.setFill(Color.BLACK);
         }
        else if(amarillo.getFill().equals(Color.YELLOW)){
            rojo.setFill(Color.BLACK);  
            amarillo.setFill(Color.BLACK);
            verde.setFill(Color.GREEN);            
        }
        else if(verde.getFill().equals(Color.GREEN)){
            rojo.setFill(Color.RED);  
            amarillo.setFill(Color.BLACK);
            verde.setFill(Color.BLACK);            
        }
    }
    
    private void ponerRojo(){
        rojo.setFill(Color.RED);
        amarillo.setFill(Color.BLACK);
        verde.setFill(Color.BLACK);          
    }
    
    private void ponerAmarillo(){
        rojo.setFill(Color.BLACK);
        amarillo.setFill(Color.YELLOW);
        verde.setFill(Color.BLACK);
        
    }
    
    private void ponerVerde(){
        rojo.setFill(Color.BLACK);
        amarillo.setFill(Color.BLACK);
        verde.setFill(Color.GREEN);        
    }

     
     

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // fld_cantidad.setEditable(false);
    }

}
