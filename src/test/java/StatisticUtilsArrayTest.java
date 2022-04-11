import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.*;
import java.util.stream.DoubleStream;
public class StatisticUtilsArrayTest {
    DescriptiveStatistics stats;

    @Test
    void testofArray() {
        double[] doublesArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doublesArray[i] = i;
        }
        /** initialize an array
         *  test the methods
          */

        //System.out.println(doublesArray);
        StatisticUtilsArray stats = new StatisticUtilsArray(doublesArray);
        assertEquals(0, stats.getMin());
        assertEquals(9.0, stats.getMax());
        assertEquals(4.5, stats.getMean());
        assertEquals(4.5, stats.getMedian());
        assertEquals(3.0276503540974917, stats.getSd());
    }

    @Test
    void testofArray2() {
        double[] doublesArray = new double[10];
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                doublesArray[i] = 1;
            }
            else if (i==4){

                doublesArray[i] = -2;
            }
            else {
                doublesArray[i] = 0;
            }
        }
            //System.out.println(doublesArray);
            StatisticUtilsArray stats = new StatisticUtilsArray(doublesArray);
            assertEquals(-2.0, stats.getMin());
            assertEquals(1.0, stats.getMax());
            assertEquals(-0.09999999999999999, stats.getMean());
            assertEquals(0, stats.getMedian());
            assertEquals(0.7378647873726217, stats.getSd());
        }


    }


