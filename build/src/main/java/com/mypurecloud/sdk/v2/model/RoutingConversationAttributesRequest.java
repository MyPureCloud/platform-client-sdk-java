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
import com.mypurecloud.sdk.v2.model.RequestScoredAgent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingConversationAttributesRequest
 */

public class RoutingConversationAttributesRequest  implements Serializable {
  
  private Integer priority = null;
  private List<String> skillIds = null;
  private String languageId = null;
  private String labelId = null;
  private List<RequestScoredAgent> requestScoredAgents = null;

  public RoutingConversationAttributesRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skillIds = new ArrayList<String>();
      requestScoredAgents = new ArrayList<RequestScoredAgent>();
    }
  }

  
  /**
   * Priority for the conversation.  Each point of priority is equivalent to one minute of time in queue.  Range:[-25000000, 25000000].  To reset, specify 0.
   * minimum: -25000000
   * maximum: 25000000
   **/
  public RoutingConversationAttributesRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Priority for the conversation.  Each point of priority is equivalent to one minute of time in queue.  Range:[-25000000, 25000000].  To reset, specify 0.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * Skill requirements for the conversation.  To remove all skill requirements, specify an empty list, i.e. [].
   **/
  public RoutingConversationAttributesRequest skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Skill requirements for the conversation.  To remove all skill requirements, specify an empty list, i.e. [].")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }


  /**
   * Language requirement for the conversation.  To remove the language requirement, specify an empty string, i.e., \"\".
   **/
  public RoutingConversationAttributesRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language requirement for the conversation.  To remove the language requirement, specify an empty string, i.e., \"\".")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
  }


  /**
   * Label requirement for the conversation.  To remove the label requirement (setting it to System Default Label), specify an empty string, i.e., \"\".
   **/
  public RoutingConversationAttributesRequest labelId(String labelId) {
    this.labelId = labelId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Label requirement for the conversation.  To remove the label requirement (setting it to System Default Label), specify an empty string, i.e., \"\".")
  @JsonProperty("labelId")
  public String getLabelId() {
    return labelId;
  }
  public void setLabelId(String labelId) {
    this.labelId = labelId;
  }


  /**
   **/
  public RoutingConversationAttributesRequest requestScoredAgents(List<RequestScoredAgent> requestScoredAgents) {
    this.requestScoredAgents = requestScoredAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("requestScoredAgents")
  public List<RequestScoredAgent> getRequestScoredAgents() {
    return requestScoredAgents;
  }
  public void setRequestScoredAgents(List<RequestScoredAgent> requestScoredAgents) {
    this.requestScoredAgents = requestScoredAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingConversationAttributesRequest routingConversationAttributesRequest = (RoutingConversationAttributesRequest) o;

    return Objects.equals(this.priority, routingConversationAttributesRequest.priority) &&
            Objects.equals(this.skillIds, routingConversationAttributesRequest.skillIds) &&
            Objects.equals(this.languageId, routingConversationAttributesRequest.languageId) &&
            Objects.equals(this.labelId, routingConversationAttributesRequest.labelId) &&
            Objects.equals(this.requestScoredAgents, routingConversationAttributesRequest.requestScoredAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, skillIds, languageId, labelId, requestScoredAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingConversationAttributesRequest {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
    sb.append("    labelId: ").append(toIndentedString(labelId)).append("\n");
    sb.append("    requestScoredAgents: ").append(toIndentedString(requestScoredAgents)).append("\n");
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

