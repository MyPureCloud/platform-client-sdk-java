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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * OpenDataIngestionRuleRequest
 */

public class OpenDataIngestionRuleRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private DomainEntityRef externalSource = null;

  
  /**
   * The name of the data ingestion rule.
   **/
  public OpenDataIngestionRuleRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the data ingestion rule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * A description of the data ingestion rule.
   **/
  public OpenDataIngestionRuleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the data ingestion rule.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The external source associated with this open data ingestion rule, which will be used when performing identity resolution
   **/
  public OpenDataIngestionRuleRequest externalSource(DomainEntityRef externalSource) {
    this.externalSource = externalSource;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The external source associated with this open data ingestion rule, which will be used when performing identity resolution")
  @JsonProperty("externalSource")
  public DomainEntityRef getExternalSource() {
    return externalSource;
  }
  public void setExternalSource(DomainEntityRef externalSource) {
    this.externalSource = externalSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenDataIngestionRuleRequest openDataIngestionRuleRequest = (OpenDataIngestionRuleRequest) o;

    return Objects.equals(this.name, openDataIngestionRuleRequest.name) &&
            Objects.equals(this.description, openDataIngestionRuleRequest.description) &&
            Objects.equals(this.externalSource, openDataIngestionRuleRequest.externalSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, externalSource);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenDataIngestionRuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    externalSource: ").append(toIndentedString(externalSource)).append("\n");
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

