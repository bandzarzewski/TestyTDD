import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {

      VendingMachine vendingMachine=new VendingMachine();
    @Test
    public void WhenChooseingProductsWithoutMoneyNotihingHappen(){
        String result=vendingMachine.execute("A");
        Assert.assertEquals("",result);
    }

    @Test

    public void WhenInsertNotEnoughMoneyAndPressProductGiveMoneyBack(){
        String result=vendingMachine.execute("DA");
        Assert.assertEquals("D",result);

    }
}
