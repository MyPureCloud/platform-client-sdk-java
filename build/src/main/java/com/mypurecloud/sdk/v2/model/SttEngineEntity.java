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

import java.io.Serializable;
/**
 * SttEngineEntity
 */

public class SttEngineEntity  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean grammarBased = null;
  private String selfUri = null;

  public SttEngineEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public SttEngineEntity name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The STT engine is intended to be used for Grammars
   **/
  public SttEngineEntity grammarBased(Boolean grammarBased) {
    this.grammarBased = grammarBased;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The STT engine is intended to be used for Grammars")
  @JsonProperty("grammarBased")
  public Boolean getGrammarBased() {
    return grammarBased;
  }
  public void setGrammarBased(Boolean grammarBased) {
    this.grammarBased = grammarBased;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SttEngineEntity sttEngineEntity = (SttEngineEntity) o;

    return Objects.equals(this.id, sttEngineEntity.id) &&
            Objects.equals(this.name, sttEngineEntity.name) &&
            Objects.equals(this.grammarBased, sttEngineEntity.grammarBased) &&
            Objects.equals(this.selfUri, sttEngineEntity.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, grammarBased, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SttEngineEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    grammarBased: ").append(toIndentedString(grammarBased)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

