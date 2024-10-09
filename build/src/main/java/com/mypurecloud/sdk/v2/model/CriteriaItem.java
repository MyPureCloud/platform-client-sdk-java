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
 * A singular criteria used to query executionData.
 */
@ApiModel(description = "A singular criteria used to query executionData.")

public class CriteriaItem  implements Serializable {
  

  private static class KeyEnumDeserializer extends StdDeserializer<KeyEnum> {
    public KeyEnumDeserializer() {
      super(KeyEnumDeserializer.class);
    }

    @Override
    public KeyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KeyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The id of the criteria to be checked.
   */
 @JsonDeserialize(using = KeyEnumDeserializer.class)
  public enum KeyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FLOWSTARTDATETIME("FlowStartDateTime"),
    FLOWENDDATETIME("FlowEndDateTime"),
    CONVERSATIONID("ConversationId"),
    WORKITEMID("WorkitemId"),
    FLOWTYPE("FlowType"),
    FLOWID("FlowId"),
    FLOWERRORREASON("FlowErrorReason"),
    FLOWWARNINGREASON("FlowWarningReason"),
    FLOWALTERNATEEXECUTIONID("FlowAlternateExecutionId"),
    FLOWOBJECTEXECUTIONID("FlowObjectExecutionId"),
    FLOWACTIONID("FlowActionId"),
    FLOWACTIONTYPE("FlowActionType"),
    FLOWACTIONOUTPUTPATHID("FlowActionOutputPathId"),
    FLOWACTIONOUTPUTPATHNAME("FlowActionOutputPathName"),
    FLOWACTIONIDOUTPUTPATHID("FlowActionIdOutputPathId"),
    FLOWACTIONIDOUTPUTPATHNAME("FlowActionIdOutputPathName"),
    FLOWACTIONTYPEOUTPUTPATHID("FlowActionTypeOutputPathId"),
    FLOWACTIONTYPEOUTPUTPATHNAME("FlowActionTypeOutputPathName"),
    BOTID("BotId"),
    BOTERRORREASON("BotErrorReason"),
    BOTFLOWEXECUTIONID("BotFlowExecutionId"),
    BOTOBJECTEXECUTIONID("BotObjectExecutionId");

    private String value;

    KeyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KeyEnum fromString(String key) {
      if (key == null) return null;

      for (KeyEnum value : KeyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KeyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KeyEnum key = null;

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator used to check on the criteria id.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQ("eq"),
    GT("gt"),
    GTE("gte"),
    LT("lt"),
    LTE("lte"),
    NOT("not"),
    BEGINS("begins"),
    NOT_NULL("not_null");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;

  
  /**
   * The id of the criteria to be checked.
   **/
  public CriteriaItem key(KeyEnum key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the criteria to be checked.")
  @JsonProperty("key")
  public KeyEnum getKey() {
    return key;
  }
  public void setKey(KeyEnum key) {
    this.key = key;
  }


  /**
   * The operator used to check on the criteria id.
   **/
  public CriteriaItem operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator used to check on the criteria id.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The target value used to query on.
   **/
  public CriteriaItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target value used to query on.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriteriaItem criteriaItem = (CriteriaItem) o;

    return Objects.equals(this.key, criteriaItem.key) &&
            Objects.equals(this.operator, criteriaItem.operator) &&
            Objects.equals(this.value, criteriaItem.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriteriaItem {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

