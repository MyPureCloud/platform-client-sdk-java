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
import java.util.Date;

import java.io.Serializable;
/**
 * Segment
 */

public class Segment  implements Serializable {
  
  private Date startTime = null;
  private Date endTime = null;
  private String type = null;
  private String howEnded = null;
  private String disconnectType = null;

  
  /**
   * The timestamp when this segment began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Segment startTime(Date startTime) {
    this.startTime = startTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp when this segment began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("startTime")
  public Date getStartTime() {
    return startTime;
  }
  public void setStartTime(Date startTime) {
    this.startTime = startTime;
  }

  
  /**
   * The timestamp when this segment ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public Segment endTime(Date endTime) {
    this.endTime = endTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp when this segment ended. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("endTime")
  public Date getEndTime() {
    return endTime;
  }
  public void setEndTime(Date endTime) {
    this.endTime = endTime;
  }

  
  /**
   * The activity taking place for the participant in the segment.
   **/
  public Segment type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The activity taking place for the participant in the segment.")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }

  
  /**
   * A description of the event that ended the segment.
   **/
  public Segment howEnded(String howEnded) {
    this.howEnded = howEnded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the event that ended the segment.")
  @JsonProperty("howEnded")
  public String getHowEnded() {
    return howEnded;
  }
  public void setHowEnded(String howEnded) {
    this.howEnded = howEnded;
  }

  
  /**
   * A description of the event that disconnected the segment
   **/
  public Segment disconnectType(String disconnectType) {
    this.disconnectType = disconnectType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the event that disconnected the segment")
  @JsonProperty("disconnectType")
  public String getDisconnectType() {
    return disconnectType;
  }
  public void setDisconnectType(String disconnectType) {
    this.disconnectType = disconnectType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Segment segment = (Segment) o;
    return Objects.equals(this.startTime, segment.startTime) &&
        Objects.equals(this.endTime, segment.endTime) &&
        Objects.equals(this.type, segment.type) &&
        Objects.equals(this.howEnded, segment.howEnded) &&
        Objects.equals(this.disconnectType, segment.disconnectType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startTime, endTime, type, howEnded, disconnectType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Segment {\n");
    
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    howEnded: ").append(toIndentedString(howEnded)).append("\n");
    sb.append("    disconnectType: ").append(toIndentedString(disconnectType)).append("\n");
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

