package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AsyncConversationQuery;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * RecordingJobsQuery
 */

public class RecordingJobsQuery  implements Serializable {
  

  /**
   * Operation to perform bulk task
   */
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DELETE("DELETE"),
    EXPORT("EXPORT");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private Date actionDate = null;
  private String integrationId = null;
  private AsyncConversationQuery conversationQuery = null;

  
  /**
   * Operation to perform bulk task
   **/
  public RecordingJobsQuery action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operation to perform bulk task")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }

  
  /**
   * The date when the action will be performed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public RecordingJobsQuery actionDate(Date actionDate) {
    this.actionDate = actionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date when the action will be performed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("actionDate")
  public Date getActionDate() {
    return actionDate;
  }
  public void setActionDate(Date actionDate) {
    this.actionDate = actionDate;
  }

  
  /**
   * Integration ID
   **/
  public RecordingJobsQuery integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Integration ID")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  
  /**
   * Conversation Query. Note: After the recording is created, it might take up to 48 hours for the recording to be included in the submitted job query.
   **/
  public RecordingJobsQuery conversationQuery(AsyncConversationQuery conversationQuery) {
    this.conversationQuery = conversationQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Conversation Query. Note: After the recording is created, it might take up to 48 hours for the recording to be included in the submitted job query.")
  @JsonProperty("conversationQuery")
  public AsyncConversationQuery getConversationQuery() {
    return conversationQuery;
  }
  public void setConversationQuery(AsyncConversationQuery conversationQuery) {
    this.conversationQuery = conversationQuery;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingJobsQuery recordingJobsQuery = (RecordingJobsQuery) o;
    return Objects.equals(this.action, recordingJobsQuery.action) &&
        Objects.equals(this.actionDate, recordingJobsQuery.actionDate) &&
        Objects.equals(this.integrationId, recordingJobsQuery.integrationId) &&
        Objects.equals(this.conversationQuery, recordingJobsQuery.conversationQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionDate, integrationId, conversationQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingJobsQuery {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionDate: ").append(toIndentedString(actionDate)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    conversationQuery: ").append(toIndentedString(conversationQuery)).append("\n");
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

