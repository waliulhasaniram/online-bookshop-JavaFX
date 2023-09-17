
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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import static online_shopfx.Home_windowController.f_list;
import static online_shopfx.User_panalController.uf_list;

/**
 *
 * @author waliul hasan iram
 */
public class FoodFXMLDocumentController implements Initializable {

    @FXML
    private TextField Fname;
     @FXML
    private TextField Fid;
    @FXML
    private TextField Fprice;
    @FXML
    private TextField Fexpire;
    @FXML
    private TextField Fquantity;
   
    
  
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void add_initialize(ActionEvent event) throws IOException {
        
        String name = Fname.getText();
        String id = Fid.getText();
        String price = Fprice.getText();
        String quantity = Fquantity.getText();
        String expire = Fexpire.getText();
        
        FoodFxmlControllerJava fl = new FoodFxmlControllerJava(name,id,price,quantity,expire); 
        f_list.add(fl);
        
        File file = new File("fooditeam.txt");
        if(!file.exists()) file.createNewFile();
        FileWriter fw = new FileWriter(file,true);
        fw.write(name+"|"+id+"|"+price+"|"+quantity+"|"+expire+"\n");
        fw.close();
        
        User_panalControllerFoods uf = new User_panalControllerFoods(name,id,price,quantity,expire);
        uf_list.add(uf);
        
        Fname.clear();
        Fid.clear();
        Fprice.clear();
        Fquantity.clear();
        Fexpire.clear();
                
    }

    @FXML
    private void back_initialize(ActionEvent event) {
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
    private void goto_electronics(ActionEvent event) {
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
    private void goto_clothing(ActionEvent event) {
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
