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
import com.mypurecloud.sdk.v2.model.AssistantQueue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AssistantQueueUsersQueryResponse
 */

public class AssistantQueueUsersQueryResponse  implements Serializable {
  
  private AssistantQueue queue = null;
  private List<UserReference> users = null;

  public AssistantQueueUsersQueryResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      users = new ArrayList<UserReference>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The queue information.")
  @JsonProperty("queue")
  public AssistantQueue getQueue() {
    return queue;
  }


  @ApiModelProperty(example = "null", value = "List of users in the queue for which assistant is assigned.")
  @JsonProperty("users")
  public List<UserReference> getUsers() {
    return users;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssistantQueueUsersQueryResponse assistantQueueUsersQueryResponse = (AssistantQueueUsersQueryResponse) o;

    return Objects.equals(this.queue, assistantQueueUsersQueryResponse.queue) &&
            Objects.equals(this.users, assistantQueueUsersQueryResponse.users);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, users);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantQueueUsersQueryResponse {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
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

