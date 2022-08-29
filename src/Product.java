public enum Product {
    crisps(1,100), coke(2,50), water(3,30), sandwich(4,150);
    private int id;
    private int price;

    Product(int id, int price){
        this.id = id;
        this.price = price;
    }
    // Two method to access the fills. to follow encapsulation principle
    public int getId() {
        return this.id;
    }
    public int getPrice() {
        return this.price;
    }
}
