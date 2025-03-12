class Food {
    public static int getFoodItem(String foodItem) {
        if (foodItem.equals("Burger")) {
            return 99;
        } else if (foodItem.equals("Pizza")) {
            return 299;
        } else if (foodItem.equals("Pasta")) {
            return 199;
        } else if (foodItem.equals("Sandwich")) {
            return 149;
        } else if (foodItem.equals("Fries")) {
            return 79;
        } else if (foodItem.equals("Coke")) {
            return 49;
        } else if (foodItem.equals("Noodles")) {
            return 129;
        } else if (foodItem.equals("Dosa")) {
            return 89;
        } else if (foodItem.equals("Idli")) {
            return 59;
        } else if (foodItem.equals("Samosa")) {
            return 39;
        } else if (foodItem.equals("Biryani")) {
            return 249;
        } else if (foodItem.equals("Paneer Tikka")) {
            return 179;
        } else if (foodItem.equals("Dal Makhani")) {
            return 159;
        } else if (foodItem.equals("Butter Chicken")) {
            return 299;
        } else if (foodItem.equals("Chole Bhature")) {
            return 129;
        } else if (foodItem.equals("Momos")) {
            return 99;
        } else if (foodItem.equals("Ice Cream")) {
            return 89;
        } else if (foodItem.equals("Gulab Jamun")) {
            return 49;
        } 
		else{
			return 0;
		}
    }
}
