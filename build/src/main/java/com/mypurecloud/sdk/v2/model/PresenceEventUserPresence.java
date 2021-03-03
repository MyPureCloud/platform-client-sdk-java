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
import com.mypurecloud.sdk.v2.model.PresenceEventOrganizationPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * PresenceEventUserPresence
 */

public class PresenceEventUserPresence  implements Serializable {
  
  private String source = null;
  private PresenceEventOrganizationPresence presenceDefinition = null;
  private Boolean primary = null;
  private String message = null;
  private Date modifiedDate = null;

  
  /**
   **/
  public PresenceEventUserPresence source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   **/
  public PresenceEventUserPresence presenceDefinition(PresenceEventOrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceDefinition")
  public PresenceEventOrganizationPresence getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(PresenceEventOrganizationPresence presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }

  
  /**
   **/
  public PresenceEventUserPresence primary(Boolean primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  
  /**
   **/
  public PresenceEventUserPresence message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  
  /**
   **/
  public PresenceEventUserPresence modifiedDate(Date modifiedDate) {
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
    PresenceEventUserPresence presenceEventUserPresence = (PresenceEventUserPresence) o;
    return Objects.equals(this.source, presenceEventUserPresence.source) &&
        Objects.equals(this.presenceDefinition, presenceEventUserPresence.presenceDefinition) &&
        Objects.equals(this.primary, presenceEventUserPresence.primary) &&
        Objects.equals(this.message, presenceEventUserPresence.message) &&
        Objects.equals(this.modifiedDate, presenceEventUserPresence.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(source, presenceDefinition, primary, message, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PresenceEventUserPresence {\n");
    
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

