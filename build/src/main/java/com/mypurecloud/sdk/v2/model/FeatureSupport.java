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
 * FeatureSupport
 */

public class FeatureSupport  implements Serializable {
  
  private String feature = null;

  private static class SupportLevelEnumDeserializer extends StdDeserializer<SupportLevelEnum> {
    public SupportLevelEnumDeserializer() {
      super(SupportLevelEnumDeserializer.class);
    }

    @Override
    public SupportLevelEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SupportLevelEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Level of support for a feature.
   */
 @JsonDeserialize(using = SupportLevelEnumDeserializer.class)
  public enum SupportLevelEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUPPORTED("Supported"),
    NOTSUPPORTED("NotSupported");

    private String value;

    SupportLevelEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SupportLevelEnum fromString(String key) {
      if (key == null) return null;

      for (SupportLevelEnum value : SupportLevelEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SupportLevelEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SupportLevelEnum supportLevel = null;
  private String details = null;

  public FeatureSupport() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Feature name.")
  @JsonProperty("feature")
  public String getFeature() {
    return feature;
  }


  @ApiModelProperty(example = "null", value = "Level of support for a feature.")
  @JsonProperty("supportLevel")
  public SupportLevelEnum getSupportLevel() {
    return supportLevel;
  }


  @ApiModelProperty(example = "null", value = "Additional information for the support of a feature.")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeatureSupport featureSupport = (FeatureSupport) o;

    return Objects.equals(this.feature, featureSupport.feature) &&
            Objects.equals(this.supportLevel, featureSupport.supportLevel) &&
            Objects.equals(this.details, featureSupport.details);
  }

  @Override
  public int hashCode() {
    return Objects.hash(feature, supportLevel, details);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeatureSupport {\n");
    
    sb.append("    feature: ").append(toIndentedString(feature)).append("\n");
    sb.append("    supportLevel: ").append(toIndentedString(supportLevel)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
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

