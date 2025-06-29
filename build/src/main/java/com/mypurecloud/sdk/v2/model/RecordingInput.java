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
 * RecordingInput
 */

public class RecordingInput  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private String responseText = null;

  public RecordingInput() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Unique identifier for the input.
   **/
  public RecordingInput id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique identifier for the input.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The main text displayed for the input field(s).
   **/
  public RecordingInput title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The main text displayed for the input field(s).")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Additional text providing more details about the input field(s).
   **/
  public RecordingInput subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional text providing more details about the input field(s).")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * Text response from end customer.
   **/
  public RecordingInput responseText(String responseText) {
    this.responseText = responseText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text response from end customer.")
  @JsonProperty("responseText")
  public String getResponseText() {
    return responseText;
  }
  public void setResponseText(String responseText) {
    this.responseText = responseText;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingInput recordingInput = (RecordingInput) o;

    return Objects.equals(this.id, recordingInput.id) &&
            Objects.equals(this.title, recordingInput.title) &&
            Objects.equals(this.subtitle, recordingInput.subtitle) &&
            Objects.equals(this.responseText, recordingInput.responseText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, responseText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingInput {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    responseText: ").append(toIndentedString(responseText)).append("\n");
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

