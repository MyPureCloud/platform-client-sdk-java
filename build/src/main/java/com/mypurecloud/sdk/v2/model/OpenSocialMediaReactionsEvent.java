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
import com.mypurecloud.sdk.v2.model.ContentReaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Social Message event element.
 */
@ApiModel(description = "Social Message event element.")

public class OpenSocialMediaReactionsEvent  implements Serializable {
  
  private List<ContentReaction> reactions = null;

  public OpenSocialMediaReactionsEvent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      reactions = new ArrayList<ContentReaction>();
    }
  }

  
  /**
   * List of reactions for this event.
   **/
  public OpenSocialMediaReactionsEvent reactions(List<ContentReaction> reactions) {
    this.reactions = reactions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of reactions for this event.")
  @JsonProperty("reactions")
  public List<ContentReaction> getReactions() {
    return reactions;
  }
  public void setReactions(List<ContentReaction> reactions) {
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
    OpenSocialMediaReactionsEvent openSocialMediaReactionsEvent = (OpenSocialMediaReactionsEvent) o;

    return Objects.equals(this.reactions, openSocialMediaReactionsEvent.reactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenSocialMediaReactionsEvent {\n");
    
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

