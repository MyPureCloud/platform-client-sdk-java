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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UnreadStatus
 */

public class UnreadStatus  implements Serializable {
  
  private Boolean unread = null;

  
  /**
   * Sets if the alert is read or unread.
   **/
  public UnreadStatus unread(Boolean unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sets if the alert is read or unread.")
  @JsonProperty("unread")
  public Boolean getUnread() {
    return unread;
  }
  public void setUnread(Boolean unread) {
    this.unread = unread;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnreadStatus unreadStatus = (UnreadStatus) o;
    return Objects.equals(this.unread, unreadStatus.unread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnreadStatus {\n");
    
    sb.append("    unread: ").append(toIndentedString(unread)).append("\n");
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

