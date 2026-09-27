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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * UpdateAdherenceAdjustmentAdminRequest
 */

public class UpdateAdherenceAdjustmentAdminRequest  implements Serializable {
  
  private String reasonCodeId = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String reviewerNotes = null;

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
   * The new status for the adherence adjustment
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    DENIED("Denied"),
    PENDING("Pending");

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

  public UpdateAdherenceAdjustmentAdminRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UpdateAdherenceAdjustmentAdminRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the reason code for this adherence adjustment
   **/
  public UpdateAdherenceAdjustmentAdminRequest reasonCodeId(String reasonCodeId) {
    this.reasonCodeId = reasonCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the reason code for this adherence adjustment")
  @JsonProperty("reasonCodeId")
  public String getReasonCodeId() {
    return reasonCodeId;
  }
  public void setReasonCodeId(String reasonCodeId) {
    this.reasonCodeId = reasonCodeId;
  }


  /**
   * The start timestamp of the adherence adjustment in ISO-8601 format
   **/
  public UpdateAdherenceAdjustmentAdminRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start timestamp of the adherence adjustment in ISO-8601 format")
  @JsonProperty("startDate")
  public Date getStartDate() {
    return startDate;
  }
  public void setStartDate(Date startDate) {
    this.startDate = startDate;
  }


  /**
   * The length of the adherence adjustment in minutes
   **/
  public UpdateAdherenceAdjustmentAdminRequest lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The length of the adherence adjustment in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * Version metadata for the adherence adjustment
   **/
  public UpdateAdherenceAdjustmentAdminRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the adherence adjustment")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Notes provided by the reviewer for this adherence adjustment
   **/
  public UpdateAdherenceAdjustmentAdminRequest reviewerNotes(String reviewerNotes) {
    this.reviewerNotes = reviewerNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes provided by the reviewer for this adherence adjustment")
  @JsonProperty("reviewerNotes")
  public String getReviewerNotes() {
    return reviewerNotes;
  }
  public void setReviewerNotes(String reviewerNotes) {
    this.reviewerNotes = reviewerNotes;
  }


  /**
   * The new status for the adherence adjustment
   **/
  public UpdateAdherenceAdjustmentAdminRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The new status for the adherence adjustment")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateAdherenceAdjustmentAdminRequest updateAdherenceAdjustmentAdminRequest = (UpdateAdherenceAdjustmentAdminRequest) o;

    return Objects.equals(this.reasonCodeId, updateAdherenceAdjustmentAdminRequest.reasonCodeId) &&
            Objects.equals(this.startDate, updateAdherenceAdjustmentAdminRequest.startDate) &&
            Objects.equals(this.lengthMinutes, updateAdherenceAdjustmentAdminRequest.lengthMinutes) &&
            Objects.equals(this.metadata, updateAdherenceAdjustmentAdminRequest.metadata) &&
            Objects.equals(this.reviewerNotes, updateAdherenceAdjustmentAdminRequest.reviewerNotes) &&
            Objects.equals(this.status, updateAdherenceAdjustmentAdminRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCodeId, startDate, lengthMinutes, metadata, reviewerNotes, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateAdherenceAdjustmentAdminRequest {\n");
    
    sb.append("    reasonCodeId: ").append(toIndentedString(reasonCodeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    reviewerNotes: ").append(toIndentedString(reviewerNotes)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

