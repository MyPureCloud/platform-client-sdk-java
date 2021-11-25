package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.RecordingButtonComponent;
import com.mypurecloud.sdk.v2.model.RecordingContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GenericTemplate
 */

public class GenericTemplate  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String url = null;
  private List<RecordingButtonComponent> components = new ArrayList<RecordingButtonComponent>();
  private RecordingContentActions actions = null;

  
  /**
   * Text to show in the title.
   **/
  public GenericTemplate title(String title) {
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
  public GenericTemplate description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * URL of an image.
   **/
  public GenericTemplate url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * List of button components offered with this message content.
   **/
  public GenericTemplate components(List<RecordingButtonComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of button components offered with this message content.")
  @JsonProperty("components")
  public List<RecordingButtonComponent> getComponents() {
    return components;
  }
  public void setComponents(List<RecordingButtonComponent> components) {
    this.components = components;
  }

  
  /**
   * Actions to be taken.
   **/
  public GenericTemplate actions(RecordingContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actions to be taken.")
  @JsonProperty("actions")
  public RecordingContentActions getActions() {
    return actions;
  }
  public void setActions(RecordingContentActions actions) {
    this.actions = actions;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenericTemplate genericTemplate = (GenericTemplate) o;
    return Objects.equals(this.title, genericTemplate.title) &&
        Objects.equals(this.description, genericTemplate.description) &&
        Objects.equals(this.url, genericTemplate.url) &&
        Objects.equals(this.components, genericTemplate.components) &&
        Objects.equals(this.actions, genericTemplate.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, url, components, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenericTemplate {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

