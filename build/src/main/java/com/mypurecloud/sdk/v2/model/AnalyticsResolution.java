package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AnalyticsResolution
 */

public class AnalyticsResolution  implements Serializable {
  
  private String queueId = null;
  private String userId = null;
  private Long getnNextContactAvoided = null;

  
  /**
   * The ID of the last queue on which the conversation was handled.
   **/
  public AnalyticsResolution queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the last queue on which the conversation was handled.")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
  }

  
  /**
   * The ID of the last user who handled the conversation.
   **/
  public AnalyticsResolution userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the last user who handled the conversation.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * The number of interactions for which next contact was avoided.
   **/
  public AnalyticsResolution getnNextContactAvoided(Long getnNextContactAvoided) {
    this.getnNextContactAvoided = getnNextContactAvoided;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of interactions for which next contact was avoided.")
  @JsonProperty("getnNextContactAvoided")
  public Long getGetnNextContactAvoided() {
    return getnNextContactAvoided;
  }
  public void setGetnNextContactAvoided(Long getnNextContactAvoided) {
    this.getnNextContactAvoided = getnNextContactAvoided;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsResolution analyticsResolution = (AnalyticsResolution) o;
    return Objects.equals(this.queueId, analyticsResolution.queueId) &&
        Objects.equals(this.userId, analyticsResolution.userId) &&
        Objects.equals(this.getnNextContactAvoided, analyticsResolution.getnNextContactAvoided);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queueId, userId, getnNextContactAvoided);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsResolution {\n");
    
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    getnNextContactAvoided: ").append(toIndentedString(getnNextContactAvoided)).append("\n");
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

