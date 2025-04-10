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
import com.mypurecloud.sdk.v2.model.RecordingTemplateBody;
import com.mypurecloud.sdk.v2.model.RecordingTemplateButton;
import com.mypurecloud.sdk.v2.model.RecordingTemplateFooter;
import com.mypurecloud.sdk.v2.model.RecordingTemplateHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingNotificationTemplate
 */

public class RecordingNotificationTemplate  implements Serializable {
  
  private String id = null;
  private String language = null;
  private RecordingTemplateHeader header = null;
  private RecordingTemplateBody body = null;
  private List<RecordingTemplateButton> buttons = null;
  private RecordingTemplateFooter footer = null;

  public RecordingNotificationTemplate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      buttons = new ArrayList<RecordingTemplateButton>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Template language.
   **/
  public RecordingNotificationTemplate language(String language) {
    this.language = language;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template language.")
  @JsonProperty("language")
  public String getLanguage() {
    return language;
  }
  public void setLanguage(String language) {
    this.language = language;
  }


  /**
   * The template header.
   **/
  public RecordingNotificationTemplate header(RecordingTemplateHeader header) {
    this.header = header;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template header.")
  @JsonProperty("header")
  public RecordingTemplateHeader getHeader() {
    return header;
  }
  public void setHeader(RecordingTemplateHeader header) {
    this.header = header;
  }


  /**
   * The template body.
   **/
  public RecordingNotificationTemplate body(RecordingTemplateBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template body.")
  @JsonProperty("body")
  public RecordingTemplateBody getBody() {
    return body;
  }
  public void setBody(RecordingTemplateBody body) {
    this.body = body;
  }


  /**
   * Template buttons
   **/
  public RecordingNotificationTemplate buttons(List<RecordingTemplateButton> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template buttons")
  @JsonProperty("buttons")
  public List<RecordingTemplateButton> getButtons() {
    return buttons;
  }
  public void setButtons(List<RecordingTemplateButton> buttons) {
    this.buttons = buttons;
  }


  /**
   * The template footer.
   **/
  public RecordingNotificationTemplate footer(RecordingTemplateFooter footer) {
    this.footer = footer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The template footer.")
  @JsonProperty("footer")
  public RecordingTemplateFooter getFooter() {
    return footer;
  }
  public void setFooter(RecordingTemplateFooter footer) {
    this.footer = footer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingNotificationTemplate recordingNotificationTemplate = (RecordingNotificationTemplate) o;

    return Objects.equals(this.id, recordingNotificationTemplate.id) &&
            Objects.equals(this.language, recordingNotificationTemplate.language) &&
            Objects.equals(this.header, recordingNotificationTemplate.header) &&
            Objects.equals(this.body, recordingNotificationTemplate.body) &&
            Objects.equals(this.buttons, recordingNotificationTemplate.buttons) &&
            Objects.equals(this.footer, recordingNotificationTemplate.footer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, language, header, body, buttons, footer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingNotificationTemplate {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
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

