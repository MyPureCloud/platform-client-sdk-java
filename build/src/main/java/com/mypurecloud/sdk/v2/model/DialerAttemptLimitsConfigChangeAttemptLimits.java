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
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxAttemptsPerContact = null;
  private Integer maxAttemptsPerNumber = null;
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
   * Gets or Sets resetPeriod
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
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits name(String name) {
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
  public DialerAttemptLimitsConfigChangeAttemptLimits dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits maxAttemptsPerContact(Integer maxAttemptsPerContact) {
    this.maxAttemptsPerContact = maxAttemptsPerContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxAttemptsPerContact")
  public Integer getMaxAttemptsPerContact() {
    return maxAttemptsPerContact;
  }
  public void setMaxAttemptsPerContact(Integer maxAttemptsPerContact) {
    this.maxAttemptsPerContact = maxAttemptsPerContact;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits maxAttemptsPerNumber(Integer maxAttemptsPerNumber) {
    this.maxAttemptsPerNumber = maxAttemptsPerNumber;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("maxAttemptsPerNumber")
  public Integer getMaxAttemptsPerNumber() {
    return maxAttemptsPerNumber;
  }
  public void setMaxAttemptsPerNumber(Integer maxAttemptsPerNumber) {
    this.maxAttemptsPerNumber = maxAttemptsPerNumber;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits timeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("timeZoneId")
  public String getTimeZoneId() {
    return timeZoneId;
  }
  public void setTimeZoneId(String timeZoneId) {
    this.timeZoneId = timeZoneId;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits resetPeriod(ResetPeriodEnum resetPeriod) {
    this.resetPeriod = resetPeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("resetPeriod")
  public ResetPeriodEnum getResetPeriod() {
    return resetPeriod;
  }
  public void setResetPeriod(ResetPeriodEnum resetPeriod) {
    this.resetPeriod = resetPeriod;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits recallEntries(Map<String, DialerAttemptLimitsConfigChangeRecallEntry> recallEntries) {
    this.recallEntries = recallEntries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recallEntries")
  public Map<String, DialerAttemptLimitsConfigChangeRecallEntry> getRecallEntries() {
    return recallEntries;
  }
  public void setRecallEntries(Map<String, DialerAttemptLimitsConfigChangeRecallEntry> recallEntries) {
    this.recallEntries = recallEntries;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits breadthFirstRecalls(Boolean breadthFirstRecalls) {
    this.breadthFirstRecalls = breadthFirstRecalls;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("breadthFirstRecalls")
  public Boolean getBreadthFirstRecalls() {
    return breadthFirstRecalls;
  }
  public void setBreadthFirstRecalls(Boolean breadthFirstRecalls) {
    this.breadthFirstRecalls = breadthFirstRecalls;
  }

  
  /**
   **/
  public DialerAttemptLimitsConfigChangeAttemptLimits additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
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
    return Objects.equals(this.id, dialerAttemptLimitsConfigChangeAttemptLimits.id) &&
        Objects.equals(this.name, dialerAttemptLimitsConfigChangeAttemptLimits.name) &&
        Objects.equals(this.dateCreated, dialerAttemptLimitsConfigChangeAttemptLimits.dateCreated) &&
        Objects.equals(this.dateModified, dialerAttemptLimitsConfigChangeAttemptLimits.dateModified) &&
        Objects.equals(this.version, dialerAttemptLimitsConfigChangeAttemptLimits.version) &&
        Objects.equals(this.maxAttemptsPerContact, dialerAttemptLimitsConfigChangeAttemptLimits.maxAttemptsPerContact) &&
        Objects.equals(this.maxAttemptsPerNumber, dialerAttemptLimitsConfigChangeAttemptLimits.maxAttemptsPerNumber) &&
        Objects.equals(this.timeZoneId, dialerAttemptLimitsConfigChangeAttemptLimits.timeZoneId) &&
        Objects.equals(this.resetPeriod, dialerAttemptLimitsConfigChangeAttemptLimits.resetPeriod) &&
        Objects.equals(this.recallEntries, dialerAttemptLimitsConfigChangeAttemptLimits.recallEntries) &&
        Objects.equals(this.breadthFirstRecalls, dialerAttemptLimitsConfigChangeAttemptLimits.breadthFirstRecalls) &&
        Objects.equals(this.additionalProperties, dialerAttemptLimitsConfigChangeAttemptLimits.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxAttemptsPerContact, maxAttemptsPerNumber, timeZoneId, resetPeriod, recallEntries, breadthFirstRecalls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAttemptLimitsConfigChangeAttemptLimits {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    maxAttemptsPerContact: ").append(toIndentedString(maxAttemptsPerContact)).append("\n");
    sb.append("    maxAttemptsPerNumber: ").append(toIndentedString(maxAttemptsPerNumber)).append("\n");
    sb.append("    timeZoneId: ").append(toIndentedString(timeZoneId)).append("\n");
    sb.append("    resetPeriod: ").append(toIndentedString(resetPeriod)).append("\n");
    sb.append("    recallEntries: ").append(toIndentedString(recallEntries)).append("\n");
    sb.append("    breadthFirstRecalls: ").append(toIndentedString(breadthFirstRecalls)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

