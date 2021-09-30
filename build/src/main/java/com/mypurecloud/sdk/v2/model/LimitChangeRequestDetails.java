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
import com.mypurecloud.sdk.v2.model.StatusChange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * LimitChangeRequestDetails
 */

public class LimitChangeRequestDetails  implements Serializable {
  
  private String id = null;
  private String key = null;
  private String namespace = null;
  private Double requestedValue = null;
  private String description = null;
  private String supportCaseUrl = null;
  private String createdBy = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Current status of the limit change request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OPEN("Open"),
    APPROVED("Approved"),
    IMPLEMENTINGCHANGE("ImplementingChange"),
    CHANGEIMPLEMENTED("ChangeImplemented"),
    REJECTED("Rejected"),
    ROLLBACK("Rollback"),
    IMPLEMENTINGROLLBACK("ImplementingRollback"),
    ROLLBACKIMPLEMENTED("RollbackImplemented");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private Double currentValue = null;
  private Date dateCreated = null;
  private List<StatusChange> statusHistory = new ArrayList<StatusChange>();
  private Date dateCompleted = null;
  private String lastChangedBy = null;

  private static class RejectReasonEnumDeserializer extends StdDeserializer<RejectReasonEnum> {
    public RejectReasonEnumDeserializer() {
      super(RejectReasonEnumDeserializer.class);
    }

    @Override
    public RejectReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RejectReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The reason for rejecting the limit override request
   */
 @JsonDeserialize(using = RejectReasonEnumDeserializer.class)
  public enum RejectReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALTERNATIVEEXISTS("AlternativeExists"),
    INCREASENOTREQUIRED("IncreaseNotRequired"),
    PLATFORMMISUSE("PlatformMisuse"),
    PLATFORMSTABILITY("PlatformStability"),
    OTHERREASON("OtherReason");

    private String value;

    RejectReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RejectReasonEnum fromString(String key) {
      if (key == null) return null;

      for (RejectReasonEnum value : RejectReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RejectReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RejectReasonEnum rejectReason = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * Limit key to be overridden (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits)
   **/
  public LimitChangeRequestDetails key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Limit key to be overridden (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits)")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * Namespace the key belongs to (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits)
   **/
  public LimitChangeRequestDetails namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Namespace the key belongs to (see https://developer.mypurecloud.com/api/rest/v2/organization/limits.html#available_limits)")
  @JsonProperty("namespace")
  public String getNamespace() {
    return namespace;
  }
  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  
  /**
   * Requested limit value for a given key
   **/
  public LimitChangeRequestDetails requestedValue(Double requestedValue) {
    this.requestedValue = requestedValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Requested limit value for a given key")
  @JsonProperty("requestedValue")
  public Double getRequestedValue() {
    return requestedValue;
  }
  public void setRequestedValue(Double requestedValue) {
    this.requestedValue = requestedValue;
  }

  
  /**
   * Description of the need for the limit change request
   **/
  public LimitChangeRequestDetails description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Description of the need for the limit change request")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The support case url created by Care
   **/
  public LimitChangeRequestDetails supportCaseUrl(String supportCaseUrl) {
    this.supportCaseUrl = supportCaseUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The support case url created by Care")
  @JsonProperty("supportCaseUrl")
  public String getSupportCaseUrl() {
    return supportCaseUrl;
  }
  public void setSupportCaseUrl(String supportCaseUrl) {
    this.supportCaseUrl = supportCaseUrl;
  }

  
  @ApiModelProperty(example = "null", value = "The user who created the change request")
  @JsonProperty("createdBy")
  public String getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Current status of the limit change request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "Current limit value for a given key")
  @JsonProperty("currentValue")
  public Double getCurrentValue() {
    return currentValue;
  }

  
  @ApiModelProperty(example = "null", value = "The date of the limit change request creation. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "List of statuses that a limit change request has gone through")
  @JsonProperty("statusHistory")
  public List<StatusChange> getStatusHistory() {
    return statusHistory;
  }

  
  @ApiModelProperty(example = "null", value = "The date of the limit change request completion (ChangeImplemented, Rejected, or RollbackImplemented. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }

  
  @ApiModelProperty(example = "null", value = "The user who last updated the status of the limit change request")
  @JsonProperty("lastChangedBy")
  public String getLastChangedBy() {
    return lastChangedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The reason for rejecting the limit override request")
  @JsonProperty("rejectReason")
  public RejectReasonEnum getRejectReason() {
    return rejectReason;
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
    LimitChangeRequestDetails limitChangeRequestDetails = (LimitChangeRequestDetails) o;
    return Objects.equals(this.id, limitChangeRequestDetails.id) &&
        Objects.equals(this.key, limitChangeRequestDetails.key) &&
        Objects.equals(this.namespace, limitChangeRequestDetails.namespace) &&
        Objects.equals(this.requestedValue, limitChangeRequestDetails.requestedValue) &&
        Objects.equals(this.description, limitChangeRequestDetails.description) &&
        Objects.equals(this.supportCaseUrl, limitChangeRequestDetails.supportCaseUrl) &&
        Objects.equals(this.createdBy, limitChangeRequestDetails.createdBy) &&
        Objects.equals(this.status, limitChangeRequestDetails.status) &&
        Objects.equals(this.currentValue, limitChangeRequestDetails.currentValue) &&
        Objects.equals(this.dateCreated, limitChangeRequestDetails.dateCreated) &&
        Objects.equals(this.statusHistory, limitChangeRequestDetails.statusHistory) &&
        Objects.equals(this.dateCompleted, limitChangeRequestDetails.dateCompleted) &&
        Objects.equals(this.lastChangedBy, limitChangeRequestDetails.lastChangedBy) &&
        Objects.equals(this.rejectReason, limitChangeRequestDetails.rejectReason) &&
        Objects.equals(this.selfUri, limitChangeRequestDetails.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, key, namespace, requestedValue, description, supportCaseUrl, createdBy, status, currentValue, dateCreated, statusHistory, dateCompleted, lastChangedBy, rejectReason, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LimitChangeRequestDetails {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    requestedValue: ").append(toIndentedString(requestedValue)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    supportCaseUrl: ").append(toIndentedString(supportCaseUrl)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currentValue: ").append(toIndentedString(currentValue)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    statusHistory: ").append(toIndentedString(statusHistory)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    lastChangedBy: ").append(toIndentedString(lastChangedBy)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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

