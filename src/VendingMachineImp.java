import java.util.*;

public class VendingMachineImp implements VendingMachine {

    private int selectedItem;
    private CoinBucket change;

    // This Method displays a message in the console welcoming the user and showing the available items.
    @Override
    public void displayItems() {
        System.out.println();
        System.out.println();
        System.out.println(" 🧃***********************************************🥪");
        System.out.println("    ");
        System.out.println("  ****      WELCOME TO MY VENDING MACHINE!      ****");
        System.out.println("     ");
        System.out.println(" 🍩***********************************************🍫");

        System.out.println();
        System.out.println("       AVAULABLE ITEMS WITH PRICE:           ");

        for(Item item: Item.values()){
            System.out.println("     " + item.getNum() + "  " + item.name() + " ☞ Price: " + item.getPrice());
        }
        System.out.println("                                              ");
        System.out.print(" Please select items using a number: ");

    }

    //It receives the Item selected by the user.
    @Override
    public void selectItem(int item) {
        this.selectedItem = item;
    }

    //This Method displays a message requesting the user to enter coins.
    @Override
    public void displayEnterCoins() {
        System.out.println(" Please enter coins  ");

        System.out.println("    Example: If you would like to enter 3 fifty cents coins: 0,0,3,0");

        System.out.println("");
        System.out.print("Please enter coins:");
    }

    //It receives the coins entered by the user.
    @Override
    public void enterCoins(int... coins) {
        Maths calculat = new Maths();
        Item item = Item.valueOf(this.selectedItem);
        int total = calculat.calculateTotal(new CoinBucket(coins));

        int changeRemain = total - item.getPrice();
        this.change = calculat.calculateChange(changeRemain);
    }

    //This Method displays a message letting the user know his/her change amount and coins.
    @Override
    public void displayCoinsRemain() {

        System.out.println("               ");
        System.out.println("Your change is  : " +  change.getTotal());

        System.out.println("    100 cents coins   :    " +  change.number100CentsCoins);

        System.out.println("    50 cents coins    :    " +  change.number50CentsCoins);

        System.out.println("    25 cents coins    :    " +  change.number25CentsCoins);

        System.out.println("    5 cents coins     :    " +  change.number5CentsCoins);

    }
}
