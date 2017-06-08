package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.UriReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RuleSetDiagnostic
 */

public class RuleSetDiagnostic  implements Serializable {
  
  private UriReference ruleSet = null;

  /**
   * Gets or Sets warnings
   */
  public enum WarningsEnum {
    WRAPUP_CODE_NOT_IN_QUEUE("WRAPUP_CODE_NOT_IN_QUEUE"),
    CONTACT_ATTRIBUTE_NOT_IN_CONTACT_LIST("CONTACT_ATTRIBUTE_NOT_IN_CONTACT_LIST"),
    NO_DNC_LIST_FOR_APPEND("NO_DNC_LIST_FOR_APPEND"),
    PHONE_CONDITIONS_WITH_MULTICOLUMN_PREVIEW("PHONE_CONDITIONS_WITH_MULTICOLUMN_PREVIEW");

    private String value;

    WarningsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WarningsEnum fromString(String key) {
      if (key == null) return null;

      for (WarningsEnum value : WarningsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WarningsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<WarningsEnum> warnings = new ArrayList<WarningsEnum>();

  
  /**
   * A campaign rule set
   **/
  public RuleSetDiagnostic ruleSet(UriReference ruleSet) {
    this.ruleSet = ruleSet;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A campaign rule set")
  @JsonProperty("ruleSet")
  public UriReference getRuleSet() {
    return ruleSet;
  }
  public void setRuleSet(UriReference ruleSet) {
    this.ruleSet = ruleSet;
  }

  
  /**
   * Diagnostic warnings for the rule set
   **/
  public RuleSetDiagnostic warnings(List<WarningsEnum> warnings) {
    this.warnings = warnings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Diagnostic warnings for the rule set")
  @JsonProperty("warnings")
  public List<WarningsEnum> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<WarningsEnum> warnings) {
    this.warnings = warnings;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RuleSetDiagnostic ruleSetDiagnostic = (RuleSetDiagnostic) o;
    return Objects.equals(this.ruleSet, ruleSetDiagnostic.ruleSet) &&
        Objects.equals(this.warnings, ruleSetDiagnostic.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ruleSet, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RuleSetDiagnostic {\n");
    
    sb.append("    ruleSet: ").append(toIndentedString(ruleSet)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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

