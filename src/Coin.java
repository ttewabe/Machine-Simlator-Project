public class Coin {

    public final int FIVE_CENTS = 5;
    public final int TWENTYFIVE_CENTS = 25;
    public final int FIFTY_CENTS = 50;
    public final int HUNDRED_CENTS = 100;

    private int value;

    private Coin(int value){
        this.value = value;
    }

    public static int[] parseCoins(String coins){

        String[] numberCoins = coins.split(",");
        int[] result = new int[numberCoins.length];

        for(int index = 0; index < numberCoins.length; index++){
            result[index] = Integer.parseInt(numberCoins[index]);
        }
        return result;
    }
}
