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
 * RecordingWheelPickerItem
 */

public class RecordingWheelPickerItem  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String value = null;
  private Boolean isSelected = null;

  public RecordingWheelPickerItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier for the wheel picker item.
   **/
  public RecordingWheelPickerItem id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the wheel picker item.")
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
  public RecordingWheelPickerItem title(String title) {
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
   * The value of the item
   **/
  public RecordingWheelPickerItem value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the item")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  /**
   * Indicates if the item is selected by end customer.
   **/
  public RecordingWheelPickerItem isSelected(Boolean isSelected) {
    this.isSelected = isSelected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the item is selected by end customer.")
  @JsonProperty("isSelected")
  public Boolean getIsSelected() {
    return isSelected;
  }
  public void setIsSelected(Boolean isSelected) {
    this.isSelected = isSelected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingWheelPickerItem recordingWheelPickerItem = (RecordingWheelPickerItem) o;

    return Objects.equals(this.id, recordingWheelPickerItem.id) &&
            Objects.equals(this.title, recordingWheelPickerItem.title) &&
            Objects.equals(this.value, recordingWheelPickerItem.value) &&
            Objects.equals(this.isSelected, recordingWheelPickerItem.isSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, value, isSelected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingWheelPickerItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    isSelected: ").append(toIndentedString(isSelected)).append("\n");
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

