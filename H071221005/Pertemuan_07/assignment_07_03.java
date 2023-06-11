package H071221005.Pertemuan_07;
import java.util.ArrayList;
import java.util.List;

class FoodFactory{
    public static Food getFood(String string) {
        if(string.equals("burger")){
            Food burger = new Burger();
            return burger;
        }else if(string.equals("pizza")){
            Food pizza  = new Pizza();   
            return pizza;
        }else{
            Food steak = new Steak();
            return steak;
        }
    }
}

interface Food {
    int getPrice();
}

class Burger implements Food {
    private int price = 11000;
    @Override
    public int getPrice(){
        return price;
    }
}
class Pizza implements Food {
    private int price = 60000;
    @Override
    public int getPrice(){
        return price;
    }
}
class Steak implements Food {
    private int price = 80000;
    @Override
    public int getPrice(){
        return price;
    }
}

class Restaurant extends FoodFactory{
    

    public static int calculateTotal(List<Food> foods) {
        int hasil = foods.get(0).getPrice()+ foods.get(1).getPrice()+foods.get(2).getPrice();
        return hasil;
    }
}

public class assignment_07_03 {
    public static void main(String[] args) {
        Food burger = FoodFactory.getFood("burger");
        Food pizza = FoodFactory.getFood("pizza");
        Food steak = FoodFactory.getFood("steak");
    
        List<Food> foods = new ArrayList<>();
        foods.add(burger);
        foods.add(pizza);
        foods.add(steak);
        int total = Restaurant.calculateTotal(foods);

        System.out.println("Total price : "+ total);
    }
}
