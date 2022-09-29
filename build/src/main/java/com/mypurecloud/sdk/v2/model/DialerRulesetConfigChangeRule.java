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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeAction;
import com.mypurecloud.sdk.v2.model.DialerRulesetConfigChangeCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerRulesetConfigChangeRule
 */

public class DialerRulesetConfigChangeRule  implements Serializable {
  
  private List<DialerRulesetConfigChangeCondition> conditions = null;
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
   * The category of the rule
   */
 @JsonDeserialize(using = CategoryEnumDeserializer.class)
  public enum CategoryEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIALER_PRECALL("DIALER_PRECALL"),
    DIALER_WRAPUP("DIALER_WRAPUP");

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
  private List<DialerRulesetConfigChangeAction> actions = null;

  
  /**
   * The list of rule conditions; all must evaluate to true to trigger the rule actions
   **/
  public DialerRulesetConfigChangeRule conditions(List<DialerRulesetConfigChangeCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of rule conditions; all must evaluate to true to trigger the rule actions")
  @JsonProperty("conditions")
  public List<DialerRulesetConfigChangeCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<DialerRulesetConfigChangeCondition> conditions) {
    this.conditions = conditions;
  }


  /**
   * The identifier of the rule
   **/
  public DialerRulesetConfigChangeRule id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier of the rule")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the rule
   **/
  public DialerRulesetConfigChangeRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the rule")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The ranked order of the rule; rules are processed from lowest number to highest
   **/
  public DialerRulesetConfigChangeRule order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ranked order of the rule; rules are processed from lowest number to highest")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }


  /**
   * The category of the rule
   **/
  public DialerRulesetConfigChangeRule category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The category of the rule")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  /**
   * The list of rule actions to be taken if the conditions are true
   **/
  public DialerRulesetConfigChangeRule actions(List<DialerRulesetConfigChangeAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of rule actions to be taken if the conditions are true")
  @JsonProperty("actions")
  public List<DialerRulesetConfigChangeAction> getActions() {
    return actions;
  }
  public void setActions(List<DialerRulesetConfigChangeAction> actions) {
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
    DialerRulesetConfigChangeRule dialerRulesetConfigChangeRule = (DialerRulesetConfigChangeRule) o;

    return Objects.equals(this.conditions, dialerRulesetConfigChangeRule.conditions) &&
            Objects.equals(this.id, dialerRulesetConfigChangeRule.id) &&
            Objects.equals(this.name, dialerRulesetConfigChangeRule.name) &&
            Objects.equals(this.order, dialerRulesetConfigChangeRule.order) &&
            Objects.equals(this.category, dialerRulesetConfigChangeRule.category) &&
            Objects.equals(this.actions, dialerRulesetConfigChangeRule.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, id, name, order, category, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRulesetConfigChangeRule {\n");
    
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

