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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChatReaction
 */

public class ChatReaction  implements Serializable {
  
  private String emoji = null;
  private List<AddressableEntityRef> users = null;

  public ChatReaction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      users = new ArrayList<AddressableEntityRef>();
    }
  }

  
  /**
   * The emoji string for the reaction
   **/
  public ChatReaction emoji(String emoji) {
    this.emoji = emoji;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The emoji string for the reaction")
  @JsonProperty("emoji")
  public String getEmoji() {
    return emoji;
  }
  public void setEmoji(String emoji) {
    this.emoji = emoji;
  }


  /**
   * The users that reacted with an emoji
   **/
  public ChatReaction users(List<AddressableEntityRef> users) {
    this.users = users;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The users that reacted with an emoji")
  @JsonProperty("users")
  public List<AddressableEntityRef> getUsers() {
    return users;
  }
  public void setUsers(List<AddressableEntityRef> users) {
    this.users = users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatReaction chatReaction = (ChatReaction) o;

    return Objects.equals(this.emoji, chatReaction.emoji) &&
            Objects.equals(this.users, chatReaction.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emoji, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatReaction {\n");
    
    sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
    sb.append("    users: ").append(toIndentedString(users)).append("\n");
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

