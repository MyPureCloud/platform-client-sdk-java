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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * EntityTypeCriteria
 */

public class EntityTypeCriteria  implements Serializable {
  
  private String key = null;
  private List<String> values = new ArrayList<String>();
  private Boolean shouldIgnoreCase = null;

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
   * The comparison operator.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONTAINSALL("containsAll"),
    CONTAINSANY("containsAny"),
    NOTCONTAINSALL("notContainsAll"),
    NOTCONTAINSANY("notContainsAny"),
    EQUAL("equal"),
    NOTEQUAL("notEqual"),
    GREATERTHAN("greaterThan"),
    GREATERTHANOREQUAL("greaterThanOrEqual"),
    LESSTHAN("lessThan"),
    LESSTHANOREQUAL("lessThanOrEqual"),
    STARTSWITH("startsWith"),
    ENDSWITH("endsWith");

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

  private static class EntityTypeEnumDeserializer extends StdDeserializer<EntityTypeEnum> {
    public EntityTypeEnumDeserializer() {
      super(EntityTypeEnumDeserializer.class);
    }

    @Override
    public EntityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The entity to match the pattern against.
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VISIT("visit");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EntityTypeEnum value : EntityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntityTypeEnum entityType = null;

  
  /**
   * The criteria key.
   **/
  public EntityTypeCriteria key(String key) {
    this.key = key;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The criteria key.")
  @JsonProperty("key")
  public String getKey() {
    return key;
  }
  public void setKey(String key) {
    this.key = key;
  }

  
  /**
   * The criteria values.
   **/
  public EntityTypeCriteria values(List<String> values) {
    this.values = values;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The criteria values.")
  @JsonProperty("values")
  public List<String> getValues() {
    return values;
  }
  public void setValues(List<String> values) {
    this.values = values;
  }

  
  /**
   * Should criteria be case insensitive.
   **/
  public EntityTypeCriteria shouldIgnoreCase(Boolean shouldIgnoreCase) {
    this.shouldIgnoreCase = shouldIgnoreCase;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Should criteria be case insensitive.")
  @JsonProperty("shouldIgnoreCase")
  public Boolean getShouldIgnoreCase() {
    return shouldIgnoreCase;
  }
  public void setShouldIgnoreCase(Boolean shouldIgnoreCase) {
    this.shouldIgnoreCase = shouldIgnoreCase;
  }

  
  /**
   * The comparison operator.
   **/
  public EntityTypeCriteria operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The comparison operator.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * The entity to match the pattern against.
   **/
  public EntityTypeCriteria entityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The entity to match the pattern against.")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }
  public void setEntityType(EntityTypeEnum entityType) {
    this.entityType = entityType;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityTypeCriteria entityTypeCriteria = (EntityTypeCriteria) o;
    return Objects.equals(this.key, entityTypeCriteria.key) &&
        Objects.equals(this.values, entityTypeCriteria.values) &&
        Objects.equals(this.shouldIgnoreCase, entityTypeCriteria.shouldIgnoreCase) &&
        Objects.equals(this.operator, entityTypeCriteria.operator) &&
        Objects.equals(this.entityType, entityTypeCriteria.entityType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, values, shouldIgnoreCase, operator, entityType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityTypeCriteria {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
    sb.append("    shouldIgnoreCase: ").append(toIndentedString(shouldIgnoreCase)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
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

