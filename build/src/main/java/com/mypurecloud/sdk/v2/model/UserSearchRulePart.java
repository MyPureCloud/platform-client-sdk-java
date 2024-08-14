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
import java.util.List;

import java.io.Serializable;
/**
 * UserSearchRulePart
 */

public class UserSearchRulePart  implements Serializable {
  

  private static class OperationEnumDeserializer extends StdDeserializer<OperationEnum> {
    public OperationEnumDeserializer() {
      super(OperationEnumDeserializer.class);
    }

    @Override
    public OperationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operation for this part
   */
 @JsonDeserialize(using = OperationEnumDeserializer.class)
  public enum OperationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCLUDE("Include"),
    EXCLUDE("Exclude");

    private String value;

    OperationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperationEnum fromString(String key) {
      if (key == null) return null;

      for (OperationEnum value : OperationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperationEnum operation = null;

  private static class SelectorEnumDeserializer extends StdDeserializer<SelectorEnum> {
    public SelectorEnumDeserializer() {
      super(SelectorEnumDeserializer.class);
    }

    @Override
    public SelectorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SelectorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of item being selected by this part
   */
 @JsonDeserialize(using = SelectorEnumDeserializer.class)
  public enum SelectorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACDSKILL("AcdSkill"),
    USER("User"),
    GROUP("Group"),
    QUEUE("Queue"),
    DIVISION("Division"),
    MANAGEMENTUNIT("ManagementUnit");

    private String value;

    SelectorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SelectorEnum fromString(String key) {
      if (key == null) return null;

      for (SelectorEnum value : SelectorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SelectorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SelectorEnum selector = null;
  private List<String> ids = new ArrayList<String>();

  
  /**
   * The operation for this part
   **/
  public UserSearchRulePart operation(OperationEnum operation) {
    this.operation = operation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operation for this part")
  @JsonProperty("operation")
  public OperationEnum getOperation() {
    return operation;
  }
  public void setOperation(OperationEnum operation) {
    this.operation = operation;
  }


  /**
   * The type of item being selected by this part
   **/
  public UserSearchRulePart selector(SelectorEnum selector) {
    this.selector = selector;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of item being selected by this part")
  @JsonProperty("selector")
  public SelectorEnum getSelector() {
    return selector;
  }
  public void setSelector(SelectorEnum selector) {
    this.selector = selector;
  }


  /**
   * The ids for the selector; the results of these are ORed together
   **/
  public UserSearchRulePart ids(List<String> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ids for the selector; the results of these are ORed together")
  @JsonProperty("ids")
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSearchRulePart userSearchRulePart = (UserSearchRulePart) o;

    return Objects.equals(this.operation, userSearchRulePart.operation) &&
            Objects.equals(this.selector, userSearchRulePart.selector) &&
            Objects.equals(this.ids, userSearchRulePart.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operation, selector, ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSearchRulePart {\n");
    
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

