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
import com.mypurecloud.sdk.v2.model.PresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * UserPresence
 */

public class UserPresence  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String source = null;
  private Boolean primary = null;
  private PresenceDefinition presenceDefinition = null;
  private String message = null;
  private Date modifiedDate = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserPresence name(String name) {
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
   * Represents the source where the Presence was set. Some examples are: PURECLOUD, LYNC, OUTLOOK, etc.
   **/
  public UserPresence source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the source where the Presence was set. Some examples are: PURECLOUD, LYNC, OUTLOOK, etc.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }

  
  /**
   * A boolean used to tell whether or not to set this presence source as the primary on a PATCH
   **/
  public UserPresence primary(Boolean primary) {
    this.primary = primary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A boolean used to tell whether or not to set this presence source as the primary on a PATCH")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }
  public void setPrimary(Boolean primary) {
    this.primary = primary;
  }

  
  /**
   **/
  public UserPresence presenceDefinition(PresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("presenceDefinition")
  public PresenceDefinition getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(PresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }

  
  /**
   **/
  public UserPresence message(String message) {
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
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UserPresence modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }
  public void setModifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
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
    UserPresence userPresence = (UserPresence) o;
    return Objects.equals(this.id, userPresence.id) &&
        Objects.equals(this.name, userPresence.name) &&
        Objects.equals(this.source, userPresence.source) &&
        Objects.equals(this.primary, userPresence.primary) &&
        Objects.equals(this.presenceDefinition, userPresence.presenceDefinition) &&
        Objects.equals(this.message, userPresence.message) &&
        Objects.equals(this.modifiedDate, userPresence.modifiedDate) &&
        Objects.equals(this.selfUri, userPresence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, source, primary, presenceDefinition, message, modifiedDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserPresence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
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

