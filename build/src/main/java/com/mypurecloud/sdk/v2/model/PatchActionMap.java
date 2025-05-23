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
import com.mypurecloud.sdk.v2.model.Activation;
import com.mypurecloud.sdk.v2.model.EventCondition;
import com.mypurecloud.sdk.v2.model.OutcomePercentileCondition;
import com.mypurecloud.sdk.v2.model.OutcomeProbabilityCondition;
import com.mypurecloud.sdk.v2.model.OutcomeQuantileCondition;
import com.mypurecloud.sdk.v2.model.PatchAction;
import com.mypurecloud.sdk.v2.model.PatchActionMapScheduleGroups;
import com.mypurecloud.sdk.v2.model.UrlCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PatchActionMap
 */

public class PatchActionMap  implements Serializable {
  
  private String id = null;
  private Integer version = null;
  private Boolean isActive = null;
  private String displayName = null;
  private List<String> triggerWithSegments = null;
  private List<EventCondition> triggerWithEventConditions = null;
  private List<OutcomeProbabilityCondition> triggerWithOutcomeProbabilityConditions = null;
  private List<OutcomePercentileCondition> triggerWithOutcomePercentileConditions = null;
  private List<OutcomeQuantileCondition> triggerWithOutcomeQuantileConditions = null;
  private List<UrlCondition> pageUrlConditions = null;
  private Activation activation = null;
  private Integer weight = null;
  private PatchAction action = null;
  private PatchActionMapScheduleGroups actionMapScheduleGroups = null;
  private Boolean ignoreFrequencyCap = null;
  private String selfUri = null;
  private Date createdDate = null;
  private Date modifiedDate = null;
  private Date startDate = null;
  private Date endDate = null;

  public PatchActionMap() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      triggerWithSegments = new ArrayList<String>();
      triggerWithEventConditions = new ArrayList<EventCondition>();
      triggerWithOutcomeProbabilityConditions = new ArrayList<OutcomeProbabilityCondition>();
      triggerWithOutcomePercentileConditions = new ArrayList<OutcomePercentileCondition>();
      triggerWithOutcomeQuantileConditions = new ArrayList<OutcomeQuantileCondition>();
      pageUrlConditions = new ArrayList<UrlCondition>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The version of the action map.
   **/
  public PatchActionMap version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the action map.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Whether the action map is active.
   **/
  public PatchActionMap isActive(Boolean isActive) {
    this.isActive = isActive;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the action map is active.")
  @JsonProperty("isActive")
  public Boolean getIsActive() {
    return isActive;
  }
  public void setIsActive(Boolean isActive) {
    this.isActive = isActive;
  }


  /**
   * Display name of the action map.
   **/
  public PatchActionMap displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Display name of the action map.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * Trigger action map if any segment in the list is assigned to a given customer.
   **/
  public PatchActionMap triggerWithSegments(List<String> triggerWithSegments) {
    this.triggerWithSegments = triggerWithSegments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Trigger action map if any segment in the list is assigned to a given customer.")
  @JsonProperty("triggerWithSegments")
  public List<String> getTriggerWithSegments() {
    return triggerWithSegments;
  }
  public void setTriggerWithSegments(List<String> triggerWithSegments) {
    this.triggerWithSegments = triggerWithSegments;
  }


  /**
   * List of event conditions that must be satisfied to trigger the action map.
   **/
  public PatchActionMap triggerWithEventConditions(List<EventCondition> triggerWithEventConditions) {
    this.triggerWithEventConditions = triggerWithEventConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of event conditions that must be satisfied to trigger the action map.")
  @JsonProperty("triggerWithEventConditions")
  public List<EventCondition> getTriggerWithEventConditions() {
    return triggerWithEventConditions;
  }
  public void setTriggerWithEventConditions(List<EventCondition> triggerWithEventConditions) {
    this.triggerWithEventConditions = triggerWithEventConditions;
  }


  /**
   * (deprecated - use triggerWithOutcomeQuantileConditions instead) Probability conditions for outcomes that must be satisfied to trigger the action map.
   **/
  public PatchActionMap triggerWithOutcomeProbabilityConditions(List<OutcomeProbabilityCondition> triggerWithOutcomeProbabilityConditions) {
    this.triggerWithOutcomeProbabilityConditions = triggerWithOutcomeProbabilityConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(deprecated - use triggerWithOutcomeQuantileConditions instead) Probability conditions for outcomes that must be satisfied to trigger the action map.")
  @JsonProperty("triggerWithOutcomeProbabilityConditions")
  public List<OutcomeProbabilityCondition> getTriggerWithOutcomeProbabilityConditions() {
    return triggerWithOutcomeProbabilityConditions;
  }
  public void setTriggerWithOutcomeProbabilityConditions(List<OutcomeProbabilityCondition> triggerWithOutcomeProbabilityConditions) {
    this.triggerWithOutcomeProbabilityConditions = triggerWithOutcomeProbabilityConditions;
  }


  /**
   * (deprecated - use triggerWithOutcomeQuantileConditions instead) Percentile conditions for outcomes that must be satisfied to trigger the action map.
   **/
  public PatchActionMap triggerWithOutcomePercentileConditions(List<OutcomePercentileCondition> triggerWithOutcomePercentileConditions) {
    this.triggerWithOutcomePercentileConditions = triggerWithOutcomePercentileConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "(deprecated - use triggerWithOutcomeQuantileConditions instead) Percentile conditions for outcomes that must be satisfied to trigger the action map.")
  @JsonProperty("triggerWithOutcomePercentileConditions")
  public List<OutcomePercentileCondition> getTriggerWithOutcomePercentileConditions() {
    return triggerWithOutcomePercentileConditions;
  }
  public void setTriggerWithOutcomePercentileConditions(List<OutcomePercentileCondition> triggerWithOutcomePercentileConditions) {
    this.triggerWithOutcomePercentileConditions = triggerWithOutcomePercentileConditions;
  }


  /**
   * Quantile conditions for outcomes that must be satisfied to trigger the action map.
   **/
  public PatchActionMap triggerWithOutcomeQuantileConditions(List<OutcomeQuantileCondition> triggerWithOutcomeQuantileConditions) {
    this.triggerWithOutcomeQuantileConditions = triggerWithOutcomeQuantileConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Quantile conditions for outcomes that must be satisfied to trigger the action map.")
  @JsonProperty("triggerWithOutcomeQuantileConditions")
  public List<OutcomeQuantileCondition> getTriggerWithOutcomeQuantileConditions() {
    return triggerWithOutcomeQuantileConditions;
  }
  public void setTriggerWithOutcomeQuantileConditions(List<OutcomeQuantileCondition> triggerWithOutcomeQuantileConditions) {
    this.triggerWithOutcomeQuantileConditions = triggerWithOutcomeQuantileConditions;
  }


  /**
   * URL conditions that a page must match for web actions to be displayable.
   **/
  public PatchActionMap pageUrlConditions(List<UrlCondition> pageUrlConditions) {
    this.pageUrlConditions = pageUrlConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "URL conditions that a page must match for web actions to be displayable.")
  @JsonProperty("pageUrlConditions")
  public List<UrlCondition> getPageUrlConditions() {
    return pageUrlConditions;
  }
  public void setPageUrlConditions(List<UrlCondition> pageUrlConditions) {
    this.pageUrlConditions = pageUrlConditions;
  }


  /**
   * Type of activation.
   **/
  public PatchActionMap activation(Activation activation) {
    this.activation = activation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of activation.")
  @JsonProperty("activation")
  public Activation getActivation() {
    return activation;
  }
  public void setActivation(Activation activation) {
    this.activation = activation;
  }


  /**
   * Weight of the action map with higher number denoting higher weight.
   **/
  public PatchActionMap weight(Integer weight) {
    this.weight = weight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Weight of the action map with higher number denoting higher weight.")
  @JsonProperty("weight")
  public Integer getWeight() {
    return weight;
  }
  public void setWeight(Integer weight) {
    this.weight = weight;
  }


  /**
   * The action that will be executed if this action map is triggered.
   **/
  public PatchActionMap action(PatchAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action that will be executed if this action map is triggered.")
  @JsonProperty("action")
  public PatchAction getAction() {
    return action;
  }
  public void setAction(PatchAction action) {
    this.action = action;
  }


  /**
   * The action map's associated schedule groups.
   **/
  public PatchActionMap actionMapScheduleGroups(PatchActionMapScheduleGroups actionMapScheduleGroups) {
    this.actionMapScheduleGroups = actionMapScheduleGroups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action map's associated schedule groups.")
  @JsonProperty("actionMapScheduleGroups")
  public PatchActionMapScheduleGroups getActionMapScheduleGroups() {
    return actionMapScheduleGroups;
  }
  public void setActionMapScheduleGroups(PatchActionMapScheduleGroups actionMapScheduleGroups) {
    this.actionMapScheduleGroups = actionMapScheduleGroups;
  }


  /**
   * Override organization-level frequency cap and always offer web engagements from this action map.
   **/
  public PatchActionMap ignoreFrequencyCap(Boolean ignoreFrequencyCap) {
    this.ignoreFrequencyCap = ignoreFrequencyCap;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Override organization-level frequency cap and always offer web engagements from this action map.")
  @JsonProperty("ignoreFrequencyCap")
  public Boolean getIgnoreFrequencyCap() {
    return ignoreFrequencyCap;
  }
  public void setIgnoreFrequencyCap(Boolean ignoreFrequencyCap) {
    this.ignoreFrequencyCap = ignoreFrequencyCap;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * Timestamp indicating when the action map was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchActionMap createdDate(Date createdDate) {
    this.createdDate = createdDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the action map was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(Date createdDate) {
    this.createdDate = createdDate;
  }


  /**
   * Timestamp indicating when the action map was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchActionMap modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the action map was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }


  /**
   * Timestamp at which the action map is scheduled to start firing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchActionMap startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp at which the action map is scheduled to start firing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * Timestamp at which the action map is scheduled to stop firing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PatchActionMap endDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp at which the action map is scheduled to stop firing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endDate")
  public Date getEndDate() {
    return endDate;
  }
  public void setEndDate(Date endDate) {
    this.endDate = endDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchActionMap patchActionMap = (PatchActionMap) o;

    return Objects.equals(this.id, patchActionMap.id) &&
            Objects.equals(this.version, patchActionMap.version) &&
            Objects.equals(this.isActive, patchActionMap.isActive) &&
            Objects.equals(this.displayName, patchActionMap.displayName) &&
            Objects.equals(this.triggerWithSegments, patchActionMap.triggerWithSegments) &&
            Objects.equals(this.triggerWithEventConditions, patchActionMap.triggerWithEventConditions) &&
            Objects.equals(this.triggerWithOutcomeProbabilityConditions, patchActionMap.triggerWithOutcomeProbabilityConditions) &&
            Objects.equals(this.triggerWithOutcomePercentileConditions, patchActionMap.triggerWithOutcomePercentileConditions) &&
            Objects.equals(this.triggerWithOutcomeQuantileConditions, patchActionMap.triggerWithOutcomeQuantileConditions) &&
            Objects.equals(this.pageUrlConditions, patchActionMap.pageUrlConditions) &&
            Objects.equals(this.activation, patchActionMap.activation) &&
            Objects.equals(this.weight, patchActionMap.weight) &&
            Objects.equals(this.action, patchActionMap.action) &&
            Objects.equals(this.actionMapScheduleGroups, patchActionMap.actionMapScheduleGroups) &&
            Objects.equals(this.ignoreFrequencyCap, patchActionMap.ignoreFrequencyCap) &&
            Objects.equals(this.selfUri, patchActionMap.selfUri) &&
            Objects.equals(this.createdDate, patchActionMap.createdDate) &&
            Objects.equals(this.modifiedDate, patchActionMap.modifiedDate) &&
            Objects.equals(this.startDate, patchActionMap.startDate) &&
            Objects.equals(this.endDate, patchActionMap.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, isActive, displayName, triggerWithSegments, triggerWithEventConditions, triggerWithOutcomeProbabilityConditions, triggerWithOutcomePercentileConditions, triggerWithOutcomeQuantileConditions, pageUrlConditions, activation, weight, action, actionMapScheduleGroups, ignoreFrequencyCap, selfUri, createdDate, modifiedDate, startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchActionMap {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    isActive: ").append(toIndentedString(isActive)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    triggerWithSegments: ").append(toIndentedString(triggerWithSegments)).append("\n");
    sb.append("    triggerWithEventConditions: ").append(toIndentedString(triggerWithEventConditions)).append("\n");
    sb.append("    triggerWithOutcomeProbabilityConditions: ").append(toIndentedString(triggerWithOutcomeProbabilityConditions)).append("\n");
    sb.append("    triggerWithOutcomePercentileConditions: ").append(toIndentedString(triggerWithOutcomePercentileConditions)).append("\n");
    sb.append("    triggerWithOutcomeQuantileConditions: ").append(toIndentedString(triggerWithOutcomeQuantileConditions)).append("\n");
    sb.append("    pageUrlConditions: ").append(toIndentedString(pageUrlConditions)).append("\n");
    sb.append("    activation: ").append(toIndentedString(activation)).append("\n");
    sb.append("    weight: ").append(toIndentedString(weight)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionMapScheduleGroups: ").append(toIndentedString(actionMapScheduleGroups)).append("\n");
    sb.append("    ignoreFrequencyCap: ").append(toIndentedString(ignoreFrequencyCap)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

