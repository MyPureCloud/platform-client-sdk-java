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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ArchitectFlowNotificationHomeOrganization
 */

public class ArchitectFlowNotificationHomeOrganization  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String thirdPartyOrgName = null;

  
  /**
   **/
  public ArchitectFlowNotificationHomeOrganization id(String id) {
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
  public ArchitectFlowNotificationHomeOrganization name(String name) {
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
  public ArchitectFlowNotificationHomeOrganization thirdPartyOrgName(String thirdPartyOrgName) {
    this.thirdPartyOrgName = thirdPartyOrgName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("thirdPartyOrgName")
  public String getThirdPartyOrgName() {
    return thirdPartyOrgName;
  }
  public void setThirdPartyOrgName(String thirdPartyOrgName) {
    this.thirdPartyOrgName = thirdPartyOrgName;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArchitectFlowNotificationHomeOrganization architectFlowNotificationHomeOrganization = (ArchitectFlowNotificationHomeOrganization) o;
    return Objects.equals(this.id, architectFlowNotificationHomeOrganization.id) &&
        Objects.equals(this.name, architectFlowNotificationHomeOrganization.name) &&
        Objects.equals(this.thirdPartyOrgName, architectFlowNotificationHomeOrganization.thirdPartyOrgName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, thirdPartyOrgName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectFlowNotificationHomeOrganization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    thirdPartyOrgName: ").append(toIndentedString(thirdPartyOrgName)).append("\n");
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

