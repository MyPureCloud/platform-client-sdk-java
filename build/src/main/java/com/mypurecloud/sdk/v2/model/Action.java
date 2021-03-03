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
import com.mypurecloud.sdk.v2.model.ActionConfig;
import com.mypurecloud.sdk.v2.model.ActionContract;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Action
 */

public class Action  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String integrationId = null;
  private String category = null;
  private ActionContract contract = null;
  private Integer version = null;
  private Boolean secure = null;
  private ActionConfig config = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public Action name(String name) {
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
   * The ID of the integration for which this action is associated
   **/
  public Action integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the integration for which this action is associated")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  
  /**
   * Category of Action
   **/
  public Action category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category of Action")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Action contract
   **/
  public Action contract(ActionContract contract) {
    this.contract = contract;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action contract")
  @JsonProperty("contract")
  public ActionContract getContract() {
    return contract;
  }
  public void setContract(ActionContract contract) {
    this.contract = contract;
  }

  
  /**
   * Version of this action
   **/
  public Action version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Version of this action")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   * Indication of whether or not the action is designed to accept sensitive data
   **/
  public Action secure(Boolean secure) {
    this.secure = secure;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indication of whether or not the action is designed to accept sensitive data")
  @JsonProperty("secure")
  public Boolean getSecure() {
    return secure;
  }
  public void setSecure(Boolean secure) {
    this.secure = secure;
  }

  
  /**
   * Configuration to support request and response processing
   **/
  public Action config(ActionConfig config) {
    this.config = config;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration to support request and response processing")
  @JsonProperty("config")
  public ActionConfig getConfig() {
    return config;
  }
  public void setConfig(ActionConfig config) {
    this.config = config;
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
    Action action = (Action) o;
    return Objects.equals(this.id, action.id) &&
        Objects.equals(this.name, action.name) &&
        Objects.equals(this.integrationId, action.integrationId) &&
        Objects.equals(this.category, action.category) &&
        Objects.equals(this.contract, action.contract) &&
        Objects.equals(this.version, action.version) &&
        Objects.equals(this.secure, action.secure) &&
        Objects.equals(this.config, action.config) &&
        Objects.equals(this.selfUri, action.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationId, category, contract, version, secure, config, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Action {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
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

