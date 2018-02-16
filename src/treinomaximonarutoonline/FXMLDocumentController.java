/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package treinomaximonarutoonline;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.io.File;
import java.net.URL;
import java.util.Locale;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Desenvolvimento
 */
public class FXMLDocumentController implements Initializable {
    
    String resolucaoRobot;
    
    @FXML
    private Label idioma;
    
    @FXML
    private Label resolucao;
    
    @FXML private ImageView btnMaximo;
    
    @FXML private ImageView raikage;
    
    @FXML private ImageView minato;
    
    @FXML private ImageView mei;
    
    @FXML private ImageView pais;
    
    @FXML 
    private void detectaIdioma(){
        
        Locale locale = Locale.getDefault();
        System.out.println(locale.getDisplayLanguage()); 
        detectaResolução();
        
        if(locale.getDisplayLanguage() == "português"){
             Image brasil = new Image("icon/brasil.png");
             pais.setImage(brasil);
        }
        else {
            idioma.setText("Language Not supported");
        }
    }
    
    @FXML
    private void detectaResolução(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int width = d.width;
        int height = d.height;
        
        if (width == 1920 && height == 1080){
            resolucao.setText("1920x1080");
            resolucaoRobot = "1920x1080";
            
        }
        
        else if (width == 1024 && height == 768){
            resolucao.setText("1024x768");
            reso1024x768();
        }
        
        else {
            resolucao.setText("resolution not supported");
        }
        
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
    
        @FXML
    private void detectaResolução2(){
        Toolkit tk = Toolkit.getDefaultToolkit();
        Dimension d = tk.getScreenSize();
        int width = d.width;
        int height = d.height;
        
        if (width == 1920 && height == 1080){
            resolucao.setText("1920x1080");
            reso1920x1080();
            
        }
        
        else if (width == 1024 && height == 768){
            resolucao.setText("1024x768");
            reso1024x768();
        }
        
        else {
            resolucao.setText("resolution not supported");
        }
        
        System.out.println("Screen width = " + d.width);
        System.out.println("Screen height = " + d.height);
    }
    
    @FXML
    private void reso1920x1080(){
        try {
            
            Robot robot = new Robot();
            robot.delay(2000);
            
            //Resta Posição
            robot.mouseMove(0,0);
            
            //Minimizar janela
            robot.mouseMove(845,105);
            robot.delay(1000);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            
            //Escolher mei
            robot.mouseMove(1220,420);
            robot.delay(1000);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            
            //Desafiar 
            robot.mouseMove(1220,520);
            robot.delay(1000);
            robot.mousePress(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            robot.mouseRelease(InputEvent.BUTTON1_MASK);
            robot.delay(1000);
            

            
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }
    
    @FXML
    private void reso1024x768(){
        
    }
    
    @FXML
    private void btnMaixmoOn(){
        Image image = new Image("btn/btnMaximoOn.png"); 
        btnMaximo.setImage(image);
         
        }
    @FXML
    private void btnMaximoOff(){
        Image image = new Image("btn/btnMaximoOff.png");
        btnMaximo.setImage(image);
        }
    @FXML
    private void raikageOff(){
        Image raikageOff = new Image("btn/raikageOff.png");
        raikage.setImage(raikageOff);
    }
    @FXML
    private void raikageOn(){
        Image raikageOn = new Image("btn/raikageOn.png");
        raikage.setImage(raikageOn);
    }
     @FXML
    private void minatoOff(){
        Image minatoOff = new Image("btn/minatoOff.png");
        minato.setImage(minatoOff);
    }
    @FXML
    private void minatoOn(){
        Image minatoOn = new Image("btn/minatoOn.png");
        minato.setImage(minatoOn);
    }
    @FXML
    private void meiOff(){
        Image meiOff = new Image("btn/meiOff.png");
        mei.setImage(meiOff);
    }
    @FXML
    private void meiOn(){
        Image MeiOn = new Image("btn/meiOn.png");
        mei.setImage(MeiOn);
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
