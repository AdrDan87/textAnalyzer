import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import textAnalyzers.Analyser;
import textAnalyzers.MostPopularWords;

import static org.junit.Assert.assertEquals;

@RunWith(JUnitParamsRunner.class)
public class MostPopularWordsTest {


    @Test
    @Parameters(method = "mostPopularWordsValues")
    public void testCorrectCharFreq(String input, String expected) {
        Analyser popular = new MostPopularWords();
        assertEquals(expected, popular.analyze(input));
    }


    private Object[] mostPopularWordsValues() {
        return new Object[]{
                new Object[]{"la ka ma la ka", "la=2 ka=2 ma=1 "},
                new Object[]{"la ka ma la ka laaaa", "la=2 ka=2 laaaa=1 ma=1 "},
        };
    }
}
