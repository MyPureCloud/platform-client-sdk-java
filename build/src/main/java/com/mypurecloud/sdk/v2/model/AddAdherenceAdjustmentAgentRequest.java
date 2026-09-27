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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * AddAdherenceAdjustmentAgentRequest
 */

public class AddAdherenceAdjustmentAgentRequest  implements Serializable {
  
  private String reasonCodeId = null;
  private Date startDate = null;
  private Integer lengthMinutes = null;
  private String submitterNotes = null;

  public AddAdherenceAdjustmentAgentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AddAdherenceAdjustmentAgentRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the reason code for this adherence adjustment
   **/
  public AddAdherenceAdjustmentAgentRequest reasonCodeId(String reasonCodeId) {
    this.reasonCodeId = reasonCodeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the reason code for this adherence adjustment")
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
  public AddAdherenceAdjustmentAgentRequest startDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start timestamp of the adherence adjustment in ISO-8601 format")
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
  public AddAdherenceAdjustmentAgentRequest lengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The length of the adherence adjustment in minutes")
  @JsonProperty("lengthMinutes")
  public Integer getLengthMinutes() {
    return lengthMinutes;
  }
  public void setLengthMinutes(Integer lengthMinutes) {
    this.lengthMinutes = lengthMinutes;
  }


  /**
   * Notes provided by the submitter for this adherence adjustment
   **/
  public AddAdherenceAdjustmentAgentRequest submitterNotes(String submitterNotes) {
    this.submitterNotes = submitterNotes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Notes provided by the submitter for this adherence adjustment")
  @JsonProperty("submitterNotes")
  public String getSubmitterNotes() {
    return submitterNotes;
  }
  public void setSubmitterNotes(String submitterNotes) {
    this.submitterNotes = submitterNotes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddAdherenceAdjustmentAgentRequest addAdherenceAdjustmentAgentRequest = (AddAdherenceAdjustmentAgentRequest) o;

    return Objects.equals(this.reasonCodeId, addAdherenceAdjustmentAgentRequest.reasonCodeId) &&
            Objects.equals(this.startDate, addAdherenceAdjustmentAgentRequest.startDate) &&
            Objects.equals(this.lengthMinutes, addAdherenceAdjustmentAgentRequest.lengthMinutes) &&
            Objects.equals(this.submitterNotes, addAdherenceAdjustmentAgentRequest.submitterNotes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reasonCodeId, startDate, lengthMinutes, submitterNotes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddAdherenceAdjustmentAgentRequest {\n");
    
    sb.append("    reasonCodeId: ").append(toIndentedString(reasonCodeId)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    lengthMinutes: ").append(toIndentedString(lengthMinutes)).append("\n");
    sb.append("    submitterNotes: ").append(toIndentedString(submitterNotes)).append("\n");
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

