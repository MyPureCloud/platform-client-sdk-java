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
import com.mypurecloud.sdk.v2.model.V3SourceFilter;
import com.mypurecloud.sdk.v2.model.V3SourceScheduleSettings;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * V3SourceCreateRequest
 */

public class V3SourceCreateRequest  implements Serializable {
  
  private String name = null;

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
   * The type of the source. Required if connectionId is not specified, inherits the connection type otherwise.
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
  private String connectionId = null;

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
   * The trigger type of the source. Default is Manual.
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
  private V3SourceScheduleSettings scheduleSettings = null;
  private V3SourceFilter filters = null;

  public V3SourceCreateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the source.
   **/
  public V3SourceCreateRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the source.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The type of the source. Required if connectionId is not specified, inherits the connection type otherwise.
   **/
  public V3SourceCreateRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the source. Required if connectionId is not specified, inherits the connection type otherwise.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The id of the connection related to the source. Required if type is Sharepoint.
   **/
  public V3SourceCreateRequest connectionId(String connectionId) {
    this.connectionId = connectionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the connection related to the source. Required if type is Sharepoint.")
  @JsonProperty("connectionId")
  public String getConnectionId() {
    return connectionId;
  }
  public void setConnectionId(String connectionId) {
    this.connectionId = connectionId;
  }


  /**
   * The trigger type of the source. Default is Manual.
   **/
  public V3SourceCreateRequest triggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The trigger type of the source. Default is Manual.")
  @JsonProperty("triggerType")
  public TriggerTypeEnum getTriggerType() {
    return triggerType;
  }
  public void setTriggerType(TriggerTypeEnum triggerType) {
    this.triggerType = triggerType;
  }


  /**
   * Settings that determine when the source starts a sync. Required if triggerType is Scheduled.
   **/
  public V3SourceCreateRequest scheduleSettings(V3SourceScheduleSettings scheduleSettings) {
    this.scheduleSettings = scheduleSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Settings that determine when the source starts a sync. Required if triggerType is Scheduled.")
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
  public V3SourceCreateRequest filters(V3SourceFilter filters) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V3SourceCreateRequest v3SourceCreateRequest = (V3SourceCreateRequest) o;

    return Objects.equals(this.name, v3SourceCreateRequest.name) &&
            Objects.equals(this.type, v3SourceCreateRequest.type) &&
            Objects.equals(this.connectionId, v3SourceCreateRequest.connectionId) &&
            Objects.equals(this.triggerType, v3SourceCreateRequest.triggerType) &&
            Objects.equals(this.scheduleSettings, v3SourceCreateRequest.scheduleSettings) &&
            Objects.equals(this.filters, v3SourceCreateRequest.filters);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, connectionId, triggerType, scheduleSettings, filters);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V3SourceCreateRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
    sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
    sb.append("    scheduleSettings: ").append(toIndentedString(scheduleSettings)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
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

