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
import com.mypurecloud.sdk.v2.model.EnrichFieldRule;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EnrichFieldRules
 */

public class EnrichFieldRules  implements Serializable {
  

  private static class DefaultActionEnumDeserializer extends StdDeserializer<DefaultActionEnum> {
    public DefaultActionEnumDeserializer() {
      super(DefaultActionEnumDeserializer.class);
    }

    @Override
    public DefaultActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DefaultActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Default behavior for combining data from the submitted request with any entity found in the database. The default behavior if unspecified is `PreferProvided`, meaning any non-null fields in the submitted request will override data in the database, but all null fields will remain unchanged. Omitting a field in the request payload means that it will be treated as null.
   */
 @JsonDeserialize(using = DefaultActionEnumDeserializer.class)
  public enum DefaultActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALWAYSUSEPROVIDED("AlwaysUseProvided"),
    PREFEREXISTING("PreferExisting"),
    PREFERPROVIDED("PreferProvided");

    private String value;

    DefaultActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DefaultActionEnum fromString(String key) {
      if (key == null) return null;

      for (DefaultActionEnum value : DefaultActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DefaultActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DefaultActionEnum defaultAction = null;
  private List<EnrichFieldRule> rules = null;

  private static class DefaultArrayActionEnumDeserializer extends StdDeserializer<DefaultArrayActionEnum> {
    public DefaultArrayActionEnumDeserializer() {
      super(DefaultArrayActionEnumDeserializer.class);
    }

    @Override
    public DefaultArrayActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DefaultArrayActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Default behavior for combining items in array field from the submitted request with any array entity found in the database. The default behavior if unspecified is `fill`, meaning the field value will always be the partial concatenation of both the array in the Database and the array in the contact body, up to the size limit of the array
   */
 @JsonDeserialize(using = DefaultArrayActionEnumDeserializer.class)
  public enum DefaultArrayActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REPLACE("Replace"),
    EXTEND("Extend"),
    FILL("Fill");

    private String value;

    DefaultArrayActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DefaultArrayActionEnum fromString(String key) {
      if (key == null) return null;

      for (DefaultArrayActionEnum value : DefaultArrayActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DefaultArrayActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DefaultArrayActionEnum defaultArrayAction = null;

  public EnrichFieldRules() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      rules = new ArrayList<EnrichFieldRule>();
    }
  }

  
  /**
   * Default behavior for combining data from the submitted request with any entity found in the database. The default behavior if unspecified is `PreferProvided`, meaning any non-null fields in the submitted request will override data in the database, but all null fields will remain unchanged. Omitting a field in the request payload means that it will be treated as null.
   **/
  public EnrichFieldRules defaultAction(DefaultActionEnum defaultAction) {
    this.defaultAction = defaultAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default behavior for combining data from the submitted request with any entity found in the database. The default behavior if unspecified is `PreferProvided`, meaning any non-null fields in the submitted request will override data in the database, but all null fields will remain unchanged. Omitting a field in the request payload means that it will be treated as null.")
  @JsonProperty("defaultAction")
  public DefaultActionEnum getDefaultAction() {
    return defaultAction;
  }
  public void setDefaultAction(DefaultActionEnum defaultAction) {
    this.defaultAction = defaultAction;
  }


  /**
   * Field-specific behaviors for how to combine data from different sources. For example, you can set a `defaultAction` of `PreferProvided`, but use different behaviors such as `AlwaysUseProvided` or `PreferExisting` for specific fields.
   **/
  public EnrichFieldRules rules(List<EnrichFieldRule> rules) {
    this.rules = rules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Field-specific behaviors for how to combine data from different sources. For example, you can set a `defaultAction` of `PreferProvided`, but use different behaviors such as `AlwaysUseProvided` or `PreferExisting` for specific fields.")
  @JsonProperty("rules")
  public List<EnrichFieldRule> getRules() {
    return rules;
  }
  public void setRules(List<EnrichFieldRule> rules) {
    this.rules = rules;
  }


  /**
   * Default behavior for combining items in array field from the submitted request with any array entity found in the database. The default behavior if unspecified is `fill`, meaning the field value will always be the partial concatenation of both the array in the Database and the array in the contact body, up to the size limit of the array
   **/
  public EnrichFieldRules defaultArrayAction(DefaultArrayActionEnum defaultArrayAction) {
    this.defaultArrayAction = defaultArrayAction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Default behavior for combining items in array field from the submitted request with any array entity found in the database. The default behavior if unspecified is `fill`, meaning the field value will always be the partial concatenation of both the array in the Database and the array in the contact body, up to the size limit of the array")
  @JsonProperty("defaultArrayAction")
  public DefaultArrayActionEnum getDefaultArrayAction() {
    return defaultArrayAction;
  }
  public void setDefaultArrayAction(DefaultArrayActionEnum defaultArrayAction) {
    this.defaultArrayAction = defaultArrayAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnrichFieldRules enrichFieldRules = (EnrichFieldRules) o;

    return Objects.equals(this.defaultAction, enrichFieldRules.defaultAction) &&
            Objects.equals(this.rules, enrichFieldRules.rules) &&
            Objects.equals(this.defaultArrayAction, enrichFieldRules.defaultArrayAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultAction, rules, defaultArrayAction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnrichFieldRules {\n");
    
    sb.append("    defaultAction: ").append(toIndentedString(defaultAction)).append("\n");
    sb.append("    rules: ").append(toIndentedString(rules)).append("\n");
    sb.append("    defaultArrayAction: ").append(toIndentedString(defaultArrayAction)).append("\n");
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

