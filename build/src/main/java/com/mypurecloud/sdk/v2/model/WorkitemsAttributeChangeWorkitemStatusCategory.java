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
 * WorkitemsAttributeChangeWorkitemStatusCategory
 */

public class WorkitemsAttributeChangeWorkitemStatusCategory  implements Serializable {
  

  private static class NewValueEnumDeserializer extends StdDeserializer<NewValueEnum> {
    public NewValueEnumDeserializer() {
      super(NewValueEnumDeserializer.class);
    }

    @Override
    public NewValueEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NewValueEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * New property value
   */
 @JsonDeserialize(using = NewValueEnumDeserializer.class)
  public enum NewValueEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

    private String value;

    NewValueEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NewValueEnum fromString(String key) {
      if (key == null) return null;

      for (NewValueEnum value : NewValueEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NewValueEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NewValueEnum newValue = null;

  private static class OldValueEnumDeserializer extends StdDeserializer<OldValueEnum> {
    public OldValueEnumDeserializer() {
      super(OldValueEnumDeserializer.class);
    }

    @Override
    public OldValueEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OldValueEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Old property value
   */
 @JsonDeserialize(using = OldValueEnumDeserializer.class)
  public enum OldValueEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    WAITING("Waiting"),
    CLOSED("Closed"),
    UNKNOWN("Unknown");

    private String value;

    OldValueEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OldValueEnum fromString(String key) {
      if (key == null) return null;

      for (OldValueEnum value : OldValueEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OldValueEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OldValueEnum oldValue = null;

  public WorkitemsAttributeChangeWorkitemStatusCategory() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * New property value
   **/
  public WorkitemsAttributeChangeWorkitemStatusCategory newValue(NewValueEnum newValue) {
    this.newValue = newValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "New property value")
  @JsonProperty("newValue")
  public NewValueEnum getNewValue() {
    return newValue;
  }
  public void setNewValue(NewValueEnum newValue) {
    this.newValue = newValue;
  }


  /**
   * Old property value
   **/
  public WorkitemsAttributeChangeWorkitemStatusCategory oldValue(OldValueEnum oldValue) {
    this.oldValue = oldValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Old property value")
  @JsonProperty("oldValue")
  public OldValueEnum getOldValue() {
    return oldValue;
  }
  public void setOldValue(OldValueEnum oldValue) {
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
    WorkitemsAttributeChangeWorkitemStatusCategory workitemsAttributeChangeWorkitemStatusCategory = (WorkitemsAttributeChangeWorkitemStatusCategory) o;

    return Objects.equals(this.newValue, workitemsAttributeChangeWorkitemStatusCategory.newValue) &&
            Objects.equals(this.oldValue, workitemsAttributeChangeWorkitemStatusCategory.oldValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newValue, oldValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsAttributeChangeWorkitemStatusCategory {\n");
    
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

