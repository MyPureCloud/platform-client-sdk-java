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
 * WebEventDevice
 */

public class WebEventDevice  implements Serializable {
  

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
  private String osFamily = null;
  private String osVersion = null;
  private String manufacturer = null;

  
  /**
   * Device category.
   **/
  public WebEventDevice category(CategoryEnum category) {
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
  public WebEventDevice type(String type) {
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
  public WebEventDevice isMobile(Boolean isMobile) {
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
  public WebEventDevice screenHeight(Integer screenHeight) {
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
  public WebEventDevice screenWidth(Integer screenWidth) {
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
  public WebEventDevice screenDensity(Integer screenDensity) {
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
   * Operating system family.
   **/
  public WebEventDevice osFamily(String osFamily) {
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
  public WebEventDevice osVersion(String osVersion) {
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
  public WebEventDevice manufacturer(String manufacturer) {
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
    WebEventDevice webEventDevice = (WebEventDevice) o;

    return Objects.equals(this.category, webEventDevice.category) &&
            Objects.equals(this.type, webEventDevice.type) &&
            Objects.equals(this.isMobile, webEventDevice.isMobile) &&
            Objects.equals(this.screenHeight, webEventDevice.screenHeight) &&
            Objects.equals(this.screenWidth, webEventDevice.screenWidth) &&
            Objects.equals(this.screenDensity, webEventDevice.screenDensity) &&
            Objects.equals(this.osFamily, webEventDevice.osFamily) &&
            Objects.equals(this.osVersion, webEventDevice.osVersion) &&
            Objects.equals(this.manufacturer, webEventDevice.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, type, isMobile, screenHeight, screenWidth, screenDensity, osFamily, osVersion, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebEventDevice {\n");
    
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isMobile: ").append(toIndentedString(isMobile)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    screenDensity: ").append(toIndentedString(screenDensity)).append("\n");
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

