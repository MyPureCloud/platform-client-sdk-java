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
 * V2WemEngagementCelebrationUpdatesTopicContestPrizes
 */

public class V2WemEngagementCelebrationUpdatesTopicContestPrizes  implements Serializable {
  
  private Integer tier = null;
  private String name = null;
  private String imageId = null;

  
  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestPrizes tier(Integer tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("tier")
  public Integer getTier() {
    return tier;
  }
  public void setTier(Integer tier) {
    this.tier = tier;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestPrizes name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestPrizes imageId(String imageId) {
    this.imageId = imageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("imageId")
  public String getImageId() {
    return imageId;
  }
  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WemEngagementCelebrationUpdatesTopicContestPrizes v2WemEngagementCelebrationUpdatesTopicContestPrizes = (V2WemEngagementCelebrationUpdatesTopicContestPrizes) o;

    return Objects.equals(this.tier, v2WemEngagementCelebrationUpdatesTopicContestPrizes.tier) &&
            Objects.equals(this.name, v2WemEngagementCelebrationUpdatesTopicContestPrizes.name) &&
            Objects.equals(this.imageId, v2WemEngagementCelebrationUpdatesTopicContestPrizes.imageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tier, name, imageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WemEngagementCelebrationUpdatesTopicContestPrizes {\n");
    
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
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

