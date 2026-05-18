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
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.V3SourceFilter;
import com.mypurecloud.sdk.v2.model.V3SourceFilterDetails;
import com.mypurecloud.sdk.v2.model.V3SourceLastSynchronization;
import com.mypurecloud.sdk.v2.model.V3SourceScheduleSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * V3SourceDetailedResponse
 */

public class V3SourceDetailedResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String connectionId = null;

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
   * The type of the source.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SHAREPOINT("Sharepoint"),
    FILEUPLOAD("FileUpload");

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
   * The trigger type of the source.
   */
 @JsonDeserialize(using = TriggerTypeEnumDeserializer.class)
  public enum TriggerTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    MANUAL("Manual");

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
   * The current status of the source.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    ERRORED("Errored"),
    DELETED("Deleted");

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
  private UserReference createdBy = null;
  private UserReference modifiedBy = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private V3SourceLastSynchronization lastSync = null;
  private V3SourceScheduleSettings scheduleSettings = null;
  private V3SourceFilter filters = null;
  private V3SourceFilterDetails filterDetails = null;
  private String selfUri = null;

  public V3SourceDetailedResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V3SourceDetailedResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the source.
   **/
  public V3SourceDetailedResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the source.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The connectionId of the source.
   **/
  public V3SourceDetailedResponse connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The connectionId of the source.")
  @JsonProperty("connectionId")
  public String getConnectionId() {
    return connectionId;
  }
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  /**
   * The type of the source.
   **/
  public V3SourceDetailedResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the source.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The trigger type of the source.
   **/
  public V3SourceDetailedResponse triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The trigger type of the source.")
  @JsonProperty("triggerType")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }
  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }


  /**
   * The current status of the source.
   **/
  public V3SourceDetailedResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current status of the source.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The user who created the source.
   **/
  public V3SourceDetailedResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who created the source.")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The user who modified the document.
   **/
  public V3SourceDetailedResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user who modified the document.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * Source creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3SourceDetailedResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source creation date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Source last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public V3SourceDetailedResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Source last modification date-time. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The last synchronization of the source.
   **/
  public V3SourceDetailedResponse lastSync(V3SourceLastSynchronization lastSync) {
    this.lastSync = lastSync;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The last synchronization of the source.")
  @JsonProperty("lastSync")
  public V3SourceLastSynchronization getLastSync() {
    return lastSync;
  }
  public void setLastSync(V3SourceLastSynchronization lastSync) {
    this.lastSync = lastSync;
  }


  /**
   * Settings that determine when the source starts a sync.
   **/
  public V3SourceDetailedResponse scheduleSettings(V3SourceScheduleSettings scheduleSettings) {
    this.scheduleSettings = scheduleSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings that determine when the source starts a sync.")
  @JsonProperty("scheduleSettings")
  public V3SourceScheduleSettings getScheduleSettings() {
    return scheduleSettings;
  }
  public void setScheduleSettings(V3SourceScheduleSettings scheduleSettings) {
    this.scheduleSettings = scheduleSettings;
  }


  /**
   * Filters that determine what documents are synced.
   **/
  public V3SourceDetailedResponse filters(V3SourceFilter filters) {
    this.filters = filters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filters that determine what documents are synced.")
  @JsonProperty("filters")
  public V3SourceFilter getFilters() {
    return filters;
  }
  public void setFilters(V3SourceFilter filters) {
    this.filters = filters;
  }


  /**
   * Additional details to the source's filters.
   **/
  public V3SourceDetailedResponse filterDetails(V3SourceFilterDetails filterDetails) {
    this.filterDetails = filterDetails;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional details to the source's filters.")
  @JsonProperty("filterDetails")
  public V3SourceFilterDetails getFilterDetails() {
    return filterDetails;
  }
  public void setFilterDetails(V3SourceFilterDetails filterDetails) {
    this.filterDetails = filterDetails;
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
    V3SourceDetailedResponse v3SourceDetailedResponse = (V3SourceDetailedResponse) o;

    return Objects.equals(this.id, v3SourceDetailedResponse.id) &&
            Objects.equals(this.name, v3SourceDetailedResponse.name) &&
            Objects.equals(this.connectionId, v3SourceDetailedResponse.connectionId) &&
            Objects.equals(this.type, v3SourceDetailedResponse.type) &&
            Objects.equals(this.triggerType, v3SourceDetailedResponse.triggerType) &&
            Objects.equals(this.status, v3SourceDetailedResponse.status) &&
            Objects.equals(this.createdBy, v3SourceDetailedResponse.createdBy) &&
            Objects.equals(this.modifiedBy, v3SourceDetailedResponse.modifiedBy) &&
            Objects.equals(this.dateCreated, v3SourceDetailedResponse.dateCreated) &&
            Objects.equals(this.dateModified, v3SourceDetailedResponse.dateModified) &&
            Objects.equals(this.lastSync, v3SourceDetailedResponse.lastSync) &&
            Objects.equals(this.scheduleSettings, v3SourceDetailedResponse.scheduleSettings) &&
            Objects.equals(this.filters, v3SourceDetailedResponse.filters) &&
            Objects.equals(this.filterDetails, v3SourceDetailedResponse.filterDetails) &&
            Objects.equals(this.selfUri, v3SourceDetailedResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, connectionId, type, triggerType, status, createdBy, modifiedBy, dateCreated, dateModified, lastSync, scheduleSettings, filters, filterDetails, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceDetailedResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    lastSync: ").append(toIndentedString(lastSync)).append("\n");
    sb.append("    scheduleSettings: ").append(toIndentedString(scheduleSettings)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    filterDetails: ").append(toIndentedString(filterDetails)).append("\n");
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

