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

import java.io.Serializable;
/**
 * FlowAggregationView
 */

public class FlowAggregationView  implements Serializable {
  

  private static class TargetEnumDeserializer extends StdDeserializer<TargetEnum> {
    public TargetEnumDeserializer() {
      super(TargetEnumDeserializer.class);
    }

    @Override
    public TargetEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TargetEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Target metric name
   */
 @JsonDeserialize(using = TargetEnumDeserializer.class)
  public enum TargetEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NFLOW("nFlow"),
    NFLOWMILESTONE("nFlowMilestone"),
    NFLOWOUTCOME("nFlowOutcome"),
    NFLOWOUTCOMEFAILED("nFlowOutcomeFailed"),
    OFLOWMILESTONE("oFlowMilestone"),
    TFLOW("tFlow"),
    TFLOWDISCONNECT("tFlowDisconnect"),
    TFLOWEXIT("tFlowExit"),
    TFLOWOUTCOME("tFlowOutcome");

    private String value;

    TargetEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TargetEnum fromString(String key) {
      if (key == null) return null;

      for (TargetEnum value : TargetEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TargetEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TargetEnum target = null;
  private String name = null;

  private static class FunctionEnumDeserializer extends StdDeserializer<FunctionEnum> {
    public FunctionEnumDeserializer() {
      super(FunctionEnumDeserializer.class);
    }

    @Override
    public FunctionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FunctionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of view you wish to create
   */
 @JsonDeserialize(using = FunctionEnumDeserializer.class)
  public enum FunctionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RANGEBOUND("rangeBound");

    private String value;

    FunctionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FunctionEnum fromString(String key) {
      if (key == null) return null;

      for (FunctionEnum value : FunctionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FunctionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FunctionEnum function = null;
  private AggregationRange range = null;

  
  /**
   * Target metric name
   **/
  public FlowAggregationView target(TargetEnum target) {
    this.target = target;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Target metric name")
  @JsonProperty("target")
  public TargetEnum getTarget() {
    return target;
  }
  public void setTarget(TargetEnum target) {
    this.target = target;
  }

  
  /**
   * A unique name for this view. Must be distinct from other views and built-in metric names.
   **/
  public FlowAggregationView name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A unique name for this view. Must be distinct from other views and built-in metric names.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Type of view you wish to create
   **/
  public FlowAggregationView function(FunctionEnum function) {
    this.function = function;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type of view you wish to create")
  @JsonProperty("function")
  public FunctionEnum getFunction() {
    return function;
  }
  public void setFunction(FunctionEnum function) {
    this.function = function;
  }

  
  /**
   * Range of numbers for slicing up data
   **/
  public FlowAggregationView range(AggregationRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Range of numbers for slicing up data")
  @JsonProperty("range")
  public AggregationRange getRange() {
    return range;
  }
  public void setRange(AggregationRange range) {
    this.range = range;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowAggregationView flowAggregationView = (FlowAggregationView) o;
    return Objects.equals(this.target, flowAggregationView.target) &&
        Objects.equals(this.name, flowAggregationView.name) &&
        Objects.equals(this.function, flowAggregationView.function) &&
        Objects.equals(this.range, flowAggregationView.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, name, function, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowAggregationView {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

