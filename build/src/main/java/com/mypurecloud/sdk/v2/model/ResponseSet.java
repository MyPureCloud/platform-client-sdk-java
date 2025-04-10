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
import com.mypurecloud.sdk.v2.model.Reaction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * ResponseSet
 */

public class ResponseSet  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Integer version = null;
  private Map<String, Reaction> responses = null;
  private Boolean beepDetectionEnabled = null;
  private Boolean amdSpeechDistinguishEnabled = null;

  private static class LiveSpeakerDetectionModeEnumDeserializer extends StdDeserializer<LiveSpeakerDetectionModeEnum> {
    public LiveSpeakerDetectionModeEnumDeserializer() {
      super(LiveSpeakerDetectionModeEnumDeserializer.class);
    }

    @Override
    public LiveSpeakerDetectionModeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return LiveSpeakerDetectionModeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Setting level of live speaker detection based on ringbacks
   */
 @JsonDeserialize(using = LiveSpeakerDetectionModeEnumDeserializer.class)
  public enum LiveSpeakerDetectionModeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DISABLED("Disabled"),
    LOW("Low"),
    MEDIUM("Medium"),
    HIGH("High");

    private String value;

    LiveSpeakerDetectionModeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static LiveSpeakerDetectionModeEnum fromString(String key) {
      if (key == null) return null;

      for (LiveSpeakerDetectionModeEnum value : LiveSpeakerDetectionModeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return LiveSpeakerDetectionModeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private LiveSpeakerDetectionModeEnum liveSpeakerDetectionMode = null;
  private String selfUri = null;

  public ResponseSet() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the ResponseSet.
   **/
  public ResponseSet name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the ResponseSet.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", value = "Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  /**
   * Required for updates, must match the version number of the most recent update
   **/
  public ResponseSet version(Integer version) {
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


  /**
   * Map of disposition identifiers to reactions. For example: {\"disposition.classification.callable.person\": {\"reactionType\": \"transfer\"}}.
   **/
  public ResponseSet responses(Map<String, Reaction> responses) {
    this.responses = responses;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Map of disposition identifiers to reactions. For example: {\"disposition.classification.callable.person\": {\"reactionType\": \"transfer\"}}.")
  @JsonProperty("responses")
  public Map<String, Reaction> getResponses() {
    return responses;
  }
  public void setResponses(Map<String, Reaction> responses) {
    this.responses = responses;
  }


  /**
   * Whether to enable answering machine beep detection
   **/
  public ResponseSet beepDetectionEnabled(Boolean beepDetectionEnabled) {
    this.beepDetectionEnabled = beepDetectionEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enable answering machine beep detection")
  @JsonProperty("beepDetectionEnabled")
  public Boolean getBeepDetectionEnabled() {
    return beepDetectionEnabled;
  }
  public void setBeepDetectionEnabled(Boolean beepDetectionEnabled) {
    this.beepDetectionEnabled = beepDetectionEnabled;
  }


  /**
   * Whether to enable answering machine detection
   **/
  public ResponseSet amdSpeechDistinguishEnabled(Boolean amdSpeechDistinguishEnabled) {
    this.amdSpeechDistinguishEnabled = amdSpeechDistinguishEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether to enable answering machine detection")
  @JsonProperty("amdSpeechDistinguishEnabled")
  public Boolean getAmdSpeechDistinguishEnabled() {
    return amdSpeechDistinguishEnabled;
  }
  public void setAmdSpeechDistinguishEnabled(Boolean amdSpeechDistinguishEnabled) {
    this.amdSpeechDistinguishEnabled = amdSpeechDistinguishEnabled;
  }


  /**
   * Setting level of live speaker detection based on ringbacks
   **/
  public ResponseSet liveSpeakerDetectionMode(LiveSpeakerDetectionModeEnum liveSpeakerDetectionMode) {
    this.liveSpeakerDetectionMode = liveSpeakerDetectionMode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting level of live speaker detection based on ringbacks")
  @JsonProperty("liveSpeakerDetectionMode")
  public LiveSpeakerDetectionModeEnum getLiveSpeakerDetectionMode() {
    return liveSpeakerDetectionMode;
  }
  public void setLiveSpeakerDetectionMode(LiveSpeakerDetectionModeEnum liveSpeakerDetectionMode) {
    this.liveSpeakerDetectionMode = liveSpeakerDetectionMode;
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
    ResponseSet responseSet = (ResponseSet) o;

    return Objects.equals(this.id, responseSet.id) &&
            Objects.equals(this.name, responseSet.name) &&
            Objects.equals(this.dateCreated, responseSet.dateCreated) &&
            Objects.equals(this.dateModified, responseSet.dateModified) &&
            Objects.equals(this.version, responseSet.version) &&
            Objects.equals(this.responses, responseSet.responses) &&
            Objects.equals(this.beepDetectionEnabled, responseSet.beepDetectionEnabled) &&
            Objects.equals(this.amdSpeechDistinguishEnabled, responseSet.amdSpeechDistinguishEnabled) &&
            Objects.equals(this.liveSpeakerDetectionMode, responseSet.liveSpeakerDetectionMode) &&
            Objects.equals(this.selfUri, responseSet.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, dateCreated, dateModified, version, responses, beepDetectionEnabled, amdSpeechDistinguishEnabled, liveSpeakerDetectionMode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    responses: ").append(toIndentedString(responses)).append("\n");
    sb.append("    beepDetectionEnabled: ").append(toIndentedString(beepDetectionEnabled)).append("\n");
    sb.append("    amdSpeechDistinguishEnabled: ").append(toIndentedString(amdSpeechDistinguishEnabled)).append("\n");
    sb.append("    liveSpeakerDetectionMode: ").append(toIndentedString(liveSpeakerDetectionMode)).append("\n");
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

