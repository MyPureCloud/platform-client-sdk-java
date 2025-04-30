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
 * WorkitemsEventsNotificationScoredAgent
 */

public class WorkitemsEventsNotificationScoredAgent  implements Serializable {
  
  private String id = null;
  private Long score = null;

  public WorkitemsEventsNotificationScoredAgent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public WorkitemsEventsNotificationScoredAgent id(String id) {
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
  public WorkitemsEventsNotificationScoredAgent score(Long score) {
    this.score = score;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("score")
  public Long getScore() {
    return score;
  }
  public void setScore(Long score) {
    this.score = score;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WorkitemsEventsNotificationScoredAgent workitemsEventsNotificationScoredAgent = (WorkitemsEventsNotificationScoredAgent) o;

    return Objects.equals(this.id, workitemsEventsNotificationScoredAgent.id) &&
            Objects.equals(this.score, workitemsEventsNotificationScoredAgent.score);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, score);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemsEventsNotificationScoredAgent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    score: ").append(toIndentedString(score)).append("\n");
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

