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
 * A skill expression entity with ID, expression string (raw or normalized), and queue ID
 */
@ApiModel(description = "A skill expression entity with ID, expression string (raw or normalized), and queue ID")

public class SkillExpression  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String expression = null;
  private String queueId = null;
  private String selfUri = null;

  public SkillExpression() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SkillExpression(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public SkillExpression name(String name) {
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
   * The skill expression string (raw or normalized, as requested)
   **/
  public SkillExpression expression(String expression) {
    this.expression = expression;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The skill expression string (raw or normalized, as requested)")
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }


  /**
   * The queue ID where the expression is used
   **/
  public SkillExpression queueId(String queueId) {
    this.queueId = queueId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The queue ID where the expression is used")
  @JsonProperty("queueId")
  public String getQueueId() {
    return queueId;
  }
  public void setQueueId(String queueId) {
    this.queueId = queueId;
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
    SkillExpression skillExpression = (SkillExpression) o;

    return Objects.equals(this.id, skillExpression.id) &&
            Objects.equals(this.name, skillExpression.name) &&
            Objects.equals(this.expression, skillExpression.expression) &&
            Objects.equals(this.queueId, skillExpression.queueId) &&
            Objects.equals(this.selfUri, skillExpression.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, expression, queueId, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillExpression {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
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

