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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.ConversationContentCardAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ConversationContentCard
 */

public class ConversationContentCard  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String image = null;
  private String video = null;
  private ConversationContentCardAction defaultAction = null;
  private List<ConversationContentCardAction> actions = new ArrayList<ConversationContentCardAction>();

  
  /**
   * Text to show in the title.
   **/
  public ConversationContentCard title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Text to show in the title.")
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
  public ConversationContentCard description(String description) {
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
  public ConversationContentCard image(String image) {
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
  public ConversationContentCard video(String video) {
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
   * The default button action.
   **/
  public ConversationContentCard defaultAction(ConversationContentCardAction defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default button action.")
  @JsonProperty("defaultAction")
  public ConversationContentCardAction getDefaultAction() {
    return defaultAction;
  }
  public void setDefaultAction(ConversationContentCardAction defaultAction) {
    this.defaultAction = defaultAction;
  }


  /**
   * An array of action objects.
   **/
  public ConversationContentCard actions(List<ConversationContentCardAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of action objects.")
  @JsonProperty("actions")
  public List<ConversationContentCardAction> getActions() {
    return actions;
  }
  public void setActions(List<ConversationContentCardAction> actions) {
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
    ConversationContentCard conversationContentCard = (ConversationContentCard) o;

    return Objects.equals(this.title, conversationContentCard.title) &&
            Objects.equals(this.description, conversationContentCard.description) &&
            Objects.equals(this.image, conversationContentCard.image) &&
            Objects.equals(this.video, conversationContentCard.video) &&
            Objects.equals(this.defaultAction, conversationContentCard.defaultAction) &&
            Objects.equals(this.actions, conversationContentCard.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, image, video, defaultAction, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentCard {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
    sb.append("    defaultAction: ").append(toIndentedString(defaultAction)).append("\n");
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

