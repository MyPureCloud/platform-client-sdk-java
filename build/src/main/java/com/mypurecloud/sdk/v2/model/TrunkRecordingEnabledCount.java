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

import java.io.Serializable;
/**
 * TrunkRecordingEnabledCount
 */

public class TrunkRecordingEnabledCount  implements Serializable {
  
  private Integer enabledCount = null;
  private Integer disabledCount = null;

  
  /**
   * The amount of trunks that have recording enabled
   **/
  public TrunkRecordingEnabledCount enabledCount(Integer enabledCount) {
    this.enabledCount = enabledCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of trunks that have recording enabled")
  @JsonProperty("enabledCount")
  public Integer getEnabledCount() {
    return enabledCount;
  }
  public void setEnabledCount(Integer enabledCount) {
    this.enabledCount = enabledCount;
  }

  
  /**
   * The amount of trunks that do not have recording enabled
   **/
  public TrunkRecordingEnabledCount disabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of trunks that do not have recording enabled")
  @JsonProperty("disabledCount")
  public Integer getDisabledCount() {
    return disabledCount;
  }
  public void setDisabledCount(Integer disabledCount) {
    this.disabledCount = disabledCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrunkRecordingEnabledCount trunkRecordingEnabledCount = (TrunkRecordingEnabledCount) o;
    return Objects.equals(this.enabledCount, trunkRecordingEnabledCount.enabledCount) &&
        Objects.equals(this.disabledCount, trunkRecordingEnabledCount.disabledCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabledCount, disabledCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrunkRecordingEnabledCount {\n");
    
    sb.append("    enabledCount: ").append(toIndentedString(enabledCount)).append("\n");
    sb.append("    disabledCount: ").append(toIndentedString(disabledCount)).append("\n");
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

