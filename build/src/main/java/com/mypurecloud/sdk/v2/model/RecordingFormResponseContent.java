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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ButtonResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordingFormResponseContent
 */

public class RecordingFormResponseContent  implements Serializable {
  

  private static class ContentTypeEnumDeserializer extends StdDeserializer<ContentTypeEnum> {
    public ContentTypeEnumDeserializer() {
      super(ContentTypeEnumDeserializer.class);
    }

    @Override
    public ContentTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ContentTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of this content element.
   */
 @JsonDeserialize(using = ContentTypeEnumDeserializer.class)
  public enum ContentTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BUTTONRESPONSE("ButtonResponse");

    private String value;

    ContentTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ContentTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ContentTypeEnum value : ContentTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ContentTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ContentTypeEnum contentType = null;
  private ButtonResponse buttonResponse = null;

  public RecordingFormResponseContent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Type of this content element.
   **/
  public RecordingFormResponseContent contentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of this content element.")
  @JsonProperty("contentType")
  public ContentTypeEnum getContentType() {
    return contentType;
  }
  public void setContentType(ContentTypeEnum contentType) {
    this.contentType = contentType;
  }


  /**
   * Button response content.
   **/
  public RecordingFormResponseContent buttonResponse(ButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Button response content.")
  @JsonProperty("buttonResponse")
  public ButtonResponse getButtonResponse() {
    return buttonResponse;
  }
  public void setButtonResponse(ButtonResponse buttonResponse) {
    this.buttonResponse = buttonResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordingFormResponseContent recordingFormResponseContent = (RecordingFormResponseContent) o;

    return Objects.equals(this.contentType, recordingFormResponseContent.contentType) &&
            Objects.equals(this.buttonResponse, recordingFormResponseContent.buttonResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentType, buttonResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingFormResponseContent {\n");
    
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    buttonResponse: ").append(toIndentedString(buttonResponse)).append("\n");
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

