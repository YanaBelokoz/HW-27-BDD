package Elements;

import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;
import java.lang.reflect.Field;

public class Decorator extends DefaultFieldDecorator {
    public Decorator(ElementLocatorFactory factory) {
        super(factory);
    }

    @Override
    public Object decorate(ClassLoader classloader, Field field) {
        if (field.getType().equals(Buttons.class)) {
            ElementLocator locator = factory.createLocator(field);
            if (locator == null) {
                return null;
            }
            ElementLocator elementlocator = null;
            return new Buttons(proxyForLocator(classloader, elementlocator));
        } else if (field.getType().equals(Input.class)) {
            ElementLocator elementLocator = factory.createLocator(field);
            if (elementLocator == null) {
                return null;
            }
            return new Input(proxyForLocator(classloader, elementLocator));
        } else if (field.getType().equals(TextLables.class)) {
            ElementLocator elementLocator = factory.createLocator(field);
            if (elementLocator == null) {
                return null;
            }
        } else {
            return super.decorate(classloader, field);
        }
    }
}
