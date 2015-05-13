package BestBuyTest;

import baseApi.Base;
import org.testng.annotations.Test;

public class BestBuySignin extends Base{
    @Test
    public void signIn()throws InterruptedException{
        sleepFor(2);
        clickByCss(".user.link-text");
        sleepFor(2);
        typeByCss("#TxtEmailId", "abc");
        typeAndEnterByCss("#PwdPasswordId","12345");
        sleepFor(4);

    }
}

