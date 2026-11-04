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
 * SelfScheduleActivityMoveRequestItem
 */

public class SelfScheduleActivityMoveRequestItem  implements Serializable {
  
  private String offerJobId = null;
  private String referenceKey = null;
  private Date newDate = null;

  public SelfScheduleActivityMoveRequestItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SelfScheduleActivityMoveRequestItem(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the self-schedule offers job
   **/
  public SelfScheduleActivityMoveRequestItem offerJobId(String offerJobId) {
    this.offerJobId = offerJobId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the self-schedule offers job")
  @JsonProperty("offerJobId")
  public String getOfferJobId() {
    return offerJobId;
  }
  public void setOfferJobId(String offerJobId) {
    this.offerJobId = offerJobId;
  }


  /**
   * Unique identifier from the offer for an activity whose start time the user wants to change
   **/
  public SelfScheduleActivityMoveRequestItem referenceKey(String referenceKey) {
    this.referenceKey = referenceKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique identifier from the offer for an activity whose start time the user wants to change")
  @JsonProperty("referenceKey")
  public String getReferenceKey() {
    return referenceKey;
  }
  public void setReferenceKey(String referenceKey) {
    this.referenceKey = referenceKey;
  }


  /**
   * The new date/time for the activity in ISO-8601 format
   **/
  public SelfScheduleActivityMoveRequestItem newDate(Date newDate) {
    this.newDate = newDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new date/time for the activity in ISO-8601 format")
  @JsonProperty("newDate")
  public Date getNewDate() {
    return newDate;
  }
  public void setNewDate(Date newDate) {
    this.newDate = newDate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelfScheduleActivityMoveRequestItem selfScheduleActivityMoveRequestItem = (SelfScheduleActivityMoveRequestItem) o;

    return Objects.equals(this.offerJobId, selfScheduleActivityMoveRequestItem.offerJobId) &&
            Objects.equals(this.referenceKey, selfScheduleActivityMoveRequestItem.referenceKey) &&
            Objects.equals(this.newDate, selfScheduleActivityMoveRequestItem.newDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerJobId, referenceKey, newDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelfScheduleActivityMoveRequestItem {\n");
    
    sb.append("    offerJobId: ").append(toIndentedString(offerJobId)).append("\n");
    sb.append("    referenceKey: ").append(toIndentedString(referenceKey)).append("\n");
    sb.append("    newDate: ").append(toIndentedString(newDate)).append("\n");
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

