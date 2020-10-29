/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.splunk;

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
public class SplunkEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":name";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(46);
        props.add("basicPropertyBinding");
        props.add("backoffMultiplier");
        props.add("scheme");
        props.add("synchronous");
        props.add("earliestTime");
        props.add("source");
        props.add("initialDelay");
        props.add("useSunHttpsHandler");
        props.add("savedSearch");
        props.add("scheduler");
        props.add("search");
        props.add("streaming");
        props.add("password");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("host");
        props.add("greedy");
        props.add("scheduledExecutorService");
        props.add("connectionTimeout");
        props.add("tcpReceiverPort");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("app");
        props.add("owner");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("count");
        props.add("exchangePattern");
        props.add("index");
        props.add("raw");
        props.add("backoffIdleThreshold");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("port");
        props.add("sourceType");
        props.add("startScheduler");
        props.add("initEarliestTime");
        props.add("name");
        props.add("sslProtocol");
        props.add("latestTime");
        props.add("eventHost");
        props.add("exceptionHandler");
        props.add("username");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        Set<String> secretProps = new HashSet<>(2);
        secretProps.add("password");
        secretProps.add("username");
        SECRET_PROPERTY_NAMES = Collections.unmodifiableSet(secretProps);
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "splunk".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "name", null, true, copy);
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
