
package online_shopfx;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static online_shopfx.Home_windowController.e_list;
import static online_shopfx.User_panalController.ue_list;

/**
 * FXML Controller class
 *
 * @author Meher nigar
 */
public class ElectronicsController implements Initializable {


    @FXML
    private TextField Elname;
    @FXML
    private TextField Elid;
    @FXML
    private TextField Elquality;
    @FXML
    private TextField Elprice;
    @FXML
    private TextField Elmanufacturer;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Eadd(ActionEvent event) throws IOException {
     String name = Elname.getText();
     String id = Elid.getText();
     String quality = Elquality.getText();
     String price = Elprice.getText();
     String manufacturer = Elmanufacturer.getText();
     
     ElectronicsControllerJava El = new ElectronicsControllerJava(name,id,quality,price,manufacturer); 
      e_list.add(El);
      
        File file = new File("electronics_iteam.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fw = new FileWriter(file,true);
        fw.write(name+"|"+id+"|"+quality+"|"+price+"|"+manufacturer+"\n");
        fw.close();
      
     User_panalControllerElectronics ue = new User_panalControllerElectronics(name,id,quality,price,manufacturer);
       ue_list.add(ue);
     
     Elname.clear();
     Elid.clear();
     Elquality.clear();
     Elprice.clear();
     Elmanufacturer.clear();
    }

    @FXML
    private void Eback(ActionEvent event) {
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
    private void goto_food(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("FoodFXMLDocument.fxml"));
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
    private void goto_clothes(ActionEvent event) {
         try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Clothing.fxml"));
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
