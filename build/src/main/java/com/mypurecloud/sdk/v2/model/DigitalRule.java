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
import com.mypurecloud.sdk.v2.model.DigitalAction;
import com.mypurecloud.sdk.v2.model.DigitalCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DigitalRule
 */

public class DigitalRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer order = null;

  private static class CategoryEnumDeserializer extends StdDeserializer<CategoryEnum> {
    public CategoryEnumDeserializer() {
      super(CategoryEnumDeserializer.class);
    }

    @Override
    public CategoryEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CategoryEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The category of the rule.
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PRECONTACT("PreContact"),
    POSTCONTACT("PostContact");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CategoryEnum fromString(String key) {
      if (key == null) return null;

      for (CategoryEnum value : CategoryEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CategoryEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CategoryEnum category = null;
  private List<DigitalCondition> conditions = null;
  private List<DigitalAction> actions = null;

  public DigitalRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditions = new ArrayList<DigitalCondition>();
      actions = new ArrayList<DigitalAction>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The identifier of the rule.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the rule.
   **/
  public DigitalRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the rule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The ranked order of the rule. Rules are processed from lowest number to highest.
   **/
  public DigitalRule order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ranked order of the rule. Rules are processed from lowest number to highest.")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }


  /**
   * The category of the rule.
   **/
  public DigitalRule category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The category of the rule.")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * A list of conditions to evaluate. All of the Conditions must evaluate to true to trigger the actions.
   **/
  public DigitalRule conditions(List<DigitalCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of conditions to evaluate. All of the Conditions must evaluate to true to trigger the actions.")
  @JsonProperty("conditions")
  public List<DigitalCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<DigitalCondition> conditions) {
    this.conditions = conditions;
  }


  /**
   * The list of actions to be taken if all conditions are true.
   **/
  public DigitalRule actions(List<DigitalAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of actions to be taken if all conditions are true.")
  @JsonProperty("actions")
  public List<DigitalAction> getActions() {
    return actions;
  }
  public void setActions(List<DigitalAction> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DigitalRule digitalRule = (DigitalRule) o;

    return Objects.equals(this.id, digitalRule.id) &&
            Objects.equals(this.name, digitalRule.name) &&
            Objects.equals(this.order, digitalRule.order) &&
            Objects.equals(this.category, digitalRule.category) &&
            Objects.equals(this.conditions, digitalRule.conditions) &&
            Objects.equals(this.actions, digitalRule.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, category, conditions, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DigitalRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

