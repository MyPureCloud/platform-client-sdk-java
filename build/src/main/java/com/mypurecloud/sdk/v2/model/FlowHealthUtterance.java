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
import com.mypurecloud.sdk.v2.model.ConfusionDetails;
import com.mypurecloud.sdk.v2.model.OutlierInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * FlowHealthUtterance
 */

public class FlowHealthUtterance  implements Serializable {
  
  private String id = null;
  private String text = null;
  private Long issueCount = null;

  private static class LanguageEnumDeserializer extends StdDeserializer<LanguageEnum> {
    public LanguageEnumDeserializer() {
      super(LanguageEnumDeserializer.class);
    }

    @Override
    public LanguageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LanguageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Language provided for this utterance's health.
   */
 @JsonDeserialize(using = LanguageEnumDeserializer.class)
  public enum LanguageEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EN_US("en-us"),
    EN_GB("en-gb"),
    EN_AU("en-au"),
    EN_ZA("en-za"),
    EN_NZ("en-nz"),
    EN_IE("en-ie"),
    FR_CA("fr-ca"),
    FR_FR("fr-fr"),
    ES_US("es-us"),
    ES_ES("es-es"),
    ES_MX("es-mx"),
    DE_DE("de-de"),
    IT_IT("it-it"),
    PT_BR("pt-br"),
    PT_PT("pt-pt"),
    NL_NL("nl-nl");

    private String value;

    LanguageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LanguageEnum fromString(String key) {
      if (key == null) return null;

      for (LanguageEnum value : LanguageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LanguageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LanguageEnum language = null;

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
  private ConfusionDetails confusionInfo = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Utterance Text.
   **/
  public FlowHealthUtterance text(String text) {
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
  public FlowHealthUtterance issueCount(Long issueCount) {
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
   * Language provided for this utterance's health.
   **/
  public FlowHealthUtterance language(LanguageEnum language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language provided for this utterance's health.")
  @JsonProperty("language")
  public LanguageEnum getLanguage() {
    return language;
  }
  public void setLanguage(LanguageEnum language) {
    this.language = language;
  }


  /**
   * Validation results for the utterance.
   **/
  public FlowHealthUtterance staticValidationResults(List<StaticValidationResultsEnum> staticValidationResults) {
    this.staticValidationResults = staticValidationResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Validation results for the utterance.")
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
  public FlowHealthUtterance outlierInfo(OutlierInfo outlierInfo) {
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
  public FlowHealthUtterance confusionInfo(ConfusionDetails confusionInfo) {
    this.confusionInfo = confusionInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Confusion details with other utterances.")
  @JsonProperty("confusionInfo")
  public ConfusionDetails getConfusionInfo() {
    return confusionInfo;
  }
  public void setConfusionInfo(ConfusionDetails confusionInfo) {
    this.confusionInfo = confusionInfo;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowHealthUtterance flowHealthUtterance = (FlowHealthUtterance) o;

    return Objects.equals(this.id, flowHealthUtterance.id) &&
            Objects.equals(this.text, flowHealthUtterance.text) &&
            Objects.equals(this.issueCount, flowHealthUtterance.issueCount) &&
            Objects.equals(this.language, flowHealthUtterance.language) &&
            Objects.equals(this.staticValidationResults, flowHealthUtterance.staticValidationResults) &&
            Objects.equals(this.outlierInfo, flowHealthUtterance.outlierInfo) &&
            Objects.equals(this.confusionInfo, flowHealthUtterance.confusionInfo) &&
            Objects.equals(this.selfUri, flowHealthUtterance.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, issueCount, language, staticValidationResults, outlierInfo, confusionInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowHealthUtterance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    issueCount: ").append(toIndentedString(issueCount)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    staticValidationResults: ").append(toIndentedString(staticValidationResults)).append("\n");
    sb.append("    outlierInfo: ").append(toIndentedString(outlierInfo)).append("\n");
    sb.append("    confusionInfo: ").append(toIndentedString(confusionInfo)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

