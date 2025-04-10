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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CopilotCondition
 */

public class CopilotCondition  implements Serializable {
  

  private static class ConditionTypeEnumDeserializer extends StdDeserializer<ConditionTypeEnum> {
    public ConditionTypeEnumDeserializer() {
      super(ConditionTypeEnumDeserializer.class);
    }

    @Override
    public ConditionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ConditionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of condition.
   */
 @JsonDeserialize(using = ConditionTypeEnumDeserializer.class)
  public enum ConditionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTENT("Intent"),
    CONVERSATIONSTART("ConversationStart"),
    CONVERSATIONTRANSFER("ConversationTransfer"),
    CONVERSATIONEND("ConversationEnd");

    private String value;

    ConditionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ConditionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ConditionTypeEnum value : ConditionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ConditionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ConditionTypeEnum conditionType = null;
  private List<String> conditionValues = null;

  public CopilotCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditionValues = new ArrayList<String>();
    }
  }

  
  /**
   * Type of condition.
   **/
  public CopilotCondition conditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of condition.")
  @JsonProperty("conditionType")
  public ConditionTypeEnum getConditionType() {
    return conditionType;
  }
  public void setConditionType(ConditionTypeEnum conditionType) {
    this.conditionType = conditionType;
  }


  /**
   * Condition values.
   **/
  public CopilotCondition conditionValues(List<String> conditionValues) {
    this.conditionValues = conditionValues;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Condition values.")
  @JsonProperty("conditionValues")
  public List<String> getConditionValues() {
    return conditionValues;
  }
  public void setConditionValues(List<String> conditionValues) {
    this.conditionValues = conditionValues;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CopilotCondition copilotCondition = (CopilotCondition) o;

    return Objects.equals(this.conditionType, copilotCondition.conditionType) &&
            Objects.equals(this.conditionValues, copilotCondition.conditionValues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditionType, conditionValues);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CopilotCondition {\n");
    
    sb.append("    conditionType: ").append(toIndentedString(conditionType)).append("\n");
    sb.append("    conditionValues: ").append(toIndentedString(conditionValues)).append("\n");
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

