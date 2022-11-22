package Drivers;

import PO.*;

public class PageObject {
    private static PageObject instance;

    private PageObject(){}

    public static PageObject getInstance(){
        if(instance == null){
            instance = new PageObject();
        }
        return instance;
    }

    private RozetkaPannel rozetkaPannel;
    public RozetkaPannel getRozetkaPannel(){
        if (rozetkaPannel == null){
            rozetkaPannel = new RozetkaPannel();
        }
        return rozetkaPannel;
    }

    private Catalog catalog;
    public Catalog getCatalog(){
        if (catalog == null){
            catalog = new Catalog();
        }
        return catalog;
    }

    private CartPopup cartPopup;
    public CartPopup getCartPopup(){
        if (cartPopup == null){
            cartPopup = new CartPopup();
        }
        return cartPopup;
    }

    private Item item;
    public Item getItem(){
        if (item == null){
            item = new Item();
        }
        return item;
    }

    private Checkout checkout;
    public Checkout getCheckout(){
        if (checkout == null){
            checkout = new checkout();
        }
        return checkout;
    }

    private FilterPage filterPage;
    public FilterPage getFilterPage(){
        if (filterPage == null){
            filterPage = new filterPage();
        }
        return filterPage;
    }

    public <CheckoutPage> CheckoutPage getCheckoutPage() {
        return null;
    }
}
