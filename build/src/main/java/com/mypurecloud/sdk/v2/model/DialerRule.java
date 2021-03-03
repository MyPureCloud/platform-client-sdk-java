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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.Condition;
import com.mypurecloud.sdk.v2.model.DialerAction;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerRule
 */

public class DialerRule  implements Serializable {
  
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
  private List<Condition> conditions = new ArrayList<Condition>();
  private List<DialerAction> actions = new ArrayList<DialerAction>();

  
  @ApiModelProperty(example = "null", value = "The identifier of the rule.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the rule.
   **/
  public DialerRule name(String name) {
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
  public DialerRule order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The ranked order of the rule. Rules are processed from lowest number to highest.")
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
  public DialerRule category(CategoryEnum category) {
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
   * A list of Conditions. All of the Conditions must evaluate to true to trigger the actions.
   **/
  public DialerRule conditions(List<Condition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of Conditions. All of the Conditions must evaluate to true to trigger the actions.")
  @JsonProperty("conditions")
  public List<Condition> getConditions() {
    return conditions;
  }
  public void setConditions(List<Condition> conditions) {
    this.conditions = conditions;
  }

  
  /**
   * The list of actions to be taken if the conditions are true.
   **/
  public DialerRule actions(List<DialerAction> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The list of actions to be taken if the conditions are true.")
  @JsonProperty("actions")
  public List<DialerAction> getActions() {
    return actions;
  }
  public void setActions(List<DialerAction> actions) {
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
    DialerRule dialerRule = (DialerRule) o;
    return Objects.equals(this.id, dialerRule.id) &&
        Objects.equals(this.name, dialerRule.name) &&
        Objects.equals(this.order, dialerRule.order) &&
        Objects.equals(this.category, dialerRule.category) &&
        Objects.equals(this.conditions, dialerRule.conditions) &&
        Objects.equals(this.actions, dialerRule.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, category, conditions, actions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerRule {\n");
    
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

