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
import com.mypurecloud.sdk.v2.model.ProgramTopicLinksTestTopicPhraseResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ProgramTopicLinksTopicsDefinitionsJob
 */

public class ProgramTopicLinksTopicsDefinitionsJob  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COMPLETED("Completed"),
    RUNNING("Running"),
    FAILED("Failed");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private List<ProgramTopicLinksTestTopicPhraseResults> testTopicPhraseResults = null;
  private List<String> genAIPhrasesResults = null;

  public ProgramTopicLinksTopicsDefinitionsJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      testTopicPhraseResults = new ArrayList<ProgramTopicLinksTestTopicPhraseResults>();
      genAIPhrasesResults = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public ProgramTopicLinksTopicsDefinitionsJob id(String id) {
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
  public ProgramTopicLinksTopicsDefinitionsJob state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   **/
  public ProgramTopicLinksTopicsDefinitionsJob testTopicPhraseResults(List<ProgramTopicLinksTestTopicPhraseResults> testTopicPhraseResults) {
    this.testTopicPhraseResults = testTopicPhraseResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("testTopicPhraseResults")
  public List<ProgramTopicLinksTestTopicPhraseResults> getTestTopicPhraseResults() {
    return testTopicPhraseResults;
  }
  public void setTestTopicPhraseResults(List<ProgramTopicLinksTestTopicPhraseResults> testTopicPhraseResults) {
    this.testTopicPhraseResults = testTopicPhraseResults;
  }


  /**
   **/
  public ProgramTopicLinksTopicsDefinitionsJob genAIPhrasesResults(List<String> genAIPhrasesResults) {
    this.genAIPhrasesResults = genAIPhrasesResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("genAIPhrasesResults")
  public List<String> getGenAIPhrasesResults() {
    return genAIPhrasesResults;
  }
  public void setGenAIPhrasesResults(List<String> genAIPhrasesResults) {
    this.genAIPhrasesResults = genAIPhrasesResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProgramTopicLinksTopicsDefinitionsJob programTopicLinksTopicsDefinitionsJob = (ProgramTopicLinksTopicsDefinitionsJob) o;

    return Objects.equals(this.id, programTopicLinksTopicsDefinitionsJob.id) &&
            Objects.equals(this.state, programTopicLinksTopicsDefinitionsJob.state) &&
            Objects.equals(this.testTopicPhraseResults, programTopicLinksTopicsDefinitionsJob.testTopicPhraseResults) &&
            Objects.equals(this.genAIPhrasesResults, programTopicLinksTopicsDefinitionsJob.genAIPhrasesResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, testTopicPhraseResults, genAIPhrasesResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProgramTopicLinksTopicsDefinitionsJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    testTopicPhraseResults: ").append(toIndentedString(testTopicPhraseResults)).append("\n");
    sb.append("    genAIPhrasesResults: ").append(toIndentedString(genAIPhrasesResults)).append("\n");
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

