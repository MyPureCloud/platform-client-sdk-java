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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.PresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Presence from a given source for a user
 */
@ApiModel(description = "Presence from a given source for a user")

public class UcUserPresence  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String userId = null;
  private String source = null;
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
  public UcUserPresence name(String name) {
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
   * User ID of the associated Genesys Cloud user.
   **/
  public UcUserPresence userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User ID of the associated Genesys Cloud user.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * Represents the source where the Presence was set. Some examples are: PURECLOUD, MICROSOFTTEAMS, ZOOMPHONE, etc.
   **/
  public UcUserPresence source(String source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Represents the source where the Presence was set. Some examples are: PURECLOUD, MICROSOFTTEAMS, ZOOMPHONE, etc.")
  @JsonProperty("source")
  public String getSource() {
    return source;
  }
  public void setSource(String source) {
    this.source = source;
  }


  /**
   **/
  public UcUserPresence presenceDefinition(PresenceDefinition presenceDefinition) {
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
  public UcUserPresence message(String message) {
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
  public UcUserPresence modifiedDate(Date modifiedDate) {
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
    UcUserPresence ucUserPresence = (UcUserPresence) o;

    return Objects.equals(this.id, ucUserPresence.id) &&
            Objects.equals(this.name, ucUserPresence.name) &&
            Objects.equals(this.userId, ucUserPresence.userId) &&
            Objects.equals(this.source, ucUserPresence.source) &&
            Objects.equals(this.presenceDefinition, ucUserPresence.presenceDefinition) &&
            Objects.equals(this.message, ucUserPresence.message) &&
            Objects.equals(this.modifiedDate, ucUserPresence.modifiedDate) &&
            Objects.equals(this.selfUri, ucUserPresence.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, userId, source, presenceDefinition, message, modifiedDate, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcUserPresence {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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

