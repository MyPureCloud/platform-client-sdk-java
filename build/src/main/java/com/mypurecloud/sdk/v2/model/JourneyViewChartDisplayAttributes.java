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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Display attributes for the chart, such as type, labels and legends
 */
@ApiModel(description = "Display attributes for the chart, such as type, labels and legends")

public class JourneyViewChartDisplayAttributes  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of chart to display
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COLUMN("Column"),
    BAR("Bar"),
    LINE("Line");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String groupByTitle = null;
  private String metricsTitle = null;
  private Boolean showLegend = null;

  
  /**
   * The type of chart to display
   **/
  public JourneyViewChartDisplayAttributes type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of chart to display")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * A title for the grouped by attributes (aka the x axis)
   **/
  public JourneyViewChartDisplayAttributes groupByTitle(String groupByTitle) {
    this.groupByTitle = groupByTitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A title for the grouped by attributes (aka the x axis)")
  @JsonProperty("groupByTitle")
  public String getGroupByTitle() {
    return groupByTitle;
  }
  public void setGroupByTitle(String groupByTitle) {
    this.groupByTitle = groupByTitle;
  }


  /**
   * A title for the metrics (aka the y axis)
   **/
  public JourneyViewChartDisplayAttributes metricsTitle(String metricsTitle) {
    this.metricsTitle = metricsTitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A title for the metrics (aka the y axis)")
  @JsonProperty("metricsTitle")
  public String getMetricsTitle() {
    return metricsTitle;
  }
  public void setMetricsTitle(String metricsTitle) {
    this.metricsTitle = metricsTitle;
  }


  /**
   * Whether to show a legend
   **/
  public JourneyViewChartDisplayAttributes showLegend(Boolean showLegend) {
    this.showLegend = showLegend;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to show a legend")
  @JsonProperty("showLegend")
  public Boolean getShowLegend() {
    return showLegend;
  }
  public void setShowLegend(Boolean showLegend) {
    this.showLegend = showLegend;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewChartDisplayAttributes journeyViewChartDisplayAttributes = (JourneyViewChartDisplayAttributes) o;

    return Objects.equals(this.type, journeyViewChartDisplayAttributes.type) &&
            Objects.equals(this.groupByTitle, journeyViewChartDisplayAttributes.groupByTitle) &&
            Objects.equals(this.metricsTitle, journeyViewChartDisplayAttributes.metricsTitle) &&
            Objects.equals(this.showLegend, journeyViewChartDisplayAttributes.showLegend);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, groupByTitle, metricsTitle, showLegend);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewChartDisplayAttributes {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    groupByTitle: ").append(toIndentedString(groupByTitle)).append("\n");
    sb.append("    metricsTitle: ").append(toIndentedString(metricsTitle)).append("\n");
    sb.append("    showLegend: ").append(toIndentedString(showLegend)).append("\n");
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

