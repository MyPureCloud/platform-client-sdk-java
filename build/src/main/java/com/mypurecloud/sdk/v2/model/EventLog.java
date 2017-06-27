package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.EventMessage;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EventLog
 */

public class EventLog  implements Serializable {
  
  private String id = null;
  private String name = null;
  private UriReference errorEntity = null;
  private UriReference relatedEntity = null;
  private Date timestamp = null;

  /**
   * Gets or Sets level
   */
  public enum LevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INFO("INFO"),
    WARNING("WARNING"),
    ERROR("ERROR");

    private String value;

    LevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LevelEnum fromString(String key) {
      if (key == null) return null;

      for (LevelEnum value : LevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LevelEnum level = null;

  /**
   * Gets or Sets category
   */
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CAMPAIGN("CAMPAIGN"),
    CAMPAIGN_RULE("CAMPAIGN_RULE"),
    IMPORT_ERROR("IMPORT_ERROR"),
    CALLBACK("CALLBACK"),
    CONTACT_LIST_FILTER("CONTACT_LIST_FILTER"),
    SCHEDULE("SCHEDULE"),
    CALL_RESTRICTION("CALL_RESTRICTION"),
    CALL_RULE("CALL_RULE"),
    ORGANIZATION_CONFIGURATION("ORGANIZATION_CONFIGURATION");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private String correlationId = null;
  private EventMessage eventMessage = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public EventLog name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   **/
  public EventLog errorEntity(UriReference errorEntity) {
    this.errorEntity = errorEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errorEntity")
  public UriReference getErrorEntity() {
    return errorEntity;
  }
  public void setErrorEntity(UriReference errorEntity) {
    this.errorEntity = errorEntity;
  }

  
  /**
   **/
  public EventLog relatedEntity(UriReference relatedEntity) {
    this.relatedEntity = relatedEntity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("relatedEntity")
  public UriReference getRelatedEntity() {
    return relatedEntity;
  }
  public void setRelatedEntity(UriReference relatedEntity) {
    this.relatedEntity = relatedEntity;
  }

  
  /**
   * Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ
   **/
  public EventLog timestamp(Date timestamp) {
    this.timestamp = timestamp;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss.SSSZ")
  @JsonProperty("timestamp")
  public Date getTimestamp() {
    return timestamp;
  }
  public void setTimestamp(Date timestamp) {
    this.timestamp = timestamp;
  }

  
  /**
   **/
  public EventLog level(LevelEnum level) {
    this.level = level;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("level")
  public LevelEnum getLevel() {
    return level;
  }
  public void setLevel(LevelEnum level) {
    this.level = level;
  }

  
  /**
   **/
  public EventLog category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   **/
  public EventLog correlationId(String correlationId) {
    this.correlationId = correlationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("correlationId")
  public String getCorrelationId() {
    return correlationId;
  }
  public void setCorrelationId(String correlationId) {
    this.correlationId = correlationId;
  }

  
  /**
   **/
  public EventLog eventMessage(EventMessage eventMessage) {
    this.eventMessage = eventMessage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("eventMessage")
  public EventMessage getEventMessage() {
    return eventMessage;
  }
  public void setEventMessage(EventMessage eventMessage) {
    this.eventMessage = eventMessage;
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
    EventLog eventLog = (EventLog) o;
    return Objects.equals(this.id, eventLog.id) &&
        Objects.equals(this.name, eventLog.name) &&
        Objects.equals(this.errorEntity, eventLog.errorEntity) &&
        Objects.equals(this.relatedEntity, eventLog.relatedEntity) &&
        Objects.equals(this.timestamp, eventLog.timestamp) &&
        Objects.equals(this.level, eventLog.level) &&
        Objects.equals(this.category, eventLog.category) &&
        Objects.equals(this.correlationId, eventLog.correlationId) &&
        Objects.equals(this.eventMessage, eventLog.eventMessage) &&
        Objects.equals(this.selfUri, eventLog.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, errorEntity, relatedEntity, timestamp, level, category, correlationId, eventMessage, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventLog {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    errorEntity: ").append(toIndentedString(errorEntity)).append("\n");
    sb.append("    relatedEntity: ").append(toIndentedString(relatedEntity)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    correlationId: ").append(toIndentedString(correlationId)).append("\n");
    sb.append("    eventMessage: ").append(toIndentedString(eventMessage)).append("\n");
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

