import org.example.Sum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void sumTest(){
        assertEquals(10, Sum.sum(4, 6));
    }

}
