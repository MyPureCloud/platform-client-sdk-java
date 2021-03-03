package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AddShiftTradeRequest
 */

public class AddShiftTradeRequest  implements Serializable {
  
  private String scheduleId = null;
  private String initiatingShiftId = null;
  private String receivingUserId = null;
  private Date expiration = null;
  private List<String> acceptableIntervals = new ArrayList<String>();

  
  /**
   * The ID of the schedule to which the initiating and receiving shifts belong
   **/
  public AddShiftTradeRequest scheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule to which the initiating and receiving shifts belong")
  @JsonProperty("scheduleId")
  public String getScheduleId() {
    return scheduleId;
  }
  public void setScheduleId(String scheduleId) {
    this.scheduleId = scheduleId;
  }

  
  /**
   * The ID of the shift that the initiating user wants to give up
   **/
  public AddShiftTradeRequest initiatingShiftId(String initiatingShiftId) {
    this.initiatingShiftId = initiatingShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the shift that the initiating user wants to give up")
  @JsonProperty("initiatingShiftId")
  public String getInitiatingShiftId() {
    return initiatingShiftId;
  }
  public void setInitiatingShiftId(String initiatingShiftId) {
    this.initiatingShiftId = initiatingShiftId;
  }

  
  /**
   * The ID of the user to whom to send the request (for use in direct trade requests)
   **/
  public AddShiftTradeRequest receivingUserId(String receivingUserId) {
    this.receivingUserId = receivingUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the user to whom to send the request (for use in direct trade requests)")
  @JsonProperty("receivingUserId")
  public String getReceivingUserId() {
    return receivingUserId;
  }
  public void setReceivingUserId(String receivingUserId) {
    this.receivingUserId = receivingUserId;
  }

  
  /**
   * When this shift trade request should expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public AddShiftTradeRequest expiration(Date expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "When this shift trade request should expire. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   **/
  public AddShiftTradeRequest acceptableIntervals(List<String> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptableIntervals")
  public List<String> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<String> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddShiftTradeRequest addShiftTradeRequest = (AddShiftTradeRequest) o;
    return Objects.equals(this.scheduleId, addShiftTradeRequest.scheduleId) &&
        Objects.equals(this.initiatingShiftId, addShiftTradeRequest.initiatingShiftId) &&
        Objects.equals(this.receivingUserId, addShiftTradeRequest.receivingUserId) &&
        Objects.equals(this.expiration, addShiftTradeRequest.expiration) &&
        Objects.equals(this.acceptableIntervals, addShiftTradeRequest.acceptableIntervals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scheduleId, initiatingShiftId, receivingUserId, expiration, acceptableIntervals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddShiftTradeRequest {\n");
    
    sb.append("    scheduleId: ").append(toIndentedString(scheduleId)).append("\n");
    sb.append("    initiatingShiftId: ").append(toIndentedString(initiatingShiftId)).append("\n");
    sb.append("    receivingUserId: ").append(toIndentedString(receivingUserId)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
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

