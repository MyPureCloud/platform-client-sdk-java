package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * KnowledgeTraining
 */

public class KnowledgeTraining  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateTriggered = null;
  private Date dateCompleted = null;

  /**
   * Training status
   */
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("Queued"),
    INPROGRESS("InProgress"),
    SUCCEEDED("Succeeded"),
    FAILED("Failed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private String languageCode = null;
  private KnowledgeBase knowledgeBase = null;
  private String errorMessage = null;

  /**
   * State of the Trained Documents, which can be one of these Draft, Active, Discarded, Archived.
   */
  public enum KnowledgeDocumentsStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    ACTIVE("Active"),
    DISCARDED("Discarded"),
    ARCHIVED("Archived");

    private String value;

    KnowledgeDocumentsStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KnowledgeDocumentsStateEnum fromString(String key) {
      if (key == null) return null;

      for (KnowledgeDocumentsStateEnum value : KnowledgeDocumentsStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KnowledgeDocumentsStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KnowledgeDocumentsStateEnum knowledgeDocumentsState = null;
  private Date datePromoted = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public KnowledgeTraining name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  @ApiModelProperty(example = "null", value = "Trigger date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateTriggered")
  public Date getDateTriggered() {
    return dateTriggered;
  }

  
  @ApiModelProperty(example = "null", value = "Training completed date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }

  
  @ApiModelProperty(example = "null", value = "Training status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "Actual language of the Training")
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  
  /**
   * Knowledge base which Training does belong to
   **/
  public KnowledgeTraining knowledgeBase(KnowledgeBase knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge base which Training does belong to")
  @JsonProperty("knowledgeBase")
  public KnowledgeBase getKnowledgeBase() {
    return knowledgeBase;
  }
  public void setKnowledgeBase(KnowledgeBase knowledgeBase) {
    this.knowledgeBase = knowledgeBase;
  }

  
  @ApiModelProperty(example = "null", value = "Any error message during the Training or Promote action.")
  @JsonProperty("errorMessage")
  public String getErrorMessage() {
    return errorMessage;
  }

  
  @ApiModelProperty(example = "null", value = "State of the Trained Documents, which can be one of these Draft, Active, Discarded, Archived.")
  @JsonProperty("knowledgeDocumentsState")
  public KnowledgeDocumentsStateEnum getKnowledgeDocumentsState() {
    return knowledgeDocumentsState;
  }

  
  @ApiModelProperty(example = "null", value = "Trained Documents Promoted date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("datePromoted")
  public Date getDatePromoted() {
    return datePromoted;
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
    KnowledgeTraining knowledgeTraining = (KnowledgeTraining) o;
    return Objects.equals(this.id, knowledgeTraining.id) &&
        Objects.equals(this.name, knowledgeTraining.name) &&
        Objects.equals(this.dateTriggered, knowledgeTraining.dateTriggered) &&
        Objects.equals(this.dateCompleted, knowledgeTraining.dateCompleted) &&
        Objects.equals(this.status, knowledgeTraining.status) &&
        Objects.equals(this.languageCode, knowledgeTraining.languageCode) &&
        Objects.equals(this.knowledgeBase, knowledgeTraining.knowledgeBase) &&
        Objects.equals(this.errorMessage, knowledgeTraining.errorMessage) &&
        Objects.equals(this.knowledgeDocumentsState, knowledgeTraining.knowledgeDocumentsState) &&
        Objects.equals(this.datePromoted, knowledgeTraining.datePromoted) &&
        Objects.equals(this.selfUri, knowledgeTraining.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateTriggered, dateCompleted, status, languageCode, knowledgeBase, errorMessage, knowledgeDocumentsState, datePromoted, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeTraining {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateTriggered: ").append(toIndentedString(dateTriggered)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("    knowledgeBase: ").append(toIndentedString(knowledgeBase)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    knowledgeDocumentsState: ").append(toIndentedString(knowledgeDocumentsState)).append("\n");
    sb.append("    datePromoted: ").append(toIndentedString(datePromoted)).append("\n");
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

