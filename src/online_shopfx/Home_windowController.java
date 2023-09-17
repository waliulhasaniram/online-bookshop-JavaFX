/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static online_shopfx.User_panalController.uc_list;
import static online_shopfx.User_panalController.ue_list;
import static online_shopfx.User_panalController.uf_list;

/**
 * FXML Controller class
 *
 * @author waliul hasan iram
 */
public class Home_windowController implements Initializable {

   public static Stage stage ;
/////////////////////////////////////////////////////////    
    @FXML
    private TableView<FoodFxmlControllerJava> FoodListTable;
    @FXML
    private TableColumn<FoodFxmlControllerJava, String> food_name;
    @FXML
    private TableColumn<FoodFxmlControllerJava, String> food_id;
    @FXML
    private TableColumn<FoodFxmlControllerJava, String> food_quantity;
    @FXML
    private TableColumn<FoodFxmlControllerJava, String> food_price;
    @FXML
    private TableColumn<FoodFxmlControllerJava, String> food_expire;
    
  static ObservableList<FoodFxmlControllerJava> f_list = FXCollections.observableArrayList();
////////////////////////////////////////////////////////////////    
    @FXML
    private TableView<ElectronicsControllerJava> ElectronicListTable;
    @FXML
    private TableColumn<ElectronicsControllerJava, String> Electronics_name;
    @FXML
    private TableColumn<ElectronicsControllerJava, String> Electronics_id;
    @FXML
    private TableColumn<ElectronicsControllerJava, String> Electronics_quantity;
    @FXML
    private TableColumn<ElectronicsControllerJava, String> Electronics_price;
    @FXML
    private TableColumn<ElectronicsControllerJava, String> Electronics_manufacturer;
    
   static  ObservableList<ElectronicsControllerJava> e_list = FXCollections.observableArrayList();
////////////////////////////////////////////////////////////////    
    @FXML
    private TableView<ClothingControllerJave> clotheListTable;
    @FXML
    private TableColumn<ClothingControllerJave, String> clothe_name;
    @FXML
    private TableColumn<ClothingControllerJave, String> clothe_id;
    @FXML
    private TableColumn<ClothingControllerJave, String> clothe_brand;
    @FXML
    private TableColumn<ClothingControllerJave, String> clothe_catagory;
    @FXML
    private TableColumn<ClothingControllerJave, String> clothe_price;
    @FXML
    private TableColumn<ClothingControllerJave, String> clothe_size;

  static  ObservableList<ClothingControllerJave> c_list = FXCollections.observableArrayList();
////////////////////////////////////////////////////////////////    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        FoodListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        food_name.setCellValueFactory(new PropertyValueFactory<FoodFxmlControllerJava,String>("food_name"));
        food_id.setCellValueFactory(new PropertyValueFactory<FoodFxmlControllerJava,String>("food_id"));
        food_quantity.setCellValueFactory(new PropertyValueFactory<FoodFxmlControllerJava,String>("food_quantity"));
        food_price.setCellValueFactory(new PropertyValueFactory<FoodFxmlControllerJava,String>("food_price"));
        food_expire.setCellValueFactory(new PropertyValueFactory<FoodFxmlControllerJava,String>("food_expire"));
       
        FoodListTable.setItems(f_list);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////
        ElectronicListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
       
        Electronics_name.setCellValueFactory(new PropertyValueFactory<ElectronicsControllerJava, String>("Electronics_name"));
        Electronics_id.setCellValueFactory(new PropertyValueFactory<ElectronicsControllerJava, String>("Electronics_id"));
        Electronics_quantity.setCellValueFactory(new PropertyValueFactory<ElectronicsControllerJava, String>("Electronics_quantity"));
        Electronics_price.setCellValueFactory(new PropertyValueFactory<ElectronicsControllerJava, String>("Electronics_price"));
        Electronics_manufacturer.setCellValueFactory(new PropertyValueFactory<ElectronicsControllerJava, String>("Electronics_manufacturer"));
    
        ElectronicListTable.setItems(e_list);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         clotheListTable.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        
        clothe_name.setCellValueFactory(new PropertyValueFactory<ClothingControllerJave, String>("clothe_name"));
        clothe_id.setCellValueFactory(new PropertyValueFactory<ClothingControllerJave, String>("clothe_id"));
        clothe_brand.setCellValueFactory(new PropertyValueFactory<ClothingControllerJave, String>("clothe_brand"));
        clothe_catagory.setCellValueFactory(new PropertyValueFactory<ClothingControllerJave, String>("clothe_catagory"));
        clothe_price.setCellValueFactory(new PropertyValueFactory<ClothingControllerJave, String>("clothe_price"));
        clothe_size.setCellValueFactory(new PropertyValueFactory<ClothingControllerJave, String>("clothe_size"));
    
        clotheListTable.setItems(c_list);
    }    


    @FXML
    private void Add_Clothing_Iteams(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Clothing.fxml"));
          Parent root = (Parent) fxmlloader.load();
          
          Stage stage = new Stage();
          stage.setTitle("clothing Iteams adding page");
          stage.setScene(new Scene(root));
          Online_shopFX.stage.close();
          stage.show();
        }catch(Exception e){
            System.out.println("clothing Iteams adding page not found");
        }
    }

    @FXML
    private void Add_Electronics_Iteams(ActionEvent event) {
        try{
          FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Electronics.fxml"));
          Parent root = (Parent) fxmlloader.load();
          
          Stage stage = new Stage();
          stage.setTitle("Electornics Iteams adding page");
          stage.setScene(new Scene(root));
          Online_shopFX.stage.close();
          stage.show();
        }catch(Exception e){
            System.out.println("Electornics Iteams adding page not found");
        }
    }

    @FXML
    private void Add_Food_Iteams(ActionEvent event) {
         try{
           FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("FoodFXMLDocument.fxml"));
           Parent root1 = (Parent) fxmlloader.load();
           Stage stage = new Stage();
           stage.setTitle("Food Iteams adding page");
           stage.setScene(new Scene(root1));
           Online_shopFX.stage.close();
           stage.show();
        }catch(Exception e){
            System.out.println("Food Iteams adding page not found");
        }
    }

    @FXML
    private void delete(ActionEvent event) {
        //deleting from admin's panal
        ObservableList<FoodFxmlControllerJava> fsi = FXCollections.observableArrayList();
        fsi = FoodListTable.getSelectionModel().getSelectedItems();
        f_list.removeAll(fsi);
       
        
        ObservableList<ElectronicsControllerJava> esi = FXCollections.observableArrayList();
        esi = ElectronicListTable.getSelectionModel().getSelectedItems();
        e_list.removeAll(esi);
      
        
        ObservableList<ClothingControllerJave> csi = FXCollections.observableArrayList();
        csi = clotheListTable.getSelectionModel().getSelectedItems();
        c_list.removeAll(csi);
    ///////////////////////////////////////////////////////////////////////////////////////////    
        
    }

    @FXML
    private void go_back_to_log_in_page(ActionEvent event) {
        try{
           FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Admin_OR_user.fxml"));
           Parent root1 = (Parent) fxmlloader.load();
           Stage stage = new Stage();
           stage.setTitle("Food Iteams adding page");
           stage.setScene(new Scene(root1));
           Online_shopFX.stage.close();
           stage.show();
        }catch(Exception e){
            System.out.println("Food Iteams adding page not found");
        }
    }
    
}
