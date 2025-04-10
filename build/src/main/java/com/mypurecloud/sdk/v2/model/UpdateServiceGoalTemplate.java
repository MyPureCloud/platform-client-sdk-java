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
import com.mypurecloud.sdk.v2.model.BuAbandonRate;
import com.mypurecloud.sdk.v2.model.BuAverageSpeedOfAnswer;
import com.mypurecloud.sdk.v2.model.BuServiceLevel;
import com.mypurecloud.sdk.v2.model.ServiceGoalTemplateImpactOverride;
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateServiceGoalTemplate
 */

public class UpdateServiceGoalTemplate  implements Serializable {
  
  private String name = null;
  private BuServiceLevel serviceLevel = null;
  private BuAverageSpeedOfAnswer averageSpeedOfAnswer = null;
  private BuAbandonRate abandonRate = null;
  private WfmVersionedEntityMetadata metadata = null;
  private ServiceGoalTemplateImpactOverride impactOverride = null;

  public UpdateServiceGoalTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the service goal template.
   **/
  public UpdateServiceGoalTemplate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the service goal template.")
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
  public UpdateServiceGoalTemplate serviceLevel(BuServiceLevel serviceLevel) {
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
  public UpdateServiceGoalTemplate averageSpeedOfAnswer(BuAverageSpeedOfAnswer averageSpeedOfAnswer) {
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
  public UpdateServiceGoalTemplate abandonRate(BuAbandonRate abandonRate) {
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
  public UpdateServiceGoalTemplate metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for the service goal template")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  /**
   * Settings controlling max percent increase and decrease of service goals for this service goal template
   **/
  public UpdateServiceGoalTemplate impactOverride(ServiceGoalTemplateImpactOverride impactOverride) {
    this.impactOverride = impactOverride;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings controlling max percent increase and decrease of service goals for this service goal template")
  @JsonProperty("impactOverride")
  public ServiceGoalTemplateImpactOverride getImpactOverride() {
    return impactOverride;
  }
  public void setImpactOverride(ServiceGoalTemplateImpactOverride impactOverride) {
    this.impactOverride = impactOverride;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateServiceGoalTemplate updateServiceGoalTemplate = (UpdateServiceGoalTemplate) o;

    return Objects.equals(this.name, updateServiceGoalTemplate.name) &&
            Objects.equals(this.serviceLevel, updateServiceGoalTemplate.serviceLevel) &&
            Objects.equals(this.averageSpeedOfAnswer, updateServiceGoalTemplate.averageSpeedOfAnswer) &&
            Objects.equals(this.abandonRate, updateServiceGoalTemplate.abandonRate) &&
            Objects.equals(this.metadata, updateServiceGoalTemplate.metadata) &&
            Objects.equals(this.impactOverride, updateServiceGoalTemplate.impactOverride);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceLevel, averageSpeedOfAnswer, abandonRate, metadata, impactOverride);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateServiceGoalTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    averageSpeedOfAnswer: ").append(toIndentedString(averageSpeedOfAnswer)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    impactOverride: ").append(toIndentedString(impactOverride)).append("\n");
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

