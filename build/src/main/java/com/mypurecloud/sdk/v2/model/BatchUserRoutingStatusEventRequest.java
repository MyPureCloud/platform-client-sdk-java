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
import com.mypurecloud.sdk.v2.model.UserRoutingStatusEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A maximum of 100 events are allowed per request
 */
@ApiModel(description = "A maximum of 100 events are allowed per request")

public class BatchUserRoutingStatusEventRequest  implements Serializable {
  
  private List<UserRoutingStatusEvent> userRoutingStatusEvents = null;

  public BatchUserRoutingStatusEventRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userRoutingStatusEvents = new ArrayList<UserRoutingStatusEvent>();
    }
  }

  
  /**
   * UserRoutingStatus events for this batch
   **/
  public BatchUserRoutingStatusEventRequest userRoutingStatusEvents(List<UserRoutingStatusEvent> userRoutingStatusEvents) {
    this.userRoutingStatusEvents = userRoutingStatusEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UserRoutingStatus events for this batch")
  @JsonProperty("userRoutingStatusEvents")
  public List<UserRoutingStatusEvent> getUserRoutingStatusEvents() {
    return userRoutingStatusEvents;
  }
  public void setUserRoutingStatusEvents(List<UserRoutingStatusEvent> userRoutingStatusEvents) {
    this.userRoutingStatusEvents = userRoutingStatusEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUserRoutingStatusEventRequest batchUserRoutingStatusEventRequest = (BatchUserRoutingStatusEventRequest) o;

    return Objects.equals(this.userRoutingStatusEvents, batchUserRoutingStatusEventRequest.userRoutingStatusEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userRoutingStatusEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUserRoutingStatusEventRequest {\n");
    
    sb.append("    userRoutingStatusEvents: ").append(toIndentedString(userRoutingStatusEvents)).append("\n");
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

