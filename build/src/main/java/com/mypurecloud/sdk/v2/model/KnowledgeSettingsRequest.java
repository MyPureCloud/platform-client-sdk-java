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
import com.mypurecloud.sdk.v2.model.KnowledgeGenerationSetting;
import com.mypurecloud.sdk.v2.model.V3SourceRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * KnowledgeSettingsRequest
 */

public class KnowledgeSettingsRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private List<V3SourceRef> sources = null;
  private KnowledgeGenerationSetting generationSetting = null;
  private Boolean stateful = null;

  public KnowledgeSettingsRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sources = new ArrayList<V3SourceRef>();
    }
  }

  
  /**
   * Knowledge setting name.
   **/
  public KnowledgeSettingsRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge setting name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Knowledge setting description.
   **/
  public KnowledgeSettingsRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Knowledge setting description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Knowledge source information to search upon.
   **/
  public KnowledgeSettingsRequest sources(List<V3SourceRef> sources) {
    this.sources = sources;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Knowledge source information to search upon.")
  @JsonProperty("sources")
  public List<V3SourceRef> getSources() {
    return sources;
  }
  public void setSources(List<V3SourceRef> sources) {
    this.sources = sources;
  }


  /**
   * Setting for answer generation.
   **/
  public KnowledgeSettingsRequest generationSetting(KnowledgeGenerationSetting generationSetting) {
    this.generationSetting = generationSetting;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Setting for answer generation.")
  @JsonProperty("generationSetting")
  public KnowledgeGenerationSetting getGenerationSetting() {
    return generationSetting;
  }
  public void setGenerationSetting(KnowledgeGenerationSetting generationSetting) {
    this.generationSetting = generationSetting;
  }


  /**
   * Indicates if stateful search and generation is enabled for the knowledge setting.
   **/
  public KnowledgeSettingsRequest stateful(Boolean stateful) {
    this.stateful = stateful;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if stateful search and generation is enabled for the knowledge setting.")
  @JsonProperty("stateful")
  public Boolean getStateful() {
    return stateful;
  }
  public void setStateful(Boolean stateful) {
    this.stateful = stateful;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeSettingsRequest knowledgeSettingsRequest = (KnowledgeSettingsRequest) o;

    return Objects.equals(this.name, knowledgeSettingsRequest.name) &&
            Objects.equals(this.description, knowledgeSettingsRequest.description) &&
            Objects.equals(this.sources, knowledgeSettingsRequest.sources) &&
            Objects.equals(this.generationSetting, knowledgeSettingsRequest.generationSetting) &&
            Objects.equals(this.stateful, knowledgeSettingsRequest.stateful);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, sources, generationSetting, stateful);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeSettingsRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
    sb.append("    generationSetting: ").append(toIndentedString(generationSetting)).append("\n");
    sb.append("    stateful: ").append(toIndentedString(stateful)).append("\n");
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

