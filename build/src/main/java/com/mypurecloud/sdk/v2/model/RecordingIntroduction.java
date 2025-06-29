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
 * RecordingIntroduction
 */

public class RecordingIntroduction  implements Serializable {
  
  private String title = null;
  private String subtitle = null;

  public RecordingIntroduction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Text to show in the title.
   **/
  public RecordingIntroduction title(String title) {
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
   * Text to show in the subtitle.
   **/
  public RecordingIntroduction subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the subtitle.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingIntroduction recordingIntroduction = (RecordingIntroduction) o;

    return Objects.equals(this.title, recordingIntroduction.title) &&
            Objects.equals(this.subtitle, recordingIntroduction.subtitle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingIntroduction {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
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

