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
import com.mypurecloud.sdk.v2.model.JourneyViewResultLink;
import com.mypurecloud.sdk.v2.model.JourneyViewResultMetrics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * An element within a journey view result
 */
@ApiModel(description = "An element within a journey view result")

public class JourneyViewResultElement  implements Serializable {
  
  private String id = null;
  private JourneyViewResultMetrics metrics = null;
  private List<JourneyViewResultLink> followedBy = null;
  private String selfUri = null;

  public JourneyViewResultElement() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      followedBy = new ArrayList<JourneyViewResultLink>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "the metrics of the current element")
  @JsonProperty("metrics")
  public JourneyViewResultMetrics getMetrics() {
    return metrics;
  }


  @ApiModelProperty(example = "null", value = "the list of links following the current element in the journey")
  @JsonProperty("followedBy")
  public List<JourneyViewResultLink> getFollowedBy() {
    return followedBy;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewResultElement journeyViewResultElement = (JourneyViewResultElement) o;

    return Objects.equals(this.id, journeyViewResultElement.id) &&
            Objects.equals(this.metrics, journeyViewResultElement.metrics) &&
            Objects.equals(this.followedBy, journeyViewResultElement.followedBy) &&
            Objects.equals(this.selfUri, journeyViewResultElement.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, metrics, followedBy, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewResultElement {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    followedBy: ").append(toIndentedString(followedBy)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

