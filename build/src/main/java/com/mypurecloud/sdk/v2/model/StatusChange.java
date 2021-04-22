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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * StatusChange
 */

public class StatusChange  implements Serializable {
  
  private Date dateStatusChanged = null;

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
   * The status the change request transitioned to
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

  private static class PreviousStatusEnumDeserializer extends StdDeserializer<PreviousStatusEnum> {
    public PreviousStatusEnumDeserializer() {
      super(PreviousStatusEnumDeserializer.class);
    }

    @Override
    public PreviousStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PreviousStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status the change request transitioned from
   */
 @JsonDeserialize(using = PreviousStatusEnumDeserializer.class)
  public enum PreviousStatusEnum {
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

    PreviousStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PreviousStatusEnum fromString(String key) {
      if (key == null) return null;

      for (PreviousStatusEnum value : PreviousStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PreviousStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PreviousStatusEnum previousStatus = null;
  private String message = null;
  private String changedBy = null;

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

  
  @ApiModelProperty(example = "null", value = "The date of this status change. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStatusChanged")
  public Date getDateStatusChanged() {
    return dateStatusChanged;
  }

  
  @ApiModelProperty(example = "null", value = "The status the change request transitioned to")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "The status the change request transitioned from")
  @JsonProperty("previousStatus")
  public PreviousStatusEnum getPreviousStatus() {
    return previousStatus;
  }

  
  @ApiModelProperty(example = "null", value = "A short message describing the status change")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  
  @ApiModelProperty(example = "null", value = "If applicable, the user who updated the change request to this status")
  @JsonProperty("changedBy")
  public String getChangedBy() {
    return changedBy;
  }

  
  @ApiModelProperty(example = "null", value = "The reason for rejecting the limit override request")
  @JsonProperty("rejectReason")
  public RejectReasonEnum getRejectReason() {
    return rejectReason;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatusChange statusChange = (StatusChange) o;
    return Objects.equals(this.dateStatusChanged, statusChange.dateStatusChanged) &&
        Objects.equals(this.status, statusChange.status) &&
        Objects.equals(this.previousStatus, statusChange.previousStatus) &&
        Objects.equals(this.message, statusChange.message) &&
        Objects.equals(this.changedBy, statusChange.changedBy) &&
        Objects.equals(this.rejectReason, statusChange.rejectReason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateStatusChanged, status, previousStatus, message, changedBy, rejectReason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusChange {\n");
    
    sb.append("    dateStatusChanged: ").append(toIndentedString(dateStatusChanged)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    previousStatus: ").append(toIndentedString(previousStatus)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    changedBy: ").append(toIndentedString(changedBy)).append("\n");
    sb.append("    rejectReason: ").append(toIndentedString(rejectReason)).append("\n");
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

