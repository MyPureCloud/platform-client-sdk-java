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
import com.mypurecloud.sdk.v2.model.AuditQueryService;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditQueryServiceMapping
 */

public class AuditQueryServiceMapping  implements Serializable {
  
  private List<AuditQueryService> services = new ArrayList<AuditQueryService>();

  
  /**
   * List of Services
   **/
  public AuditQueryServiceMapping services(List<AuditQueryService> services) {
    this.services = services;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Services")
  @JsonProperty("services")
  public List<AuditQueryService> getServices() {
    return services;
  }
  public void setServices(List<AuditQueryService> services) {
    this.services = services;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryServiceMapping auditQueryServiceMapping = (AuditQueryServiceMapping) o;
    return Objects.equals(this.services, auditQueryServiceMapping.services);
  }

  @Override
  public int hashCode() {
    return Objects.hash(services);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryServiceMapping {\n");
    
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
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

