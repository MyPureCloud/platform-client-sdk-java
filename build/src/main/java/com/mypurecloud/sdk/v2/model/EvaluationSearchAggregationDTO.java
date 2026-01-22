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
import com.mypurecloud.sdk.v2.model.EvaluationSearchSubAggregationDTO;
import com.mypurecloud.sdk.v2.model.QueryApiSearchAggregationRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationSearchAggregationDTO
 */

public class EvaluationSearchAggregationDTO  implements Serializable {
  
  private String name = null;

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
   * The field to aggregate on.ALLOWED FIELDS BY AGGREGATION TYPE:TERM/COUNT: evaluationStatus, aiScoringFailureType, questionAiAnswerFailureType,TERM: formId, formIdReleased, contextId, questionGroupId, questionId, questionAnswerId, released, questionGroupMarkedNA, questionMarkedNA, questionAiScored, questionEaScored,SUM/AVERAGE/STATS/RANGE: totalScore, totalCriticalScore, questionGroupScorePercentage,criticalQuestionGroupScorePercentage, questionScore,SUM: disputeCount, rescoreCount, eaSuggestionCount, eaAcceptedSuggestionCount,aiSuggestionCount, aiAcceptedSuggestionCount,DATE_HISTOGRAM: conversationDate, createdDate, submittedDate, releaseDate
   */
 @JsonDeserialize(using = FieldEnumDeserializer.class)
  public enum FieldEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FORMID("formId"),
    FORMIDRELEASED("formIdReleased"),
    CONTEXTID("contextId"),
    QUESTIONGROUPID("questionGroupId"),
    QUESTIONID("questionId"),
    QUESTIONANSWERID("questionAnswerId"),
    EVALUATIONSTATUS("evaluationStatus"),
    AISCORINGFAILURETYPE("aiScoringFailureType"),
    QUESTIONAIANSWERFAILURETYPE("questionAiAnswerFailureType"),
    RELEASED("released"),
    QUESTIONGROUPMARKEDNA("questionGroupMarkedNA"),
    QUESTIONMARKEDNA("questionMarkedNA"),
    QUESTIONAISCORED("questionAiScored"),
    QUESTIONEASCORED("questionEaScored"),
    TOTALSCORE("totalScore"),
    TOTALCRITICALSCORE("totalCriticalScore"),
    QUESTIONGROUPSCOREPERCENTAGE("questionGroupScorePercentage"),
    CRITICALQUESTIONGROUPSCOREPERCENTAGE("criticalQuestionGroupScorePercentage"),
    QUESTIONGROUPSCORE("questionGroupScore"),
    CRITICALQUESTIONGROUPSCORE("criticalQuestionGroupScore"),
    QUESTIONSCORE("questionScore"),
    DISPUTECOUNT("disputeCount"),
    RESCORECOUNT("rescoreCount"),
    EASUGGESTIONCOUNT("eaSuggestionCount"),
    EAACCEPTEDSUGGESTIONCOUNT("eaAcceptedSuggestionCount"),
    AISUGGESTIONCOUNT("aiSuggestionCount"),
    AIACCEPTEDSUGGESTIONCOUNT("aiAcceptedSuggestionCount"),
    CONVERSATIONDATE("conversationDate"),
    CREATEDDATE("createdDate"),
    SUBMITTEDDATE("submittedDate"),
    RELEASEDATE("releaseDate");

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
   * The Type of Aggregation to Perform
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TERM("TERM"),
    STATS("STATS"),
    SUM("SUM"),
    COUNT("COUNT"),
    AVERAGE("AVERAGE"),
    RANGE("RANGE"),
    DATE_HISTOGRAM("DATE_HISTOGRAM");

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
  private Integer size = null;
  private String calendarInterval = null;
  private String format = null;
  private List<QueryApiSearchAggregationRange> ranges = null;
  private List<EvaluationSearchSubAggregationDTO> subAggregations = null;

  public EvaluationSearchAggregationDTO() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ranges = new ArrayList<QueryApiSearchAggregationRange>();
      subAggregations = new ArrayList<EvaluationSearchSubAggregationDTO>();
    }
  }

  
  /**
   * The name of the aggregation
   **/
  public EvaluationSearchAggregationDTO name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the aggregation")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The field to aggregate on.ALLOWED FIELDS BY AGGREGATION TYPE:TERM/COUNT: evaluationStatus, aiScoringFailureType, questionAiAnswerFailureType,TERM: formId, formIdReleased, contextId, questionGroupId, questionId, questionAnswerId, released, questionGroupMarkedNA, questionMarkedNA, questionAiScored, questionEaScored,SUM/AVERAGE/STATS/RANGE: totalScore, totalCriticalScore, questionGroupScorePercentage,criticalQuestionGroupScorePercentage, questionScore,SUM: disputeCount, rescoreCount, eaSuggestionCount, eaAcceptedSuggestionCount,aiSuggestionCount, aiAcceptedSuggestionCount,DATE_HISTOGRAM: conversationDate, createdDate, submittedDate, releaseDate
   **/
  public EvaluationSearchAggregationDTO field(FieldEnum field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "totalScore", required = true, value = "The field to aggregate on.ALLOWED FIELDS BY AGGREGATION TYPE:TERM/COUNT: evaluationStatus, aiScoringFailureType, questionAiAnswerFailureType,TERM: formId, formIdReleased, contextId, questionGroupId, questionId, questionAnswerId, released, questionGroupMarkedNA, questionMarkedNA, questionAiScored, questionEaScored,SUM/AVERAGE/STATS/RANGE: totalScore, totalCriticalScore, questionGroupScorePercentage,criticalQuestionGroupScorePercentage, questionScore,SUM: disputeCount, rescoreCount, eaSuggestionCount, eaAcceptedSuggestionCount,aiSuggestionCount, aiAcceptedSuggestionCount,DATE_HISTOGRAM: conversationDate, createdDate, submittedDate, releaseDate")
  @JsonProperty("field")
  public FieldEnum getField() {
    return field;
  }
  public void setField(FieldEnum field) {
    this.field = field;
  }


  /**
   * The Type of Aggregation to Perform
   **/
  public EvaluationSearchAggregationDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "AVERAGE", required = true, value = "The Type of Aggregation to Perform")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The size limit for term aggregations, 100 size limit for all fields
   **/
  public EvaluationSearchAggregationDTO size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size limit for term aggregations, 100 size limit for all fields")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }


  /**
   * The calendar interval for date histogram aggregations
   **/
  public EvaluationSearchAggregationDTO calendarInterval(String calendarInterval) {
    this.calendarInterval = calendarInterval;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The calendar interval for date histogram aggregations")
  @JsonProperty("calendarInterval")
  public String getCalendarInterval() {
    return calendarInterval;
  }
  public void setCalendarInterval(String calendarInterval) {
    this.calendarInterval = calendarInterval;
  }


  /**
   * The format for date histogram aggregations
   **/
  public EvaluationSearchAggregationDTO format(String format) {
    this.format = format;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The format for date histogram aggregations")
  @JsonProperty("format")
  public String getFormat() {
    return format;
  }
  public void setFormat(String format) {
    this.format = format;
  }


  /**
   * The ranges for range aggregations
   **/
  public EvaluationSearchAggregationDTO ranges(List<QueryApiSearchAggregationRange> ranges) {
    this.ranges = ranges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ranges for range aggregations")
  @JsonProperty("ranges")
  public List<QueryApiSearchAggregationRange> getRanges() {
    return ranges;
  }
  public void setRanges(List<QueryApiSearchAggregationRange> ranges) {
    this.ranges = ranges;
  }


  /**
   * Sub-aggregations to be computed within this aggregation
   **/
  public EvaluationSearchAggregationDTO subAggregations(List<EvaluationSearchSubAggregationDTO> subAggregations) {
    this.subAggregations = subAggregations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sub-aggregations to be computed within this aggregation")
  @JsonProperty("subAggregations")
  public List<EvaluationSearchSubAggregationDTO> getSubAggregations() {
    return subAggregations;
  }
  public void setSubAggregations(List<EvaluationSearchSubAggregationDTO> subAggregations) {
    this.subAggregations = subAggregations;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSearchAggregationDTO evaluationSearchAggregationDTO = (EvaluationSearchAggregationDTO) o;

    return Objects.equals(this.name, evaluationSearchAggregationDTO.name) &&
            Objects.equals(this.field, evaluationSearchAggregationDTO.field) &&
            Objects.equals(this.type, evaluationSearchAggregationDTO.type) &&
            Objects.equals(this.size, evaluationSearchAggregationDTO.size) &&
            Objects.equals(this.calendarInterval, evaluationSearchAggregationDTO.calendarInterval) &&
            Objects.equals(this.format, evaluationSearchAggregationDTO.format) &&
            Objects.equals(this.ranges, evaluationSearchAggregationDTO.ranges) &&
            Objects.equals(this.subAggregations, evaluationSearchAggregationDTO.subAggregations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, field, type, size, calendarInterval, format, ranges, subAggregations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSearchAggregationDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    calendarInterval: ").append(toIndentedString(calendarInterval)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    subAggregations: ").append(toIndentedString(subAggregations)).append("\n");
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

