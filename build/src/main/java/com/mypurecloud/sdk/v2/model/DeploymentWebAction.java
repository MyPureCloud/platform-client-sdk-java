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
import com.mypurecloud.sdk.v2.model.ContentOffer;
import com.mypurecloud.sdk.v2.model.OpenActionProperties;
import com.mypurecloud.sdk.v2.model.WebMessagingOfferProperties;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * DeploymentWebAction
 */

public class DeploymentWebAction  implements Serializable {
  
  private String id = null;

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
   * Action media type used to deliver the action.
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
  private String customerId = null;
  private String customerIdType = null;
  private String actionMapId = null;
  private Integer actionMapVersion = null;
  private String sessionId = null;
  private WebMessagingOfferProperties webMessagingOfferProperties = null;
  private ContentOffer contentOfferProperties = null;
  private OpenActionProperties openActionProperties = null;

  public DeploymentWebAction() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * System-generated UUID for the action.
   **/
  public DeploymentWebAction id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "System-generated UUID for the action.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Action media type used to deliver the action.
   **/
  public DeploymentWebAction mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Action media type used to deliver the action.")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   * ID string of the customer that the action was triggered for.
   **/
  public DeploymentWebAction customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID string of the customer that the action was triggered for.")
  @JsonProperty("customerId")
  public String getCustomerId() {
    return customerId;
  }
  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }


  /**
   * Type of the customer ID that the action was triggered for.
   **/
  public DeploymentWebAction customerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of the customer ID that the action was triggered for.")
  @JsonProperty("customerIdType")
  public String getCustomerIdType() {
    return customerIdType;
  }
  public void setCustomerIdType(String customerIdType) {
    this.customerIdType = customerIdType;
  }


  /**
   * ID of the action map that triggered the action.
   **/
  public DeploymentWebAction actionMapId(String actionMapId) {
    this.actionMapId = actionMapId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the action map that triggered the action.")
  @JsonProperty("actionMapId")
  public String getActionMapId() {
    return actionMapId;
  }
  public void setActionMapId(String actionMapId) {
    this.actionMapId = actionMapId;
  }


  /**
   * Version of the action map that triggered the action.
   **/
  public DeploymentWebAction actionMapVersion(Integer actionMapVersion) {
    this.actionMapVersion = actionMapVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version of the action map that triggered the action.")
  @JsonProperty("actionMapVersion")
  public Integer getActionMapVersion() {
    return actionMapVersion;
  }
  public void setActionMapVersion(Integer actionMapVersion) {
    this.actionMapVersion = actionMapVersion;
  }


  /**
   * ID of the session that the action was triggered for.
   **/
  public DeploymentWebAction sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "ID of the session that the action was triggered for.")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  /**
   * Web messaging offer specific properties.
   **/
  public DeploymentWebAction webMessagingOfferProperties(WebMessagingOfferProperties webMessagingOfferProperties) {
    this.webMessagingOfferProperties = webMessagingOfferProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Web messaging offer specific properties.")
  @JsonProperty("webMessagingOfferProperties")
  public WebMessagingOfferProperties getWebMessagingOfferProperties() {
    return webMessagingOfferProperties;
  }
  public void setWebMessagingOfferProperties(WebMessagingOfferProperties webMessagingOfferProperties) {
    this.webMessagingOfferProperties = webMessagingOfferProperties;
  }


  /**
   * Content offer specific properties.
   **/
  public DeploymentWebAction contentOfferProperties(ContentOffer contentOfferProperties) {
    this.contentOfferProperties = contentOfferProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content offer specific properties.")
  @JsonProperty("contentOfferProperties")
  public ContentOffer getContentOfferProperties() {
    return contentOfferProperties;
  }
  public void setContentOfferProperties(ContentOffer contentOfferProperties) {
    this.contentOfferProperties = contentOfferProperties;
  }


  /**
   * Open action specific properties.
   **/
  public DeploymentWebAction openActionProperties(OpenActionProperties openActionProperties) {
    this.openActionProperties = openActionProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Open action specific properties.")
  @JsonProperty("openActionProperties")
  public OpenActionProperties getOpenActionProperties() {
    return openActionProperties;
  }
  public void setOpenActionProperties(OpenActionProperties openActionProperties) {
    this.openActionProperties = openActionProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeploymentWebAction deploymentWebAction = (DeploymentWebAction) o;

    return Objects.equals(this.id, deploymentWebAction.id) &&
            Objects.equals(this.mediaType, deploymentWebAction.mediaType) &&
            Objects.equals(this.customerId, deploymentWebAction.customerId) &&
            Objects.equals(this.customerIdType, deploymentWebAction.customerIdType) &&
            Objects.equals(this.actionMapId, deploymentWebAction.actionMapId) &&
            Objects.equals(this.actionMapVersion, deploymentWebAction.actionMapVersion) &&
            Objects.equals(this.sessionId, deploymentWebAction.sessionId) &&
            Objects.equals(this.webMessagingOfferProperties, deploymentWebAction.webMessagingOfferProperties) &&
            Objects.equals(this.contentOfferProperties, deploymentWebAction.contentOfferProperties) &&
            Objects.equals(this.openActionProperties, deploymentWebAction.openActionProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaType, customerId, customerIdType, actionMapId, actionMapVersion, sessionId, webMessagingOfferProperties, contentOfferProperties, openActionProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeploymentWebAction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerIdType: ").append(toIndentedString(customerIdType)).append("\n");
    sb.append("    actionMapId: ").append(toIndentedString(actionMapId)).append("\n");
    sb.append("    actionMapVersion: ").append(toIndentedString(actionMapVersion)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    webMessagingOfferProperties: ").append(toIndentedString(webMessagingOfferProperties)).append("\n");
    sb.append("    contentOfferProperties: ").append(toIndentedString(contentOfferProperties)).append("\n");
    sb.append("    openActionProperties: ").append(toIndentedString(openActionProperties)).append("\n");
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

