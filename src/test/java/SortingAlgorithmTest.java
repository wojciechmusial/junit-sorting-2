import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

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

    @Test
    public void testSortowaniaJJ1() {

        double[] toSort = {5, 1, 3, 2};
        double[] expected = {1, 2, 3, 5};

        classUnderTest.sort (toSort, true);
        Assert.assertArrayEquals (expected, toSort, 0.001);
            }
    @Test
    public void testSortowaniaJJ2() {

        double[] toSort = {5, 1, 3, 2};
        double[] expected = {5, 3, 2, 1};

        classUnderTest.sort (toSort, false);
        Assert.assertArrayEquals (expected, toSort, 0.001);
    }



    @Test
    public void testSortowaniaKL2 (){


        Random generator = new Random();


        double[] toSort =   new double[100];
        for (int j=1 ;  j< toSort.length ; j++) {
            toSort[j] = generator.nextDouble() ;
                 }

        classUnderTest.sort(toSort, true);

        if (toSort[50] < toSort[55]) {
            boolean wynik = true;

        }

    }
    @Test (timeout = 150)
    public void testSortowaniaTK3 () {


        Random generator = new Random();


        double[] toSort = new double[10000];
        for (int j = 1; j < toSort.length; j++) {
            toSort[j] = generator.nextDouble();
        }

        classUnderTest.sort(toSort, true);

        for (int i = 1; i < toSort.length - 1; i++) {
            Assert.assertTrue(toSort[i] <= toSort[i + 1]);
    }

}
