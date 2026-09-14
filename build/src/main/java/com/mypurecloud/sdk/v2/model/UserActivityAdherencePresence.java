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
import com.mypurecloud.sdk.v2.model.UserActivityPresenceDefinition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * UserActivityAdherencePresence
 */

public class UserActivityAdherencePresence  implements Serializable {
  
  private UserActivityPresenceDefinition presenceDefinition = null;
  private String presenceMessage = null;
  private Date modifiedDate = null;

  public UserActivityAdherencePresence() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public UserActivityAdherencePresence(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The current presence definition for the user
   **/
  public UserActivityAdherencePresence presenceDefinition(UserActivityPresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The current presence definition for the user")
  @JsonProperty("presenceDefinition")
  public UserActivityPresenceDefinition getPresenceDefinition() {
    return presenceDefinition;
  }
  public void setPresenceDefinition(UserActivityPresenceDefinition presenceDefinition) {
    this.presenceDefinition = presenceDefinition;
  }


  /**
   * The free-form presence message the user has set, if any
   **/
  public UserActivityAdherencePresence presenceMessage(String presenceMessage) {
    this.presenceMessage = presenceMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The free-form presence message the user has set, if any")
  @JsonProperty("presenceMessage")
  public String getPresenceMessage() {
    return presenceMessage;
  }
  public void setPresenceMessage(String presenceMessage) {
    this.presenceMessage = presenceMessage;
  }


  /**
   * The date the presence was last modified, in ISO-8601 format
   **/
  public UserActivityAdherencePresence modifiedDate(Date modifiedDate) {
    this.modifiedDate = modifiedDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the presence was last modified, in ISO-8601 format")
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
    UserActivityAdherencePresence userActivityAdherencePresence = (UserActivityAdherencePresence) o;

    return Objects.equals(this.presenceDefinition, userActivityAdherencePresence.presenceDefinition) &&
            Objects.equals(this.presenceMessage, userActivityAdherencePresence.presenceMessage) &&
            Objects.equals(this.modifiedDate, userActivityAdherencePresence.modifiedDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(presenceDefinition, presenceMessage, modifiedDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserActivityAdherencePresence {\n");
    
    sb.append("    presenceDefinition: ").append(toIndentedString(presenceDefinition)).append("\n");
    sb.append("    presenceMessage: ").append(toIndentedString(presenceMessage)).append("\n");
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

