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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserDevice
 */

public class UserDevice  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String deviceToken = null;
  private String notificationId = null;
  private String make = null;
  private String model = null;
  private Boolean acceptNotifications = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * type of the device; ios or android
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ANDROID("android"),
    IOS("ios");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String sessionHash = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public UserDevice name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * device token sent by mobile clients.
   **/
  public UserDevice deviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "device token sent by mobile clients.")
  @JsonProperty("deviceToken")
  public String getDeviceToken() {
    return deviceToken;
  }
  public void setDeviceToken(String deviceToken) {
    this.deviceToken = deviceToken;
  }

  
  /**
   * notification id of the device.
   **/
  public UserDevice notificationId(String notificationId) {
    this.notificationId = notificationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "notification id of the device.")
  @JsonProperty("notificationId")
  public String getNotificationId() {
    return notificationId;
  }
  public void setNotificationId(String notificationId) {
    this.notificationId = notificationId;
  }

  
  /**
   * make of the device.
   **/
  public UserDevice make(String make) {
    this.make = make;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "make of the device.")
  @JsonProperty("make")
  public String getMake() {
    return make;
  }
  public void setMake(String make) {
    this.make = make;
  }

  
  /**
   * Device model
   **/
  public UserDevice model(String model) {
    this.model = model;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device model")
  @JsonProperty("model")
  public String getModel() {
    return model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  
  /**
   * if the device accepts notifications
   **/
  public UserDevice acceptNotifications(Boolean acceptNotifications) {
    this.acceptNotifications = acceptNotifications;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "if the device accepts notifications")
  @JsonProperty("acceptNotifications")
  public Boolean getAcceptNotifications() {
    return acceptNotifications;
  }
  public void setAcceptNotifications(Boolean acceptNotifications) {
    this.acceptNotifications = acceptNotifications;
  }

  
  /**
   * type of the device; ios or android
   **/
  public UserDevice type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "type of the device; ios or android")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public UserDevice sessionHash(String sessionHash) {
    this.sessionHash = sessionHash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessionHash")
  public String getSessionHash() {
    return sessionHash;
  }
  public void setSessionHash(String sessionHash) {
    this.sessionHash = sessionHash;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDevice userDevice = (UserDevice) o;
    return Objects.equals(this.id, userDevice.id) &&
        Objects.equals(this.name, userDevice.name) &&
        Objects.equals(this.deviceToken, userDevice.deviceToken) &&
        Objects.equals(this.notificationId, userDevice.notificationId) &&
        Objects.equals(this.make, userDevice.make) &&
        Objects.equals(this.model, userDevice.model) &&
        Objects.equals(this.acceptNotifications, userDevice.acceptNotifications) &&
        Objects.equals(this.type, userDevice.type) &&
        Objects.equals(this.sessionHash, userDevice.sessionHash) &&
        Objects.equals(this.selfUri, userDevice.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, deviceToken, notificationId, make, model, acceptNotifications, type, sessionHash, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDevice {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    deviceToken: ").append(toIndentedString(deviceToken)).append("\n");
    sb.append("    notificationId: ").append(toIndentedString(notificationId)).append("\n");
    sb.append("    make: ").append(toIndentedString(make)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    acceptNotifications: ").append(toIndentedString(acceptNotifications)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sessionHash: ").append(toIndentedString(sessionHash)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

