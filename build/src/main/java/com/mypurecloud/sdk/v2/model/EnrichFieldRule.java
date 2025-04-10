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
 * EnrichFieldRule
 */

public class EnrichFieldRule  implements Serializable {
  
  private String field = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The behavior for how to combine data from the request body and the database.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALWAYSUSEPROVIDED("AlwaysUseProvided"),
    PREFEREXISTING("PreferExisting"),
    PREFERPROVIDED("PreferProvided");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;

  private static class ArrayActionEnumDeserializer extends StdDeserializer<ArrayActionEnum> {
    public ArrayActionEnumDeserializer() {
      super(ArrayActionEnumDeserializer.class);
    }

    @Override
    public ArrayActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ArrayActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The behavior for how to combine items in array field from the request body and the database.
   */
 @JsonDeserialize(using = ArrayActionEnumDeserializer.class)
  public enum ArrayActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REPLACE("Replace"),
    EXTEND("Extend"),
    FILL("Fill");

    private String value;

    ArrayActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ArrayActionEnum fromString(String key) {
      if (key == null) return null;

      for (ArrayActionEnum value : ArrayActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ArrayActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ArrayActionEnum arrayAction = null;

  public EnrichFieldRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A restricted JSONPath naming the specific field this combining behavior should apply to. You may use dot-notation for named fields, and array indexing for lists, but nothing more sophisticated (e.g. wildcards, sublists, filter expressions, etc). For example, to target the `firstName` field of a Contact, this should be \"$.firstName\".
   **/
  public EnrichFieldRule field(String field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A restricted JSONPath naming the specific field this combining behavior should apply to. You may use dot-notation for named fields, and array indexing for lists, but nothing more sophisticated (e.g. wildcards, sublists, filter expressions, etc). For example, to target the `firstName` field of a Contact, this should be \"$.firstName\".")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }


  /**
   * The behavior for how to combine data from the request body and the database.
   **/
  public EnrichFieldRule action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The behavior for how to combine data from the request body and the database.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   * The behavior for how to combine items in array field from the request body and the database.
   **/
  public EnrichFieldRule arrayAction(ArrayActionEnum arrayAction) {
    this.arrayAction = arrayAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The behavior for how to combine items in array field from the request body and the database.")
  @JsonProperty("arrayAction")
  public ArrayActionEnum getArrayAction() {
    return arrayAction;
  }
  public void setArrayAction(ArrayActionEnum arrayAction) {
    this.arrayAction = arrayAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichFieldRule enrichFieldRule = (EnrichFieldRule) o;

    return Objects.equals(this.field, enrichFieldRule.field) &&
            Objects.equals(this.action, enrichFieldRule.action) &&
            Objects.equals(this.arrayAction, enrichFieldRule.arrayAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, action, arrayAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichFieldRule {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    arrayAction: ").append(toIndentedString(arrayAction)).append("\n");
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

