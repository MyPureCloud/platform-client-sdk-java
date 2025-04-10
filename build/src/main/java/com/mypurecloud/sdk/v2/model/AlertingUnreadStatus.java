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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AlertingUnreadStatus
 */

public class AlertingUnreadStatus  implements Serializable {
  
  private Boolean unread = null;

  public AlertingUnreadStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * True is alert is unread, false if it has not been.
   **/
  public AlertingUnreadStatus unread(Boolean unread) {
    this.unread = unread;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True is alert is unread, false if it has not been.")
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
    AlertingUnreadStatus alertingUnreadStatus = (AlertingUnreadStatus) o;

    return Objects.equals(this.unread, alertingUnreadStatus.unread);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unread);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertingUnreadStatus {\n");
    
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

