import java.util.ArrayList;

public class Restaurant {
    public static int calculateTotal(ArrayList<Food> list) {
        int total = 0;

        for (int i = 0;i < list.size();i++) {
            total += (list.get(i)).getPrice();
        }

        return total;
    }
}
