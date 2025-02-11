package VendingMachine;

public class ReadyState implements VendingMachineState{
    private final VendingMachine vendingMachine;

    public ReadyState(VendingMachine vendingMachine){
        this.vendingMachine = vendingMachine;
    }
    @Override
    public void selectProduct(Product product) {
        System.out.println("You have already selected the product");
    }

    @Override
    public void insertCoin(Coin coin) {
        vendingMachine.addCoin(coin);
        System.out.println("Received a coin: "+ coin.getValue());
        checkProductPayemt();
    }

    @Override
    public void insertNote(Note note) {
        vendingMachine.addNote(note);
        System.out.println("Received a note: "+ note.getValue());
        checkProductPayemt();
    }

    @Override
    public void dispenseProduct() {
        System.out.println("Please insert Money first!!");
    }

    @Override
    public void returnChange() {
        System.out.println("Nothing to return");
    }

    private void checkProductPayemt(){
        System.out.println(vendingMachine.getSelectedProduct().getPrice());
        if(vendingMachine.getSelectedProdcutPayment() >= vendingMachine.getSelectedProduct().getPrice()){
            vendingMachine.setVendingMachineState(vendingMachine.getDispenseState());
        }
    }
}
