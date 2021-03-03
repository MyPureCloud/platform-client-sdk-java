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
import com.mypurecloud.sdk.v2.model.BuAbandonRate;
import com.mypurecloud.sdk.v2.model.BuAverageSpeedOfAnswer;
import com.mypurecloud.sdk.v2.model.BuServiceLevel;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Service Goal Template
 */
@ApiModel(description = "Service Goal Template")

public class ServiceGoalTemplate  implements Serializable {
  
  private String id = null;
  private String name = null;
  private BuServiceLevel serviceLevel = null;
  private BuAverageSpeedOfAnswer averageSpeedOfAnswer = null;
  private BuAbandonRate abandonRate = null;
  private WfmVersionedEntityMetadata metadata = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public ServiceGoalTemplate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Service level targets for this service goal template
   **/
  public ServiceGoalTemplate serviceLevel(BuServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Service level targets for this service goal template")
  @JsonProperty("serviceLevel")
  public BuServiceLevel getServiceLevel() {
    return serviceLevel;
  }
  public void setServiceLevel(BuServiceLevel serviceLevel) {
    this.serviceLevel = serviceLevel;
  }

  
  /**
   * Average speed of answer targets for this service goal template
   **/
  public ServiceGoalTemplate averageSpeedOfAnswer(BuAverageSpeedOfAnswer averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Average speed of answer targets for this service goal template")
  @JsonProperty("averageSpeedOfAnswer")
  public BuAverageSpeedOfAnswer getAverageSpeedOfAnswer() {
    return averageSpeedOfAnswer;
  }
  public void setAverageSpeedOfAnswer(BuAverageSpeedOfAnswer averageSpeedOfAnswer) {
    this.averageSpeedOfAnswer = averageSpeedOfAnswer;
  }

  
  /**
   * Abandon rate targets for this service goal template
   **/
  public ServiceGoalTemplate abandonRate(BuAbandonRate abandonRate) {
    this.abandonRate = abandonRate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Abandon rate targets for this service goal template")
  @JsonProperty("abandonRate")
  public BuAbandonRate getAbandonRate() {
    return abandonRate;
  }
  public void setAbandonRate(BuAbandonRate abandonRate) {
    this.abandonRate = abandonRate;
  }

  
  /**
   * Version metadata for the service goal template
   **/
  public ServiceGoalTemplate metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version metadata for the service goal template")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
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
    ServiceGoalTemplate serviceGoalTemplate = (ServiceGoalTemplate) o;
    return Objects.equals(this.id, serviceGoalTemplate.id) &&
        Objects.equals(this.name, serviceGoalTemplate.name) &&
        Objects.equals(this.serviceLevel, serviceGoalTemplate.serviceLevel) &&
        Objects.equals(this.averageSpeedOfAnswer, serviceGoalTemplate.averageSpeedOfAnswer) &&
        Objects.equals(this.abandonRate, serviceGoalTemplate.abandonRate) &&
        Objects.equals(this.metadata, serviceGoalTemplate.metadata) &&
        Objects.equals(this.selfUri, serviceGoalTemplate.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, serviceLevel, averageSpeedOfAnswer, abandonRate, metadata, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServiceGoalTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    averageSpeedOfAnswer: ").append(toIndentedString(averageSpeedOfAnswer)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

