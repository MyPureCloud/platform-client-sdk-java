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
 * UpdateMuAgentRequest
 */

public class UpdateMuAgentRequest  implements Serializable {
  
  private Boolean schedulable = null;
  private String userId = null;

  public UpdateMuAgentRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Whether the agent can be included in schedule generation
   **/
  public UpdateMuAgentRequest schedulable(Boolean schedulable) {
    this.schedulable = schedulable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the agent can be included in schedule generation")
  @JsonProperty("schedulable")
  public Boolean getSchedulable() {
    return schedulable;
  }
  public void setSchedulable(Boolean schedulable) {
    this.schedulable = schedulable;
  }


  /**
   * User to be updated
   **/
  public UpdateMuAgentRequest userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "User to be updated")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMuAgentRequest updateMuAgentRequest = (UpdateMuAgentRequest) o;

    return Objects.equals(this.schedulable, updateMuAgentRequest.schedulable) &&
            Objects.equals(this.userId, updateMuAgentRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schedulable, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMuAgentRequest {\n");
    
    sb.append("    schedulable: ").append(toIndentedString(schedulable)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

