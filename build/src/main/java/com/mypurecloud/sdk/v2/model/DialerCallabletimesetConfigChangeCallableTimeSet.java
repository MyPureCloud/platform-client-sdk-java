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
  
  private List<DialerCallabletimesetConfigChangeCallableTime> callableTimes = null;
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;

  
  /**
   * The list of callable times
   **/
  public DialerCallabletimesetConfigChangeCallableTimeSet callableTimes(List<DialerCallabletimesetConfigChangeCallableTime> callableTimes) {
    this.callableTimes = callableTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of callable times")
  @JsonProperty("callableTimes")
  public List<DialerCallabletimesetConfigChangeCallableTime> getCallableTimes() {
    return callableTimes;
  }
  public void setCallableTimes(List<DialerCallabletimesetConfigChangeCallableTime> callableTimes) {
    this.callableTimes = callableTimes;
  }


  /**
   * The globally unique identifier for the object.
   **/
  public DialerCallabletimesetConfigChangeCallableTimeSet id(String id) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet name(String name) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet dateCreated(Date dateCreated) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet dateModified(Date dateModified) {
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
  public DialerCallabletimesetConfigChangeCallableTimeSet version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Required for updates, must match the version number of the most recent update")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
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

    return Objects.equals(this.callableTimes, dialerCallabletimesetConfigChangeCallableTimeSet.callableTimes) &&
            Objects.equals(this.id, dialerCallabletimesetConfigChangeCallableTimeSet.id) &&
            Objects.equals(this.name, dialerCallabletimesetConfigChangeCallableTimeSet.name) &&
            Objects.equals(this.dateCreated, dialerCallabletimesetConfigChangeCallableTimeSet.dateCreated) &&
            Objects.equals(this.dateModified, dialerCallabletimesetConfigChangeCallableTimeSet.dateModified) &&
            Objects.equals(this.version, dialerCallabletimesetConfigChangeCallableTimeSet.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callableTimes, id, name, dateCreated, dateModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCallabletimesetConfigChangeCallableTimeSet {\n");
    
    sb.append("    callableTimes: ").append(toIndentedString(callableTimes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

