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

import java.io.Serializable;
/**
 * SegmentAssignedEventSegment
 */

public class SegmentAssignedEventSegment  implements Serializable {
  
  private String id = null;
  private String selfUri = null;
  private String displayName = null;
  private Integer version = null;

  private static class ScopeEnumDeserializer extends StdDeserializer<ScopeEnum> {
    public ScopeEnumDeserializer() {
      super(ScopeEnumDeserializer.class);
    }

    @Override
    public ScopeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ScopeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The target entity that a segment applies to.
   */
 @JsonDeserialize(using = ScopeEnumDeserializer.class)
  public enum ScopeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SESSION("Session"),
    CUSTOMER("Customer");

    private String value;

    ScopeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ScopeEnum fromString(String key) {
      if (key == null) return null;

      for (ScopeEnum value : ScopeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ScopeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ScopeEnum scope = null;

  
  /**
   **/
  public SegmentAssignedEventSegment id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public SegmentAssignedEventSegment selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   * The display name of the segment.
   **/
  public SegmentAssignedEventSegment displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The display name of the segment.")
  @JsonProperty("displayName")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  /**
   * The version of the segment.
   **/
  public SegmentAssignedEventSegment version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the segment.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The target entity that a segment applies to.
   **/
  public SegmentAssignedEventSegment scope(ScopeEnum scope) {
    this.scope = scope;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target entity that a segment applies to.")
  @JsonProperty("scope")
  public ScopeEnum getScope() {
    return scope;
  }
  public void setScope(ScopeEnum scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentAssignedEventSegment segmentAssignedEventSegment = (SegmentAssignedEventSegment) o;

    return Objects.equals(this.id, segmentAssignedEventSegment.id) &&
            Objects.equals(this.selfUri, segmentAssignedEventSegment.selfUri) &&
            Objects.equals(this.displayName, segmentAssignedEventSegment.displayName) &&
            Objects.equals(this.version, segmentAssignedEventSegment.version) &&
            Objects.equals(this.scope, segmentAssignedEventSegment.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, selfUri, displayName, version, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentAssignedEventSegment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

