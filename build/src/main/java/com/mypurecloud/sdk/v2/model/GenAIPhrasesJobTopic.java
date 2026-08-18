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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * GenAIPhrasesJobTopic
 */

public class GenAIPhrasesJobTopic  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String dialect = null;
  private List<String> phrases = null;

  public GenAIPhrasesJobTopic() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      phrases = new ArrayList<String>();
    }
  }

  public GenAIPhrasesJobTopic(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      phrases = new ArrayList<String>();
    }
  }

  
  /**
   * The topic name
   **/
  public GenAIPhrasesJobTopic name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The topic description
   **/
  public GenAIPhrasesJobTopic description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The topic description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The topic dialect
   **/
  public GenAIPhrasesJobTopic dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The topic dialect")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
  }


  /**
   * Existing phrases for the topic
   **/
  public GenAIPhrasesJobTopic phrases(List<String> phrases) {
    this.phrases = phrases;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Existing phrases for the topic")
  @JsonProperty("phrases")
  public List<String> getPhrases() {
    return phrases;
  }
  public void setPhrases(List<String> phrases) {
    this.phrases = phrases;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GenAIPhrasesJobTopic genAIPhrasesJobTopic = (GenAIPhrasesJobTopic) o;

    return Objects.equals(this.name, genAIPhrasesJobTopic.name) &&
            Objects.equals(this.description, genAIPhrasesJobTopic.description) &&
            Objects.equals(this.dialect, genAIPhrasesJobTopic.dialect) &&
            Objects.equals(this.phrases, genAIPhrasesJobTopic.phrases);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dialect, phrases);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenAIPhrasesJobTopic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
    sb.append("    phrases: ").append(toIndentedString(phrases)).append("\n");
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

