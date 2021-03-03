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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MatchShiftTradeRequest
 */

public class MatchShiftTradeRequest  implements Serializable {
  
  private String receivingScheduleId = null;
  private String receivingShiftId = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The ID of the schedule with which the shift trade is associated
   **/
  public MatchShiftTradeRequest receivingScheduleId(String receivingScheduleId) {
    this.receivingScheduleId = receivingScheduleId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the schedule with which the shift trade is associated")
  @JsonProperty("receivingScheduleId")
  public String getReceivingScheduleId() {
    return receivingScheduleId;
  }
  public void setReceivingScheduleId(String receivingScheduleId) {
    this.receivingScheduleId = receivingScheduleId;
  }

  
  /**
   * The ID of the shift the receiving user is giving up in trade, if applicable
   **/
  public MatchShiftTradeRequest receivingShiftId(String receivingShiftId) {
    this.receivingShiftId = receivingShiftId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the shift the receiving user is giving up in trade, if applicable")
  @JsonProperty("receivingShiftId")
  public String getReceivingShiftId() {
    return receivingShiftId;
  }
  public void setReceivingShiftId(String receivingShiftId) {
    this.receivingShiftId = receivingShiftId;
  }

  
  /**
   * Version metadata for the shift trade
   **/
  public MatchShiftTradeRequest metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the shift trade")
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
    MatchShiftTradeRequest matchShiftTradeRequest = (MatchShiftTradeRequest) o;
    return Objects.equals(this.receivingScheduleId, matchShiftTradeRequest.receivingScheduleId) &&
        Objects.equals(this.receivingShiftId, matchShiftTradeRequest.receivingShiftId) &&
        Objects.equals(this.metadata, matchShiftTradeRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receivingScheduleId, receivingShiftId, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MatchShiftTradeRequest {\n");
    
    sb.append("    receivingScheduleId: ").append(toIndentedString(receivingScheduleId)).append("\n");
    sb.append("    receivingShiftId: ").append(toIndentedString(receivingShiftId)).append("\n");
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

