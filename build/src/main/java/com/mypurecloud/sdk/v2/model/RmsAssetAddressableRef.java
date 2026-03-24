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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RmsAssetAddressableRef
 */

public class RmsAssetAddressableRef  implements Serializable {
  
  private String id = null;
  private String selfUri = null;

  private static class AssetUsageEnumDeserializer extends StdDeserializer<AssetUsageEnum> {
    public AssetUsageEnumDeserializer() {
      super(AssetUsageEnumDeserializer.class);
    }

    @Override
    public AssetUsageEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AssetUsageEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Usage of the asset. Null for inline images, 'FileAttachments' for file attachments
   */
 @JsonDeserialize(using = AssetUsageEnumDeserializer.class)
  public enum AssetUsageEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FILEATTACHMENTS("FileAttachments");

    private String value;

    AssetUsageEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AssetUsageEnum fromString(String key) {
      if (key == null) return null;

      for (AssetUsageEnum value : AssetUsageEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AssetUsageEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AssetUsageEnum assetUsage = null;
  private String contentLocation = null;

  public RmsAssetAddressableRef() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public RmsAssetAddressableRef id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public RmsAssetAddressableRef selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   * Usage of the asset. Null for inline images, 'FileAttachments' for file attachments
   **/
  public RmsAssetAddressableRef assetUsage(AssetUsageEnum assetUsage) {
    this.assetUsage = assetUsage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Usage of the asset. Null for inline images, 'FileAttachments' for file attachments")
  @JsonProperty("assetUsage")
  public AssetUsageEnum getAssetUsage() {
    return assetUsage;
  }
  public void setAssetUsage(AssetUsageEnum assetUsage) {
    this.assetUsage = assetUsage;
  }


  /**
   * Content location URL for the asset
   **/
  public RmsAssetAddressableRef contentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Content location URL for the asset")
  @JsonProperty("contentLocation")
  public String getContentLocation() {
    return contentLocation;
  }
  public void setContentLocation(String contentLocation) {
    this.contentLocation = contentLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RmsAssetAddressableRef rmsAssetAddressableRef = (RmsAssetAddressableRef) o;

    return Objects.equals(this.id, rmsAssetAddressableRef.id) &&
            Objects.equals(this.selfUri, rmsAssetAddressableRef.selfUri) &&
            Objects.equals(this.assetUsage, rmsAssetAddressableRef.assetUsage) &&
            Objects.equals(this.contentLocation, rmsAssetAddressableRef.contentLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, assetUsage, contentLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RmsAssetAddressableRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    assetUsage: ").append(toIndentedString(assetUsage)).append("\n");
    sb.append("    contentLocation: ").append(toIndentedString(contentLocation)).append("\n");
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

