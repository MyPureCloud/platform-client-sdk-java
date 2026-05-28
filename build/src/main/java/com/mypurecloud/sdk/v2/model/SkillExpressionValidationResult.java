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
import com.mypurecloud.sdk.v2.model.SkillExpressionValidationError;
import com.mypurecloud.sdk.v2.model.SkillReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * Result of skill expression validation
 */
@ApiModel(description = "Result of skill expression validation")

public class SkillExpressionValidationResult  implements Serializable {
  
  private Boolean valid = null;
  private String expression = null;
  private List<SkillReference> skills = null;
  private List<SkillExpressionValidationError> errors = null;
  private String hint = null;

  public SkillExpressionValidationResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skills = new ArrayList<SkillReference>();
      errors = new ArrayList<SkillExpressionValidationError>();
    }
  }

  public SkillExpressionValidationResult(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      skills = new ArrayList<SkillReference>();
      errors = new ArrayList<SkillExpressionValidationError>();
    }
  }

  
  /**
   * Whether the expression is valid
   **/
  public SkillExpressionValidationResult valid(Boolean valid) {
    this.valid = valid;
    return this;
  }
  
  @ApiModelProperty(example = "true", value = "Whether the expression is valid")
  @JsonProperty("valid")
  public Boolean getValid() {
    return valid;
  }
  public void setValid(Boolean valid) {
    this.valid = valid;
  }


  /**
   * Normalized SpEL expression (null if validation failed)
   **/
  public SkillExpressionValidationResult expression(String expression) {
    this.expression = expression;
    return this;
  }
  
  @ApiModelProperty(example = "#Skill[&quot;uuid1&quot;] &gt; 5 &amp;&amp; #Skill[&quot;uuid2&quot;] &gt;&#x3D; 0", value = "Normalized SpEL expression (null if validation failed)")
  @JsonProperty("expression")
  public String getExpression() {
    return expression;
  }
  public void setExpression(String expression) {
    this.expression = expression;
  }


  /**
   * List of skill references extracted from the expression (empty if no skills found and/or invalid expression)
   **/
  public SkillExpressionValidationResult skills(List<SkillReference> skills) {
    this.skills = skills;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of skill references extracted from the expression (empty if no skills found and/or invalid expression)")
  @JsonProperty("skills")
  public List<SkillReference> getSkills() {
    return skills;
  }
  public void setSkills(List<SkillReference> skills) {
    this.skills = skills;
  }


  /**
   * List of validation errors (empty if valid)
   **/
  public SkillExpressionValidationResult errors(List<SkillExpressionValidationError> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of validation errors (empty if valid)")
  @JsonProperty("errors")
  public List<SkillExpressionValidationError> getErrors() {
    return errors;
  }
  public void setErrors(List<SkillExpressionValidationError> errors) {
    this.errors = errors;
  }


  /**
   * Optional hint message (e.g., if expression is non-optimal or system is near capacity)
   **/
  public SkillExpressionValidationResult hint(String hint) {
    this.hint = hint;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional hint message (e.g., if expression is non-optimal or system is near capacity)")
  @JsonProperty("hint")
  public String getHint() {
    return hint;
  }
  public void setHint(String hint) {
    this.hint = hint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillExpressionValidationResult skillExpressionValidationResult = (SkillExpressionValidationResult) o;

    return Objects.equals(this.valid, skillExpressionValidationResult.valid) &&
            Objects.equals(this.expression, skillExpressionValidationResult.expression) &&
            Objects.equals(this.skills, skillExpressionValidationResult.skills) &&
            Objects.equals(this.errors, skillExpressionValidationResult.errors) &&
            Objects.equals(this.hint, skillExpressionValidationResult.hint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, expression, skills, errors, hint);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillExpressionValidationResult {\n");
    
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    skills: ").append(toIndentedString(skills)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    hint: ").append(toIndentedString(hint)).append("\n");
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

