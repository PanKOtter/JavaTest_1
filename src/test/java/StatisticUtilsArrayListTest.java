import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import org.junit.AfterClass;
import org.junit.BeforeClass;
class StatisticUtilsArrayListTest {
    DescriptiveStatistics stats;

    /**
     * create new ArrayList from StatisticUtilsArrayList class
     * initialize
     * start test
     */
    //@BeforeClass
    //public static void testSetup() {
        //ArrayList<Integer> doublesArray = new ArrayList<>();
        //for (int i = 0; i < 10; i++) {
          //  if (i ==2){
            //    doublesArray.add(1);
            //}
            //else {
              //  doublesArray.add(0);
/*            }

        }
        StatisticUtilsArrayList stats = new StatisticUtilsArrayList(doublesArray);
}*/
    @Test
    void testofArrayList(){
        ArrayList<Integer> doublesArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i ==2){
                doublesArray.add(1);
            }

            else {
                doublesArray.add(0);
            }

            }
        StatisticUtilsArrayList tester = new StatisticUtilsArrayList(doublesArray);
/**create new object
 * of StatisticUtilsArrayList class
 */


        assertEquals(0,tester.getMin());
        assertEquals(1,tester.getMax());
        assertEquals(0.1,tester.getMean());
        assertEquals(0.0,tester.getMedian());
        assertEquals(0.31622776601683794,tester.getSd());
    }

    @Test
    void testofArrayList2(){
        ArrayList<Integer> doublesArray = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            if (i ==4){
              doublesArray.add(-1);
            }
            else {
            doublesArray.add(0);
             }

        }
        StatisticUtilsArrayList tester= new StatisticUtilsArrayList(doublesArray);



        assertEquals(-1,tester.getMin());
        assertEquals(0.0,tester.getMax());
        assertEquals(-0.1,tester.getMean());
        assertEquals(0.0,tester.getMedian());
        assertEquals(0.31622776601683794,tester.getSd());
    }

}