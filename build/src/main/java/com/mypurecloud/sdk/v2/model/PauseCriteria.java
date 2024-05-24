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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * PauseCriteria
 */

public class PauseCriteria  implements Serializable {
  
  private String urlFragment = null;

  private static class ConditionEnumDeserializer extends StdDeserializer<ConditionEnum> {
    public ConditionEnumDeserializer() {
      super(ConditionEnumDeserializer.class);
    }

    @Override
    public ConditionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ConditionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets condition
   */
 @JsonDeserialize(using = ConditionEnumDeserializer.class)
  public enum ConditionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INCLUDES("Includes"),
    DOESNOTINCLUDE("DoesNotInclude"),
    STARTSWITH("StartsWith"),
    ENDSWITH("EndsWith"),
    EQUALS("Equals");

    private String value;

    ConditionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ConditionEnum fromString(String key) {
      if (key == null) return null;

      for (ConditionEnum value : ConditionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ConditionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ConditionEnum condition = null;

  
  /**
   **/
  public PauseCriteria urlFragment(String urlFragment) {
    this.urlFragment = urlFragment;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("urlFragment")
  public String getUrlFragment() {
    return urlFragment;
  }
  public void setUrlFragment(String urlFragment) {
    this.urlFragment = urlFragment;
  }


  /**
   **/
  public PauseCriteria condition(ConditionEnum condition) {
    this.condition = condition;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("condition")
  public ConditionEnum getCondition() {
    return condition;
  }
  public void setCondition(ConditionEnum condition) {
    this.condition = condition;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PauseCriteria pauseCriteria = (PauseCriteria) o;

    return Objects.equals(this.urlFragment, pauseCriteria.urlFragment) &&
            Objects.equals(this.condition, pauseCriteria.condition);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlFragment, condition);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PauseCriteria {\n");
    
    sb.append("    urlFragment: ").append(toIndentedString(urlFragment)).append("\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
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

