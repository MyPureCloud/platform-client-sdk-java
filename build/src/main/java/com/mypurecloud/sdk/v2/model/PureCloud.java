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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PureCloud
 */

public class PureCloud  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean disabled = null;
  private Boolean nativeLoginExceptionsEnabled = null;
  private List<String> nativeLoginExceptionGroupIds = null;
  private String selfUri = null;

  public PureCloud() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      nativeLoginExceptionGroupIds = new ArrayList<String>();
    }
  }

  public PureCloud(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      nativeLoginExceptionGroupIds = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public PureCloud name(String name) {
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
   **/
  public PureCloud disabled(Boolean disabled) {
    this.disabled = disabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("disabled")
  public Boolean getDisabled() {
    return disabled;
  }
  public void setDisabled(Boolean disabled) {
    this.disabled = disabled;
  }


  /**
   **/
  public PureCloud nativeLoginExceptionsEnabled(Boolean nativeLoginExceptionsEnabled) {
    this.nativeLoginExceptionsEnabled = nativeLoginExceptionsEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nativeLoginExceptionsEnabled")
  public Boolean getNativeLoginExceptionsEnabled() {
    return nativeLoginExceptionsEnabled;
  }
  public void setNativeLoginExceptionsEnabled(Boolean nativeLoginExceptionsEnabled) {
    this.nativeLoginExceptionsEnabled = nativeLoginExceptionsEnabled;
  }


  /**
   **/
  public PureCloud nativeLoginExceptionGroupIds(List<String> nativeLoginExceptionGroupIds) {
    this.nativeLoginExceptionGroupIds = nativeLoginExceptionGroupIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nativeLoginExceptionGroupIds")
  public List<String> getNativeLoginExceptionGroupIds() {
    return nativeLoginExceptionGroupIds;
  }
  public void setNativeLoginExceptionGroupIds(List<String> nativeLoginExceptionGroupIds) {
    this.nativeLoginExceptionGroupIds = nativeLoginExceptionGroupIds;
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
    PureCloud pureCloud = (PureCloud) o;

    return Objects.equals(this.id, pureCloud.id) &&
            Objects.equals(this.name, pureCloud.name) &&
            Objects.equals(this.disabled, pureCloud.disabled) &&
            Objects.equals(this.nativeLoginExceptionsEnabled, pureCloud.nativeLoginExceptionsEnabled) &&
            Objects.equals(this.nativeLoginExceptionGroupIds, pureCloud.nativeLoginExceptionGroupIds) &&
            Objects.equals(this.selfUri, pureCloud.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, disabled, nativeLoginExceptionsEnabled, nativeLoginExceptionGroupIds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PureCloud {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    disabled: ").append(toIndentedString(disabled)).append("\n");
    sb.append("    nativeLoginExceptionsEnabled: ").append(toIndentedString(nativeLoginExceptionsEnabled)).append("\n");
    sb.append("    nativeLoginExceptionGroupIds: ").append(toIndentedString(nativeLoginExceptionGroupIds)).append("\n");
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

