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
import com.mypurecloud.sdk.v2.model.ConversationContentWheelPickerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Wheel Picker object for representing single selection of selectable items.
 */
@ApiModel(description = "Wheel Picker object for representing single selection of selectable items.")

public class ConversationContentWheelPicker  implements Serializable {
  
  private String id = null;
  private List<ConversationContentWheelPickerItem> items = null;

  public ConversationContentWheelPicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      items = new ArrayList<ConversationContentWheelPickerItem>();
    }
  }

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple Wheel Pickers can be present.
   **/
  public ConversationContentWheelPicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unique identifier to help map component replies to form messages where multiple Wheel Pickers can be present.")
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
  public ConversationContentWheelPicker items(List<ConversationContentWheelPickerItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The main text displayed for the item.")
  @JsonProperty("items")
  public List<ConversationContentWheelPickerItem> getItems() {
    return items;
  }
  public void setItems(List<ConversationContentWheelPickerItem> items) {
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
    ConversationContentWheelPicker conversationContentWheelPicker = (ConversationContentWheelPicker) o;

    return Objects.equals(this.id, conversationContentWheelPicker.id) &&
            Objects.equals(this.items, conversationContentWheelPicker.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, items);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentWheelPicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

