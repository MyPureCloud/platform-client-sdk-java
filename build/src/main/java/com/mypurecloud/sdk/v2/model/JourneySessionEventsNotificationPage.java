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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneySessionEventsNotificationPage
 */

public class JourneySessionEventsNotificationPage  implements Serializable {
  
  private String url = null;
  private String title = null;
  private String domain = null;
  private String fragment = null;
  private String hostname = null;
  private String keywords = null;
  private String lang = null;
  private String pathname = null;
  private String queryString = null;
  private List<String> breadcrumb = null;

  public JourneySessionEventsNotificationPage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      breadcrumb = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public JourneySessionEventsNotificationPage url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage domain(String domain) {
    this.domain = domain;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("domain")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage fragment(String fragment) {
    this.fragment = fragment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fragment")
  public String getFragment() {
    return fragment;
  }
  public void setFragment(String fragment) {
    this.fragment = fragment;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage hostname(String hostname) {
    this.hostname = hostname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("hostname")
  public String getHostname() {
    return hostname;
  }
  public void setHostname(String hostname) {
    this.hostname = hostname;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("keywords")
  public String getKeywords() {
    return keywords;
  }
  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage lang(String lang) {
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
  public JourneySessionEventsNotificationPage pathname(String pathname) {
    this.pathname = pathname;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("pathname")
  public String getPathname() {
    return pathname;
  }
  public void setPathname(String pathname) {
    this.pathname = pathname;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage queryString(String queryString) {
    this.queryString = queryString;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("queryString")
  public String getQueryString() {
    return queryString;
  }
  public void setQueryString(String queryString) {
    this.queryString = queryString;
  }


  /**
   **/
  public JourneySessionEventsNotificationPage breadcrumb(List<String> breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("breadcrumb")
  public List<String> getBreadcrumb() {
    return breadcrumb;
  }
  public void setBreadcrumb(List<String> breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneySessionEventsNotificationPage journeySessionEventsNotificationPage = (JourneySessionEventsNotificationPage) o;

    return Objects.equals(this.url, journeySessionEventsNotificationPage.url) &&
            Objects.equals(this.title, journeySessionEventsNotificationPage.title) &&
            Objects.equals(this.domain, journeySessionEventsNotificationPage.domain) &&
            Objects.equals(this.fragment, journeySessionEventsNotificationPage.fragment) &&
            Objects.equals(this.hostname, journeySessionEventsNotificationPage.hostname) &&
            Objects.equals(this.keywords, journeySessionEventsNotificationPage.keywords) &&
            Objects.equals(this.lang, journeySessionEventsNotificationPage.lang) &&
            Objects.equals(this.pathname, journeySessionEventsNotificationPage.pathname) &&
            Objects.equals(this.queryString, journeySessionEventsNotificationPage.queryString) &&
            Objects.equals(this.breadcrumb, journeySessionEventsNotificationPage.breadcrumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, domain, fragment, hostname, keywords, lang, pathname, queryString, breadcrumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneySessionEventsNotificationPage {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    pathname: ").append(toIndentedString(pathname)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
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

