package BusinessObject;

import Drivers.PageObject;
import PO.RozetkaPannel;

public class MainBO {
    RozetkaPannel rozetkaHeader;

    public MainBO() {
        rozetkaHeader = PageObject.getInstance().getRozetkaPannel();
    }

    public void enterQueryAndSearch(String request){
        System.out.println("Enter search query.");
        rozetkaHeader.enterTextInSearchInput(request);
        rozetkaHeader.clickSearch();
    }
}
