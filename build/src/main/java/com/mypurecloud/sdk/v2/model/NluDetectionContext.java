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
import com.mypurecloud.sdk.v2.model.ContextEntity;
import com.mypurecloud.sdk.v2.model.ContextIntent;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NluDetectionContext
 */

public class NluDetectionContext  implements Serializable {
  
  private ContextIntent intent = null;
  private ContextEntity entity = null;

  
  /**
   * Restrict detection to this intent.
   **/
  public NluDetectionContext intent(ContextIntent intent) {
    this.intent = intent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Restrict detection to this intent.")
  @JsonProperty("intent")
  public ContextIntent getIntent() {
    return intent;
  }
  public void setIntent(ContextIntent intent) {
    this.intent = intent;
  }

  
  /**
   * Use this entity to restrict detection.
   **/
  public NluDetectionContext entity(ContextEntity entity) {
    this.entity = entity;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Use this entity to restrict detection.")
  @JsonProperty("entity")
  public ContextEntity getEntity() {
    return entity;
  }
  public void setEntity(ContextEntity entity) {
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
    NluDetectionContext nluDetectionContext = (NluDetectionContext) o;
    return Objects.equals(this.intent, nluDetectionContext.intent) &&
        Objects.equals(this.entity, nluDetectionContext.entity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(intent, entity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluDetectionContext {\n");
    
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
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

