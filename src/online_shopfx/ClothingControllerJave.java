
package online_shopfx;

/**
 *
 * @author Shahria shanto
 */
public class ClothingControllerJave {
    String clothe_name;
    String clothe_id;
    String clothe_brand;
    String clothe_catagory;
    String clothe_price;
    String clothe_size;

   ClothingControllerJave(String clothe_name, String clothe_id, String clothe_brand, String clothe_catagory, String clothe_price, String clothe_size) {
        this.clothe_name = clothe_name;
        this.clothe_id = clothe_id;
        this.clothe_brand = clothe_brand;
        this.clothe_catagory = clothe_catagory;
        this.clothe_price = clothe_price;
        this.clothe_size = clothe_size;
    }

    ClothingControllerJave() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getClothe_name() {
        return clothe_name;
    }

    public void setClothe_name(String clothe_name) {
        this.clothe_name = clothe_name;
    }

    public String getClothe_id() {
        return clothe_id;
    }

    public void setClothe_id(String clothe_id) {
        this.clothe_id = clothe_id;
    }

    public String getClothe_brand() {
        return clothe_brand;
    }

    public void setClothe_brand(String clothe_brand) {
        this.clothe_brand = clothe_brand;
    }

    public String getClothe_catagory() {
        return clothe_catagory;
    }

    public void setClothe_catagory(String clothe_catagory) {
        this.clothe_catagory = clothe_catagory;
    }

    public String getClothe_price() {
        return clothe_price;
    }

    public void setClothe_price(String clothe_price) {
        this.clothe_price = clothe_price;
    }

    public String getClothe_size() {
        return clothe_size;
    }

    public void setClothe_size(String clothe_size) {
        this.clothe_size = clothe_size;
    }
    
    
}
