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

import java.io.Serializable;
/**
 * AuditQueryFilter
 */

public class AuditQueryFilter  implements Serializable {
  

  private static class PropertyEnumDeserializer extends StdDeserializer<PropertyEnum> {
    public PropertyEnumDeserializer() {
      super(PropertyEnumDeserializer.class);
    }

    @Override
    public PropertyEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PropertyEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the property to filter.
   */
 @JsonDeserialize(using = PropertyEnumDeserializer.class)
  public enum PropertyEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    USERID("UserId"),
    TRUSTEEORGANIZATIONID("TrusteeOrganizationId"),
    CLIENTID("ClientId"),
    ACTION("Action"),
    ENTITYTYPE("EntityType"),
    ENTITYID("EntityId");

    private String value;

    PropertyEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PropertyEnum fromString(String key) {
      if (key == null) return null;

      for (PropertyEnum value : PropertyEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PropertyEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PropertyEnum property = null;
  private String value = null;

  
  /**
   * Name of the property to filter.
   **/
  public AuditQueryFilter property(PropertyEnum property) {
    this.property = property;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the property to filter.")
  @JsonProperty("property")
  public PropertyEnum getProperty() {
    return property;
  }
  public void setProperty(PropertyEnum property) {
    this.property = property;
  }

  
  /**
   * Value of the property to filter.
   **/
  public AuditQueryFilter value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Value of the property to filter.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryFilter auditQueryFilter = (AuditQueryFilter) o;
    return Objects.equals(this.property, auditQueryFilter.property) &&
        Objects.equals(this.value, auditQueryFilter.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(property, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryFilter {\n");
    
    sb.append("    property: ").append(toIndentedString(property)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

