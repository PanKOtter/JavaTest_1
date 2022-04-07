import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.*;
import java.util.Random;
import java.util.stream.DoubleStream;
public class StatisticUtilsArrayTest {
  DescriptiveStatistics stats;
    //double[] doublesArray = new double[10];
    //doublesArray = {}

    @Test

    void testofArray(){
        //Random obj = new Random();
        double[] doublesArray = new double[10];
        for (int i = 0; i < 10; i++) {
            doublesArray[i] = i ;
        }
        //System.out.println(doublesArray);
        StatisticUtilsArray stats = new StatisticUtilsArray(doublesArray);
        assertEquals(0,stats.getMin());stats.getMin();
        assertEquals(9.0,stats.getMax());
        assertEquals(4.5,stats.getMean());
        assertEquals(4.5,stats.getMedian());
        assertEquals(3.0276503540974917,stats.getSd());
        }




    }

