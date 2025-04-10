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
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicDivisionEntityRef;
import com.mypurecloud.sdk.v2.model.ConversationScreenShareEventTopicDomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationScreenShareEventTopicConversationDivisionMembership
 */

public class ConversationScreenShareEventTopicConversationDivisionMembership  implements Serializable {
  
  private ConversationScreenShareEventTopicDomainEntityRef division = null;
  private List<ConversationScreenShareEventTopicDivisionEntityRef> entities = null;

  public ConversationScreenShareEventTopicConversationDivisionMembership() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ConversationScreenShareEventTopicDivisionEntityRef>();
    }
  }

  
  /**
   **/
  public ConversationScreenShareEventTopicConversationDivisionMembership division(ConversationScreenShareEventTopicDomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ConversationScreenShareEventTopicDomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(ConversationScreenShareEventTopicDomainEntityRef division) {
    this.division = division;
  }


  /**
   **/
  public ConversationScreenShareEventTopicConversationDivisionMembership entities(List<ConversationScreenShareEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ConversationScreenShareEventTopicDivisionEntityRef> getEntities() {
    return entities;
  }
  public void setEntities(List<ConversationScreenShareEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationScreenShareEventTopicConversationDivisionMembership conversationScreenShareEventTopicConversationDivisionMembership = (ConversationScreenShareEventTopicConversationDivisionMembership) o;

    return Objects.equals(this.division, conversationScreenShareEventTopicConversationDivisionMembership.division) &&
            Objects.equals(this.entities, conversationScreenShareEventTopicConversationDivisionMembership.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationScreenShareEventTopicConversationDivisionMembership {\n");
    
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

