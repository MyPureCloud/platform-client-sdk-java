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

import java.io.Serializable;
/**
 * RoutingRule
 */

public class RoutingRule  implements Serializable {
  

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
   * matching operator.  MEETS_THRESHOLD matches any agent with a score at or above the rule's threshold.  ANY matches all specified agents, regardless of score.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MEETS_THRESHOLD("MEETS_THRESHOLD"),
    ANY("ANY");

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
  private Integer threshold = null;
  private Double waitSeconds = null;

  
  /**
   * matching operator.  MEETS_THRESHOLD matches any agent with a score at or above the rule's threshold.  ANY matches all specified agents, regardless of score.
   **/
  public RoutingRule operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "matching operator.  MEETS_THRESHOLD matches any agent with a score at or above the rule's threshold.  ANY matches all specified agents, regardless of score.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * threshold required for routing attempt (generally an agent score).  may be null for operator ANY.
   **/
  public RoutingRule threshold(Integer threshold) {
    this.threshold = threshold;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "threshold required for routing attempt (generally an agent score).  may be null for operator ANY.")
  @JsonProperty("threshold")
  public Integer getThreshold() {
    return threshold;
  }
  public void setThreshold(Integer threshold) {
    this.threshold = threshold;
  }

  
  /**
   * seconds to wait in this rule before moving to the next
   **/
  public RoutingRule waitSeconds(Double waitSeconds) {
    this.waitSeconds = waitSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "seconds to wait in this rule before moving to the next")
  @JsonProperty("waitSeconds")
  public Double getWaitSeconds() {
    return waitSeconds;
  }
  public void setWaitSeconds(Double waitSeconds) {
    this.waitSeconds = waitSeconds;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingRule routingRule = (RoutingRule) o;
    return Objects.equals(this.operator, routingRule.operator) &&
        Objects.equals(this.threshold, routingRule.threshold) &&
        Objects.equals(this.waitSeconds, routingRule.waitSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, threshold, waitSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingRule {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
    sb.append("    waitSeconds: ").append(toIndentedString(waitSeconds)).append("\n");
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

