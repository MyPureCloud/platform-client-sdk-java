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
 * WebEventBrowser
 */

public class WebEventBrowser  implements Serializable {
  
  private String family = null;
  private String version = null;
  private String lang = null;

  public WebEventBrowser() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Browser family (e.g. Chrome, Safari, Firefox).
   **/
  public WebEventBrowser family(String family) {
    this.family = family;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Browser family (e.g. Chrome, Safari, Firefox).")
  @JsonProperty("family")
  public String getFamily() {
    return family;
  }
  public void setFamily(String family) {
    this.family = family;
  }


  /**
   * Browser version (e.g. 68.0.3440.84).
   **/
  public WebEventBrowser version(String version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Browser version (e.g. 68.0.3440.84).")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Language the browser is set to. Must conform to BCP 47.
   **/
  public WebEventBrowser lang(String lang) {
    this.lang = lang;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language the browser is set to. Must conform to BCP 47.")
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebEventBrowser webEventBrowser = (WebEventBrowser) o;

    return Objects.equals(this.family, webEventBrowser.family) &&
            Objects.equals(this.version, webEventBrowser.version) &&
            Objects.equals(this.lang, webEventBrowser.lang);
  }

  @Override
  public int hashCode() {
    return Objects.hash(family, version, lang);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebEventBrowser {\n");
    
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
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

