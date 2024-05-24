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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.JourneyViewChartDisplayAttributes;
import com.mypurecloud.sdk.v2.model.JourneyViewChartGroupByAttribute;
import com.mypurecloud.sdk.v2.model.JourneyViewChartMetric;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A chart within the context of the elements of the the journey view
 */
@ApiModel(description = "A chart within the context of the elements of the the journey view")

public class JourneyViewChart  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer version = null;

  private static class GroupByTimeEnumDeserializer extends StdDeserializer<GroupByTimeEnum> {
    public GroupByTimeEnumDeserializer() {
      super(GroupByTimeEnumDeserializer.class);
    }

    @Override
    public GroupByTimeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GroupByTimeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * A time unit to group the metrics by. There is a limit on the number of groupBy properties which can be specified.
   */
 @JsonDeserialize(using = GroupByTimeEnumDeserializer.class)
  public enum GroupByTimeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAY("Day"),
    WEEK("Week"),
    MONTH("Month"),
    YEAR("Year");

    private String value;

    GroupByTimeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupByTimeEnum fromString(String key) {
      if (key == null) return null;

      for (GroupByTimeEnum value : GroupByTimeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupByTimeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GroupByTimeEnum groupByTime = null;
  private List<JourneyViewChartGroupByAttribute> groupByAttributes = new ArrayList<JourneyViewChartGroupByAttribute>();
  private List<JourneyViewChartMetric> metrics = new ArrayList<JourneyViewChartMetric>();
  private JourneyViewChartDisplayAttributes displayAttributes = null;
  private Integer groupByMax = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public JourneyViewChart name(String name) {
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


  @ApiModelProperty(example = "null", value = "The version of the journey view chart")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }


  /**
   * A time unit to group the metrics by. There is a limit on the number of groupBy properties which can be specified.
   **/
  public JourneyViewChart groupByTime(GroupByTimeEnum groupByTime) {
    this.groupByTime = groupByTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A time unit to group the metrics by. There is a limit on the number of groupBy properties which can be specified.")
  @JsonProperty("groupByTime")
  public GroupByTimeEnum getGroupByTime() {
    return groupByTime;
  }
  public void setGroupByTime(GroupByTimeEnum groupByTime) {
    this.groupByTime = groupByTime;
  }


  /**
   * A list of attributes to group the metrics by. There is a limit on the number of groupBy properties which can be specified.
   **/
  public JourneyViewChart groupByAttributes(List<JourneyViewChartGroupByAttribute> groupByAttributes) {
    this.groupByAttributes = groupByAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of attributes to group the metrics by. There is a limit on the number of groupBy properties which can be specified.")
  @JsonProperty("groupByAttributes")
  public List<JourneyViewChartGroupByAttribute> getGroupByAttributes() {
    return groupByAttributes;
  }
  public void setGroupByAttributes(List<JourneyViewChartGroupByAttribute> groupByAttributes) {
    this.groupByAttributes = groupByAttributes;
  }


  /**
   * A list of metrics to calculate within the chart by (aka the y axis)
   **/
  public JourneyViewChart metrics(List<JourneyViewChartMetric> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of metrics to calculate within the chart by (aka the y axis)")
  @JsonProperty("metrics")
  public List<JourneyViewChartMetric> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<JourneyViewChartMetric> metrics) {
    this.metrics = metrics;
  }


  /**
   * Optional display attributes for rendering the chart
   **/
  public JourneyViewChart displayAttributes(JourneyViewChartDisplayAttributes displayAttributes) {
    this.displayAttributes = displayAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional display attributes for rendering the chart")
  @JsonProperty("displayAttributes")
  public JourneyViewChartDisplayAttributes getDisplayAttributes() {
    return displayAttributes;
  }
  public void setDisplayAttributes(JourneyViewChartDisplayAttributes displayAttributes) {
    this.displayAttributes = displayAttributes;
  }


  /**
   * A maximum on the number of values being grouped by
   **/
  public JourneyViewChart groupByMax(Integer groupByMax) {
    this.groupByMax = groupByMax;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A maximum on the number of values being grouped by")
  @JsonProperty("groupByMax")
  public Integer getGroupByMax() {
    return groupByMax;
  }
  public void setGroupByMax(Integer groupByMax) {
    this.groupByMax = groupByMax;
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
    JourneyViewChart journeyViewChart = (JourneyViewChart) o;

    return Objects.equals(this.id, journeyViewChart.id) &&
            Objects.equals(this.name, journeyViewChart.name) &&
            Objects.equals(this.version, journeyViewChart.version) &&
            Objects.equals(this.groupByTime, journeyViewChart.groupByTime) &&
            Objects.equals(this.groupByAttributes, journeyViewChart.groupByAttributes) &&
            Objects.equals(this.metrics, journeyViewChart.metrics) &&
            Objects.equals(this.displayAttributes, journeyViewChart.displayAttributes) &&
            Objects.equals(this.groupByMax, journeyViewChart.groupByMax) &&
            Objects.equals(this.selfUri, journeyViewChart.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, version, groupByTime, groupByAttributes, metrics, displayAttributes, groupByMax, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewChart {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    groupByTime: ").append(toIndentedString(groupByTime)).append("\n");
    sb.append("    groupByAttributes: ").append(toIndentedString(groupByAttributes)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    displayAttributes: ").append(toIndentedString(displayAttributes)).append("\n");
    sb.append("    groupByMax: ").append(toIndentedString(groupByMax)).append("\n");
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

