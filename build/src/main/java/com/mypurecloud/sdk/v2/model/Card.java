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
import com.mypurecloud.sdk.v2.model.CardAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Card
 */

public class Card  implements Serializable {
  
  private String title = null;
  private String description = null;
  private String url = null;
  private CardAction defaultAction = null;
  private List<CardAction> actions = new ArrayList<CardAction>();

  
  /**
   * Text to show in the title.
   **/
  public Card title(String title) {
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
  public Card description(String description) {
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
  public Card url(String url) {
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
   * The default action to be taken.
   **/
  public Card defaultAction(CardAction defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default action to be taken.")
  @JsonProperty("defaultAction")
  public CardAction getDefaultAction() {
    return defaultAction;
  }
  public void setDefaultAction(CardAction defaultAction) {
    this.defaultAction = defaultAction;
  }


  /**
   * List of possible action objects.
   **/
  public Card actions(List<CardAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of possible action objects.")
  @JsonProperty("actions")
  public List<CardAction> getActions() {
    return actions;
  }
  public void setActions(List<CardAction> actions) {
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
    Card card = (Card) o;

    return Objects.equals(this.title, card.title) &&
            Objects.equals(this.description, card.description) &&
            Objects.equals(this.url, card.url) &&
            Objects.equals(this.defaultAction, card.defaultAction) &&
            Objects.equals(this.actions, card.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, url, defaultAction, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

