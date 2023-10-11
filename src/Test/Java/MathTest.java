package Test.Java;

import org.junit.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MathTest {
    Math maths;
    @Before
    public void setUpInstance(){
        maths = new Math();
    }

    @Test
    public void checkTheSumOfTwoNumbersThatEqualsThree(){
        Assert.assertEquals(3,maths.addTwoNumbers(9,7));
    }
}
