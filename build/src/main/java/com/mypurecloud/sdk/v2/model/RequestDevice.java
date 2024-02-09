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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RequestDevice
 */

public class RequestDevice  implements Serializable {
  

  private static class CategoryEnumDeserializer extends StdDeserializer<CategoryEnum> {
    public CategoryEnumDeserializer() {
      super(CategoryEnumDeserializer.class);
    }

    @Override
    public CategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Device category.
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DESKTOP("desktop"),
    MOBILE("mobile"),
    TABLET("tablet"),
    OTHER("other");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private String type = null;
  private Boolean isMobile = null;
  private Integer screenHeight = null;
  private Integer screenWidth = null;
  private Integer screenDensity = null;
  private String fingerprint = null;
  private String osFamily = null;
  private String osVersion = null;
  private String manufacturer = null;

  
  /**
   * Device category.
   **/
  public RequestDevice category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device category.")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * Device type (e.g. iPad, iPhone, Other).
   **/
  public RequestDevice type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Device type (e.g. iPad, iPhone, Other).")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Flag that is true for mobile devices.
   **/
  public RequestDevice isMobile(Boolean isMobile) {
    this.isMobile = isMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag that is true for mobile devices.")
  @JsonProperty("isMobile")
  public Boolean getIsMobile() {
    return isMobile;
  }
  public void setIsMobile(Boolean isMobile) {
    this.isMobile = isMobile;
  }


  /**
   * Device's screen height.
   **/
  public RequestDevice screenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Device's screen height.")
  @JsonProperty("screenHeight")
  public Integer getScreenHeight() {
    return screenHeight;
  }
  public void setScreenHeight(Integer screenHeight) {
    this.screenHeight = screenHeight;
  }


  /**
   * Device's screen width.
   **/
  public RequestDevice screenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Device's screen width.")
  @JsonProperty("screenWidth")
  public Integer getScreenWidth() {
    return screenWidth;
  }
  public void setScreenWidth(Integer screenWidth) {
    this.screenWidth = screenWidth;
  }


  /**
   * Device's screen density, measured as a scale factor where a value of 1 represents a baseline 1:1 ratio of pixels to logical (device-independent) pixels.
   **/
  public RequestDevice screenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Device's screen density, measured as a scale factor where a value of 1 represents a baseline 1:1 ratio of pixels to logical (device-independent) pixels.")
  @JsonProperty("screenDensity")
  public Integer getScreenDensity() {
    return screenDensity;
  }
  public void setScreenDensity(Integer screenDensity) {
    this.screenDensity = screenDensity;
  }


  /**
   * Fingerprint generated by looking at the individual device features.
   **/
  public RequestDevice fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fingerprint generated by looking at the individual device features.")
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  /**
   * Operating system family.
   **/
  public RequestDevice osFamily(String osFamily) {
    this.osFamily = osFamily;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operating system family.")
  @JsonProperty("osFamily")
  public String getOsFamily() {
    return osFamily;
  }
  public void setOsFamily(String osFamily) {
    this.osFamily = osFamily;
  }


  /**
   * Operating system version.
   **/
  public RequestDevice osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Operating system version.")
  @JsonProperty("osVersion")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  /**
   * Manufacturer of the device.
   **/
  public RequestDevice manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Manufacturer of the device.")
  @JsonProperty("manufacturer")
  public String getManufacturer() {
    return manufacturer;
  }
  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestDevice requestDevice = (RequestDevice) o;

    return Objects.equals(this.category, requestDevice.category) &&
            Objects.equals(this.type, requestDevice.type) &&
            Objects.equals(this.isMobile, requestDevice.isMobile) &&
            Objects.equals(this.screenHeight, requestDevice.screenHeight) &&
            Objects.equals(this.screenWidth, requestDevice.screenWidth) &&
            Objects.equals(this.screenDensity, requestDevice.screenDensity) &&
            Objects.equals(this.fingerprint, requestDevice.fingerprint) &&
            Objects.equals(this.osFamily, requestDevice.osFamily) &&
            Objects.equals(this.osVersion, requestDevice.osVersion) &&
            Objects.equals(this.manufacturer, requestDevice.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, type, isMobile, screenHeight, screenWidth, screenDensity, fingerprint, osFamily, osVersion, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestDevice {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isMobile: ").append(toIndentedString(isMobile)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    screenDensity: ").append(toIndentedString(screenDensity)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    osFamily: ").append(toIndentedString(osFamily)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
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

