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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * User actions available on the content. All actions are optional and all actions are executed simultaneously.
 */
@ApiModel(description = "User actions available on the content. All actions are optional and all actions are executed simultaneously.")

public class ContentActions  implements Serializable {
  
  private String url = null;
  private String urlTarget = null;
  private String textback = null;

  public ContentActions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A URL of a web page to direct the user to.
   **/
  public ContentActions url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A URL of a web page to direct the user to.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * The target window in which to open the URL. If empty will open a blank page or tab.
   **/
  public ContentActions urlTarget(String urlTarget) {
    this.urlTarget = urlTarget;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target window in which to open the URL. If empty will open a blank page or tab.")
  @JsonProperty("urlTarget")
  public String getUrlTarget() {
    return urlTarget;
  }
  public void setUrlTarget(String urlTarget) {
    this.urlTarget = urlTarget;
  }


  /**
   * Text to be returned as the payload from a ButtonResponse when a button is clicked. The textback and title are a combination which will have to be unique across each card and carousel in order to determine which button was clicked in that card or carousel.
   **/
  public ContentActions textback(String textback) {
    this.textback = textback;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to be returned as the payload from a ButtonResponse when a button is clicked. The textback and title are a combination which will have to be unique across each card and carousel in order to determine which button was clicked in that card or carousel.")
  @JsonProperty("textback")
  public String getTextback() {
    return textback;
  }
  public void setTextback(String textback) {
    this.textback = textback;
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
            Objects.equals(this.textback, contentActions.textback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, urlTarget, textback);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentActions {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    urlTarget: ").append(toIndentedString(urlTarget)).append("\n");
    sb.append("    textback: ").append(toIndentedString(textback)).append("\n");
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

