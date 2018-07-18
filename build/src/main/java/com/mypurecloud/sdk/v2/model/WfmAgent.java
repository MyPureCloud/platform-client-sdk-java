package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LanguageReference;
import com.mypurecloud.sdk.v2.model.QueueReference;
import com.mypurecloud.sdk.v2.model.RoutingSkillReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WfmTimeZone;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import com.mypurecloud.sdk.v2.model.WorkPlanReference;
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
  private List<QueueReference> queues = new ArrayList<QueueReference>();
  private List<LanguageReference> languages = new ArrayList<LanguageReference>();
  private List<RoutingSkillReference> skills = new ArrayList<RoutingSkillReference>();
  private WorkPlanReference workPlan = null;
  private Boolean schedulable = null;
  private WfmTimeZone timeZone = null;
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
   * List of queues to which the agent belongs and which are defined in the service goal groups in this management unit
   **/
  public WfmAgent queues(List<QueueReference> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of queues to which the agent belongs and which are defined in the service goal groups in this management unit")
  @JsonProperty("queues")
  public List<QueueReference> getQueues() {
    return queues;
  }
  public void setQueues(List<QueueReference> queues) {
    this.queues = queues;
  }

  
  /**
   * The list of languages
   **/
  public WfmAgent languages(List<LanguageReference> languages) {
    this.languages = languages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of languages")
  @JsonProperty("languages")
  public List<LanguageReference> getLanguages() {
    return languages;
  }
  public void setLanguages(List<LanguageReference> languages) {
    this.languages = languages;
  }

  
  /**
   * The list of skills
   **/
  public WfmAgent skills(List<RoutingSkillReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of skills")
  @JsonProperty("skills")
  public List<RoutingSkillReference> getSkills() {
    return skills;
  }
  public void setSkills(List<RoutingSkillReference> skills) {
    this.skills = skills;
  }

  
  /**
   * The work plan associated with this agent
   **/
  public WfmAgent workPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The work plan associated with this agent")
  @JsonProperty("workPlan")
  public WorkPlanReference getWorkPlan() {
    return workPlan;
  }
  public void setWorkPlan(WorkPlanReference workPlan) {
    this.workPlan = workPlan;
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
   * The time zone for this agent. Defaults to the time zone of the management unit to which the agent belongs
   **/
  public WfmAgent timeZone(WfmTimeZone timeZone) {
    this.timeZone = timeZone;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time zone for this agent. Defaults to the time zone of the management unit to which the agent belongs")
  @JsonProperty("timeZone")
  public WfmTimeZone getTimeZone() {
    return timeZone;
  }
  public void setTimeZone(WfmTimeZone timeZone) {
    this.timeZone = timeZone;
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
        Objects.equals(this.queues, wfmAgent.queues) &&
        Objects.equals(this.languages, wfmAgent.languages) &&
        Objects.equals(this.skills, wfmAgent.skills) &&
        Objects.equals(this.workPlan, wfmAgent.workPlan) &&
        Objects.equals(this.schedulable, wfmAgent.schedulable) &&
        Objects.equals(this.timeZone, wfmAgent.timeZone) &&
        Objects.equals(this.metadata, wfmAgent.metadata) &&
        Objects.equals(this.selfUri, wfmAgent.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, queues, languages, skills, workPlan, schedulable, timeZone, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmAgent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    languages: ").append(toIndentedString(languages)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    workPlan: ").append(toIndentedString(workPlan)).append("\n");
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
    sb.append("    timeZone: ").append(toIndentedString(timeZone)).append("\n");
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

