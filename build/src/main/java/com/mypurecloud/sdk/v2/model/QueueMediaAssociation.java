package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.QueueReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * A combination of a single queue and one or more media types to associate with a service goal group
 */
@ApiModel(description = "A combination of a single queue and one or more media types to associate with a service goal group")

public class QueueMediaAssociation  implements Serializable {
  
  private QueueReference queue = null;

  /**
   * Gets or Sets mediaTypes
   */
  public enum MediaTypesEnum {
    VOICE("Voice"),
    CHAT("Chat"),
    EMAIL("Email"),
    CALLBACK("Callback"),
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
  private String id = null;
  private Boolean delete = null;

  
  /**
   * The queue to associate with the service goal group
   **/
  public QueueMediaAssociation queue(QueueReference queue) {
    this.queue = queue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue to associate with the service goal group")
  @JsonProperty("queue")
  public QueueReference getQueue() {
    return queue;
  }
  public void setQueue(QueueReference queue) {
    this.queue = queue;
  }

  
  /**
   * The media types of the given queue to associate with the service goal group
   **/
  public QueueMediaAssociation mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The media types of the given queue to associate with the service goal group")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }

  
  @ApiModelProperty(example = "null", value = "The reference ID for this QueueMediaAssociation")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * If marked true on a PATCH, this QueueMediaAssociation will be permanently deleted
   **/
  public QueueMediaAssociation delete(Boolean delete) {
    this.delete = delete;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If marked true on a PATCH, this QueueMediaAssociation will be permanently deleted")
  @JsonProperty("delete")
  public Boolean getDelete() {
    return delete;
  }
  public void setDelete(Boolean delete) {
    this.delete = delete;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueMediaAssociation queueMediaAssociation = (QueueMediaAssociation) o;
    return Objects.equals(this.queue, queueMediaAssociation.queue) &&
        Objects.equals(this.mediaTypes, queueMediaAssociation.mediaTypes) &&
        Objects.equals(this.id, queueMediaAssociation.id) &&
        Objects.equals(this.delete, queueMediaAssociation.delete);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, mediaTypes, id, delete);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueMediaAssociation {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    delete: ").append(toIndentedString(delete)).append("\n");
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

