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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * QueueConversationCallbackEventTopicVoicemail
 */

public class QueueConversationCallbackEventTopicVoicemail  implements Serializable {
  
  private String id = null;

  private static class UploadStatusEnumDeserializer extends StdDeserializer<UploadStatusEnum> {
    public UploadStatusEnumDeserializer() {
      super(UploadStatusEnumDeserializer.class);
    }

    @Override
    public UploadStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return UploadStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets uploadStatus
   */
 @JsonDeserialize(using = UploadStatusEnumDeserializer.class)
  public enum UploadStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("PENDING"),
    COMPLETE("COMPLETE"),
    FAILED("FAILED"),
    TIMEOUT("TIMEOUT"),
    NONE("NONE");

    private String value;

    UploadStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static UploadStatusEnum fromString(String key) {
      if (key == null) return null;

      for (UploadStatusEnum value : UploadStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return UploadStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private UploadStatusEnum uploadStatus = null;

  
  /**
   **/
  public QueueConversationCallbackEventTopicVoicemail id(String id) {
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
  public QueueConversationCallbackEventTopicVoicemail uploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("uploadStatus")
  public UploadStatusEnum getUploadStatus() {
    return uploadStatus;
  }
  public void setUploadStatus(UploadStatusEnum uploadStatus) {
    this.uploadStatus = uploadStatus;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationCallbackEventTopicVoicemail queueConversationCallbackEventTopicVoicemail = (QueueConversationCallbackEventTopicVoicemail) o;
    return Objects.equals(this.id, queueConversationCallbackEventTopicVoicemail.id) &&
        Objects.equals(this.uploadStatus, queueConversationCallbackEventTopicVoicemail.uploadStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, uploadStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationCallbackEventTopicVoicemail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    uploadStatus: ").append(toIndentedString(uploadStatus)).append("\n");
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

