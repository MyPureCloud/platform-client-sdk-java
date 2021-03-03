package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LanguageReference;
import com.mypurecloud.sdk.v2.model.QueueReference;
import com.mypurecloud.sdk.v2.model.RoutingSkillReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
import com.mypurecloud.sdk.v2.model.WorkPlanRotationReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Workforce management agent data
 */
@ApiModel(description = "Workforce management agent data")

public class WfmAgent  implements Serializable {
  
  private String id = null;
  private UserReference user = null;
  private WorkPlanReference workPlan = null;
  private WorkPlanRotationReference workPlanRotation = null;
  private Boolean acceptDirectShiftTrades = null;
  private List<QueueReference> queues = new ArrayList<QueueReference>();
  private List<LanguageReference> languages = new ArrayList<LanguageReference>();
  private List<RoutingSkillReference> skills = new ArrayList<RoutingSkillReference>();
  private Boolean schedulable = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The user associated with this data
   **/
  public WfmAgent user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user associated with this data")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * The work plan associated with this agent, if applicable
   **/
  public WfmAgent workPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan associated with this agent, if applicable")
  @JsonProperty("workPlan")
  public WorkPlanReference getWorkPlan() {
    return workPlan;
  }
  public void setWorkPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
  }

  
  /**
   * The work plan rotation associated with this agent, if applicable
   **/
  public WfmAgent workPlanRotation(WorkPlanRotationReference workPlanRotation) {
    this.workPlanRotation = workPlanRotation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan rotation associated with this agent, if applicable")
  @JsonProperty("workPlanRotation")
  public WorkPlanRotationReference getWorkPlanRotation() {
    return workPlanRotation;
  }
  public void setWorkPlanRotation(WorkPlanRotationReference workPlanRotation) {
    this.workPlanRotation = workPlanRotation;
  }

  
  /**
   * Whether the agent accepts direct shift trade requests
   **/
  public WfmAgent acceptDirectShiftTrades(Boolean acceptDirectShiftTrades) {
    this.acceptDirectShiftTrades = acceptDirectShiftTrades;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the agent accepts direct shift trade requests")
  @JsonProperty("acceptDirectShiftTrades")
  public Boolean getAcceptDirectShiftTrades() {
    return acceptDirectShiftTrades;
  }
  public void setAcceptDirectShiftTrades(Boolean acceptDirectShiftTrades) {
    this.acceptDirectShiftTrades = acceptDirectShiftTrades;
  }

  
  /**
   * List of queues to which this agent is capable of handling
   **/
  public WfmAgent queues(List<QueueReference> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of queues to which this agent is capable of handling")
  @JsonProperty("queues")
  public List<QueueReference> getQueues() {
    return queues;
  }
  public void setQueues(List<QueueReference> queues) {
    this.queues = queues;
  }

  
  /**
   * The list of languages this agent is capable of handling
   **/
  public WfmAgent languages(List<LanguageReference> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of languages this agent is capable of handling")
  @JsonProperty("languages")
  public List<LanguageReference> getLanguages() {
    return languages;
  }
  public void setLanguages(List<LanguageReference> languages) {
    this.languages = languages;
  }

  
  /**
   * The list of skills this agent is capable of handling
   **/
  public WfmAgent skills(List<RoutingSkillReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of skills this agent is capable of handling")
  @JsonProperty("skills")
  public List<RoutingSkillReference> getSkills() {
    return skills;
  }
  public void setSkills(List<RoutingSkillReference> skills) {
    this.skills = skills;
  }

  
  /**
   * Whether the agent has the permission to be included in schedule generation
   **/
  public WfmAgent schedulable(Boolean schedulable) {
    this.schedulable = schedulable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the agent has the permission to be included in schedule generation")
  @JsonProperty("schedulable")
  public Boolean getSchedulable() {
    return schedulable;
  }
  public void setSchedulable(Boolean schedulable) {
    this.schedulable = schedulable;
  }

  
  /**
   * Metadata for this agent
   **/
  public WfmAgent metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metadata for this agent")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
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
    WfmAgent wfmAgent = (WfmAgent) o;
    return Objects.equals(this.id, wfmAgent.id) &&
        Objects.equals(this.user, wfmAgent.user) &&
        Objects.equals(this.workPlan, wfmAgent.workPlan) &&
        Objects.equals(this.workPlanRotation, wfmAgent.workPlanRotation) &&
        Objects.equals(this.acceptDirectShiftTrades, wfmAgent.acceptDirectShiftTrades) &&
        Objects.equals(this.queues, wfmAgent.queues) &&
        Objects.equals(this.languages, wfmAgent.languages) &&
        Objects.equals(this.skills, wfmAgent.skills) &&
        Objects.equals(this.schedulable, wfmAgent.schedulable) &&
        Objects.equals(this.metadata, wfmAgent.metadata) &&
        Objects.equals(this.selfUri, wfmAgent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, workPlan, workPlanRotation, acceptDirectShiftTrades, queues, languages, skills, schedulable, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    workPlan: ").append(toIndentedString(workPlan)).append("\n");
    sb.append("    workPlanRotation: ").append(toIndentedString(workPlanRotation)).append("\n");
    sb.append("    acceptDirectShiftTrades: ").append(toIndentedString(acceptDirectShiftTrades)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

