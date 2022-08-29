public class CoinBundle {
    public int number5CentsCoins;
    public int number10CentsCoins;
    public int number20CentsCoins;
    public int number50CentsCoins;
    public int number100CentsCoins;

    public CoinBundle(int... enterCoins){
        this.number5CentsCoins = enterCoins[0];
        this.number10CentsCoins = enterCoins[1];
        this.number20CentsCoins = enterCoins[2];
        this.number50CentsCoins = enterCoins[3];
        this.number100CentsCoins = enterCoins[4];
    }
    public int getTotal(){
        int total = 0;
        total = total + this.number5CentsCoins;
        total = total + this.number10CentsCoins;
        total = total + this.number20CentsCoins;
        total = total + this.number50CentsCoins;
        total = total + this.number100CentsCoins;
        return -1;

    }
}
