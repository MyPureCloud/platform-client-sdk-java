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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationButtonComponent;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForUserTopicConversationContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForUserTopicConversationContentGeneric
 */

public class V2ConversationMessageTypingEventForUserTopicConversationContentGeneric  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String image = null;
  private String video = null;
  private V2ConversationMessageTypingEventForUserTopicConversationContentActions actions = null;
  private List<V2ConversationMessageTypingEventForUserTopicConversationButtonComponent> components = new ArrayList<V2ConversationMessageTypingEventForUserTopicConversationButtonComponent>();

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric image(String image) {
    this.image = image;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("image")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric video(String video) {
    this.video = video;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("video")
  public String getVideo() {
    return video;
  }
  public void setVideo(String video) {
    this.video = video;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric actions(V2ConversationMessageTypingEventForUserTopicConversationContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public V2ConversationMessageTypingEventForUserTopicConversationContentActions getActions() {
    return actions;
  }
  public void setActions(V2ConversationMessageTypingEventForUserTopicConversationContentActions actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForUserTopicConversationContentGeneric components(List<V2ConversationMessageTypingEventForUserTopicConversationButtonComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("components")
  public List<V2ConversationMessageTypingEventForUserTopicConversationButtonComponent> getComponents() {
    return components;
  }
  public void setComponents(List<V2ConversationMessageTypingEventForUserTopicConversationButtonComponent> components) {
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
    V2ConversationMessageTypingEventForUserTopicConversationContentGeneric v2ConversationMessageTypingEventForUserTopicConversationContentGeneric = (V2ConversationMessageTypingEventForUserTopicConversationContentGeneric) o;
    return Objects.equals(this.title, v2ConversationMessageTypingEventForUserTopicConversationContentGeneric.title) &&
        Objects.equals(this.description, v2ConversationMessageTypingEventForUserTopicConversationContentGeneric.description) &&
        Objects.equals(this.image, v2ConversationMessageTypingEventForUserTopicConversationContentGeneric.image) &&
        Objects.equals(this.video, v2ConversationMessageTypingEventForUserTopicConversationContentGeneric.video) &&
        Objects.equals(this.actions, v2ConversationMessageTypingEventForUserTopicConversationContentGeneric.actions) &&
        Objects.equals(this.components, v2ConversationMessageTypingEventForUserTopicConversationContentGeneric.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, image, video, actions, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForUserTopicConversationContentGeneric {\n");
    
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

