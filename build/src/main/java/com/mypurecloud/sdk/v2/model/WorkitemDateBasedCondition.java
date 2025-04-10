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

import java.io.Serializable;
/**
 * WorkitemDateBasedCondition
 */

public class WorkitemDateBasedCondition  implements Serializable {
  

  private static class AttributeEnumDeserializer extends StdDeserializer<AttributeEnum> {
    public AttributeEnumDeserializer() {
      super(AttributeEnumDeserializer.class);
    }

    @Override
    public AttributeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AttributeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The name of the workitem date attribute.
   */
 @JsonDeserialize(using = AttributeEnumDeserializer.class)
  public enum AttributeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATEDUE("dateDue"),
    DATEEXPIRES("dateExpires"),
    TTL("ttl");

    private String value;

    AttributeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AttributeEnum fromString(String key) {
      if (key == null) return null;

      for (AttributeEnum value : AttributeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AttributeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AttributeEnum attribute = null;
  private Integer relativeMinutesToInvocation = null;

  public WorkitemDateBasedCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the workitem date attribute.
   **/
  public WorkitemDateBasedCondition attribute(AttributeEnum attribute) {
    this.attribute = attribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the workitem date attribute.")
  @JsonProperty("attribute")
  public AttributeEnum getAttribute() {
    return attribute;
  }
  public void setAttribute(AttributeEnum attribute) {
    this.attribute = attribute;
  }


  /**
   * The time in minutes before or after the date attribute.
   **/
  public WorkitemDateBasedCondition relativeMinutesToInvocation(Integer relativeMinutesToInvocation) {
    this.relativeMinutesToInvocation = relativeMinutesToInvocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time in minutes before or after the date attribute.")
  @JsonProperty("relativeMinutesToInvocation")
  public Integer getRelativeMinutesToInvocation() {
    return relativeMinutesToInvocation;
  }
  public void setRelativeMinutesToInvocation(Integer relativeMinutesToInvocation) {
    this.relativeMinutesToInvocation = relativeMinutesToInvocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemDateBasedCondition workitemDateBasedCondition = (WorkitemDateBasedCondition) o;

    return Objects.equals(this.attribute, workitemDateBasedCondition.attribute) &&
            Objects.equals(this.relativeMinutesToInvocation, workitemDateBasedCondition.relativeMinutesToInvocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, relativeMinutesToInvocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemDateBasedCondition {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    relativeMinutesToInvocation: ").append(toIndentedString(relativeMinutesToInvocation)).append("\n");
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

