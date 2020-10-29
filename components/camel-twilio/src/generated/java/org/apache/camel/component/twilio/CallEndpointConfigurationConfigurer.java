/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.twilio;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.twilio.CallEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CallEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("ApiName", org.apache.camel.component.twilio.internal.TwilioApiName.class);
        map.put("ApplicationSid", java.lang.String.class);
        map.put("From", com.twilio.type.Endpoint.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PathAccountSid", java.lang.String.class);
        map.put("PathSid", java.lang.String.class);
        map.put("To", com.twilio.type.Endpoint.class);
        map.put("Twiml", com.twilio.type.Twiml.class);
        map.put("Url", java.net.URI.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.twilio.CallEndpointConfiguration target = (org.apache.camel.component.twilio.CallEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.twilio.internal.TwilioApiName.class, value)); return true;
        case "applicationsid":
        case "ApplicationSid": target.setApplicationSid(property(camelContext, java.lang.String.class, value)); return true;
        case "from":
        case "From": target.setFrom(property(camelContext, com.twilio.type.Endpoint.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "pathaccountsid":
        case "PathAccountSid": target.setPathAccountSid(property(camelContext, java.lang.String.class, value)); return true;
        case "pathsid":
        case "PathSid": target.setPathSid(property(camelContext, java.lang.String.class, value)); return true;
        case "to":
        case "To": target.setTo(property(camelContext, com.twilio.type.Endpoint.class, value)); return true;
        case "twiml":
        case "Twiml": target.setTwiml(property(camelContext, com.twilio.type.Twiml.class, value)); return true;
        case "url":
        case "Url": target.setUrl(property(camelContext, java.net.URI.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.twilio.CallEndpointConfiguration target = (org.apache.camel.component.twilio.CallEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiname":
        case "ApiName": return target.getApiName();
        case "applicationsid":
        case "ApplicationSid": return target.getApplicationSid();
        case "from":
        case "From": return target.getFrom();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "pathaccountsid":
        case "PathAccountSid": return target.getPathAccountSid();
        case "pathsid":
        case "PathSid": return target.getPathSid();
        case "to":
        case "To": return target.getTo();
        case "twiml":
        case "Twiml": return target.getTwiml();
        case "url":
        case "Url": return target.getUrl();
        default: return null;
        }
    }
}
