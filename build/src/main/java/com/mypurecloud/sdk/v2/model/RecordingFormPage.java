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
import com.mypurecloud.sdk.v2.model.RecordingFormPageComponent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingFormPage
 */

public class RecordingFormPage  implements Serializable {
  
  private String title = null;
  private String subtitle = null;
  private List<RecordingFormPageComponent> pageComponents = null;

  public RecordingFormPage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      pageComponents = new ArrayList<RecordingFormPageComponent>();
    }
  }

  
  /**
   * Text to show in the title.
   **/
  public RecordingFormPage title(String title) {
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
  public RecordingFormPage subtitle(String subtitle) {
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


  /**
   * Page components in this form page.
   **/
  public RecordingFormPage pageComponents(List<RecordingFormPageComponent> pageComponents) {
    this.pageComponents = pageComponents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page components in this form page.")
  @JsonProperty("pageComponents")
  public List<RecordingFormPageComponent> getPageComponents() {
    return pageComponents;
  }
  public void setPageComponents(List<RecordingFormPageComponent> pageComponents) {
    this.pageComponents = pageComponents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingFormPage recordingFormPage = (RecordingFormPage) o;

    return Objects.equals(this.title, recordingFormPage.title) &&
            Objects.equals(this.subtitle, recordingFormPage.subtitle) &&
            Objects.equals(this.pageComponents, recordingFormPage.pageComponents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, pageComponents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingFormPage {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    pageComponents: ").append(toIndentedString(pageComponents)).append("\n");
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

