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
 * The metrics of an element or a link in journey 
 */
@ApiModel(description = "The metrics of an element or a link in journey ")

public class JourneyViewResultMetrics  implements Serializable {
  
  private Long participantCount = null;
  private Long activeCount = null;
  private Long completedCount = null;
  private Long dropoutCount = null;
  private Long flowCount = null;

  public JourneyViewResultMetrics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "number of external contacts who participated at the element")
  @JsonProperty("participantCount")
  public Long getParticipantCount() {
    return participantCount;
  }


  @ApiModelProperty(example = "null", value = "number of external contacts who could still complete the journey")
  @JsonProperty("activeCount")
  public Long getActiveCount() {
    return activeCount;
  }


  @ApiModelProperty(example = "null", value = "number of external contacts who completed the journey forward")
  @JsonProperty("completedCount")
  public Long getCompletedCount() {
    return completedCount;
  }


  @ApiModelProperty(example = "null", value = "number of external contacts who did not make it to the next element")
  @JsonProperty("dropoutCount")
  public Long getDropoutCount() {
    return dropoutCount;
  }


  @ApiModelProperty(example = "null", value = "number of external contacts who moved from one element to next element but did not complete the journey")
  @JsonProperty("flowCount")
  public Long getFlowCount() {
    return flowCount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewResultMetrics journeyViewResultMetrics = (JourneyViewResultMetrics) o;

    return Objects.equals(this.participantCount, journeyViewResultMetrics.participantCount) &&
            Objects.equals(this.activeCount, journeyViewResultMetrics.activeCount) &&
            Objects.equals(this.completedCount, journeyViewResultMetrics.completedCount) &&
            Objects.equals(this.dropoutCount, journeyViewResultMetrics.dropoutCount) &&
            Objects.equals(this.flowCount, journeyViewResultMetrics.flowCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participantCount, activeCount, completedCount, dropoutCount, flowCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewResultMetrics {\n");
    
    sb.append("    participantCount: ").append(toIndentedString(participantCount)).append("\n");
    sb.append("    activeCount: ").append(toIndentedString(activeCount)).append("\n");
    sb.append("    completedCount: ").append(toIndentedString(completedCount)).append("\n");
    sb.append("    dropoutCount: ").append(toIndentedString(dropoutCount)).append("\n");
    sb.append("    flowCount: ").append(toIndentedString(flowCount)).append("\n");
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

