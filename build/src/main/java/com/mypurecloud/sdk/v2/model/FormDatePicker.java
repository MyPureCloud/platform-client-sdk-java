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
 * Date picker component for form input
 */
@ApiModel(description = "Date picker component for form input")

public class FormDatePicker  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private String dateDisplayFormat = null;

  public FormDatePicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier for the date picker
   **/
  public FormDatePicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the date picker")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Title of the date picker
   **/
  public FormDatePicker title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the date picker")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Subtitle of the date picker
   **/
  public FormDatePicker subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtitle of the date picker")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Date display format
   **/
  public FormDatePicker dateDisplayFormat(String dateDisplayFormat) {
    this.dateDisplayFormat = dateDisplayFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date display format")
  @JsonProperty("dateDisplayFormat")
  public String getDateDisplayFormat() {
    return dateDisplayFormat;
  }
  public void setDateDisplayFormat(String dateDisplayFormat) {
    this.dateDisplayFormat = dateDisplayFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FormDatePicker formDatePicker = (FormDatePicker) o;

    return Objects.equals(this.id, formDatePicker.id) &&
            Objects.equals(this.title, formDatePicker.title) &&
            Objects.equals(this.subtitle, formDatePicker.subtitle) &&
            Objects.equals(this.dateDisplayFormat, formDatePicker.dateDisplayFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, dateDisplayFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FormDatePicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    dateDisplayFormat: ").append(toIndentedString(dateDisplayFormat)).append("\n");
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

