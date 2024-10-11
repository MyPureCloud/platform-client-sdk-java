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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemOnAttributeChangeCondition
 */

public class WorkitemOnAttributeChangeCondition  implements Serializable {
  

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
   * The name of the workitem attribute whose change will be evaluated as part of the rule.
   */
 @JsonDeserialize(using = AttributeEnumDeserializer.class)
  public enum AttributeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STATUSID("statusId");

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
  private String newValue = null;
  private String oldValue = null;

  
  /**
   * The name of the workitem attribute whose change will be evaluated as part of the rule.
   **/
  public WorkitemOnAttributeChangeCondition attribute(AttributeEnum attribute) {
    this.attribute = attribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the workitem attribute whose change will be evaluated as part of the rule.")
  @JsonProperty("attribute")
  public AttributeEnum getAttribute() {
    return attribute;
  }
  public void setAttribute(AttributeEnum attribute) {
    this.attribute = attribute;
  }


  /**
   * The new value of the attribute. If the attribute is updated to this value this part of the condition will be met.
   **/
  public WorkitemOnAttributeChangeCondition newValue(String newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new value of the attribute. If the attribute is updated to this value this part of the condition will be met.")
  @JsonProperty("newValue")
  public String getNewValue() {
    return newValue;
  }
  public void setNewValue(String newValue) {
    this.newValue = newValue;
  }


  /**
   * The old value of the attribute. If the attribute was updated from this value this part of the condition will be met.
   **/
  public WorkitemOnAttributeChangeCondition oldValue(String oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The old value of the attribute. If the attribute was updated from this value this part of the condition will be met.")
  @JsonProperty("oldValue")
  public String getOldValue() {
    return oldValue;
  }
  public void setOldValue(String oldValue) {
    this.oldValue = oldValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemOnAttributeChangeCondition workitemOnAttributeChangeCondition = (WorkitemOnAttributeChangeCondition) o;

    return Objects.equals(this.attribute, workitemOnAttributeChangeCondition.attribute) &&
            Objects.equals(this.newValue, workitemOnAttributeChangeCondition.newValue) &&
            Objects.equals(this.oldValue, workitemOnAttributeChangeCondition.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attribute, newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOnAttributeChangeCondition {\n");
    
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
    sb.append("    newValue: ").append(toIndentedString(newValue)).append("\n");
    sb.append("    oldValue: ").append(toIndentedString(oldValue)).append("\n");
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

