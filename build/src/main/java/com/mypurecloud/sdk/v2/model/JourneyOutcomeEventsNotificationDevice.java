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
 * JourneyOutcomeEventsNotificationDevice
 */

public class JourneyOutcomeEventsNotificationDevice  implements Serializable {
  
  private String type = null;
  private Boolean isMobile = null;
  private Long screenHeight = null;
  private Long screenWidth = null;
  private Long screenDensity = null;
  private String fingerprint = null;
  private String osFamily = null;
  private String osVersion = null;

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
   * Gets or Sets category
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
  private String manufacturer = null;

  public JourneyOutcomeEventsNotificationDevice() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyOutcomeEventsNotificationDevice type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice isMobile(Boolean isMobile) {
    this.isMobile = isMobile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("isMobile")
  public Boolean getIsMobile() {
    return isMobile;
  }
  public void setIsMobile(Boolean isMobile) {
    this.isMobile = isMobile;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice screenHeight(Long screenHeight) {
    this.screenHeight = screenHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenHeight")
  public Long getScreenHeight() {
    return screenHeight;
  }
  public void setScreenHeight(Long screenHeight) {
    this.screenHeight = screenHeight;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice screenWidth(Long screenWidth) {
    this.screenWidth = screenWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenWidth")
  public Long getScreenWidth() {
    return screenWidth;
  }
  public void setScreenWidth(Long screenWidth) {
    this.screenWidth = screenWidth;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice screenDensity(Long screenDensity) {
    this.screenDensity = screenDensity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("screenDensity")
  public Long getScreenDensity() {
    return screenDensity;
  }
  public void setScreenDensity(Long screenDensity) {
    this.screenDensity = screenDensity;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice fingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fingerprint")
  public String getFingerprint() {
    return fingerprint;
  }
  public void setFingerprint(String fingerprint) {
    this.fingerprint = fingerprint;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice osFamily(String osFamily) {
    this.osFamily = osFamily;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("osFamily")
  public String getOsFamily() {
    return osFamily;
  }
  public void setOsFamily(String osFamily) {
    this.osFamily = osFamily;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice osVersion(String osVersion) {
    this.osVersion = osVersion;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("osVersion")
  public String getOsVersion() {
    return osVersion;
  }
  public void setOsVersion(String osVersion) {
    this.osVersion = osVersion;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   **/
  public JourneyOutcomeEventsNotificationDevice manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    JourneyOutcomeEventsNotificationDevice journeyOutcomeEventsNotificationDevice = (JourneyOutcomeEventsNotificationDevice) o;

    return Objects.equals(this.type, journeyOutcomeEventsNotificationDevice.type) &&
            Objects.equals(this.isMobile, journeyOutcomeEventsNotificationDevice.isMobile) &&
            Objects.equals(this.screenHeight, journeyOutcomeEventsNotificationDevice.screenHeight) &&
            Objects.equals(this.screenWidth, journeyOutcomeEventsNotificationDevice.screenWidth) &&
            Objects.equals(this.screenDensity, journeyOutcomeEventsNotificationDevice.screenDensity) &&
            Objects.equals(this.fingerprint, journeyOutcomeEventsNotificationDevice.fingerprint) &&
            Objects.equals(this.osFamily, journeyOutcomeEventsNotificationDevice.osFamily) &&
            Objects.equals(this.osVersion, journeyOutcomeEventsNotificationDevice.osVersion) &&
            Objects.equals(this.category, journeyOutcomeEventsNotificationDevice.category) &&
            Objects.equals(this.manufacturer, journeyOutcomeEventsNotificationDevice.manufacturer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, isMobile, screenHeight, screenWidth, screenDensity, fingerprint, osFamily, osVersion, category, manufacturer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyOutcomeEventsNotificationDevice {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isMobile: ").append(toIndentedString(isMobile)).append("\n");
    sb.append("    screenHeight: ").append(toIndentedString(screenHeight)).append("\n");
    sb.append("    screenWidth: ").append(toIndentedString(screenWidth)).append("\n");
    sb.append("    screenDensity: ").append(toIndentedString(screenDensity)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    osFamily: ").append(toIndentedString(osFamily)).append("\n");
    sb.append("    osVersion: ").append(toIndentedString(osVersion)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

