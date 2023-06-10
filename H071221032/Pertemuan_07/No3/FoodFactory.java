public class FoodFactory {
    public static Food getFood(String foodType) {
        if (foodType.equals("burger")) {
            Food food = new Burger();
            return food;
        } else if (foodType.equals("pizza")) {
            Food food = new Pizza();
            return food;
        } else if (foodType.equals("steak")) {
            Food food = new Steak();
            return food;
        } else {
            return null;
        }
    }
}
