package VendingMachine;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private final Map<Product, Integer> inventory;

    public Inventory(){
        inventory = new HashMap<>();
    }

    public void displayInventory(){
        if(inventory.isEmpty()){
            System.out.println("Inventory is Empty!!");
            return;
        }
        for(Map.Entry<Product, Integer> item: inventory.entrySet()){
            System.out.println("Product: "+ item.getKey().getName() + " count is: "+ item.getValue());
        }
    }

    public int getProductCount(Product product){
        if(!inventory.isEmpty()){
            return inventory.get(product);
        }
        return  0;
    }

    public void addProduct(Product product, int qty){
        inventory.put(product, inventory.getOrDefault(product, 0) + qty);
        System.out.println("The product " + product.getName() + " has been added successfully");
    }
    public boolean checkProductExist(Product product){
        if(inventory.containsKey(product)){
            System.out.println("The product "+ product.getName()+ " is available of qty "+ inventory.get(product));
            return true;
        }
        System.out.println("The product is not available at the moment");
        return false;
    }

    public void dispenseProduct(Product product){
        System.out.println("The Inventory is: ");
        if (checkProductExist((product))) {
            inventory.put(product, inventory.get(product) - 1);
            if (inventory.get(product) < 0) {
                inventory.remove(product);
            }
            System.out.println("The product " + product.getName()+ "has been removed successfully");
        }
    }

}
