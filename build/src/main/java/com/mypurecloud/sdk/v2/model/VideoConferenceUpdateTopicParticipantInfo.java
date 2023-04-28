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
 * VideoConferenceUpdateTopicParticipantInfo
 */

public class VideoConferenceUpdateTopicParticipantInfo  implements Serializable {
  
  private Integer activeParticipantCount = null;
  private Integer version = null;

  
  /**
   **/
  public VideoConferenceUpdateTopicParticipantInfo activeParticipantCount(Integer activeParticipantCount) {
    this.activeParticipantCount = activeParticipantCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("activeParticipantCount")
  public Integer getActiveParticipantCount() {
    return activeParticipantCount;
  }
  public void setActiveParticipantCount(Integer activeParticipantCount) {
    this.activeParticipantCount = activeParticipantCount;
  }


  /**
   **/
  public VideoConferenceUpdateTopicParticipantInfo version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    VideoConferenceUpdateTopicParticipantInfo videoConferenceUpdateTopicParticipantInfo = (VideoConferenceUpdateTopicParticipantInfo) o;

    return Objects.equals(this.activeParticipantCount, videoConferenceUpdateTopicParticipantInfo.activeParticipantCount) &&
            Objects.equals(this.version, videoConferenceUpdateTopicParticipantInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activeParticipantCount, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VideoConferenceUpdateTopicParticipantInfo {\n");
    
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

