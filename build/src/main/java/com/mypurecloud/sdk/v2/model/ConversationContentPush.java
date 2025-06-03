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
import com.mypurecloud.sdk.v2.model.ConversationPushFailedMessageReferences;
import com.mypurecloud.sdk.v2.model.ConversationPushNotificationMessageLabel;
import com.mypurecloud.sdk.v2.model.ConversationPushProviderIntegration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A Push object
 */
@ApiModel(description = "A Push object")

public class ConversationContentPush  implements Serializable {
  

  private static class DeviceTypeEnumDeserializer extends StdDeserializer<DeviceTypeEnum> {
    public DeviceTypeEnumDeserializer() {
      super(DeviceTypeEnumDeserializer.class);
    }

    @Override
    public DeviceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DeviceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The device type used to send the push notification
   */
 @JsonDeserialize(using = DeviceTypeEnumDeserializer.class)
  public enum DeviceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ANDROID("Android"),
    IOS("IOS");

    private String value;

    DeviceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DeviceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (DeviceTypeEnum value : DeviceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DeviceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DeviceTypeEnum deviceType = null;
  private String deviceTokenId = null;
  private String deviceToken = null;
  private List<ConversationPushFailedMessageReferences> failedMessages = null;
  private ConversationPushNotificationMessageLabel notificationMessage = null;
  private ConversationPushProviderIntegration pushProviderIntegration = null;
  private Long expiration = null;

  public ConversationContentPush() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      failedMessages = new ArrayList<ConversationPushFailedMessageReferences>();
    }
  }

  
  /**
   * The device type used to send the push notification
   **/
  public ConversationContentPush deviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The device type used to send the push notification")
  @JsonProperty("deviceType")
  public DeviceTypeEnum getDeviceType() {
    return deviceType;
  }
  public void setDeviceType(DeviceTypeEnum deviceType) {
    this.deviceType = deviceType;
  }


  /**
   * Unique Id of the device token
   **/
  public ConversationContentPush deviceTokenId(String deviceTokenId) {
    this.deviceTokenId = deviceTokenId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Unique Id of the device token")
  @JsonProperty("deviceTokenId")
  public String getDeviceTokenId() {
    return deviceTokenId;
  }
  public void setDeviceTokenId(String deviceTokenId) {
    this.deviceTokenId = deviceTokenId;
  }


  /**
   * device token from the notification provider
   **/
  public ConversationContentPush deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "device token from the notification provider")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }


  /**
   * MessageIds failed to be sent which trigger the push event
   **/
  public ConversationContentPush failedMessages(List<ConversationPushFailedMessageReferences> failedMessages) {
    this.failedMessages = failedMessages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "MessageIds failed to be sent which trigger the push event")
  @JsonProperty("failedMessages")
  public List<ConversationPushFailedMessageReferences> getFailedMessages() {
    return failedMessages;
  }
  public void setFailedMessages(List<ConversationPushFailedMessageReferences> failedMessages) {
    this.failedMessages = failedMessages;
  }


  /**
   * Title and body localized according to deployment
   **/
  public ConversationContentPush notificationMessage(ConversationPushNotificationMessageLabel notificationMessage) {
    this.notificationMessage = notificationMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title and body localized according to deployment")
  @JsonProperty("notificationMessage")
  public ConversationPushNotificationMessageLabel getNotificationMessage() {
    return notificationMessage;
  }
  public void setNotificationMessage(ConversationPushNotificationMessageLabel notificationMessage) {
    this.notificationMessage = notificationMessage;
  }


  /**
   * Push provider integrations details configured on the deployment
   **/
  public ConversationContentPush pushProviderIntegration(ConversationPushProviderIntegration pushProviderIntegration) {
    this.pushProviderIntegration = pushProviderIntegration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Push provider integrations details configured on the deployment")
  @JsonProperty("pushProviderIntegration")
  public ConversationPushProviderIntegration getPushProviderIntegration() {
    return pushProviderIntegration;
  }
  public void setPushProviderIntegration(ConversationPushProviderIntegration pushProviderIntegration) {
    this.pushProviderIntegration = pushProviderIntegration;
  }


  /**
   * The time to live of the pushed message
   **/
  public ConversationContentPush expiration(Long expiration) {
    this.expiration = expiration;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time to live of the pushed message")
  @JsonProperty("expiration")
  public Long getExpiration() {
    return expiration;
  }
  public void setExpiration(Long expiration) {
    this.expiration = expiration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentPush conversationContentPush = (ConversationContentPush) o;

    return Objects.equals(this.deviceType, conversationContentPush.deviceType) &&
            Objects.equals(this.deviceTokenId, conversationContentPush.deviceTokenId) &&
            Objects.equals(this.deviceToken, conversationContentPush.deviceToken) &&
            Objects.equals(this.failedMessages, conversationContentPush.failedMessages) &&
            Objects.equals(this.notificationMessage, conversationContentPush.notificationMessage) &&
            Objects.equals(this.pushProviderIntegration, conversationContentPush.pushProviderIntegration) &&
            Objects.equals(this.expiration, conversationContentPush.expiration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deviceType, deviceTokenId, deviceToken, failedMessages, notificationMessage, pushProviderIntegration, expiration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentPush {\n");
    
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    deviceTokenId: ").append(toIndentedString(deviceTokenId)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    failedMessages: ").append(toIndentedString(failedMessages)).append("\n");
    sb.append("    notificationMessage: ").append(toIndentedString(notificationMessage)).append("\n");
    sb.append("    pushProviderIntegration: ").append(toIndentedString(pushProviderIntegration)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
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

