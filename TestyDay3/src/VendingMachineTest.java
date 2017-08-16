import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
    @Test

    public void WhenChooseingProductsWithoutMoneyNotihingHappen(){
        VendingMachine vendingMachine=new VendingMachine();
        String result=vendingMachine.execute("A");
        Assert.assertEquals("",result);
    }
}
