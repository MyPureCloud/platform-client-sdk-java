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
 * A rule that detects repeated user or agent messages and adds a corrective instruction.
 */
@ApiModel(description = "A rule that detects repeated user or agent messages and adds a corrective instruction.")

public class AgenticVirtualAgentRepetitionCheck  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether this check looks for repetition in user messages or agent responses.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USER("User"),
    AGENT("Agent");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private Integer messages = null;

  private static class SimilarityEnumDeserializer extends StdDeserializer<SimilarityEnum> {
    public SimilarityEnumDeserializer() {
      super(SimilarityEnumDeserializer.class);
    }

    @Override
    public SimilarityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SimilarityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The similarity category compared to the Levenshtein result that triggers this check's instruction.
   */
 @JsonDeserialize(using = SimilarityEnumDeserializer.class)
  public enum SimilarityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LOOSE("Loose"),
    MODERATE("Moderate"),
    STRICT("Strict"),
    VERYSTRICT("VeryStrict");

    private String value;

    SimilarityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SimilarityEnum fromString(String key) {
      if (key == null) return null;

      for (SimilarityEnum value : SimilarityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SimilarityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SimilarityEnum similarity = null;
  private String instruction = null;

  public AgenticVirtualAgentRepetitionCheck() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public AgenticVirtualAgentRepetitionCheck(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Whether this check looks for repetition in user messages or agent responses.
   **/
  public AgenticVirtualAgentRepetitionCheck type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether this check looks for repetition in user messages or agent responses.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The number of prior messages of the specified type to compare for repetition.
   **/
  public AgenticVirtualAgentRepetitionCheck messages(Integer messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The number of prior messages of the specified type to compare for repetition.")
  @JsonProperty("messages")
  public Integer getMessages() {
    return messages;
  }
  public void setMessages(Integer messages) {
    this.messages = messages;
  }


  /**
   * The similarity category compared to the Levenshtein result that triggers this check's instruction.
   **/
  public AgenticVirtualAgentRepetitionCheck similarity(SimilarityEnum similarity) {
    this.similarity = similarity;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The similarity category compared to the Levenshtein result that triggers this check's instruction.")
  @JsonProperty("similarity")
  public SimilarityEnum getSimilarity() {
    return similarity;
  }
  public void setSimilarity(SimilarityEnum similarity) {
    this.similarity = similarity;
  }


  /**
   * The instruction added to the virtual agent's turn when message similarity matches the configured category.
   **/
  public AgenticVirtualAgentRepetitionCheck instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }
  
  @ApiModelProperty(example = "Your last two responses were very similar. Vary your language, tone, and structure substantially. Use different words and sentence patterns", required = true, value = "The instruction added to the virtual agent's turn when message similarity matches the configured category.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgenticVirtualAgentRepetitionCheck agenticVirtualAgentRepetitionCheck = (AgenticVirtualAgentRepetitionCheck) o;

    return Objects.equals(this.type, agenticVirtualAgentRepetitionCheck.type) &&
            Objects.equals(this.messages, agenticVirtualAgentRepetitionCheck.messages) &&
            Objects.equals(this.similarity, agenticVirtualAgentRepetitionCheck.similarity) &&
            Objects.equals(this.instruction, agenticVirtualAgentRepetitionCheck.instruction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, messages, similarity, instruction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgenticVirtualAgentRepetitionCheck {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
    sb.append("    similarity: ").append(toIndentedString(similarity)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
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

