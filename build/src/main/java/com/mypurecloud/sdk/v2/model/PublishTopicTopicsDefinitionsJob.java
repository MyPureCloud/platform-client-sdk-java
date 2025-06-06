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
import com.mypurecloud.sdk.v2.model.PublishTopicTestTopicPhraseResults;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * PublishTopicTopicsDefinitionsJob
 */

public class PublishTopicTopicsDefinitionsJob  implements Serializable {
  
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
  private List<PublishTopicTestTopicPhraseResults> testTopicPhraseResults = null;

  public PublishTopicTopicsDefinitionsJob() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      testTopicPhraseResults = new ArrayList<PublishTopicTestTopicPhraseResults>();
    }
  }

  
  /**
   **/
  public PublishTopicTopicsDefinitionsJob id(String id) {
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
  public PublishTopicTopicsDefinitionsJob state(StateEnum state) {
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
  public PublishTopicTopicsDefinitionsJob testTopicPhraseResults(List<PublishTopicTestTopicPhraseResults> testTopicPhraseResults) {
    this.testTopicPhraseResults = testTopicPhraseResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("testTopicPhraseResults")
  public List<PublishTopicTestTopicPhraseResults> getTestTopicPhraseResults() {
    return testTopicPhraseResults;
  }
  public void setTestTopicPhraseResults(List<PublishTopicTestTopicPhraseResults> testTopicPhraseResults) {
    this.testTopicPhraseResults = testTopicPhraseResults;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishTopicTopicsDefinitionsJob publishTopicTopicsDefinitionsJob = (PublishTopicTopicsDefinitionsJob) o;

    return Objects.equals(this.id, publishTopicTopicsDefinitionsJob.id) &&
            Objects.equals(this.state, publishTopicTopicsDefinitionsJob.state) &&
            Objects.equals(this.testTopicPhraseResults, publishTopicTopicsDefinitionsJob.testTopicPhraseResults);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, testTopicPhraseResults);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishTopicTopicsDefinitionsJob {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    testTopicPhraseResults: ").append(toIndentedString(testTopicPhraseResults)).append("\n");
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

