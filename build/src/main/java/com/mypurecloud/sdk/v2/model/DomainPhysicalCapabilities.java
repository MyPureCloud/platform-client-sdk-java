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
 * DomainPhysicalCapabilities
 */

public class DomainPhysicalCapabilities  implements Serializable {
  
  private Boolean vlan = null;
  private Boolean team = null;

  public DomainPhysicalCapabilities() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public DomainPhysicalCapabilities vlan(Boolean vlan) {
    this.vlan = vlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("vlan")
  public Boolean getVlan() {
    return vlan;
  }
  public void setVlan(Boolean vlan) {
    this.vlan = vlan;
  }


  /**
   **/
  public DomainPhysicalCapabilities team(Boolean team) {
    this.team = team;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("team")
  public Boolean getTeam() {
    return team;
  }
  public void setTeam(Boolean team) {
    this.team = team;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainPhysicalCapabilities domainPhysicalCapabilities = (DomainPhysicalCapabilities) o;

    return Objects.equals(this.vlan, domainPhysicalCapabilities.vlan) &&
            Objects.equals(this.team, domainPhysicalCapabilities.team);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vlan, team);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DomainPhysicalCapabilities {\n");
    
    sb.append("    vlan: ").append(toIndentedString(vlan)).append("\n");
    sb.append("    team: ").append(toIndentedString(team)).append("\n");
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

