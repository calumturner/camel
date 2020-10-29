/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.braintree;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.braintree.CustomerGatewayEndpointConfiguration;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class CustomerGatewayEndpointConfigurationConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("AccessToken", java.lang.String.class);
        map.put("ApiName", org.apache.camel.component.braintree.internal.BraintreeApiName.class);
        map.put("AssociationFilterId", java.lang.String.class);
        map.put("Environment", java.lang.String.class);
        map.put("HttpLogLevel", java.lang.String.class);
        map.put("HttpLogName", java.lang.String.class);
        map.put("HttpReadTimeout", java.lang.Integer.class);
        map.put("Id", java.lang.String.class);
        map.put("LogHandlerEnabled", boolean.class);
        map.put("MerchantId", java.lang.String.class);
        map.put("MethodName", java.lang.String.class);
        map.put("PrivateKey", java.lang.String.class);
        map.put("ProxyHost", java.lang.String.class);
        map.put("ProxyPort", java.lang.Integer.class);
        map.put("PublicKey", java.lang.String.class);
        map.put("Query", com.braintreegateway.CustomerSearchRequest.class);
        map.put("Request", com.braintreegateway.CustomerRequest.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.braintree.CustomerGatewayEndpointConfiguration target = (org.apache.camel.component.braintree.CustomerGatewayEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "apiname":
        case "ApiName": target.setApiName(property(camelContext, org.apache.camel.component.braintree.internal.BraintreeApiName.class, value)); return true;
        case "associationfilterid":
        case "AssociationFilterId": target.setAssociationFilterId(property(camelContext, java.lang.String.class, value)); return true;
        case "environment":
        case "Environment": target.setEnvironment(property(camelContext, java.lang.String.class, value)); return true;
        case "httploglevel":
        case "HttpLogLevel": target.setHttpLogLevel(property(camelContext, java.lang.String.class, value)); return true;
        case "httplogname":
        case "HttpLogName": target.setHttpLogName(property(camelContext, java.lang.String.class, value)); return true;
        case "httpreadtimeout":
        case "HttpReadTimeout": target.setHttpReadTimeout(property(camelContext, java.lang.Integer.class, value)); return true;
        case "id":
        case "Id": target.setId(property(camelContext, java.lang.String.class, value)); return true;
        case "loghandlerenabled":
        case "LogHandlerEnabled": target.setLogHandlerEnabled(property(camelContext, boolean.class, value)); return true;
        case "merchantid":
        case "MerchantId": target.setMerchantId(property(camelContext, java.lang.String.class, value)); return true;
        case "methodname":
        case "MethodName": target.setMethodName(property(camelContext, java.lang.String.class, value)); return true;
        case "privatekey":
        case "PrivateKey": target.setPrivateKey(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "ProxyHost": target.setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "ProxyPort": target.setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "publickey":
        case "PublicKey": target.setPublicKey(property(camelContext, java.lang.String.class, value)); return true;
        case "query":
        case "Query": target.setQuery(property(camelContext, com.braintreegateway.CustomerSearchRequest.class, value)); return true;
        case "request":
        case "Request": target.setRequest(property(camelContext, com.braintreegateway.CustomerRequest.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.braintree.CustomerGatewayEndpointConfiguration target = (org.apache.camel.component.braintree.CustomerGatewayEndpointConfiguration) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesstoken":
        case "AccessToken": return target.getAccessToken();
        case "apiname":
        case "ApiName": return target.getApiName();
        case "associationfilterid":
        case "AssociationFilterId": return target.getAssociationFilterId();
        case "environment":
        case "Environment": return target.getEnvironment();
        case "httploglevel":
        case "HttpLogLevel": return target.getHttpLogLevel();
        case "httplogname":
        case "HttpLogName": return target.getHttpLogName();
        case "httpreadtimeout":
        case "HttpReadTimeout": return target.getHttpReadTimeout();
        case "id":
        case "Id": return target.getId();
        case "loghandlerenabled":
        case "LogHandlerEnabled": return target.isLogHandlerEnabled();
        case "merchantid":
        case "MerchantId": return target.getMerchantId();
        case "methodname":
        case "MethodName": return target.getMethodName();
        case "privatekey":
        case "PrivateKey": return target.getPrivateKey();
        case "proxyhost":
        case "ProxyHost": return target.getProxyHost();
        case "proxyport":
        case "ProxyPort": return target.getProxyPort();
        case "publickey":
        case "PublicKey": return target.getPublicKey();
        case "query":
        case "Query": return target.getQuery();
        case "request":
        case "Request": return target.getRequest();
        default: return null;
        }
    }
}
