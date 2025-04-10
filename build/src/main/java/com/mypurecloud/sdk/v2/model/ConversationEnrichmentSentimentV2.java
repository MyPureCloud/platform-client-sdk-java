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

import java.io.Serializable;
/**
 * Sentiment analysis of this message.
 */
@ApiModel(description = "Sentiment analysis of this message.")

public class ConversationEnrichmentSentimentV2  implements Serializable {
  

  private static class TagEnumDeserializer extends StdDeserializer<TagEnum> {
    public TagEnumDeserializer() {
      super(TagEnumDeserializer.class);
    }

    @Override
    public TagEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TagEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Detected Sentiment tag
   */
 @JsonDeserialize(using = TagEnumDeserializer.class)
  public enum TagEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    POSITIVE("Positive"),
    NEGATIVE("Negative"),
    NEUTRAL("Neutral");

    private String value;

    TagEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TagEnum fromString(String key) {
      if (key == null) return null;

      for (TagEnum value : TagEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TagEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TagEnum tag = null;

  public ConversationEnrichmentSentimentV2() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Detected Sentiment tag
   **/
  public ConversationEnrichmentSentimentV2 tag(TagEnum tag) {
    this.tag = tag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Detected Sentiment tag")
  @JsonProperty("tag")
  public TagEnum getTag() {
    return tag;
  }
  public void setTag(TagEnum tag) {
    this.tag = tag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEnrichmentSentimentV2 conversationEnrichmentSentimentV2 = (ConversationEnrichmentSentimentV2) o;

    return Objects.equals(this.tag, conversationEnrichmentSentimentV2.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEnrichmentSentimentV2 {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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

