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
import com.mypurecloud.sdk.v2.model.FormListPickerSection;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * List picker component configuration
 */
@ApiModel(description = "List picker component configuration")

public class FormListPicker  implements Serializable {
  
  private String id = null;
  private List<FormListPickerSection> sections = null;

  public FormListPicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sections = new ArrayList<FormListPickerSection>();
    }
  }

  
  /**
   * Unique identifier for the list picker
   **/
  public FormListPicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the list picker")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Sections in the list picker
   **/
  public FormListPicker sections(List<FormListPickerSection> sections) {
    this.sections = sections;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Sections in the list picker")
  @JsonProperty("sections")
  public List<FormListPickerSection> getSections() {
    return sections;
  }
  public void setSections(List<FormListPickerSection> sections) {
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
    FormListPicker formListPicker = (FormListPicker) o;

    return Objects.equals(this.id, formListPicker.id) &&
            Objects.equals(this.sections, formListPicker.sections);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sections);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormListPicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

