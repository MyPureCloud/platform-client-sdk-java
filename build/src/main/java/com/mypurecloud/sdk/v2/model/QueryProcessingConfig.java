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
 * QueryProcessingConfig
 */

public class QueryProcessingConfig  implements Serializable {
  

  private static class KnowledgeQueryProcessingEnumDeserializer extends StdDeserializer<KnowledgeQueryProcessingEnum> {
    public KnowledgeQueryProcessingEnumDeserializer() {
      super(KnowledgeQueryProcessingEnumDeserializer.class);
    }

    @Override
    public KnowledgeQueryProcessingEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KnowledgeQueryProcessingEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Knowledge query processing mode applied before retrieval.
   */
 @JsonDeserialize(using = KnowledgeQueryProcessingEnumDeserializer.class)
  public enum KnowledgeQueryProcessingEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLASSIFICATIONONLY("ClassificationOnly"),
    CLASSIFICATIONANDREFORMULATION("ClassificationAndReformulation"),
    NONE("None");

    private String value;

    KnowledgeQueryProcessingEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KnowledgeQueryProcessingEnum fromString(String key) {
      if (key == null) return null;

      for (KnowledgeQueryProcessingEnum value : KnowledgeQueryProcessingEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KnowledgeQueryProcessingEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KnowledgeQueryProcessingEnum knowledgeQueryProcessing = null;

  public QueryProcessingConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public QueryProcessingConfig(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Knowledge query processing mode applied before retrieval.
   **/
  public QueryProcessingConfig knowledgeQueryProcessing(KnowledgeQueryProcessingEnum knowledgeQueryProcessing) {
    this.knowledgeQueryProcessing = knowledgeQueryProcessing;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge query processing mode applied before retrieval.")
  @JsonProperty("knowledgeQueryProcessing")
  public KnowledgeQueryProcessingEnum getKnowledgeQueryProcessing() {
    return knowledgeQueryProcessing;
  }
  public void setKnowledgeQueryProcessing(KnowledgeQueryProcessingEnum knowledgeQueryProcessing) {
    this.knowledgeQueryProcessing = knowledgeQueryProcessing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryProcessingConfig queryProcessingConfig = (QueryProcessingConfig) o;

    return Objects.equals(this.knowledgeQueryProcessing, queryProcessingConfig.knowledgeQueryProcessing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(knowledgeQueryProcessing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryProcessingConfig {\n");
    
    sb.append("    knowledgeQueryProcessing: ").append(toIndentedString(knowledgeQueryProcessing)).append("\n");
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

