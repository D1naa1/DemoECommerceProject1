package test;

import Pages.HoverMenuPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HoverMenuTest extends TestBase{
    public HoverMenuPage HoverObject ;
    @Test
    public void HoverMenu (){
        HoverObject =new HoverMenuPage(driver);
        HoverObject.HoverMenu();
        Assert.assertEquals("Notebooks",HoverObject.NoteBooksTitle.getText());
        System.out.println(HoverObject.NoteBooksTitle.getText());

    }
}
