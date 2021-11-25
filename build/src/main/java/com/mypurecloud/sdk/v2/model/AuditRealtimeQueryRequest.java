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
import com.mypurecloud.sdk.v2.model.AuditQueryFilter;
import com.mypurecloud.sdk.v2.model.AuditQuerySort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditRealtimeQueryRequest
 */

public class AuditRealtimeQueryRequest  implements Serializable {
  
  private String interval = null;

  private static class ServiceNameEnumDeserializer extends StdDeserializer<ServiceNameEnum> {
    public ServiceNameEnumDeserializer() {
      super(ServiceNameEnumDeserializer.class);
    }

    @Override
    public ServiceNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ServiceNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the service to query audits for.
   */
 @JsonDeserialize(using = ServiceNameEnumDeserializer.class)
  public enum ServiceNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ANALYTICSREPORTING("AnalyticsReporting"),
    ARCHITECT("Architect"),
    COACHING("Coaching"),
    CONTACTCENTER("ContactCenter"),
    CONTENTMANAGEMENT("ContentManagement"),
    DATATABLES("Datatables"),
    DIRECTORY("Directory"),
    DYNAMICSCHEMA("DynamicSchema"),
    GAMIFICATION("Gamification"),
    GROUPS("Groups"),
    INTEGRATIONS("Integrations"),
    KNOWLEDGE("Knowledge"),
    LANGUAGEUNDERSTANDING("LanguageUnderstanding"),
    LEARNING("Learning"),
    LIMITS("Limits"),
    OUTBOUND("Outbound"),
    PEOPLEPERMISSIONS("PeoplePermissions"),
    EMPLOYEEPERFORMANCE("EmployeePerformance"),
    PREDICTIVEENGAGEMENT("PredictiveEngagement"),
    PRESENCE("Presence"),
    QUALITY("Quality"),
    RESPONSEMANAGEMENT("ResponseManagement"),
    ROUTING("Routing"),
    SPEECHANDTEXTANALYTICS("SpeechAndTextAnalytics"),
    TELEPHONY("Telephony"),
    TOPICSDEFINITIONS("TopicsDefinitions"),
    TRIGGERS("Triggers"),
    PROCESSAUTOMATION("ProcessAutomation"),
    WEBDEPLOYMENTS("WebDeployments"),
    WEBHOOKS("Webhooks"),
    WORKFORCEMANAGEMENT("WorkforceManagement"),
    MESSAGING("Messaging"),
    SUPPORTABILITY("Supportability"),
    CALLBACK("Callback");

    private String value;

    ServiceNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ServiceNameEnum fromString(String key) {
      if (key == null) return null;

      for (ServiceNameEnum value : ServiceNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ServiceNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ServiceNameEnum serviceName = null;
  private List<AuditQueryFilter> filters = new ArrayList<AuditQueryFilter>();
  private List<AuditQuerySort> sort = new ArrayList<AuditQuerySort>();
  private Integer pageNumber = null;
  private Integer pageSize = null;

  
  /**
   * Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss
   **/
  public AuditRealtimeQueryRequest interval(String interval) {
    this.interval = interval;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Date and time range of data to query. Intervals are represented as an ISO-8601 string. For example: YYYY-MM-DDThh:mm:ss/YYYY-MM-DDThh:mm:ss")
  @JsonProperty("interval")
  public String getInterval() {
    return interval;
  }
  public void setInterval(String interval) {
    this.interval = interval;
  }

  
  /**
   * Name of the service to query audits for.
   **/
  public AuditRealtimeQueryRequest serviceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the service to query audits for.")
  @JsonProperty("serviceName")
  public ServiceNameEnum getServiceName() {
    return serviceName;
  }
  public void setServiceName(ServiceNameEnum serviceName) {
    this.serviceName = serviceName;
  }

  
  /**
   * Additional filters for the query.
   **/
  public AuditRealtimeQueryRequest filters(List<AuditQueryFilter> filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional filters for the query.")
  @JsonProperty("filters")
  public List<AuditQueryFilter> getFilters() {
    return filters;
  }
  public void setFilters(List<AuditQueryFilter> filters) {
    this.filters = filters;
  }

  
  /**
   * Sort parameter for the query.
   **/
  public AuditRealtimeQueryRequest sort(List<AuditQuerySort> sort) {
    this.sort = sort;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Sort parameter for the query.")
  @JsonProperty("sort")
  public List<AuditQuerySort> getSort() {
    return sort;
  }
  public void setSort(List<AuditQuerySort> sort) {
    this.sort = sort;
  }

  
  /**
   * Page number
   **/
  public AuditRealtimeQueryRequest pageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page number")
  @JsonProperty("pageNumber")
  public Integer getPageNumber() {
    return pageNumber;
  }
  public void setPageNumber(Integer pageNumber) {
    this.pageNumber = pageNumber;
  }

  
  /**
   * Page size
   **/
  public AuditRealtimeQueryRequest pageSize(Integer pageSize) {
    this.pageSize = pageSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Page size")
  @JsonProperty("pageSize")
  public Integer getPageSize() {
    return pageSize;
  }
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRealtimeQueryRequest auditRealtimeQueryRequest = (AuditRealtimeQueryRequest) o;
    return Objects.equals(this.interval, auditRealtimeQueryRequest.interval) &&
        Objects.equals(this.serviceName, auditRealtimeQueryRequest.serviceName) &&
        Objects.equals(this.filters, auditRealtimeQueryRequest.filters) &&
        Objects.equals(this.sort, auditRealtimeQueryRequest.sort) &&
        Objects.equals(this.pageNumber, auditRealtimeQueryRequest.pageNumber) &&
        Objects.equals(this.pageSize, auditRealtimeQueryRequest.pageSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, serviceName, filters, sort, pageNumber, pageSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRealtimeQueryRequest {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    pageNumber: ").append(toIndentedString(pageNumber)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
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

