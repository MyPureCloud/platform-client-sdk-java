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
 * SummaryAggregationSort
 */

public class SummaryAggregationSort  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the metric used for sorting values.
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NCONVERSATIONSUMMARIES("nConversationSummaries"),
    NCONVERSATIONSUMMARYENGAGEMENTS("nConversationSummaryEngagements"),
    TCONVERSATIONSUMMARY("tConversationSummary");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;

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
   * Aggregation function used for the sort metric.
   */
 @JsonDeserialize(using = FunctionEnumDeserializer.class)
  public enum FunctionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AVERAGE("average"),
    COUNT("count"),
    MAX("max"),
    MIN("min"),
    SUM("sum");

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

  public SummaryAggregationSort() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the metric used for sorting values.
   **/
  public SummaryAggregationSort name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the metric used for sorting values.")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }


  /**
   * Aggregation function used for the sort metric.
   **/
  public SummaryAggregationSort function(FunctionEnum function) {
    this.function = function;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Aggregation function used for the sort metric.")
  @JsonProperty("function")
  public FunctionEnum getFunction() {
    return function;
  }
  public void setFunction(FunctionEnum function) {
    this.function = function;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummaryAggregationSort summaryAggregationSort = (SummaryAggregationSort) o;

    return Objects.equals(this.name, summaryAggregationSort.name) &&
            Objects.equals(this.function, summaryAggregationSort.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummaryAggregationSort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

