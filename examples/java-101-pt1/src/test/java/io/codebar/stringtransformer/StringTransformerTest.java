package io.codebar.stringtransformer;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Unit tests for the {@code StringTransformer} implementations.
 *
 * @author njacobs5074
 * @since 16/01/2015
 */
public class StringTransformerTest {

    @Test
    public void testTrivialStringTransformer() throws Exception {
        TrivialStringTransformer transformer = new TrivialStringTransformer();
        assertEquals("Strings don't match!", "Hello World", transformer.transform("Hello World"));
    }

    @Test
    public void testToUpperStringTransformer() throws Exception {
        ToUpperStringTransformer transformer = new ToUpperStringTransformer();
        assertEquals("Strings don't match!", "HELLO WORLD", transformer.transform("Hello World"));
    }
}
