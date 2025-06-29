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
import com.mypurecloud.sdk.v2.model.ListPickerSection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ListPicker
 */

public class ListPicker  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private List<ListPickerSection> sections = null;

  public ListPicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sections = new ArrayList<ListPickerSection>();
    }
  }

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple List Pickers can be present.
   **/
  public ListPicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unique identifier to help map component replies to form messages where multiple List Pickers can be present.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Text to show in the title.
   **/
  public ListPicker title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Text to show in the description.
   **/
  public ListPicker subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * An array of sections in the List Picker.
   **/
  public ListPicker sections(List<ListPickerSection> sections) {
    this.sections = sections;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of sections in the List Picker.")
  @JsonProperty("sections")
  public List<ListPickerSection> getSections() {
    return sections;
  }
  public void setSections(List<ListPickerSection> sections) {
    this.sections = sections;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListPicker listPicker = (ListPicker) o;

    return Objects.equals(this.id, listPicker.id) &&
            Objects.equals(this.title, listPicker.title) &&
            Objects.equals(this.subtitle, listPicker.subtitle) &&
            Objects.equals(this.sections, listPicker.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    sections: ").append(toIndentedString(sections)).append("\n");
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

