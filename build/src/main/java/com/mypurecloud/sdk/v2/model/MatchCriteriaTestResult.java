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
import com.fasterxml.jackson.databind.JsonNode;
import com.mypurecloud.sdk.v2.model.MatchTestResult;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Results of a matching expression
 */
@ApiModel(description = "Results of a matching expression")

public class MatchCriteriaTestResult  implements Serializable {
  
  private String jsonPath = null;

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
   * The type of operation to perform for matching check
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GREATERTHANOREQUAL("GreaterThanOrEqual"),
    LESSTHANOREQUAL("LessThanOrEqual"),
    EQUAL("Equal"),
    NOTEQUAL("NotEqual"),
    LESSTHAN("LessThan"),
    GREATERTHAN("GreaterThan"),
    NOTIN("NotIn"),
    IN("In"),
    CONTAINS("Contains"),
    ALL("All"),
    EXISTS("Exists"),
    SIZE("Size");

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
  private JsonNode value = null;
  private List<JsonNode> values = null;
  private String generatedJsonPathCondition = null;
  private Boolean match = null;
  private List<MatchTestResult> jsonPathExtraction = null;

  
  /**
   * The Goessner json path of the field to match
   **/
  public MatchCriteriaTestResult jsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Goessner json path of the field to match")
  @JsonProperty("jsonPath")
  public String getJsonPath() {
    return jsonPath;
  }
  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }


  /**
   * The type of operation to perform for matching check
   **/
  public MatchCriteriaTestResult operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of operation to perform for matching check")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The value to match on. Only one of value and values can be included
   **/
  public MatchCriteriaTestResult value(JsonNode value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value to match on. Only one of value and values can be included")
  @JsonProperty("value")
  public JsonNode getValue() {
    return value;
  }
  public void setValue(JsonNode value) {
    this.value = value;
  }


  /**
   * The list of values to match on. Only one of value and values can be included
   **/
  public MatchCriteriaTestResult values(List<JsonNode> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of values to match on. Only one of value and values can be included")
  @JsonProperty("values")
  public List<JsonNode> getValues() {
    return values;
  }
  public void setValues(List<JsonNode> values) {
    this.values = values;
  }


  /**
   * The generated json path condition
   **/
  public MatchCriteriaTestResult generatedJsonPathCondition(String generatedJsonPathCondition) {
    this.generatedJsonPathCondition = generatedJsonPathCondition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The generated json path condition")
  @JsonProperty("generatedJsonPathCondition")
  public String getGeneratedJsonPathCondition() {
    return generatedJsonPathCondition;
  }
  public void setGeneratedJsonPathCondition(String generatedJsonPathCondition) {
    this.generatedJsonPathCondition = generatedJsonPathCondition;
  }


  /**
   * Did the generated json path condition match
   **/
  public MatchCriteriaTestResult match(Boolean match) {
    this.match = match;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Did the generated json path condition match")
  @JsonProperty("match")
  public Boolean getMatch() {
    return match;
  }
  public void setMatch(Boolean match) {
    this.match = match;
  }


  /**
   * The json paths and their values that were compared
   **/
  public MatchCriteriaTestResult jsonPathExtraction(List<MatchTestResult> jsonPathExtraction) {
    this.jsonPathExtraction = jsonPathExtraction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The json paths and their values that were compared")
  @JsonProperty("jsonPathExtraction")
  public List<MatchTestResult> getJsonPathExtraction() {
    return jsonPathExtraction;
  }
  public void setJsonPathExtraction(List<MatchTestResult> jsonPathExtraction) {
    this.jsonPathExtraction = jsonPathExtraction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MatchCriteriaTestResult matchCriteriaTestResult = (MatchCriteriaTestResult) o;

    return Objects.equals(this.jsonPath, matchCriteriaTestResult.jsonPath) &&
            Objects.equals(this.operator, matchCriteriaTestResult.operator) &&
            Objects.equals(this.value, matchCriteriaTestResult.value) &&
            Objects.equals(this.values, matchCriteriaTestResult.values) &&
            Objects.equals(this.generatedJsonPathCondition, matchCriteriaTestResult.generatedJsonPathCondition) &&
            Objects.equals(this.match, matchCriteriaTestResult.match) &&
            Objects.equals(this.jsonPathExtraction, matchCriteriaTestResult.jsonPathExtraction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jsonPath, operator, value, values, generatedJsonPathCondition, match, jsonPathExtraction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchCriteriaTestResult {\n");
    
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    generatedJsonPathCondition: ").append(toIndentedString(generatedJsonPathCondition)).append("\n");
    sb.append("    match: ").append(toIndentedString(match)).append("\n");
    sb.append("    jsonPathExtraction: ").append(toIndentedString(jsonPathExtraction)).append("\n");
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

