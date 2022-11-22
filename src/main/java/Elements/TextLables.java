package Elements;

import org.openqa.selenium.WebElement;

public class TextLables extends AbstractElement{

    public TextLables(WebElement element){
        super(element);
    }

    public int getIntValueFromLables(){
        return Integer.parseInt(webElement.getText().replaceAll("\\D",""));
    }
}
