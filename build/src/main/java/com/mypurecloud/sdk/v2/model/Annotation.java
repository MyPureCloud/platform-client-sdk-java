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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Annotation
 */

public class Annotation  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String type = null;
  private Long location = null;
  private Long durationMs = null;
  private Long absoluteLocation = null;
  private Long absoluteDurationMs = null;
  private Long recordingLocation = null;
  private Long recordingDurationMs = null;
  private User user = null;
  private String description = null;

  private static class ReasonEnumDeserializer extends StdDeserializer<ReasonEnum> {
    public ReasonEnumDeserializer() {
      super(ReasonEnumDeserializer.class);
    }

    @Override
    public ReasonEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReasonEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Reason for a pause annotation. Valid values: Hold,SecurePause,FlowOrQueue,Pause
   */
 @JsonDeserialize(using = ReasonEnumDeserializer.class)
  public enum ReasonEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HOLD("Hold"),
    SECUREPAUSE("SecurePause"),
    FLOWORQUEUE("FlowOrQueue"),
    PAUSE("Pause");

    private String value;

    ReasonEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReasonEnum fromString(String key) {
      if (key == null) return null;

      for (ReasonEnum value : ReasonEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReasonEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReasonEnum reason = null;
  private List<Annotation> annotations = new ArrayList<Annotation>();
  private Long realtimeLocation = null;
  private String selfUri = null;

  
  /**
   * Annotation id. All pause annotations on a recording will share an ID value, bookmark annotations will have unique IDs, and hold annotations will have randomly generated UUIDs (i.e. the ID will change at each request).
   **/
  public Annotation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Annotation id. All pause annotations on a recording will share an ID value, bookmark annotations will have unique IDs, and hold annotations will have randomly generated UUIDs (i.e. the ID will change at each request).")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public Annotation name(String name) {
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
  public Annotation type(String type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }
  public void setType(String type) {
    this.type = type;
  }


  /**
   * Offset of annotation in milliseconds.
   **/
  public Annotation location(Long location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Offset of annotation in milliseconds.")
  @JsonProperty("location")
  public Long getLocation() {
    return location;
  }
  public void setLocation(Long location) {
    this.location = location;
  }


  /**
   * Duration of annotation in milliseconds.
   **/
  public Annotation durationMs(Long durationMs) {
    this.durationMs = durationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of annotation in milliseconds.")
  @JsonProperty("durationMs")
  public Long getDurationMs() {
    return durationMs;
  }
  public void setDurationMs(Long durationMs) {
    this.durationMs = durationMs;
  }


  /**
   * Offset of annotation (milliseconds) from start of recording (after removing the cumulative duration of all pauses).
   **/
  public Annotation absoluteLocation(Long absoluteLocation) {
    this.absoluteLocation = absoluteLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Offset of annotation (milliseconds) from start of recording (after removing the cumulative duration of all pauses).")
  @JsonProperty("absoluteLocation")
  public Long getAbsoluteLocation() {
    return absoluteLocation;
  }
  public void setAbsoluteLocation(Long absoluteLocation) {
    this.absoluteLocation = absoluteLocation;
  }


  /**
   * Duration of annotation (milliseconds).
   **/
  public Annotation absoluteDurationMs(Long absoluteDurationMs) {
    this.absoluteDurationMs = absoluteDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of annotation (milliseconds).")
  @JsonProperty("absoluteDurationMs")
  public Long getAbsoluteDurationMs() {
    return absoluteDurationMs;
  }
  public void setAbsoluteDurationMs(Long absoluteDurationMs) {
    this.absoluteDurationMs = absoluteDurationMs;
  }


  /**
   * Offset of annotation (milliseconds) from start of recording, adjusted for any recording cuts
   **/
  public Annotation recordingLocation(Long recordingLocation) {
    this.recordingLocation = recordingLocation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Offset of annotation (milliseconds) from start of recording, adjusted for any recording cuts")
  @JsonProperty("recordingLocation")
  public Long getRecordingLocation() {
    return recordingLocation;
  }
  public void setRecordingLocation(Long recordingLocation) {
    this.recordingLocation = recordingLocation;
  }


  /**
   * Duration of annotation (milliseconds), adjusted for any recording cuts.
   **/
  public Annotation recordingDurationMs(Long recordingDurationMs) {
    this.recordingDurationMs = recordingDurationMs;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Duration of annotation (milliseconds), adjusted for any recording cuts.")
  @JsonProperty("recordingDurationMs")
  public Long getRecordingDurationMs() {
    return recordingDurationMs;
  }
  public void setRecordingDurationMs(Long recordingDurationMs) {
    this.recordingDurationMs = recordingDurationMs;
  }


  /**
   * User that created this annotation (if any).
   **/
  public Annotation user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "User that created this annotation (if any).")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }


  /**
   * Text of annotation. Maximum character limit is 500.
   **/
  public Annotation description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text of annotation. Maximum character limit is 500.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  @ApiModelProperty(example = "null", value = "Reason for a pause annotation. Valid values: Hold,SecurePause,FlowOrQueue,Pause")
  @JsonProperty("reason")
  public ReasonEnum getReason() {
    return reason;
  }


  @ApiModelProperty(example = "null", value = "List of annotations")
  @JsonProperty("annotations")
  public List<Annotation> getAnnotations() {
    return annotations;
  }


  @ApiModelProperty(example = "null", value = "Offset of annotation (milliseconds) from start of the recording before removing the cumulative duration of all pauses before this annotation")
  @JsonProperty("realtimeLocation")
  public Long getRealtimeLocation() {
    return realtimeLocation;
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
    Annotation annotation = (Annotation) o;

    return Objects.equals(this.id, annotation.id) &&
            Objects.equals(this.name, annotation.name) &&
            Objects.equals(this.type, annotation.type) &&
            Objects.equals(this.location, annotation.location) &&
            Objects.equals(this.durationMs, annotation.durationMs) &&
            Objects.equals(this.absoluteLocation, annotation.absoluteLocation) &&
            Objects.equals(this.absoluteDurationMs, annotation.absoluteDurationMs) &&
            Objects.equals(this.recordingLocation, annotation.recordingLocation) &&
            Objects.equals(this.recordingDurationMs, annotation.recordingDurationMs) &&
            Objects.equals(this.user, annotation.user) &&
            Objects.equals(this.description, annotation.description) &&
            Objects.equals(this.reason, annotation.reason) &&
            Objects.equals(this.annotations, annotation.annotations) &&
            Objects.equals(this.realtimeLocation, annotation.realtimeLocation) &&
            Objects.equals(this.selfUri, annotation.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, location, durationMs, absoluteLocation, absoluteDurationMs, recordingLocation, recordingDurationMs, user, description, reason, annotations, realtimeLocation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Annotation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
    sb.append("    absoluteLocation: ").append(toIndentedString(absoluteLocation)).append("\n");
    sb.append("    absoluteDurationMs: ").append(toIndentedString(absoluteDurationMs)).append("\n");
    sb.append("    recordingLocation: ").append(toIndentedString(recordingLocation)).append("\n");
    sb.append("    recordingDurationMs: ").append(toIndentedString(recordingDurationMs)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    realtimeLocation: ").append(toIndentedString(realtimeLocation)).append("\n");
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

