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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingConversationAttributesRequest
 */

public class RoutingConversationAttributesRequest  implements Serializable {
  
  private Integer priority = null;
  private List<String> skillIds = new ArrayList<String>();
  private String languageId = null;

  
  /**
   * Priority to be updated on in-queue conversation. Range:[-25000000, 25000000]
   * minimum: -25000000
   * maximum: 25000000
   **/
  public RoutingConversationAttributesRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Priority to be updated on in-queue conversation. Range:[-25000000, 25000000]")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * Skills to be updated on in-queue conversation.
   **/
  public RoutingConversationAttributesRequest skillIds(List<String> skillIds) {
    this.skillIds = skillIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Skills to be updated on in-queue conversation.")
  @JsonProperty("skillIds")
  public List<String> getSkillIds() {
    return skillIds;
  }
  public void setSkillIds(List<String> skillIds) {
    this.skillIds = skillIds;
  }

  
  /**
   * Language required on the in-queue conversation.
   **/
  public RoutingConversationAttributesRequest languageId(String languageId) {
    this.languageId = languageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language required on the in-queue conversation.")
  @JsonProperty("languageId")
  public String getLanguageId() {
    return languageId;
  }
  public void setLanguageId(String languageId) {
    this.languageId = languageId;
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
        Objects.equals(this.languageId, routingConversationAttributesRequest.languageId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, skillIds, languageId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingConversationAttributesRequest {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skillIds: ").append(toIndentedString(skillIds)).append("\n");
    sb.append("    languageId: ").append(toIndentedString(languageId)).append("\n");
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

