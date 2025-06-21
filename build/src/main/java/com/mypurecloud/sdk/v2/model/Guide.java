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
import com.mypurecloud.sdk.v2.model.GuideVersionRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Guide
 */

public class Guide  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the guide.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLISHED("Published"),
    DRAFT("Draft");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

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
   * Indicates how the guide content was generated.
   */
 @JsonDeserialize(using = SourceEnumDeserializer.class)
  public enum SourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MANUAL("Manual"),
    PROMPT("Prompt"),
    DOCUMENT("Document");

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
  private Date dateCreated = null;
  private Date dateModified = null;
  private String selfUri = null;
  private GuideVersionRef latestSavedVersion = null;
  private GuideVersionRef latestProductionReadyVersion = null;

  public Guide() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  @ApiModelProperty(example = "null", value = "The name of the guide.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  @ApiModelProperty(example = "null", value = "The status of the guide.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }


  @ApiModelProperty(example = "null", value = "Indicates how the guide content was generated.")
  @JsonProperty("source")
  public SourceEnum getSource() {
    return source;
  }


  @ApiModelProperty(example = "null", value = "The date and time the guide was created.. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date and time the guide was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @ApiModelProperty(example = "null", value = "The latest saved version of the guide.")
  @JsonProperty("latestSavedVersion")
  public GuideVersionRef getLatestSavedVersion() {
    return latestSavedVersion;
  }


  @ApiModelProperty(example = "null", value = "The latest production ready version of the guide.")
  @JsonProperty("latestProductionReadyVersion")
  public GuideVersionRef getLatestProductionReadyVersion() {
    return latestProductionReadyVersion;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guide guide = (Guide) o;

    return Objects.equals(this.id, guide.id) &&
            Objects.equals(this.name, guide.name) &&
            Objects.equals(this.status, guide.status) &&
            Objects.equals(this.source, guide.source) &&
            Objects.equals(this.dateCreated, guide.dateCreated) &&
            Objects.equals(this.dateModified, guide.dateModified) &&
            Objects.equals(this.selfUri, guide.selfUri) &&
            Objects.equals(this.latestSavedVersion, guide.latestSavedVersion) &&
            Objects.equals(this.latestProductionReadyVersion, guide.latestProductionReadyVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, status, source, dateCreated, dateModified, selfUri, latestSavedVersion, latestProductionReadyVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guide {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    latestSavedVersion: ").append(toIndentedString(latestSavedVersion)).append("\n");
    sb.append("    latestProductionReadyVersion: ").append(toIndentedString(latestProductionReadyVersion)).append("\n");
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

