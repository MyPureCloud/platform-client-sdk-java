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

import java.io.Serializable;
/**
 * WhatsAppIntegration
 */

public class WhatsAppIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String phoneNumber = null;

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
   * The status of the WhatsApp Integration
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    INACTIVE("Inactive"),
    ERROR("Error"),
    STARTING("Starting"),
    INCOMPLETE("Incomplete"),
    DELETING("Deleting"),
    DELETIONFAILED("DeletionFailed");

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
  private DomainEntityRef recipient = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private DomainEntityRef createdBy = null;
  private DomainEntityRef modifiedBy = null;
  private Integer version = null;

  private static class ActivationStatusCodeEnumDeserializer extends StdDeserializer<ActivationStatusCodeEnum> {
    public ActivationStatusCodeEnumDeserializer() {
      super(ActivationStatusCodeEnumDeserializer.class);
    }

    @Override
    public ActivationStatusCodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActivationStatusCodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status code of WhatsApp Integration activation process
   */
 @JsonDeserialize(using = ActivationStatusCodeEnumDeserializer.class)
  public enum ActivationStatusCodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CODESENT("CodeSent"),
    WAITREQUIRED("WaitRequired"),
    ACTIVATIONFAILED("ActivationFailed"),
    CODECONFIRMED("CodeConfirmed"),
    CONFIRMATIONFAILED("ConfirmationFailed"),
    RESENDCODE("ResendCode");

    private String value;

    ActivationStatusCodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActivationStatusCodeEnum fromString(String key) {
      if (key == null) return null;

      for (ActivationStatusCodeEnum value : ActivationStatusCodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActivationStatusCodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActivationStatusCodeEnum activationStatusCode = null;
  private ErrorBody activationErrorInfo = null;

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
   * The name of the WhatsApp integration.
   **/
  public WhatsAppIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the WhatsApp integration.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The phone number associated to the whatsApp integration.
   **/
  public WhatsAppIntegration phoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The phone number associated to the whatsApp integration.")
  @JsonProperty("phoneNumber")
  public String getPhoneNumber() {
    return phoneNumber;
  }
  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  
  /**
   * The status of the WhatsApp Integration
   **/
  public WhatsAppIntegration status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the WhatsApp Integration")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  @ApiModelProperty(example = "null", value = "The recipient associated to the WhatsApp Integration. This recipient is used to associate a flow to an integration")
  @JsonProperty("recipient")
  public DomainEntityRef getRecipient() {
    return recipient;
  }

  
  /**
   * Date this Integration was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public WhatsAppIntegration dateCreated(Date dateCreated) {
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
  public WhatsAppIntegration dateModified(Date dateModified) {
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
  public WhatsAppIntegration createdBy(DomainEntityRef createdBy) {
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
  public WhatsAppIntegration modifiedBy(DomainEntityRef modifiedBy) {
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

  
  /**
   * Version number required for updates.
   **/
  public WhatsAppIntegration version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version number required for updates.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  @ApiModelProperty(example = "null", value = "The status code of WhatsApp Integration activation process")
  @JsonProperty("activationStatusCode")
  public ActivationStatusCodeEnum getActivationStatusCode() {
    return activationStatusCode;
  }

  
  @ApiModelProperty(example = "null", value = "The error information of WhatsApp Integration activation process")
  @JsonProperty("activationErrorInfo")
  public ErrorBody getActivationErrorInfo() {
    return activationErrorInfo;
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
    WhatsAppIntegration whatsAppIntegration = (WhatsAppIntegration) o;
    return Objects.equals(this.id, whatsAppIntegration.id) &&
        Objects.equals(this.name, whatsAppIntegration.name) &&
        Objects.equals(this.phoneNumber, whatsAppIntegration.phoneNumber) &&
        Objects.equals(this.status, whatsAppIntegration.status) &&
        Objects.equals(this.recipient, whatsAppIntegration.recipient) &&
        Objects.equals(this.dateCreated, whatsAppIntegration.dateCreated) &&
        Objects.equals(this.dateModified, whatsAppIntegration.dateModified) &&
        Objects.equals(this.createdBy, whatsAppIntegration.createdBy) &&
        Objects.equals(this.modifiedBy, whatsAppIntegration.modifiedBy) &&
        Objects.equals(this.version, whatsAppIntegration.version) &&
        Objects.equals(this.activationStatusCode, whatsAppIntegration.activationStatusCode) &&
        Objects.equals(this.activationErrorInfo, whatsAppIntegration.activationErrorInfo) &&
        Objects.equals(this.createStatus, whatsAppIntegration.createStatus) &&
        Objects.equals(this.createError, whatsAppIntegration.createError) &&
        Objects.equals(this.selfUri, whatsAppIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, phoneNumber, status, recipient, dateCreated, dateModified, createdBy, modifiedBy, version, activationStatusCode, activationErrorInfo, createStatus, createError, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WhatsAppIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    phoneNumber: ").append(toIndentedString(phoneNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    activationStatusCode: ").append(toIndentedString(activationStatusCode)).append("\n");
    sb.append("    activationErrorInfo: ").append(toIndentedString(activationErrorInfo)).append("\n");
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

