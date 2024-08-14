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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Term
 */

public class Term  implements Serializable {
  
  private String word = null;

  private static class ParticipantTypeEnumDeserializer extends StdDeserializer<ParticipantTypeEnum> {
    public ParticipantTypeEnumDeserializer() {
      super(ParticipantTypeEnumDeserializer.class);
    }

    @Override
    public ParticipantTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ParticipantTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Dictates if term operand must come from the internal, external or both participants
   */
 @JsonDeserialize(using = ParticipantTypeEnumDeserializer.class)
  public enum ParticipantTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTERNAL("Internal"),
    EXTERNAL("External"),
    BOTH("Both");

    private String value;

    ParticipantTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ParticipantTypeEnum fromString(String key) {
      if (key == null) return null;

      for (ParticipantTypeEnum value : ParticipantTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ParticipantTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ParticipantTypeEnum participantType = null;

  
  /**
   * Find term in interaction
   **/
  public Term word(String word) {
    this.word = word;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Find term in interaction")
  @JsonProperty("word")
  public String getWord() {
    return word;
  }
  public void setWord(String word) {
    this.word = word;
  }


  /**
   * Dictates if term operand must come from the internal, external or both participants
   **/
  public Term participantType(ParticipantTypeEnum participantType) {
    this.participantType = participantType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Dictates if term operand must come from the internal, external or both participants")
  @JsonProperty("participantType")
  public ParticipantTypeEnum getParticipantType() {
    return participantType;
  }
  public void setParticipantType(ParticipantTypeEnum participantType) {
    this.participantType = participantType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Term term = (Term) o;

    return Objects.equals(this.word, term.word) &&
            Objects.equals(this.participantType, term.participantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(word, participantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Term {\n");
    
    sb.append("    word: ").append(toIndentedString(word)).append("\n");
    sb.append("    participantType: ").append(toIndentedString(participantType)).append("\n");
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

