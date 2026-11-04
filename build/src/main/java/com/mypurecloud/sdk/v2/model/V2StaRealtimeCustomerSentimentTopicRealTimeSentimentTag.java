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
 * V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag
 */

public class V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag  implements Serializable {
  

  private static class SentimentLabelEnumDeserializer extends StdDeserializer<SentimentLabelEnum> {
    public SentimentLabelEnumDeserializer() {
      super(SentimentLabelEnumDeserializer.class);
    }

    @Override
    public SentimentLabelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SentimentLabelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets sentimentLabel
   */
 @JsonDeserialize(using = SentimentLabelEnumDeserializer.class)
  public enum SentimentLabelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    POSITIVE("Positive"),
    NEGATIVE("Negative");

    private String value;

    SentimentLabelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SentimentLabelEnum fromString(String key) {
      if (key == null) return null;

      for (SentimentLabelEnum value : SentimentLabelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SentimentLabelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SentimentLabelEnum sentimentLabel = null;
  private String sentimentalPhrase = null;

  public V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag sentimentLabel(SentimentLabelEnum sentimentLabel) {
    this.sentimentLabel = sentimentLabel;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sentimentLabel")
  public SentimentLabelEnum getSentimentLabel() {
    return sentimentLabel;
  }
  public void setSentimentLabel(SentimentLabelEnum sentimentLabel) {
    this.sentimentLabel = sentimentLabel;
  }


  /**
   **/
  public V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag sentimentalPhrase(String sentimentalPhrase) {
    this.sentimentalPhrase = sentimentalPhrase;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sentimentalPhrase")
  public String getSentimentalPhrase() {
    return sentimentalPhrase;
  }
  public void setSentimentalPhrase(String sentimentalPhrase) {
    this.sentimentalPhrase = sentimentalPhrase;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag v2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag = (V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag) o;

    return Objects.equals(this.sentimentLabel, v2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag.sentimentLabel) &&
            Objects.equals(this.sentimentalPhrase, v2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag.sentimentalPhrase);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sentimentLabel, sentimentalPhrase);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2StaRealtimeCustomerSentimentTopicRealTimeSentimentTag {\n");
    
    sb.append("    sentimentLabel: ").append(toIndentedString(sentimentLabel)).append("\n");
    sb.append("    sentimentalPhrase: ").append(toIndentedString(sentimentalPhrase)).append("\n");
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

