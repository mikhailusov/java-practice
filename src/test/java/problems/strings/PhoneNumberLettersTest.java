package problems.strings;

import org.junit.Test;
import java.util.Arrays;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class PhoneNumberLettersTest {

    @Test
    public void letterCombinations() {
        assertTrue(PhoneNumberLetters.letterCombinations("1").isEmpty());
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), PhoneNumberLetters.letterCombinations("23"));
        assertEquals(Arrays.asList("ada","adb","adc","aea","aeb","aec","afa","afb","afc","bda","bdb","bdc","bea","beb",
                "bec","bfa","bfb","bfc","cda","cdb","cdc","cea","ceb","cec","cfa","cfb","cfc"), PhoneNumberLetters.letterCombinations("232"));
    }
}