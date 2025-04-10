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
import com.mypurecloud.sdk.v2.model.SupportCenterGlobalStyle;
import com.mypurecloud.sdk.v2.model.SupportCenterHeroStyle;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SupportCenterStyleSetting
 */

public class SupportCenterStyleSetting  implements Serializable {
  
  private SupportCenterHeroStyle heroStyle = null;
  private SupportCenterGlobalStyle globalStyle = null;

  public SupportCenterStyleSetting() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Knowledge portal (previously support center) hero customizations
   **/
  public SupportCenterStyleSetting heroStyle(SupportCenterHeroStyle heroStyle) {
    this.heroStyle = heroStyle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge portal (previously support center) hero customizations")
  @JsonProperty("heroStyle")
  public SupportCenterHeroStyle getHeroStyle() {
    return heroStyle;
  }
  public void setHeroStyle(SupportCenterHeroStyle heroStyle) {
    this.heroStyle = heroStyle;
  }


  /**
   * Knowledge portal (previously support center) global customizations
   **/
  public SupportCenterStyleSetting globalStyle(SupportCenterGlobalStyle globalStyle) {
    this.globalStyle = globalStyle;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge portal (previously support center) global customizations")
  @JsonProperty("globalStyle")
  public SupportCenterGlobalStyle getGlobalStyle() {
    return globalStyle;
  }
  public void setGlobalStyle(SupportCenterGlobalStyle globalStyle) {
    this.globalStyle = globalStyle;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupportCenterStyleSetting supportCenterStyleSetting = (SupportCenterStyleSetting) o;

    return Objects.equals(this.heroStyle, supportCenterStyleSetting.heroStyle) &&
            Objects.equals(this.globalStyle, supportCenterStyleSetting.globalStyle);
  }

  @Override
  public int hashCode() {
    return Objects.hash(heroStyle, globalStyle);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupportCenterStyleSetting {\n");
    
    sb.append("    heroStyle: ").append(toIndentedString(heroStyle)).append("\n");
    sb.append("    globalStyle: ").append(toIndentedString(globalStyle)).append("\n");
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

