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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A metric to measure within the chart
 */
@ApiModel(description = "A metric to measure within the chart")

public class JourneyViewChartMetric  implements Serializable {
  
  private String id = null;
  private String elementId = null;

  private static class AggregateEnumDeserializer extends StdDeserializer<AggregateEnum> {
    public AggregateEnumDeserializer() {
      super(AggregateEnumDeserializer.class);
    }

    @Override
    public AggregateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AggregateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * How to aggregate the given element, defaults to CustomerCount
   */
 @JsonDeserialize(using = AggregateEnumDeserializer.class)
  public enum AggregateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EVENTCOUNT("EventCount"),
    CUSTOMERCOUNT("CustomerCount");

    private String value;

    AggregateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AggregateEnum fromString(String key) {
      if (key == null) return null;

      for (AggregateEnum value : AggregateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AggregateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AggregateEnum aggregate = null;
  private String displayLabel = null;

  public JourneyViewChartMetric() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The unique identifier of the metric within the chart
   **/
  public JourneyViewChartMetric id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The unique identifier of the metric within the chart")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The element in the list of elements which the metric is measuring
   **/
  public JourneyViewChartMetric elementId(String elementId) {
    this.elementId = elementId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The element in the list of elements which the metric is measuring")
  @JsonProperty("elementId")
  public String getElementId() {
    return elementId;
  }
  public void setElementId(String elementId) {
    this.elementId = elementId;
  }


  /**
   * How to aggregate the given element, defaults to CustomerCount
   **/
  public JourneyViewChartMetric aggregate(AggregateEnum aggregate) {
    this.aggregate = aggregate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How to aggregate the given element, defaults to CustomerCount")
  @JsonProperty("aggregate")
  public AggregateEnum getAggregate() {
    return aggregate;
  }
  public void setAggregate(AggregateEnum aggregate) {
    this.aggregate = aggregate;
  }


  /**
   * A display label for the metric
   **/
  public JourneyViewChartMetric displayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A display label for the metric")
  @JsonProperty("displayLabel")
  public String getDisplayLabel() {
    return displayLabel;
  }
  public void setDisplayLabel(String displayLabel) {
    this.displayLabel = displayLabel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewChartMetric journeyViewChartMetric = (JourneyViewChartMetric) o;

    return Objects.equals(this.id, journeyViewChartMetric.id) &&
            Objects.equals(this.elementId, journeyViewChartMetric.elementId) &&
            Objects.equals(this.aggregate, journeyViewChartMetric.aggregate) &&
            Objects.equals(this.displayLabel, journeyViewChartMetric.displayLabel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, elementId, aggregate, displayLabel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewChartMetric {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    elementId: ").append(toIndentedString(elementId)).append("\n");
    sb.append("    aggregate: ").append(toIndentedString(aggregate)).append("\n");
    sb.append("    displayLabel: ").append(toIndentedString(displayLabel)).append("\n");
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

