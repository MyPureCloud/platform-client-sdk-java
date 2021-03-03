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
import com.mypurecloud.sdk.v2.model.AnalyticsProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * PropertyIndexRequest
 */

public class PropertyIndexRequest  implements Serializable {
  
  private String sessionId = null;
  private Date targetDate = null;
  private List<AnalyticsProperty> properties = new ArrayList<AnalyticsProperty>();

  
  /**
   * Attach properties to a segment in the indicated session
   **/
  public PropertyIndexRequest sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attach properties to a segment in the indicated session")
  @JsonProperty("sessionId")
  public String getSessionId() {
    return sessionId;
  }
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  
  /**
   * Attach properties to a segment covering a specific point in time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public PropertyIndexRequest targetDate(Date targetDate) {
    this.targetDate = targetDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Attach properties to a segment covering a specific point in time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("targetDate")
  public Date getTargetDate() {
    return targetDate;
  }
  public void setTargetDate(Date targetDate) {
    this.targetDate = targetDate;
  }

  
  /**
   * The list of properties to index
   **/
  public PropertyIndexRequest properties(List<AnalyticsProperty> properties) {
    this.properties = properties;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of properties to index")
  @JsonProperty("properties")
  public List<AnalyticsProperty> getProperties() {
    return properties;
  }
  public void setProperties(List<AnalyticsProperty> properties) {
    this.properties = properties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PropertyIndexRequest propertyIndexRequest = (PropertyIndexRequest) o;
    return Objects.equals(this.sessionId, propertyIndexRequest.sessionId) &&
        Objects.equals(this.targetDate, propertyIndexRequest.targetDate) &&
        Objects.equals(this.properties, propertyIndexRequest.properties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sessionId, targetDate, properties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PropertyIndexRequest {\n");
    
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    targetDate: ").append(toIndentedString(targetDate)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
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

