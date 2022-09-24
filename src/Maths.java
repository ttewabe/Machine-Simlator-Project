
public class Maths {

    public int calculateTotal(CoinBucket enteredCoins) {
        return enteredCoins.getTotal();
    }

    public CoinBucket calculateChange(int amountMoneyToReturn) {
        CoinBucket change = new CoinBucket(new int[4]);
        int remainingAmount = amountMoneyToReturn;

        change.number100CentsCoins = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;

        change.number50CentsCoins = remainingAmount / 50;
        remainingAmount = remainingAmount % 50;

        change.number25CentsCoins = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        change.number5CentsCoins = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        return change;
    }
}
