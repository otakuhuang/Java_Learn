package util;

import impl.*;
import interfaces.Category;
import interfaces.Customer;
import interfaces.Merchandise;
import interfaces.SuperMarket;

import java.util.Scanner;

public class ShoppingUtil {

    private static final Scanner in = new Scanner(System.in);

    public static Scanner input() {
        return in;
    }

    public static void output(Object object) {
        System.out.println(String.valueOf(object));
    }

    public static SuperMarket createSuperMarket() {
        int merchandisePerCategory = 10;
        Merchandise[] all = new Merchandise[Category.values().length * merchandisePerCategory];

        for (Category category : Category.values()) {
            for (int i = 0; i < merchandisePerCategory; i++) {
                double soldPrice = Math.random() * (category.getHigherPrice() - category.getLowPrice()) + category.getLowPrice();

                double purchasePrice = soldPrice * 0.7;

                all[category.ordinal() * merchandisePerCategory + i] = new SimpleMerchandise(category.name() + i, soldPrice, purchasePrice, 200, category);
            }
        }
        SimpleSuperMarket superMarket = new SimpleSuperMarket(all);
        output("请输入超市的名字: ");
        String s = input().next();
        if (s.trim().length() > 0) {
            superMarket.setName(s.trim());
        }
        return superMarket;
    }

    public static Customer createCustomer(boolean auto) {
        if (auto) {
            String custId = "CUST" + (int) (Math.random() * 10000);
            Category shouldBuy = getRandomCategory();
            if (Math.random() < 0.5) {
                return new SuiYuanCustomer(shouldBuy, custId);
            } else {
                ThinkAndBuyCustomer ret = new ThinkAndBuyCustomer(shouldBuy, custId);
                ret.setCard(getRandomVIPCard());
                return ret;
            }
        }

        // TODO 思考题: 允许输入一个类名，使用 Class.forName(类名), 获得这个类的 Class 实例，
        // TODO 然后调用 newInstance 方法，创建这个类的实例
        return null;
    }

    public static Category getRandomCategory() {
        return Category.values()[(int) (Math.random() * 1000) % Category.values().length];
    }

    public static VIPCard getRandomVIPCard() {
        return VIPCard.values()[(int) (Math.random() * 1000) % VIPCard.values().length];
    }
}
