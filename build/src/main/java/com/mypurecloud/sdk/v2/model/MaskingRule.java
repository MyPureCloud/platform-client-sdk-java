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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * MaskingRule
 */

public class MaskingRule  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private String substituteCharacter = null;
  private String definition = null;
  private Boolean enabled = null;

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
   * Masking rule type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CUSTOM("Custom"),
    PREDEFINED("Predefined"),
    DEFAULT("Default");

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
  private List<String> integrations = new ArrayList<String>();
  private Date dateCreated = null;
  private Date dateModified = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Masking rule name.
   **/
  public MaskingRule name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Masking rule name.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Description about masking rule.
   **/
  public MaskingRule description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Description about masking rule.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Replacement character for masked text character.
   **/
  public MaskingRule substituteCharacter(String substituteCharacter) {
    this.substituteCharacter = substituteCharacter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Replacement character for masked text character.")
  @JsonProperty("substituteCharacter")
  public String getSubstituteCharacter() {
    return substituteCharacter;
  }
  public void setSubstituteCharacter(String substituteCharacter) {
    this.substituteCharacter = substituteCharacter;
  }


  /**
   * Definition of masking rule (a valid regex or builtin AI based mask name).
   **/
  public MaskingRule definition(String definition) {
    this.definition = definition;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Definition of masking rule (a valid regex or builtin AI based mask name).")
  @JsonProperty("definition")
  public String getDefinition() {
    return definition;
  }
  public void setDefinition(String definition) {
    this.definition = definition;
  }


  /**
   * True/False
   **/
  public MaskingRule enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "True/False")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * Masking rule type
   **/
  public MaskingRule type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Masking rule type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Associated integration channels
   **/
  public MaskingRule integrations(List<String> integrations) {
    this.integrations = integrations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Associated integration channels")
  @JsonProperty("integrations")
  public List<String> getIntegrations() {
    return integrations;
  }
  public void setIntegrations(List<String> integrations) {
    this.integrations = integrations;
  }


  @ApiModelProperty(example = "null", value = "Date when the rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "Date when the rule was modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MaskingRule maskingRule = (MaskingRule) o;

    return Objects.equals(this.id, maskingRule.id) &&
            Objects.equals(this.name, maskingRule.name) &&
            Objects.equals(this.description, maskingRule.description) &&
            Objects.equals(this.substituteCharacter, maskingRule.substituteCharacter) &&
            Objects.equals(this.definition, maskingRule.definition) &&
            Objects.equals(this.enabled, maskingRule.enabled) &&
            Objects.equals(this.type, maskingRule.type) &&
            Objects.equals(this.integrations, maskingRule.integrations) &&
            Objects.equals(this.dateCreated, maskingRule.dateCreated) &&
            Objects.equals(this.dateModified, maskingRule.dateModified);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, substituteCharacter, definition, enabled, type, integrations, dateCreated, dateModified);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MaskingRule {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    substituteCharacter: ").append(toIndentedString(substituteCharacter)).append("\n");
    sb.append("    definition: ").append(toIndentedString(definition)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    integrations: ").append(toIndentedString(integrations)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

