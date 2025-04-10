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
import com.mypurecloud.sdk.v2.model.NluUtteranceSegment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * NluUtterance
 */

public class NluUtterance  implements Serializable {
  
  private String id = null;

  private static class SourceEnumDeserializer extends StdDeserializer<SourceEnum> {
    public SourceEnumDeserializer() {
      super(SourceEnumDeserializer.class);
    }

    @Override
    public SourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The source of the utterance.
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GENERATED("Generated"),
    USER("User");

    private String value;

    SourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SourceEnum fromString(String key) {
      if (key == null) return null;

      for (SourceEnum value : SourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SourceEnum source = null;
  private List<NluUtteranceSegment> segments = null;

  public NluUtterance() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      segments = new ArrayList<NluUtteranceSegment>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "ID of the utterance.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The source of the utterance.
   **/
  public NluUtterance source(SourceEnum source) {
    this.source = source;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The source of the utterance.")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }
  public void setSource(SourceEnum source) {
    this.source = source;
  }


  /**
   * The list of segments that that constitute this utterance for the given intent.
   **/
  public NluUtterance segments(List<NluUtteranceSegment> segments) {
    this.segments = segments;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The list of segments that that constitute this utterance for the given intent.")
  @JsonProperty("segments")
  public List<NluUtteranceSegment> getSegments() {
    return segments;
  }
  public void setSegments(List<NluUtteranceSegment> segments) {
    this.segments = segments;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NluUtterance nluUtterance = (NluUtterance) o;

    return Objects.equals(this.id, nluUtterance.id) &&
            Objects.equals(this.source, nluUtterance.source) &&
            Objects.equals(this.segments, nluUtterance.segments);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, source, segments);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NluUtterance {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

