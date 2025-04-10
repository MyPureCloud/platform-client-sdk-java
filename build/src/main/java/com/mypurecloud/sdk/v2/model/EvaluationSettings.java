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
import com.mypurecloud.sdk.v2.model.EvaluationSettingsAssignee;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EvaluationSettings
 */

public class EvaluationSettings  implements Serializable {
  
  private Boolean revisionsEnabled = null;
  private Boolean disputesEnabled = null;
  private Integer disputesAllowedPerEvaluation = null;
  private List<EvaluationSettingsAssignee> disputesAssignees = null;

  public EvaluationSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      disputesAssignees = new ArrayList<EvaluationSettingsAssignee>();
    }
  }

  
  /**
   * Whether revisions are allowed for evaluations. When enabled, rescoring creates a new version of the evaluation and retracts the existing evaluation version. Does not apply for calibration evaluations.
   **/
  public EvaluationSettings revisionsEnabled(Boolean revisionsEnabled) {
    this.revisionsEnabled = revisionsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether revisions are allowed for evaluations. When enabled, rescoring creates a new version of the evaluation and retracts the existing evaluation version. Does not apply for calibration evaluations.")
  @JsonProperty("revisionsEnabled")
  public Boolean getRevisionsEnabled() {
    return revisionsEnabled;
  }
  public void setRevisionsEnabled(Boolean revisionsEnabled) {
    this.revisionsEnabled = revisionsEnabled;
  }


  /**
   * Whether disputes are allowed for evaluations. Does not apply for calibration evaluations.
   **/
  public EvaluationSettings disputesEnabled(Boolean disputesEnabled) {
    this.disputesEnabled = disputesEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether disputes are allowed for evaluations. Does not apply for calibration evaluations.")
  @JsonProperty("disputesEnabled")
  public Boolean getDisputesEnabled() {
    return disputesEnabled;
  }
  public void setDisputesEnabled(Boolean disputesEnabled) {
    this.disputesEnabled = disputesEnabled;
  }


  /**
   * The maximum number of disputes allowed for an evaluation.
   **/
  public EvaluationSettings disputesAllowedPerEvaluation(Integer disputesAllowedPerEvaluation) {
    this.disputesAllowedPerEvaluation = disputesAllowedPerEvaluation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of disputes allowed for an evaluation.")
  @JsonProperty("disputesAllowedPerEvaluation")
  public Integer getDisputesAllowedPerEvaluation() {
    return disputesAllowedPerEvaluation;
  }
  public void setDisputesAllowedPerEvaluation(Integer disputesAllowedPerEvaluation) {
    this.disputesAllowedPerEvaluation = disputesAllowedPerEvaluation;
  }


  /**
   * A list of assignees responsible for handling each dispute. This list size needs to be equal to disputesAllowedPerEvaluation.
   **/
  public EvaluationSettings disputesAssignees(List<EvaluationSettingsAssignee> disputesAssignees) {
    this.disputesAssignees = disputesAssignees;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of assignees responsible for handling each dispute. This list size needs to be equal to disputesAllowedPerEvaluation.")
  @JsonProperty("disputesAssignees")
  public List<EvaluationSettingsAssignee> getDisputesAssignees() {
    return disputesAssignees;
  }
  public void setDisputesAssignees(List<EvaluationSettingsAssignee> disputesAssignees) {
    this.disputesAssignees = disputesAssignees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EvaluationSettings evaluationSettings = (EvaluationSettings) o;

    return Objects.equals(this.revisionsEnabled, evaluationSettings.revisionsEnabled) &&
            Objects.equals(this.disputesEnabled, evaluationSettings.disputesEnabled) &&
            Objects.equals(this.disputesAllowedPerEvaluation, evaluationSettings.disputesAllowedPerEvaluation) &&
            Objects.equals(this.disputesAssignees, evaluationSettings.disputesAssignees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(revisionsEnabled, disputesEnabled, disputesAllowedPerEvaluation, disputesAssignees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationSettings {\n");
    
    sb.append("    revisionsEnabled: ").append(toIndentedString(revisionsEnabled)).append("\n");
    sb.append("    disputesEnabled: ").append(toIndentedString(disputesEnabled)).append("\n");
    sb.append("    disputesAllowedPerEvaluation: ").append(toIndentedString(disputesAllowedPerEvaluation)).append("\n");
    sb.append("    disputesAssignees: ").append(toIndentedString(disputesAssignees)).append("\n");
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

