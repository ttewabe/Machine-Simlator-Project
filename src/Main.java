import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create Object method
        VendingMachine vendingMachine = new VendingMachineImp();

        vendingMachine.displayItems();

        String selectedItem = sc.nextLine();
        // string change to integer
        int selectItemNumber = Integer.parseInt(selectedItem);

        //switch statement to display which item user selected
        switch(selectItemNumber) {
            case 1: System.out.println("    * You choose Juice *");
                break;
            case 2: System.out.println("    * You choose Coke *");
                break;
            case 3: System.out.println("    * You choose Water *");
                break;
            case 4: System.out.println("    * You choose Sandwich *");
                break;
            case 5: System.out.println("    * You choose Cookie *");
                break;
            case 6: System.out.println("    * You choose Pepsi *");
                break;
            default: System.out.println("    Ooops!! Out of stock!");
                break;
        }
        System.out.println();
        // Item selected by user
        vendingMachine.selectItem(selectItemNumber);

        vendingMachine.displayEnterCoins();

        String userEnteredCoins = sc.nextLine();
        // String change to  Array
        int[] enteredCoins = Coin.parseCoins(userEnteredCoins);

        // Passing the coins in to Vending machine
        vendingMachine.enterCoins(enteredCoins);
        vendingMachine.displayCoinsRemain();

        //displays a message in the console Thank you the user
        System.out.println("    ");
        System.out.println("    * THANK YOU 🙏🏽! *");

        sc.close();

    }
}

