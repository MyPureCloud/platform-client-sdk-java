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
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent;
import com.mypurecloud.sdk.v2.model.V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric
 */

public class V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String image = null;
  private String video = null;
  private V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions actions = null;
  private List<V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent> components = new ArrayList<V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent>();

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric title(String title) {
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
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric description(String description) {
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
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric image(String image) {
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
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric video(String video) {
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
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric actions(V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions getActions() {
    return actions;
  }
  public void setActions(V2ConversationMessageTypingEventForWorkflowTopicConversationContentActions actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric components(List<V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent> components) {
    this.components = components;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("components")
  public List<V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent> getComponents() {
    return components;
  }
  public void setComponents(List<V2ConversationMessageTypingEventForWorkflowTopicConversationButtonComponent> components) {
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
    V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric = (V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric) o;
    return Objects.equals(this.title, v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.title) &&
        Objects.equals(this.description, v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.description) &&
        Objects.equals(this.image, v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.image) &&
        Objects.equals(this.video, v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.video) &&
        Objects.equals(this.actions, v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.actions) &&
        Objects.equals(this.components, v2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric.components);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, image, video, actions, components);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConversationMessageTypingEventForWorkflowTopicConversationContentGeneric {\n");
    
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

