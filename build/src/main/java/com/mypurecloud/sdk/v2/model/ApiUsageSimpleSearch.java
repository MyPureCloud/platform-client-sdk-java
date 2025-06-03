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
 * ApiUsageSimpleSearch
 */

public class ApiUsageSimpleSearch  implements Serializable {
  
  private String interval = null;

  private static class MetricsEnumDeserializer extends StdDeserializer<MetricsEnum> {
    public MetricsEnumDeserializer() {
      super(MetricsEnumDeserializer.class);
    }

    @Override
    public MetricsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MetricsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets metrics
   */
 @JsonDeserialize(using = MetricsEnumDeserializer.class)
  public enum MetricsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DATE("Date"),
    CLIENTNAME("ClientName"),
    HTTPMETHOD("HttpMethod"),
    TEMPLATEURI("TemplateUri"),
    STATUS200("Status200"),
    STATUS300("Status300"),
    STATUS400("Status400"),
    STATUS500("Status500"),
    STATUS429("Status429");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = null;
  private List<String> oauthClientNames = null;

  private static class HttpMethodsEnumDeserializer extends StdDeserializer<HttpMethodsEnum> {
    public HttpMethodsEnumDeserializer() {
      super(HttpMethodsEnumDeserializer.class);
    }

    @Override
    public HttpMethodsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return HttpMethodsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets httpMethods
   */
 @JsonDeserialize(using = HttpMethodsEnumDeserializer.class)
  public enum HttpMethodsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GET("GET"),
    POST("POST"),
    DELETE("DELETE"),
    PATCH("PATCH"),
    PUT("PUT"),
    HEAD("HEAD"),
    CONNECT("CONNECT"),
    OPTIONS("OPTIONS"),
    TRACE("TRACE");

    private String value;

    HttpMethodsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static HttpMethodsEnum fromString(String key) {
      if (key == null) return null;

      for (HttpMethodsEnum value : HttpMethodsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return HttpMethodsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<HttpMethodsEnum> httpMethods = null;
  private List<String> templateUris = null;

  public ApiUsageSimpleSearch() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<MetricsEnum>();
      oauthClientNames = new ArrayList<String>();
      httpMethods = new ArrayList<HttpMethodsEnum>();
      templateUris = new ArrayList<String>();
    }
  }

  
  /**
   * Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ApiUsageSimpleSearch interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Behaves like one clause in a SQL WHERE. Specifies the date and time range of data being queried. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).
   **/
  public ApiUsageSimpleSearch metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  /**
   * Behaves like a SQL WHERE with multiple IN operators. Specifies a list of OAuth client names to be queried.
   **/
  public ApiUsageSimpleSearch oauthClientNames(List<String> oauthClientNames) {
    this.oauthClientNames = oauthClientNames;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE with multiple IN operators. Specifies a list of OAuth client names to be queried.")
  @JsonProperty("oauthClientNames")
  public List<String> getOauthClientNames() {
    return oauthClientNames;
  }
  public void setOauthClientNames(List<String> oauthClientNames) {
    this.oauthClientNames = oauthClientNames;
  }


  /**
   * Behaves like a SQL WHERE with multiple IN operators. Specifies a list of HTTP methods to be queried.
   **/
  public ApiUsageSimpleSearch httpMethods(List<HttpMethodsEnum> httpMethods) {
    this.httpMethods = httpMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE with multiple IN operators. Specifies a list of HTTP methods to be queried.")
  @JsonProperty("httpMethods")
  public List<HttpMethodsEnum> getHttpMethods() {
    return httpMethods;
  }
  public void setHttpMethods(List<HttpMethodsEnum> httpMethods) {
    this.httpMethods = httpMethods;
  }


  /**
   * Behaves like a SQL WHERE with multiple IN operators. Specifies a list of Template Uris to be queried.
   **/
  public ApiUsageSimpleSearch templateUris(List<String> templateUris) {
    this.templateUris = templateUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL WHERE with multiple IN operators. Specifies a list of Template Uris to be queried.")
  @JsonProperty("templateUris")
  public List<String> getTemplateUris() {
    return templateUris;
  }
  public void setTemplateUris(List<String> templateUris) {
    this.templateUris = templateUris;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUsageSimpleSearch apiUsageSimpleSearch = (ApiUsageSimpleSearch) o;

    return Objects.equals(this.interval, apiUsageSimpleSearch.interval) &&
            Objects.equals(this.metrics, apiUsageSimpleSearch.metrics) &&
            Objects.equals(this.oauthClientNames, apiUsageSimpleSearch.oauthClientNames) &&
            Objects.equals(this.httpMethods, apiUsageSimpleSearch.httpMethods) &&
            Objects.equals(this.templateUris, apiUsageSimpleSearch.templateUris);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, metrics, oauthClientNames, httpMethods, templateUris);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUsageSimpleSearch {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    oauthClientNames: ").append(toIndentedString(oauthClientNames)).append("\n");
    sb.append("    httpMethods: ").append(toIndentedString(httpMethods)).append("\n");
    sb.append("    templateUris: ").append(toIndentedString(templateUris)).append("\n");
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

