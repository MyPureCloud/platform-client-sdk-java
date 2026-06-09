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
import com.mypurecloud.sdk.v2.model.Intake;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CaseCreate
 */

public class CaseCreate  implements Serializable {
  
  private String caseplanId = null;
  private String ownerId = null;
  private String summary = null;
  private String externalContactId = null;
  private String conversationId = null;
  private String workitemId = null;
  private Integer ttlSeconds = null;
  private List<Intake> intake = null;

  public CaseCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      intake = new ArrayList<Intake>();
    }
  }

  public CaseCreate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      intake = new ArrayList<Intake>();
    }
  }

  
  /**
   * The ID of the Caseplan used to create the Case.
   **/
  public CaseCreate caseplanId(String caseplanId) {
    this.caseplanId = caseplanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the Caseplan used to create the Case.")
  @JsonProperty("caseplanId")
  public String getCaseplanId() {
    return caseplanId;
  }
  public void setCaseplanId(String caseplanId) {
    this.caseplanId = caseplanId;
  }


  /**
   * The ID of the owner of the Case.
   **/
  public CaseCreate ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the owner of the Case.")
  @JsonProperty("ownerId")
  public String getOwnerId() {
    return ownerId;
  }
  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  /**
   * Overview information for the Case. Valid length between 3 and 512 characters.
   **/
  public CaseCreate summary(String summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overview information for the Case. Valid length between 3 and 512 characters.")
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }


  /**
   * The ID of the External Contact associated with the Case.
   **/
  public CaseCreate externalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the External Contact associated with the Case.")
  @JsonProperty("externalContactId")
  public String getExternalContactId() {
    return externalContactId;
  }
  public void setExternalContactId(String externalContactId) {
    this.externalContactId = externalContactId;
  }


  /**
   * The ID of the Conversation associated with the Case.
   **/
  public CaseCreate conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Conversation associated with the Case.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   * The ID of the Workitem associated with the Case.
   **/
  public CaseCreate workitemId(String workitemId) {
    this.workitemId = workitemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Workitem associated with the Case.")
  @JsonProperty("workitemId")
  public String getWorkitemId() {
    return workitemId;
  }
  public void setWorkitemId(String workitemId) {
    this.workitemId = workitemId;
  }


  /**
   * Epoch timestamp in seconds for the Case time-to-live. Cannot be more than 365 days after the current time.
   **/
  public CaseCreate ttlSeconds(Integer ttlSeconds) {
    this.ttlSeconds = ttlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Epoch timestamp in seconds for the Case time-to-live. Cannot be more than 365 days after the current time.")
  @JsonProperty("ttlSeconds")
  public Integer getTtlSeconds() {
    return ttlSeconds;
  }
  public void setTtlSeconds(Integer ttlSeconds) {
    this.ttlSeconds = ttlSeconds;
  }


  /**
   * The intake data for the Case. Maximum of 10 intake objects allowed.
   **/
  public CaseCreate intake(List<Intake> intake) {
    this.intake = intake;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intake data for the Case. Maximum of 10 intake objects allowed.")
  @JsonProperty("intake")
  public List<Intake> getIntake() {
    return intake;
  }
  public void setIntake(List<Intake> intake) {
    this.intake = intake;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseCreate caseCreate = (CaseCreate) o;

    return Objects.equals(this.caseplanId, caseCreate.caseplanId) &&
            Objects.equals(this.ownerId, caseCreate.ownerId) &&
            Objects.equals(this.summary, caseCreate.summary) &&
            Objects.equals(this.externalContactId, caseCreate.externalContactId) &&
            Objects.equals(this.conversationId, caseCreate.conversationId) &&
            Objects.equals(this.workitemId, caseCreate.workitemId) &&
            Objects.equals(this.ttlSeconds, caseCreate.ttlSeconds) &&
            Objects.equals(this.intake, caseCreate.intake);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseplanId, ownerId, summary, externalContactId, conversationId, workitemId, ttlSeconds, intake);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseCreate {\n");
    
    sb.append("    caseplanId: ").append(toIndentedString(caseplanId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    externalContactId: ").append(toIndentedString(externalContactId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
    sb.append("    ttlSeconds: ").append(toIndentedString(ttlSeconds)).append("\n");
    sb.append("    intake: ").append(toIndentedString(intake)).append("\n");
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

