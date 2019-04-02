package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ShiftTradeResponseAcceptableIntervals;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * UpdateShiftTradeRequest
 */

public class UpdateShiftTradeRequest  implements Serializable {
  
  private String receivingUserId = null;
  private Date expiration = null;
  private List<ShiftTradeResponseAcceptableIntervals> acceptableIntervals = new ArrayList<ShiftTradeResponseAcceptableIntervals>();
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * Update the ID of the receiving user to direct the request at a specific user, or set to null to open up a trade to be matched by any user
   **/
  public UpdateShiftTradeRequest receivingUserId(String receivingUserId) {
    this.receivingUserId = receivingUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Update the ID of the receiving user to direct the request at a specific user, or set to null to open up a trade to be matched by any user")
  @JsonProperty("receivingUserId")
  public String getReceivingUserId() {
    return receivingUserId;
  }
  public void setReceivingUserId(String receivingUserId) {
    this.receivingUserId = receivingUserId;
  }

  
  /**
   * Update the expiration time for this shift trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public UpdateShiftTradeRequest expiration(Date expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Update the expiration time for this shift trade. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("expiration")
  public Date getExpiration() {
    return expiration;
  }
  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  
  /**
   **/
  public UpdateShiftTradeRequest acceptableIntervals(List<ShiftTradeResponseAcceptableIntervals> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("acceptableIntervals")
  public List<ShiftTradeResponseAcceptableIntervals> getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(List<ShiftTradeResponseAcceptableIntervals> acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }

  
  /**
   * Version metadata
   **/
  public UpdateShiftTradeRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateShiftTradeRequest updateShiftTradeRequest = (UpdateShiftTradeRequest) o;
    return Objects.equals(this.receivingUserId, updateShiftTradeRequest.receivingUserId) &&
        Objects.equals(this.expiration, updateShiftTradeRequest.expiration) &&
        Objects.equals(this.acceptableIntervals, updateShiftTradeRequest.acceptableIntervals) &&
        Objects.equals(this.metadata, updateShiftTradeRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receivingUserId, expiration, acceptableIntervals, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateShiftTradeRequest {\n");
    
    sb.append("    receivingUserId: ").append(toIndentedString(receivingUserId)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    acceptableIntervals: ").append(toIndentedString(acceptableIntervals)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

