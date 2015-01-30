package io.codebar.stringtransformer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit tests for {@code ReverseStringTransformer}.  We test single and multiple word
 * Strings as well as a multibyte character set string.
 *
 * @author njacobs5074
 * @since 15/01/15
 */
public class ReverseStringTransformerTest {

    private StringTransformer transformer;

    @Before
    public void setUp() {
        transformer = new ReverseStringTransformer();
    }

    @Test
    public void testReverseStringForEmpty() throws Exception {
        String original = "";
        String reverse = transformer.transform(original);
        assertEquals("Reverse doesn't match!", reverse, "");
    }

    @Test
    public void testReverseStringForSingleWord() throws Exception {
        String original = "Hello";
        String reverse = transformer.transform(original);
        assertEquals("Reverse doesn't match!", reverse, "olleH");
    }

    @Test
    public void testReverseStringForMultipleWords() throws Exception {
        String original = "Hello, Dave";
        String reverse = transformer.transform(original);
        assertEquals("Reverse doesn't match!", reverse, "evaD ,olleH");
    }

    @Test
    public void testReverseStringForMultiByteWords() throws Exception {
        String original = "今日は、デイブ";
        String reverse = transformer.transform(original);
        assertEquals("Reverse doesn't match!", reverse, "ブイデ、は日今");
    }
}