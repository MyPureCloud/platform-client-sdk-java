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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A filter on an element within a journey view
 */
@ApiModel(description = "A filter on an element within a journey view")

public class JourneyViewElementFilterPredicate  implements Serializable {
  
  private String dimension = null;
  private List<String> values = new ArrayList<String>();

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

  
  /**
   * the element's attribute being filtered on
   **/
  public JourneyViewElementFilterPredicate dimension(String dimension) {
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
   * the values of the attribute to filter on
   **/
  public JourneyViewElementFilterPredicate values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "the values of the attribute to filter on")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }


  /**
   * Optional operator, default is Matches. Valid values: Matches
   **/
  public JourneyViewElementFilterPredicate operator(OperatorEnum operator) {
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
  public JourneyViewElementFilterPredicate noValue(Boolean noValue) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyViewElementFilterPredicate journeyViewElementFilterPredicate = (JourneyViewElementFilterPredicate) o;

    return Objects.equals(this.dimension, journeyViewElementFilterPredicate.dimension) &&
            Objects.equals(this.values, journeyViewElementFilterPredicate.values) &&
            Objects.equals(this.operator, journeyViewElementFilterPredicate.operator) &&
            Objects.equals(this.noValue, journeyViewElementFilterPredicate.noValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dimension, values, operator, noValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyViewElementFilterPredicate {\n");
    
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    noValue: ").append(toIndentedString(noValue)).append("\n");
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

