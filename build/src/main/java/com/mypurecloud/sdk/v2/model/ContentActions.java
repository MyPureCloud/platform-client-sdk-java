package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * User actions available on the content. All actions are optional and all actions are executed simultaneously.
 */
@ApiModel(description = "User actions available on the content. All actions are optional and all actions are executed simultaneously.")

public class ContentActions  implements Serializable {
  
  private String url = null;
  private String urlTarget = null;
  private String textback = null;
  private String commandName = null;
  private Map<String, Object> context = null;

  
  /**
   * A URL for a web page to redirect the user to
   **/
  public ContentActions url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URL for a web page to redirect the user to")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  
  /**
   * The target window or tab within the URL's web page. If empty will open a blank page or tab.
   **/
  public ContentActions urlTarget(String urlTarget) {
    this.urlTarget = urlTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target window or tab within the URL's web page. If empty will open a blank page or tab.")
  @JsonProperty("urlTarget")
  public String getUrlTarget() {
    return urlTarget;
  }
  public void setUrlTarget(String urlTarget) {
    this.urlTarget = urlTarget;
  }

  
  /**
   * Text to be sent back in reply when a list item is selected
   **/
  public ContentActions textback(String textback) {
    this.textback = textback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to be sent back in reply when a list item is selected")
  @JsonProperty("textback")
  public String getTextback() {
    return textback;
  }
  public void setTextback(String textback) {
    this.textback = textback;
  }

  
  /**
   * Execute an organization's specific command
   **/
  public ContentActions commandName(String commandName) {
    this.commandName = commandName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Execute an organization's specific command")
  @JsonProperty("commandName")
  public String getCommandName() {
    return commandName;
  }
  public void setCommandName(String commandName) {
    this.commandName = commandName;
  }

  
  /**
   * Additional context for the command
   **/
  public ContentActions context(Map<String, Object> context) {
    this.context = context;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional context for the command")
  @JsonProperty("context")
  public Map<String, Object> getContext() {
    return context;
  }
  public void setContext(Map<String, Object> context) {
    this.context = context;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentActions contentActions = (ContentActions) o;
    return Objects.equals(this.url, contentActions.url) &&
        Objects.equals(this.urlTarget, contentActions.urlTarget) &&
        Objects.equals(this.textback, contentActions.textback) &&
        Objects.equals(this.commandName, contentActions.commandName) &&
        Objects.equals(this.context, contentActions.context);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlTarget, textback, commandName, context);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentActions {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlTarget: ").append(toIndentedString(urlTarget)).append("\n");
    sb.append("    textback: ").append(toIndentedString(textback)).append("\n");
    sb.append("    commandName: ").append(toIndentedString(commandName)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
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

