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
 * UsageItem
 */

public class UsageItem  implements Serializable {
  

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
   * Gets or Sets type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RECORDING("RECORDING"),
    FAX("FAX"),
    DOCUMENT("DOCUMENT"),
    ALL("ALL");

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
  private Long totalDocumentByteCount = null;
  private Long totalDocumentCount = null;

  
  /**
   **/
  public UsageItem type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   **/
  public UsageItem totalDocumentByteCount(Long totalDocumentByteCount) {
    this.totalDocumentByteCount = totalDocumentByteCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDocumentByteCount")
  public Long getTotalDocumentByteCount() {
    return totalDocumentByteCount;
  }
  public void setTotalDocumentByteCount(Long totalDocumentByteCount) {
    this.totalDocumentByteCount = totalDocumentByteCount;
  }

  
  /**
   **/
  public UsageItem totalDocumentCount(Long totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("totalDocumentCount")
  public Long getTotalDocumentCount() {
    return totalDocumentCount;
  }
  public void setTotalDocumentCount(Long totalDocumentCount) {
    this.totalDocumentCount = totalDocumentCount;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageItem usageItem = (UsageItem) o;
    return Objects.equals(this.type, usageItem.type) &&
        Objects.equals(this.totalDocumentByteCount, usageItem.totalDocumentByteCount) &&
        Objects.equals(this.totalDocumentCount, usageItem.totalDocumentCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, totalDocumentByteCount, totalDocumentCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageItem {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    totalDocumentByteCount: ").append(toIndentedString(totalDocumentByteCount)).append("\n");
    sb.append("    totalDocumentCount: ").append(toIndentedString(totalDocumentCount)).append("\n");
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

