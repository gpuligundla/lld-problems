package VendingMachine;

public class IdleState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public IdleState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        if(vendingMachine.getInventory().checkProductExist(product)){
            vendingMachine.setSelectedProduct(product);
            vendingMachine.setVendingMachineState(vendingMachine.getReadyState());
            System.out.println("Selected the product: " + product.getName());
        }
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please select the product first");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please select the product first");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please select the product first");
    }

    @Override
    public void returnChange() {
        System.out.println("Nothing to return");
    }
}
