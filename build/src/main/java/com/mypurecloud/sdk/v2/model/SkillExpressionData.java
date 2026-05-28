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
 * Request data for skill expression validation
 */
@ApiModel(description = "Request data for skill expression validation")

public class SkillExpressionData  implements Serializable {
  
  private String expression = null;

  public SkillExpressionData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SkillExpressionData(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The skill expression in raw format to validate
   **/
  public SkillExpressionData expression(String expression) {
    this.expression = expression;
    return this;
  }
  
  @ApiModelProperty(example = "Skill(&quot;iPhone&quot;) &gt;&#x3D; 5 &amp; LanguageSkill(&quot;English&quot;) &gt;&#x3D; 2", required = true, value = "The skill expression in raw format to validate")
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillExpressionData skillExpressionData = (SkillExpressionData) o;

    return Objects.equals(this.expression, skillExpressionData.expression);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expression);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillExpressionData {\n");
    
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
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

