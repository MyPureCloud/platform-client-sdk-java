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
import com.mypurecloud.sdk.v2.model.ActionMapActionTemplate;
import com.mypurecloud.sdk.v2.model.ArchitectFlowFields;
import com.mypurecloud.sdk.v2.model.OpenActionFields;
import com.mypurecloud.sdk.v2.model.PatchActionProperties;
import com.mypurecloud.sdk.v2.model.PatchWebMessagingOfferFields;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PatchAction
 */

public class PatchAction  implements Serializable {
  

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
  private ActionMapActionTemplate actionTemplate = null;
  private String actionTargetId = null;
  private Boolean isPacingEnabled = null;
  private PatchActionProperties props = null;
  private ArchitectFlowFields architectFlowFields = null;
  private PatchWebMessagingOfferFields webMessagingOfferFields = null;
  private OpenActionFields openActionFields = null;

  public PatchAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Media type of action.
   **/
  public PatchAction mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Media type of action.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * Action template associated with the action map.
   **/
  public PatchAction actionTemplate(ActionMapActionTemplate actionTemplate) {
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
   * Action target ID.
   **/
  public PatchAction actionTargetId(String actionTargetId) {
    this.actionTargetId = actionTargetId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Action target ID.")
  @JsonProperty("actionTargetId")
  public String getActionTargetId() {
    return actionTargetId;
  }
  public void setActionTargetId(String actionTargetId) {
    this.actionTargetId = actionTargetId;
  }


  /**
   * Whether this action should be throttled.
   **/
  public PatchAction isPacingEnabled(Boolean isPacingEnabled) {
    this.isPacingEnabled = isPacingEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether this action should be throttled.")
  @JsonProperty("isPacingEnabled")
  public Boolean getIsPacingEnabled() {
    return isPacingEnabled;
  }
  public void setIsPacingEnabled(Boolean isPacingEnabled) {
    this.isPacingEnabled = isPacingEnabled;
  }


  /**
   * Additional properties.
   **/
  public PatchAction props(PatchActionProperties props) {
    this.props = props;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional properties.")
  @JsonProperty("props")
  public PatchActionProperties getProps() {
    return props;
  }
  public void setProps(PatchActionProperties props) {
    this.props = props;
  }


  /**
   * Architect Flow Id and input contract.
   **/
  public PatchAction architectFlowFields(ArchitectFlowFields architectFlowFields) {
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
  public PatchAction webMessagingOfferFields(PatchWebMessagingOfferFields webMessagingOfferFields) {
    this.webMessagingOfferFields = webMessagingOfferFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Admin-configurable fields of a web messaging offer action.")
  @JsonProperty("webMessagingOfferFields")
  public PatchWebMessagingOfferFields getWebMessagingOfferFields() {
    return webMessagingOfferFields;
  }
  public void setWebMessagingOfferFields(PatchWebMessagingOfferFields webMessagingOfferFields) {
    this.webMessagingOfferFields = webMessagingOfferFields;
  }


  /**
   * Admin-configurable fields of an open action.
   **/
  public PatchAction openActionFields(OpenActionFields openActionFields) {
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
    PatchAction patchAction = (PatchAction) o;

    return Objects.equals(this.mediaType, patchAction.mediaType) &&
            Objects.equals(this.actionTemplate, patchAction.actionTemplate) &&
            Objects.equals(this.actionTargetId, patchAction.actionTargetId) &&
            Objects.equals(this.isPacingEnabled, patchAction.isPacingEnabled) &&
            Objects.equals(this.props, patchAction.props) &&
            Objects.equals(this.architectFlowFields, patchAction.architectFlowFields) &&
            Objects.equals(this.webMessagingOfferFields, patchAction.webMessagingOfferFields) &&
            Objects.equals(this.openActionFields, patchAction.openActionFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaType, actionTemplate, actionTargetId, isPacingEnabled, props, architectFlowFields, webMessagingOfferFields, openActionFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchAction {\n");
    
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    actionTemplate: ").append(toIndentedString(actionTemplate)).append("\n");
    sb.append("    actionTargetId: ").append(toIndentedString(actionTargetId)).append("\n");
    sb.append("    isPacingEnabled: ").append(toIndentedString(isPacingEnabled)).append("\n");
    sb.append("    props: ").append(toIndentedString(props)).append("\n");
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

