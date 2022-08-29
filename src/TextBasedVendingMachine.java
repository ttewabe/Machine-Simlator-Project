// why we use interface after class bcs encapsulation principle
public class TextBasedVendingMachine implements VendingMachine {

    //private VendingMachineController controller = new SimpleVendingMachineController();
    private int selectedProduct;
    //private CoinBundle change;
    @Override
    public void displayProducts() {
        System.out.println(" *********************************************");
        System.out.println("     WELCOME TO THE VENDING MACHINE           ");
        System.out.println(" *********************************************");
        System.out.println("            Products available:               ");
        System.out.println("                                              ");
        for(Product product: Product.values()){
                System.out.println("     " + product.getId() + "  " + product.name() + " - Price: " + product.getPrice());
        }
        System.out.println("                                              ");
        System.out.println(" Please select your product: ");


    }

    @Override
    public void selectProduct(int product) {
        this.selectedProduct = product;
    }

    @Override
    public void displayEnterCoinsMessage() {
        System.out.println(" Please enter coins as follows: ");
        System.out.println(" num of 5 cents coins,num of 10 cents coins,num of 20 cents coins,num of 50 cents coins,num of 100 cents coins  ");
        System.out.println("                                              ");
        System.out.println(" Example: If you would like to enter 2 ten cents coins: 0,2,0,0,0");
        System.out.println("Please enter coins:");
    }
    @Override
    public void enterCoins(int... coins) {
       // VendingMachineRequest request = new VendingMachineRequest(selectedProduct, coins);
       // change = controller.calculateChange(request);
    }
    @Override
    public void displayChangeMessage() {
    }
}
