import org.junit.Assert;
import org.junit.Test;

public class SquareTrinomialTest{
    @Test
    public void Trinomial(){
        double[] arr = {-0.5,-2};
        double[] arr1 = {-1, -1};
        double[] arr2 = {-1, 2};
        SquareTrinomial squareTrinomial = new SquareTrinomial(2,5,2);
        Assert.assertArrayEquals(arr, squareTrinomial.RadicalCalculation(), 0);
        SquareTrinomial squareTrinomial1 = new SquareTrinomial(3,6,3);
        Assert.assertArrayEquals(arr1, squareTrinomial1.RadicalCalculation(), 0);
        SquareTrinomial squareTrinomial2 = new SquareTrinomial(-2,2,4);
        Assert.assertArrayEquals(arr2, squareTrinomial2.RadicalCalculation(), 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void IllegalTrinomial(){
        SquareTrinomial squareTrinomial = new SquareTrinomial(-8,6,-4);
        squareTrinomial.RadicalCalculation();
    }
    @Test(expected = IllegalArgumentException.class)
    public void TrinominalException2(){
        SquareTrinomial squareTrinomial = new SquareTrinomial(0,6,4);
        squareTrinomial.RadicalCalculation();
    }
}