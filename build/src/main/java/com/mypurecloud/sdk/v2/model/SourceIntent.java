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
 * SourceIntent
 */

public class SourceIntent  implements Serializable {
  
  private String sourceIntentId = null;
  private String sourceIntentName = null;

  private static class SourceTypeEnumDeserializer extends StdDeserializer<SourceTypeEnum> {
    public SourceTypeEnumDeserializer() {
      super(SourceTypeEnumDeserializer.class);
    }

    @Override
    public SourceTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Source type
   */
 @JsonDeserialize(using = SourceTypeEnumDeserializer.class)
  public enum SourceTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BOT("Bot"),
    COPILOT("Copilot"),
    DIGITALBOT("Digitalbot"),
    SEGMENT("Segment"),
    TOPIC("Topic"),
    UNKNOWN("Unknown");

    private String value;

    SourceTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceTypeEnum fromString(String key) {
      if (key == null) return null;

      for (SourceTypeEnum value : SourceTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceTypeEnum sourceType = null;
  private String sourceId = null;
  private String sourceName = null;

  public SourceIntent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Id of the source intent
   **/
  public SourceIntent sourceIntentId(String sourceIntentId) {
    this.sourceIntentId = sourceIntentId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the source intent")
  @JsonProperty("sourceIntentId")
  public String getSourceIntentId() {
    return sourceIntentId;
  }
  public void setSourceIntentId(String sourceIntentId) {
    this.sourceIntentId = sourceIntentId;
  }


  /**
   * Name of the source intent
   **/
  public SourceIntent sourceIntentName(String sourceIntentName) {
    this.sourceIntentName = sourceIntentName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the source intent")
  @JsonProperty("sourceIntentName")
  public String getSourceIntentName() {
    return sourceIntentName;
  }
  public void setSourceIntentName(String sourceIntentName) {
    this.sourceIntentName = sourceIntentName;
  }


  /**
   * Source type
   **/
  public SourceIntent sourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
    return this;
  }
  
  @ApiModelProperty(example = "Bot, Digitalbot, Copilot, Segment, Topic", value = "Source type")
  @JsonProperty("sourceType")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }
  public void setSourceType(SourceTypeEnum sourceType) {
    this.sourceType = sourceType;
  }


  /**
   * Id of the source
   **/
  public SourceIntent sourceId(String sourceId) {
    this.sourceId = sourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Id of the source")
  @JsonProperty("sourceId")
  public String getSourceId() {
    return sourceId;
  }
  public void setSourceId(String sourceId) {
    this.sourceId = sourceId;
  }


  /**
   * Name of the source
   **/
  public SourceIntent sourceName(String sourceName) {
    this.sourceName = sourceName;
    return this;
  }
  
  @ApiModelProperty(example = "Banking Botflow", value = "Name of the source")
  @JsonProperty("sourceName")
  public String getSourceName() {
    return sourceName;
  }
  public void setSourceName(String sourceName) {
    this.sourceName = sourceName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceIntent sourceIntent = (SourceIntent) o;

    return Objects.equals(this.sourceIntentId, sourceIntent.sourceIntentId) &&
            Objects.equals(this.sourceIntentName, sourceIntent.sourceIntentName) &&
            Objects.equals(this.sourceType, sourceIntent.sourceType) &&
            Objects.equals(this.sourceId, sourceIntent.sourceId) &&
            Objects.equals(this.sourceName, sourceIntent.sourceName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceIntentId, sourceIntentName, sourceType, sourceId, sourceName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceIntent {\n");
    
    sb.append("    sourceIntentId: ").append(toIndentedString(sourceIntentId)).append("\n");
    sb.append("    sourceIntentName: ").append(toIndentedString(sourceIntentName)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
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

