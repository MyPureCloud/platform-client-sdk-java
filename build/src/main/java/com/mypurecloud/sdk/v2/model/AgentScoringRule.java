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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * AgentScoringRule
 */

public class AgentScoringRule  implements Serializable {
  
  private String id = null;
  private String programId = null;

  private static class SamplingTypeEnumDeserializer extends StdDeserializer<SamplingTypeEnum> {
    public SamplingTypeEnumDeserializer() {
      super(SamplingTypeEnumDeserializer.class);
    }

    @Override
    public SamplingTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SamplingTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Sampling type setting. Valid values: All, Percentage
   */
 @JsonDeserialize(using = SamplingTypeEnumDeserializer.class)
  public enum SamplingTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALL("All"),
    PERCENTAGE("Percentage");

    private String value;

    SamplingTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SamplingTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SamplingTypeEnum value : SamplingTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SamplingTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SamplingTypeEnum samplingType = null;
  private BigDecimal samplingPercentage = null;

  private static class SubmissionTypeEnumDeserializer extends StdDeserializer<SubmissionTypeEnum> {
    public SubmissionTypeEnumDeserializer() {
      super(SubmissionTypeEnumDeserializer.class);
    }

    @Override
    public SubmissionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubmissionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Submission type for evaluations. Valid values: Automated, Manual
   */
 @JsonDeserialize(using = SubmissionTypeEnumDeserializer.class)
  public enum SubmissionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AUTOMATED("Automated"),
    MANUAL("Manual");

    private String value;

    SubmissionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubmissionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubmissionTypeEnum value : SubmissionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubmissionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubmissionTypeEnum submissionType = null;
  private String evaluationFormContextId = null;
  private Boolean enabled = null;
  private Boolean published = null;
  private AddressableEntityRef evaluator = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  public AgentScoringRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The program ID that this rule belongs to. When provided in request body, this value is ignored in favor of the path parameter.")
  @JsonProperty("programId")
  public String getProgramId() {
    return programId;
  }


  /**
   * Sampling type setting. Valid values: All, Percentage
   **/
  public AgentScoringRule samplingType(SamplingTypeEnum samplingType) {
    this.samplingType = samplingType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sampling type setting. Valid values: All, Percentage")
  @JsonProperty("samplingType")
  public SamplingTypeEnum getSamplingType() {
    return samplingType;
  }
  public void setSamplingType(SamplingTypeEnum samplingType) {
    this.samplingType = samplingType;
  }


  /**
   * Percentage of interactions to evaluate (0.01-100.00). Required when samplingType is Percentage, null when All.
   * minimum: 0.01
   * maximum: 1E+2
   **/
  public AgentScoringRule samplingPercentage(BigDecimal samplingPercentage) {
    this.samplingPercentage = samplingPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Percentage of interactions to evaluate (0.01-100.00). Required when samplingType is Percentage, null when All.")
  @JsonProperty("samplingPercentage")
  public BigDecimal getSamplingPercentage() {
    return samplingPercentage;
  }
  public void setSamplingPercentage(BigDecimal samplingPercentage) {
    this.samplingPercentage = samplingPercentage;
  }


  /**
   * Submission type for evaluations. Valid values: Automated, Manual
   **/
  public AgentScoringRule submissionType(SubmissionTypeEnum submissionType) {
    this.submissionType = submissionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Submission type for evaluations. Valid values: Automated, Manual")
  @JsonProperty("submissionType")
  public SubmissionTypeEnum getSubmissionType() {
    return submissionType;
  }
  public void setSubmissionType(SubmissionTypeEnum submissionType) {
    this.submissionType = submissionType;
  }


  /**
   * The evaluation form contextID to use for scoring.
   **/
  public AgentScoringRule evaluationFormContextId(String evaluationFormContextId) {
    this.evaluationFormContextId = evaluationFormContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The evaluation form contextID to use for scoring.")
  @JsonProperty("evaluationFormContextId")
  public String getEvaluationFormContextId() {
    return evaluationFormContextId;
  }
  public void setEvaluationFormContextId(String evaluationFormContextId) {
    this.evaluationFormContextId = evaluationFormContextId;
  }


  /**
   * Whether the rule is enabled.
   **/
  public AgentScoringRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the rule is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  @ApiModelProperty(example = "null", value = "Whether the rule is published.")
  @JsonProperty("published")
  public Boolean getPublished() {
    return published;
  }


  /**
   * The evaluator for evaluations created by this rule.
   **/
  public AgentScoringRule evaluator(AddressableEntityRef evaluator) {
    this.evaluator = evaluator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The evaluator for evaluations created by this rule.")
  @JsonProperty("evaluator")
  public AddressableEntityRef getEvaluator() {
    return evaluator;
  }
  public void setEvaluator(AddressableEntityRef evaluator) {
    this.evaluator = evaluator;
  }


  @ApiModelProperty(example = "null", value = "Date when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when the rule was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    AgentScoringRule agentScoringRule = (AgentScoringRule) o;

    return Objects.equals(this.id, agentScoringRule.id) &&
            Objects.equals(this.programId, agentScoringRule.programId) &&
            Objects.equals(this.samplingType, agentScoringRule.samplingType) &&
            Objects.equals(this.samplingPercentage, agentScoringRule.samplingPercentage) &&
            Objects.equals(this.submissionType, agentScoringRule.submissionType) &&
            Objects.equals(this.evaluationFormContextId, agentScoringRule.evaluationFormContextId) &&
            Objects.equals(this.enabled, agentScoringRule.enabled) &&
            Objects.equals(this.published, agentScoringRule.published) &&
            Objects.equals(this.evaluator, agentScoringRule.evaluator) &&
            Objects.equals(this.dateCreated, agentScoringRule.dateCreated) &&
            Objects.equals(this.dateModified, agentScoringRule.dateModified) &&
            Objects.equals(this.selfUri, agentScoringRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, programId, samplingType, samplingPercentage, submissionType, evaluationFormContextId, enabled, published, evaluator, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentScoringRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    programId: ").append(toIndentedString(programId)).append("\n");
    sb.append("    samplingType: ").append(toIndentedString(samplingType)).append("\n");
    sb.append("    samplingPercentage: ").append(toIndentedString(samplingPercentage)).append("\n");
    sb.append("    submissionType: ").append(toIndentedString(submissionType)).append("\n");
    sb.append("    evaluationFormContextId: ").append(toIndentedString(evaluationFormContextId)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    evaluator: ").append(toIndentedString(evaluator)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

