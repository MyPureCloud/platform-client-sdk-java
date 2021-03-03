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
import com.mypurecloud.sdk.v2.model.ActivityCode;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * Container for a map of ActivityCodeId to ActivityCode
 */
@ApiModel(description = "Container for a map of ActivityCodeId to ActivityCode")

public class ActivityCodeContainer  implements Serializable {
  
  private Map<String, ActivityCode> activityCodes = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * Map of activity code id to activity code
   **/
  public ActivityCodeContainer activityCodes(Map<String, ActivityCode> activityCodes) {
    this.activityCodes = activityCodes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Map of activity code id to activity code")
  @JsonProperty("activityCodes")
  public Map<String, ActivityCode> getActivityCodes() {
    return activityCodes;
  }
  public void setActivityCodes(Map<String, ActivityCode> activityCodes) {
    this.activityCodes = activityCodes;
  }

  
  /**
   * Version metadata for the associated management unit's list of activity codes
   **/
  public ActivityCodeContainer metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the associated management unit's list of activity codes")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityCodeContainer activityCodeContainer = (ActivityCodeContainer) o;
    return Objects.equals(this.activityCodes, activityCodeContainer.activityCodes) &&
        Objects.equals(this.metadata, activityCodeContainer.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityCodes, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityCodeContainer {\n");
    
    sb.append("    activityCodes: ").append(toIndentedString(activityCodes)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

