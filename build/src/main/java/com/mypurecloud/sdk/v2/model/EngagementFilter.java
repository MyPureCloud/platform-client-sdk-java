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
 * EngagementFilter
 */

public class EngagementFilter  implements Serializable {
  

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
   * The comparison operator for engagement metric filtering.
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
  private Integer value = null;

  public EngagementFilter() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public EngagementFilter(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The comparison operator for engagement metric filtering.
   **/
  public EngagementFilter operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The comparison operator for engagement metric filtering.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The inclusive lower bound of the engagement metric count. Required when operator is Between, not allowed otherwise.
   **/
  public EngagementFilter from(Integer from) {
    this.from = from;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The inclusive lower bound of the engagement metric count. Required when operator is Between, not allowed otherwise.")
  @JsonProperty("from")
  public Integer getFrom() {
    return from;
  }
  public void setFrom(Integer from) {
    this.from = from;
  }


  /**
   * The inclusive upper bound of the engagement metric count. Required when operator is Between, not allowed otherwise.
   **/
  public EngagementFilter to(Integer to) {
    this.to = to;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The inclusive upper bound of the engagement metric count. Required when operator is Between, not allowed otherwise.")
  @JsonProperty("to")
  public Integer getTo() {
    return to;
  }
  public void setTo(Integer to) {
    this.to = to;
  }


  /**
   * The engagement metric count to compare against. Required for every operator except Between, not allowed for Between.
   **/
  public EngagementFilter value(Integer value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The engagement metric count to compare against. Required for every operator except Between, not allowed for Between.")
  @JsonProperty("value")
  public Integer getValue() {
    return value;
  }
  public void setValue(Integer value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EngagementFilter engagementFilter = (EngagementFilter) o;

    return Objects.equals(this.operator, engagementFilter.operator) &&
            Objects.equals(this.from, engagementFilter.from) &&
            Objects.equals(this.to, engagementFilter.to) &&
            Objects.equals(this.value, engagementFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, from, to, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EngagementFilter {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

