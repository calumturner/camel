/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.jpa;

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
public class JpaEndpointUriFactory extends org.apache.camel.support.component.EndpointUriFactorySupport implements EndpointUriFactory {

    private static final String BASE = ":entityType";

    private static final Set<String> PROPERTY_NAMES;
    private static final Set<String> SECRET_PROPERTY_NAMES;
    static {
        Set<String> props = new HashSet<>(47);
        props.add("maximumResults");
        props.add("preDeleteHandler");
        props.add("basicPropertyBinding");
        props.add("backoffMultiplier");
        props.add("synchronous");
        props.add("deleteHandler");
        props.add("transacted");
        props.add("initialDelay");
        props.add("namedQuery");
        props.add("lockModeType");
        props.add("remove");
        props.add("sharedEntityManager");
        props.add("entityManagerProperties");
        props.add("scheduler");
        props.add("bridgeErrorHandler");
        props.add("useFixedDelay");
        props.add("runLoggingLevel");
        props.add("backoffErrorThreshold");
        props.add("greedy");
        props.add("maxMessagesPerPoll");
        props.add("skipLockedEntity");
        props.add("scheduledExecutorService");
        props.add("persistenceUnit");
        props.add("repeatCount");
        props.add("timeUnit");
        props.add("usePersist");
        props.add("entityType");
        props.add("query");
        props.add("sendEmptyMessageWhenIdle");
        props.add("schedulerProperties");
        props.add("exchangePattern");
        props.add("usePassedInEntityManager");
        props.add("nativeQuery");
        props.add("useExecuteUpdate");
        props.add("consumeLockEntity");
        props.add("backoffIdleThreshold");
        props.add("lazyStartProducer");
        props.add("delay");
        props.add("pollStrategy");
        props.add("joinTransaction");
        props.add("resultClass");
        props.add("startScheduler");
        props.add("consumeDelete");
        props.add("findEntity");
        props.add("exceptionHandler");
        props.add("parameters");
        props.add("flushOnSend");
        PROPERTY_NAMES = Collections.unmodifiableSet(props);
        SECRET_PROPERTY_NAMES = Collections.emptySet();
    }

    @Override
    public boolean isEnabled(String scheme) {
        return "jpa".equals(scheme);
    }

    @Override
    public String buildUri(String scheme, Map<String, Object> properties, boolean encode) throws URISyntaxException {
        String syntax = scheme + BASE;
        String uri = syntax;

        Map<String, Object> copy = new HashMap<>(properties);

        uri = buildPathParameter(syntax, uri, "entityType", null, true, copy);
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
