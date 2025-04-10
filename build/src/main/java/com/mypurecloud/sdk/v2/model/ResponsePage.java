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
 * ResponsePage
 */

public class ResponsePage  implements Serializable {
  
  private String url = null;
  private String title = null;
  private String domain = null;
  private String fragment = null;
  private String hostname = null;
  private String keywords = null;
  private String lang = null;
  private String pathname = null;
  private String queryString = null;

  public ResponsePage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The page URL.
   **/
  public ResponsePage url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The page URL.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * Title of the page.
   **/
  public ResponsePage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Title of the page.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Domain of the page's URL.
   **/
  public ResponsePage domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Domain of the page's URL.")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }


  /**
   * Fragment or hash of the page's URL.
   **/
  public ResponsePage fragment(String fragment) {
    this.fragment = fragment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Fragment or hash of the page's URL.")
  @JsonProperty("fragment")
  public String getFragment() {
    return fragment;
  }
  public void setFragment(String fragment) {
    this.fragment = fragment;
  }


  /**
   * Hostname of the page's URL.
   **/
  public ResponsePage hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Hostname of the page's URL.")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  /**
   * Keywords from the HTML <meta> tag of the page.
   **/
  public ResponsePage keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Keywords from the HTML <meta> tag of the page.")
  @JsonProperty("keywords")
  public String getKeywords() {
    return keywords;
  }
  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  /**
   * ISO 639-1 language code for the page as defined in the <html> tag.
   **/
  public ResponsePage lang(String lang) {
    this.lang = lang;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 639-1 language code for the page as defined in the <html> tag.")
  @JsonProperty("lang")
  public String getLang() {
    return lang;
  }
  public void setLang(String lang) {
    this.lang = lang;
  }


  /**
   * Path name of the page for the event.
   **/
  public ResponsePage pathname(String pathname) {
    this.pathname = pathname;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Path name of the page for the event.")
  @JsonProperty("pathname")
  public String getPathname() {
    return pathname;
  }
  public void setPathname(String pathname) {
    this.pathname = pathname;
  }


  /**
   * Query string that is passed to the page in the current event.
   **/
  public ResponsePage queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Query string that is passed to the page in the current event.")
  @JsonProperty("queryString")
  public String getQueryString() {
    return queryString;
  }
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponsePage responsePage = (ResponsePage) o;

    return Objects.equals(this.url, responsePage.url) &&
            Objects.equals(this.title, responsePage.title) &&
            Objects.equals(this.domain, responsePage.domain) &&
            Objects.equals(this.fragment, responsePage.fragment) &&
            Objects.equals(this.hostname, responsePage.hostname) &&
            Objects.equals(this.keywords, responsePage.keywords) &&
            Objects.equals(this.lang, responsePage.lang) &&
            Objects.equals(this.pathname, responsePage.pathname) &&
            Objects.equals(this.queryString, responsePage.queryString);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, domain, fragment, hostname, keywords, lang, pathname, queryString);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponsePage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    pathname: ").append(toIndentedString(pathname)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
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

