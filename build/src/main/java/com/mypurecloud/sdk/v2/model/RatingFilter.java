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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RatingFilter
 */

public class RatingFilter  implements Serializable {
  

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
   * The comparison operator for review rating filtering.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALTO("EqualTo"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUALTO("GreaterThanOrEqualTo"),
    LESSTHAN("LessThan"),
    LESSTHANOREQUALTO("LessThanOrEqualTo"),
    BETWEEN("Between");

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
  private Integer from = null;
  private Integer to = null;
  private List<Integer> values = null;

  public RatingFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      values = new ArrayList<Integer>();
    }
  }

  public RatingFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      values = new ArrayList<Integer>();
    }
  }

  
  /**
   * The comparison operator for review rating filtering.
   **/
  public RatingFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The comparison operator for review rating filtering.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The lower bound for the Between operator
   **/
  public RatingFilter from(Integer from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lower bound for the Between operator")
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }
  public void setFrom(Integer from) {
    this.from = from;
  }


  /**
   * The upper bound for the Between operator
   **/
  public RatingFilter to(Integer to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The upper bound for the Between operator")
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }
  public void setTo(Integer to) {
    this.to = to;
  }


  /**
   * One or more rating values to filter by
   **/
  public RatingFilter values(List<Integer> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "One or more rating values to filter by")
  @JsonProperty("values")
  public List<Integer> getValues() {
    return values;
  }
  public void setValues(List<Integer> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RatingFilter ratingFilter = (RatingFilter) o;

    return Objects.equals(this.operator, ratingFilter.operator) &&
            Objects.equals(this.from, ratingFilter.from) &&
            Objects.equals(this.to, ratingFilter.to) &&
            Objects.equals(this.values, ratingFilter.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, from, to, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RatingFilter {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

