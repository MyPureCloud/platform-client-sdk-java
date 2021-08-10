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
import com.mypurecloud.sdk.v2.model.Language;
import com.mypurecloud.sdk.v2.model.RoutingSkill;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RoutingConversationAttributesResponse
 */

public class RoutingConversationAttributesResponse  implements Serializable {
  
  private Integer priority = null;
  private List<RoutingSkill> skills = new ArrayList<RoutingSkill>();
  private Language language = null;

  
  /**
   * Current priority value on in-queue conversation. Range:[-25000000, 25000000]
   **/
  public RoutingConversationAttributesResponse priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current priority value on in-queue conversation. Range:[-25000000, 25000000]")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  
  /**
   * Current routing skills on in-queue conversation
   **/
  public RoutingConversationAttributesResponse skills(List<RoutingSkill> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current routing skills on in-queue conversation")
  @JsonProperty("skills")
  public List<RoutingSkill> getSkills() {
    return skills;
  }
  public void setSkills(List<RoutingSkill> skills) {
    this.skills = skills;
  }

  
  /**
   * Current language on in-queue conversation
   **/
  public RoutingConversationAttributesResponse language(Language language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current language on in-queue conversation")
  @JsonProperty("language")
  public Language getLanguage() {
    return language;
  }
  public void setLanguage(Language language) {
    this.language = language;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RoutingConversationAttributesResponse routingConversationAttributesResponse = (RoutingConversationAttributesResponse) o;
    return Objects.equals(this.priority, routingConversationAttributesResponse.priority) &&
        Objects.equals(this.skills, routingConversationAttributesResponse.skills) &&
        Objects.equals(this.language, routingConversationAttributesResponse.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority, skills, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RoutingConversationAttributesResponse {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

