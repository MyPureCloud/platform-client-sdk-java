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
import com.mypurecloud.sdk.v2.model.DialerAttemptLimitsConfigChangeRecallEntry;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerAttemptLimitsConfigChangeAttemptLimits
 */

public class DialerAttemptLimitsConfigChangeAttemptLimits  implements Serializable {
  
  private Long maxAttemptsPerContact = null;
  private Long maxAttemptsPerNumber = null;
  private String timeZoneId = null;

  private static class ResetPeriodEnumDeserializer extends StdDeserializer<ResetPeriodEnum> {
    public ResetPeriodEnumDeserializer() {
      super(ResetPeriodEnumDeserializer.class);
    }

    @Override
    public ResetPeriodEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResetPeriodEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * After how long the number of attempts will be set back to 0
   */
 @JsonDeserialize(using = ResetPeriodEnumDeserializer.class)
  public enum ResetPeriodEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NEVER("NEVER"),
    TODAY("TODAY");

    private String value;

    ResetPeriodEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResetPeriodEnum fromString(String key) {
      if (key == null) return null;

      for (ResetPeriodEnum value : ResetPeriodEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResetPeriodEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResetPeriodEnum resetPeriod = null;
  private Map<String, DialerAttemptLimitsConfigChangeRecallEntry> recallEntries = null;
  private Boolean breadthFirstRecalls = null;
  private Map<String, Object> additionalProperties = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Long version = null;
  private Map<String, Object> getAdditionalProperties = null;

  public DialerAttemptLimitsConfigChangeAttemptLimits() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits maxAttemptsPerContact(Long maxAttemptsPerContact) {
    this.maxAttemptsPerContact = maxAttemptsPerContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxAttemptsPerContact")
  public Long getMaxAttemptsPerContact() {
    return maxAttemptsPerContact;
  }
  public void setMaxAttemptsPerContact(Long maxAttemptsPerContact) {
    this.maxAttemptsPerContact = maxAttemptsPerContact;
  }


  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits maxAttemptsPerNumber(Long maxAttemptsPerNumber) {
    this.maxAttemptsPerNumber = maxAttemptsPerNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxAttemptsPerNumber")
  public Long getMaxAttemptsPerNumber() {
    return maxAttemptsPerNumber;
  }
  public void setMaxAttemptsPerNumber(Long maxAttemptsPerNumber) {
    this.maxAttemptsPerNumber = maxAttemptsPerNumber;
  }


  /**
   * The timezone is necessary to define when \"today\" starts and ends
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timezone is necessary to define when \"today\" starts and ends")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }


  /**
   * After how long the number of attempts will be set back to 0
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits resetPeriod(ResetPeriodEnum resetPeriod) {
    this.resetPeriod = resetPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "After how long the number of attempts will be set back to 0")
  @JsonProperty("resetPeriod")
  public ResetPeriodEnum getResetPeriod() {
    return resetPeriod;
  }
  public void setResetPeriod(ResetPeriodEnum resetPeriod) {
    this.resetPeriod = resetPeriod;
  }


  /**
   * Configuration for recall attempts
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits recallEntries(Map<String, DialerAttemptLimitsConfigChangeRecallEntry> recallEntries) {
    this.recallEntries = recallEntries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Configuration for recall attempts")
  @JsonProperty("recallEntries")
  public Map<String, DialerAttemptLimitsConfigChangeRecallEntry> getRecallEntries() {
    return recallEntries;
  }
  public void setRecallEntries(Map<String, DialerAttemptLimitsConfigChangeRecallEntry> recallEntries) {
    this.recallEntries = recallEntries;
  }


  /**
   * Whether recalls are performed before considering other numbers (true) or after (false)
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits breadthFirstRecalls(Boolean breadthFirstRecalls) {
    this.breadthFirstRecalls = breadthFirstRecalls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether recalls are performed before considering other numbers (true) or after (false)")
  @JsonProperty("breadthFirstRecalls")
  public Boolean getBreadthFirstRecalls() {
    return breadthFirstRecalls;
  }
  public void setBreadthFirstRecalls(Boolean breadthFirstRecalls) {
    this.breadthFirstRecalls = breadthFirstRecalls;
  }


  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The UI-visible name of the object
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The UI-visible name of the object")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Creation time of the entity
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Creation time of the entity")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Last modified time of the entity
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Last modified time of the entity")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits version(Long version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Long getVersion() {
    return version;
  }
  public void setVersion(Long version) {
    this.version = version;
  }


  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits getAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("getAdditionalProperties")
  public Map<String, Object> getGetAdditionalProperties() {
    return getAdditionalProperties;
  }
  public void setGetAdditionalProperties(Map<String, Object> getAdditionalProperties) {
    this.getAdditionalProperties = getAdditionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerAttemptLimitsConfigChangeAttemptLimits dialerAttemptLimitsConfigChangeAttemptLimits = (DialerAttemptLimitsConfigChangeAttemptLimits) o;

    return Objects.equals(this.maxAttemptsPerContact, dialerAttemptLimitsConfigChangeAttemptLimits.maxAttemptsPerContact) &&
            Objects.equals(this.maxAttemptsPerNumber, dialerAttemptLimitsConfigChangeAttemptLimits.maxAttemptsPerNumber) &&
            Objects.equals(this.timeZoneId, dialerAttemptLimitsConfigChangeAttemptLimits.timeZoneId) &&
            Objects.equals(this.resetPeriod, dialerAttemptLimitsConfigChangeAttemptLimits.resetPeriod) &&
            Objects.equals(this.recallEntries, dialerAttemptLimitsConfigChangeAttemptLimits.recallEntries) &&
            Objects.equals(this.breadthFirstRecalls, dialerAttemptLimitsConfigChangeAttemptLimits.breadthFirstRecalls) &&
            Objects.equals(this.additionalProperties, dialerAttemptLimitsConfigChangeAttemptLimits.additionalProperties) &&
            Objects.equals(this.id, dialerAttemptLimitsConfigChangeAttemptLimits.id) &&
            Objects.equals(this.name, dialerAttemptLimitsConfigChangeAttemptLimits.name) &&
            Objects.equals(this.dateCreated, dialerAttemptLimitsConfigChangeAttemptLimits.dateCreated) &&
            Objects.equals(this.dateModified, dialerAttemptLimitsConfigChangeAttemptLimits.dateModified) &&
            Objects.equals(this.version, dialerAttemptLimitsConfigChangeAttemptLimits.version) &&
            Objects.equals(this.getAdditionalProperties, dialerAttemptLimitsConfigChangeAttemptLimits.getAdditionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxAttemptsPerContact, maxAttemptsPerNumber, timeZoneId, resetPeriod, recallEntries, breadthFirstRecalls, additionalProperties, id, name, dateCreated, dateModified, version, getAdditionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAttemptLimitsConfigChangeAttemptLimits {\n");
    
    sb.append("    maxAttemptsPerContact: ").append(toIndentedString(maxAttemptsPerContact)).append("\n");
    sb.append("    maxAttemptsPerNumber: ").append(toIndentedString(maxAttemptsPerNumber)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    resetPeriod: ").append(toIndentedString(resetPeriod)).append("\n");
    sb.append("    recallEntries: ").append(toIndentedString(recallEntries)).append("\n");
    sb.append("    breadthFirstRecalls: ").append(toIndentedString(breadthFirstRecalls)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    getAdditionalProperties: ").append(toIndentedString(getAdditionalProperties)).append("\n");
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

