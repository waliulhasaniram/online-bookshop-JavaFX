
package online_shopfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author waliul hasan iram
 */
public class User_panalController implements Initializable {

    /////////////////////////////////////////////////////////    
    @FXML
    private TableView<User_panalControllerFoods> FoodListTable;
    @FXML
    private TableColumn<User_panalControllerFoods, String> food_name;
    @FXML
    private TableColumn<User_panalControllerFoods, String> food_id;
    @FXML
    private TableColumn<User_panalControllerFoods, String> food_quantity;
    @FXML
    private TableColumn<User_panalControllerFoods, String> food_price;
    @FXML
    private TableColumn<User_panalControllerFoods, String> food_expire;
    
  static ObservableList<User_panalControllerFoods> uf_list = FXCollections.observableArrayList();
////////////////////////////////////////////////////////////////    
    @FXML
    private TableView<User_panalControllerElectronics> ElectronicListTable;
    @FXML
    private TableColumn<User_panalControllerElectronics, String> Electronics_name;
    @FXML
    private TableColumn<User_panalControllerElectronics, String> Electronics_id;
    @FXML
    private TableColumn<User_panalControllerElectronics, String> Electronics_quantity;
    @FXML
    private TableColumn<User_panalControllerElectronics, String> Electronics_price;
    @FXML
    private TableColumn<User_panalControllerElectronics, String> Electronics_manufacturer;
    
   static  ObservableList<User_panalControllerElectronics> ue_list = FXCollections.observableArrayList();
////////////////////////////////////////////////////////////////    
    @FXML
    private TableView<User_panalControllerClothing> clotheListTable;
    @FXML
    private TableColumn<User_panalControllerClothing, String> clothe_name;
    @FXML
    private TableColumn<User_panalControllerClothing, String> clothe_id;
    @FXML
    private TableColumn<User_panalControllerClothing, String> clothe_brand;
    @FXML
    private TableColumn<User_panalControllerClothing, String> clothe_catagory;
    @FXML
    private TableColumn<User_panalControllerClothing, String> clothe_price;
    @FXML
    private TableColumn<User_panalControllerClothing, String> clothe_size;

  static  ObservableList<User_panalControllerClothing> uc_list = FXCollections.observableArrayList();
////////////////////////////////////////////////////////////////    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FoodListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        food_name.setCellValueFactory(new PropertyValueFactory<User_panalControllerFoods,String>("food_name"));
        food_id.setCellValueFactory(new PropertyValueFactory<User_panalControllerFoods,String>("food_id"));
        food_quantity.setCellValueFactory(new PropertyValueFactory<User_panalControllerFoods,String>("food_quantity"));
        food_price.setCellValueFactory(new PropertyValueFactory<User_panalControllerFoods,String>("food_price"));
        food_expire.setCellValueFactory(new PropertyValueFactory<User_panalControllerFoods,String>("food_expire"));
       
        FoodListTable.setItems(uf_list);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
         ElectronicListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        Electronics_name.setCellValueFactory(new PropertyValueFactory<User_panalControllerElectronics, String>("Electronics_name"));
        Electronics_id.setCellValueFactory(new PropertyValueFactory<User_panalControllerElectronics, String>("Electronics_id"));
        Electronics_quantity.setCellValueFactory(new PropertyValueFactory<User_panalControllerElectronics, String>("Electronics_quantity"));
        Electronics_price.setCellValueFactory(new PropertyValueFactory<User_panalControllerElectronics, String>("Electronics_price"));
        Electronics_manufacturer.setCellValueFactory(new PropertyValueFactory<User_panalControllerElectronics, String>("Electronics_manufacturer"));
    
        ElectronicListTable.setItems(ue_list);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        clotheListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        clothe_name.setCellValueFactory(new PropertyValueFactory<User_panalControllerClothing, String>("clothe_name"));
        clothe_id.setCellValueFactory(new PropertyValueFactory<User_panalControllerClothing, String>("clothe_id"));
        clothe_brand.setCellValueFactory(new PropertyValueFactory<User_panalControllerClothing, String>("clothe_brand"));
        clothe_catagory.setCellValueFactory(new PropertyValueFactory<User_panalControllerClothing, String>("clothe_catagory"));
        clothe_price.setCellValueFactory(new PropertyValueFactory<User_panalControllerClothing, String>("clothe_price"));
        clothe_size.setCellValueFactory(new PropertyValueFactory<User_panalControllerClothing, String>("clothe_size"));
    
        clotheListTable.setItems(uc_list);
    }    


    @FXML
    private void buy(ActionEvent event) {
        ObservableList<User_panalControllerFoods> fsi = FXCollections.observableArrayList();
        fsi = FoodListTable.getSelectionModel().getSelectedItems();
        uf_list.removeAll(fsi);
        
        ObservableList<User_panalControllerElectronics> esi = FXCollections.observableArrayList();
        esi = ElectronicListTable.getSelectionModel().getSelectedItems();
        ue_list.removeAll(esi);
        
        ObservableList<User_panalControllerClothing> csi = FXCollections.observableArrayList();
        csi = clotheListTable.getSelectionModel().getSelectedItems();
        uc_list.removeAll(csi);
        
    }

    @FXML
    private void goback(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Admin_OR_user.fxml"));
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
