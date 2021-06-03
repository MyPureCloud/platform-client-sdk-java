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
 * User reaction to public message.
 */
@ApiModel(description = "User reaction to public message.")

public class ContentReaction  implements Serializable {
  

  private static class ReactionTypeEnumDeserializer extends StdDeserializer<ReactionTypeEnum> {
    public ReactionTypeEnumDeserializer() {
      super(ReactionTypeEnumDeserializer.class);
    }

    @Override
    public ReactionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ReactionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type of reaction.
   */
 @JsonDeserialize(using = ReactionTypeEnumDeserializer.class)
  public enum ReactionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LIKE("Like"),
    LOVE("Love"),
    WOW("Wow"),
    HAHA("Haha"),
    SAD("Sad"),
    ANGRY("Angry"),
    THANKFUL("Thankful"),
    PRIDE("Pride"),
    CARE("Care");

    private String value;

    ReactionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ReactionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ReactionTypeEnum value : ReactionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ReactionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ReactionTypeEnum reactionType = null;
  private Integer count = null;

  
  /**
   * Type of reaction.
   **/
  public ContentReaction reactionType(ReactionTypeEnum reactionType) {
    this.reactionType = reactionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Type of reaction.")
  @JsonProperty("reactionType")
  public ReactionTypeEnum getReactionType() {
    return reactionType;
  }
  public void setReactionType(ReactionTypeEnum reactionType) {
    this.reactionType = reactionType;
  }

  
  /**
   * Number of users that reacted this way to the message.
   **/
  public ContentReaction count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of users that reacted this way to the message.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentReaction contentReaction = (ContentReaction) o;
    return Objects.equals(this.reactionType, contentReaction.reactionType) &&
        Objects.equals(this.count, contentReaction.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reactionType, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentReaction {\n");
    
    sb.append("    reactionType: ").append(toIndentedString(reactionType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

