package io.codebar.stringtransformer;

/**
 * {@code StringTransformer} implementation that transforms an existing string to upper case.
 *
 * @author njacobs5074
 * @since 16/01/2015
 */
public class ToUpperStringTransformer implements StringTransformer {
    @Override
    public String transform(String source) {
        return source.toUpperCase();
    }
}
