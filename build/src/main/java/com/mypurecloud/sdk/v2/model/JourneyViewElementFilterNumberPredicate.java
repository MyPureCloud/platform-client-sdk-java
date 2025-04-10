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
import com.mypurecloud.sdk.v2.model.JourneyViewElementFilterRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A numeric filter on an element within a journey view
 */
@ApiModel(description = "A numeric filter on an element within a journey view")

public class JourneyViewElementFilterNumberPredicate  implements Serializable {
  
  private String dimension = null;

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Optional operator, default is Matches. Valid values: Matches
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MATCHES("Matches"),
    NOTMATCHES("NotMatches");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private Boolean noValue = null;
  private JourneyViewElementFilterRange range = null;

  public JourneyViewElementFilterNumberPredicate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * the element's attribute being filtered on
   **/
  public JourneyViewElementFilterNumberPredicate dimension(String dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the element's attribute being filtered on")
  @JsonProperty("dimension")
  public String getDimension() {
    return dimension;
  }
  public void setDimension(String dimension) {
    this.dimension = dimension;
  }


  /**
   * Optional operator, default is Matches. Valid values: Matches
   **/
  public JourneyViewElementFilterNumberPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional operator, default is Matches. Valid values: Matches")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * set this to true if no specific value to be considered
   **/
  public JourneyViewElementFilterNumberPredicate noValue(Boolean noValue) {
    this.noValue = noValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "set this to true if no specific value to be considered")
  @JsonProperty("noValue")
  public Boolean getNoValue() {
    return noValue;
  }
  public void setNoValue(Boolean noValue) {
    this.noValue = noValue;
  }


  /**
   * the range of comparators to filter on
   **/
  public JourneyViewElementFilterNumberPredicate range(JourneyViewElementFilterRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the range of comparators to filter on")
  @JsonProperty("range")
  public JourneyViewElementFilterRange getRange() {
    return range;
  }
  public void setRange(JourneyViewElementFilterRange range) {
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
    JourneyViewElementFilterNumberPredicate journeyViewElementFilterNumberPredicate = (JourneyViewElementFilterNumberPredicate) o;

    return Objects.equals(this.dimension, journeyViewElementFilterNumberPredicate.dimension) &&
            Objects.equals(this.operator, journeyViewElementFilterNumberPredicate.operator) &&
            Objects.equals(this.noValue, journeyViewElementFilterNumberPredicate.noValue) &&
            Objects.equals(this.range, journeyViewElementFilterNumberPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, operator, noValue, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElementFilterNumberPredicate {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    noValue: ").append(toIndentedString(noValue)).append("\n");
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

