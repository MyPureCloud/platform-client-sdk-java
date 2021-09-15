package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * JourneyPage
 */

public class JourneyPage  implements Serializable {
  
  private String url = null;
  private String title = null;
  private String domain = null;
  private String fragment = null;
  private String hostname = null;
  private String keywords = null;
  private String lang = null;
  private String pathname = null;
  private String queryString = null;
  private List<String> breadcrumb = new ArrayList<String>();

  
  /**
   * The page URL.
   **/
  public JourneyPage url(String url) {
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
  public JourneyPage title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Title of the page.")
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
  public JourneyPage domain(String domain) {
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
  public JourneyPage fragment(String fragment) {
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
  public JourneyPage hostname(String hostname) {
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
   * Keywords from the HTML {@code <meta>} tag of the page.
   **/
  public JourneyPage keywords(String keywords) {
    this.keywords = keywords;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Keywords from the HTML {@code <meta>} tag of the page.")
  @JsonProperty("keywords")
  public String getKeywords() {
    return keywords;
  }
  public void setKeywords(String keywords) {
    this.keywords = keywords;
  }

  
  /**
   * ISO 639-1 language code for the page as defined in the {@code <html>} tag.
   **/
  public JourneyPage lang(String lang) {
    this.lang = lang;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ISO 639-1 language code for the page as defined in the {@code <html>} tag.")
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
  public JourneyPage pathname(String pathname) {
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
  public JourneyPage queryString(String queryString) {
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

  
  /**
   * Hierarchy of the current page in relation to the website's structure.
   **/
  public JourneyPage breadcrumb(List<String> breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Hierarchy of the current page in relation to the website's structure.")
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
    JourneyPage journeyPage = (JourneyPage) o;
    return Objects.equals(this.url, journeyPage.url) &&
        Objects.equals(this.title, journeyPage.title) &&
        Objects.equals(this.domain, journeyPage.domain) &&
        Objects.equals(this.fragment, journeyPage.fragment) &&
        Objects.equals(this.hostname, journeyPage.hostname) &&
        Objects.equals(this.keywords, journeyPage.keywords) &&
        Objects.equals(this.lang, journeyPage.lang) &&
        Objects.equals(this.pathname, journeyPage.pathname) &&
        Objects.equals(this.queryString, journeyPage.queryString) &&
        Objects.equals(this.breadcrumb, journeyPage.breadcrumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, title, domain, fragment, hostname, keywords, lang, pathname, queryString, breadcrumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyPage {\n");
    
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

