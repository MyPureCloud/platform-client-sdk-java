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
import com.mypurecloud.sdk.v2.model.GroupByAttribute;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyViewChartMetricResultValue
 */

public class JourneyViewChartMetricResultValue  implements Serializable {
  
  private Integer value = null;
  private List<GroupByAttribute> groupByAttributes = null;

  public JourneyViewChartMetricResultValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      groupByAttributes = new ArrayList<GroupByAttribute>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "Value for this metric")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }


  @ApiModelProperty(example = "null", value = "Group by attributes for this metric")
  @JsonProperty("groupByAttributes")
  public List<GroupByAttribute> getGroupByAttributes() {
    return groupByAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewChartMetricResultValue journeyViewChartMetricResultValue = (JourneyViewChartMetricResultValue) o;

    return Objects.equals(this.value, journeyViewChartMetricResultValue.value) &&
            Objects.equals(this.groupByAttributes, journeyViewChartMetricResultValue.groupByAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, groupByAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewChartMetricResultValue {\n");
    
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    groupByAttributes: ").append(toIndentedString(groupByAttributes)).append("\n");
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

