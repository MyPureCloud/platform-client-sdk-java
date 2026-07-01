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
 * QueryReformulationContext
 */

public class QueryReformulationContext  implements Serializable {
  

  private static class KnowledgeClassificationEnumDeserializer extends StdDeserializer<KnowledgeClassificationEnum> {
    public KnowledgeClassificationEnumDeserializer() {
      super(KnowledgeClassificationEnumDeserializer.class);
    }

    @Override
    public KnowledgeClassificationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KnowledgeClassificationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The knowledge classification result indicating whether the query is appropriate for knowledge retrieval.
   */
 @JsonDeserialize(using = KnowledgeClassificationEnumDeserializer.class)
  public enum KnowledgeClassificationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    YES("Yes"),
    NO("No"),
    MAYBE("Maybe");

    private String value;

    KnowledgeClassificationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KnowledgeClassificationEnum fromString(String key) {
      if (key == null) return null;

      for (KnowledgeClassificationEnum value : KnowledgeClassificationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KnowledgeClassificationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KnowledgeClassificationEnum knowledgeClassification = null;
  private String reformulatedQuery = null;

  public QueryReformulationContext() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryReformulationContext(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The knowledge classification result indicating whether the query is appropriate for knowledge retrieval.")
  @JsonProperty("knowledgeClassification")
  public KnowledgeClassificationEnum getKnowledgeClassification() {
    return knowledgeClassification;
  }


  @ApiModelProperty(example = "null", value = "The reformulated standalone query optimized for retrieval, if query reformulation was enabled and produced a result.")
  @JsonProperty("reformulatedQuery")
  public String getReformulatedQuery() {
    return reformulatedQuery;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryReformulationContext queryReformulationContext = (QueryReformulationContext) o;

    return Objects.equals(this.knowledgeClassification, queryReformulationContext.knowledgeClassification) &&
            Objects.equals(this.reformulatedQuery, queryReformulationContext.reformulatedQuery);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeClassification, reformulatedQuery);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryReformulationContext {\n");
    
    sb.append("    knowledgeClassification: ").append(toIndentedString(knowledgeClassification)).append("\n");
    sb.append("    reformulatedQuery: ").append(toIndentedString(reformulatedQuery)).append("\n");
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

