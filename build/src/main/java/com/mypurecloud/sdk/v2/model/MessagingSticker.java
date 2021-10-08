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
 * MessagingSticker
 */

public class MessagingSticker  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer providerStickerId = null;
  private Integer providerPackageId = null;
  private String packageName = null;

  private static class MessengerTypeEnumDeserializer extends StdDeserializer<MessengerTypeEnum> {
    public MessengerTypeEnumDeserializer() {
      super(MessengerTypeEnumDeserializer.class);
    }

    @Override
    public MessengerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MessengerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the messenger provider.
   */
 @JsonDeserialize(using = MessengerTypeEnumDeserializer.class)
  public enum MessengerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SMS("sms"),
    FACEBOOK("facebook"),
    TWITTER("twitter"),
    LINE("line"),
    WHATSAPP("whatsapp"),
    WEBMESSAGING("webmessaging"),
    INSTAGRAM("instagram"),
    OPEN("open");

    private String value;

    MessengerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MessengerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MessengerTypeEnum value : MessengerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MessengerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MessengerTypeEnum messengerType = null;

  private static class StickerTypeEnumDeserializer extends StdDeserializer<StickerTypeEnum> {
    public StickerTypeEnumDeserializer() {
      super(StickerTypeEnumDeserializer.class);
    }

    @Override
    public StickerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StickerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the sticker.
   */
 @JsonDeserialize(using = StickerTypeEnumDeserializer.class)
  public enum StickerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STANDARD("standard"),
    FREE("free"),
    PAID("paid");

    private String value;

    StickerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StickerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (StickerTypeEnum value : StickerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StickerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StickerTypeEnum stickerType = null;
  private Long providerVersion = null;
  private String uriLocation = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public MessagingSticker name(String name) {
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
   * The sticker Id of the sticker, assigned by the sticker provider.
   **/
  public MessagingSticker providerStickerId(Integer providerStickerId) {
    this.providerStickerId = providerStickerId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The sticker Id of the sticker, assigned by the sticker provider.")
  @JsonProperty("providerStickerId")
  public Integer getProviderStickerId() {
    return providerStickerId;
  }
  public void setProviderStickerId(Integer providerStickerId) {
    this.providerStickerId = providerStickerId;
  }

  
  /**
   * The package Id of the sticker, assigned by the sticker provider.
   **/
  public MessagingSticker providerPackageId(Integer providerPackageId) {
    this.providerPackageId = providerPackageId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The package Id of the sticker, assigned by the sticker provider.")
  @JsonProperty("providerPackageId")
  public Integer getProviderPackageId() {
    return providerPackageId;
  }
  public void setProviderPackageId(Integer providerPackageId) {
    this.providerPackageId = providerPackageId;
  }

  
  /**
   * The package name of the sticker, assigned by the sticker provider.
   **/
  public MessagingSticker packageName(String packageName) {
    this.packageName = packageName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The package name of the sticker, assigned by the sticker provider.")
  @JsonProperty("packageName")
  public String getPackageName() {
    return packageName;
  }
  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }

  
  /**
   * The type of the messenger provider.
   **/
  public MessagingSticker messengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the messenger provider.")
  @JsonProperty("messengerType")
  public MessengerTypeEnum getMessengerType() {
    return messengerType;
  }
  public void setMessengerType(MessengerTypeEnum messengerType) {
    this.messengerType = messengerType;
  }

  
  /**
   * The type of the sticker.
   **/
  public MessagingSticker stickerType(StickerTypeEnum stickerType) {
    this.stickerType = stickerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the sticker.")
  @JsonProperty("stickerType")
  public StickerTypeEnum getStickerType() {
    return stickerType;
  }
  public void setStickerType(StickerTypeEnum stickerType) {
    this.stickerType = stickerType;
  }

  
  /**
   * The version of the sticker, assigned by the provider.
   **/
  public MessagingSticker providerVersion(Long providerVersion) {
    this.providerVersion = providerVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the sticker, assigned by the provider.")
  @JsonProperty("providerVersion")
  public Long getProviderVersion() {
    return providerVersion;
  }
  public void setProviderVersion(Long providerVersion) {
    this.providerVersion = providerVersion;
  }

  
  /**
   **/
  public MessagingSticker uriLocation(String uriLocation) {
    this.uriLocation = uriLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uriLocation")
  public String getUriLocation() {
    return uriLocation;
  }
  public void setUriLocation(String uriLocation) {
    this.uriLocation = uriLocation;
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
    MessagingSticker messagingSticker = (MessagingSticker) o;
    return Objects.equals(this.id, messagingSticker.id) &&
        Objects.equals(this.name, messagingSticker.name) &&
        Objects.equals(this.providerStickerId, messagingSticker.providerStickerId) &&
        Objects.equals(this.providerPackageId, messagingSticker.providerPackageId) &&
        Objects.equals(this.packageName, messagingSticker.packageName) &&
        Objects.equals(this.messengerType, messagingSticker.messengerType) &&
        Objects.equals(this.stickerType, messagingSticker.stickerType) &&
        Objects.equals(this.providerVersion, messagingSticker.providerVersion) &&
        Objects.equals(this.uriLocation, messagingSticker.uriLocation) &&
        Objects.equals(this.selfUri, messagingSticker.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, providerStickerId, providerPackageId, packageName, messengerType, stickerType, providerVersion, uriLocation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagingSticker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    providerStickerId: ").append(toIndentedString(providerStickerId)).append("\n");
    sb.append("    providerPackageId: ").append(toIndentedString(providerPackageId)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    messengerType: ").append(toIndentedString(messengerType)).append("\n");
    sb.append("    stickerType: ").append(toIndentedString(stickerType)).append("\n");
    sb.append("    providerVersion: ").append(toIndentedString(providerVersion)).append("\n");
    sb.append("    uriLocation: ").append(toIndentedString(uriLocation)).append("\n");
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

