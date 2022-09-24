
public enum Item {

    JUICE(1,100), COKE(2,80), WATER(3,60), SANDWICH(4,150), COOKIE(5, 90), PEPSI(6, 120);

    private int num;
    private int price;

    Item(int num, int price) {
        this.num = num;
        this.price = price;
    }

    Item(int num) {
        this.num= num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

    public static Item valueOf(int itemSelected) {
        for (Item item : Item.values()) {
            if (itemSelected == item.getNum()) {
                return item;
            }
        }
        return null;
    }
}
