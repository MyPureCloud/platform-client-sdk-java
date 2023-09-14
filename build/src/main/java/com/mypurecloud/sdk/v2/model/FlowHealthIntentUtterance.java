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
import com.mypurecloud.sdk.v2.model.ConfusionInfo;
import com.mypurecloud.sdk.v2.model.OutlierInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowHealthIntentUtterance
 */

public class FlowHealthIntentUtterance  implements Serializable {
  
  private String id = null;
  private String text = null;
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
  private List<StaticValidationResultsEnum> staticValidationResults = new ArrayList<StaticValidationResultsEnum>();
  private OutlierInfo outlierInfo = null;
  private ConfusionInfo confusionInfo = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Utterance Text.
   **/
  public FlowHealthIntentUtterance text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Utterance Text.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }


  /**
   * Number of issues found for this utterance.
   **/
  public FlowHealthIntentUtterance issueCount(Long issueCount) {
    this.issueCount = issueCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of issues found for this utterance.")
  @JsonProperty("issueCount")
  public Long getIssueCount() {
    return issueCount;
  }
  public void setIssueCount(Long issueCount) {
    this.issueCount = issueCount;
  }


  /**
   * Validation results for this utterance.
   **/
  public FlowHealthIntentUtterance staticValidationResults(List<StaticValidationResultsEnum> staticValidationResults) {
    this.staticValidationResults = staticValidationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Validation results for this utterance.")
  @JsonProperty("staticValidationResults")
  public List<StaticValidationResultsEnum> getStaticValidationResults() {
    return staticValidationResults;
  }
  public void setStaticValidationResults(List<StaticValidationResultsEnum> staticValidationResults) {
    this.staticValidationResults = staticValidationResults;
  }


  /**
   * Details about this utterance being an outlier or not.
   **/
  public FlowHealthIntentUtterance outlierInfo(OutlierInfo outlierInfo) {
    this.outlierInfo = outlierInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about this utterance being an outlier or not.")
  @JsonProperty("outlierInfo")
  public OutlierInfo getOutlierInfo() {
    return outlierInfo;
  }
  public void setOutlierInfo(OutlierInfo outlierInfo) {
    this.outlierInfo = outlierInfo;
  }


  /**
   * Confusion details with other utterances.
   **/
  public FlowHealthIntentUtterance confusionInfo(ConfusionInfo confusionInfo) {
    this.confusionInfo = confusionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Confusion details with other utterances.")
  @JsonProperty("confusionInfo")
  public ConfusionInfo getConfusionInfo() {
    return confusionInfo;
  }
  public void setConfusionInfo(ConfusionInfo confusionInfo) {
    this.confusionInfo = confusionInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHealthIntentUtterance flowHealthIntentUtterance = (FlowHealthIntentUtterance) o;

    return Objects.equals(this.id, flowHealthIntentUtterance.id) &&
            Objects.equals(this.text, flowHealthIntentUtterance.text) &&
            Objects.equals(this.issueCount, flowHealthIntentUtterance.issueCount) &&
            Objects.equals(this.staticValidationResults, flowHealthIntentUtterance.staticValidationResults) &&
            Objects.equals(this.outlierInfo, flowHealthIntentUtterance.outlierInfo) &&
            Objects.equals(this.confusionInfo, flowHealthIntentUtterance.confusionInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, issueCount, staticValidationResults, outlierInfo, confusionInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHealthIntentUtterance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    staticValidationResults: ").append(toIndentedString(staticValidationResults)).append("\n");
    sb.append("    outlierInfo: ").append(toIndentedString(outlierInfo)).append("\n");
    sb.append("    confusionInfo: ").append(toIndentedString(confusionInfo)).append("\n");
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

