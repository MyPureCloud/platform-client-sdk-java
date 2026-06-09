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
 * CaseAssociationCreate
 */

public class CaseAssociationCreate  implements Serializable {
  
  private String workitemId = null;
  private String conversationId = null;

  public CaseAssociationCreate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CaseAssociationCreate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The ID of the Workitem to associate with the Case.
   **/
  public CaseAssociationCreate workitemId(String workitemId) {
    this.workitemId = workitemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Workitem to associate with the Case.")
  @JsonProperty("workitemId")
  public String getWorkitemId() {
    return workitemId;
  }
  public void setWorkitemId(String workitemId) {
    this.workitemId = workitemId;
  }


  /**
   * The ID of the Conversation to associate with the Case.
   **/
  public CaseAssociationCreate conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ID of the Conversation to associate with the Case.")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseAssociationCreate caseAssociationCreate = (CaseAssociationCreate) o;

    return Objects.equals(this.workitemId, caseAssociationCreate.workitemId) &&
            Objects.equals(this.conversationId, caseAssociationCreate.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workitemId, conversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseAssociationCreate {\n");
    
    sb.append("    workitemId: ").append(toIndentedString(workitemId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
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

