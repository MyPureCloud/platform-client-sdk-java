package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AttemptLimitsNotificationRecallEntries;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * AttemptLimitsNotification
 */

public class AttemptLimitsNotification  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Integer maxAttemptsPerContact = null;
  private Integer maxAttemptsPerNumber = null;
  private String timeZoneId = null;

  /**
   * Gets or Sets resetPeriod
   */
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
  private Map<String, AttemptLimitsNotificationRecallEntries> recallEntries = new HashMap<String, AttemptLimitsNotificationRecallEntries>();
  private Boolean breadthFirstRecalls = null;
  private Object additionalProperties = null;

  
  /**
   **/
  public AttemptLimitsNotification id(String id) {
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
  public AttemptLimitsNotification name(String name) {
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
  public AttemptLimitsNotification dateCreated(Date dateCreated) {
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
  public AttemptLimitsNotification dateModified(Date dateModified) {
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
  public AttemptLimitsNotification version(Integer version) {
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
  public AttemptLimitsNotification maxAttemptsPerContact(Integer maxAttemptsPerContact) {
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
  public AttemptLimitsNotification maxAttemptsPerNumber(Integer maxAttemptsPerNumber) {
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
  public AttemptLimitsNotification timeZoneId(String timeZoneId) {
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
  public AttemptLimitsNotification resetPeriod(ResetPeriodEnum resetPeriod) {
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
  public AttemptLimitsNotification recallEntries(Map<String, AttemptLimitsNotificationRecallEntries> recallEntries) {
    this.recallEntries = recallEntries;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("recallEntries")
  public Map<String, AttemptLimitsNotificationRecallEntries> getRecallEntries() {
    return recallEntries;
  }
  public void setRecallEntries(Map<String, AttemptLimitsNotificationRecallEntries> recallEntries) {
    this.recallEntries = recallEntries;
  }

  
  /**
   **/
  public AttemptLimitsNotification breadthFirstRecalls(Boolean breadthFirstRecalls) {
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
  public AttemptLimitsNotification additionalProperties(Object additionalProperties) {
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
    AttemptLimitsNotification attemptLimitsNotification = (AttemptLimitsNotification) o;
    return Objects.equals(this.id, attemptLimitsNotification.id) &&
        Objects.equals(this.name, attemptLimitsNotification.name) &&
        Objects.equals(this.dateCreated, attemptLimitsNotification.dateCreated) &&
        Objects.equals(this.dateModified, attemptLimitsNotification.dateModified) &&
        Objects.equals(this.version, attemptLimitsNotification.version) &&
        Objects.equals(this.maxAttemptsPerContact, attemptLimitsNotification.maxAttemptsPerContact) &&
        Objects.equals(this.maxAttemptsPerNumber, attemptLimitsNotification.maxAttemptsPerNumber) &&
        Objects.equals(this.timeZoneId, attemptLimitsNotification.timeZoneId) &&
        Objects.equals(this.resetPeriod, attemptLimitsNotification.resetPeriod) &&
        Objects.equals(this.recallEntries, attemptLimitsNotification.recallEntries) &&
        Objects.equals(this.breadthFirstRecalls, attemptLimitsNotification.breadthFirstRecalls) &&
        Objects.equals(this.additionalProperties, attemptLimitsNotification.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, maxAttemptsPerContact, maxAttemptsPerNumber, timeZoneId, resetPeriod, recallEntries, breadthFirstRecalls, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttemptLimitsNotification {\n");
    
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

