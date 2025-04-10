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
import com.mypurecloud.sdk.v2.model.JourneySessionEventsNotificationUser;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneySessionEventsNotificationConversationUserDisposition
 */

public class JourneySessionEventsNotificationConversationUserDisposition  implements Serializable {
  
  private String code = null;
  private String notes = null;
  private JourneySessionEventsNotificationUser user = null;

  public JourneySessionEventsNotificationConversationUserDisposition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneySessionEventsNotificationConversationUserDisposition code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }


  /**
   **/
  public JourneySessionEventsNotificationConversationUserDisposition notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }


  /**
   **/
  public JourneySessionEventsNotificationConversationUserDisposition user(JourneySessionEventsNotificationUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public JourneySessionEventsNotificationUser getUser() {
    return user;
  }
  public void setUser(JourneySessionEventsNotificationUser user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySessionEventsNotificationConversationUserDisposition journeySessionEventsNotificationConversationUserDisposition = (JourneySessionEventsNotificationConversationUserDisposition) o;

    return Objects.equals(this.code, journeySessionEventsNotificationConversationUserDisposition.code) &&
            Objects.equals(this.notes, journeySessionEventsNotificationConversationUserDisposition.notes) &&
            Objects.equals(this.user, journeySessionEventsNotificationConversationUserDisposition.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, notes, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationConversationUserDisposition {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

