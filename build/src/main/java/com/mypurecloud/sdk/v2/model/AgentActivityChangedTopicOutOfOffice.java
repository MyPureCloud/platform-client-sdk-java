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
import java.util.Date;

import java.io.Serializable;
/**
 * AgentActivityChangedTopicOutOfOffice
 */

public class AgentActivityChangedTopicOutOfOffice  implements Serializable {
  
  private Boolean active = null;
  private Date modifiedDate = null;

  
  /**
   **/
  public AgentActivityChangedTopicOutOfOffice active(Boolean active) {
    this.active = active;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }
  public void setActive(Boolean active) {
    this.active = active;
  }

  
  /**
   **/
  public AgentActivityChangedTopicOutOfOffice modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentActivityChangedTopicOutOfOffice agentActivityChangedTopicOutOfOffice = (AgentActivityChangedTopicOutOfOffice) o;
    return Objects.equals(this.active, agentActivityChangedTopicOutOfOffice.active) &&
        Objects.equals(this.modifiedDate, agentActivityChangedTopicOutOfOffice.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentActivityChangedTopicOutOfOffice {\n");
    
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

