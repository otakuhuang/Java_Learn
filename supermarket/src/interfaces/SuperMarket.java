public interface SuperMarket {

    /**
     * 获取所有商品
     * @return
     */
    Merchandise[] getAllMerchandise();

    /**
     * 获取类别中随机的商品
     * @param category
     * @return
     */
    Merchandise[] getRandomMerchandiseOfCategory(Category category);

    /**
     * 收银
     * @param earnedMoney
     */
    void addEarnedMoney(double earnedMoney);

    /**
     * 日结报告
     */
    void dailyReport();
}
