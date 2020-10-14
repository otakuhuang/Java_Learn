package interfaces;

public enum Category {

    // 食物
    FOOD(10, 300),
    // 厨具
    COOK(200, 2000),
    // 小吃
    SNACK(5, 100),
    // 衣服
    CLOTHES(200, 1000),
    // 电器
    ELECTRIC(200, 10000);

    int lowPrice;
    int higherPrice;

    Category(int lowPrice, int higherPrice) {
        this.lowPrice = lowPrice;
        this.higherPrice = higherPrice;
    }

    public int getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(int lowPrice) {
        this.lowPrice = lowPrice;
    }

    public int getHigherPrice() {
        return higherPrice;
    }

    public void setHigherPrice(int higherPrice) {
        this.higherPrice = higherPrice;
    }
}
