package BusinessObject;

import Drivers.PageObject;
import PO.CartPopup;
import PO.Item;

public class ItemBO {
    Item item;
    CartPopup cartPopup;

    public void ItemPageBO() {
        item = PageObject.getInstance().getItem();
        cartPopup = PageObject.getInstance().getCartPopup();
    }

    public void addItemToCartAndProceedToChtckout() {
        System.out.println("Add item to cart and proceed to checkout.");
        item.clickBuyBtn();
        item.clickBuyBtnPopup();
    }
}
