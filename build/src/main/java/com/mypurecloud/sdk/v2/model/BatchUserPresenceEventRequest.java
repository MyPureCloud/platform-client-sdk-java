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
import com.mypurecloud.sdk.v2.model.UserPresenceEvent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A maximum of 100 events are allowed per request
 */
@ApiModel(description = "A maximum of 100 events are allowed per request")

public class BatchUserPresenceEventRequest  implements Serializable {
  
  private List<UserPresenceEvent> userPresenceEvents = null;

  public BatchUserPresenceEventRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userPresenceEvents = new ArrayList<UserPresenceEvent>();
    }
  }

  
  /**
   * UserPresence events for this batch
   **/
  public BatchUserPresenceEventRequest userPresenceEvents(List<UserPresenceEvent> userPresenceEvents) {
    this.userPresenceEvents = userPresenceEvents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "UserPresence events for this batch")
  @JsonProperty("userPresenceEvents")
  public List<UserPresenceEvent> getUserPresenceEvents() {
    return userPresenceEvents;
  }
  public void setUserPresenceEvents(List<UserPresenceEvent> userPresenceEvents) {
    this.userPresenceEvents = userPresenceEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BatchUserPresenceEventRequest batchUserPresenceEventRequest = (BatchUserPresenceEventRequest) o;

    return Objects.equals(this.userPresenceEvents, batchUserPresenceEventRequest.userPresenceEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userPresenceEvents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BatchUserPresenceEventRequest {\n");
    
    sb.append("    userPresenceEvents: ").append(toIndentedString(userPresenceEvents)).append("\n");
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

