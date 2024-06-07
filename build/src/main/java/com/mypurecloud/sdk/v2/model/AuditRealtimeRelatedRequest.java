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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AuditQuerySort;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditRealtimeRelatedRequest
 */

public class AuditRealtimeRelatedRequest  implements Serializable {
  
  private String auditId = null;
  private String trustorOrgId = null;
  private List<AuditQuerySort> sort = new ArrayList<AuditQuerySort>();

  
  /**
   * The id of the audit of which related audits will be retrieved.
   **/
  public AuditRealtimeRelatedRequest auditId(String auditId) {
    this.auditId = auditId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The id of the audit of which related audits will be retrieved.")
  @JsonProperty("auditId")
  public String getAuditId() {
    return auditId;
  }
  public void setAuditId(String auditId) {
    this.auditId = auditId;
  }


  /**
   * The id of the trustor org to which the audit belongs. Used when searching for audits performed by a trustee user within a trustor org.
   **/
  public AuditRealtimeRelatedRequest trustorOrgId(String trustorOrgId) {
    this.trustorOrgId = trustorOrgId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the trustor org to which the audit belongs. Used when searching for audits performed by a trustee user within a trustor org.")
  @JsonProperty("trustorOrgId")
  public String getTrustorOrgId() {
    return trustorOrgId;
  }
  public void setTrustorOrgId(String trustorOrgId) {
    this.trustorOrgId = trustorOrgId;
  }


  /**
   * Sort parameter for the query.
   **/
  public AuditRealtimeRelatedRequest sort(List<AuditQuerySort> sort) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditRealtimeRelatedRequest auditRealtimeRelatedRequest = (AuditRealtimeRelatedRequest) o;

    return Objects.equals(this.auditId, auditRealtimeRelatedRequest.auditId) &&
            Objects.equals(this.trustorOrgId, auditRealtimeRelatedRequest.trustorOrgId) &&
            Objects.equals(this.sort, auditRealtimeRelatedRequest.sort);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auditId, trustorOrgId, sort);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditRealtimeRelatedRequest {\n");
    
    sb.append("    auditId: ").append(toIndentedString(auditId)).append("\n");
    sb.append("    trustorOrgId: ").append(toIndentedString(trustorOrgId)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
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

