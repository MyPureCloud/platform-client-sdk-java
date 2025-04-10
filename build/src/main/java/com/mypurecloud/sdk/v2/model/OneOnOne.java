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
 * OneOnOne
 */

public class OneOnOne  implements Serializable {
  
  private List<AddressableEntityRef> pinnedMessages = null;

  public OneOnOne() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      pinnedMessages = new ArrayList<AddressableEntityRef>();
    }
  }

  
  /**
   * Room's pinned messages
   **/
  public OneOnOne pinnedMessages(List<AddressableEntityRef> pinnedMessages) {
    this.pinnedMessages = pinnedMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Room's pinned messages")
  @JsonProperty("pinnedMessages")
  public List<AddressableEntityRef> getPinnedMessages() {
    return pinnedMessages;
  }
  public void setPinnedMessages(List<AddressableEntityRef> pinnedMessages) {
    this.pinnedMessages = pinnedMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OneOnOne oneOnOne = (OneOnOne) o;

    return Objects.equals(this.pinnedMessages, oneOnOne.pinnedMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinnedMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OneOnOne {\n");
    
    sb.append("    pinnedMessages: ").append(toIndentedString(pinnedMessages)).append("\n");
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

