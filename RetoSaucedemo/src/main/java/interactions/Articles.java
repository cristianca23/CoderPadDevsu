package interactions;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class Articles {

    public static Target addProduct(int product){
        return PageElement.located(By.xpath("(//*[@class='hrefch'])["+product+"]"));
    }
}
