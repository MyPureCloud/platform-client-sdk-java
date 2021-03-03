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
import java.util.Date;

import java.io.Serializable;
/**
 * ApiUsageRow
 */

public class ApiUsageRow  implements Serializable {
  
  private String clientId = null;
  private String clientName = null;
  private String organizationId = null;
  private String userId = null;
  private String templateUri = null;
  private String httpMethod = null;
  private Long status200 = null;
  private Long status300 = null;
  private Long status400 = null;
  private Long status500 = null;
  private Long status429 = null;
  private Long requests = null;
  private Date date = null;

  
  /**
   * Client Id associated with this query result
   **/
  public ApiUsageRow clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Client Id associated with this query result")
  @JsonProperty("clientId")
  public String getClientId() {
    return clientId;
  }
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  
  /**
   * Client Name associated with this query result
   **/
  public ApiUsageRow clientName(String clientName) {
    this.clientName = clientName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Client Name associated with this query result")
  @JsonProperty("clientName")
  public String getClientName() {
    return clientName;
  }
  public void setClientName(String clientName) {
    this.clientName = clientName;
  }

  
  /**
   * Organization Id associated with this query result
   **/
  public ApiUsageRow organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Organization Id associated with this query result")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  
  /**
   * User Id associated with this query result
   **/
  public ApiUsageRow userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User Id associated with this query result")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }

  
  /**
   * Template Uri associated with this query result
   **/
  public ApiUsageRow templateUri(String templateUri) {
    this.templateUri = templateUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Template Uri associated with this query result")
  @JsonProperty("templateUri")
  public String getTemplateUri() {
    return templateUri;
  }
  public void setTemplateUri(String templateUri) {
    this.templateUri = templateUri;
  }

  
  /**
   * HTTP Method associated with this query result
   **/
  public ApiUsageRow httpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "HTTP Method associated with this query result")
  @JsonProperty("httpMethod")
  public String getHttpMethod() {
    return httpMethod;
  }
  public void setHttpMethod(String httpMethod) {
    this.httpMethod = httpMethod;
  }

  
  /**
   * Number of requests resulting in a 2xx HTTP status code
   **/
  public ApiUsageRow status200(Long status200) {
    this.status200 = status200;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of requests resulting in a 2xx HTTP status code")
  @JsonProperty("status200")
  public Long getStatus200() {
    return status200;
  }
  public void setStatus200(Long status200) {
    this.status200 = status200;
  }

  
  /**
   * Number of requests resulting in a 3xx HTTP status code
   **/
  public ApiUsageRow status300(Long status300) {
    this.status300 = status300;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of requests resulting in a 3xx HTTP status code")
  @JsonProperty("status300")
  public Long getStatus300() {
    return status300;
  }
  public void setStatus300(Long status300) {
    this.status300 = status300;
  }

  
  /**
   * Number of requests resulting in a 4xx HTTP status code
   **/
  public ApiUsageRow status400(Long status400) {
    this.status400 = status400;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of requests resulting in a 4xx HTTP status code")
  @JsonProperty("status400")
  public Long getStatus400() {
    return status400;
  }
  public void setStatus400(Long status400) {
    this.status400 = status400;
  }

  
  /**
   * Number of requests resulting in a 5xx HTTP status code
   **/
  public ApiUsageRow status500(Long status500) {
    this.status500 = status500;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of requests resulting in a 5xx HTTP status code")
  @JsonProperty("status500")
  public Long getStatus500() {
    return status500;
  }
  public void setStatus500(Long status500) {
    this.status500 = status500;
  }

  
  /**
   * Number of requests resulting in a 429 HTTP status code, this is a subset of the count returned with status400
   **/
  public ApiUsageRow status429(Long status429) {
    this.status429 = status429;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of requests resulting in a 429 HTTP status code, this is a subset of the count returned with status400")
  @JsonProperty("status429")
  public Long getStatus429() {
    return status429;
  }
  public void setStatus429(Long status429) {
    this.status429 = status429;
  }

  
  /**
   * Total number of requests
   **/
  public ApiUsageRow requests(Long requests) {
    this.requests = requests;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Total number of requests")
  @JsonProperty("requests")
  public Long getRequests() {
    return requests;
  }
  public void setRequests(Long requests) {
    this.requests = requests;
  }

  
  /**
   * Date of requests, based on granularity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ApiUsageRow date(Date date) {
    this.date = date;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date of requests, based on granularity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("date")
  public Date getDate() {
    return date;
  }
  public void setDate(Date date) {
    this.date = date;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiUsageRow apiUsageRow = (ApiUsageRow) o;
    return Objects.equals(this.clientId, apiUsageRow.clientId) &&
        Objects.equals(this.clientName, apiUsageRow.clientName) &&
        Objects.equals(this.organizationId, apiUsageRow.organizationId) &&
        Objects.equals(this.userId, apiUsageRow.userId) &&
        Objects.equals(this.templateUri, apiUsageRow.templateUri) &&
        Objects.equals(this.httpMethod, apiUsageRow.httpMethod) &&
        Objects.equals(this.status200, apiUsageRow.status200) &&
        Objects.equals(this.status300, apiUsageRow.status300) &&
        Objects.equals(this.status400, apiUsageRow.status400) &&
        Objects.equals(this.status500, apiUsageRow.status500) &&
        Objects.equals(this.status429, apiUsageRow.status429) &&
        Objects.equals(this.requests, apiUsageRow.requests) &&
        Objects.equals(this.date, apiUsageRow.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientName, organizationId, userId, templateUri, httpMethod, status200, status300, status400, status500, status429, requests, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiUsageRow {\n");
    
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientName: ").append(toIndentedString(clientName)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    templateUri: ").append(toIndentedString(templateUri)).append("\n");
    sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
    sb.append("    status200: ").append(toIndentedString(status200)).append("\n");
    sb.append("    status300: ").append(toIndentedString(status300)).append("\n");
    sb.append("    status400: ").append(toIndentedString(status400)).append("\n");
    sb.append("    status500: ").append(toIndentedString(status500)).append("\n");
    sb.append("    status429: ").append(toIndentedString(status429)).append("\n");
    sb.append("    requests: ").append(toIndentedString(requests)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

