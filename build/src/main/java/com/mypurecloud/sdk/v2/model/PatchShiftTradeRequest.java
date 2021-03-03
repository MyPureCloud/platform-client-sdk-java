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
import com.mypurecloud.sdk.v2.model.ListWrapperInterval;
import com.mypurecloud.sdk.v2.model.ValueWrapperDate;
import com.mypurecloud.sdk.v2.model.ValueWrapperString;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchShiftTradeRequest
 */

public class PatchShiftTradeRequest  implements Serializable {
  
  private ValueWrapperString receivingUserId = null;
  private ValueWrapperDate expiration = null;
  private ListWrapperInterval acceptableIntervals = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * Update the ID of the receiving user to direct the request at a specific user, or set the wrapped id to null to open up a trade to be matched by any user.
   **/
  public PatchShiftTradeRequest receivingUserId(ValueWrapperString receivingUserId) {
    this.receivingUserId = receivingUserId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Update the ID of the receiving user to direct the request at a specific user, or set the wrapped id to null to open up a trade to be matched by any user.")
  @JsonProperty("receivingUserId")
  public ValueWrapperString getReceivingUserId() {
    return receivingUserId;
  }
  public void setReceivingUserId(ValueWrapperString receivingUserId) {
    this.receivingUserId = receivingUserId;
  }

  
  /**
   * Update the expiration time for this shift trade.
   **/
  public PatchShiftTradeRequest expiration(ValueWrapperDate expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Update the expiration time for this shift trade.")
  @JsonProperty("expiration")
  public ValueWrapperDate getExpiration() {
    return expiration;
  }
  public void setExpiration(ValueWrapperDate expiration) {
    this.expiration = expiration;
  }

  
  /**
   * Update the acceptable intervals the initiating user is willing to accept in trade. Setting the enclosed list to empty will make this a one sided trade request
   **/
  public PatchShiftTradeRequest acceptableIntervals(ListWrapperInterval acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Update the acceptable intervals the initiating user is willing to accept in trade. Setting the enclosed list to empty will make this a one sided trade request")
  @JsonProperty("acceptableIntervals")
  public ListWrapperInterval getAcceptableIntervals() {
    return acceptableIntervals;
  }
  public void setAcceptableIntervals(ListWrapperInterval acceptableIntervals) {
    this.acceptableIntervals = acceptableIntervals;
  }

  
  /**
   * Version metadata
   **/
  public PatchShiftTradeRequest metadata(WfmVersionedEntityMetadata metadata) {
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
    PatchShiftTradeRequest patchShiftTradeRequest = (PatchShiftTradeRequest) o;
    return Objects.equals(this.receivingUserId, patchShiftTradeRequest.receivingUserId) &&
        Objects.equals(this.expiration, patchShiftTradeRequest.expiration) &&
        Objects.equals(this.acceptableIntervals, patchShiftTradeRequest.acceptableIntervals) &&
        Objects.equals(this.metadata, patchShiftTradeRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receivingUserId, expiration, acceptableIntervals, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchShiftTradeRequest {\n");
    
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

