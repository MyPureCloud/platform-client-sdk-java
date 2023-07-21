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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.MemberGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;

import java.io.Serializable;
/**
 * ConditionalGroupRoutingRule
 */

public class ConditionalGroupRoutingRule  implements Serializable {
  
  private DomainEntityRef queue = null;

  private static class MetricEnumDeserializer extends StdDeserializer<MetricEnum> {
    public MetricEnumDeserializer() {
      super(MetricEnumDeserializer.class);
    }

    @Override
    public MetricEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The queue metric being evaluated
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ESTIMATEDWAITTIME("EstimatedWaitTime"),
    SERVICELEVEL("ServiceLevel");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;

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
   * The operator that compares the actual value against the condition value
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUALTO("GreaterThanOrEqualTo"),
    LESSTHAN("LessThan"),
    LESSTHANOREQUALTO("LessThanOrEqualTo");

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
  private Double conditionValue = null;
  private List<MemberGroup> groups = new ArrayList<MemberGroup>();
  private Integer waitSeconds = null;

  
  /**
   * The queue being evaluated for this rule.  For rule 1, this is always the current queue, so should not be specified.
   **/
  public ConditionalGroupRoutingRule queue(DomainEntityRef queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue being evaluated for this rule.  For rule 1, this is always the current queue, so should not be specified.")
  @JsonProperty("queue")
  public DomainEntityRef getQueue() {
    return queue;
  }
  public void setQueue(DomainEntityRef queue) {
    this.queue = queue;
  }


  /**
   * The queue metric being evaluated
   **/
  public ConditionalGroupRoutingRule metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue metric being evaluated")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * The operator that compares the actual value against the condition value
   **/
  public ConditionalGroupRoutingRule operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The operator that compares the actual value against the condition value")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The limit value, beyond which a rule evaluates as true
   **/
  public ConditionalGroupRoutingRule conditionValue(Double conditionValue) {
    this.conditionValue = conditionValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The limit value, beyond which a rule evaluates as true")
  @JsonProperty("conditionValue")
  public Double getConditionValue() {
    return conditionValue;
  }
  public void setConditionValue(Double conditionValue) {
    this.conditionValue = conditionValue;
  }


  /**
   * The group(s) to activate if the rule evaluates as true
   **/
  public ConditionalGroupRoutingRule groups(List<MemberGroup> groups) {
    this.groups = groups;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The group(s) to activate if the rule evaluates as true")
  @JsonProperty("groups")
  public List<MemberGroup> getGroups() {
    return groups;
  }
  public void setGroups(List<MemberGroup> groups) {
    this.groups = groups;
  }


  /**
   * The number of seconds to wait in this rule, if it evaluates as true, before evaluating the next rule.  For the final rule, this is ignored, so need not be specified.
   **/
  public ConditionalGroupRoutingRule waitSeconds(Integer waitSeconds) {
    this.waitSeconds = waitSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of seconds to wait in this rule, if it evaluates as true, before evaluating the next rule.  For the final rule, this is ignored, so need not be specified.")
  @JsonProperty("waitSeconds")
  public Integer getWaitSeconds() {
    return waitSeconds;
  }
  public void setWaitSeconds(Integer waitSeconds) {
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
    ConditionalGroupRoutingRule conditionalGroupRoutingRule = (ConditionalGroupRoutingRule) o;

    return Objects.equals(this.queue, conditionalGroupRoutingRule.queue) &&
            Objects.equals(this.metric, conditionalGroupRoutingRule.metric) &&
            Objects.equals(this.operator, conditionalGroupRoutingRule.operator) &&
            Objects.equals(this.conditionValue, conditionalGroupRoutingRule.conditionValue) &&
            Objects.equals(this.groups, conditionalGroupRoutingRule.groups) &&
            Objects.equals(this.waitSeconds, conditionalGroupRoutingRule.waitSeconds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, metric, operator, conditionValue, groups, waitSeconds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConditionalGroupRoutingRule {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    conditionValue: ").append(toIndentedString(conditionValue)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
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

