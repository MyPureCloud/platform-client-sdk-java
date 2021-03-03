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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CreateServiceGoalTemplate
 */

public class CreateServiceGoalTemplate  implements Serializable {
  
  private String name = null;
  private BuServiceLevel serviceLevel = null;
  private BuAverageSpeedOfAnswer averageSpeedOfAnswer = null;
  private BuAbandonRate abandonRate = null;

  
  /**
   * The name of the service goal template.
   **/
  public CreateServiceGoalTemplate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the service goal template.")
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
  public CreateServiceGoalTemplate serviceLevel(BuServiceLevel serviceLevel) {
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
  public CreateServiceGoalTemplate averageSpeedOfAnswer(BuAverageSpeedOfAnswer averageSpeedOfAnswer) {
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
  public CreateServiceGoalTemplate abandonRate(BuAbandonRate abandonRate) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateServiceGoalTemplate createServiceGoalTemplate = (CreateServiceGoalTemplate) o;
    return Objects.equals(this.name, createServiceGoalTemplate.name) &&
        Objects.equals(this.serviceLevel, createServiceGoalTemplate.serviceLevel) &&
        Objects.equals(this.averageSpeedOfAnswer, createServiceGoalTemplate.averageSpeedOfAnswer) &&
        Objects.equals(this.abandonRate, createServiceGoalTemplate.abandonRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, serviceLevel, averageSpeedOfAnswer, abandonRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateServiceGoalTemplate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    serviceLevel: ").append(toIndentedString(serviceLevel)).append("\n");
    sb.append("    averageSpeedOfAnswer: ").append(toIndentedString(averageSpeedOfAnswer)).append("\n");
    sb.append("    abandonRate: ").append(toIndentedString(abandonRate)).append("\n");
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

