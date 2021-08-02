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
import com.mypurecloud.sdk.v2.model.ContentActions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Structured template button object.
 */
@ApiModel(description = "Structured template button object.")

public class ButtonComponent  implements Serializable {
  
  private String title = null;
  private ContentActions actions = null;

  
  /**
   * Text to show inside the button.
   **/
  public ButtonComponent title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show inside the button.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  
  /**
   * The button actions.
   **/
  public ButtonComponent actions(ContentActions actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The button actions.")
  @JsonProperty("actions")
  public ContentActions getActions() {
    return actions;
  }
  public void setActions(ContentActions actions) {
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
    ButtonComponent buttonComponent = (ButtonComponent) o;
    return Objects.equals(this.title, buttonComponent.title) &&
        Objects.equals(this.actions, buttonComponent.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ButtonComponent {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

