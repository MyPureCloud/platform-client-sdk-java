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
 * LimitCount
 */

public class LimitCount  implements Serializable {
  
  private String name = null;
  private Long estimatedCount = null;
  private Long max = null;
  private String entityId = null;
  private String userId = null;

  
  /**
   * The name of the limit.
   **/
  public LimitCount name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the limit.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The total used count of the limit.
   **/
  public LimitCount estimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total used count of the limit.")
  @JsonProperty("estimatedCount")
  public Long getEstimatedCount() {
    return estimatedCount;
  }
  public void setEstimatedCount(Long estimatedCount) {
    this.estimatedCount = estimatedCount;
  }


  /**
   * The maximum value of the limit.
   **/
  public LimitCount max(Long max) {
    this.max = max;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum value of the limit.")
  @JsonProperty("max")
  public Long getMax() {
    return max;
  }
  public void setMax(Long max) {
    this.max = max;
  }


  /**
   * The entity which makes this count unique. The context of what the entity is would be dependant on the limit. May not be applicable for all limits.
   **/
  public LimitCount entityId(String entityId) {
    this.entityId = entityId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity which makes this count unique. The context of what the entity is would be dependant on the limit. May not be applicable for all limits.")
  @JsonProperty("entityId")
  public String getEntityId() {
    return entityId;
  }
  public void setEntityId(String entityId) {
    this.entityId = entityId;
  }


  /**
   * The user which makes this count unique. May not be applicable for all limits.
   **/
  public LimitCount userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user which makes this count unique. May not be applicable for all limits.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LimitCount limitCount = (LimitCount) o;

    return Objects.equals(this.name, limitCount.name) &&
            Objects.equals(this.estimatedCount, limitCount.estimatedCount) &&
            Objects.equals(this.max, limitCount.max) &&
            Objects.equals(this.entityId, limitCount.entityId) &&
            Objects.equals(this.userId, limitCount.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, estimatedCount, max, entityId, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitCount {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    estimatedCount: ").append(toIndentedString(estimatedCount)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    entityId: ").append(toIndentedString(entityId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

