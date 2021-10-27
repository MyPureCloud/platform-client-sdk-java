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
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyWebActionEventsNotificationReferrer
 */

public class JourneyWebActionEventsNotificationReferrer  implements Serializable {
  
  private String url = null;
  private String domain = null;
  private String hostname = null;
  private String keywords = null;
  private String pathname = null;
  private String queryString = null;
  private String fragment = null;
  private String name = null;

  private static class MediumEnumDeserializer extends StdDeserializer<MediumEnum> {
    public MediumEnumDeserializer() {
      super(MediumEnumDeserializer.class);
    }

    @Override
    public MediumEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediumEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets medium
   */
 @JsonDeserialize(using = MediumEnumDeserializer.class)
  public enum MediumEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERNAL("internal"),
    SEARCH("search"),
    SOCIAL("social"),
    EMAIL("email"),
    UNKNOWN("unknown"),
    PAID("paid");

    private String value;

    MediumEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediumEnum fromString(String key) {
      if (key == null) return null;

      for (MediumEnum value : MediumEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediumEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediumEnum medium = null;

  
  /**
   **/
  public JourneyWebActionEventsNotificationReferrer url(String url) {
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
  public JourneyWebActionEventsNotificationReferrer domain(String domain) {
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
  public JourneyWebActionEventsNotificationReferrer hostname(String hostname) {
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
  public JourneyWebActionEventsNotificationReferrer keywords(String keywords) {
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
  public JourneyWebActionEventsNotificationReferrer pathname(String pathname) {
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
  public JourneyWebActionEventsNotificationReferrer queryString(String queryString) {
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
  public JourneyWebActionEventsNotificationReferrer fragment(String fragment) {
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
  public JourneyWebActionEventsNotificationReferrer name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public JourneyWebActionEventsNotificationReferrer medium(MediumEnum medium) {
    this.medium = medium;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("medium")
  public MediumEnum getMedium() {
    return medium;
  }
  public void setMedium(MediumEnum medium) {
    this.medium = medium;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyWebActionEventsNotificationReferrer journeyWebActionEventsNotificationReferrer = (JourneyWebActionEventsNotificationReferrer) o;
    return Objects.equals(this.url, journeyWebActionEventsNotificationReferrer.url) &&
        Objects.equals(this.domain, journeyWebActionEventsNotificationReferrer.domain) &&
        Objects.equals(this.hostname, journeyWebActionEventsNotificationReferrer.hostname) &&
        Objects.equals(this.keywords, journeyWebActionEventsNotificationReferrer.keywords) &&
        Objects.equals(this.pathname, journeyWebActionEventsNotificationReferrer.pathname) &&
        Objects.equals(this.queryString, journeyWebActionEventsNotificationReferrer.queryString) &&
        Objects.equals(this.fragment, journeyWebActionEventsNotificationReferrer.fragment) &&
        Objects.equals(this.name, journeyWebActionEventsNotificationReferrer.name) &&
        Objects.equals(this.medium, journeyWebActionEventsNotificationReferrer.medium);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, domain, hostname, keywords, pathname, queryString, fragment, name, medium);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyWebActionEventsNotificationReferrer {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
    sb.append("    hostname: ").append(toIndentedString(hostname)).append("\n");
    sb.append("    keywords: ").append(toIndentedString(keywords)).append("\n");
    sb.append("    pathname: ").append(toIndentedString(pathname)).append("\n");
    sb.append("    queryString: ").append(toIndentedString(queryString)).append("\n");
    sb.append("    fragment: ").append(toIndentedString(fragment)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    medium: ").append(toIndentedString(medium)).append("\n");
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

