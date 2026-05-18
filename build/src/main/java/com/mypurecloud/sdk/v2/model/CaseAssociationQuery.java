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
 * CaseAssociationQuery
 */

public class CaseAssociationQuery  implements Serializable {
  
  private Integer pageSize = null;
  private String after = null;
  private String workitemId = null;
  private String conversationId = null;

  public CaseAssociationQuery() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CaseAssociationQuery(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The number of entities to return in the response.
   **/
  public CaseAssociationQuery pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of entities to return in the response.")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  /**
   * The cursor that points to the end of the set of entities that has been returned.
   **/
  public CaseAssociationQuery after(String after) {
    this.after = after;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The cursor that points to the end of the set of entities that has been returned.")
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }


  /**
   * The Workitem ID to query by.
   **/
  public CaseAssociationQuery workitemId(String workitemId) {
    this.workitemId = workitemId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Workitem ID to query by.")
  @JsonProperty("workitemId")
  public String getWorkitemId() {
    return workitemId;
  }
  public void setWorkitemId(String workitemId) {
    this.workitemId = workitemId;
  }


  /**
   * The conversation ID to query by.
   **/
  public CaseAssociationQuery conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The conversation ID to query by.")
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
    CaseAssociationQuery caseAssociationQuery = (CaseAssociationQuery) o;

    return Objects.equals(this.pageSize, caseAssociationQuery.pageSize) &&
            Objects.equals(this.after, caseAssociationQuery.after) &&
            Objects.equals(this.workitemId, caseAssociationQuery.workitemId) &&
            Objects.equals(this.conversationId, caseAssociationQuery.conversationId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageSize, after, workitemId, conversationId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseAssociationQuery {\n");
    
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

