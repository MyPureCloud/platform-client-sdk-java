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
 * Definition of an Action Draft to be created or updated.
 */
@ApiModel(description = "Definition of an Action Draft to be created or updated.")

public class UpdateDraftInput  implements Serializable {
  
  private String category = null;
  private String name = null;
  private ActionConfig config = null;
  private ActionContractInput contract = null;
  private Boolean secure = null;
  private Integer version = null;

  
  /**
   * Category of action, Can be up to 256 characters long
   **/
  public UpdateDraftInput category(String category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Category of action, Can be up to 256 characters long")
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
  public UpdateDraftInput name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of action, Can be up to 256 characters long")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * Configuration to support request and response processing
   **/
  public UpdateDraftInput config(ActionConfig config) {
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

  
  /**
   * Action contract
   **/
  public UpdateDraftInput contract(ActionContractInput contract) {
    this.contract = contract;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action contract")
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
  public UpdateDraftInput secure(Boolean secure) {
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
   * Version of current Draft
   **/
  public UpdateDraftInput version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version of current Draft")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateDraftInput updateDraftInput = (UpdateDraftInput) o;
    return Objects.equals(this.category, updateDraftInput.category) &&
        Objects.equals(this.name, updateDraftInput.name) &&
        Objects.equals(this.config, updateDraftInput.config) &&
        Objects.equals(this.contract, updateDraftInput.contract) &&
        Objects.equals(this.secure, updateDraftInput.secure) &&
        Objects.equals(this.version, updateDraftInput.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, name, config, contract, secure, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateDraftInput {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    secure: ").append(toIndentedString(secure)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

