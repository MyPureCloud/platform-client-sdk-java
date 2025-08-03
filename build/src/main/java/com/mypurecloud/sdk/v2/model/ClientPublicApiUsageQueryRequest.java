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
import com.mypurecloud.sdk.v2.model.UsageQuerySortBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ClientPublicApiUsageQueryRequest
 */

public class ClientPublicApiUsageQueryRequest  implements Serializable {
  
  private String interval = null;

  private static class GranularityEnumDeserializer extends StdDeserializer<GranularityEnum> {
    public GranularityEnumDeserializer() {
      super(GranularityEnumDeserializer.class);
    }

    @Override
    public GranularityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GranularityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Specify the granularity to aggregate the data to.
   */
 @JsonDeserialize(using = GranularityEnumDeserializer.class)
  public enum GranularityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAY("Day"),
    WEEK("Week"),
    MONTH("Month");

    private String value;

    GranularityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GranularityEnum fromString(String key) {
      if (key == null) return null;

      for (GranularityEnum value : GranularityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GranularityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private GranularityEnum granularity = null;
  private List<UsageQuerySortBy> sortBy = null;

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
    REQUESTS("Requests"),
    STATUS200("Status200"),
    STATUS300("Status300"),
    STATUS400("Status400"),
    STATUS429("Status429"),
    STATUS500("Status500");

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
  private List<String> templateUris = null;

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
    PUT("PUT"),
    PATCH("PATCH"),
    DELETE("DELETE"),
    HEAD("HEAD");

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
  private List<String> platforms = null;

  private static class GroupByEnumDeserializer extends StdDeserializer<GroupByEnum> {
    public GroupByEnumDeserializer() {
      super(GroupByEnumDeserializer.class);
    }

    @Override
    public GroupByEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return GroupByEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets groupBy
   */
 @JsonDeserialize(using = GroupByEnumDeserializer.class)
  public enum GroupByEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ORGANIZATIONID("OrganizationId"),
    HTTPMETHOD("HttpMethod"),
    TEMPLATEURI("TemplateUri"),
    PLATFORM("Platform");

    private String value;

    GroupByEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static GroupByEnum fromString(String key) {
      if (key == null) return null;

      for (GroupByEnum value : GroupByEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return GroupByEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<GroupByEnum> groupBy = null;
  private List<String> organizationIds = null;

  public ClientPublicApiUsageQueryRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sortBy = new ArrayList<UsageQuerySortBy>();
      metrics = new ArrayList<MetricsEnum>();
      templateUris = new ArrayList<String>();
      httpMethods = new ArrayList<HttpMethodsEnum>();
      platforms = new ArrayList<String>();
      groupBy = new ArrayList<GroupByEnum>();
      organizationIds = new ArrayList<String>();
    }
  }

  
  /**
   * Specify the interval to query on. Start and end are inclusive. Start date cannot be more than a year ago. End date cannot be more than 90 days after the start. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public ClientPublicApiUsageQueryRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Specify the interval to query on. Start and end are inclusive. Start date cannot be more than a year ago. End date cannot be more than 90 days after the start. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }


  /**
   * Specify the granularity to aggregate the data to.
   **/
  public ClientPublicApiUsageQueryRequest granularity(GranularityEnum granularity) {
    this.granularity = granularity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify the granularity to aggregate the data to.")
  @JsonProperty("granularity")
  public GranularityEnum getGranularity() {
    return granularity;
  }
  public void setGranularity(GranularityEnum granularity) {
    this.granularity = granularity;
  }


  /**
   * Specify how to sort the returned data.
   **/
  public ClientPublicApiUsageQueryRequest sortBy(List<UsageQuerySortBy> sortBy) {
    this.sortBy = sortBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify how to sort the returned data.")
  @JsonProperty("sortBy")
  public List<UsageQuerySortBy> getSortBy() {
    return sortBy;
  }
  public void setSortBy(List<UsageQuerySortBy> sortBy) {
    this.sortBy = sortBy;
  }


  /**
   * Specify which metrics you want returned (all will be returned by default).
   **/
  public ClientPublicApiUsageQueryRequest metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify which metrics you want returned (all will be returned by default).")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }


  /**
   * Specify if you only want a subset of templateUris represented in the query.
   **/
  public ClientPublicApiUsageQueryRequest templateUris(List<String> templateUris) {
    this.templateUris = templateUris;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify if you only want a subset of templateUris represented in the query.")
  @JsonProperty("templateUris")
  public List<String> getTemplateUris() {
    return templateUris;
  }
  public void setTemplateUris(List<String> templateUris) {
    this.templateUris = templateUris;
  }


  /**
   * Specify if you only want a subset of httpMethods represented in the query.
   **/
  public ClientPublicApiUsageQueryRequest httpMethods(List<HttpMethodsEnum> httpMethods) {
    this.httpMethods = httpMethods;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify if you only want a subset of httpMethods represented in the query.")
  @JsonProperty("httpMethods")
  public List<HttpMethodsEnum> getHttpMethods() {
    return httpMethods;
  }
  public void setHttpMethods(List<HttpMethodsEnum> httpMethods) {
    this.httpMethods = httpMethods;
  }


  /**
   * Specify if you only want a subset of platforms represented in the query.
   **/
  public ClientPublicApiUsageQueryRequest platforms(List<String> platforms) {
    this.platforms = platforms;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify if you only want a subset of platforms represented in the query.")
  @JsonProperty("platforms")
  public List<String> getPlatforms() {
    return platforms;
  }
  public void setPlatforms(List<String> platforms) {
    this.platforms = platforms;
  }


  /**
   * Specify how to aggregate the data (by default the data is not aggregated).
   **/
  public ClientPublicApiUsageQueryRequest groupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify how to aggregate the data (by default the data is not aggregated).")
  @JsonProperty("groupBy")
  public List<GroupByEnum> getGroupBy() {
    return groupBy;
  }
  public void setGroupBy(List<GroupByEnum> groupBy) {
    this.groupBy = groupBy;
  }


  /**
   * Specify if you only want a subset of organizationIds represented in the query.
   **/
  public ClientPublicApiUsageQueryRequest organizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Specify if you only want a subset of organizationIds represented in the query.")
  @JsonProperty("organizationIds")
  public List<String> getOrganizationIds() {
    return organizationIds;
  }
  public void setOrganizationIds(List<String> organizationIds) {
    this.organizationIds = organizationIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientPublicApiUsageQueryRequest clientPublicApiUsageQueryRequest = (ClientPublicApiUsageQueryRequest) o;

    return Objects.equals(this.interval, clientPublicApiUsageQueryRequest.interval) &&
            Objects.equals(this.granularity, clientPublicApiUsageQueryRequest.granularity) &&
            Objects.equals(this.sortBy, clientPublicApiUsageQueryRequest.sortBy) &&
            Objects.equals(this.metrics, clientPublicApiUsageQueryRequest.metrics) &&
            Objects.equals(this.templateUris, clientPublicApiUsageQueryRequest.templateUris) &&
            Objects.equals(this.httpMethods, clientPublicApiUsageQueryRequest.httpMethods) &&
            Objects.equals(this.platforms, clientPublicApiUsageQueryRequest.platforms) &&
            Objects.equals(this.groupBy, clientPublicApiUsageQueryRequest.groupBy) &&
            Objects.equals(this.organizationIds, clientPublicApiUsageQueryRequest.organizationIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, granularity, sortBy, metrics, templateUris, httpMethods, platforms, groupBy, organizationIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientPublicApiUsageQueryRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    granularity: ").append(toIndentedString(granularity)).append("\n");
    sb.append("    sortBy: ").append(toIndentedString(sortBy)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    templateUris: ").append(toIndentedString(templateUris)).append("\n");
    sb.append("    httpMethods: ").append(toIndentedString(httpMethods)).append("\n");
    sb.append("    platforms: ").append(toIndentedString(platforms)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    organizationIds: ").append(toIndentedString(organizationIds)).append("\n");
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

