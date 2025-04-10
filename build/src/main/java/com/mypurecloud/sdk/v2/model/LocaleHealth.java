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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LocaleHealth
 */

public class LocaleHealth  implements Serializable {
  
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

  public LocaleHealth() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      staticValidationResults = new ArrayList<StaticValidationResultsEnum>();
    }
  }

  
  /**
   * Overall health score for the intent.
   **/
  public LocaleHealth overallScore(Float overallScore) {
    this.overallScore = overallScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overall health score for the intent.")
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
  public LocaleHealth issueCount(Long issueCount) {
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
  public LocaleHealth staticValidationResults(List<StaticValidationResultsEnum> staticValidationResults) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocaleHealth localeHealth = (LocaleHealth) o;

    return Objects.equals(this.overallScore, localeHealth.overallScore) &&
            Objects.equals(this.issueCount, localeHealth.issueCount) &&
            Objects.equals(this.staticValidationResults, localeHealth.staticValidationResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overallScore, issueCount, staticValidationResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocaleHealth {\n");
    
    sb.append("    overallScore: ").append(toIndentedString(overallScore)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    staticValidationResults: ").append(toIndentedString(staticValidationResults)).append("\n");
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

