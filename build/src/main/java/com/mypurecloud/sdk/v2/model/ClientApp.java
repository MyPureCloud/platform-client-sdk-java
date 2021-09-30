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
import com.mypurecloud.sdk.v2.model.ClientAppConfigurationInfo;
import com.mypurecloud.sdk.v2.model.IntegrationStatusInfo;
import com.mypurecloud.sdk.v2.model.IntegrationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Details for a ClientApp
 */
@ApiModel(description = "Details for a ClientApp")

public class ClientApp  implements Serializable {
  
  private String id = null;
  private String name = null;
  private IntegrationType integrationType = null;
  private String notes = null;

  private static class IntendedStateEnumDeserializer extends StdDeserializer<IntendedStateEnum> {
    public IntendedStateEnumDeserializer() {
      super(IntendedStateEnumDeserializer.class);
    }

    @Override
    public IntendedStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IntendedStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Configured state of the integration.
   */
 @JsonDeserialize(using = IntendedStateEnumDeserializer.class)
  public enum IntendedStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ENABLED("ENABLED"),
    DISABLED("DISABLED"),
    DELETED("DELETED");

    private String value;

    IntendedStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IntendedStateEnum fromString(String key) {
      if (key == null) return null;

      for (IntendedStateEnum value : IntendedStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IntendedStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IntendedStateEnum intendedState = null;
  private ClientAppConfigurationInfo config = null;
  private IntegrationStatusInfo reportedState = null;
  private Map<String, String> attributes = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The name of the integration, used to distinguish this integration from others of the same type.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "Type of the integration")
  @JsonProperty("integrationType")
  public IntegrationType getIntegrationType() {
    return integrationType;
  }

  
  @ApiModelProperty(example = "null", value = "Notes about the integration.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  
  /**
   * Configured state of the integration.
   **/
  public ClientApp intendedState(IntendedStateEnum intendedState) {
    this.intendedState = intendedState;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configured state of the integration.")
  @JsonProperty("intendedState")
  public IntendedStateEnum getIntendedState() {
    return intendedState;
  }
  public void setIntendedState(IntendedStateEnum intendedState) {
    this.intendedState = intendedState;
  }

  
  @ApiModelProperty(example = "null", value = "Configuration information for the integration.")
  @JsonProperty("config")
  public ClientAppConfigurationInfo getConfig() {
    return config;
  }

  
  @ApiModelProperty(example = "null", value = "Last reported status of the integration.")
  @JsonProperty("reportedState")
  public IntegrationStatusInfo getReportedState() {
    return reportedState;
  }

  
  @ApiModelProperty(example = "null", value = "Read-only attributes for the integration.")
  @JsonProperty("attributes")
  public Map<String, String> getAttributes() {
    return attributes;
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
    ClientApp clientApp = (ClientApp) o;
    return Objects.equals(this.id, clientApp.id) &&
        Objects.equals(this.name, clientApp.name) &&
        Objects.equals(this.integrationType, clientApp.integrationType) &&
        Objects.equals(this.notes, clientApp.notes) &&
        Objects.equals(this.intendedState, clientApp.intendedState) &&
        Objects.equals(this.config, clientApp.config) &&
        Objects.equals(this.reportedState, clientApp.reportedState) &&
        Objects.equals(this.attributes, clientApp.attributes) &&
        Objects.equals(this.selfUri, clientApp.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationType, notes, intendedState, config, reportedState, attributes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientApp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    intendedState: ").append(toIndentedString(intendedState)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    reportedState: ").append(toIndentedString(reportedState)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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

