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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DynamicGroupSkillCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DynamicGroupLanguageSkillCondition
 */

public class DynamicGroupLanguageSkillCondition  implements Serializable {
  
  private String languageSkill = null;

  private static class ComparatorEnumDeserializer extends StdDeserializer<ComparatorEnum> {
    public ComparatorEnumDeserializer() {
      super(ComparatorEnumDeserializer.class);
    }

    @Override
    public ComparatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ComparatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Comparator that will be applied to the proficiency
   */
 @JsonDeserialize(using = ComparatorEnumDeserializer.class)
  public enum ComparatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EQUALTO("EqualTo"),
    NOTEQUALTO("NotEqualTo"),
    LESSTHAN("LessThan"),
    GREATERTHAN("GreaterThan"),
    GREATERTHANOREQUALTO("GreaterThanOrEqualTo"),
    LESSTHANOREQUALTO("LessThanOrEqualTo");

    private String value;

    ComparatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ComparatorEnum fromString(String key) {
      if (key == null) return null;

      for (ComparatorEnum value : ComparatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ComparatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ComparatorEnum comparator = null;
  private Integer proficiency = null;
  private List<DynamicGroupSkillCondition> childConditions = null;

  public DynamicGroupLanguageSkillCondition() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      childConditions = new ArrayList<DynamicGroupSkillCondition>();
    }
  }

  
  /**
   * The language skill to be used in the skill condition query
   **/
  public DynamicGroupLanguageSkillCondition languageSkill(String languageSkill) {
    this.languageSkill = languageSkill;
    return this;
  }
  
  @ApiModelProperty(example = "English-Written", required = true, value = "The language skill to be used in the skill condition query")
  @JsonProperty("languageSkill")
  public String getLanguageSkill() {
    return languageSkill;
  }
  public void setLanguageSkill(String languageSkill) {
    this.languageSkill = languageSkill;
  }


  /**
   * Comparator that will be applied to the proficiency
   **/
  public DynamicGroupLanguageSkillCondition comparator(ComparatorEnum comparator) {
    this.comparator = comparator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Comparator that will be applied to the proficiency")
  @JsonProperty("comparator")
  public ComparatorEnum getComparator() {
    return comparator;
  }
  public void setComparator(ComparatorEnum comparator) {
    this.comparator = comparator;
  }


  /**
   * The skill proficiency that will be used for the language skill. Integer range 0-5
   **/
  public DynamicGroupLanguageSkillCondition proficiency(Integer proficiency) {
    this.proficiency = proficiency;
    return this;
  }
  
  @ApiModelProperty(example = "5", required = true, value = "The skill proficiency that will be used for the language skill. Integer range 0-5")
  @JsonProperty("proficiency")
  public Integer getProficiency() {
    return proficiency;
  }
  public void setProficiency(Integer proficiency) {
    this.proficiency = proficiency;
  }


  /**
   * Nested conditions to be applied to this skill condition
   **/
  public DynamicGroupLanguageSkillCondition childConditions(List<DynamicGroupSkillCondition> childConditions) {
    this.childConditions = childConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Nested conditions to be applied to this skill condition")
  @JsonProperty("childConditions")
  public List<DynamicGroupSkillCondition> getChildConditions() {
    return childConditions;
  }
  public void setChildConditions(List<DynamicGroupSkillCondition> childConditions) {
    this.childConditions = childConditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DynamicGroupLanguageSkillCondition dynamicGroupLanguageSkillCondition = (DynamicGroupLanguageSkillCondition) o;

    return Objects.equals(this.languageSkill, dynamicGroupLanguageSkillCondition.languageSkill) &&
            Objects.equals(this.comparator, dynamicGroupLanguageSkillCondition.comparator) &&
            Objects.equals(this.proficiency, dynamicGroupLanguageSkillCondition.proficiency) &&
            Objects.equals(this.childConditions, dynamicGroupLanguageSkillCondition.childConditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageSkill, comparator, proficiency, childConditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicGroupLanguageSkillCondition {\n");
    
    sb.append("    languageSkill: ").append(toIndentedString(languageSkill)).append("\n");
    sb.append("    comparator: ").append(toIndentedString(comparator)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
    sb.append("    childConditions: ").append(toIndentedString(childConditions)).append("\n");
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

