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
import com.mypurecloud.sdk.v2.model.AnswerOption;
import com.mypurecloud.sdk.v2.model.VisibilityCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * SurveyQuestion
 */

public class SurveyQuestion  implements Serializable {
  
  private String id = null;
  private String text = null;
  private String helpText = null;

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MULTIPLECHOICEQUESTION("multipleChoiceQuestion"),
    FREETEXTQUESTION("freeTextQuestion"),
    NPSQUESTION("npsQuestion"),
    READONLYTEXTBLOCKQUESTION("readOnlyTextBlockQuestion");

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
  private Boolean naEnabled = null;
  private VisibilityCondition visibilityCondition = null;
  private List<AnswerOption> answerOptions = new ArrayList<AnswerOption>();
  private Integer maxResponseCharacters = null;
  private String explanationPrompt = null;

  
  /**
   **/
  public SurveyQuestion id(String id) {
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
  public SurveyQuestion text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   **/
  public SurveyQuestion helpText(String helpText) {
    this.helpText = helpText;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("helpText")
  public String getHelpText() {
    return helpText;
  }
  public void setHelpText(String helpText) {
    this.helpText = helpText;
  }

  
  /**
   **/
  public SurveyQuestion type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public SurveyQuestion naEnabled(Boolean naEnabled) {
    this.naEnabled = naEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("naEnabled")
  public Boolean getNaEnabled() {
    return naEnabled;
  }
  public void setNaEnabled(Boolean naEnabled) {
    this.naEnabled = naEnabled;
  }

  
  /**
   **/
  public SurveyQuestion visibilityCondition(VisibilityCondition visibilityCondition) {
    this.visibilityCondition = visibilityCondition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("visibilityCondition")
  public VisibilityCondition getVisibilityCondition() {
    return visibilityCondition;
  }
  public void setVisibilityCondition(VisibilityCondition visibilityCondition) {
    this.visibilityCondition = visibilityCondition;
  }

  
  /**
   * Options from which to choose an answer for this question. Only used by Multiple Choice type questions.
   **/
  public SurveyQuestion answerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Options from which to choose an answer for this question. Only used by Multiple Choice type questions.")
  @JsonProperty("answerOptions")
  public List<AnswerOption> getAnswerOptions() {
    return answerOptions;
  }
  public void setAnswerOptions(List<AnswerOption> answerOptions) {
    this.answerOptions = answerOptions;
  }

  
  /**
   * How many characters are allowed in the text response to this question. Used by NPS and Free Text question types.
   **/
  public SurveyQuestion maxResponseCharacters(Integer maxResponseCharacters) {
    this.maxResponseCharacters = maxResponseCharacters;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "How many characters are allowed in the text response to this question. Used by NPS and Free Text question types.")
  @JsonProperty("maxResponseCharacters")
  public Integer getMaxResponseCharacters() {
    return maxResponseCharacters;
  }
  public void setMaxResponseCharacters(Integer maxResponseCharacters) {
    this.maxResponseCharacters = maxResponseCharacters;
  }

  
  /**
   * Prompt for details explaining the chosen NPS score. Used by NPS questions.
   **/
  public SurveyQuestion explanationPrompt(String explanationPrompt) {
    this.explanationPrompt = explanationPrompt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prompt for details explaining the chosen NPS score. Used by NPS questions.")
  @JsonProperty("explanationPrompt")
  public String getExplanationPrompt() {
    return explanationPrompt;
  }
  public void setExplanationPrompt(String explanationPrompt) {
    this.explanationPrompt = explanationPrompt;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SurveyQuestion surveyQuestion = (SurveyQuestion) o;
    return Objects.equals(this.id, surveyQuestion.id) &&
        Objects.equals(this.text, surveyQuestion.text) &&
        Objects.equals(this.helpText, surveyQuestion.helpText) &&
        Objects.equals(this.type, surveyQuestion.type) &&
        Objects.equals(this.naEnabled, surveyQuestion.naEnabled) &&
        Objects.equals(this.visibilityCondition, surveyQuestion.visibilityCondition) &&
        Objects.equals(this.answerOptions, surveyQuestion.answerOptions) &&
        Objects.equals(this.maxResponseCharacters, surveyQuestion.maxResponseCharacters) &&
        Objects.equals(this.explanationPrompt, surveyQuestion.explanationPrompt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, text, helpText, type, naEnabled, visibilityCondition, answerOptions, maxResponseCharacters, explanationPrompt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SurveyQuestion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    helpText: ").append(toIndentedString(helpText)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    naEnabled: ").append(toIndentedString(naEnabled)).append("\n");
    sb.append("    visibilityCondition: ").append(toIndentedString(visibilityCondition)).append("\n");
    sb.append("    answerOptions: ").append(toIndentedString(answerOptions)).append("\n");
    sb.append("    maxResponseCharacters: ").append(toIndentedString(maxResponseCharacters)).append("\n");
    sb.append("    explanationPrompt: ").append(toIndentedString(explanationPrompt)).append("\n");
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

