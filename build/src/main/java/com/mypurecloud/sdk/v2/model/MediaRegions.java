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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * MediaRegions
 */

public class MediaRegions  implements Serializable {
  
  private String awsHomeRegion = null;
  private List<String> awsCoreRegions = new ArrayList<String>();
  private List<String> awsSatelliteRegions = new ArrayList<String>();

  
  @ApiModelProperty(example = "null", value = "The AWS region your organization is in.")
  @JsonProperty("awsHomeRegion")
  public String getAwsHomeRegion() {
    return awsHomeRegion;
  }


  @ApiModelProperty(example = "null", value = "The list of AWS regions to which Genesys Cloud is deployed with full functionality including media streaming.")
  @JsonProperty("awsCoreRegions")
  public List<String> getAwsCoreRegions() {
    return awsCoreRegions;
  }


  @ApiModelProperty(example = "null", value = "The list of AWS regions that Genesys Cloud uses only for media streaming.")
  @JsonProperty("awsSatelliteRegions")
  public List<String> getAwsSatelliteRegions() {
    return awsSatelliteRegions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaRegions mediaRegions = (MediaRegions) o;

    return Objects.equals(this.awsHomeRegion, mediaRegions.awsHomeRegion) &&
            Objects.equals(this.awsCoreRegions, mediaRegions.awsCoreRegions) &&
            Objects.equals(this.awsSatelliteRegions, mediaRegions.awsSatelliteRegions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsHomeRegion, awsCoreRegions, awsSatelliteRegions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaRegions {\n");
    
    sb.append("    awsHomeRegion: ").append(toIndentedString(awsHomeRegion)).append("\n");
    sb.append("    awsCoreRegions: ").append(toIndentedString(awsCoreRegions)).append("\n");
    sb.append("    awsSatelliteRegions: ").append(toIndentedString(awsSatelliteRegions)).append("\n");
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

