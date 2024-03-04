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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ModifiableRuleProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * CommonRuleBulkUpdateNotificationsRequest
 */

public class CommonRuleBulkUpdateNotificationsRequest  implements Serializable {
  
  private List<String> ruleIds = new ArrayList<String>();
  private ModifiableRuleProperties properties = null;

  private static class TypesToAddEnumDeserializer extends StdDeserializer<TypesToAddEnum> {
    public TypesToAddEnumDeserializer() {
      super(TypesToAddEnumDeserializer.class);
    }

    @Override
    public TypesToAddEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypesToAddEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets typesToAdd
   */
 @JsonDeserialize(using = TypesToAddEnumDeserializer.class)
  public enum TypesToAddEnum {
    SMS("Sms"),
    DEVICE("Device"),
    EMAIL("Email"),
    PUSH("Push");

    private String value;

    TypesToAddEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypesToAddEnum fromString(String key) {
      if (key == null) return null;

      for (TypesToAddEnum value : TypesToAddEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypesToAddEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<TypesToAddEnum> typesToAdd = new ArrayList<TypesToAddEnum>();

  private static class TypesToRemoveEnumDeserializer extends StdDeserializer<TypesToRemoveEnum> {
    public TypesToRemoveEnumDeserializer() {
      super(TypesToRemoveEnumDeserializer.class);
    }

    @Override
    public TypesToRemoveEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypesToRemoveEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets typesToRemove
   */
 @JsonDeserialize(using = TypesToRemoveEnumDeserializer.class)
  public enum TypesToRemoveEnum {
    SMS("Sms"),
    DEVICE("Device"),
    EMAIL("Email"),
    PUSH("Push");

    private String value;

    TypesToRemoveEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypesToRemoveEnum fromString(String key) {
      if (key == null) return null;

      for (TypesToRemoveEnum value : TypesToRemoveEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypesToRemoveEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<TypesToRemoveEnum> typesToRemove = new ArrayList<TypesToRemoveEnum>();

  
  /**
   * The user supplied rules ids to be updated
   **/
  public CommonRuleBulkUpdateNotificationsRequest ruleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user supplied rules ids to be updated")
  @JsonProperty("ruleIds")
  public List<String> getRuleIds() {
    return ruleIds;
  }
  public void setRuleIds(List<String> ruleIds) {
    this.ruleIds = ruleIds;
  }


  /**
   * The rule properties to be updated
   **/
  public CommonRuleBulkUpdateNotificationsRequest properties(ModifiableRuleProperties properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rule properties to be updated")
  @JsonProperty("properties")
  public ModifiableRuleProperties getProperties() {
    return properties;
  }
  public void setProperties(ModifiableRuleProperties properties) {
    this.properties = properties;
  }


  /**
   * Collection of alerting notification types to add for all entities in the rules
   **/
  public CommonRuleBulkUpdateNotificationsRequest typesToAdd(List<TypesToAddEnum> typesToAdd) {
    this.typesToAdd = typesToAdd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of alerting notification types to add for all entities in the rules")
  @JsonProperty("typesToAdd")
  public List<TypesToAddEnum> getTypesToAdd() {
    return typesToAdd;
  }
  public void setTypesToAdd(List<TypesToAddEnum> typesToAdd) {
    this.typesToAdd = typesToAdd;
  }


  /**
   * Collection of alerting notification types to remove for all entities in the rules
   **/
  public CommonRuleBulkUpdateNotificationsRequest typesToRemove(List<TypesToRemoveEnum> typesToRemove) {
    this.typesToRemove = typesToRemove;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Collection of alerting notification types to remove for all entities in the rules")
  @JsonProperty("typesToRemove")
  public List<TypesToRemoveEnum> getTypesToRemove() {
    return typesToRemove;
  }
  public void setTypesToRemove(List<TypesToRemoveEnum> typesToRemove) {
    this.typesToRemove = typesToRemove;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonRuleBulkUpdateNotificationsRequest commonRuleBulkUpdateNotificationsRequest = (CommonRuleBulkUpdateNotificationsRequest) o;

    return Objects.equals(this.ruleIds, commonRuleBulkUpdateNotificationsRequest.ruleIds) &&
            Objects.equals(this.properties, commonRuleBulkUpdateNotificationsRequest.properties) &&
            Objects.equals(this.typesToAdd, commonRuleBulkUpdateNotificationsRequest.typesToAdd) &&
            Objects.equals(this.typesToRemove, commonRuleBulkUpdateNotificationsRequest.typesToRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleIds, properties, typesToAdd, typesToRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonRuleBulkUpdateNotificationsRequest {\n");
    
    sb.append("    ruleIds: ").append(toIndentedString(ruleIds)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    typesToAdd: ").append(toIndentedString(typesToAdd)).append("\n");
    sb.append("    typesToRemove: ").append(toIndentedString(typesToRemove)).append("\n");
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

