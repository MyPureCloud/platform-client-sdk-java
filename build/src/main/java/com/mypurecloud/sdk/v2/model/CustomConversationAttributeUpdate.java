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
import java.util.Date;

import java.io.Serializable;
/**
 * A single Conversation Custom Attribute value update made during a guide session turn.
 */
@ApiModel(description = "A single Conversation Custom Attribute value update made during a guide session turn.")

public class CustomConversationAttributeUpdate  implements Serializable {
  
  private String name = null;
  private Object value = null;
  private Date dateModified = null;

  public CustomConversationAttributeUpdate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CustomConversationAttributeUpdate(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The name of the conversation attribute that was updated.
   **/
  public CustomConversationAttributeUpdate name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the conversation attribute that was updated.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The value of the conversation attribute after the update. The JSON type depends on the attribute's definition in its schema, for example string, number, or boolean.
   **/
  public CustomConversationAttributeUpdate value(Object value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the conversation attribute after the update. The JSON type depends on the attribute's definition in its schema, for example string, number, or boolean.")
  @JsonProperty("value")
  public Object getValue() {
    return value;
  }
  public void setValue(Object value) {
    this.value = value;
  }


  /**
   * The date and time the attribute was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CustomConversationAttributeUpdate dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date and time the attribute was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomConversationAttributeUpdate customConversationAttributeUpdate = (CustomConversationAttributeUpdate) o;

    return Objects.equals(this.name, customConversationAttributeUpdate.name) &&
            Objects.equals(this.value, customConversationAttributeUpdate.value) &&
            Objects.equals(this.dateModified, customConversationAttributeUpdate.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomConversationAttributeUpdate {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

