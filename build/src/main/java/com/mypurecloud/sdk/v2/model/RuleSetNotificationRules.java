package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.RuleSetNotificationActions;
import com.mypurecloud.sdk.v2.model.RuleSetNotificationConditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RuleSetNotificationRules
 */

public class RuleSetNotificationRules  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Integer order = null;

  /**
   * Gets or Sets category
   */
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
  private List<RuleSetNotificationConditions> conditions = new ArrayList<RuleSetNotificationConditions>();
  private List<RuleSetNotificationActions> actions = new ArrayList<RuleSetNotificationActions>();
  private Object additionalProperties = null;

  
  /**
   **/
  public RuleSetNotificationRules id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  public RuleSetNotificationRules name(String name) {
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
   **/
  public RuleSetNotificationRules order(Integer order) {
    this.order = order;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("order")
  public Integer getOrder() {
    return order;
  }
  public void setOrder(Integer order) {
    this.order = order;
  }

  
  /**
   **/
  public RuleSetNotificationRules category(CategoryEnum category) {
    this.category = category;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("category")
  public CategoryEnum getCategory() {
    return category;
  }
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }

  
  /**
   **/
  public RuleSetNotificationRules conditions(List<RuleSetNotificationConditions> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("conditions")
  public List<RuleSetNotificationConditions> getConditions() {
    return conditions;
  }
  public void setConditions(List<RuleSetNotificationConditions> conditions) {
    this.conditions = conditions;
  }

  
  /**
   **/
  public RuleSetNotificationRules actions(List<RuleSetNotificationActions> actions) {
    this.actions = actions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("actions")
  public List<RuleSetNotificationActions> getActions() {
    return actions;
  }
  public void setActions(List<RuleSetNotificationActions> actions) {
    this.actions = actions;
  }

  
  /**
   **/
  public RuleSetNotificationRules additionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Object getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Object additionalProperties) {
    this.additionalProperties = additionalProperties;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetNotificationRules ruleSetNotificationRules = (RuleSetNotificationRules) o;
    return Objects.equals(this.id, ruleSetNotificationRules.id) &&
        Objects.equals(this.name, ruleSetNotificationRules.name) &&
        Objects.equals(this.order, ruleSetNotificationRules.order) &&
        Objects.equals(this.category, ruleSetNotificationRules.category) &&
        Objects.equals(this.conditions, ruleSetNotificationRules.conditions) &&
        Objects.equals(this.actions, ruleSetNotificationRules.actions) &&
        Objects.equals(this.additionalProperties, ruleSetNotificationRules.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, order, category, conditions, actions, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetNotificationRules {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

