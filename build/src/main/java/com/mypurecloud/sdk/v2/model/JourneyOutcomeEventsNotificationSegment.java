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
 * JourneyOutcomeEventsNotificationSegment
 */

public class JourneyOutcomeEventsNotificationSegment  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private Date assignedDate = null;

  
  /**
   **/
  public JourneyOutcomeEventsNotificationSegment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationSegment selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationSegment assignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("assignedDate")
  public Date getAssignedDate() {
    return assignedDate;
  }
  public void setAssignedDate(Date assignedDate) {
    this.assignedDate = assignedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyOutcomeEventsNotificationSegment journeyOutcomeEventsNotificationSegment = (JourneyOutcomeEventsNotificationSegment) o;
    return Objects.equals(this.id, journeyOutcomeEventsNotificationSegment.id) &&
        Objects.equals(this.selfUri, journeyOutcomeEventsNotificationSegment.selfUri) &&
        Objects.equals(this.assignedDate, journeyOutcomeEventsNotificationSegment.assignedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, assignedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationSegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    assignedDate: ").append(toIndentedString(assignedDate)).append("\n");
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

