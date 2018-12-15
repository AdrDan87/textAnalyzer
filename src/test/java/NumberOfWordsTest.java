import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import textAnalyzers.Analyser;
import textAnalyzers.NumberOfWords;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class NumberOfWordsTest {

    @Test
    @Parameters (method = "correctnumberOfWordsValues")
    public void testCorrectNumberOfWords (String toCheck, Integer expected){
        Analyser numberOfWords = new NumberOfWords();
        assertEquals(expected, numberOfWords.analyze(toCheck));
    }

    private Object[] correctnumberOfWordsValues(){
        return new Object[]{
                new Object[]{"Ala ma kota", 3},
                new Object[]{"Przemek nie ma kota", 4},
                new Object[]{"OK", 1},
                new Object[]{"Wilk i zajac w polu ganialy az im nogi pod odpadaly ", 11},
                new Object[]{"1111 22222 3333 lalalala ", 4},
                new Object[]{"", 1},
        };
    }

}
