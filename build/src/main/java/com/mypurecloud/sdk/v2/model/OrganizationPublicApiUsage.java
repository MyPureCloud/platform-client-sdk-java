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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * OrganizationPublicApiUsage
 */

public class OrganizationPublicApiUsage  implements Serializable {
  
  private LocalDate date = null;
  private String platform = null;

  private static class HttpMethodEnumDeserializer extends StdDeserializer<HttpMethodEnum> {
    public HttpMethodEnumDeserializer() {
      super(HttpMethodEnumDeserializer.class);
    }

    @Override
    public HttpMethodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return HttpMethodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The http method of the request(s)
   */
 @JsonDeserialize(using = HttpMethodEnumDeserializer.class)
  public enum HttpMethodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GET("GET"),
    POST("POST"),
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    HEAD("HEAD");

    private String value;

    HttpMethodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static HttpMethodEnum fromString(String key) {
      if (key == null) return null;

      for (HttpMethodEnum value : HttpMethodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return HttpMethodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private HttpMethodEnum httpMethod = null;
  private String templateUri = null;
  private Long requestCount = null;
  private Long status200 = null;
  private Long status300 = null;
  private Long status400 = null;
  private Long status429 = null;
  private Long status500 = null;
  private DomainEntityRef oauthClient = null;
  private UserReference user = null;

  public OrganizationPublicApiUsage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The date of the usage. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public OrganizationPublicApiUsage date(LocalDate date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the usage. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("date")
  public LocalDate getDate() {
    return date;
  }
  public void setDate(LocalDate date) {
    this.date = date;
  }


  /**
   * The platform the request(s) is/were made on.
   **/
  public OrganizationPublicApiUsage platform(String platform) {
    this.platform = platform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The platform the request(s) is/were made on.")
  @JsonProperty("platform")
  public String getPlatform() {
    return platform;
  }
  public void setPlatform(String platform) {
    this.platform = platform;
  }


  /**
   * The http method of the request(s)
   **/
  public OrganizationPublicApiUsage httpMethod(HttpMethodEnum httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The http method of the request(s)")
  @JsonProperty("httpMethod")
  public HttpMethodEnum getHttpMethod() {
    return httpMethod;
  }
  public void setHttpMethod(HttpMethodEnum httpMethod) {
    this.httpMethod = httpMethod;
  }


  /**
   * The templateUri of the request(s).
   **/
  public OrganizationPublicApiUsage templateUri(String templateUri) {
    this.templateUri = templateUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The templateUri of the request(s).")
  @JsonProperty("templateUri")
  public String getTemplateUri() {
    return templateUri;
  }
  public void setTemplateUri(String templateUri) {
    this.templateUri = templateUri;
  }


  /**
   * The total number of requests.
   **/
  public OrganizationPublicApiUsage requestCount(Long requestCount) {
    this.requestCount = requestCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of requests.")
  @JsonProperty("requestCount")
  public Long getRequestCount() {
    return requestCount;
  }
  public void setRequestCount(Long requestCount) {
    this.requestCount = requestCount;
  }


  /**
   * The number of requests resulting in a 2xx HTTP status code.
   **/
  public OrganizationPublicApiUsage status200(Long status200) {
    this.status200 = status200;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of requests resulting in a 2xx HTTP status code.")
  @JsonProperty("status200")
  public Long getStatus200() {
    return status200;
  }
  public void setStatus200(Long status200) {
    this.status200 = status200;
  }


  /**
   * The number of requests resulting in a 3xx HTTP status code.
   **/
  public OrganizationPublicApiUsage status300(Long status300) {
    this.status300 = status300;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of requests resulting in a 3xx HTTP status code.")
  @JsonProperty("status300")
  public Long getStatus300() {
    return status300;
  }
  public void setStatus300(Long status300) {
    this.status300 = status300;
  }


  /**
   * The number of requests resulting in a 4xx HTTP status code.
   **/
  public OrganizationPublicApiUsage status400(Long status400) {
    this.status400 = status400;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of requests resulting in a 4xx HTTP status code.")
  @JsonProperty("status400")
  public Long getStatus400() {
    return status400;
  }
  public void setStatus400(Long status400) {
    this.status400 = status400;
  }


  /**
   * The number of requests resulting in a 429 HTTP status code.
   **/
  public OrganizationPublicApiUsage status429(Long status429) {
    this.status429 = status429;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of requests resulting in a 429 HTTP status code.")
  @JsonProperty("status429")
  public Long getStatus429() {
    return status429;
  }
  public void setStatus429(Long status429) {
    this.status429 = status429;
  }


  /**
   * The number of requests resulting in a 5xx HTTP status code.
   **/
  public OrganizationPublicApiUsage status500(Long status500) {
    this.status500 = status500;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of requests resulting in a 5xx HTTP status code.")
  @JsonProperty("status500")
  public Long getStatus500() {
    return status500;
  }
  public void setStatus500(Long status500) {
    this.status500 = status500;
  }


  /**
   * The id of the oauthClient that made the request(s).
   **/
  public OrganizationPublicApiUsage oauthClient(DomainEntityRef oauthClient) {
    this.oauthClient = oauthClient;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the oauthClient that made the request(s).")
  @JsonProperty("oauthClient")
  public DomainEntityRef getOauthClient() {
    return oauthClient;
  }
  public void setOauthClient(DomainEntityRef oauthClient) {
    this.oauthClient = oauthClient;
  }


  /**
   * The id of the user who made the request(s).
   **/
  public OrganizationPublicApiUsage user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the user who made the request(s).")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrganizationPublicApiUsage organizationPublicApiUsage = (OrganizationPublicApiUsage) o;

    return Objects.equals(this.date, organizationPublicApiUsage.date) &&
            Objects.equals(this.platform, organizationPublicApiUsage.platform) &&
            Objects.equals(this.httpMethod, organizationPublicApiUsage.httpMethod) &&
            Objects.equals(this.templateUri, organizationPublicApiUsage.templateUri) &&
            Objects.equals(this.requestCount, organizationPublicApiUsage.requestCount) &&
            Objects.equals(this.status200, organizationPublicApiUsage.status200) &&
            Objects.equals(this.status300, organizationPublicApiUsage.status300) &&
            Objects.equals(this.status400, organizationPublicApiUsage.status400) &&
            Objects.equals(this.status429, organizationPublicApiUsage.status429) &&
            Objects.equals(this.status500, organizationPublicApiUsage.status500) &&
            Objects.equals(this.oauthClient, organizationPublicApiUsage.oauthClient) &&
            Objects.equals(this.user, organizationPublicApiUsage.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(date, platform, httpMethod, templateUri, requestCount, status200, status300, status400, status429, status500, oauthClient, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrganizationPublicApiUsage {\n");
    
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
    sb.append("    requestCount: ").append(toIndentedString(requestCount)).append("\n");
    sb.append("    status200: ").append(toIndentedString(status200)).append("\n");
    sb.append("    status300: ").append(toIndentedString(status300)).append("\n");
    sb.append("    status400: ").append(toIndentedString(status400)).append("\n");
    sb.append("    status429: ").append(toIndentedString(status429)).append("\n");
    sb.append("    status500: ").append(toIndentedString(status500)).append("\n");
    sb.append("    oauthClient: ").append(toIndentedString(oauthClient)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

