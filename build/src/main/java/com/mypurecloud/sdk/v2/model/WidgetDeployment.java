package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.WidgetClientConfig;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WidgetDeployment
 */

public class WidgetDeployment  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Boolean authenticationRequired = null;
  private Boolean disabled = null;
  private DomainEntityRef flow = null;
  private List<String> allowedDomains = new ArrayList<String>();

  private static class ClientTypeEnumDeserializer extends StdDeserializer<ClientTypeEnum> {
    public ClientTypeEnumDeserializer() {
      super(ClientTypeEnumDeserializer.class);
    }

    @Override
    public ClientTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ClientTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of display widget for which this Deployment is configured, which controls the administrator settings shown.
   */
 @JsonDeserialize(using = ClientTypeEnumDeserializer.class)
  public enum ClientTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    V1("v1"),
    V2("v2"),
    V1_HTTP("v1-http"),
    THIRD_PARTY("third-party");

    private String value;

    ClientTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ClientTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ClientTypeEnum value : ClientTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ClientTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ClientTypeEnum clientType = null;
  private WidgetClientConfig clientConfig = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public WidgetDeployment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A human-readable description of this Deployment.
   **/
  public WidgetDeployment description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A human-readable description of this Deployment.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * When true, the customer members starting a chat must be authenticated by supplying their JWT to the create operation.
   **/
  public WidgetDeployment authenticationRequired(Boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When true, the customer members starting a chat must be authenticated by supplying their JWT to the create operation.")
  @JsonProperty("authenticationRequired")
  public Boolean getAuthenticationRequired() {
    return authenticationRequired;
  }
  public void setAuthenticationRequired(Boolean authenticationRequired) {
    this.authenticationRequired = authenticationRequired;
  }

  
  /**
   * When true, all create chat operations using this Deployment will be rejected.
   **/
  public WidgetDeployment disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When true, all create chat operations using this Deployment will be rejected.")
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }

  
  /**
   * The URI of the Inbound Chat Flow to run when new chats are initiated under this Deployment.
   **/
  public WidgetDeployment flow(DomainEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URI of the Inbound Chat Flow to run when new chats are initiated under this Deployment.")
  @JsonProperty("flow")
  public DomainEntityRef getFlow() {
    return flow;
  }
  public void setFlow(DomainEntityRef flow) {
    this.flow = flow;
  }

  
  /**
   * The list of domains that are approved to use this Deployment; the list will be added to CORS headers for ease of web use.
   **/
  public WidgetDeployment allowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of domains that are approved to use this Deployment; the list will be added to CORS headers for ease of web use.")
  @JsonProperty("allowedDomains")
  public List<String> getAllowedDomains() {
    return allowedDomains;
  }
  public void setAllowedDomains(List<String> allowedDomains) {
    this.allowedDomains = allowedDomains;
  }

  
  /**
   * The type of display widget for which this Deployment is configured, which controls the administrator settings shown.
   **/
  public WidgetDeployment clientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of display widget for which this Deployment is configured, which controls the administrator settings shown.")
  @JsonProperty("clientType")
  public ClientTypeEnum getClientType() {
    return clientType;
  }
  public void setClientType(ClientTypeEnum clientType) {
    this.clientType = clientType;
  }

  
  /**
   * The client configuration options that should be made available to the clients of this Deployment.
   **/
  public WidgetDeployment clientConfig(WidgetClientConfig clientConfig) {
    this.clientConfig = clientConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The client configuration options that should be made available to the clients of this Deployment.")
  @JsonProperty("clientConfig")
  public WidgetClientConfig getClientConfig() {
    return clientConfig;
  }
  public void setClientConfig(WidgetClientConfig clientConfig) {
    this.clientConfig = clientConfig;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetDeployment widgetDeployment = (WidgetDeployment) o;
    return Objects.equals(this.id, widgetDeployment.id) &&
        Objects.equals(this.name, widgetDeployment.name) &&
        Objects.equals(this.description, widgetDeployment.description) &&
        Objects.equals(this.authenticationRequired, widgetDeployment.authenticationRequired) &&
        Objects.equals(this.disabled, widgetDeployment.disabled) &&
        Objects.equals(this.flow, widgetDeployment.flow) &&
        Objects.equals(this.allowedDomains, widgetDeployment.allowedDomains) &&
        Objects.equals(this.clientType, widgetDeployment.clientType) &&
        Objects.equals(this.clientConfig, widgetDeployment.clientConfig) &&
        Objects.equals(this.selfUri, widgetDeployment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, authenticationRequired, disabled, flow, allowedDomains, clientType, clientConfig, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetDeployment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    authenticationRequired: ").append(toIndentedString(authenticationRequired)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    allowedDomains: ").append(toIndentedString(allowedDomains)).append("\n");
    sb.append("    clientType: ").append(toIndentedString(clientType)).append("\n");
    sb.append("    clientConfig: ").append(toIndentedString(clientConfig)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

