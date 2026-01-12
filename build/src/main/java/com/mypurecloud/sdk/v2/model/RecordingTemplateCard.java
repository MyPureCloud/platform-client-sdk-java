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
import com.mypurecloud.sdk.v2.model.RecordingTemplateHeader;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RecordingTemplateCard
 */

public class RecordingTemplateCard  implements Serializable {
  
  private RecordingTemplateHeader header = null;
  private RecordingTemplateBody body = null;
  private List<RecordingTemplateButton> buttons = null;

  public RecordingTemplateCard() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      buttons = new ArrayList<RecordingTemplateButton>();
    }
  }

  
  /**
   * The template header.
   **/
  public RecordingTemplateCard header(RecordingTemplateHeader header) {
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
  public RecordingTemplateCard body(RecordingTemplateBody body) {
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
   * Template buttons.
   **/
  public RecordingTemplateCard buttons(List<RecordingTemplateButton> buttons) {
    this.buttons = buttons;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template buttons.")
  @JsonProperty("buttons")
  public List<RecordingTemplateButton> getButtons() {
    return buttons;
  }
  public void setButtons(List<RecordingTemplateButton> buttons) {
    this.buttons = buttons;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingTemplateCard recordingTemplateCard = (RecordingTemplateCard) o;

    return Objects.equals(this.header, recordingTemplateCard.header) &&
            Objects.equals(this.body, recordingTemplateCard.body) &&
            Objects.equals(this.buttons, recordingTemplateCard.buttons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, body, buttons);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingTemplateCard {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
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

