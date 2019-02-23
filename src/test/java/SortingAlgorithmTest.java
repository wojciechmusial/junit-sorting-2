import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortingAlgorithmTest {

    private SortingAlgorithms classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new SortingAlgorithms();
    }

    @Test
    public void testSortowaniaTK1() {
        double[] toSort = {5,1,3,2};
        double[] expected = {1,2,3,5};

        classUnderTest.sort(toSort, true);

        Assert.assertArrayEquals(expected, toSort, 0.001);

    }

    @Test
    public void testSortowaniaKL1 (){
        double[] toSort =   {5,1,3,2};
        double[] expected = {1,2,3,5};


        classUnderTest.sort(toSort, true);

        Assert.assertArrayEquals(expected,toSort, 0.001);

    }

    private SortingAlgorithms classUnderTest;

    @Before
    public void setUp() throws Exception {
        classUnderTest = new SortingAlgorithms();
    }

    @Test
    public void testSortowaniaJJ1() {

        double[] toSort = {5, 1, 3, 2};
        double[] expected = {1, 2, 3, 5};

        classUnderTest.sort (toSort, true);
        Assert.assertArrayEquals (expected, toSort, 0.001);

        }

    }

}
