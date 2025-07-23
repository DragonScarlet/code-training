import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.kuma.Word;

import java.util.ArrayList;
import java.util.Arrays;

class WordTest {

    @Test
    void testWord_001() {
        var result = Word.findWordsContaining(new String[]{"leet", "code"}, 'e');
        Assertions.assertEquals(Arrays.asList(0, 1), result);
    }

    @Test
    void testWord_002() {
        var result = Word.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'a');
        Assertions.assertEquals(Arrays.asList(0, 2), result);
    }

    @Test
    void testWord_003() {
        var result = Word.findWordsContaining(new String[]{"abc", "bcd", "aaaa", "cbc"}, 'z');
        Assertions.assertEquals(new ArrayList<>(), result);
    }
}
