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
import java.util.List;

import java.io.Serializable;
/**
 * TranscriptionEngines
 */

public class TranscriptionEngines  implements Serializable {
  

  private static class EngineEnumDeserializer extends StdDeserializer<EngineEnum> {
    public EngineEnumDeserializer() {
      super(EngineEnumDeserializer.class);
    }

    @Override
    public EngineEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EngineEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets engine
   */
 @JsonDeserialize(using = EngineEnumDeserializer.class)
  public enum EngineEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENESYS("Genesys"),
    GENESYSEXTENDED("GenesysExtended");

    private String value;

    EngineEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EngineEnum fromString(String key) {
      if (key == null) return null;

      for (EngineEnum value : EngineEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EngineEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EngineEnum engine = null;
  private List<String> dialects = new ArrayList<String>();

  
  /**
   **/
  public TranscriptionEngines engine(EngineEnum engine) {
    this.engine = engine;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("engine")
  public EngineEnum getEngine() {
    return engine;
  }
  public void setEngine(EngineEnum engine) {
    this.engine = engine;
  }


  /**
   **/
  public TranscriptionEngines dialects(List<String> dialects) {
    this.dialects = dialects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dialects")
  public List<String> getDialects() {
    return dialects;
  }
  public void setDialects(List<String> dialects) {
    this.dialects = dialects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionEngines transcriptionEngines = (TranscriptionEngines) o;

    return Objects.equals(this.engine, transcriptionEngines.engine) &&
            Objects.equals(this.dialects, transcriptionEngines.dialects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engine, dialects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionEngines {\n");
    
    sb.append("    engine: ").append(toIndentedString(engine)).append("\n");
    sb.append("    dialects: ").append(toIndentedString(dialects)).append("\n");
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

