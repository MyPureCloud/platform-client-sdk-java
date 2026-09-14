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
import com.mypurecloud.sdk.v2.model.WfmTimeSpan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AgentSchedulingPreference
 */

public class AgentSchedulingPreference  implements Serializable {
  
  private String id = null;
  private WfmTimeSpan timeSpan = null;

  private static class PreferenceLevelEnumDeserializer extends StdDeserializer<PreferenceLevelEnum> {
    public PreferenceLevelEnumDeserializer() {
      super(PreferenceLevelEnumDeserializer.class);
    }

    @Override
    public PreferenceLevelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PreferenceLevelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The preference level for this time span
   */
 @JsonDeserialize(using = PreferenceLevelEnumDeserializer.class)
  public enum PreferenceLevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    STRONGLYPREFER("StronglyPrefer"),
    PREFER("Prefer"),
    AVOID("Avoid"),
    STRONGLYAVOID("StronglyAvoid");

    private String value;

    PreferenceLevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PreferenceLevelEnum fromString(String key) {
      if (key == null) return null;

      for (PreferenceLevelEnum value : PreferenceLevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PreferenceLevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PreferenceLevelEnum preferenceLevel = null;

  public AgentSchedulingPreference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgentSchedulingPreference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the scheduling preference")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Exact date, time and length of the scheduling preference time span
   **/
  public AgentSchedulingPreference timeSpan(WfmTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Exact date, time and length of the scheduling preference time span")
  @JsonProperty("timeSpan")
  public WfmTimeSpan getTimeSpan() {
    return timeSpan;
  }
  public void setTimeSpan(WfmTimeSpan timeSpan) {
    this.timeSpan = timeSpan;
  }


  /**
   * The preference level for this time span
   **/
  public AgentSchedulingPreference preferenceLevel(PreferenceLevelEnum preferenceLevel) {
    this.preferenceLevel = preferenceLevel;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The preference level for this time span")
  @JsonProperty("preferenceLevel")
  public PreferenceLevelEnum getPreferenceLevel() {
    return preferenceLevel;
  }
  public void setPreferenceLevel(PreferenceLevelEnum preferenceLevel) {
    this.preferenceLevel = preferenceLevel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgentSchedulingPreference agentSchedulingPreference = (AgentSchedulingPreference) o;

    return Objects.equals(this.id, agentSchedulingPreference.id) &&
            Objects.equals(this.timeSpan, agentSchedulingPreference.timeSpan) &&
            Objects.equals(this.preferenceLevel, agentSchedulingPreference.preferenceLevel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, timeSpan, preferenceLevel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgentSchedulingPreference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    timeSpan: ").append(toIndentedString(timeSpan)).append("\n");
    sb.append("    preferenceLevel: ").append(toIndentedString(preferenceLevel)).append("\n");
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

