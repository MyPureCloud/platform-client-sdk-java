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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * DialerAttemptLimitsConfigChangeRecallEntry
 */

public class DialerAttemptLimitsConfigChangeRecallEntry  implements Serializable {
  
  private Long nbrAttempts = null;
  private Long minutesBetweenAttempts = null;
  private Map<String, Object> additionalProperties = null;

  public DialerAttemptLimitsConfigChangeRecallEntry() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The number of recall attempts to make
   **/
  public DialerAttemptLimitsConfigChangeRecallEntry nbrAttempts(Long nbrAttempts) {
    this.nbrAttempts = nbrAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of recall attempts to make")
  @JsonProperty("nbrAttempts")
  public Long getNbrAttempts() {
    return nbrAttempts;
  }
  public void setNbrAttempts(Long nbrAttempts) {
    this.nbrAttempts = nbrAttempts;
  }


  /**
   * How long to wait between recall attempts
   **/
  public DialerAttemptLimitsConfigChangeRecallEntry minutesBetweenAttempts(Long minutesBetweenAttempts) {
    this.minutesBetweenAttempts = minutesBetweenAttempts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How long to wait between recall attempts")
  @JsonProperty("minutesBetweenAttempts")
  public Long getMinutesBetweenAttempts() {
    return minutesBetweenAttempts;
  }
  public void setMinutesBetweenAttempts(Long minutesBetweenAttempts) {
    this.minutesBetweenAttempts = minutesBetweenAttempts;
  }


  /**
   **/
  public DialerAttemptLimitsConfigChangeRecallEntry additionalProperties(Map<String, Object> additionalProperties) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerAttemptLimitsConfigChangeRecallEntry dialerAttemptLimitsConfigChangeRecallEntry = (DialerAttemptLimitsConfigChangeRecallEntry) o;

    return Objects.equals(this.nbrAttempts, dialerAttemptLimitsConfigChangeRecallEntry.nbrAttempts) &&
            Objects.equals(this.minutesBetweenAttempts, dialerAttemptLimitsConfigChangeRecallEntry.minutesBetweenAttempts) &&
            Objects.equals(this.additionalProperties, dialerAttemptLimitsConfigChangeRecallEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nbrAttempts, minutesBetweenAttempts, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerAttemptLimitsConfigChangeRecallEntry {\n");
    
    sb.append("    nbrAttempts: ").append(toIndentedString(nbrAttempts)).append("\n");
    sb.append("    minutesBetweenAttempts: ").append(toIndentedString(minutesBetweenAttempts)).append("\n");
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

