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
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicDivisionEntityRef;
import com.mypurecloud.sdk.v2.model.ConversationSocialExpressionEventTopicDomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationSocialExpressionEventTopicConversationDivisionMembership
 */

public class ConversationSocialExpressionEventTopicConversationDivisionMembership  implements Serializable {
  
  private ConversationSocialExpressionEventTopicDomainEntityRef division = null;
  private List<ConversationSocialExpressionEventTopicDivisionEntityRef> entities = null;

  public ConversationSocialExpressionEventTopicConversationDivisionMembership() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<ConversationSocialExpressionEventTopicDivisionEntityRef>();
    }
  }

  
  /**
   **/
  public ConversationSocialExpressionEventTopicConversationDivisionMembership division(ConversationSocialExpressionEventTopicDomainEntityRef division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("division")
  public ConversationSocialExpressionEventTopicDomainEntityRef getDivision() {
    return division;
  }
  public void setDivision(ConversationSocialExpressionEventTopicDomainEntityRef division) {
    this.division = division;
  }


  /**
   **/
  public ConversationSocialExpressionEventTopicConversationDivisionMembership entities(List<ConversationSocialExpressionEventTopicDivisionEntityRef> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<ConversationSocialExpressionEventTopicDivisionEntityRef> getEntities() {
    return entities;
  }
  public void setEntities(List<ConversationSocialExpressionEventTopicDivisionEntityRef> entities) {
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
    ConversationSocialExpressionEventTopicConversationDivisionMembership conversationSocialExpressionEventTopicConversationDivisionMembership = (ConversationSocialExpressionEventTopicConversationDivisionMembership) o;

    return Objects.equals(this.division, conversationSocialExpressionEventTopicConversationDivisionMembership.division) &&
            Objects.equals(this.entities, conversationSocialExpressionEventTopicConversationDivisionMembership.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(division, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationSocialExpressionEventTopicConversationDivisionMembership {\n");
    
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

