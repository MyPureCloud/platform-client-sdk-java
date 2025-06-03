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
import com.mypurecloud.sdk.v2.model.ListPickerItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ListPickerSection
 */

public class ListPickerSection  implements Serializable {
  
  private List<ListPickerItem> items = null;
  private Boolean multipleSelection = null;
  private String title = null;

  public ListPickerSection() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      items = new ArrayList<ListPickerItem>();
    }
  }

  
  /**
   * List of items to choose from in the section
   **/
  public ListPickerSection items(List<ListPickerItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of items to choose from in the section")
  @JsonProperty("items")
  public List<ListPickerItem> getItems() {
    return items;
  }
  public void setItems(List<ListPickerItem> items) {
    this.items = items;
  }


  /**
   * Whether multiple items can be selected in this section.
   **/
  public ListPickerSection multipleSelection(Boolean multipleSelection) {
    this.multipleSelection = multipleSelection;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether multiple items can be selected in this section.")
  @JsonProperty("multipleSelection")
  public Boolean getMultipleSelection() {
    return multipleSelection;
  }
  public void setMultipleSelection(Boolean multipleSelection) {
    this.multipleSelection = multipleSelection;
  }


  /**
   * Required title for the section.
   **/
  public ListPickerSection title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Required title for the section.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPickerSection listPickerSection = (ListPickerSection) o;

    return Objects.equals(this.items, listPickerSection.items) &&
            Objects.equals(this.multipleSelection, listPickerSection.multipleSelection) &&
            Objects.equals(this.title, listPickerSection.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, multipleSelection, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPickerSection {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    multipleSelection: ").append(toIndentedString(multipleSelection)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

