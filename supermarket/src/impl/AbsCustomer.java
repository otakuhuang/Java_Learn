package impl;

import interfaces.Category;
import interfaces.Customer;
import interfaces.Merchandise;
import interfaces.ShoppingCart;

import static util.ShoppingUtil.getRandomCategory;

public class AbsCustomer implements Customer {

    private Category shouldBuy;
    private String custId;
    private double moneySpent;
    // 逛超市次数
    private int guangLeft = 0;

    /**
     * 逛超市次数初始值
     */
    private int guangCount = 0;

    public static final int DEFAULT_GUANG_COUNT = 5;

    public AbsCustomer(Category shouldBuy, String custId, int guangCount) {
        this.shouldBuy = shouldBuy;
        this.custId = custId;
        this.guangCount = guangCount;
    }

    public AbsCustomer(Category shouldBuy, String custId) {
        this(shouldBuy, custId, DEFAULT_GUANG_COUNT);
    }


    public int getGuangCount() {
        return guangCount;
    }

    public void setGuangCount(int guangCount) {
        this.guangCount = guangCount;
    }

    @Override
    public String getCustId() {
        return custId;
    }

    @Override
    public void startShopping() {
        guangLeft = guangCount;
    }

    /**
     * 先看必须买的，没有必须买的就随便看看
     *
     * @return 想买购买的商品种类
     */
    @Override
    public Category chooseCategory() {
        // 有一次机会看需要买的东西
        if (guangLeft+1>=guangCount){
            return shouldBuy;
        } else {
            return getRandomCategory();
        }
    }

    @Override
    public int buyMerchandise(Merchandise merchandise) {
        return 0;
    }

    @Override
    public boolean wantToCheckout() {
        guangLeft--;
        return guangLeft <= 0;

    }

    @Override
    public double payFor(ShoppingCart shoppingCart, double totalCost) {
        // TODO 留给大家的思考题，买不起怎么办？
        moneySpent+=totalCost;
        return totalCost;
    }

    public Category getShouldBuy() {
        return shouldBuy;
    }

    @Override
    public double getMoneySpent() {
        return moneySpent;
    }
}
