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
import java.util.List;

import java.io.Serializable;
/**
 * UserActivityMetricValue
 */

public class UserActivityMetricValue  implements Serializable {
  

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
   * Metric
   */
 @JsonDeserialize(using = MetricEnumDeserializer.class)
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OACTIVEQUEUES("oActiveQueues"),
    OMEMBERQUEUES("oMemberQueues");

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
  private String qualifier = null;
  private List<String> entityIds = null;
  private Integer count = null;

  public UserActivityMetricValue() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entityIds = new ArrayList<String>();
    }
  }

  
  /**
   * Metric
   **/
  public UserActivityMetricValue metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }


  /**
   * Metric qualifier
   **/
  public UserActivityMetricValue qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric qualifier")
  @JsonProperty("qualifier")
  public String getQualifier() {
    return qualifier;
  }
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }


  /**
   * Entity ids for matching entities if details were requested
   **/
  public UserActivityMetricValue entityIds(List<String> entityIds) {
    this.entityIds = entityIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Entity ids for matching entities if details were requested")
  @JsonProperty("entityIds")
  public List<String> getEntityIds() {
    return entityIds;
  }
  public void setEntityIds(List<String> entityIds) {
    this.entityIds = entityIds;
  }


  /**
   * Metric count
   **/
  public UserActivityMetricValue count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metric count")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserActivityMetricValue userActivityMetricValue = (UserActivityMetricValue) o;

    return Objects.equals(this.metric, userActivityMetricValue.metric) &&
            Objects.equals(this.qualifier, userActivityMetricValue.qualifier) &&
            Objects.equals(this.entityIds, userActivityMetricValue.entityIds) &&
            Objects.equals(this.count, userActivityMetricValue.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, qualifier, entityIds, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityMetricValue {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    entityIds: ").append(toIndentedString(entityIds)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

