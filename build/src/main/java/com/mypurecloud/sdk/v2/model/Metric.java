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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.Objective;
import com.mypurecloud.sdk.v2.model.PerformanceProfile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.Date;

import java.io.Serializable;
/**
 * Metric
 */

public class Metric  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String metricDefinitionId = null;
  private String externalMetricDefinitionId = null;
  private Objective objective = null;
  private String performanceProfileId = null;
  private AddressableEntityRef linkedMetric = null;
  private Date dateCreated = null;
  private LocalDate dateUnlinked = null;
  private PerformanceProfile sourcePerformanceProfile = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of this metric
   **/
  public Metric name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of this metric")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The id of associated metric definition
   **/
  public Metric metricDefinitionId(String metricDefinitionId) {
    this.metricDefinitionId = metricDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of associated metric definition")
  @JsonProperty("metricDefinitionId")
  public String getMetricDefinitionId() {
    return metricDefinitionId;
  }
  public void setMetricDefinitionId(String metricDefinitionId) {
    this.metricDefinitionId = metricDefinitionId;
  }

  
  /**
   * The id of associated external metric definition
   **/
  public Metric externalMetricDefinitionId(String externalMetricDefinitionId) {
    this.externalMetricDefinitionId = externalMetricDefinitionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of associated external metric definition")
  @JsonProperty("externalMetricDefinitionId")
  public String getExternalMetricDefinitionId() {
    return externalMetricDefinitionId;
  }
  public void setExternalMetricDefinitionId(String externalMetricDefinitionId) {
    this.externalMetricDefinitionId = externalMetricDefinitionId;
  }

  
  /**
   * Associated objective for this metric
   **/
  public Metric objective(Objective objective) {
    this.objective = objective;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Associated objective for this metric")
  @JsonProperty("objective")
  public Objective getObjective() {
    return objective;
  }
  public void setObjective(Objective objective) {
    this.objective = objective;
  }

  
  /**
   * Performance profile id of this metric
   **/
  public Metric performanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Performance profile id of this metric")
  @JsonProperty("performanceProfileId")
  public String getPerformanceProfileId() {
    return performanceProfileId;
  }
  public void setPerformanceProfileId(String performanceProfileId) {
    this.performanceProfileId = performanceProfileId;
  }

  
  @ApiModelProperty(example = "null", value = "The linked metric entity reference")
  @JsonProperty("linkedMetric")
  public AddressableEntityRef getLinkedMetric() {
    return linkedMetric;
  }

  
  @ApiModelProperty(example = "null", value = "The created date of this metric. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The unlinked workday for this metric if this metric was ever unlinked. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateUnlinked")
  public LocalDate getDateUnlinked() {
    return dateUnlinked;
  }

  
  @ApiModelProperty(example = "null", value = "The source performance profile when this metric is linked")
  @JsonProperty("sourcePerformanceProfile")
  public PerformanceProfile getSourcePerformanceProfile() {
    return sourcePerformanceProfile;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(this.id, metric.id) &&
        Objects.equals(this.name, metric.name) &&
        Objects.equals(this.metricDefinitionId, metric.metricDefinitionId) &&
        Objects.equals(this.externalMetricDefinitionId, metric.externalMetricDefinitionId) &&
        Objects.equals(this.objective, metric.objective) &&
        Objects.equals(this.performanceProfileId, metric.performanceProfileId) &&
        Objects.equals(this.linkedMetric, metric.linkedMetric) &&
        Objects.equals(this.dateCreated, metric.dateCreated) &&
        Objects.equals(this.dateUnlinked, metric.dateUnlinked) &&
        Objects.equals(this.sourcePerformanceProfile, metric.sourcePerformanceProfile) &&
        Objects.equals(this.selfUri, metric.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, metricDefinitionId, externalMetricDefinitionId, objective, performanceProfileId, linkedMetric, dateCreated, dateUnlinked, sourcePerformanceProfile, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    metricDefinitionId: ").append(toIndentedString(metricDefinitionId)).append("\n");
    sb.append("    externalMetricDefinitionId: ").append(toIndentedString(externalMetricDefinitionId)).append("\n");
    sb.append("    objective: ").append(toIndentedString(objective)).append("\n");
    sb.append("    performanceProfileId: ").append(toIndentedString(performanceProfileId)).append("\n");
    sb.append("    linkedMetric: ").append(toIndentedString(linkedMetric)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateUnlinked: ").append(toIndentedString(dateUnlinked)).append("\n");
    sb.append("    sourcePerformanceProfile: ").append(toIndentedString(sourcePerformanceProfile)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

