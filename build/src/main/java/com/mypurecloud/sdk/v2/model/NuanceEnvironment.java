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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Model for a Nuance bot environment
 */
@ApiModel(description = "Model for a Nuance bot environment")

public class NuanceEnvironment  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String environmentDesignation = null;
  private String executionHost = null;

  public NuanceEnvironment() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The environment ID
   **/
  public NuanceEnvironment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The environment ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The environment name
   **/
  public NuanceEnvironment name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The environment name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The environment type, usually a value like SANDBOX or PRODUCTION
   **/
  public NuanceEnvironment environmentDesignation(String environmentDesignation) {
    this.environmentDesignation = environmentDesignation;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The environment type, usually a value like SANDBOX or PRODUCTION")
  @JsonProperty("environmentDesignation")
  public String getEnvironmentDesignation() {
    return environmentDesignation;
  }
  public void setEnvironmentDesignation(String environmentDesignation) {
    this.environmentDesignation = environmentDesignation;
  }


  /**
   * The host used to execute this bot, similar to 'api.nuance.com:443'
   **/
  public NuanceEnvironment executionHost(String executionHost) {
    this.executionHost = executionHost;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The host used to execute this bot, similar to 'api.nuance.com:443'")
  @JsonProperty("executionHost")
  public String getExecutionHost() {
    return executionHost;
  }
  public void setExecutionHost(String executionHost) {
    this.executionHost = executionHost;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NuanceEnvironment nuanceEnvironment = (NuanceEnvironment) o;

    return Objects.equals(this.id, nuanceEnvironment.id) &&
            Objects.equals(this.name, nuanceEnvironment.name) &&
            Objects.equals(this.environmentDesignation, nuanceEnvironment.environmentDesignation) &&
            Objects.equals(this.executionHost, nuanceEnvironment.executionHost);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, environmentDesignation, executionHost);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NuanceEnvironment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    environmentDesignation: ").append(toIndentedString(environmentDesignation)).append("\n");
    sb.append("    executionHost: ").append(toIndentedString(executionHost)).append("\n");
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

