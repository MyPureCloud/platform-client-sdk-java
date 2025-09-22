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
 * InstagramDataIngestionRuleRequest
 */

public class InstagramDataIngestionRuleRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String integrationId = null;

  public InstagramDataIngestionRuleRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the data ingestion rule.
   **/
  public InstagramDataIngestionRuleRequest name(String name) {
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
  public InstagramDataIngestionRuleRequest description(String description) {
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
   * The Integration Id from which public social posts are ingested. This entity is created using the /conversations/messaging/integrations/instagram resource
   **/
  public InstagramDataIngestionRuleRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Integration Id from which public social posts are ingested. This entity is created using the /conversations/messaging/integrations/instagram resource")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InstagramDataIngestionRuleRequest instagramDataIngestionRuleRequest = (InstagramDataIngestionRuleRequest) o;

    return Objects.equals(this.name, instagramDataIngestionRuleRequest.name) &&
            Objects.equals(this.description, instagramDataIngestionRuleRequest.description) &&
            Objects.equals(this.integrationId, instagramDataIngestionRuleRequest.integrationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, integrationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InstagramDataIngestionRuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
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

