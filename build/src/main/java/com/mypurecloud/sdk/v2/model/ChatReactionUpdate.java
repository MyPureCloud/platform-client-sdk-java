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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ChatReactionUpdate
 */

public class ChatReactionUpdate  implements Serializable {
  
  private List<String> reactions = new ArrayList<String>();

  
  /**
   * Reactions to update
   **/
  public ChatReactionUpdate reactions(List<String> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Reactions to update")
  @JsonProperty("reactions")
  public List<String> getReactions() {
    return reactions;
  }
  public void setReactions(List<String> reactions) {
    this.reactions = reactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatReactionUpdate chatReactionUpdate = (ChatReactionUpdate) o;

    return Objects.equals(this.reactions, chatReactionUpdate.reactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatReactionUpdate {\n");
    
    sb.append("    reactions: ").append(toIndentedString(reactions)).append("\n");
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

