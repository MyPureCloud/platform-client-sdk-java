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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * BulkOpportunityEnrollmentsStatusUpdateRequest
 */

public class BulkOpportunityEnrollmentsStatusUpdateRequest  implements Serializable {
  
  private List<String> enrollmentIds = null;

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
   * The status to set for all enrollments specified in this request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    DENIED("Denied");

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
  private String reviewNote = null;

  public BulkOpportunityEnrollmentsStatusUpdateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      enrollmentIds = new ArrayList<String>();
    }
  }

  public BulkOpportunityEnrollmentsStatusUpdateRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      enrollmentIds = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the enrollments to update
   **/
  public BulkOpportunityEnrollmentsStatusUpdateRequest enrollmentIds(List<String> enrollmentIds) {
    this.enrollmentIds = enrollmentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the enrollments to update")
  @JsonProperty("enrollmentIds")
  public List<String> getEnrollmentIds() {
    return enrollmentIds;
  }
  public void setEnrollmentIds(List<String> enrollmentIds) {
    this.enrollmentIds = enrollmentIds;
  }


  /**
   * The status to set for all enrollments specified in this request
   **/
  public BulkOpportunityEnrollmentsStatusUpdateRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status to set for all enrollments specified in this request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Supervisor's note explaining the agent's enrollment status change
   **/
  public BulkOpportunityEnrollmentsStatusUpdateRequest reviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Supervisor's note explaining the agent's enrollment status change")
  @JsonProperty("reviewNote")
  public String getReviewNote() {
    return reviewNote;
  }
  public void setReviewNote(String reviewNote) {
    this.reviewNote = reviewNote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BulkOpportunityEnrollmentsStatusUpdateRequest bulkOpportunityEnrollmentsStatusUpdateRequest = (BulkOpportunityEnrollmentsStatusUpdateRequest) o;

    return Objects.equals(this.enrollmentIds, bulkOpportunityEnrollmentsStatusUpdateRequest.enrollmentIds) &&
            Objects.equals(this.status, bulkOpportunityEnrollmentsStatusUpdateRequest.status) &&
            Objects.equals(this.reviewNote, bulkOpportunityEnrollmentsStatusUpdateRequest.reviewNote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enrollmentIds, status, reviewNote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BulkOpportunityEnrollmentsStatusUpdateRequest {\n");
    
    sb.append("    enrollmentIds: ").append(toIndentedString(enrollmentIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    reviewNote: ").append(toIndentedString(reviewNote)).append("\n");
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

