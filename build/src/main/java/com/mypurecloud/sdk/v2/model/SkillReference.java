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
 * A skill reference extracted from the expression
 */
@ApiModel(description = "A skill reference extracted from the expression")

public class SkillReference  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Boolean isLanguageSkill = null;

  public SkillReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public SkillReference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Skill UUID
   **/
  public SkillReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "12345678-1234-1234-1234-123456789012", value = "Skill UUID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Skill name
   **/
  public SkillReference name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "Skill-1", value = "Skill name")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Whether this is a language skill
   **/
  public SkillReference isLanguageSkill(Boolean isLanguageSkill) {
    this.isLanguageSkill = isLanguageSkill;
    return this;
  }
  
  @ApiModelProperty(example = "false", value = "Whether this is a language skill")
  @JsonProperty("isLanguageSkill")
  public Boolean getIsLanguageSkill() {
    return isLanguageSkill;
  }
  public void setIsLanguageSkill(Boolean isLanguageSkill) {
    this.isLanguageSkill = isLanguageSkill;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SkillReference skillReference = (SkillReference) o;

    return Objects.equals(this.id, skillReference.id) &&
            Objects.equals(this.name, skillReference.name) &&
            Objects.equals(this.isLanguageSkill, skillReference.isLanguageSkill);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, isLanguageSkill);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SkillReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    isLanguageSkill: ").append(toIndentedString(isLanguageSkill)).append("\n");
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

