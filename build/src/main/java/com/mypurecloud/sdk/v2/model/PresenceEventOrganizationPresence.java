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
 * PresenceEventOrganizationPresence
 */

public class PresenceEventOrganizationPresence  implements Serializable {
  
  private String id = null;
  private String systemPresence = null;

  
  /**
   **/
  public PresenceEventOrganizationPresence id(String id) {
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
  public PresenceEventOrganizationPresence systemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("systemPresence")
  public String getSystemPresence() {
    return systemPresence;
  }
  public void setSystemPresence(String systemPresence) {
    this.systemPresence = systemPresence;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PresenceEventOrganizationPresence presenceEventOrganizationPresence = (PresenceEventOrganizationPresence) o;
    return Objects.equals(this.id, presenceEventOrganizationPresence.id) &&
        Objects.equals(this.systemPresence, presenceEventOrganizationPresence.systemPresence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, systemPresence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceEventOrganizationPresence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    systemPresence: ").append(toIndentedString(systemPresence)).append("\n");
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

