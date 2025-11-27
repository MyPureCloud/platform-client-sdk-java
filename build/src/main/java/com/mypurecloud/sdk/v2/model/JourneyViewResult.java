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
import com.mypurecloud.sdk.v2.model.JourneyViewChartResult;
import com.mypurecloud.sdk.v2.model.JourneyViewResultElement;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A journey view result
 */
@ApiModel(description = "A journey view result")

public class JourneyViewResult  implements Serializable {
  
  private List<JourneyViewResultElement> elements = null;
  private List<JourneyViewChartResult> charts = null;

  public JourneyViewResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      elements = new ArrayList<JourneyViewResultElement>();
      charts = new ArrayList<JourneyViewChartResult>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The elements within the journey view result")
  @JsonProperty("elements")
  public List<JourneyViewResultElement> getElements() {
    return elements;
  }


  @ApiModelProperty(example = "null", value = "The chart results within the journey view result")
  @JsonProperty("charts")
  public List<JourneyViewChartResult> getCharts() {
    return charts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewResult journeyViewResult = (JourneyViewResult) o;

    return Objects.equals(this.elements, journeyViewResult.elements) &&
            Objects.equals(this.charts, journeyViewResult.charts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elements, charts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewResult {\n");
    
    sb.append("    elements: ").append(toIndentedString(elements)).append("\n");
    sb.append("    charts: ").append(toIndentedString(charts)).append("\n");
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

