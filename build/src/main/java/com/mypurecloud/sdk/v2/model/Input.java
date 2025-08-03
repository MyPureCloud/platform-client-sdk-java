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
 * Input component configuration
 */
@ApiModel(description = "Input component configuration")

public class Input  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private String placeholderText = null;
  private Boolean isMultipleLine = null;
  private Boolean isRequired = null;

  public Input() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier for the input field
   **/
  public Input id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the input field")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Title of the input field
   **/
  public Input title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the input field")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Subtitle of the input field
   **/
  public Input subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Subtitle of the input field")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Placeholder text for the input
   **/
  public Input placeholderText(String placeholderText) {
    this.placeholderText = placeholderText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Placeholder text for the input")
  @JsonProperty("placeholderText")
  public String getPlaceholderText() {
    return placeholderText;
  }
  public void setPlaceholderText(String placeholderText) {
    this.placeholderText = placeholderText;
  }


  /**
   * Whether the input supports multiple lines
   **/
  public Input isMultipleLine(Boolean isMultipleLine) {
    this.isMultipleLine = isMultipleLine;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the input supports multiple lines")
  @JsonProperty("isMultipleLine")
  public Boolean getIsMultipleLine() {
    return isMultipleLine;
  }
  public void setIsMultipleLine(Boolean isMultipleLine) {
    this.isMultipleLine = isMultipleLine;
  }


  /**
   * Whether the input is required
   **/
  public Input isRequired(Boolean isRequired) {
    this.isRequired = isRequired;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether the input is required")
  @JsonProperty("isRequired")
  public Boolean getIsRequired() {
    return isRequired;
  }
  public void setIsRequired(Boolean isRequired) {
    this.isRequired = isRequired;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Input input = (Input) o;

    return Objects.equals(this.id, input.id) &&
            Objects.equals(this.title, input.title) &&
            Objects.equals(this.subtitle, input.subtitle) &&
            Objects.equals(this.placeholderText, input.placeholderText) &&
            Objects.equals(this.isMultipleLine, input.isMultipleLine) &&
            Objects.equals(this.isRequired, input.isRequired);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, placeholderText, isMultipleLine, isRequired);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Input {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    placeholderText: ").append(toIndentedString(placeholderText)).append("\n");
    sb.append("    isMultipleLine: ").append(toIndentedString(isMultipleLine)).append("\n");
    sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
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

