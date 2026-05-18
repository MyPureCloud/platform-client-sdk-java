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
 * ContactsPatchChange
 */

public class ContactsPatchChange  implements Serializable {
  
  private String field = null;
  private Object value = null;

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
   * The action of the operation.UpdateIfEmpty: Update if and only if the current value is emptyUpdate: Update the field unconditionally.UpdateIfExists: Update the field if and only if the existing field is not empty.AppendToCollection: Add new items to a collection, preserving existing data.Remove: Remove the current value unconditionally.RemoveFromCollection: Remove specified value from a collection.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPDATEIFEMPTY("UpdateIfEmpty"),
    UPDATEIFEXISTS("UpdateIfExists"),
    UPDATE("Update"),
    APPENDTOCOLLECTION("AppendToCollection"),
    REMOVE("Remove"),
    REMOVEFROMCOLLECTION("RemoveFromCollection");

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

  public ContactsPatchChange() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public ContactsPatchChange(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * A JSONPath string, whose syntax is a strict subset of the JSONPath RFC 9535.  The root of the field string must be \"$.\" indicating a path from the root of the entity. You may only use dot-notation to access named fields. Examples: To select the `firstName` field of a Contact, use: \"$.firstName\".To access object fields, use the top level object field name: \"$.address\". To access nested field names, use the nested field name: \"$.address.city\". Note: trying to patch both nested fields and their parent field is not allowed and will result in a 409 error response.
   **/
  public ContactsPatchChange field(String field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A JSONPath string, whose syntax is a strict subset of the JSONPath RFC 9535.  The root of the field string must be \"$.\" indicating a path from the root of the entity. You may only use dot-notation to access named fields. Examples: To select the `firstName` field of a Contact, use: \"$.firstName\".To access object fields, use the top level object field name: \"$.address\". To access nested field names, use the nested field name: \"$.address.city\". Note: trying to patch both nested fields and their parent field is not allowed and will result in a 409 error response.")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }


  /**
   * The value which is applied to the selected field for the patch. Acceptable types are String, Integer, Boolean, Array, Map.
   **/
  public ContactsPatchChange value(Object value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value which is applied to the selected field for the patch. Acceptable types are String, Integer, Boolean, Array, Map.")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * The action of the operation.UpdateIfEmpty: Update if and only if the current value is emptyUpdate: Update the field unconditionally.UpdateIfExists: Update the field if and only if the existing field is not empty.AppendToCollection: Add new items to a collection, preserving existing data.Remove: Remove the current value unconditionally.RemoveFromCollection: Remove specified value from a collection.
   **/
  public ContactsPatchChange action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action of the operation.UpdateIfEmpty: Update if and only if the current value is emptyUpdate: Update the field unconditionally.UpdateIfExists: Update the field if and only if the existing field is not empty.AppendToCollection: Add new items to a collection, preserving existing data.Remove: Remove the current value unconditionally.RemoveFromCollection: Remove specified value from a collection.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactsPatchChange contactsPatchChange = (ContactsPatchChange) o;

    return Objects.equals(this.field, contactsPatchChange.field) &&
            Objects.equals(this.value, contactsPatchChange.value) &&
            Objects.equals(this.action, contactsPatchChange.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, value, action);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactsPatchChange {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

