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

import java.io.Serializable;
/**
 * GroupSettings
 */

public class GroupSettings  implements Serializable {
  
  private Integer minimumGroupSize = null;
  private Integer maximumGroupSize = null;
  private Integer maximumTotalSessions = null;
  private Integer maximumConcurrentSessions = null;

  public GroupSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The minimum size of a group for a session
   **/
  public GroupSettings minimumGroupSize(Integer minimumGroupSize) {
    this.minimumGroupSize = minimumGroupSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum size of a group for a session")
  @JsonProperty("minimumGroupSize")
  public Integer getMinimumGroupSize() {
    return minimumGroupSize;
  }
  public void setMinimumGroupSize(Integer minimumGroupSize) {
    this.minimumGroupSize = minimumGroupSize;
  }


  /**
   * The maximum size of a group for a session
   **/
  public GroupSettings maximumGroupSize(Integer maximumGroupSize) {
    this.maximumGroupSize = maximumGroupSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum size of a group for a session")
  @JsonProperty("maximumGroupSize")
  public Integer getMaximumGroupSize() {
    return maximumGroupSize;
  }
  public void setMaximumGroupSize(Integer maximumGroupSize) {
    this.maximumGroupSize = maximumGroupSize;
  }


  /**
   * The maximum total number of sessions
   **/
  public GroupSettings maximumTotalSessions(Integer maximumTotalSessions) {
    this.maximumTotalSessions = maximumTotalSessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum total number of sessions")
  @JsonProperty("maximumTotalSessions")
  public Integer getMaximumTotalSessions() {
    return maximumTotalSessions;
  }
  public void setMaximumTotalSessions(Integer maximumTotalSessions) {
    this.maximumTotalSessions = maximumTotalSessions;
  }


  /**
   * The maximum number of sessions that can be scheduled concurrently
   **/
  public GroupSettings maximumConcurrentSessions(Integer maximumConcurrentSessions) {
    this.maximumConcurrentSessions = maximumConcurrentSessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum number of sessions that can be scheduled concurrently")
  @JsonProperty("maximumConcurrentSessions")
  public Integer getMaximumConcurrentSessions() {
    return maximumConcurrentSessions;
  }
  public void setMaximumConcurrentSessions(Integer maximumConcurrentSessions) {
    this.maximumConcurrentSessions = maximumConcurrentSessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupSettings groupSettings = (GroupSettings) o;

    return Objects.equals(this.minimumGroupSize, groupSettings.minimumGroupSize) &&
            Objects.equals(this.maximumGroupSize, groupSettings.maximumGroupSize) &&
            Objects.equals(this.maximumTotalSessions, groupSettings.maximumTotalSessions) &&
            Objects.equals(this.maximumConcurrentSessions, groupSettings.maximumConcurrentSessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(minimumGroupSize, maximumGroupSize, maximumTotalSessions, maximumConcurrentSessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupSettings {\n");
    
    sb.append("    minimumGroupSize: ").append(toIndentedString(minimumGroupSize)).append("\n");
    sb.append("    maximumGroupSize: ").append(toIndentedString(maximumGroupSize)).append("\n");
    sb.append("    maximumTotalSessions: ").append(toIndentedString(maximumTotalSessions)).append("\n");
    sb.append("    maximumConcurrentSessions: ").append(toIndentedString(maximumConcurrentSessions)).append("\n");
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

