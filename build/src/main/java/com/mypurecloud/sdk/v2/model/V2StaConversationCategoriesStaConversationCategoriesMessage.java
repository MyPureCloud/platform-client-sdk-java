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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2StaConversationCategoriesStaConversationCategoriesMessage
 */

public class V2StaConversationCategoriesStaConversationCategoriesMessage  implements Serializable {
  
  private String organizationId = null;
  private String conversationId = null;

  private static class MediaTypeEnumDeserializer extends StdDeserializer<MediaTypeEnum> {
    public MediaTypeEnumDeserializer() {
      super(MediaTypeEnumDeserializer.class);
    }

    @Override
    public MediaTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaType
   */
 @JsonDeserialize(using = MediaTypeEnumDeserializer.class)
  public enum MediaTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("unknown"),
    CALL("call"),
    CHAT("chat"),
    EMAIL("email"),
    MESSAGE("message");

    private String value;

    MediaTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypeEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypeEnum value : MediaTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MediaTypeEnum mediaType = null;
  private List<String> transcriptIds = null;
  private List<String> categoryIds = null;

  public V2StaConversationCategoriesStaConversationCategoriesMessage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      transcriptIds = new ArrayList<String>();
      categoryIds = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public V2StaConversationCategoriesStaConversationCategoriesMessage organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("organizationId")
  public String getOrganizationId() {
    return organizationId;
  }
  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }


  /**
   **/
  public V2StaConversationCategoriesStaConversationCategoriesMessage conversationId(String conversationId) {
    this.conversationId = conversationId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conversationId")
  public String getConversationId() {
    return conversationId;
  }
  public void setConversationId(String conversationId) {
    this.conversationId = conversationId;
  }


  /**
   **/
  public V2StaConversationCategoriesStaConversationCategoriesMessage mediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("mediaType")
  public MediaTypeEnum getMediaType() {
    return mediaType;
  }
  public void setMediaType(MediaTypeEnum mediaType) {
    this.mediaType = mediaType;
  }


  /**
   **/
  public V2StaConversationCategoriesStaConversationCategoriesMessage transcriptIds(List<String> transcriptIds) {
    this.transcriptIds = transcriptIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("transcriptIds")
  public List<String> getTranscriptIds() {
    return transcriptIds;
  }
  public void setTranscriptIds(List<String> transcriptIds) {
    this.transcriptIds = transcriptIds;
  }


  /**
   **/
  public V2StaConversationCategoriesStaConversationCategoriesMessage categoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("categoryIds")
  public List<String> getCategoryIds() {
    return categoryIds;
  }
  public void setCategoryIds(List<String> categoryIds) {
    this.categoryIds = categoryIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaConversationCategoriesStaConversationCategoriesMessage v2StaConversationCategoriesStaConversationCategoriesMessage = (V2StaConversationCategoriesStaConversationCategoriesMessage) o;

    return Objects.equals(this.organizationId, v2StaConversationCategoriesStaConversationCategoriesMessage.organizationId) &&
            Objects.equals(this.conversationId, v2StaConversationCategoriesStaConversationCategoriesMessage.conversationId) &&
            Objects.equals(this.mediaType, v2StaConversationCategoriesStaConversationCategoriesMessage.mediaType) &&
            Objects.equals(this.transcriptIds, v2StaConversationCategoriesStaConversationCategoriesMessage.transcriptIds) &&
            Objects.equals(this.categoryIds, v2StaConversationCategoriesStaConversationCategoriesMessage.categoryIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(organizationId, conversationId, mediaType, transcriptIds, categoryIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaConversationCategoriesStaConversationCategoriesMessage {\n");
    
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    conversationId: ").append(toIndentedString(conversationId)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    transcriptIds: ").append(toIndentedString(transcriptIds)).append("\n");
    sb.append("    categoryIds: ").append(toIndentedString(categoryIds)).append("\n");
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

