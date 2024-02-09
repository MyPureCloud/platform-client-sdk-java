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
import com.mypurecloud.sdk.v2.model.DocumentBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * KnowledgeParseRecord
 */

public class KnowledgeParseRecord  implements Serializable {
  
  private String id = null;
  private String title = null;
  private DocumentBody body = null;

  
  /**
   * Unique id for the parsed data.
   **/
  public KnowledgeParseRecord id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Unique id for the parsed data.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Parsed article title.
   **/
  public KnowledgeParseRecord title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parsed article title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Parsed article content.
   **/
  public KnowledgeParseRecord body(DocumentBody body) {
    this.body = body;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Parsed article content.")
  @JsonProperty("body")
  public DocumentBody getBody() {
    return body;
  }
  public void setBody(DocumentBody body) {
    this.body = body;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KnowledgeParseRecord knowledgeParseRecord = (KnowledgeParseRecord) o;

    return Objects.equals(this.id, knowledgeParseRecord.id) &&
            Objects.equals(this.title, knowledgeParseRecord.title) &&
            Objects.equals(this.body, knowledgeParseRecord.body);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, body);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KnowledgeParseRecord {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

