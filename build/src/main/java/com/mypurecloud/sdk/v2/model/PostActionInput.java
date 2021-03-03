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
import com.mypurecloud.sdk.v2.model.ActionContractInput;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Definition of an Action to be created or updated.
 */
@ApiModel(description = "Definition of an Action to be created or updated.")

public class PostActionInput  implements Serializable {
  
  private String category = null;
  private String name = null;
  private String integrationId = null;
  private ActionConfig config = null;
  private ActionContractInput contract = null;
  private Boolean secure = null;

  
  /**
   * Category of action, Can be up to 256 characters long
   **/
  public PostActionInput category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Category of action, Can be up to 256 characters long")
  @JsonProperty("category")
  public String getCategory() {
    return category;
  }
  public void setCategory(String category) {
    this.category = category;
  }

  
  /**
   * Name of action, Can be up to 256 characters long
   **/
  public PostActionInput name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of action, Can be up to 256 characters long")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The ID of the integration this action is associated to
   **/
  public PostActionInput integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the integration this action is associated to")
  @JsonProperty("integrationId")
  public String getIntegrationId() {
    return integrationId;
  }
  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  
  /**
   * Configuration to support request and response processing
   **/
  public PostActionInput config(ActionConfig config) {
    this.config = config;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Configuration to support request and response processing")
  @JsonProperty("config")
  public ActionConfig getConfig() {
    return config;
  }
  public void setConfig(ActionConfig config) {
    this.config = config;
  }

  
  /**
   * Action contract
   **/
  public PostActionInput contract(ActionContractInput contract) {
    this.contract = contract;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Action contract")
  @JsonProperty("contract")
  public ActionContractInput getContract() {
    return contract;
  }
  public void setContract(ActionContractInput contract) {
    this.contract = contract;
  }

  
  /**
   * Indication of whether or not the action is designed to accept sensitive data
   **/
  public PostActionInput secure(Boolean secure) {
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

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostActionInput postActionInput = (PostActionInput) o;
    return Objects.equals(this.category, postActionInput.category) &&
        Objects.equals(this.name, postActionInput.name) &&
        Objects.equals(this.integrationId, postActionInput.integrationId) &&
        Objects.equals(this.config, postActionInput.config) &&
        Objects.equals(this.contract, postActionInput.contract) &&
        Objects.equals(this.secure, postActionInput.secure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, integrationId, config, contract, secure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostActionInput {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
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

