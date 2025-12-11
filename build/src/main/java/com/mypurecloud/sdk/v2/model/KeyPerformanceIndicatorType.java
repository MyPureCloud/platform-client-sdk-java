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
import java.util.List;

import java.io.Serializable;
/**
 * KeyPerformanceIndicatorType
 */

public class KeyPerformanceIndicatorType  implements Serializable {
  

  private static class IdEnumDeserializer extends StdDeserializer<IdEnum> {
    public IdEnumDeserializer() {
      super(IdEnumDeserializer.class);
    }

    @Override
    public IdEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IdEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The id the Key Performance Indicator Type.
   */
 @JsonDeserialize(using = IdEnumDeserializer.class)
  public enum IdEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SALESCONVERSION("SalesConversion"),
    CHURN("Churn"),
    RETENTION("Retention"),
    SALESVALUE("SalesValue"),
    HANDLETIME("HandleTime"),
    NEXTCONTACTAVOIDANCE("NextContactAvoidance");

    private String value;

    IdEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IdEnum fromString(String key) {
      if (key == null) return null;

      for (IdEnum value : IdEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IdEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IdEnum id = null;

  private static class SourcesEnumDeserializer extends StdDeserializer<SourcesEnum> {
    public SourcesEnumDeserializer() {
      super(SourcesEnumDeserializer.class);
    }

    @Override
    public SourcesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourcesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets sources
   */
 @JsonDeserialize(using = SourcesEnumDeserializer.class)
  public enum SourcesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WRAPUPCODE("WrapUpCode"),
    OUTCOME("Outcome"),
    NONE("None");

    private String value;

    SourcesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourcesEnum fromString(String key) {
      if (key == null) return null;

      for (SourcesEnum value : SourcesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourcesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<SourcesEnum> sources = null;

  public KeyPerformanceIndicatorType() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sources = new ArrayList<SourcesEnum>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The id the Key Performance Indicator Type.")
  @JsonProperty("id")
  public IdEnum getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "A set of kpi sources where values for a Key Performance Indicator are retrieved from.")
  @JsonProperty("sources")
  public List<SourcesEnum> getSources() {
    return sources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    KeyPerformanceIndicatorType keyPerformanceIndicatorType = (KeyPerformanceIndicatorType) o;

    return Objects.equals(this.id, keyPerformanceIndicatorType.id) &&
            Objects.equals(this.sources, keyPerformanceIndicatorType.sources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class KeyPerformanceIndicatorType {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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

