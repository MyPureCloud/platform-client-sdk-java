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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationUserDisposition
 */

public class ConversationUserDisposition  implements Serializable {
  
  private String code = null;
  private String notes = null;
  private AddressableEntityRef user = null;

  
  /**
   * User-defined wrap-up code for the conversation.
   **/
  public ConversationUserDisposition code(String code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User-defined wrap-up code for the conversation.")
  @JsonProperty("code")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  
  /**
   * Text entered by the user to describe the call or disposition.
   **/
  public ConversationUserDisposition notes(String notes) {
    this.notes = notes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text entered by the user to describe the call or disposition.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  
  @ApiModelProperty(example = "null", value = "The user that wrapped up the conversation.")
  @JsonProperty("user")
  public AddressableEntityRef getUser() {
    return user;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationUserDisposition conversationUserDisposition = (ConversationUserDisposition) o;
    return Objects.equals(this.code, conversationUserDisposition.code) &&
        Objects.equals(this.notes, conversationUserDisposition.notes) &&
        Objects.equals(this.user, conversationUserDisposition.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, notes, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationUserDisposition {\n");
    
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

