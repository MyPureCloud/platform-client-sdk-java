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
import com.mypurecloud.sdk.v2.model.SalesforceSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SalesforceSourceRequest
 */

public class SalesforceSourceRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String integrationId = null;
  private Integer schedulePeriod = null;
  private SalesforceSettings settings = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the integration source.
   **/
  public SalesforceSourceRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the integration source.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The integration associated with the source.
   **/
  public SalesforceSourceRequest integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The integration associated with the source.")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }


  /**
   * The schedule period of the source in hours. Must be at least 6 and at most 48 hours.
   * minimum: 6
   * maximum: 48
   **/
  public SalesforceSourceRequest schedulePeriod(Integer schedulePeriod) {
    this.schedulePeriod = schedulePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schedule period of the source in hours. Must be at least 6 and at most 48 hours.")
  @JsonProperty("schedulePeriod")
  public Integer getSchedulePeriod() {
    return schedulePeriod;
  }
  public void setSchedulePeriod(Integer schedulePeriod) {
    this.schedulePeriod = schedulePeriod;
  }


  /**
   * The settings of the source.
   **/
  public SalesforceSourceRequest settings(SalesforceSettings settings) {
    this.settings = settings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The settings of the source.")
  @JsonProperty("settings")
  public SalesforceSettings getSettings() {
    return settings;
  }
  public void setSettings(SalesforceSettings settings) {
    this.settings = settings;
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
    SalesforceSourceRequest salesforceSourceRequest = (SalesforceSourceRequest) o;

    return Objects.equals(this.id, salesforceSourceRequest.id) &&
            Objects.equals(this.name, salesforceSourceRequest.name) &&
            Objects.equals(this.integrationId, salesforceSourceRequest.integrationId) &&
            Objects.equals(this.schedulePeriod, salesforceSourceRequest.schedulePeriod) &&
            Objects.equals(this.settings, salesforceSourceRequest.settings) &&
            Objects.equals(this.selfUri, salesforceSourceRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationId, schedulePeriod, settings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SalesforceSourceRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    schedulePeriod: ").append(toIndentedString(schedulePeriod)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

