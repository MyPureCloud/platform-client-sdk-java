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
import com.mypurecloud.sdk.v2.model.AssistanceCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnswerOption
 */

public class AnswerOption  implements Serializable {
  
  private String id = null;
  private String contextId = null;

  private static class BuiltInTypeEnumDeserializer extends StdDeserializer<BuiltInTypeEnum> {
    public BuiltInTypeEnumDeserializer() {
      super(BuiltInTypeEnumDeserializer.class);
    }

    @Override
    public BuiltInTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return BuiltInTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The built-in type of this answer option. Only used for built-in answer options such as selection states for Multiple Select answer options. Possible values include: Selected, Unselected
   */
 @JsonDeserialize(using = BuiltInTypeEnumDeserializer.class)
  public enum BuiltInTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SELECTED("Selected"),
    UNSELECTED("Unselected");

    private String value;

    BuiltInTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static BuiltInTypeEnum fromString(String key) {
      if (key == null) return null;

      for (BuiltInTypeEnum value : BuiltInTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return BuiltInTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private BuiltInTypeEnum builtInType = null;
  private String text = null;
  private Integer value = null;
  private List<AssistanceCondition> assistanceConditions = null;

  public AnswerOption() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      assistanceConditions = new ArrayList<AssistanceCondition>();
    }
  }

  
  /**
   **/
  public AnswerOption id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @ApiModelProperty(example = "null", value = "An identifier for this answer that stays the same across versions of the form.")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }


  /**
   * The built-in type of this answer option. Only used for built-in answer options such as selection states for Multiple Select answer options. Possible values include: Selected, Unselected
   **/
  public AnswerOption builtInType(BuiltInTypeEnum builtInType) {
    this.builtInType = builtInType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The built-in type of this answer option. Only used for built-in answer options such as selection states for Multiple Select answer options. Possible values include: Selected, Unselected")
  @JsonProperty("builtInType")
  public BuiltInTypeEnum getBuiltInType() {
    return builtInType;
  }
  public void setBuiltInType(BuiltInTypeEnum builtInType) {
    this.builtInType = builtInType;
  }


  /**
   **/
  public AnswerOption text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   **/
  public AnswerOption value(Integer value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  /**
   * List of assistance conditions which are combined together with a logical AND operator. Eg ( assistanceCondtion1 && assistanceCondition2 ) wherein assistanceCondition could be ( EXISTS topic1 || topic2 || ... ) or (NOTEXISTS topic3 || topic4 || ...).
   **/
  public AnswerOption assistanceConditions(List<AssistanceCondition> assistanceConditions) {
    this.assistanceConditions = assistanceConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of assistance conditions which are combined together with a logical AND operator. Eg ( assistanceCondtion1 && assistanceCondition2 ) wherein assistanceCondition could be ( EXISTS topic1 || topic2 || ... ) or (NOTEXISTS topic3 || topic4 || ...).")
  @JsonProperty("assistanceConditions")
  public List<AssistanceCondition> getAssistanceConditions() {
    return assistanceConditions;
  }
  public void setAssistanceConditions(List<AssistanceCondition> assistanceConditions) {
    this.assistanceConditions = assistanceConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnswerOption answerOption = (AnswerOption) o;

    return Objects.equals(this.id, answerOption.id) &&
            Objects.equals(this.contextId, answerOption.contextId) &&
            Objects.equals(this.builtInType, answerOption.builtInType) &&
            Objects.equals(this.text, answerOption.text) &&
            Objects.equals(this.value, answerOption.value) &&
            Objects.equals(this.assistanceConditions, answerOption.assistanceConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, contextId, builtInType, text, value, assistanceConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnswerOption {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    builtInType: ").append(toIndentedString(builtInType)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    assistanceConditions: ").append(toIndentedString(assistanceConditions)).append("\n");
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

