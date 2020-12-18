package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.WemLearningAssignmentTopicLearningModuleReference;
import com.mypurecloud.sdk.v2.model.WemLearningAssignmentTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * WemLearningAssignmentTopicLearningAssignmentNotification
 */

public class WemLearningAssignmentTopicLearningAssignmentNotification  implements Serializable {
  
  private String id = null;
  private WemLearningAssignmentTopicUserReference user = null;
  private WemLearningAssignmentTopicLearningModuleReference module = null;
  private Integer version = null;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSIGNED("Assigned"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    DELETED("Deleted");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Date dateRecommendedForCompletion = null;
  private WemLearningAssignmentTopicUserReference createdBy = null;
  private Date dateCreated = null;
  private WemLearningAssignmentTopicUserReference modifiedBy = null;
  private Date dateModified = null;

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification user(WemLearningAssignmentTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public WemLearningAssignmentTopicUserReference getUser() {
    return user;
  }
  public void setUser(WemLearningAssignmentTopicUserReference user) {
    this.user = user;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification module(WemLearningAssignmentTopicLearningModuleReference module) {
    this.module = module;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("module")
  public WemLearningAssignmentTopicLearningModuleReference getModule() {
    return module;
  }
  public void setModule(WemLearningAssignmentTopicLearningModuleReference module) {
    this.module = module;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification dateRecommendedForCompletion(Date dateRecommendedForCompletion) {
    this.dateRecommendedForCompletion = dateRecommendedForCompletion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateRecommendedForCompletion")
  public Date getDateRecommendedForCompletion() {
    return dateRecommendedForCompletion;
  }
  public void setDateRecommendedForCompletion(Date dateRecommendedForCompletion) {
    this.dateRecommendedForCompletion = dateRecommendedForCompletion;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification createdBy(WemLearningAssignmentTopicUserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public WemLearningAssignmentTopicUserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(WemLearningAssignmentTopicUserReference createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification modifiedBy(WemLearningAssignmentTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public WemLearningAssignmentTopicUserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(WemLearningAssignmentTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  /**
   **/
  public WemLearningAssignmentTopicLearningAssignmentNotification dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WemLearningAssignmentTopicLearningAssignmentNotification wemLearningAssignmentTopicLearningAssignmentNotification = (WemLearningAssignmentTopicLearningAssignmentNotification) o;
    return Objects.equals(this.id, wemLearningAssignmentTopicLearningAssignmentNotification.id) &&
        Objects.equals(this.user, wemLearningAssignmentTopicLearningAssignmentNotification.user) &&
        Objects.equals(this.module, wemLearningAssignmentTopicLearningAssignmentNotification.module) &&
        Objects.equals(this.version, wemLearningAssignmentTopicLearningAssignmentNotification.version) &&
        Objects.equals(this.state, wemLearningAssignmentTopicLearningAssignmentNotification.state) &&
        Objects.equals(this.dateRecommendedForCompletion, wemLearningAssignmentTopicLearningAssignmentNotification.dateRecommendedForCompletion) &&
        Objects.equals(this.createdBy, wemLearningAssignmentTopicLearningAssignmentNotification.createdBy) &&
        Objects.equals(this.dateCreated, wemLearningAssignmentTopicLearningAssignmentNotification.dateCreated) &&
        Objects.equals(this.modifiedBy, wemLearningAssignmentTopicLearningAssignmentNotification.modifiedBy) &&
        Objects.equals(this.dateModified, wemLearningAssignmentTopicLearningAssignmentNotification.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, module, version, state, dateRecommendedForCompletion, createdBy, dateCreated, modifiedBy, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WemLearningAssignmentTopicLearningAssignmentNotification {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    module: ").append(toIndentedString(module)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateRecommendedForCompletion: ").append(toIndentedString(dateRecommendedForCompletion)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

