/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.irc;

import java.net.URISyntaxException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.apache.camel.spi.EndpointUriFactory;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
public class IrcEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":hostname:port";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(31);
        props.add("basicPropertyBinding");
        props.add("keys");
        props.add("synchronous");
        props.add("sslContextParameters");
        props.add("autoRejoin");
        props.add("onTopic");
        props.add("colors");
        props.add("onQuit");
        props.add("hostname");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("nickname");
        props.add("nickPassword");
        props.add("trustManager");
        props.add("persistent");
        props.add("onKick");
        props.add("commandTimeout");
        props.add("exchangePattern");
        props.add("namesOnJoin");
        props.add("realname");
        props.add("onPart");
        props.add("onReply");
        props.add("lazyStartProducer");
        props.add("onJoin");
        props.add("channels");
        props.add("onPrivmsg");
        props.add("port");
        props.add("exceptionHandler");
        props.add("onMode");
        props.add("onNick");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(3);
        secretProps.add("password");
        secretProps.add("nickPassword");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "irc".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "hostname", null, true, copy);
        uri = buildPathParameter(syntax, uri, "port", null, false, copy);
        uri = buildQueryParameters(uri, copy, encode);
        return uri;
    }

    @Override
    public Set<String> propertyNames() {
        return PROPERTY_NAMES;
    }

    @Override
    public Set<String> secretPropertyNames() {
        return SECRET_PROPERTY_NAMES;
    }

    @Override
    public boolean isLenientProperties() {
        return false;
    }
}
