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
 * ContentModeration
 */

public class ContentModeration  implements Serializable {
  

  private static class FlagEnumDeserializer extends StdDeserializer<FlagEnum> {
    public FlagEnumDeserializer() {
      super(FlagEnumDeserializer.class);
    }

    @Override
    public FlagEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FlagEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Content Moderation Flag of the message.
   */
 @JsonDeserialize(using = FlagEnumDeserializer.class)
  public enum FlagEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOTSAFEFORWORK("NotSafeForWork"),
    SAFEFORWORK("SafeForWork"),
    UNKNOWN("Unknown");

    private String value;

    FlagEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FlagEnum fromString(String key) {
      if (key == null) return null;

      for (FlagEnum value : FlagEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FlagEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FlagEnum flag = null;

  public ContentModeration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Content Moderation Flag of the message.
   **/
  public ContentModeration flag(FlagEnum flag) {
    this.flag = flag;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Content Moderation Flag of the message.")
  @JsonProperty("flag")
  public FlagEnum getFlag() {
    return flag;
  }
  public void setFlag(FlagEnum flag) {
    this.flag = flag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentModeration contentModeration = (ContentModeration) o;

    return Objects.equals(this.flag, contentModeration.flag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(flag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentModeration {\n");
    
    sb.append("    flag: ").append(toIndentedString(flag)).append("\n");
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

