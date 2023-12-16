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
  

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Operation to perform bulk task. If the operation will cause the delete date of a recording to be older than the export date, the export date will be adjusted to the delete date.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ARCHIVE("ARCHIVE"),
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
  private Integer actionAge = null;
  private Date screenRecordingActionDate = null;
  private Integer screenRecordingActionAge = null;
  private String integrationId = null;
  private Boolean includeRecordingsWithSensitiveData = null;
  private Boolean includeScreenRecordings = null;
  private Boolean clearExport = null;
  private AsyncConversationQuery conversationQuery = null;

  
  /**
   * Operation to perform bulk task. If the operation will cause the delete date of a recording to be older than the export date, the export date will be adjusted to the delete date.
   **/
  public RecordingJobsQuery action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operation to perform bulk task. If the operation will cause the delete date of a recording to be older than the export date, the export date will be adjusted to the delete date.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   * The date when the action will be performed. If screenRecordingActionDate is also provided, this value is only used for non-screen recordings. Otherwise this value is used for all recordings. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingJobsQuery actionDate(Date actionDate) {
    this.actionDate = actionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the action will be performed. If screenRecordingActionDate is also provided, this value is only used for non-screen recordings. Otherwise this value is used for all recordings. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("actionDate")
  public Date getActionDate() {
    return actionDate;
  }
  public void setActionDate(Date actionDate) {
    this.actionDate = actionDate;
  }


  /**
   * The number of days after each recording's creation date when the action will be performed. If screenRecordingActionAge is also provided, this value is only used for non-screen recordings. Otherwise this value is used for all recordings.
   **/
  public RecordingJobsQuery actionAge(Integer actionAge) {
    this.actionAge = actionAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days after each recording's creation date when the action will be performed. If screenRecordingActionAge is also provided, this value is only used for non-screen recordings. Otherwise this value is used for all recordings.")
  @JsonProperty("actionAge")
  public Integer getActionAge() {
    return actionAge;
  }
  public void setActionAge(Integer actionAge) {
    this.actionAge = actionAge;
  }


  /**
   * The date when the action will be performed for screen recordings. If this is provided then includeScreenRecordings must be true. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public RecordingJobsQuery screenRecordingActionDate(Date screenRecordingActionDate) {
    this.screenRecordingActionDate = screenRecordingActionDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date when the action will be performed for screen recordings. If this is provided then includeScreenRecordings must be true. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("screenRecordingActionDate")
  public Date getScreenRecordingActionDate() {
    return screenRecordingActionDate;
  }
  public void setScreenRecordingActionDate(Date screenRecordingActionDate) {
    this.screenRecordingActionDate = screenRecordingActionDate;
  }


  /**
   * The number of days after each screen recording's creation date when the action will be performed. If this is provided then includeScreenRecordings must be true.
   **/
  public RecordingJobsQuery screenRecordingActionAge(Integer screenRecordingActionAge) {
    this.screenRecordingActionAge = screenRecordingActionAge;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days after each screen recording's creation date when the action will be performed. If this is provided then includeScreenRecordings must be true.")
  @JsonProperty("screenRecordingActionAge")
  public Integer getScreenRecordingActionAge() {
    return screenRecordingActionAge;
  }
  public void setScreenRecordingActionAge(Integer screenRecordingActionAge) {
    this.screenRecordingActionAge = screenRecordingActionAge;
  }


  /**
   * IntegrationId to Access AWS S3 bucket for bulk recording exports. This field is required and used only for EXPORT action.
   **/
  public RecordingJobsQuery integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IntegrationId to Access AWS S3 bucket for bulk recording exports. This field is required and used only for EXPORT action.")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * Whether to include recordings with PCI DSS and/or PII data, default value = false 
   **/
  public RecordingJobsQuery includeRecordingsWithSensitiveData(Boolean includeRecordingsWithSensitiveData) {
    this.includeRecordingsWithSensitiveData = includeRecordingsWithSensitiveData;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to include recordings with PCI DSS and/or PII data, default value = false ")
  @JsonProperty("includeRecordingsWithSensitiveData")
  public Boolean getIncludeRecordingsWithSensitiveData() {
    return includeRecordingsWithSensitiveData;
  }
  public void setIncludeRecordingsWithSensitiveData(Boolean includeRecordingsWithSensitiveData) {
    this.includeRecordingsWithSensitiveData = includeRecordingsWithSensitiveData;
  }


  /**
   * Whether to include Screen recordings for the action, default value = true 
   **/
  public RecordingJobsQuery includeScreenRecordings(Boolean includeScreenRecordings) {
    this.includeScreenRecordings = includeScreenRecordings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to include Screen recordings for the action, default value = true ")
  @JsonProperty("includeScreenRecordings")
  public Boolean getIncludeScreenRecordings() {
    return includeScreenRecordings;
  }
  public void setIncludeScreenRecordings(Boolean includeScreenRecordings) {
    this.includeScreenRecordings = includeScreenRecordings;
  }


  /**
   * For DELETE action, setting this to true will clear any pending exports for recordings. This field is only used for DELETE action. Default value = false
   **/
  public RecordingJobsQuery clearExport(Boolean clearExport) {
    this.clearExport = clearExport;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For DELETE action, setting this to true will clear any pending exports for recordings. This field is only used for DELETE action. Default value = false")
  @JsonProperty("clearExport")
  public Boolean getClearExport() {
    return clearExport;
  }
  public void setClearExport(Boolean clearExport) {
    this.clearExport = clearExport;
  }


  /**
   * Conversation Query. Note: After the recording is created, it might take up to 48 hours for the recording to be included in the submitted job query.  This result depends on the analytics data lake job completion. See also: https://developer.genesys.cloud/analyticsdatamanagement/analytics/jobs/conversation-details-job#data-availability.This is required only when querying for conversations lesser than 5 years.
   **/
  public RecordingJobsQuery conversationQuery(AsyncConversationQuery conversationQuery) {
    this.conversationQuery = conversationQuery;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Conversation Query. Note: After the recording is created, it might take up to 48 hours for the recording to be included in the submitted job query.  This result depends on the analytics data lake job completion. See also: https://developer.genesys.cloud/analyticsdatamanagement/analytics/jobs/conversation-details-job#data-availability.This is required only when querying for conversations lesser than 5 years.")
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
            Objects.equals(this.actionAge, recordingJobsQuery.actionAge) &&
            Objects.equals(this.screenRecordingActionDate, recordingJobsQuery.screenRecordingActionDate) &&
            Objects.equals(this.screenRecordingActionAge, recordingJobsQuery.screenRecordingActionAge) &&
            Objects.equals(this.integrationId, recordingJobsQuery.integrationId) &&
            Objects.equals(this.includeRecordingsWithSensitiveData, recordingJobsQuery.includeRecordingsWithSensitiveData) &&
            Objects.equals(this.includeScreenRecordings, recordingJobsQuery.includeScreenRecordings) &&
            Objects.equals(this.clearExport, recordingJobsQuery.clearExport) &&
            Objects.equals(this.conversationQuery, recordingJobsQuery.conversationQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, actionDate, actionAge, screenRecordingActionDate, screenRecordingActionAge, integrationId, includeRecordingsWithSensitiveData, includeScreenRecordings, clearExport, conversationQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingJobsQuery {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    actionDate: ").append(toIndentedString(actionDate)).append("\n");
    sb.append("    actionAge: ").append(toIndentedString(actionAge)).append("\n");
    sb.append("    screenRecordingActionDate: ").append(toIndentedString(screenRecordingActionDate)).append("\n");
    sb.append("    screenRecordingActionAge: ").append(toIndentedString(screenRecordingActionAge)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    includeRecordingsWithSensitiveData: ").append(toIndentedString(includeRecordingsWithSensitiveData)).append("\n");
    sb.append("    includeScreenRecordings: ").append(toIndentedString(includeScreenRecordings)).append("\n");
    sb.append("    clearExport: ").append(toIndentedString(clearExport)).append("\n");
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

