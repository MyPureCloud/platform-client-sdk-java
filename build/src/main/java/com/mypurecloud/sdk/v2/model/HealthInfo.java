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
import com.mypurecloud.sdk.v2.model.FlowHealthErrorInfo;
import com.mypurecloud.sdk.v2.model.FlowHealthIntentUtterance;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * HealthInfo
 */

public class HealthInfo  implements Serializable {
  

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of health computation for this intent.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    ERROR("Error");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private FlowHealthErrorInfo errorInfo = null;
  private Float overallScore = null;
  private Long issueCount = null;

  private static class StaticValidationResultsEnumDeserializer extends StdDeserializer<StaticValidationResultsEnum> {
    public StaticValidationResultsEnumDeserializer() {
      super(StaticValidationResultsEnumDeserializer.class);
    }

    @Override
    public StaticValidationResultsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StaticValidationResultsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets staticValidationResults
   */
 @JsonDeserialize(using = StaticValidationResultsEnumDeserializer.class)
  public enum StaticValidationResultsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TOOFEWUTTERANCES("TooFewUtterances"),
    TOOMANYUTTERANCES("TooManyUtterances"),
    UTTERANCETOOSHORT("UtteranceTooShort"),
    UTTERANCETOOLONG("UtteranceTooLong");

    private String value;

    StaticValidationResultsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StaticValidationResultsEnum fromString(String key) {
      if (key == null) return null;

      for (StaticValidationResultsEnum value : StaticValidationResultsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StaticValidationResultsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<StaticValidationResultsEnum> staticValidationResults = null;
  private List<FlowHealthIntentUtterance> utterances = null;

  public HealthInfo() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staticValidationResults = new ArrayList<StaticValidationResultsEnum>();
      utterances = new ArrayList<FlowHealthIntentUtterance>();
    }
  }

  
  /**
   * Status of health computation for this intent.
   **/
  public HealthInfo status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of health computation for this intent.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Error details for the intent, if any.
   **/
  public HealthInfo errorInfo(FlowHealthErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error details for the intent, if any.")
  @JsonProperty("errorInfo")
  public FlowHealthErrorInfo getErrorInfo() {
    return errorInfo;
  }
  public void setErrorInfo(FlowHealthErrorInfo errorInfo) {
    this.errorInfo = errorInfo;
  }


  /**
   * Overall health score for the intent ranged between 0 and 100 as 100 is the perfect health score.
   **/
  public HealthInfo overallScore(Float overallScore) {
    this.overallScore = overallScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overall health score for the intent ranged between 0 and 100 as 100 is the perfect health score.")
  @JsonProperty("overallScore")
  public Float getOverallScore() {
    return overallScore;
  }
  public void setOverallScore(Float overallScore) {
    this.overallScore = overallScore;
  }


  /**
   * Number of issues found in the intent.
   **/
  public HealthInfo issueCount(Long issueCount) {
    this.issueCount = issueCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of issues found in the intent.")
  @JsonProperty("issueCount")
  public Long getIssueCount() {
    return issueCount;
  }
  public void setIssueCount(Long issueCount) {
    this.issueCount = issueCount;
  }


  /**
   * Validation results for the intent.
   **/
  public HealthInfo staticValidationResults(List<StaticValidationResultsEnum> staticValidationResults) {
    this.staticValidationResults = staticValidationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Validation results for the intent.")
  @JsonProperty("staticValidationResults")
  public List<StaticValidationResultsEnum> getStaticValidationResults() {
    return staticValidationResults;
  }
  public void setStaticValidationResults(List<StaticValidationResultsEnum> staticValidationResults) {
    this.staticValidationResults = staticValidationResults;
  }


  /**
   * Utterances for this intent.
   **/
  public HealthInfo utterances(List<FlowHealthIntentUtterance> utterances) {
    this.utterances = utterances;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Utterances for this intent.")
  @JsonProperty("utterances")
  public List<FlowHealthIntentUtterance> getUtterances() {
    return utterances;
  }
  public void setUtterances(List<FlowHealthIntentUtterance> utterances) {
    this.utterances = utterances;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthInfo healthInfo = (HealthInfo) o;

    return Objects.equals(this.status, healthInfo.status) &&
            Objects.equals(this.errorInfo, healthInfo.errorInfo) &&
            Objects.equals(this.overallScore, healthInfo.overallScore) &&
            Objects.equals(this.issueCount, healthInfo.issueCount) &&
            Objects.equals(this.staticValidationResults, healthInfo.staticValidationResults) &&
            Objects.equals(this.utterances, healthInfo.utterances);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, errorInfo, overallScore, issueCount, staticValidationResults, utterances);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthInfo {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
    sb.append("    overallScore: ").append(toIndentedString(overallScore)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    staticValidationResults: ").append(toIndentedString(staticValidationResults)).append("\n");
    sb.append("    utterances: ").append(toIndentedString(utterances)).append("\n");
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

