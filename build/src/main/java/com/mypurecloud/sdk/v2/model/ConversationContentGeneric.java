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
import com.mypurecloud.sdk.v2.model.ConversationButtonComponent;
import com.mypurecloud.sdk.v2.model.ConversationContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Generic content object.
 */
@ApiModel(description = "Generic content object.")

public class ConversationContentGeneric  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String image = null;
  private String video = null;
  private ConversationContentActions actions = null;
  private List<ConversationButtonComponent> components = new ArrayList<ConversationButtonComponent>();

  
  /**
   * Text to show in the title.
   **/
  public ConversationContentGeneric title(String title) {
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
  public ConversationContentGeneric description(String description) {
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
  public ConversationContentGeneric image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image.")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   * URL of a video.
   **/
  public ConversationContentGeneric video(String video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of a video.")
  @JsonProperty("video")
  public String getVideo() {
    return video;
  }
  public void setVideo(String video) {
    this.video = video;
  }

  
  /**
   * Actions to be taken.
   **/
  public ConversationContentGeneric actions(ConversationContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Actions to be taken.")
  @JsonProperty("actions")
  public ConversationContentActions getActions() {
    return actions;
  }
  public void setActions(ConversationContentActions actions) {
    this.actions = actions;
  }

  
  /**
   * An array of component objects.
   **/
  public ConversationContentGeneric components(List<ConversationButtonComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of component objects.")
  @JsonProperty("components")
  public List<ConversationButtonComponent> getComponents() {
    return components;
  }
  public void setComponents(List<ConversationButtonComponent> components) {
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
    ConversationContentGeneric conversationContentGeneric = (ConversationContentGeneric) o;
    return Objects.equals(this.title, conversationContentGeneric.title) &&
        Objects.equals(this.description, conversationContentGeneric.description) &&
        Objects.equals(this.image, conversationContentGeneric.image) &&
        Objects.equals(this.video, conversationContentGeneric.video) &&
        Objects.equals(this.actions, conversationContentGeneric.actions) &&
        Objects.equals(this.components, conversationContentGeneric.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, image, video, actions, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentGeneric {\n");
    
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

