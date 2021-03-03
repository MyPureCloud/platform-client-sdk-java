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
import com.mypurecloud.sdk.v2.model.ButtonComponent;
import com.mypurecloud.sdk.v2.model.ContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Generic content object
 */
@ApiModel(description = "Generic content object")

public class ContentGeneric  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String description = null;
  private String image = null;
  private String video = null;
  private ContentActions actions = null;
  private List<ButtonComponent> components = new ArrayList<ButtonComponent>();

  
  /**
   * An ID assigned to this rich message content. Each instance inside the content array has a unique ID.
   **/
  public ContentGeneric id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ID assigned to this rich message content. Each instance inside the content array has a unique ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   * Text to show in the title row
   **/
  public ContentGeneric title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title row")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * Text to show in the description row. This is immediately below the title
   **/
  public ContentGeneric description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description row. This is immediately below the title")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * Path or URI to an image file
   **/
  public ContentGeneric image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Path or URI to an image file")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * Path or URI to a video file
   **/
  public ContentGeneric video(String video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Path or URI to a video file")
  @JsonProperty("video")
  public String getVideo() {
    return video;
  }
  public void setVideo(String video) {
    this.video = video;
  }

  
  /**
   * User actions available on the content. All actions are optional and all actions are executed simultaneously.
   **/
  public ContentGeneric actions(ContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User actions available on the content. All actions are optional and all actions are executed simultaneously.")
  @JsonProperty("actions")
  public ContentActions getActions() {
    return actions;
  }
  public void setActions(ContentActions actions) {
    this.actions = actions;
  }

  
  /**
   * An array of component objects
   **/
  public ContentGeneric components(List<ButtonComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of component objects")
  @JsonProperty("components")
  public List<ButtonComponent> getComponents() {
    return components;
  }
  public void setComponents(List<ButtonComponent> components) {
    this.components = components;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentGeneric contentGeneric = (ContentGeneric) o;
    return Objects.equals(this.id, contentGeneric.id) &&
        Objects.equals(this.title, contentGeneric.title) &&
        Objects.equals(this.description, contentGeneric.description) &&
        Objects.equals(this.image, contentGeneric.image) &&
        Objects.equals(this.video, contentGeneric.video) &&
        Objects.equals(this.actions, contentGeneric.actions) &&
        Objects.equals(this.components, contentGeneric.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, description, image, video, actions, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentGeneric {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    components: ").append(toIndentedString(components)).append("\n");
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

