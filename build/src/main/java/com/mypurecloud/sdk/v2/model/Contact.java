package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Contact
 */

public class Contact  implements Serializable {
  
  private String address = null;
  private String display = null;

  /**
   * Gets or Sets mediaType
   */
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PHONE("PHONE"),
    EMAIL("EMAIL"),
    SMS("SMS");

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

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PRIMARY("PRIMARY"),
    WORK("WORK"),
    WORK2("WORK2"),
    WORK3("WORK3"),
    WORK4("WORK4"),
    HOME("HOME"),
    MOBILE("MOBILE"),
    MAIN("MAIN");

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
  private String extension = null;

  
  /**
   * Email address or phone number for this contact type
   **/
  public Contact address(String address) {
    this.address = address;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Email address or phone number for this contact type")
  @JsonProperty("address")
  public String getAddress() {
    return address;
  }
  public void setAddress(String address) {
    this.address = address;
  }

  
  @ApiModelProperty(example = "null", value = "Formatted version of the address property")
  @JsonProperty("display")
  public String getDisplay() {
    return display;
  }

  
  /**
   **/
  public Contact mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }

  
  /**
   **/
  public Contact type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Use extension instead of address for setting internal extensions
   **/
  public Contact extension(String extension) {
    this.extension = extension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Use extension instead of address for setting internal extensions")
  @JsonProperty("extension")
  public String getExtension() {
    return extension;
  }
  public void setExtension(String extension) {
    this.extension = extension;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.address, contact.address) &&
        Objects.equals(this.display, contact.display) &&
        Objects.equals(this.mediaType, contact.mediaType) &&
        Objects.equals(this.type, contact.type) &&
        Objects.equals(this.extension, contact.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, display, mediaType, type, extension);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    display: ").append(toIndentedString(display)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

