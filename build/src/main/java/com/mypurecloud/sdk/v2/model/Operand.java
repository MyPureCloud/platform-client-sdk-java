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
import com.mypurecloud.sdk.v2.model.InfixOperator;
import com.mypurecloud.sdk.v2.model.OperandPosition;
import com.mypurecloud.sdk.v2.model.Term;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Operand
 */

public class Operand  implements Serializable {
  

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
   * The Operand type of the category
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TERM("Term"),
    TOPIC("Topic"),
    OPERANDGROUP("OperandGroup");

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
  private Integer occurrence = null;
  private Boolean inverted = null;
  private Term term = null;
  private String topicId = null;
  private OperandPosition voiceSecondsPosition = null;
  private OperandPosition digitalWordsPosition = null;
  private InfixOperator infixOperator = null;
  private List<Operand> operands = new ArrayList<Operand>();

  
  /**
   * The Operand type of the category
   **/
  public Operand type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Operand type of the category")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The minimum number of occurrences of the defined operand type
   **/
  public Operand occurrence(Integer occurrence) {
    this.occurrence = occurrence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum number of occurrences of the defined operand type")
  @JsonProperty("occurrence")
  public Integer getOccurrence() {
    return occurrence;
  }
  public void setOccurrence(Integer occurrence) {
    this.occurrence = occurrence;
  }


  /**
   * Applies a NOT modifier to the operand group
   **/
  public Operand inverted(Boolean inverted) {
    this.inverted = inverted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Applies a NOT modifier to the operand group")
  @JsonProperty("inverted")
  public Boolean getInverted() {
    return inverted;
  }
  public void setInverted(Boolean inverted) {
    this.inverted = inverted;
  }


  /**
   * Filter interaction by word(s)
   **/
  public Operand term(Term term) {
    this.term = term;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter interaction by word(s)")
  @JsonProperty("term")
  public Term getTerm() {
    return term;
  }
  public void setTerm(Term term) {
    this.term = term;
  }


  /**
   * Filter interaction by topic ID
   **/
  public Operand topicId(String topicId) {
    this.topicId = topicId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Filter interaction by topic ID")
  @JsonProperty("topicId")
  public String getTopicId() {
    return topicId;
  }
  public void setTopicId(String topicId) {
    this.topicId = topicId;
  }


  /**
   * Dictates when the operand must occur in a voice interaction
   **/
  public Operand voiceSecondsPosition(OperandPosition voiceSecondsPosition) {
    this.voiceSecondsPosition = voiceSecondsPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dictates when the operand must occur in a voice interaction")
  @JsonProperty("voiceSecondsPosition")
  public OperandPosition getVoiceSecondsPosition() {
    return voiceSecondsPosition;
  }
  public void setVoiceSecondsPosition(OperandPosition voiceSecondsPosition) {
    this.voiceSecondsPosition = voiceSecondsPosition;
  }


  /**
   * Dictates when the operand must occur in a digital interaction
   **/
  public Operand digitalWordsPosition(OperandPosition digitalWordsPosition) {
    this.digitalWordsPosition = digitalWordsPosition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Dictates when the operand must occur in a digital interaction")
  @JsonProperty("digitalWordsPosition")
  public OperandPosition getDigitalWordsPosition() {
    return digitalWordsPosition;
  }
  public void setDigitalWordsPosition(OperandPosition digitalWordsPosition) {
    this.digitalWordsPosition = digitalWordsPosition;
  }


  /**
   * Defines a logical operation that is applied on the current operand, against the following operand
   **/
  public Operand infixOperator(InfixOperator infixOperator) {
    this.infixOperator = infixOperator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Defines a logical operation that is applied on the current operand, against the following operand")
  @JsonProperty("infixOperator")
  public InfixOperator getInfixOperator() {
    return infixOperator;
  }
  public void setInfixOperator(InfixOperator infixOperator) {
    this.infixOperator = infixOperator;
  }


  /**
   * Contains a new level of operands
   **/
  public Operand operands(List<Operand> operands) {
    this.operands = operands;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Contains a new level of operands")
  @JsonProperty("operands")
  public List<Operand> getOperands() {
    return operands;
  }
  public void setOperands(List<Operand> operands) {
    this.operands = operands;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Operand operand = (Operand) o;

    return Objects.equals(this.type, operand.type) &&
            Objects.equals(this.occurrence, operand.occurrence) &&
            Objects.equals(this.inverted, operand.inverted) &&
            Objects.equals(this.term, operand.term) &&
            Objects.equals(this.topicId, operand.topicId) &&
            Objects.equals(this.voiceSecondsPosition, operand.voiceSecondsPosition) &&
            Objects.equals(this.digitalWordsPosition, operand.digitalWordsPosition) &&
            Objects.equals(this.infixOperator, operand.infixOperator) &&
            Objects.equals(this.operands, operand.operands);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, occurrence, inverted, term, topicId, voiceSecondsPosition, digitalWordsPosition, infixOperator, operands);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Operand {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    occurrence: ").append(toIndentedString(occurrence)).append("\n");
    sb.append("    inverted: ").append(toIndentedString(inverted)).append("\n");
    sb.append("    term: ").append(toIndentedString(term)).append("\n");
    sb.append("    topicId: ").append(toIndentedString(topicId)).append("\n");
    sb.append("    voiceSecondsPosition: ").append(toIndentedString(voiceSecondsPosition)).append("\n");
    sb.append("    digitalWordsPosition: ").append(toIndentedString(digitalWordsPosition)).append("\n");
    sb.append("    infixOperator: ").append(toIndentedString(infixOperator)).append("\n");
    sb.append("    operands: ").append(toIndentedString(operands)).append("\n");
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

