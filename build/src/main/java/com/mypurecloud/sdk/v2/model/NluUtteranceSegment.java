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
import com.mypurecloud.sdk.v2.model.NamedEntityAnnotation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NluUtteranceSegment
 */

public class NluUtteranceSegment  implements Serializable {
  
  private String text = null;
  private NamedEntityAnnotation entity = null;

  
  /**
   * The text of the segment.
   **/
  public NluUtteranceSegment text(String text) {
    this.text = text;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The text of the segment.")
  @JsonProperty("text")
  public String getText() {
    return text;
  }
  public void setText(String text) {
    this.text = text;
  }

  
  /**
   * The entity annotation of the segment.
   **/
  public NluUtteranceSegment entity(NamedEntityAnnotation entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity annotation of the segment.")
  @JsonProperty("entity")
  public NamedEntityAnnotation getEntity() {
    return entity;
  }
  public void setEntity(NamedEntityAnnotation entity) {
    this.entity = entity;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluUtteranceSegment nluUtteranceSegment = (NluUtteranceSegment) o;
    return Objects.equals(this.text, nluUtteranceSegment.text) &&
        Objects.equals(this.entity, nluUtteranceSegment.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluUtteranceSegment {\n");
    
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    entity: ").append(toIndentedString(entity)).append("\n");
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

