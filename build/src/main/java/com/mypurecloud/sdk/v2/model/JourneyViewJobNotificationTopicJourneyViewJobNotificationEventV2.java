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
import com.mypurecloud.sdk.v2.model.JourneyViewJobNotificationTopicJourneyView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2
 */

public class JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2  implements Serializable {
  
  private String id = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    ACCEPTED("Accepted"),
    EXECUTING("Executing"),
    COMPLETE("Complete"),
    FAILED("Failed"),
    CANCELLED("Cancelled"),
    SCHEDULED("Scheduled");

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
  private String dateCreated = null;
  private String dateCompleted = null;
  private JourneyViewJobNotificationTopicJourneyView journeyView = null;
  private String dateCompletionEstimated = null;
  private Long estimatedCompletionMargin = null;
  private String userId = null;

  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 id(String id) {
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
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 dateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public String getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(String dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 dateCompleted(String dateCompleted) {
    this.dateCompleted = dateCompleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCompleted")
  public String getDateCompleted() {
    return dateCompleted;
  }
  public void setDateCompleted(String dateCompleted) {
    this.dateCompleted = dateCompleted;
  }


  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 journeyView(JourneyViewJobNotificationTopicJourneyView journeyView) {
    this.journeyView = journeyView;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("journeyView")
  public JourneyViewJobNotificationTopicJourneyView getJourneyView() {
    return journeyView;
  }
  public void setJourneyView(JourneyViewJobNotificationTopicJourneyView journeyView) {
    this.journeyView = journeyView;
  }


  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 dateCompletionEstimated(String dateCompletionEstimated) {
    this.dateCompletionEstimated = dateCompletionEstimated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCompletionEstimated")
  public String getDateCompletionEstimated() {
    return dateCompletionEstimated;
  }
  public void setDateCompletionEstimated(String dateCompletionEstimated) {
    this.dateCompletionEstimated = dateCompletionEstimated;
  }


  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 estimatedCompletionMargin(Long estimatedCompletionMargin) {
    this.estimatedCompletionMargin = estimatedCompletionMargin;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("estimatedCompletionMargin")
  public Long getEstimatedCompletionMargin() {
    return estimatedCompletionMargin;
  }
  public void setEstimatedCompletionMargin(Long estimatedCompletionMargin) {
    this.estimatedCompletionMargin = estimatedCompletionMargin;
  }


  /**
   **/
  public JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2 = (JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2) o;

    return Objects.equals(this.id, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.id) &&
            Objects.equals(this.status, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.status) &&
            Objects.equals(this.dateCreated, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.dateCreated) &&
            Objects.equals(this.dateCompleted, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.dateCompleted) &&
            Objects.equals(this.journeyView, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.journeyView) &&
            Objects.equals(this.dateCompletionEstimated, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.dateCompletionEstimated) &&
            Objects.equals(this.estimatedCompletionMargin, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.estimatedCompletionMargin) &&
            Objects.equals(this.userId, journeyViewJobNotificationTopicJourneyViewJobNotificationEventV2.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, dateCreated, dateCompleted, journeyView, dateCompletionEstimated, estimatedCompletionMargin, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewJobNotificationTopicJourneyViewJobNotificationEventV2 {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    journeyView: ").append(toIndentedString(journeyView)).append("\n");
    sb.append("    dateCompletionEstimated: ").append(toIndentedString(dateCompletionEstimated)).append("\n");
    sb.append("    estimatedCompletionMargin: ").append(toIndentedString(estimatedCompletionMargin)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

