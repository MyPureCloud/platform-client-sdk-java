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
 * TextBotFlowMilestone
 */

public class TextBotFlowMilestone  implements Serializable {
  
  private String id = null;
  private Date dateReached = null;
  private Long sequence = null;

  
  /**
   * The Milestone's ID.
   **/
  public TextBotFlowMilestone id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Milestone's ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * The timestamp of when the milestone was reached. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TextBotFlowMilestone dateReached(Date dateReached) {
    this.dateReached = dateReached;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The timestamp of when the milestone was reached. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateReached")
  public Date getDateReached() {
    return dateReached;
  }
  public void setDateReached(Date dateReached) {
    this.dateReached = dateReached;
  }

  
  /**
   * The sequence number of the milestone.
   **/
  public TextBotFlowMilestone sequence(Long sequence) {
    this.sequence = sequence;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sequence number of the milestone.")
  @JsonProperty("sequence")
  public Long getSequence() {
    return sequence;
  }
  public void setSequence(Long sequence) {
    this.sequence = sequence;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotFlowMilestone textBotFlowMilestone = (TextBotFlowMilestone) o;
    return Objects.equals(this.id, textBotFlowMilestone.id) &&
        Objects.equals(this.dateReached, textBotFlowMilestone.dateReached) &&
        Objects.equals(this.sequence, textBotFlowMilestone.sequence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateReached, sequence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotFlowMilestone {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateReached: ").append(toIndentedString(dateReached)).append("\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
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

