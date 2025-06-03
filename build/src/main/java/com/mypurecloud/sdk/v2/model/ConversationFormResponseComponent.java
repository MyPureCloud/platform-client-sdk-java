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
import com.mypurecloud.sdk.v2.model.ConversationFormResponseContent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A response component from a form
 */
@ApiModel(description = "A response component from a form")

public class ConversationFormResponseComponent  implements Serializable {
  
  private String id = null;
  private ConversationFormResponseContent component = null;

  public ConversationFormResponseComponent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id of the component in the original message.
   **/
  public ConversationFormResponseComponent id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the component in the original message.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The content object capturing component response from the original message.
   **/
  public ConversationFormResponseComponent component(ConversationFormResponseContent component) {
    this.component = component;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The content object capturing component response from the original message.")
  @JsonProperty("component")
  public ConversationFormResponseContent getComponent() {
    return component;
  }
  public void setComponent(ConversationFormResponseContent component) {
    this.component = component;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationFormResponseComponent conversationFormResponseComponent = (ConversationFormResponseComponent) o;

    return Objects.equals(this.id, conversationFormResponseComponent.id) &&
            Objects.equals(this.component, conversationFormResponseComponent.component);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, component);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationFormResponseComponent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
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

