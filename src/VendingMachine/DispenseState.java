package VendingMachine;

public class DispenseState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public DispenseState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("You can't select product now. wait for sometime");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("You can't  insert coin");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("You can't insert Note");
    }

    @Override
    public void dispenseProduct() {
        vendingMachine.getInventory().dispenseProduct(vendingMachine.getSelectedProduct());
        System.out.println("Please collect the product in the bottom");
        vendingMachine.setVendingMachineState(vendingMachine.getReturnChangeState());
    }

    @Override
    public void returnChange() {

    }
}
