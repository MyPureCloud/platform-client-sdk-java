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
import com.mypurecloud.sdk.v2.model.UsersRulesLockedCriteriaSettingsGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UsersRulesLockedCriteriaSettingsCriteria
 */

public class UsersRulesLockedCriteriaSettingsCriteria  implements Serializable {
  

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator for this criteria
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OR("Or");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private List<UsersRulesLockedCriteriaSettingsGroup> group = null;

  public UsersRulesLockedCriteriaSettingsCriteria() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      group = new ArrayList<UsersRulesLockedCriteriaSettingsGroup>();
    }
  }

  
  /**
   * The operator for this criteria
   **/
  public UsersRulesLockedCriteriaSettingsCriteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operator for this criteria")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The user selection groups for this criteria
   **/
  public UsersRulesLockedCriteriaSettingsCriteria group(List<UsersRulesLockedCriteriaSettingsGroup> group) {
    this.group = group;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user selection groups for this criteria")
  @JsonProperty("group")
  public List<UsersRulesLockedCriteriaSettingsGroup> getGroup() {
    return group;
  }
  public void setGroup(List<UsersRulesLockedCriteriaSettingsGroup> group) {
    this.group = group;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsersRulesLockedCriteriaSettingsCriteria usersRulesLockedCriteriaSettingsCriteria = (UsersRulesLockedCriteriaSettingsCriteria) o;

    return Objects.equals(this.operator, usersRulesLockedCriteriaSettingsCriteria.operator) &&
            Objects.equals(this.group, usersRulesLockedCriteriaSettingsCriteria.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsersRulesLockedCriteriaSettingsCriteria {\n");
    
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
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

