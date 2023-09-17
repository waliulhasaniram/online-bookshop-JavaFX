
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
import static online_shopfx.Home_windowController.c_list;
import static online_shopfx.User_panalController.uc_list;

/**
 * FXML Controller class
 *
 * @author Shahria shanto
 */
public class ClothingController implements Initializable {

    @FXML
    private TextField Cname;
    @FXML
    private TextField Cid;
    @FXML
    private TextField Cbrand;
    @FXML
    private TextField Ccategory;
    @FXML
    private TextField Cprice;
    @FXML
    private TextField Csize;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Cloth_add(ActionEvent event) throws IOException {
         String name = Cname.getText();
         String id = Cid.getText();
         String brand = Cbrand.getText();
         String category = Ccategory.getText();
         String price = Cprice.getText();
         String size = Csize.getText();
         
         ClothingControllerJave cl = new ClothingControllerJave(name,id,brand,category,price,size);
         c_list.add(cl);
         
        File file = new File("clothing_iteam.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fw = new FileWriter(file,true);
        fw.write(name+"|"+id+"|"+brand+"|"+category+"|"+price+"|"+size);
        fw.close();
         
         User_panalControllerClothing uc = new User_panalControllerClothing(name,id,brand,category,price,size);
         uc_list.add(uc);
         
         Cname.clear();
         Cid.clear();
         Cbrand.clear();
         Ccategory.clear();
         Cprice.clear();
         Csize.clear();
    }

    @FXML
    private void cloth_back(ActionEvent event) {
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
    private void add_electronic(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Electronics.fxml"));
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
    private void add_food(ActionEvent event) {
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
    
}
