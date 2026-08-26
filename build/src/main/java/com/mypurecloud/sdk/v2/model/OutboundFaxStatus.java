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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * OutboundFaxStatus
 */

public class OutboundFaxStatus  implements Serializable {
  
  private String id = null;
  private AddressableEntityRef initiatingUser = null;
  private Date dateCreated = null;
  private String auditTransactionId = null;
  private Long expirationTime = null;
  private String statusCode = null;
  private String result = null;
  private String selfUri = null;

  public OutboundFaxStatus() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public OutboundFaxStatus(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The user who sent the fax.
   **/
  public OutboundFaxStatus initiatingUser(AddressableEntityRef initiatingUser) {
    this.initiatingUser = initiatingUser;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who sent the fax.")
  @JsonProperty("initiatingUser")
  public AddressableEntityRef getInitiatingUser() {
    return initiatingUser;
  }
  public void setInitiatingUser(AddressableEntityRef initiatingUser) {
    this.initiatingUser = initiatingUser;
  }


  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OutboundFaxStatus dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   **/
  public OutboundFaxStatus auditTransactionId(String auditTransactionId) {
    this.auditTransactionId = auditTransactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("auditTransactionId")
  public String getAuditTransactionId() {
    return auditTransactionId;
  }
  public void setAuditTransactionId(String auditTransactionId) {
    this.auditTransactionId = auditTransactionId;
  }


  /**
   **/
  public OutboundFaxStatus expirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("expirationTime")
  public Long getExpirationTime() {
    return expirationTime;
  }
  public void setExpirationTime(Long expirationTime) {
    this.expirationTime = expirationTime;
  }


  /**
   * Lifecycle status of the outbound fax send (e.g. UPLOADING, TRANSMITTING, COMPLETE, TERMINATED).
   **/
  public OutboundFaxStatus statusCode(String statusCode) {
    this.statusCode = statusCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Lifecycle status of the outbound fax send (e.g. UPLOADING, TRANSMITTING, COMPLETE, TERMINATED).")
  @JsonProperty("statusCode")
  public String getStatusCode() {
    return statusCode;
  }
  public void setStatusCode(String statusCode) {
    this.statusCode = statusCode;
  }


  /**
   * Transmission result of the fax. Does NOT indicate successful arrival to a workspace's inbox.
   **/
  public OutboundFaxStatus result(String result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transmission result of the fax. Does NOT indicate successful arrival to a workspace's inbox.")
  @JsonProperty("result")
  public String getResult() {
    return result;
  }
  public void setResult(String result) {
    this.result = result;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundFaxStatus outboundFaxStatus = (OutboundFaxStatus) o;

    return Objects.equals(this.id, outboundFaxStatus.id) &&
            Objects.equals(this.initiatingUser, outboundFaxStatus.initiatingUser) &&
            Objects.equals(this.dateCreated, outboundFaxStatus.dateCreated) &&
            Objects.equals(this.auditTransactionId, outboundFaxStatus.auditTransactionId) &&
            Objects.equals(this.expirationTime, outboundFaxStatus.expirationTime) &&
            Objects.equals(this.statusCode, outboundFaxStatus.statusCode) &&
            Objects.equals(this.result, outboundFaxStatus.result) &&
            Objects.equals(this.selfUri, outboundFaxStatus.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, initiatingUser, dateCreated, auditTransactionId, expirationTime, statusCode, result, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundFaxStatus {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    initiatingUser: ").append(toIndentedString(initiatingUser)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    auditTransactionId: ").append(toIndentedString(auditTransactionId)).append("\n");
    sb.append("    expirationTime: ").append(toIndentedString(expirationTime)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

