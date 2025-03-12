import java.util.*;

public class Maain {
    
    public static void printEmails(String[] emails) {
        for (String email : emails) {
            System.out.println(email);
        }
    }
    
    public static void printCountriesEndingWithA(String[] countries) {
        for (String country : countries) {
            if (country.toLowerCase().endsWith("a")) {
                System.out.println(country);
            }
        }
    }
    
    public static void printAlphabetsSorted(char[] alphabets) {
        Arrays.sort(alphabets);
        for (char ch : alphabets) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }
    
    public static String[] getIngredients(String foodItem) {
        if (foodItem.equals("Pizza")) {
            return new String[]{"Dough", "Cheese", "Tomato Sauce", "Toppings"};
        } else if (foodItem.equals("Pasta")) {
            return new String[]{"Noodles", "Olive Oil", "Garlic", "Tomato Sauce"};
        } else if (foodItem.equals("Salad")) {
            return new String[]{"Lettuce", "Tomato", "Cucumber", "Dressing"};
        } else {
            return new String[]{"No ingredients found"};
        }
    }
    
    public static void printMainArgs(String[] args) {
        for (String arg : args) {
            System.out.println(arg);
        }
    }
    
    public static void main(String[] args) {
        String[] emails = {"john@example.com", "alice@email.com", "bob@mail.com"};
        printEmails(emails);
        
        String[] countries = {"India", "Canada", "USA", "Australia", "China"};
        printCountriesEndingWithA(countries);
        
        char[] alphabets = {'C', 'A', 'E', 'B', 'D'};
        printAlphabetsSorted(alphabets);
        
        System.out.println(Arrays.toString(getIngredients("Pizza")));
        
        printMainArgs(args);
    }
}
