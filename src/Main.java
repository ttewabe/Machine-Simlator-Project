import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // TODO To complete in step3
        VendingMachine vendingMachine = new TextBasedVendingMachine();

        vendingMachine.displayProducts();

        String selectedProduct = scanner.nextLine();
        int selectProductNumber = Integer.parseInt(selectedProduct);

        vendingMachine.selectProduct(selectProductNumber);

        vendingMachine.displayEnterCoinsMessage();

        String userEnteredCoins = scanner.nextLine();
        int[] enteredCoins = {}; // TODO Complete in step 3
        vendingMachine.enterCoins(enteredCoins);

        vendingMachine.displayChangeMessage();

    }
}
