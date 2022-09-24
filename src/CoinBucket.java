
public class CoinBucket {
    public int number5CentsCoins;
    public int number25CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    public CoinBucket(int... enterCoins){
        this.number5CentsCoins = enterCoins[0];
        this.number25CentsCoins = enterCoins[1];
        this.number50CentsCoins = enterCoins[2];
        this.number100CentsCoins = enterCoins[3];

    }

    public int getTotal(){
        int total = 0;
        total = total + this.number5CentsCoins*5;
        total = total + this.number25CentsCoins*25;
        total = total + this.number50CentsCoins*50;
        total = total + this.number100CentsCoins*100;

        return total;

    }
}
