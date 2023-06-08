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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ParticipantInfo
 */

public class ParticipantInfo  implements Serializable {
  
  private Integer activeParticipantCount = null;
  private Integer version = null;

  
  /**
   * The number of active participants in the video conference.
   **/
  public ParticipantInfo activeParticipantCount(Integer activeParticipantCount) {
    this.activeParticipantCount = activeParticipantCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of active participants in the video conference.")
  @JsonProperty("activeParticipantCount")
  public Integer getActiveParticipantCount() {
    return activeParticipantCount;
  }
  public void setActiveParticipantCount(Integer activeParticipantCount) {
    this.activeParticipantCount = activeParticipantCount;
  }


  /**
   * The version of the participant count.
   **/
  public ParticipantInfo version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the participant count.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantInfo participantInfo = (ParticipantInfo) o;

    return Objects.equals(this.activeParticipantCount, participantInfo.activeParticipantCount) &&
            Objects.equals(this.version, participantInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeParticipantCount, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantInfo {\n");
    
    sb.append("    activeParticipantCount: ").append(toIndentedString(activeParticipantCount)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

