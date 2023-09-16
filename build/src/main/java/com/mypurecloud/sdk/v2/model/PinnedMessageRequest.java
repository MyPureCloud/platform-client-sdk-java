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
 * PinnedMessageRequest
 */

public class PinnedMessageRequest  implements Serializable {
  
  private List<String> pinnedMessageIds = new ArrayList<String>();

  
  /**
   * Ids of the messages to pin
   **/
  public PinnedMessageRequest pinnedMessageIds(List<String> pinnedMessageIds) {
    this.pinnedMessageIds = pinnedMessageIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Ids of the messages to pin")
  @JsonProperty("pinnedMessageIds")
  public List<String> getPinnedMessageIds() {
    return pinnedMessageIds;
  }
  public void setPinnedMessageIds(List<String> pinnedMessageIds) {
    this.pinnedMessageIds = pinnedMessageIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PinnedMessageRequest pinnedMessageRequest = (PinnedMessageRequest) o;

    return Objects.equals(this.pinnedMessageIds, pinnedMessageRequest.pinnedMessageIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pinnedMessageIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PinnedMessageRequest {\n");
    
    sb.append("    pinnedMessageIds: ").append(toIndentedString(pinnedMessageIds)).append("\n");
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

