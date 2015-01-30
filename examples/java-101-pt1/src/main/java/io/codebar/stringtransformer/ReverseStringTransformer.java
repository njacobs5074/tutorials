package io.codebar.stringtransformer;

/**
 * Simple class to reverse a string.
 *
 * @author njacobs5074
 * @since 15/01/15
 */
public class ReverseStringTransformer implements StringTransformer {

    @Override
    public String transform(String source) {
        StringBuilder reverse = new StringBuilder();

        for (int i = source.length() - 1; i >= 0; i--)
            reverse.append(source.charAt(i));

        return reverse.toString();
    }
}
