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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OpenIntegration
 */

public class OpenIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String outboundNotificationWebhookUrl = null;
  private String outboundNotificationWebhookSignatureSecretToken = null;
  private Map<String, String> webhookHeaders = null;
  private String status = null;
  private DomainEntityRef recipient = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;

  private static class CreateStatusEnumDeserializer extends StdDeserializer<CreateStatusEnum> {
    public CreateStatusEnumDeserializer() {
      super(CreateStatusEnumDeserializer.class);
    }

    @Override
    public CreateStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CreateStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Status of asynchronous create operation
   */
 @JsonDeserialize(using = CreateStatusEnumDeserializer.class)
  public enum CreateStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATED("Initiated"),
    COMPLETED("Completed"),
    ERROR("Error");

    private String value;

    CreateStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CreateStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CreateStatusEnum value : CreateStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CreateStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CreateStatusEnum createStatus = null;
  private ErrorBody createError = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", required = true, value = "A unique Integration Id.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the Open messaging integration.
   **/
  public OpenIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Open messaging integration.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The outbound notification webhook URL for the Open messaging integration.
   **/
  public OpenIntegration outboundNotificationWebhookUrl(String outboundNotificationWebhookUrl) {
    this.outboundNotificationWebhookUrl = outboundNotificationWebhookUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outbound notification webhook URL for the Open messaging integration.")
  @JsonProperty("outboundNotificationWebhookUrl")
  public String getOutboundNotificationWebhookUrl() {
    return outboundNotificationWebhookUrl;
  }
  public void setOutboundNotificationWebhookUrl(String outboundNotificationWebhookUrl) {
    this.outboundNotificationWebhookUrl = outboundNotificationWebhookUrl;
  }

  
  /**
   * The outbound notification webhook signature secret token.
   **/
  public OpenIntegration outboundNotificationWebhookSignatureSecretToken(String outboundNotificationWebhookSignatureSecretToken) {
    this.outboundNotificationWebhookSignatureSecretToken = outboundNotificationWebhookSignatureSecretToken;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The outbound notification webhook signature secret token.")
  @JsonProperty("outboundNotificationWebhookSignatureSecretToken")
  public String getOutboundNotificationWebhookSignatureSecretToken() {
    return outboundNotificationWebhookSignatureSecretToken;
  }
  public void setOutboundNotificationWebhookSignatureSecretToken(String outboundNotificationWebhookSignatureSecretToken) {
    this.outboundNotificationWebhookSignatureSecretToken = outboundNotificationWebhookSignatureSecretToken;
  }

  
  /**
   * The user specified headers for the Open messaging integration.
   **/
  public OpenIntegration webhookHeaders(Map<String, String> webhookHeaders) {
    this.webhookHeaders = webhookHeaders;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user specified headers for the Open messaging integration.")
  @JsonProperty("webhookHeaders")
  public Map<String, String> getWebhookHeaders() {
    return webhookHeaders;
  }
  public void setWebhookHeaders(Map<String, String> webhookHeaders) {
    this.webhookHeaders = webhookHeaders;
  }

  
  /**
   * The status of the Open Integration
   **/
  public OpenIntegration status(String status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Open Integration")
  @JsonProperty("status")
  public String getStatus() {
    return status;
  }
  public void setStatus(String status) {
    this.status = status;
  }

  
  @ApiModelProperty(example = "null", value = "The recipient associated to the Open messaging Integration. This recipient is used to associate a flow to an integration")
  @JsonProperty("recipient")
  public DomainEntityRef getRecipient() {
    return recipient;
  }

  
  /**
   * Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OpenIntegration dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   * Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public OpenIntegration dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date this Integration was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   * User reference that created this Integration
   **/
  public OpenIntegration createdBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User reference that created this Integration")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(DomainEntityRef createdBy) {
    this.createdBy = createdBy;
  }

  
  /**
   * User reference that last modified this Integration
   **/
  public OpenIntegration modifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User reference that last modified this Integration")
  @JsonProperty("modifiedBy")
  public DomainEntityRef getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(DomainEntityRef modifiedBy) {
    this.modifiedBy = modifiedBy;
  }

  
  @ApiModelProperty(example = "null", value = "Status of asynchronous create operation")
  @JsonProperty("createStatus")
  public CreateStatusEnum getCreateStatus() {
    return createStatus;
  }

  
  @ApiModelProperty(example = "null", value = "Error information returned, if createStatus is set to Error")
  @JsonProperty("createError")
  public ErrorBody getCreateError() {
    return createError;
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
    OpenIntegration openIntegration = (OpenIntegration) o;
    return Objects.equals(this.id, openIntegration.id) &&
        Objects.equals(this.name, openIntegration.name) &&
        Objects.equals(this.outboundNotificationWebhookUrl, openIntegration.outboundNotificationWebhookUrl) &&
        Objects.equals(this.outboundNotificationWebhookSignatureSecretToken, openIntegration.outboundNotificationWebhookSignatureSecretToken) &&
        Objects.equals(this.webhookHeaders, openIntegration.webhookHeaders) &&
        Objects.equals(this.status, openIntegration.status) &&
        Objects.equals(this.recipient, openIntegration.recipient) &&
        Objects.equals(this.dateCreated, openIntegration.dateCreated) &&
        Objects.equals(this.dateModified, openIntegration.dateModified) &&
        Objects.equals(this.createdBy, openIntegration.createdBy) &&
        Objects.equals(this.modifiedBy, openIntegration.modifiedBy) &&
        Objects.equals(this.createStatus, openIntegration.createStatus) &&
        Objects.equals(this.createError, openIntegration.createError) &&
        Objects.equals(this.selfUri, openIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, outboundNotificationWebhookUrl, outboundNotificationWebhookSignatureSecretToken, webhookHeaders, status, recipient, dateCreated, dateModified, createdBy, modifiedBy, createStatus, createError, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outboundNotificationWebhookUrl: ").append(toIndentedString(outboundNotificationWebhookUrl)).append("\n");
    sb.append("    outboundNotificationWebhookSignatureSecretToken: ").append(toIndentedString(outboundNotificationWebhookSignatureSecretToken)).append("\n");
    sb.append("    webhookHeaders: ").append(toIndentedString(webhookHeaders)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    createStatus: ").append(toIndentedString(createStatus)).append("\n");
    sb.append("    createError: ").append(toIndentedString(createError)).append("\n");
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

