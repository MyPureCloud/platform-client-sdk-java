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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ExecutionDataFlowSettingsResponse
 */

public class ExecutionDataFlowSettingsResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean enabled = null;
  private UserReference modifiedBy = null;
  private DomainEntityRef modifiedByClient = null;
  private Date dateModified = null;
  private String selfUri = null;

  public ExecutionDataFlowSettingsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ExecutionDataFlowSettingsResponse name(String name) {
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
   * whether or not the setting is enabled.
   **/
  public ExecutionDataFlowSettingsResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "whether or not the setting is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * User that last changed the setting.
   **/
  public ExecutionDataFlowSettingsResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that last changed the setting.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * OAuth client that last changed the setting.
   **/
  public ExecutionDataFlowSettingsResponse modifiedByClient(DomainEntityRef modifiedByClient) {
    this.modifiedByClient = modifiedByClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "OAuth client that last changed the setting.")
  @JsonProperty("modifiedByClient")
  public DomainEntityRef getModifiedByClient() {
    return modifiedByClient;
  }
  public void setModifiedByClient(DomainEntityRef modifiedByClient) {
    this.modifiedByClient = modifiedByClient;
  }


  /**
   * The time this setting was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ExecutionDataFlowSettingsResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time this setting was set. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
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
    ExecutionDataFlowSettingsResponse executionDataFlowSettingsResponse = (ExecutionDataFlowSettingsResponse) o;

    return Objects.equals(this.id, executionDataFlowSettingsResponse.id) &&
            Objects.equals(this.name, executionDataFlowSettingsResponse.name) &&
            Objects.equals(this.enabled, executionDataFlowSettingsResponse.enabled) &&
            Objects.equals(this.modifiedBy, executionDataFlowSettingsResponse.modifiedBy) &&
            Objects.equals(this.modifiedByClient, executionDataFlowSettingsResponse.modifiedByClient) &&
            Objects.equals(this.dateModified, executionDataFlowSettingsResponse.dateModified) &&
            Objects.equals(this.selfUri, executionDataFlowSettingsResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, enabled, modifiedBy, modifiedByClient, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExecutionDataFlowSettingsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    modifiedByClient: ").append(toIndentedString(modifiedByClient)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

