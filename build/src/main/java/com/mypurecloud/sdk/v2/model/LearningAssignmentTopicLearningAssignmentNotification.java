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
import com.mypurecloud.sdk.v2.model.LearningAssignmentTopicLearningModuleReference;
import com.mypurecloud.sdk.v2.model.LearningAssignmentTopicUserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.Date;

import java.io.Serializable;
/**
 * LearningAssignmentTopicLearningAssignmentNotification
 */

public class LearningAssignmentTopicLearningAssignmentNotification  implements Serializable {
  
  private String id = null;
  private LearningAssignmentTopicUserReference user = null;
  private LearningAssignmentTopicLearningModuleReference module = null;
  private Long version = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASSIGNED("Assigned"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    DELETED("Deleted"),
    NOTCOMPLETED("NotCompleted"),
    INVALIDSCHEDULE("InvalidSchedule");

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
  private LearningAssignmentTopicUserReference createdBy = null;
  private Date dateCreated = null;
  private LearningAssignmentTopicUserReference modifiedBy = null;
  private Date dateModified = null;
  private Boolean isOverdue = null;
  private Long lengthInMinutes = null;
  private BigDecimal percentageScore = null;
  private Boolean isPassed = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    NATIVE("Native"),
    EXTERNAL("External");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  public LearningAssignmentTopicLearningAssignmentNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification id(String id) {
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
  public LearningAssignmentTopicLearningAssignmentNotification user(LearningAssignmentTopicUserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public LearningAssignmentTopicUserReference getUser() {
    return user;
  }
  public void setUser(LearningAssignmentTopicUserReference user) {
    this.user = user;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification module(LearningAssignmentTopicLearningModuleReference module) {
    this.module = module;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("module")
  public LearningAssignmentTopicLearningModuleReference getModule() {
    return module;
  }
  public void setModule(LearningAssignmentTopicLearningModuleReference module) {
    this.module = module;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification state(StateEnum state) {
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
  public LearningAssignmentTopicLearningAssignmentNotification dateRecommendedForCompletion(Date dateRecommendedForCompletion) {
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
  public LearningAssignmentTopicLearningAssignmentNotification createdBy(LearningAssignmentTopicUserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("createdBy")
  public LearningAssignmentTopicUserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(LearningAssignmentTopicUserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification dateCreated(Date dateCreated) {
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
  public LearningAssignmentTopicLearningAssignmentNotification modifiedBy(LearningAssignmentTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public LearningAssignmentTopicUserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(LearningAssignmentTopicUserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification dateModified(Date dateModified) {
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


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification isOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isOverdue")
  public Boolean getIsOverdue() {
    return isOverdue;
  }
  public void setIsOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification lengthInMinutes(Long lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lengthInMinutes")
  public Long getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Long lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification percentageScore(BigDecimal percentageScore) {
    this.percentageScore = percentageScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("percentageScore")
  public BigDecimal getPercentageScore() {
    return percentageScore;
  }
  public void setPercentageScore(BigDecimal percentageScore) {
    this.percentageScore = percentageScore;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification isPassed(Boolean isPassed) {
    this.isPassed = isPassed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isPassed")
  public Boolean getIsPassed() {
    return isPassed;
  }
  public void setIsPassed(Boolean isPassed) {
    this.isPassed = isPassed;
  }


  /**
   **/
  public LearningAssignmentTopicLearningAssignmentNotification type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LearningAssignmentTopicLearningAssignmentNotification learningAssignmentTopicLearningAssignmentNotification = (LearningAssignmentTopicLearningAssignmentNotification) o;

    return Objects.equals(this.id, learningAssignmentTopicLearningAssignmentNotification.id) &&
            Objects.equals(this.user, learningAssignmentTopicLearningAssignmentNotification.user) &&
            Objects.equals(this.module, learningAssignmentTopicLearningAssignmentNotification.module) &&
            Objects.equals(this.version, learningAssignmentTopicLearningAssignmentNotification.version) &&
            Objects.equals(this.state, learningAssignmentTopicLearningAssignmentNotification.state) &&
            Objects.equals(this.dateRecommendedForCompletion, learningAssignmentTopicLearningAssignmentNotification.dateRecommendedForCompletion) &&
            Objects.equals(this.createdBy, learningAssignmentTopicLearningAssignmentNotification.createdBy) &&
            Objects.equals(this.dateCreated, learningAssignmentTopicLearningAssignmentNotification.dateCreated) &&
            Objects.equals(this.modifiedBy, learningAssignmentTopicLearningAssignmentNotification.modifiedBy) &&
            Objects.equals(this.dateModified, learningAssignmentTopicLearningAssignmentNotification.dateModified) &&
            Objects.equals(this.isOverdue, learningAssignmentTopicLearningAssignmentNotification.isOverdue) &&
            Objects.equals(this.lengthInMinutes, learningAssignmentTopicLearningAssignmentNotification.lengthInMinutes) &&
            Objects.equals(this.percentageScore, learningAssignmentTopicLearningAssignmentNotification.percentageScore) &&
            Objects.equals(this.isPassed, learningAssignmentTopicLearningAssignmentNotification.isPassed) &&
            Objects.equals(this.type, learningAssignmentTopicLearningAssignmentNotification.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, module, version, state, dateRecommendedForCompletion, createdBy, dateCreated, modifiedBy, dateModified, isOverdue, lengthInMinutes, percentageScore, isPassed, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LearningAssignmentTopicLearningAssignmentNotification {\n");
    
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
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    percentageScore: ").append(toIndentedString(percentageScore)).append("\n");
    sb.append("    isPassed: ").append(toIndentedString(isPassed)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

