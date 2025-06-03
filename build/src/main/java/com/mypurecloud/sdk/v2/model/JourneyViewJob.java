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
import com.mypurecloud.sdk.v2.model.JourneyView;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * JourneyViewJob
 */

public class JourneyViewJob  implements Serializable {
  
  private String id = null;
  private Date dateCreated = null;
  private Date dateCompleted = null;

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
   * The status of the job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private JourneyView journeyView = null;
  private Date dateCompletionEstimated = null;
  private Long estimatedCompletionMargin = null;
  private String userId = null;
  private String selfUri = null;

  public JourneyViewJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", required = true, value = "Timestamp of execution. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", required = true, value = "Timestamp of completion. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }


  /**
   * The status of the job
   **/
  public JourneyViewJob status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The journey view for which the job is executed
   **/
  public JourneyViewJob journeyView(JourneyView journeyView) {
    this.journeyView = journeyView;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The journey view for which the job is executed")
  @JsonProperty("journeyView")
  public JourneyView getJourneyView() {
    return journeyView;
  }
  public void setJourneyView(JourneyView journeyView) {
    this.journeyView = journeyView;
  }


  @ApiModelProperty(example = "null", required = true, value = "Timestamp for the estimated time of completion. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompletionEstimated")
  public Date getDateCompletionEstimated() {
    return dateCompletionEstimated;
  }


  @ApiModelProperty(example = "null", required = true, value = "Margin of error of the estimated time of completion")
  @JsonProperty("estimatedCompletionMargin")
  public Long getEstimatedCompletionMargin() {
    return estimatedCompletionMargin;
  }


  @ApiModelProperty(example = "null", required = true, value = "Id of the user who submitted the request")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
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
    JourneyViewJob journeyViewJob = (JourneyViewJob) o;

    return Objects.equals(this.id, journeyViewJob.id) &&
            Objects.equals(this.dateCreated, journeyViewJob.dateCreated) &&
            Objects.equals(this.dateCompleted, journeyViewJob.dateCompleted) &&
            Objects.equals(this.status, journeyViewJob.status) &&
            Objects.equals(this.journeyView, journeyViewJob.journeyView) &&
            Objects.equals(this.dateCompletionEstimated, journeyViewJob.dateCompletionEstimated) &&
            Objects.equals(this.estimatedCompletionMargin, journeyViewJob.estimatedCompletionMargin) &&
            Objects.equals(this.userId, journeyViewJob.userId) &&
            Objects.equals(this.selfUri, journeyViewJob.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCreated, dateCompleted, status, journeyView, dateCompletionEstimated, estimatedCompletionMargin, userId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    journeyView: ").append(toIndentedString(journeyView)).append("\n");
    sb.append("    dateCompletionEstimated: ").append(toIndentedString(dateCompletionEstimated)).append("\n");
    sb.append("    estimatedCompletionMargin: ").append(toIndentedString(estimatedCompletionMargin)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

