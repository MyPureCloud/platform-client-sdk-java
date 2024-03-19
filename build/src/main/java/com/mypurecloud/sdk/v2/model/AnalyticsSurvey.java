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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AnalyticsSurvey
 */

public class AnalyticsSurvey  implements Serializable {
  
  private Date eventTime = null;
  private String queueId = null;
  private Date surveyCompletedDate = null;
  private String surveyFormContextId = null;
  private String surveyFormId = null;
  private String surveyFormName = null;
  private String surveyId = null;
  private Boolean surveyPartialResponse = null;
  private Integer surveyPromoterScore = null;
  private String surveyStatus = null;

  private static class SurveyTypeEnumDeserializer extends StdDeserializer<SurveyTypeEnum> {
    public SurveyTypeEnumDeserializer() {
      super(SurveyTypeEnumDeserializer.class);
    }

    @Override
    public SurveyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SurveyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the survey
   */
 @JsonDeserialize(using = SurveyTypeEnumDeserializer.class)
  public enum SurveyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WEB("Web"),
    VOICE("Voice");

    private String value;

    SurveyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SurveyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SurveyTypeEnum value : SurveyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SurveyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SurveyTypeEnum surveyType = null;
  private String userId = null;
  private Long oSurveyTotalScore = null;

  
  /**
   * Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AnalyticsSurvey eventTime(Date eventTime) {
    this.eventTime = eventTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specifies when an event occurred. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("eventTime")
  public Date getEventTime() {
    return eventTime;
  }
  public void setEventTime(Date eventTime) {
    this.eventTime = eventTime;
  }


  /**
   * The ID of the associated queue
   **/
  public AnalyticsSurvey queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the associated queue")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }


  /**
   * Completion datetime of the survey in ISO 8601 format
   **/
  public AnalyticsSurvey surveyCompletedDate(Date surveyCompletedDate) {
    this.surveyCompletedDate = surveyCompletedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Completion datetime of the survey in ISO 8601 format")
  @JsonProperty("surveyCompletedDate")
  public Date getSurveyCompletedDate() {
    return surveyCompletedDate;
  }
  public void setSurveyCompletedDate(Date surveyCompletedDate) {
    this.surveyCompletedDate = surveyCompletedDate;
  }


  /**
   * Unique identifier for the survey form, regardless of version
   **/
  public AnalyticsSurvey surveyFormContextId(String surveyFormContextId) {
    this.surveyFormContextId = surveyFormContextId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the survey form, regardless of version")
  @JsonProperty("surveyFormContextId")
  public String getSurveyFormContextId() {
    return surveyFormContextId;
  }
  public void setSurveyFormContextId(String surveyFormContextId) {
    this.surveyFormContextId = surveyFormContextId;
  }


  /**
   * ID of the survey form used
   **/
  public AnalyticsSurvey surveyFormId(String surveyFormId) {
    this.surveyFormId = surveyFormId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the survey form used")
  @JsonProperty("surveyFormId")
  public String getSurveyFormId() {
    return surveyFormId;
  }
  public void setSurveyFormId(String surveyFormId) {
    this.surveyFormId = surveyFormId;
  }


  /**
   * Name of the survey form used
   **/
  public AnalyticsSurvey surveyFormName(String surveyFormName) {
    this.surveyFormName = surveyFormName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the survey form used")
  @JsonProperty("surveyFormName")
  public String getSurveyFormName() {
    return surveyFormName;
  }
  public void setSurveyFormName(String surveyFormName) {
    this.surveyFormName = surveyFormName;
  }


  /**
   * ID of the survey
   **/
  public AnalyticsSurvey surveyId(String surveyId) {
    this.surveyId = surveyId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the survey")
  @JsonProperty("surveyId")
  public String getSurveyId() {
    return surveyId;
  }
  public void setSurveyId(String surveyId) {
    this.surveyId = surveyId;
  }


  /**
   * Whether the survey was completed with any required questions unanswered.
   **/
  public AnalyticsSurvey surveyPartialResponse(Boolean surveyPartialResponse) {
    this.surveyPartialResponse = surveyPartialResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the survey was completed with any required questions unanswered.")
  @JsonProperty("surveyPartialResponse")
  public Boolean getSurveyPartialResponse() {
    return surveyPartialResponse;
  }
  public void setSurveyPartialResponse(Boolean surveyPartialResponse) {
    this.surveyPartialResponse = surveyPartialResponse;
  }


  /**
   * Score of the survey used with NPS
   **/
  public AnalyticsSurvey surveyPromoterScore(Integer surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Score of the survey used with NPS")
  @JsonProperty("surveyPromoterScore")
  public Integer getSurveyPromoterScore() {
    return surveyPromoterScore;
  }
  public void setSurveyPromoterScore(Integer surveyPromoterScore) {
    this.surveyPromoterScore = surveyPromoterScore;
  }


  /**
   * The status of the survey
   **/
  public AnalyticsSurvey surveyStatus(String surveyStatus) {
    this.surveyStatus = surveyStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the survey")
  @JsonProperty("surveyStatus")
  public String getSurveyStatus() {
    return surveyStatus;
  }
  public void setSurveyStatus(String surveyStatus) {
    this.surveyStatus = surveyStatus;
  }


  /**
   * The type of the survey
   **/
  public AnalyticsSurvey surveyType(SurveyTypeEnum surveyType) {
    this.surveyType = surveyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the survey")
  @JsonProperty("surveyType")
  public SurveyTypeEnum getSurveyType() {
    return surveyType;
  }
  public void setSurveyType(SurveyTypeEnum surveyType) {
    this.surveyType = surveyType;
  }


  /**
   * ID of the agent the survey was performed against
   **/
  public AnalyticsSurvey userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the agent the survey was performed against")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   **/
  public AnalyticsSurvey oSurveyTotalScore(Long oSurveyTotalScore) {
    this.oSurveyTotalScore = oSurveyTotalScore;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oSurveyTotalScore")
  public Long getOSurveyTotalScore() {
    return oSurveyTotalScore;
  }
  public void setOSurveyTotalScore(Long oSurveyTotalScore) {
    this.oSurveyTotalScore = oSurveyTotalScore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsSurvey analyticsSurvey = (AnalyticsSurvey) o;

    return Objects.equals(this.eventTime, analyticsSurvey.eventTime) &&
            Objects.equals(this.queueId, analyticsSurvey.queueId) &&
            Objects.equals(this.surveyCompletedDate, analyticsSurvey.surveyCompletedDate) &&
            Objects.equals(this.surveyFormContextId, analyticsSurvey.surveyFormContextId) &&
            Objects.equals(this.surveyFormId, analyticsSurvey.surveyFormId) &&
            Objects.equals(this.surveyFormName, analyticsSurvey.surveyFormName) &&
            Objects.equals(this.surveyId, analyticsSurvey.surveyId) &&
            Objects.equals(this.surveyPartialResponse, analyticsSurvey.surveyPartialResponse) &&
            Objects.equals(this.surveyPromoterScore, analyticsSurvey.surveyPromoterScore) &&
            Objects.equals(this.surveyStatus, analyticsSurvey.surveyStatus) &&
            Objects.equals(this.surveyType, analyticsSurvey.surveyType) &&
            Objects.equals(this.userId, analyticsSurvey.userId) &&
            Objects.equals(this.oSurveyTotalScore, analyticsSurvey.oSurveyTotalScore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventTime, queueId, surveyCompletedDate, surveyFormContextId, surveyFormId, surveyFormName, surveyId, surveyPartialResponse, surveyPromoterScore, surveyStatus, surveyType, userId, oSurveyTotalScore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsSurvey {\n");
    
    sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    surveyCompletedDate: ").append(toIndentedString(surveyCompletedDate)).append("\n");
    sb.append("    surveyFormContextId: ").append(toIndentedString(surveyFormContextId)).append("\n");
    sb.append("    surveyFormId: ").append(toIndentedString(surveyFormId)).append("\n");
    sb.append("    surveyFormName: ").append(toIndentedString(surveyFormName)).append("\n");
    sb.append("    surveyId: ").append(toIndentedString(surveyId)).append("\n");
    sb.append("    surveyPartialResponse: ").append(toIndentedString(surveyPartialResponse)).append("\n");
    sb.append("    surveyPromoterScore: ").append(toIndentedString(surveyPromoterScore)).append("\n");
    sb.append("    surveyStatus: ").append(toIndentedString(surveyStatus)).append("\n");
    sb.append("    surveyType: ").append(toIndentedString(surveyType)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    oSurveyTotalScore: ").append(toIndentedString(oSurveyTotalScore)).append("\n");
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

