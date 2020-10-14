import impl.SimpleShopman;
import interfaces.Customer;
import interfaces.Shopman;
import interfaces.SuperMarket;
import util.ShoppingUtil;

public class ShoppingAppMain {
    public static void main(String[] args) {

        SuperMarket superMarket = ShoppingUtil.createSuperMarket();

        Shopman shopman = new SimpleShopman(superMarket);

        boolean open = true;
        while (open) {
            new ShoppingTask(shopman).executeTask();
            ShoppingUtil.output("是否继续营业? (yes)");
            open = !ShoppingUtil.input().next().trim().equalsIgnoreCase("no");
        }
        superMarket.dailyReport();
    }
}

class ShoppingTask {
    private Shopman shopman;

    public ShoppingTask(Shopman shopman) {
        this.shopman = shopman;
    }

    public void executeTask() {
        Customer customer = ShoppingUtil.createCustomer(true);
        shopman.serverCustomer(customer);
    }
}
