package problems.strings;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SimilarRGBColorTest {

    @Test
    public void similarRGB() {
        assertEquals("#11ee66", SimilarRGBColor.similarRGB("#09f166"));
        assertEquals("#0000ff", SimilarRGBColor.similarRGB("#0102ff"));
        assertEquals("#eeaacc", SimilarRGBColor.similarRGB("#f0a9ca"));
        assertEquals("#111111", SimilarRGBColor.similarRGB("#121314"));
        assertEquals("#ee22ee", SimilarRGBColor.similarRGB("#f11ff1"));
    }
}