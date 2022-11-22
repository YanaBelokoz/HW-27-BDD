package Drivers;

import BusinessObject.CatalogBO;
import BusinessObject.ItemBO;
import BusinessObject.MainBO;
import PO.RozetkaPannel;

public class BusinessManager {
    private static BusinessManager instance;

    private BusinessManager(){}

    public static BusinessManager getInstance(){
        if(instance == null){
            instance = new BusinessManager();
        }
        return instance;
    }

    private CatalogBO catalogBO;

    public CatalogBO getCatalogBO() {
        if(catalogBO == null){
            catalogBO = new CatalogBO();
        }
        return catalogBO;
    }

    private ItemBO itemBO;

    public ItemBO getItemBO() {
        if(itemBO == null){
            itemBO = new ItemBO();
        }
        return itemBO;
    }

    private MainBO mainBO;

    public MainBO getMainBO(){
        if (mainBO == null){
            mainBO = new MainBO();
        }
        return mainBO;
    }
}
