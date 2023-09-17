package online_shopfx;

/**
 *
 * @author waliul hasan iram
 */
public class  User_panalControllerFoods{
    String food_name;
    String food_id;
    String food_quantity;
    String food_price;
    String food_expire;

    User_panalControllerFoods(String food_name, String food_id, String food_quantity, String food_price, String food_expire) {
        this.food_name = food_name;
        this.food_id = food_id;
        this.food_quantity = food_quantity;
        this.food_price = food_price;
        this.food_expire = food_expire;
    }

    public String getFood_name() {
        return food_name;
    }

    public void setFood_name(String food_name) {
        this.food_name = food_name;
    }

    public String getFood_id() {
        return food_id;
    }

    public void setFood_id(String food_id) {
        this.food_id = food_id;
    }

    public String getFood_quantity() {
        return food_quantity;
    }

    public void setFood_quantity(String food_quantity) {
        this.food_quantity = food_quantity;
    }

    public String getFood_price() {
        return food_price;
    }

    public void setFood_price(String food_price) {
        this.food_price = food_price;
    }

    public String getFood_expire() {
        return food_expire;
    }

    public void setFood_expire(String food_expire) {
        this.food_expire = food_expire;
    }


}