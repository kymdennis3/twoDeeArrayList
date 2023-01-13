import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("nyanya");
        produceList.add("kitungu");
        produceList.add("hoho");


        ArrayList<String> drinksList = new ArrayList<>();
        drinksList.add("soda");
        drinksList.add("beer");

        ArrayList<String> bakeryList = new ArrayList<>();
        bakeryList.add("bread");
        bakeryList.add("queen cakes");
        bakeryList.add("donuts");

        groceryList.add(produceList);
        groceryList.add(drinksList);
        groceryList.add(bakeryList);

        System.out.println(groceryList.get(0));
    }
}