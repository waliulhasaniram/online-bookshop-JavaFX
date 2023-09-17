
package online_shopfx;

/**
 *
 * @author Meher nigar
 */
public class ElectronicsControllerJava {
    String electronics_name;
    String electronics_id;
    String electronics_quantity;
    String electronics_price;
    String electronics_manufacturer;

   ElectronicsControllerJava(String electronics_name, String electronics_id, String electronics_quantity, String electronics_price, String electronics_manufacturer) {
        this.electronics_name = electronics_name;
        this.electronics_id = electronics_id;
        this.electronics_quantity = electronics_quantity;
        this.electronics_price = electronics_price;
        this.electronics_manufacturer = electronics_manufacturer;
    }

    ElectronicsControllerJava() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getElectronics_name() {
        return electronics_name;
    }

    public void setElectronics_name(String electronics_name) {
        this.electronics_name = electronics_name;
    }

    public String getElectronics_id() {
        return electronics_id;
    }

    public void setElectronics_id(String electronics_id) {
        this.electronics_id = electronics_id;
    }

    public String getElectronics_quantity() {
        return electronics_quantity;
    }

    public void setElectronics_quantity(String electronics_quantity) {
        this.electronics_quantity = electronics_quantity;
    }

    public String getElectronics_price() {
        return electronics_price;
    }

    public void setElectronics_price(String electronics_price) {
        this.electronics_price = electronics_price;
    }

    public String getElectronics_manufacturer() {
        return electronics_manufacturer;
    }

    public void setElectronics_manufacturer(String electronics_manufacturer) {
        this.electronics_manufacturer = electronics_manufacturer;
    }
    
}
