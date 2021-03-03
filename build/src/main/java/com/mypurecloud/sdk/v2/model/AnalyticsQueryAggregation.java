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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AggregationRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AnalyticsQueryAggregation
 */

public class AnalyticsQueryAggregation  implements Serializable {
  

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
   * Optional type, can usually be inferred
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TERMFREQUENCY("termFrequency"),
    NUMERICRANGE("numericRange");

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
  private String dimension = null;
  private String metric = null;
  private Integer size = null;
  private List<AggregationRange> ranges = new ArrayList<AggregationRange>();

  
  /**
   * Optional type, can usually be inferred
   **/
  public AnalyticsQueryAggregation type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional type, can usually be inferred")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * For use with termFrequency aggregations
   **/
  public AnalyticsQueryAggregation dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For use with termFrequency aggregations")
  @JsonProperty("dimension")
  public String getDimension() {
    return dimension;
  }
  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  
  /**
   * For use with numericRange aggregations
   **/
  public AnalyticsQueryAggregation metric(String metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For use with numericRange aggregations")
  @JsonProperty("metric")
  public String getMetric() {
    return metric;
  }
  public void setMetric(String metric) {
    this.metric = metric;
  }

  
  /**
   * For use with termFrequency aggregations
   **/
  public AnalyticsQueryAggregation size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For use with termFrequency aggregations")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   * For use with numericRange aggregations
   **/
  public AnalyticsQueryAggregation ranges(List<AggregationRange> ranges) {
    this.ranges = ranges;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "For use with numericRange aggregations")
  @JsonProperty("ranges")
  public List<AggregationRange> getRanges() {
    return ranges;
  }
  public void setRanges(List<AggregationRange> ranges) {
    this.ranges = ranges;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnalyticsQueryAggregation analyticsQueryAggregation = (AnalyticsQueryAggregation) o;
    return Objects.equals(this.type, analyticsQueryAggregation.type) &&
        Objects.equals(this.dimension, analyticsQueryAggregation.dimension) &&
        Objects.equals(this.metric, analyticsQueryAggregation.metric) &&
        Objects.equals(this.size, analyticsQueryAggregation.size) &&
        Objects.equals(this.ranges, analyticsQueryAggregation.ranges);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, metric, size, ranges);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnalyticsQueryAggregation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
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

