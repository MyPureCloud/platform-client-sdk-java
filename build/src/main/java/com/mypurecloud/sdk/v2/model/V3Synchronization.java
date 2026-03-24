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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import com.mypurecloud.sdk.v2.model.V3SynchronizationStatistics;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * V3Synchronization
 */

public class V3Synchronization  implements Serializable {
  
  private String id = null;

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
   * The type of the synchronization.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCREMENTAL("Incremental"),
    FULL("Full");

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
  private UserReference createdBy = null;
  private V3SourceRef source = null;
  private Date dateStart = null;
  private Date dateEnd = null;
  private Date dateSourceIntervalStart = null;
  private Date dateSourceIntervalEnd = null;

  private static class TriggerTypeEnumDeserializer extends StdDeserializer<TriggerTypeEnum> {
    public TriggerTypeEnumDeserializer() {
      super(TriggerTypeEnumDeserializer.class);
    }

    @Override
    public TriggerTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TriggerTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The trigger type of the synchronization.
   */
 @JsonDeserialize(using = TriggerTypeEnumDeserializer.class)
  public enum TriggerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    MANUAL("Manual"),
    UNKNOWN("Unknown");

    private String value;

    TriggerTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TriggerTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TriggerTypeEnum value : TriggerTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TriggerTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TriggerTypeEnum triggerType = null;

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
   * The status of the synchronization.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INQUEUE("InQueue"),
    INPROGRESS("InProgress"),
    POSTPROCESSING("PostProcessing"),
    COMPLETED("Completed"),
    FAILED("Failed"),
    UNKNOWN("Unknown");

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
  private V3SynchronizationStatistics statistics = null;
  private ErrorBody error = null;

  private static class IngestionStatusEnumDeserializer extends StdDeserializer<IngestionStatusEnum> {
    public IngestionStatusEnumDeserializer() {
      super(IngestionStatusEnumDeserializer.class);
    }

    @Override
    public IngestionStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IngestionStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the ingestion.
   */
 @JsonDeserialize(using = IngestionStatusEnumDeserializer.class)
  public enum IngestionStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    INQUEUE("InQueue"),
    STARTING("Starting"),
    INPROGRESS("InProgress"),
    COMPLETE("Complete"),
    FAILED("Failed"),
    STOPPING("Stopping"),
    STOPPED("Stopped");

    private String value;

    IngestionStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IngestionStatusEnum fromString(String key) {
      if (key == null) return null;

      for (IngestionStatusEnum value : IngestionStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IngestionStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IngestionStatusEnum ingestionStatus = null;
  private String selfUri = null;

  public V3Synchronization() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The type of the synchronization.
   **/
  public V3Synchronization type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the synchronization.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The user who started the synchronization if the source is manually synchronized or the user who created the source for scheduled synchronization.
   **/
  public V3Synchronization createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who started the synchronization if the source is manually synchronized or the user who created the source for scheduled synchronization.")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The source of the synchronization.
   **/
  public V3Synchronization source(V3SourceRef source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source of the synchronization.")
  @JsonProperty("source")
  public V3SourceRef getSource() {
    return source;
  }
  public void setSource(V3SourceRef source) {
    this.source = source;
  }


  /**
   * The start time of the synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3Synchronization dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The end time of the synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3Synchronization dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of the synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * The start time of the interval to be synchronized from the source. Source item changes during that interval are included in this synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3Synchronization dateSourceIntervalStart(Date dateSourceIntervalStart) {
    this.dateSourceIntervalStart = dateSourceIntervalStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the interval to be synchronized from the source. Source item changes during that interval are included in this synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSourceIntervalStart")
  public Date getDateSourceIntervalStart() {
    return dateSourceIntervalStart;
  }
  public void setDateSourceIntervalStart(Date dateSourceIntervalStart) {
    this.dateSourceIntervalStart = dateSourceIntervalStart;
  }


  /**
   * The end time of the interval to be synchronized from the source. Source item changes during that interval are included in this synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3Synchronization dateSourceIntervalEnd(Date dateSourceIntervalEnd) {
    this.dateSourceIntervalEnd = dateSourceIntervalEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The end time of the interval to be synchronized from the source. Source item changes during that interval are included in this synchronization. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSourceIntervalEnd")
  public Date getDateSourceIntervalEnd() {
    return dateSourceIntervalEnd;
  }
  public void setDateSourceIntervalEnd(Date dateSourceIntervalEnd) {
    this.dateSourceIntervalEnd = dateSourceIntervalEnd;
  }


  /**
   * The trigger type of the synchronization.
   **/
  public V3Synchronization triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The trigger type of the synchronization.")
  @JsonProperty("triggerType")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }
  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }


  /**
   * The status of the synchronization.
   **/
  public V3Synchronization status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the synchronization.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Statistics of the synchronization.
   **/
  public V3Synchronization statistics(V3SynchronizationStatistics statistics) {
    this.statistics = statistics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Statistics of the synchronization.")
  @JsonProperty("statistics")
  public V3SynchronizationStatistics getStatistics() {
    return statistics;
  }
  public void setStatistics(V3SynchronizationStatistics statistics) {
    this.statistics = statistics;
  }


  /**
   * The error that occurred during the synchronization.
   **/
  public V3Synchronization error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error that occurred during the synchronization.")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  /**
   * The status of the ingestion.
   **/
  public V3Synchronization ingestionStatus(IngestionStatusEnum ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the ingestion.")
  @JsonProperty("ingestionStatus")
  public IngestionStatusEnum getIngestionStatus() {
    return ingestionStatus;
  }
  public void setIngestionStatus(IngestionStatusEnum ingestionStatus) {
    this.ingestionStatus = ingestionStatus;
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
    V3Synchronization v3Synchronization = (V3Synchronization) o;

    return Objects.equals(this.id, v3Synchronization.id) &&
            Objects.equals(this.type, v3Synchronization.type) &&
            Objects.equals(this.createdBy, v3Synchronization.createdBy) &&
            Objects.equals(this.source, v3Synchronization.source) &&
            Objects.equals(this.dateStart, v3Synchronization.dateStart) &&
            Objects.equals(this.dateEnd, v3Synchronization.dateEnd) &&
            Objects.equals(this.dateSourceIntervalStart, v3Synchronization.dateSourceIntervalStart) &&
            Objects.equals(this.dateSourceIntervalEnd, v3Synchronization.dateSourceIntervalEnd) &&
            Objects.equals(this.triggerType, v3Synchronization.triggerType) &&
            Objects.equals(this.status, v3Synchronization.status) &&
            Objects.equals(this.statistics, v3Synchronization.statistics) &&
            Objects.equals(this.error, v3Synchronization.error) &&
            Objects.equals(this.ingestionStatus, v3Synchronization.ingestionStatus) &&
            Objects.equals(this.selfUri, v3Synchronization.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, createdBy, source, dateStart, dateEnd, dateSourceIntervalStart, dateSourceIntervalEnd, triggerType, status, statistics, error, ingestionStatus, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3Synchronization {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    dateSourceIntervalStart: ").append(toIndentedString(dateSourceIntervalStart)).append("\n");
    sb.append("    dateSourceIntervalEnd: ").append(toIndentedString(dateSourceIntervalEnd)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    ingestionStatus: ").append(toIndentedString(ingestionStatus)).append("\n");
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

