
/*
 * Camel EndpointConfiguration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir;

import org.apache.camel.spi.Configurer;
import org.apache.camel.spi.ApiMethod;
import org.apache.camel.spi.ApiParam;
import org.apache.camel.spi.ApiParams;
import org.apache.camel.spi.UriParam;
import org.apache.camel.spi.UriParams;

/**
 * Camel endpoint configuration for {@link org.apache.camel.component.fhir.api.FhirMeta}.
 */
@ApiParams(apiName = "meta", 
           description = "API for the meta operations, which can be used to get, add and remove tags and other Meta elements from a resource or across the server",
           apiMethods = {@ApiMethod(methodName = "add", description="Add the elements in the given metadata to the already existing set (do not remove any)", signatures={"org.hl7.fhir.instance.model.api.IBaseMetaType add(org.hl7.fhir.instance.model.api.IBaseMetaType meta, org.hl7.fhir.instance.model.api.IIdType id, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "delete", description="Delete the elements in the given metadata from the given id", signatures={"org.hl7.fhir.instance.model.api.IBaseMetaType delete(org.hl7.fhir.instance.model.api.IBaseMetaType meta, org.hl7.fhir.instance.model.api.IIdType id, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "getFromResource", description="Fetch the current metadata from a specific resource", signatures={"org.hl7.fhir.instance.model.api.IBaseMetaType getFromResource(Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType, org.hl7.fhir.instance.model.api.IIdType id, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "getFromServer", description="Fetch the current metadata from the whole Server", signatures={"org.hl7.fhir.instance.model.api.IBaseMetaType getFromServer(Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"}), @ApiMethod(methodName = "getFromType", description="Fetch the current metadata from a specific type", signatures={"org.hl7.fhir.instance.model.api.IBaseMetaType getFromType(Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType, String resourceType, java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters)"})}, aliases = {})
@UriParams
@Configurer
public final class FhirMetaEndpointConfiguration extends FhirConfiguration {
    @UriParam
    @ApiParam(optional = true, apiMethods = {@ApiMethod(methodName = "add", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "delete", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "getFromResource", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "getFromServer", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL"), @ApiMethod(methodName = "getFromType", description="See ExtraParameters for a full list of parameters that can be passed, may be NULL")})
    private java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "add", description="The id"), @ApiMethod(methodName = "delete", description="The id"), @ApiMethod(methodName = "getFromResource", description="The id")})
    private org.hl7.fhir.instance.model.api.IIdType id;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "add", description="The IBaseMetaType class"), @ApiMethod(methodName = "delete", description="The IBaseMetaType class")})
    private org.hl7.fhir.instance.model.api.IBaseMetaType meta;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "getFromResource", description="The IBaseMetaType class"), @ApiMethod(methodName = "getFromServer", description="The type of the meta datatype for the given FHIR model version (should be MetaDt.class or MetaType.class)"), @ApiMethod(methodName = "getFromType", description="The IBaseMetaType class")})
    private Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType;
    @UriParam
    @ApiParam(optional = false, apiMethods = {@ApiMethod(methodName = "getFromType", description="The resource type e.g Patient")})
    private String resourceType;

    public java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> getExtraParameters() {
        return extraParameters;
    }

    public void setExtraParameters(java.util.Map<org.apache.camel.component.fhir.api.ExtraParameters, Object> extraParameters) {
        this.extraParameters = extraParameters;
    }

    public org.hl7.fhir.instance.model.api.IIdType getId() {
        return id;
    }

    public void setId(org.hl7.fhir.instance.model.api.IIdType id) {
        this.id = id;
    }

    public org.hl7.fhir.instance.model.api.IBaseMetaType getMeta() {
        return meta;
    }

    public void setMeta(org.hl7.fhir.instance.model.api.IBaseMetaType meta) {
        this.meta = meta;
    }

    public Class<org.hl7.fhir.instance.model.api.IBaseMetaType> getMetaType() {
        return metaType;
    }

    public void setMetaType(Class<org.hl7.fhir.instance.model.api.IBaseMetaType> metaType) {
        this.metaType = metaType;
    }

    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }
}