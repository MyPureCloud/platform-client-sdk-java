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
import com.mypurecloud.sdk.v2.model.AuditEntity;
import com.mypurecloud.sdk.v2.model.AuditUser;
import com.mypurecloud.sdk.v2.model.Change;
import com.mypurecloud.sdk.v2.model.ServiceContext;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditMessage
 */

public class AuditMessage  implements Serializable {
  
  private String id = null;
  private AuditUser user = null;
  private String correlationId = null;
  private String transactionId = null;
  private Boolean transactionInitiator = null;
  private String application = null;
  private String serviceName = null;
  private String level = null;
  private String timestamp = null;
  private String receivedTimestamp = null;
  private String status = null;
  private String actionContext = null;
  private String action = null;
  private List<Change> changes = new ArrayList<Change>();
  private AuditEntity entity = null;
  private ServiceContext serviceContext = null;

  
  /**
   * AuditMessage ID.
   **/
  public AuditMessage id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "AuditMessage ID.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public AuditMessage user(AuditUser user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("user")
  public AuditUser getUser() {
    return user;
  }
  public void setUser(AuditUser user) {
    this.user = user;
  }

  
  /**
   * Correlation ID.
   **/
  public AuditMessage correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Correlation ID.")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  
  /**
   * Transaction ID.
   **/
  public AuditMessage transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Transaction ID.")
  @JsonProperty("transactionId")
  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  
  /**
   * Whether or not this audit can be considered the initiator of the transaction it is a part of.
   **/
  public AuditMessage transactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether or not this audit can be considered the initiator of the transaction it is a part of.")
  @JsonProperty("transactionInitiator")
  public Boolean getTransactionInitiator() {
    return transactionInitiator;
  }
  public void setTransactionInitiator(Boolean transactionInitiator) {
    this.transactionInitiator = transactionInitiator;
  }

  
  /**
   * The application through which the action of this AuditMessage was initiated.
   **/
  public AuditMessage application(String application) {
    this.application = application;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The application through which the action of this AuditMessage was initiated.")
  @JsonProperty("application")
  public String getApplication() {
    return application;
  }
  public void setApplication(String application) {
    this.application = application;
  }

  
  /**
   * The name of the service which sent this AuditMessage.
   **/
  public AuditMessage serviceName(String serviceName) {
    this.serviceName = serviceName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the service which sent this AuditMessage.")
  @JsonProperty("serviceName")
  public String getServiceName() {
    return serviceName;
  }
  public void setServiceName(String serviceName) {
    this.serviceName = serviceName;
  }

  
  /**
   * The level of this audit. USER or SYSTEM.
   **/
  public AuditMessage level(String level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The level of this audit. USER or SYSTEM.")
  @JsonProperty("level")
  public String getLevel() {
    return level;
  }
  public void setLevel(String level) {
    this.level = level;
  }

  
  /**
   * The time at which the action of this AuditMessage was initiated.
   **/
  public AuditMessage timestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time at which the action of this AuditMessage was initiated.")
  @JsonProperty("timestamp")
  public String getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(String timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   * The time at which this AuditMessage was received.
   **/
  public AuditMessage receivedTimestamp(String receivedTimestamp) {
    this.receivedTimestamp = receivedTimestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time at which this AuditMessage was received.")
  @JsonProperty("receivedTimestamp")
  public String getReceivedTimestamp() {
    return receivedTimestamp;
  }
  public void setReceivedTimestamp(String receivedTimestamp) {
    this.receivedTimestamp = receivedTimestamp;
  }

  
  /**
   * The status of the action of this AuditMessage
   **/
  public AuditMessage status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the action of this AuditMessage")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  /**
   * The context of a system-level action
   **/
  public AuditMessage actionContext(String actionContext) {
    this.actionContext = actionContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The context of a system-level action")
  @JsonProperty("actionContext")
  public String getActionContext() {
    return actionContext;
  }
  public void setActionContext(String actionContext) {
    this.actionContext = actionContext;
  }

  
  /**
   * A string representing the action that took place
   **/
  public AuditMessage action(String action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A string representing the action that took place")
  @JsonProperty("action")
  public String getAction() {
    return action;
  }
  public void setAction(String action) {
    this.action = action;
  }

  
  /**
   * Details about any changes that occurred in this audit
   **/
  public AuditMessage changes(List<Change> changes) {
    this.changes = changes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Details about any changes that occurred in this audit")
  @JsonProperty("changes")
  public List<Change> getChanges() {
    return changes;
  }
  public void setChanges(List<Change> changes) {
    this.changes = changes;
  }

  
  /**
   **/
  public AuditMessage entity(AuditEntity entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entity")
  public AuditEntity getEntity() {
    return entity;
  }
  public void setEntity(AuditEntity entity) {
    this.entity = entity;
  }

  
  /**
   * The service-specific context associated with this AuditMessage.
   **/
  public AuditMessage serviceContext(ServiceContext serviceContext) {
    this.serviceContext = serviceContext;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The service-specific context associated with this AuditMessage.")
  @JsonProperty("serviceContext")
  public ServiceContext getServiceContext() {
    return serviceContext;
  }
  public void setServiceContext(ServiceContext serviceContext) {
    this.serviceContext = serviceContext;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditMessage auditMessage = (AuditMessage) o;
    return Objects.equals(this.id, auditMessage.id) &&
        Objects.equals(this.user, auditMessage.user) &&
        Objects.equals(this.correlationId, auditMessage.correlationId) &&
        Objects.equals(this.transactionId, auditMessage.transactionId) &&
        Objects.equals(this.transactionInitiator, auditMessage.transactionInitiator) &&
        Objects.equals(this.application, auditMessage.application) &&
        Objects.equals(this.serviceName, auditMessage.serviceName) &&
        Objects.equals(this.level, auditMessage.level) &&
        Objects.equals(this.timestamp, auditMessage.timestamp) &&
        Objects.equals(this.receivedTimestamp, auditMessage.receivedTimestamp) &&
        Objects.equals(this.status, auditMessage.status) &&
        Objects.equals(this.actionContext, auditMessage.actionContext) &&
        Objects.equals(this.action, auditMessage.action) &&
        Objects.equals(this.changes, auditMessage.changes) &&
        Objects.equals(this.entity, auditMessage.entity) &&
        Objects.equals(this.serviceContext, auditMessage.serviceContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, user, correlationId, transactionId, transactionInitiator, application, serviceName, level, timestamp, receivedTimestamp, status, actionContext, action, changes, entity, serviceContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditMessage {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionInitiator: ").append(toIndentedString(transactionInitiator)).append("\n");
    sb.append("    application: ").append(toIndentedString(application)).append("\n");
    sb.append("    serviceName: ").append(toIndentedString(serviceName)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    receivedTimestamp: ").append(toIndentedString(receivedTimestamp)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    actionContext: ").append(toIndentedString(actionContext)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
    sb.append("    serviceContext: ").append(toIndentedString(serviceContext)).append("\n");
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

