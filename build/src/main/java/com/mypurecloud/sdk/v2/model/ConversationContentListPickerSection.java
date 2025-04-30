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
import com.mypurecloud.sdk.v2.model.ConversationContentListPickerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List Picker object for presenting a section of selectable items.
 */
@ApiModel(description = "List Picker object for presenting a section of selectable items.")

public class ConversationContentListPickerSection  implements Serializable {
  
  private String title = null;
  private Boolean multipleSelection = null;
  private List<ConversationContentListPickerItem> items = null;

  public ConversationContentListPickerSection() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      items = new ArrayList<ConversationContentListPickerItem>();
    }
  }

  
  /**
   * Required title for the section.
   **/
  public ConversationContentListPickerSection title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required title for the section.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Whether multiple items can be selected in this section.
   **/
  public ConversationContentListPickerSection multipleSelection(Boolean multipleSelection) {
    this.multipleSelection = multipleSelection;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether multiple items can be selected in this section.")
  @JsonProperty("multipleSelection")
  public Boolean getMultipleSelection() {
    return multipleSelection;
  }
  public void setMultipleSelection(Boolean multipleSelection) {
    this.multipleSelection = multipleSelection;
  }


  /**
   * List of items to choice from in the section
   **/
  public ConversationContentListPickerSection items(List<ConversationContentListPickerItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of items to choice from in the section")
  @JsonProperty("items")
  public List<ConversationContentListPickerItem> getItems() {
    return items;
  }
  public void setItems(List<ConversationContentListPickerItem> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentListPickerSection conversationContentListPickerSection = (ConversationContentListPickerSection) o;

    return Objects.equals(this.title, conversationContentListPickerSection.title) &&
            Objects.equals(this.multipleSelection, conversationContentListPickerSection.multipleSelection) &&
            Objects.equals(this.items, conversationContentListPickerSection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, multipleSelection, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentListPickerSection {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    multipleSelection: ").append(toIndentedString(multipleSelection)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

