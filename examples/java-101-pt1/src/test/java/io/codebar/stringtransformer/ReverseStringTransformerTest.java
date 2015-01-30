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
        doTest("", "");
    }

    @Test
    public void testReverseStringForSingleWord() throws Exception {
        doTest("Hello", "olleH");
    }

    @Test
    public void testReverseStringForMultipleWords() throws Exception {
        doTest("Hello, Dave", "evaD ,olleH");
    }

    @Test
    public void testReverseStringForMultiByteWords() throws Exception {
        doTest("今日は、デイブ", "ブイデ、は日今");
    }

    // Utility function that runs test and checks that results matched expected.
    private void doTest(String source, String expected) throws Exception {
        assertEquals("Reverse doesn't match!", expected, transformer.transform(source));
    }
}