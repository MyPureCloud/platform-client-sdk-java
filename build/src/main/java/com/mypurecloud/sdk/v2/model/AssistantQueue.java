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
import com.mypurecloud.sdk.v2.model.Assistant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * AssistantQueue
 */

public class AssistantQueue  implements Serializable {
  
  private String id = null;

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    CALL("Call"),
    EMAIL("Email"),
    MESSAGE("Message");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = new ArrayList<MediaTypesEnum>();
  private Assistant assistant = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;

  
  /**
   * The globally unique identifier for the queue.
   **/
  public AssistantQueue id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the queue.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * List of media Types in which the assistant is activated for this queue.
   **/
  public AssistantQueue mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of media Types in which the assistant is activated for this queue.")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }


  @ApiModelProperty(example = "null", value = "Assistant to which the queue is assigned.")
  @JsonProperty("assistant")
  public Assistant getAssistant() {
    return assistant;
  }


  @ApiModelProperty(example = "null", value = "Date when the assistant queue was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when the assistant queue was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    AssistantQueue assistantQueue = (AssistantQueue) o;

    return Objects.equals(this.id, assistantQueue.id) &&
            Objects.equals(this.mediaTypes, assistantQueue.mediaTypes) &&
            Objects.equals(this.assistant, assistantQueue.assistant) &&
            Objects.equals(this.dateCreated, assistantQueue.dateCreated) &&
            Objects.equals(this.dateModified, assistantQueue.dateModified) &&
            Objects.equals(this.selfUri, assistantQueue.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mediaTypes, assistant, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssistantQueue {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    assistant: ").append(toIndentedString(assistant)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

