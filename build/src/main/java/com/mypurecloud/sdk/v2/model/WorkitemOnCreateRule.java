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
import com.mypurecloud.sdk.v2.model.WorkitemRuleAction;
import com.mypurecloud.sdk.v2.model.WorktypeReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * WorkitemOnCreateRule
 */

public class WorkitemOnCreateRule  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the rule.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ONCREATE("OnCreate"),
    ONATTRIBUTECHANGE("OnAttributeChange"),
    DATE("Date");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private WorkitemRuleAction action = null;
  private WorktypeReference worktype = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public WorkitemOnCreateRule name(String name) {
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
   * The type of the rule.
   **/
  public WorkitemOnCreateRule type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the rule.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The rules action. If the condition criteria is met this action will be executed.
   **/
  public WorkitemOnCreateRule action(WorkitemRuleAction action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rules action. If the condition criteria is met this action will be executed.")
  @JsonProperty("action")
  public WorkitemRuleAction getAction() {
    return action;
  }
  public void setAction(WorkitemRuleAction action) {
    this.action = action;
  }


  /**
   * The Worktype containing the rule.
   **/
  public WorkitemOnCreateRule worktype(WorktypeReference worktype) {
    this.worktype = worktype;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Worktype containing the rule.")
  @JsonProperty("worktype")
  public WorktypeReference getWorktype() {
    return worktype;
  }
  public void setWorktype(WorktypeReference worktype) {
    this.worktype = worktype;
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
    WorkitemOnCreateRule workitemOnCreateRule = (WorkitemOnCreateRule) o;

    return Objects.equals(this.id, workitemOnCreateRule.id) &&
            Objects.equals(this.name, workitemOnCreateRule.name) &&
            Objects.equals(this.type, workitemOnCreateRule.type) &&
            Objects.equals(this.action, workitemOnCreateRule.action) &&
            Objects.equals(this.worktype, workitemOnCreateRule.worktype) &&
            Objects.equals(this.selfUri, workitemOnCreateRule.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, action, worktype, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WorkitemOnCreateRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    worktype: ").append(toIndentedString(worktype)).append("\n");
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

