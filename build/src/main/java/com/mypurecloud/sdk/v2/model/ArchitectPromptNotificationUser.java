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
import com.mypurecloud.sdk.v2.model.ArchitectPromptNotificationHomeOrganization;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchitectPromptNotificationUser
 */

public class ArchitectPromptNotificationUser  implements Serializable {
  
  private String id = null;
  private String name = null;
  private ArchitectPromptNotificationHomeOrganization homeOrg = null;

  
  /**
   **/
  public ArchitectPromptNotificationUser id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public ArchitectPromptNotificationUser name(String name) {
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
  public ArchitectPromptNotificationUser homeOrg(ArchitectPromptNotificationHomeOrganization homeOrg) {
    this.homeOrg = homeOrg;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("homeOrg")
  public ArchitectPromptNotificationHomeOrganization getHomeOrg() {
    return homeOrg;
  }
  public void setHomeOrg(ArchitectPromptNotificationHomeOrganization homeOrg) {
    this.homeOrg = homeOrg;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectPromptNotificationUser architectPromptNotificationUser = (ArchitectPromptNotificationUser) o;
    return Objects.equals(this.id, architectPromptNotificationUser.id) &&
        Objects.equals(this.name, architectPromptNotificationUser.name) &&
        Objects.equals(this.homeOrg, architectPromptNotificationUser.homeOrg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, homeOrg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectPromptNotificationUser {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    homeOrg: ").append(toIndentedString(homeOrg)).append("\n");
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

