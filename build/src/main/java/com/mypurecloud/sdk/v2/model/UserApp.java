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
import com.mypurecloud.sdk.v2.model.IntegrationType;
import com.mypurecloud.sdk.v2.model.UserAppConfigurationInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Details for a UserApp
 */
@ApiModel(description = "Details for a UserApp")

public class UserApp  implements Serializable {
  
  private String id = null;
  private String name = null;
  private IntegrationType integrationType = null;
  private UserAppConfigurationInfo config = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The name of the userApp, used to distinguish this userApp from others of the same type.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", value = "Integration Type for the userApp")
  @JsonProperty("integrationType")
  public IntegrationType getIntegrationType() {
    return integrationType;
  }

  
  /**
   **/
  public UserApp config(UserAppConfigurationInfo config) {
    this.config = config;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("config")
  public UserAppConfigurationInfo getConfig() {
    return config;
  }
  public void setConfig(UserAppConfigurationInfo config) {
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
    UserApp userApp = (UserApp) o;
    return Objects.equals(this.id, userApp.id) &&
        Objects.equals(this.name, userApp.name) &&
        Objects.equals(this.integrationType, userApp.integrationType) &&
        Objects.equals(this.config, userApp.config) &&
        Objects.equals(this.selfUri, userApp.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, integrationType, config, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserApp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    integrationType: ").append(toIndentedString(integrationType)).append("\n");
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

