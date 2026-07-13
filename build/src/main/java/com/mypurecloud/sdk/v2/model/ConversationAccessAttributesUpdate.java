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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationAccessAttributesUpdate
 */

public class ConversationAccessAttributesUpdate  implements Serializable {
  
  private List<String> accessAttributes = null;

  public ConversationAccessAttributesUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      accessAttributes = new ArrayList<String>();
    }
  }

  public ConversationAccessAttributesUpdate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      accessAttributes = new ArrayList<String>();
    }
  }

  
  /**
   * The attributes that define which users may access a conversation. Values must be non-null, non-blank, and contain only alphanumeric characters, hyphens, and underscores.
   **/
  public ConversationAccessAttributesUpdate accessAttributes(List<String> accessAttributes) {
    this.accessAttributes = accessAttributes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The attributes that define which users may access a conversation. Values must be non-null, non-blank, and contain only alphanumeric characters, hyphens, and underscores.")
  @JsonProperty("accessAttributes")
  public List<String> getAccessAttributes() {
    return accessAttributes;
  }
  public void setAccessAttributes(List<String> accessAttributes) {
    this.accessAttributes = accessAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAccessAttributesUpdate conversationAccessAttributesUpdate = (ConversationAccessAttributesUpdate) o;

    return Objects.equals(this.accessAttributes, conversationAccessAttributesUpdate.accessAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessAttributes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAccessAttributesUpdate {\n");
    
    sb.append("    accessAttributes: ").append(toIndentedString(accessAttributes)).append("\n");
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

