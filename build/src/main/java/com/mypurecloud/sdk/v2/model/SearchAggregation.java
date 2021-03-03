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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SearchAggregation
 */

public class SearchAggregation  implements Serializable {
  
  private String field = null;
  private String name = null;

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
   * The type of aggregation to perform
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("COUNT"),
    SUM("SUM"),
    AVERAGE("AVERAGE"),
    TERM("TERM"),
    CONTAINS("CONTAINS"),
    STARTS_WITH("STARTS_WITH"),
    ENDS_WITH("ENDS_WITH");

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
  private String value = null;
  private Integer size = null;

  private static class OrderEnumDeserializer extends StdDeserializer<OrderEnum> {
    public OrderEnumDeserializer() {
      super(OrderEnumDeserializer.class);
    }

    @Override
    public OrderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OrderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets order
   */
 @JsonDeserialize(using = OrderEnumDeserializer.class)
  public enum OrderEnum {
    VALUE_DESC("VALUE_DESC"),
    VALUE_ASC("VALUE_ASC"),
    COUNT_DESC("COUNT_DESC"),
    COUNT_ASC("COUNT_ASC");

    private String value;

    OrderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OrderEnum fromString(String key) {
      if (key == null) return null;

      for (OrderEnum value : OrderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OrderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<OrderEnum> order = new ArrayList<OrderEnum>();

  
  /**
   * The field used for aggregation
   **/
  public SearchAggregation field(String field) {
    this.field = field;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The field used for aggregation")
  @JsonProperty("field")
  public String getField() {
    return field;
  }
  public void setField(String field) {
    this.field = field;
  }

  
  /**
   * The name of the aggregation. The response aggregation uses this name.
   **/
  public SearchAggregation name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the aggregation. The response aggregation uses this name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The type of aggregation to perform
   **/
  public SearchAggregation type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of aggregation to perform")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * A value to use for aggregation
   **/
  public SearchAggregation value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A value to use for aggregation")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * The number aggregations results to return out of the entire result set
   **/
  public SearchAggregation size(Integer size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number aggregations results to return out of the entire result set")
  @JsonProperty("size")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  
  /**
   * The order in which aggregation results are sorted
   **/
  public SearchAggregation order(List<OrderEnum> order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The order in which aggregation results are sorted")
  @JsonProperty("order")
  public List<OrderEnum> getOrder() {
    return order;
  }
  public void setOrder(List<OrderEnum> order) {
    this.order = order;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchAggregation searchAggregation = (SearchAggregation) o;
    return Objects.equals(this.field, searchAggregation.field) &&
        Objects.equals(this.name, searchAggregation.name) &&
        Objects.equals(this.type, searchAggregation.type) &&
        Objects.equals(this.value, searchAggregation.value) &&
        Objects.equals(this.size, searchAggregation.size) &&
        Objects.equals(this.order, searchAggregation.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(field, name, type, value, size, order);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchAggregation {\n");
    
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

