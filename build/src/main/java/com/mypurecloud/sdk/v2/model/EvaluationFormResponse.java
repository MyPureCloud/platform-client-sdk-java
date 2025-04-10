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
 * EvaluationFormResponse
 */

public class EvaluationFormResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
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
  private AiScoringSettings aiScoring = null;
  private String selfUri = null;

  public EvaluationFormResponse() {
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
   * The evaluation form name
   **/
  public EvaluationFormResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The evaluation form name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EvaluationFormResponse modifiedDate(Date modifiedDate) {
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
  public EvaluationFormResponse published(Boolean published) {
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
  public EvaluationFormResponse contextId(String contextId) {
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
  public EvaluationFormResponse questionGroups(List<EvaluationQuestionGroup> questionGroups) {
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
  public EvaluationFormResponse weightMode(WeightModeEnum weightMode) {
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
  public EvaluationFormResponse evaluationSettings(EvaluationSettings evaluationSettings) {
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
  public EvaluationFormResponse publishedVersions(DomainEntityListingEvaluationForm publishedVersions) {
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


  @ApiModelProperty(example = "null", value = "AI scoring settings for the evaluation form.")
  @JsonProperty("aiScoring")
  public AiScoringSettings getAiScoring() {
    return aiScoring;
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
    EvaluationFormResponse evaluationFormResponse = (EvaluationFormResponse) o;

    return Objects.equals(this.id, evaluationFormResponse.id) &&
            Objects.equals(this.name, evaluationFormResponse.name) &&
            Objects.equals(this.modifiedDate, evaluationFormResponse.modifiedDate) &&
            Objects.equals(this.published, evaluationFormResponse.published) &&
            Objects.equals(this.contextId, evaluationFormResponse.contextId) &&
            Objects.equals(this.questionGroups, evaluationFormResponse.questionGroups) &&
            Objects.equals(this.weightMode, evaluationFormResponse.weightMode) &&
            Objects.equals(this.evaluationSettings, evaluationFormResponse.evaluationSettings) &&
            Objects.equals(this.publishedVersions, evaluationFormResponse.publishedVersions) &&
            Objects.equals(this.aiScoring, evaluationFormResponse.aiScoring) &&
            Objects.equals(this.selfUri, evaluationFormResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, modifiedDate, published, contextId, questionGroups, weightMode, evaluationSettings, publishedVersions, aiScoring, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationFormResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    questionGroups: ").append(toIndentedString(questionGroups)).append("\n");
    sb.append("    weightMode: ").append(toIndentedString(weightMode)).append("\n");
    sb.append("    evaluationSettings: ").append(toIndentedString(evaluationSettings)).append("\n");
    sb.append("    publishedVersions: ").append(toIndentedString(publishedVersions)).append("\n");
    sb.append("    aiScoring: ").append(toIndentedString(aiScoring)).append("\n");
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

