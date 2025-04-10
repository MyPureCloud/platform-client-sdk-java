package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.util.ArrayList;
import java.io.IOException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OrganizationPresenceDefinition
 */

public class OrganizationPresenceDefinition  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of definition
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SYSTEM("System"),
    USER("User");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Map<String, String> languageLabels = null;

  private static class SystemPresenceEnumDeserializer extends StdDeserializer<SystemPresenceEnum> {
    public SystemPresenceEnumDeserializer() {
      super(SystemPresenceEnumDeserializer.class);
    }

    @Override
    public SystemPresenceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SystemPresenceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets systemPresence
   */
 @JsonDeserialize(using = SystemPresenceEnumDeserializer.class)
  public enum SystemPresenceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVAILABLE("Available"),
    AWAY("Away"),
    BUSY("Busy"),
    OFFLINE("Offline"),
    IDLE("Idle"),
    ONQUEUE("OnQueue"),
    MEAL("Meal"),
    TRAINING("Training"),
    MEETING("Meeting"),
    BREAK("Break");

    private String value;

    SystemPresenceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SystemPresenceEnum fromString(String key) {
      if (key == null) return null;

      for (SystemPresenceEnum value : SystemPresenceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SystemPresenceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SystemPresenceEnum systemPresence = null;
  private String divisionId = null;
  private Boolean deactivated = null;
  private String selfUri = null;

  public OrganizationPresenceDefinition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public OrganizationPresenceDefinition name(String name) {
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
   * The type of definition
   **/
  public OrganizationPresenceDefinition type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of definition")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The label used for the definition in each specified language
   **/
  public OrganizationPresenceDefinition languageLabels(Map<String, String> languageLabels) {
    this.languageLabels = languageLabels;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The label used for the definition in each specified language")
  @JsonProperty("languageLabels")
  public Map<String, String> getLanguageLabels() {
    return languageLabels;
  }
  public void setLanguageLabels(Map<String, String> languageLabels) {
    this.languageLabels = languageLabels;
  }


  /**
   **/
  public OrganizationPresenceDefinition systemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemPresence")
  public SystemPresenceEnum getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(SystemPresenceEnum systemPresence) {
    this.systemPresence = systemPresence;
  }


  /**
   **/
  public OrganizationPresenceDefinition divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   **/
  public OrganizationPresenceDefinition deactivated(Boolean deactivated) {
    this.deactivated = deactivated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("deactivated")
  public Boolean getDeactivated() {
    return deactivated;
  }
  public void setDeactivated(Boolean deactivated) {
    this.deactivated = deactivated;
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
    OrganizationPresenceDefinition organizationPresenceDefinition = (OrganizationPresenceDefinition) o;

    return Objects.equals(this.id, organizationPresenceDefinition.id) &&
            Objects.equals(this.name, organizationPresenceDefinition.name) &&
            Objects.equals(this.type, organizationPresenceDefinition.type) &&
            Objects.equals(this.languageLabels, organizationPresenceDefinition.languageLabels) &&
            Objects.equals(this.systemPresence, organizationPresenceDefinition.systemPresence) &&
            Objects.equals(this.divisionId, organizationPresenceDefinition.divisionId) &&
            Objects.equals(this.deactivated, organizationPresenceDefinition.deactivated) &&
            Objects.equals(this.selfUri, organizationPresenceDefinition.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, languageLabels, systemPresence, divisionId, deactivated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPresenceDefinition {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    languageLabels: ").append(toIndentedString(languageLabels)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    deactivated: ").append(toIndentedString(deactivated)).append("\n");
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

