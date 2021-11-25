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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ActionMapActionTemplate;
import com.mypurecloud.sdk.v2.model.ArchitectFlowFields;
import com.mypurecloud.sdk.v2.model.OpenActionFields;
import com.mypurecloud.sdk.v2.model.WebMessagingOfferFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ActionMapAction
 */

public class ActionMapAction  implements Serializable {
  
  private ActionMapActionTemplate actionTemplate = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Media type of action.
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WEBCHAT("webchat"),
    WEBMESSAGINGOFFER("webMessagingOffer"),
    CONTENTOFFER("contentOffer"),
    INTEGRATIONACTION("integrationAction"),
    ARCHITECTFLOW("architectFlow"),
    OPENACTION("openAction");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private ArchitectFlowFields architectFlowFields = null;
  private WebMessagingOfferFields webMessagingOfferFields = null;
  private OpenActionFields openActionFields = null;

  
  /**
   * Action template associated with the action map.
   **/
  public ActionMapAction actionTemplate(ActionMapActionTemplate actionTemplate) {
    this.actionTemplate = actionTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action template associated with the action map.")
  @JsonProperty("actionTemplate")
  public ActionMapActionTemplate getActionTemplate() {
    return actionTemplate;
  }
  public void setActionTemplate(ActionMapActionTemplate actionTemplate) {
    this.actionTemplate = actionTemplate;
  }

  
  /**
   * Media type of action.
   **/
  public ActionMapAction mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Media type of action.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   * Architect Flow Id and input contract.
   **/
  public ActionMapAction architectFlowFields(ArchitectFlowFields architectFlowFields) {
    this.architectFlowFields = architectFlowFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Architect Flow Id and input contract.")
  @JsonProperty("architectFlowFields")
  public ArchitectFlowFields getArchitectFlowFields() {
    return architectFlowFields;
  }
  public void setArchitectFlowFields(ArchitectFlowFields architectFlowFields) {
    this.architectFlowFields = architectFlowFields;
  }

  
  /**
   * Admin-configurable fields of a web messaging offer action.
   **/
  public ActionMapAction webMessagingOfferFields(WebMessagingOfferFields webMessagingOfferFields) {
    this.webMessagingOfferFields = webMessagingOfferFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Admin-configurable fields of a web messaging offer action.")
  @JsonProperty("webMessagingOfferFields")
  public WebMessagingOfferFields getWebMessagingOfferFields() {
    return webMessagingOfferFields;
  }
  public void setWebMessagingOfferFields(WebMessagingOfferFields webMessagingOfferFields) {
    this.webMessagingOfferFields = webMessagingOfferFields;
  }

  
  /**
   * Admin-configurable fields of an open action.
   **/
  public ActionMapAction openActionFields(OpenActionFields openActionFields) {
    this.openActionFields = openActionFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Admin-configurable fields of an open action.")
  @JsonProperty("openActionFields")
  public OpenActionFields getOpenActionFields() {
    return openActionFields;
  }
  public void setOpenActionFields(OpenActionFields openActionFields) {
    this.openActionFields = openActionFields;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionMapAction actionMapAction = (ActionMapAction) o;
    return Objects.equals(this.actionTemplate, actionMapAction.actionTemplate) &&
        Objects.equals(this.mediaType, actionMapAction.mediaType) &&
        Objects.equals(this.architectFlowFields, actionMapAction.architectFlowFields) &&
        Objects.equals(this.webMessagingOfferFields, actionMapAction.webMessagingOfferFields) &&
        Objects.equals(this.openActionFields, actionMapAction.openActionFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionTemplate, mediaType, architectFlowFields, webMessagingOfferFields, openActionFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionMapAction {\n");
    
    sb.append("    actionTemplate: ").append(toIndentedString(actionTemplate)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    architectFlowFields: ").append(toIndentedString(architectFlowFields)).append("\n");
    sb.append("    webMessagingOfferFields: ").append(toIndentedString(webMessagingOfferFields)).append("\n");
    sb.append("    openActionFields: ").append(toIndentedString(openActionFields)).append("\n");
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

