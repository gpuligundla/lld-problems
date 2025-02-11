package VendingMachine;

public class ReturnChangeState implements VendingMachineState{
    private VendingMachine vendingMachine;

    public ReturnChangeState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void selectProduct(Product product) {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void insertCoin(Coin coin) {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void insertNote(Note note) {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please collect the change first.");
    }

    @Override
    public void returnChange() {
        double change = vendingMachine.getSelectedProdcutPayment() - vendingMachine.getSelectedProduct().getPrice();
        if(change > 0){
            System.out.println("please collect the change: " + change);
        }
        vendingMachine.addProductEarnings(vendingMachine.getSelectedProduct().getPrice());
        vendingMachine.resetSelectedProduct();
        vendingMachine.resetselectedProductPayment();
        vendingMachine.setVendingMachineState(vendingMachine.getIdleState());
    }
}
