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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RuleSetDiagnostic
 */

public class RuleSetDiagnostic  implements Serializable {
  
  private DomainEntityRef ruleSet = null;

  private static class WarningsEnumDeserializer extends StdDeserializer<WarningsEnum> {
    public WarningsEnumDeserializer() {
      super(WarningsEnumDeserializer.class);
    }

    @Override
    public WarningsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WarningsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets warnings
   */
 @JsonDeserialize(using = WarningsEnumDeserializer.class)
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

  
  @ApiModelProperty(example = "null", value = "A campaign rule set")
  @JsonProperty("ruleSet")
  public DomainEntityRef getRuleSet() {
    return ruleSet;
  }

  
  @ApiModelProperty(example = "null", value = "Diagnostic warnings for the rule set")
  @JsonProperty("warnings")
  public List<WarningsEnum> getWarnings() {
    return warnings;
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

