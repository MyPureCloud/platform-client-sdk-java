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
import com.mypurecloud.sdk.v2.model.NamedEntityTypeItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NamedEntityTypeMechanism
 */

public class NamedEntityTypeMechanism  implements Serializable {
  
  private List<NamedEntityTypeItem> items = new ArrayList<NamedEntityTypeItem>();
  private Boolean restricted = null;

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
   * The type of the mechanism.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DYNAMICLIST("DynamicList"),
    LIST("List"),
    REGEX("Regex"),
    UNKNOWN("Unknown");

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

  
  /**
   * The items that define the named entity type.
   **/
  public NamedEntityTypeMechanism items(List<NamedEntityTypeItem> items) {
    this.items = items;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The items that define the named entity type.")
  @JsonProperty("items")
  public List<NamedEntityTypeItem> getItems() {
    return items;
  }
  public void setItems(List<NamedEntityTypeItem> items) {
    this.items = items;
  }

  
  /**
   * Whether the named entity type is restricted to the items provided. Default: false
   **/
  public NamedEntityTypeMechanism restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether the named entity type is restricted to the items provided. Default: false")
  @JsonProperty("restricted")
  public Boolean getRestricted() {
    return restricted;
  }
  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }

  
  /**
   * The type of the mechanism.
   **/
  public NamedEntityTypeMechanism type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of the mechanism.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NamedEntityTypeMechanism namedEntityTypeMechanism = (NamedEntityTypeMechanism) o;
    return Objects.equals(this.items, namedEntityTypeMechanism.items) &&
        Objects.equals(this.restricted, namedEntityTypeMechanism.restricted) &&
        Objects.equals(this.type, namedEntityTypeMechanism.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, restricted, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NamedEntityTypeMechanism {\n");
    
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

