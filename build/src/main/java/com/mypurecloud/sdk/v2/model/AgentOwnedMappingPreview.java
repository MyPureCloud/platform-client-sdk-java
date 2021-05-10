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
 * AgentOwnedMappingPreview
 */

public class AgentOwnedMappingPreview  implements Serializable {
  
  private String agentOwnedColumn = null;
  private String email = null;
  private String userId = null;
  private Boolean exists = null;
  private Boolean isQueueMember = null;
  private Integer recordCount = null;

  
  @ApiModelProperty(example = "null", value = "The raw value of the agent-owned column")
  @JsonProperty("agentOwnedColumn")
  public String getAgentOwnedColumn() {
    return agentOwnedColumn;
  }

  
  @ApiModelProperty(example = "null", value = "The email address of the user, if it exists")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  
  @ApiModelProperty(example = "null", value = "The id of the user, if it exists")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }

  
  @ApiModelProperty(example = "null", value = "Whether the user exists")
  @JsonProperty("exists")
  public Boolean getExists() {
    return exists;
  }

  
  @ApiModelProperty(example = "null", value = "Whether the user is a member of the campaign's queue")
  @JsonProperty("isQueueMember")
  public Boolean getIsQueueMember() {
    return isQueueMember;
  }

  
  @ApiModelProperty(example = "null", value = "The number of contact records whose agent-owned column matches the raw value")
  @JsonProperty("recordCount")
  public Integer getRecordCount() {
    return recordCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentOwnedMappingPreview agentOwnedMappingPreview = (AgentOwnedMappingPreview) o;
    return Objects.equals(this.agentOwnedColumn, agentOwnedMappingPreview.agentOwnedColumn) &&
        Objects.equals(this.email, agentOwnedMappingPreview.email) &&
        Objects.equals(this.userId, agentOwnedMappingPreview.userId) &&
        Objects.equals(this.exists, agentOwnedMappingPreview.exists) &&
        Objects.equals(this.isQueueMember, agentOwnedMappingPreview.isQueueMember) &&
        Objects.equals(this.recordCount, agentOwnedMappingPreview.recordCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentOwnedColumn, email, userId, exists, isQueueMember, recordCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentOwnedMappingPreview {\n");
    
    sb.append("    agentOwnedColumn: ").append(toIndentedString(agentOwnedColumn)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    exists: ").append(toIndentedString(exists)).append("\n");
    sb.append("    isQueueMember: ").append(toIndentedString(isQueueMember)).append("\n");
    sb.append("    recordCount: ").append(toIndentedString(recordCount)).append("\n");
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

