import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;
import java.util.*;
import java.util.Random;
class calcTest {
    @Test

    void twoplustwocalc (){
        calc calci = new calc();
        calc.add(2,2);
        assertEquals(4,calc.add(2,2));




    }




}