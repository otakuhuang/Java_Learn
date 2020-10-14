package impl;

import interfaces.Card;
import interfaces.Category;
import interfaces.HasCard;
import interfaces.Merchandise;

public class ThinkAndBuyCustomer extends AbsCustomer implements HasCard {

    private Card card = VIPCard.Level0;

    public ThinkAndBuyCustomer(Category shouldBuy, String custId) {
        super(shouldBuy, custId);
    }

    @Override
    public int buyMerchandise(Merchandise merchandise) {
        Category category = merchandise.getCategory();
        // 需要买就买一个
        if (category == getShouldBuy()) {
            return 1;
        }

        double soldPrice = merchandise.getSoldPrice();

        double avgPrice = (category.getHigherPrice() + category.getLowPrice()) / 2;

        if (soldPrice < avgPrice) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
}
