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
 * ContentFileResponse
 */

public class ContentFileResponse  implements Serializable {
  
  private String name = null;

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
   * The file format
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PDF("Pdf"),
    DOCX("Docx"),
    DOC("Doc");

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
  private String checksum = null;
  private Long size = null;
  private String contentUrl = null;

  public ContentFileResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the file
   **/
  public ContentFileResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the file")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The file format
   **/
  public ContentFileResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The file format")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The checksum of the file
   **/
  public ContentFileResponse checksum(String checksum) {
    this.checksum = checksum;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The checksum of the file")
  @JsonProperty("checksum")
  public String getChecksum() {
    return checksum;
  }
  public void setChecksum(String checksum) {
    this.checksum = checksum;
  }


  /**
   * The size of the file in bytes
   **/
  public ContentFileResponse size(Long size) {
    this.size = size;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The size of the file in bytes")
  @JsonProperty("size")
  public Long getSize() {
    return size;
  }
  public void setSize(Long size) {
    this.size = size;
  }


  /**
   * Public download url for content. Needs to be expanded
   **/
  public ContentFileResponse contentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Public download url for content. Needs to be expanded")
  @JsonProperty("contentUrl")
  public String getContentUrl() {
    return contentUrl;
  }
  public void setContentUrl(String contentUrl) {
    this.contentUrl = contentUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentFileResponse contentFileResponse = (ContentFileResponse) o;

    return Objects.equals(this.name, contentFileResponse.name) &&
            Objects.equals(this.type, contentFileResponse.type) &&
            Objects.equals(this.checksum, contentFileResponse.checksum) &&
            Objects.equals(this.size, contentFileResponse.size) &&
            Objects.equals(this.contentUrl, contentFileResponse.contentUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, checksum, size, contentUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentFileResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    checksum: ").append(toIndentedString(checksum)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
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

