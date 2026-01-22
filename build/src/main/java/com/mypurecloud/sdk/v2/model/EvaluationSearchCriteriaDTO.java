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
 * EvaluationSearchCriteriaDTO
 */

public class EvaluationSearchCriteriaDTO  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of query Operation to Perform
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EXACT("EXACT"),
    DATE_RANGE("DATE_RANGE"),
    GREATER_THAN("GREATER_THAN"),
    GREATER_THAN_EQUAL_TO("GREATER_THAN_EQUAL_TO"),
    LESS_THAN("LESS_THAN"),
    LESS_THAN_EQUAL_TO("LESS_THAN_EQUAL_TO"),
    RANGE("RANGE"),
    REQUIRED_FIELDS("REQUIRED_FIELDS");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  private static class FieldEnumDeserializer extends StdDeserializer<FieldEnum> {
    public FieldEnumDeserializer() {
      super(FieldEnumDeserializer.class);
    }

    @Override
    public FieldEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FieldEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Field name to search against
   */
 @JsonDeserialize(using = FieldEnumDeserializer.class)
  public enum FieldEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EVALUATIONID("evaluationId"),
    CONVERSATIONID("conversationId"),
    CONTEXTID("contextId"),
    FORMID("formId"),
    EVALUATIONSTATUS("evaluationStatus"),
    QUEUEID("queueId"),
    AGENTTEAMID("agentTeamId"),
    DIVISIONID("divisionId"),
    AGENTID("agentId"),
    EVALUATORID("evaluatorId"),
    ASSIGNEEID("assigneeId"),
    TOTALSCORE("totalScore"),
    TOTALCRITICALSCORE("totalCriticalScore"),
    CONVERSATIONDATE("conversationDate"),
    CREATEDDATE("createdDate"),
    SUBMITTEDDATE("submittedDate"),
    RELEASEDATE("releaseDate"),
    RELEASED("released"),
    MEDIATYPE("mediaType"),
    QUESTIONGROUPID("questionGroupId"),
    QUESTIONGROUPMARKEDNA("questionGroupMarkedNA"),
    QUESTIONGROUPSCORE("questionGroupScore"),
    CRITICALQUESTIONGROUPSCORE("criticalQuestionGroupScore"),
    QUESTIONGROUPSCOREPERCENTAGE("questionGroupScorePercentage"),
    CRITICALQUESTIONGROUPSCOREPERCENTAGE("criticalQuestionGroupScorePercentage"),
    QUESTIONID("questionId"),
    QUESTIONANSWERID("questionAnswerId"),
    QUESTIONSCORE("questionScore"),
    QUESTIONMARKEDNA("questionMarkedNA"),
    FAILEDKILLQUESTION("failedKillQuestion");

    private String value;

    FieldEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FieldEnum fromString(String key) {
      if (key == null) return null;

      for (FieldEnum value : FieldEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FieldEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FieldEnum field = null;
  private String endValue = null;
  private List<String> values = null;
  private String startValue = null;
  private String value = null;

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
   * How to apply this search criteria against other criteria
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AND("AND"),
    NOT("NOT");

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

  public EvaluationSearchCriteriaDTO() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<String>();
    }
  }

  
  /**
   * The type of query Operation to Perform
   **/
  public EvaluationSearchCriteriaDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "EXACT", required = true, value = "The type of query Operation to Perform")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Field name to search against
   **/
  public EvaluationSearchCriteriaDTO field(FieldEnum field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Field name to search against")
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }


  /**
   * The end value of the range. This field is used for range search types. Date values must be in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  public EvaluationSearchCriteriaDTO endValue(String endValue) {
    this.endValue = endValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end value of the range. This field is used for range search types. Date values must be in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  @JsonProperty("endValue")
  public String getEndValue() {
    return endValue;
  }
  public void setEndValue(String endValue) {
    this.endValue = endValue;
  }


  /**
   * A list of values for the search to match against. Only for Type: EXACT
   **/
  public EvaluationSearchCriteriaDTO values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of values for the search to match against. Only for Type: EXACT")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  /**
   * The start value of the range. This field is used for range search types. Date values must be in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.
   **/
  public EvaluationSearchCriteriaDTO startValue(String startValue) {
    this.startValue = startValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start value of the range. This field is used for range search types. Date values must be in the format yyyy-MM-dd'T'HH:mm:ss.SSS'Z'.")
  @JsonProperty("startValue")
  public String getStartValue() {
    return startValue;
  }
  public void setStartValue(String startValue) {
    this.startValue = startValue;
  }


  /**
   * A value for the search to match against
   **/
  public EvaluationSearchCriteriaDTO value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value for the search to match against")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * How to apply this search criteria against other criteria
   **/
  public EvaluationSearchCriteriaDTO operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to apply this search criteria against other criteria")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSearchCriteriaDTO evaluationSearchCriteriaDTO = (EvaluationSearchCriteriaDTO) o;

    return Objects.equals(this.type, evaluationSearchCriteriaDTO.type) &&
            Objects.equals(this.field, evaluationSearchCriteriaDTO.field) &&
            Objects.equals(this.endValue, evaluationSearchCriteriaDTO.endValue) &&
            Objects.equals(this.values, evaluationSearchCriteriaDTO.values) &&
            Objects.equals(this.startValue, evaluationSearchCriteriaDTO.startValue) &&
            Objects.equals(this.value, evaluationSearchCriteriaDTO.value) &&
            Objects.equals(this.operator, evaluationSearchCriteriaDTO.operator);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, field, endValue, values, startValue, value, operator);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSearchCriteriaDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    endValue: ").append(toIndentedString(endValue)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    startValue: ").append(toIndentedString(startValue)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
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

