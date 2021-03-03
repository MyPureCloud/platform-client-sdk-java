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
import com.mypurecloud.sdk.v2.model.DialerCallabletimesetConfigChangeCallableTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCallabletimesetConfigChangeCallableTimeSet
 */

public class DialerCallabletimesetConfigChangeCallableTimeSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private List<DialerCallabletimesetConfigChangeCallableTime> callableTimes = new ArrayList<DialerCallabletimesetConfigChangeCallableTime>();
  private Object additionalProperties = null;

  
  /**
   **/
  public DialerCallabletimesetConfigChangeCallableTimeSet id(String id) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet name(String name) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet dateCreated(Date dateCreated) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet dateModified(Date dateModified) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet version(Integer version) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet callableTimes(List<DialerCallabletimesetConfigChangeCallableTime> callableTimes) {
    this.callableTimes = callableTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("callableTimes")
  public List<DialerCallabletimesetConfigChangeCallableTime> getCallableTimes() {
    return callableTimes;
  }
  public void setCallableTimes(List<DialerCallabletimesetConfigChangeCallableTime> callableTimes) {
    this.callableTimes = callableTimes;
  }

  
  /**
   **/
  public DialerCallabletimesetConfigChangeCallableTimeSet additionalProperties(Object additionalProperties) {
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
    DialerCallabletimesetConfigChangeCallableTimeSet dialerCallabletimesetConfigChangeCallableTimeSet = (DialerCallabletimesetConfigChangeCallableTimeSet) o;
    return Objects.equals(this.id, dialerCallabletimesetConfigChangeCallableTimeSet.id) &&
        Objects.equals(this.name, dialerCallabletimesetConfigChangeCallableTimeSet.name) &&
        Objects.equals(this.dateCreated, dialerCallabletimesetConfigChangeCallableTimeSet.dateCreated) &&
        Objects.equals(this.dateModified, dialerCallabletimesetConfigChangeCallableTimeSet.dateModified) &&
        Objects.equals(this.version, dialerCallabletimesetConfigChangeCallableTimeSet.version) &&
        Objects.equals(this.callableTimes, dialerCallabletimesetConfigChangeCallableTimeSet.callableTimes) &&
        Objects.equals(this.additionalProperties, dialerCallabletimesetConfigChangeCallableTimeSet.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, callableTimes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCallabletimesetConfigChangeCallableTimeSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    callableTimes: ").append(toIndentedString(callableTimes)).append("\n");
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

