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
 * FaxSendResponse
 */

public class FaxSendResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String uploadDestinationUri = null;

  private static class UploadMethodTypeEnumDeserializer extends StdDeserializer<UploadMethodTypeEnum> {
    public UploadMethodTypeEnumDeserializer() {
      super(UploadMethodTypeEnumDeserializer.class);
    }

    @Override
    public UploadMethodTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UploadMethodTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets uploadMethodType
   */
 @JsonDeserialize(using = UploadMethodTypeEnumDeserializer.class)
  public enum UploadMethodTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SINGLE_PUT("SINGLE_PUT"),
    MULTIPART_POST("MULTIPART_POST");

    private String value;

    UploadMethodTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadMethodTypeEnum fromString(String key) {
      if (key == null) return null;

      for (UploadMethodTypeEnum value : UploadMethodTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadMethodTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadMethodTypeEnum uploadMethodType = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public FaxSendResponse name(String name) {
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
   **/
  public FaxSendResponse uploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadDestinationUri")
  public String getUploadDestinationUri() {
    return uploadDestinationUri;
  }
  public void setUploadDestinationUri(String uploadDestinationUri) {
    this.uploadDestinationUri = uploadDestinationUri;
  }

  
  /**
   **/
  public FaxSendResponse uploadMethodType(UploadMethodTypeEnum uploadMethodType) {
    this.uploadMethodType = uploadMethodType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadMethodType")
  public UploadMethodTypeEnum getUploadMethodType() {
    return uploadMethodType;
  }
  public void setUploadMethodType(UploadMethodTypeEnum uploadMethodType) {
    this.uploadMethodType = uploadMethodType;
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
    FaxSendResponse faxSendResponse = (FaxSendResponse) o;
    return Objects.equals(this.id, faxSendResponse.id) &&
        Objects.equals(this.name, faxSendResponse.name) &&
        Objects.equals(this.uploadDestinationUri, faxSendResponse.uploadDestinationUri) &&
        Objects.equals(this.uploadMethodType, faxSendResponse.uploadMethodType) &&
        Objects.equals(this.selfUri, faxSendResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, uploadDestinationUri, uploadMethodType, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FaxSendResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    uploadDestinationUri: ").append(toIndentedString(uploadDestinationUri)).append("\n");
    sb.append("    uploadMethodType: ").append(toIndentedString(uploadMethodType)).append("\n");
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

