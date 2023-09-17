/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online_shopfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author waliul hasan iram
 */
public class Admin_OR_userController implements Initializable {


    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void admin_button(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Home_window.fxml"));
          Parent root = (Parent) fxmlloader.load();
         
            Stage stage = new Stage();
            stage.setTitle("Electornics Iteams adding page");
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            System.out.println("Electornics Iteams adding page not found");
        }
    }

    @FXML
    private void user_button(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("User_panal.fxml"));
          Parent root = (Parent) fxmlloader.load();
         
            Stage stage = new Stage();
            stage.setTitle("Electornics Iteams adding page");
            stage.setScene(new Scene(root));
            stage.show();
        }catch(Exception e){
            System.out.println("Electornics Iteams adding page not found");
        }
    }
    
}
