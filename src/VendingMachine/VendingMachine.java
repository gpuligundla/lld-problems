package VendingMachine;

public class VendingMachine {
    private static VendingMachine instance;
    private VendingMachineState currentState;
    private Product selectedProduct;
    private Inventory inventory;
    private double totalEarnings;
    private double selectedProdcutPayment;
    private final VendingMachineState idleState;
    private final VendingMachineState readyState;
    private final VendingMachineState dispenseState;
    private final VendingMachineState returnChangeState;


    private VendingMachine(){
        selectedProduct = null;
        totalEarnings = 0.0;
        selectedProdcutPayment = 0.0;
        inventory = new Inventory();
        idleState = new IdleState(this);
        readyState = new ReadyState(this);
        dispenseState = new DispenseState(this);
        returnChangeState = new ReturnChangeState(this);
        currentState = idleState;
    }

    public static VendingMachine getInstance(){
        if(instance == null){
            instance = new VendingMachine();
        }
        return instance;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void selectProduct(Product product){
        currentState.selectProduct(product);
    }

    public void insertCoin(Coin coin){
        currentState.insertCoin(coin);
    }

    public void insertNote(Note note){
        currentState.insertNote(note);
    }

    public void dispenseProduct(){
        currentState.dispenseProduct();
    }

    public void returnChange(){
        currentState.returnChange();
    }

    public VendingMachineState getIdleState(){
        return idleState;
    }

    public VendingMachineState getReadyState(){
        return readyState;
    }

    public VendingMachineState getDispenseState(){
        return dispenseState;
    }

    public VendingMachineState getReturnChangeState(){
        return returnChangeState;
    }

    public VendingMachineState getCurrentState(){
        return currentState;
    }

    public void setVendingMachineState(VendingMachineState state){
        this.currentState = state;
    }

    Product getSelectedProduct() {
        return selectedProduct;
    }

    void setSelectedProduct(Product product) {
        selectedProduct = product;
    }

    void resetSelectedProduct() {
        selectedProduct = null;
    }

    double getTotalEarnings(){
        return totalEarnings;
    }

    void addProductEarnings(double cost){
        totalEarnings += cost;
    }

    void addCoin(Coin coin){
        selectedProdcutPayment += coin.getValue();
    }

    void addNote(Note note){
        selectedProdcutPayment += note.getValue();
    }

    public double getSelectedProdcutPayment() {
        return selectedProdcutPayment;
    }


    public void resetselectedProductPayment(){
        this.selectedProdcutPayment = 0.0;
    }

}
