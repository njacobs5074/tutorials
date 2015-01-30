package io.codebar.stringtransformer;

/**
 * Interface that defines what operations we need all of our implementations to support.
 *
 * @author njacobs5074
 * @since 16/01/2015
 */
public interface StringTransformer {
    /**
     * Pass in a string and get the transformed version back.
     */
    String transform(String source);
}
