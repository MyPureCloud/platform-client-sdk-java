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
import java.math.BigDecimal;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationContentLocation
 */

public class V2ConversationMessageTypingEventForUserTopicConversationContentLocation  implements Serializable {
  
  private String url = null;
  private String address = null;
  private String text = null;
  private BigDecimal latitude = null;
  private BigDecimal longitude = null;

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentLocation url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentLocation address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentLocation text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentLocation latitude(BigDecimal latitude) {
    this.latitude = latitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("latitude")
  public BigDecimal getLatitude() {
    return latitude;
  }
  public void setLatitude(BigDecimal latitude) {
    this.latitude = latitude;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentLocation longitude(BigDecimal longitude) {
    this.longitude = longitude;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("longitude")
  public BigDecimal getLongitude() {
    return longitude;
  }
  public void setLongitude(BigDecimal longitude) {
    this.longitude = longitude;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConversationMessageTypingEventForUserTopicConversationContentLocation v2ConversationMessageTypingEventForUserTopicConversationContentLocation = (V2ConversationMessageTypingEventForUserTopicConversationContentLocation) o;
    return Objects.equals(this.url, v2ConversationMessageTypingEventForUserTopicConversationContentLocation.url) &&
        Objects.equals(this.address, v2ConversationMessageTypingEventForUserTopicConversationContentLocation.address) &&
        Objects.equals(this.text, v2ConversationMessageTypingEventForUserTopicConversationContentLocation.text) &&
        Objects.equals(this.latitude, v2ConversationMessageTypingEventForUserTopicConversationContentLocation.latitude) &&
        Objects.equals(this.longitude, v2ConversationMessageTypingEventForUserTopicConversationContentLocation.longitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, address, text, latitude, longitude);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationContentLocation {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
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

