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
 * RollbackDecisionTableVersionRequest
 */

public class RollbackDecisionTableVersionRequest  implements Serializable {
  
  private String rollbackReason = null;

  public RollbackDecisionTableVersionRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public RollbackDecisionTableVersionRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Optional note recorded on the target version when rollback succeeds. Present while the version is Published after rollback; cleared when Superseded. Max: 200 characters.
   **/
  public RollbackDecisionTableVersionRequest rollbackReason(String rollbackReason) {
    this.rollbackReason = rollbackReason;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional note recorded on the target version when rollback succeeds. Present while the version is Published after rollback; cleared when Superseded. Max: 200 characters.")
  @JsonProperty("rollbackReason")
  public String getRollbackReason() {
    return rollbackReason;
  }
  public void setRollbackReason(String rollbackReason) {
    this.rollbackReason = rollbackReason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RollbackDecisionTableVersionRequest rollbackDecisionTableVersionRequest = (RollbackDecisionTableVersionRequest) o;

    return Objects.equals(this.rollbackReason, rollbackDecisionTableVersionRequest.rollbackReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rollbackReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RollbackDecisionTableVersionRequest {\n");
    
    sb.append("    rollbackReason: ").append(toIndentedString(rollbackReason)).append("\n");
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

