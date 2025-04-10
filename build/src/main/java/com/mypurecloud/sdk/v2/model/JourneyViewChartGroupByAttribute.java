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
 * A journey element attribute to group by within the chart
 */
@ApiModel(description = "A journey element attribute to group by within the chart")

public class JourneyViewChartGroupByAttribute  implements Serializable {
  
  private String elementId = null;
  private String attribute = null;

  public JourneyViewChartGroupByAttribute() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The element in the list of elements which is being grouped by
   **/
  public JourneyViewChartGroupByAttribute elementId(String elementId) {
    this.elementId = elementId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The element in the list of elements which is being grouped by")
  @JsonProperty("elementId")
  public String getElementId() {
    return elementId;
  }
  public void setElementId(String elementId) {
    this.elementId = elementId;
  }


  /**
   * The attribute of the element being grouped by
   **/
  public JourneyViewChartGroupByAttribute attribute(String attribute) {
    this.attribute = attribute;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The attribute of the element being grouped by")
  @JsonProperty("attribute")
  public String getAttribute() {
    return attribute;
  }
  public void setAttribute(String attribute) {
    this.attribute = attribute;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewChartGroupByAttribute journeyViewChartGroupByAttribute = (JourneyViewChartGroupByAttribute) o;

    return Objects.equals(this.elementId, journeyViewChartGroupByAttribute.elementId) &&
            Objects.equals(this.attribute, journeyViewChartGroupByAttribute.attribute);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elementId, attribute);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewChartGroupByAttribute {\n");
    
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    attribute: ").append(toIndentedString(attribute)).append("\n");
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

