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
import com.mypurecloud.sdk.v2.model.AiScoringSettings;
import com.mypurecloud.sdk.v2.model.DomainEntityListingEvaluationForm;
import com.mypurecloud.sdk.v2.model.EvaluationQuestionGroup;
import com.mypurecloud.sdk.v2.model.EvaluationSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationFormSearchResponse
 */

public class EvaluationFormSearchResponse  implements Serializable {
  
  private String id = null;
  private Date modifiedDate = null;
  private Boolean published = null;
  private String contextId = null;
  private List<EvaluationQuestionGroup> questionGroups = null;

  private static class WeightModeEnumDeserializer extends StdDeserializer<WeightModeEnum> {
    public WeightModeEnumDeserializer() {
      super(WeightModeEnumDeserializer.class);
    }

    @Override
    public WeightModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WeightModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Mode for evaluation form weight
   */
 @JsonDeserialize(using = WeightModeEnumDeserializer.class)
  public enum WeightModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCALED("SCALED"),
    OFF("OFF");

    private String value;

    WeightModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WeightModeEnum fromString(String key) {
      if (key == null) return null;

      for (WeightModeEnum value : WeightModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WeightModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WeightModeEnum weightMode = null;
  private EvaluationSettings evaluationSettings = null;
  private DomainEntityListingEvaluationForm publishedVersions = null;
  private String latestVersionFormName = null;
  private AiScoringSettings aiScoring = null;
  private String dialect = null;
  private String selfUri = null;

  public EvaluationFormSearchResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      questionGroups = new ArrayList<EvaluationQuestionGroup>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationFormSearchResponse modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   **/
  public EvaluationFormSearchResponse published(Boolean published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }
  public void setPublished(Boolean published) {
    this.published = published;
  }


  /**
   **/
  public EvaluationFormSearchResponse contextId(String contextId) {
    this.contextId = contextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }
  public void setContextId(String contextId) {
    this.contextId = contextId;
  }


  /**
   * A list of question groups
   **/
  public EvaluationFormSearchResponse questionGroups(List<EvaluationQuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of question groups")
  @JsonProperty("questionGroups")
  public List<EvaluationQuestionGroup> getQuestionGroups() {
    return questionGroups;
  }
  public void setQuestionGroups(List<EvaluationQuestionGroup> questionGroups) {
    this.questionGroups = questionGroups;
  }


  /**
   * Mode for evaluation form weight
   **/
  public EvaluationFormSearchResponse weightMode(WeightModeEnum weightMode) {
    this.weightMode = weightMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Mode for evaluation form weight")
  @JsonProperty("weightMode")
  public WeightModeEnum getWeightMode() {
    return weightMode;
  }
  public void setWeightMode(WeightModeEnum weightMode) {
    this.weightMode = weightMode;
  }


  /**
   * Settings for evaluations associated with this form
   **/
  public EvaluationFormSearchResponse evaluationSettings(EvaluationSettings evaluationSettings) {
    this.evaluationSettings = evaluationSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings for evaluations associated with this form")
  @JsonProperty("evaluationSettings")
  public EvaluationSettings getEvaluationSettings() {
    return evaluationSettings;
  }
  public void setEvaluationSettings(EvaluationSettings evaluationSettings) {
    this.evaluationSettings = evaluationSettings;
  }


  /**
   * A list of the published versions of this form. Not populated by default, its availability depends on the endpoint. Use the 'expand=publishHistory' query parameter to retrieve this data where applicable (refer to the endpoint description to see if it is applicable).
   **/
  public EvaluationFormSearchResponse publishedVersions(DomainEntityListingEvaluationForm publishedVersions) {
    this.publishedVersions = publishedVersions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of the published versions of this form. Not populated by default, its availability depends on the endpoint. Use the 'expand=publishHistory' query parameter to retrieve this data where applicable (refer to the endpoint description to see if it is applicable).")
  @JsonProperty("publishedVersions")
  public DomainEntityListingEvaluationForm getPublishedVersions() {
    return publishedVersions;
  }
  public void setPublishedVersions(DomainEntityListingEvaluationForm publishedVersions) {
    this.publishedVersions = publishedVersions;
  }


  /**
   * The name of the form's most recently published version
   **/
  public EvaluationFormSearchResponse latestVersionFormName(String latestVersionFormName) {
    this.latestVersionFormName = latestVersionFormName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the form's most recently published version")
  @JsonProperty("latestVersionFormName")
  public String getLatestVersionFormName() {
    return latestVersionFormName;
  }
  public void setLatestVersionFormName(String latestVersionFormName) {
    this.latestVersionFormName = latestVersionFormName;
  }


  @ApiModelProperty(example = "null", value = "AI scoring settings for the evaluation form.")
  @JsonProperty("aiScoring")
  public AiScoringSettings getAiScoring() {
    return aiScoring;
  }


  /**
   * The language dialect for this evaluation form. Supported dialects: ar, cs, da, de, en-US, es, fi, fr, fr-CA, he, hi, it, ja, ko, nl, no, pl, pt-BR, pt-PT, ru, sv, th, tr, uk, zh-CN, zh-TW
   **/
  public EvaluationFormSearchResponse dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language dialect for this evaluation form. Supported dialects: ar, cs, da, de, en-US, es, fi, fr, fr-CA, he, hi, it, ja, ko, nl, no, pl, pt-BR, pt-PT, ru, sv, th, tr, uk, zh-CN, zh-TW")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
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
    EvaluationFormSearchResponse evaluationFormSearchResponse = (EvaluationFormSearchResponse) o;

    return Objects.equals(this.id, evaluationFormSearchResponse.id) &&
            Objects.equals(this.modifiedDate, evaluationFormSearchResponse.modifiedDate) &&
            Objects.equals(this.published, evaluationFormSearchResponse.published) &&
            Objects.equals(this.contextId, evaluationFormSearchResponse.contextId) &&
            Objects.equals(this.questionGroups, evaluationFormSearchResponse.questionGroups) &&
            Objects.equals(this.weightMode, evaluationFormSearchResponse.weightMode) &&
            Objects.equals(this.evaluationSettings, evaluationFormSearchResponse.evaluationSettings) &&
            Objects.equals(this.publishedVersions, evaluationFormSearchResponse.publishedVersions) &&
            Objects.equals(this.latestVersionFormName, evaluationFormSearchResponse.latestVersionFormName) &&
            Objects.equals(this.aiScoring, evaluationFormSearchResponse.aiScoring) &&
            Objects.equals(this.dialect, evaluationFormSearchResponse.dialect) &&
            Objects.equals(this.selfUri, evaluationFormSearchResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, modifiedDate, published, contextId, questionGroups, weightMode, evaluationSettings, publishedVersions, latestVersionFormName, aiScoring, dialect, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationFormSearchResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    questionGroups: ").append(toIndentedString(questionGroups)).append("\n");
    sb.append("    weightMode: ").append(toIndentedString(weightMode)).append("\n");
    sb.append("    evaluationSettings: ").append(toIndentedString(evaluationSettings)).append("\n");
    sb.append("    publishedVersions: ").append(toIndentedString(publishedVersions)).append("\n");
    sb.append("    latestVersionFormName: ").append(toIndentedString(latestVersionFormName)).append("\n");
    sb.append("    aiScoring: ").append(toIndentedString(aiScoring)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
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

