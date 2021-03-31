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
 * HistoricalImportStatus
 */

public class HistoricalImportStatus  implements Serializable {
  
  private String requestId = null;
  private Date dateImportEnded = null;
  private Date dateImportStarted = null;

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
   * Status of the historical import in the organization.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATED("Initiated"),
    INPROGRESS("InProgress"),
    PENDING("Pending"),
    SUCCESS("Success"),
    FAILED("Failed"),
    CANCELLED("Cancelled"),
    PURGED("Purged"),
    PURGEPENDING("PurgePending");

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
  private String error = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Boolean active = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether this historical import is of type csv or json
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CSV("Csv"),
    JSON("Json");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  
  @ApiModelProperty(example = "null", value = "Request id of the historical import in the organization")
  @JsonProperty("requestId")
  public String getRequestId() {
    return requestId;
  }

  
  @ApiModelProperty(example = "null", value = "The last day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateImportEnded")
  public Date getDateImportEnded() {
    return dateImportEnded;
  }

  
  @ApiModelProperty(example = "null", value = "The first day of the data you are importing. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateImportStarted")
  public Date getDateImportStarted() {
    return dateImportStarted;
  }

  
  @ApiModelProperty(example = "null", value = "Status of the historical import in the organization.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  @ApiModelProperty(example = "null", value = "Error occured if the status of the import is failed")
  @JsonProperty("error")
  public String getError() {
    return error;
  }

  
  @ApiModelProperty(example = "null", value = "Date in which the historical import is initiated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Date in which the historical import is modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  @ApiModelProperty(example = "null", value = "Whether this historical import is active or not")
  @JsonProperty("active")
  public Boolean getActive() {
    return active;
  }

  
  @ApiModelProperty(example = "null", value = "Whether this historical import is of type csv or json")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HistoricalImportStatus historicalImportStatus = (HistoricalImportStatus) o;
    return Objects.equals(this.requestId, historicalImportStatus.requestId) &&
        Objects.equals(this.dateImportEnded, historicalImportStatus.dateImportEnded) &&
        Objects.equals(this.dateImportStarted, historicalImportStatus.dateImportStarted) &&
        Objects.equals(this.status, historicalImportStatus.status) &&
        Objects.equals(this.error, historicalImportStatus.error) &&
        Objects.equals(this.dateCreated, historicalImportStatus.dateCreated) &&
        Objects.equals(this.dateModified, historicalImportStatus.dateModified) &&
        Objects.equals(this.active, historicalImportStatus.active) &&
        Objects.equals(this.type, historicalImportStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, dateImportEnded, dateImportStarted, status, error, dateCreated, dateModified, active, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HistoricalImportStatus {\n");
    
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    dateImportEnded: ").append(toIndentedString(dateImportEnded)).append("\n");
    sb.append("    dateImportStarted: ").append(toIndentedString(dateImportStarted)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

