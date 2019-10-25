import java.util.ArrayList;

public class GroceryList {
    private ArrayList <String> groceryList = new ArrayList<String>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void addGroceryItem (String item){
        groceryList.add(item);
    }

    public void printGroceryList (){
        System.out.println("you have " + groceryList.size() + " items in your grocery list");
        for (int i = 0; i < groceryList.size() ; i++) {
            System.out.println((i + 1) + ". " + groceryList.get(i));
        }
    }

    public void modifyGroceryList(String currentItem, String newItem){
        int position = findItem(currentItem);
        if(position >= 0){
            modifyGroceryList(position, newItem);
        }
    }

    private void modifyGroceryList(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery item " + (position + 1) + " has been modified");
    }

    public void removeItem (String item){
        int position = findItem(item);
        if(position >= 0){
            removeItem(position);
        }
    }

    private void removeItem (int position){
        groceryList.remove(position);
    }

    private int findItem (String searchItem){
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
