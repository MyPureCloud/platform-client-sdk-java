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

import java.io.Serializable;
/**
 * QueueConversationEventTopicAddress
 */

public class QueueConversationEventTopicAddress  implements Serializable {
  
  private String name = null;
  private String nameRaw = null;
  private String addressNormalized = null;
  private String addressRaw = null;
  private String addressDisplayable = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public QueueConversationEventTopicAddress name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public QueueConversationEventTopicAddress nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nameRaw")
  public String getNameRaw() {
    return nameRaw;
  }
  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  
  /**
   **/
  public QueueConversationEventTopicAddress addressNormalized(String addressNormalized) {
    this.addressNormalized = addressNormalized;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressNormalized")
  public String getAddressNormalized() {
    return addressNormalized;
  }
  public void setAddressNormalized(String addressNormalized) {
    this.addressNormalized = addressNormalized;
  }

  
  /**
   **/
  public QueueConversationEventTopicAddress addressRaw(String addressRaw) {
    this.addressRaw = addressRaw;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressRaw")
  public String getAddressRaw() {
    return addressRaw;
  }
  public void setAddressRaw(String addressRaw) {
    this.addressRaw = addressRaw;
  }

  
  /**
   **/
  public QueueConversationEventTopicAddress addressDisplayable(String addressDisplayable) {
    this.addressDisplayable = addressDisplayable;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("addressDisplayable")
  public String getAddressDisplayable() {
    return addressDisplayable;
  }
  public void setAddressDisplayable(String addressDisplayable) {
    this.addressDisplayable = addressDisplayable;
  }

  
  /**
   **/
  public QueueConversationEventTopicAddress additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicAddress queueConversationEventTopicAddress = (QueueConversationEventTopicAddress) o;
    return Objects.equals(this.name, queueConversationEventTopicAddress.name) &&
        Objects.equals(this.nameRaw, queueConversationEventTopicAddress.nameRaw) &&
        Objects.equals(this.addressNormalized, queueConversationEventTopicAddress.addressNormalized) &&
        Objects.equals(this.addressRaw, queueConversationEventTopicAddress.addressRaw) &&
        Objects.equals(this.addressDisplayable, queueConversationEventTopicAddress.addressDisplayable) &&
        Objects.equals(this.additionalProperties, queueConversationEventTopicAddress.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, nameRaw, addressNormalized, addressRaw, addressDisplayable, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicAddress {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
    sb.append("    addressNormalized: ").append(toIndentedString(addressNormalized)).append("\n");
    sb.append("    addressRaw: ").append(toIndentedString(addressRaw)).append("\n");
    sb.append("    addressDisplayable: ").append(toIndentedString(addressDisplayable)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

