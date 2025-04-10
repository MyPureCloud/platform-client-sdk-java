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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * A Genesys Cloud resource created or modified as a result of running an accelerator
 */
@ApiModel(description = "A Genesys Cloud resource created or modified as a result of running an accelerator")

public class MetadataResultEntity  implements Serializable {
  
  private String type = null;
  private String description = null;

  private static class VisibilityEnumDeserializer extends StdDeserializer<VisibilityEnum> {
    public VisibilityEnumDeserializer() {
      super(VisibilityEnumDeserializer.class);
    }

    @Override
    public VisibilityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VisibilityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * whether the modified resource is visible or hidden
   */
 @JsonDeserialize(using = VisibilityEnumDeserializer.class)
  public enum VisibilityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    VISIBLE("Visible"),
    HIDDEN("Hidden");

    private String value;

    VisibilityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VisibilityEnum fromString(String key) {
      if (key == null) return null;

      for (VisibilityEnum value : VisibilityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VisibilityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VisibilityEnum visibility = null;

  public MetadataResultEntity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "object type of the modified resource")
  @JsonProperty("type")
  public String getType() {
    return type;
  }


  @ApiModelProperty(example = "null", value = "description of the modified resource")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }


  @ApiModelProperty(example = "null", value = "whether the modified resource is visible or hidden")
  @JsonProperty("visibility")
  public VisibilityEnum getVisibility() {
    return visibility;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetadataResultEntity metadataResultEntity = (MetadataResultEntity) o;

    return Objects.equals(this.type, metadataResultEntity.type) &&
            Objects.equals(this.description, metadataResultEntity.description) &&
            Objects.equals(this.visibility, metadataResultEntity.visibility);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, description, visibility);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetadataResultEntity {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
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

