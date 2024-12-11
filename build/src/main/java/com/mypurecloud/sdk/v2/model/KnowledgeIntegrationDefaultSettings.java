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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeIntegrationDefaultSettings
 */

public class KnowledgeIntegrationDefaultSettings  implements Serializable {
  
  private String baseUrl = null;

  
  /**
   * The default base URL setting for the integration.
   **/
  public KnowledgeIntegrationDefaultSettings baseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default base URL setting for the integration.")
  @JsonProperty("baseUrl")
  public String getBaseUrl() {
    return baseUrl;
  }
  public void setBaseUrl(String baseUrl) {
    this.baseUrl = baseUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeIntegrationDefaultSettings knowledgeIntegrationDefaultSettings = (KnowledgeIntegrationDefaultSettings) o;

    return Objects.equals(this.baseUrl, knowledgeIntegrationDefaultSettings.baseUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(baseUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeIntegrationDefaultSettings {\n");
    
    sb.append("    baseUrl: ").append(toIndentedString(baseUrl)).append("\n");
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

