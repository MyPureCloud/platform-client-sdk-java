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
 * Information about the channel.
 */
@ApiModel(description = "Information about the channel.")

public class ConversationChannelMetadata  implements Serializable {
  

  private static class SubTypeEnumDeserializer extends StdDeserializer<SubTypeEnum> {
    public SubTypeEnumDeserializer() {
      super(SubTypeEnumDeserializer.class);
    }

    @Override
    public SubTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SubTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Channel subtype
   */
 @JsonDeserialize(using = SubTypeEnumDeserializer.class)
  public enum SubTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NONE("None"),
    GOOGLEBUSINESSPROFILE("GoogleBusinessProfile"),
    ROADSIDEASSISTANCE("RoadsideAssistance"),
    YOUTUBE("YouTube");

    private String value;

    SubTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SubTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SubTypeEnum value : SubTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SubTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SubTypeEnum subType = null;

  public ConversationChannelMetadata() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Channel subtype")
  @JsonProperty("subType")
  public SubTypeEnum getSubType() {
    return subType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationChannelMetadata conversationChannelMetadata = (ConversationChannelMetadata) o;

    return Objects.equals(this.subType, conversationChannelMetadata.subType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationChannelMetadata {\n");
    
    sb.append("    subType: ").append(toIndentedString(subType)).append("\n");
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

