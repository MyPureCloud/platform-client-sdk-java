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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyWebActionEventsNotificationBrowser
 */

public class JourneyWebActionEventsNotificationBrowser  implements Serializable {
  
  private String family = null;
  private String version = null;
  private String lang = null;
  private String fingerprint = null;
  private Long viewHeight = null;
  private Long viewWidth = null;
  private Boolean featuresFlash = null;
  private Boolean featuresJava = null;
  private Boolean featuresPdf = null;
  private Boolean featuresWebrtc = null;

  public JourneyWebActionEventsNotificationBrowser() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationBrowser family(String family) {
    this.family = family;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("family")
  public String getFamily() {
    return family;
  }
  public void setFamily(String family) {
    this.family = family;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser lang(String lang) {
    this.lang = lang;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser fingerprint(String fingerprint) {
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
  public JourneyWebActionEventsNotificationBrowser viewHeight(Long viewHeight) {
    this.viewHeight = viewHeight;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewHeight")
  public Long getViewHeight() {
    return viewHeight;
  }
  public void setViewHeight(Long viewHeight) {
    this.viewHeight = viewHeight;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser viewWidth(Long viewWidth) {
    this.viewWidth = viewWidth;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("viewWidth")
  public Long getViewWidth() {
    return viewWidth;
  }
  public void setViewWidth(Long viewWidth) {
    this.viewWidth = viewWidth;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser featuresFlash(Boolean featuresFlash) {
    this.featuresFlash = featuresFlash;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("featuresFlash")
  public Boolean getFeaturesFlash() {
    return featuresFlash;
  }
  public void setFeaturesFlash(Boolean featuresFlash) {
    this.featuresFlash = featuresFlash;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser featuresJava(Boolean featuresJava) {
    this.featuresJava = featuresJava;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("featuresJava")
  public Boolean getFeaturesJava() {
    return featuresJava;
  }
  public void setFeaturesJava(Boolean featuresJava) {
    this.featuresJava = featuresJava;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser featuresPdf(Boolean featuresPdf) {
    this.featuresPdf = featuresPdf;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("featuresPdf")
  public Boolean getFeaturesPdf() {
    return featuresPdf;
  }
  public void setFeaturesPdf(Boolean featuresPdf) {
    this.featuresPdf = featuresPdf;
  }


  /**
   **/
  public JourneyWebActionEventsNotificationBrowser featuresWebrtc(Boolean featuresWebrtc) {
    this.featuresWebrtc = featuresWebrtc;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("featuresWebrtc")
  public Boolean getFeaturesWebrtc() {
    return featuresWebrtc;
  }
  public void setFeaturesWebrtc(Boolean featuresWebrtc) {
    this.featuresWebrtc = featuresWebrtc;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebActionEventsNotificationBrowser journeyWebActionEventsNotificationBrowser = (JourneyWebActionEventsNotificationBrowser) o;

    return Objects.equals(this.family, journeyWebActionEventsNotificationBrowser.family) &&
            Objects.equals(this.version, journeyWebActionEventsNotificationBrowser.version) &&
            Objects.equals(this.lang, journeyWebActionEventsNotificationBrowser.lang) &&
            Objects.equals(this.fingerprint, journeyWebActionEventsNotificationBrowser.fingerprint) &&
            Objects.equals(this.viewHeight, journeyWebActionEventsNotificationBrowser.viewHeight) &&
            Objects.equals(this.viewWidth, journeyWebActionEventsNotificationBrowser.viewWidth) &&
            Objects.equals(this.featuresFlash, journeyWebActionEventsNotificationBrowser.featuresFlash) &&
            Objects.equals(this.featuresJava, journeyWebActionEventsNotificationBrowser.featuresJava) &&
            Objects.equals(this.featuresPdf, journeyWebActionEventsNotificationBrowser.featuresPdf) &&
            Objects.equals(this.featuresWebrtc, journeyWebActionEventsNotificationBrowser.featuresWebrtc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, version, lang, fingerprint, viewHeight, viewWidth, featuresFlash, featuresJava, featuresPdf, featuresWebrtc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebActionEventsNotificationBrowser {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
    sb.append("    viewHeight: ").append(toIndentedString(viewHeight)).append("\n");
    sb.append("    viewWidth: ").append(toIndentedString(viewWidth)).append("\n");
    sb.append("    featuresFlash: ").append(toIndentedString(featuresFlash)).append("\n");
    sb.append("    featuresJava: ").append(toIndentedString(featuresJava)).append("\n");
    sb.append("    featuresPdf: ").append(toIndentedString(featuresPdf)).append("\n");
    sb.append("    featuresWebrtc: ").append(toIndentedString(featuresWebrtc)).append("\n");
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

