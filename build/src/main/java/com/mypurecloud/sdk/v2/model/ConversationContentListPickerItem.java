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

import java.io.Serializable;
/**
 * Represents a selectable item in a list picker.
 */
@ApiModel(description = "Represents a selectable item in a list picker.")

public class ConversationContentListPickerItem  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private String imageUrl = null;

  public ConversationContentListPickerItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier for the list picker item
   **/
  public ConversationContentListPickerItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the list picker item")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The main text displayed for the item.
   **/
  public ConversationContentListPickerItem title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The main text displayed for the item.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Additional text providing more details about the item.
   **/
  public ConversationContentListPickerItem subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional text providing more details about the item.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * URL of an image to be displayed alongside the item.
   **/
  public ConversationContentListPickerItem imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image to be displayed alongside the item.")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentListPickerItem conversationContentListPickerItem = (ConversationContentListPickerItem) o;

    return Objects.equals(this.id, conversationContentListPickerItem.id) &&
            Objects.equals(this.title, conversationContentListPickerItem.title) &&
            Objects.equals(this.subtitle, conversationContentListPickerItem.subtitle) &&
            Objects.equals(this.imageUrl, conversationContentListPickerItem.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentListPickerItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

