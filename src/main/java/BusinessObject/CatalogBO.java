package BusinessObject;

import Drivers.PageObject;
import PO.Catalog;
import PO.FilterPage;

public class CatalogBO {
    FilterPage filterPage;
    Catalog catalog;

    public CatalogBO() {
        filterPage = PageObject.getInstance().getFilterPage();
        catalog = PageObject.getInstance().getCatalog();
    }

    public void setMaximumPriceInFilter(int price) {
        System.out.println("Set maximum price.");
        filterPage.setMaximumPrice(String.valueOf(price));
        filterPage.applyMaxPriceFilter();
    }

    public void selectItemFromCatalogByIndex(int index){
        catalog = PageObject.getInstance().getCatalog();
        System.out.println("Select item.");
        catalog.chooseItem(index);
    }
}
