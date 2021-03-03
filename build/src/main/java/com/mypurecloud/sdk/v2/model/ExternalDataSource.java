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
 * Describes a link to a record in an external system that contributed data to a Relate record
 */
@ApiModel(description = "Describes a link to a record in an external system that contributed data to a Relate record")

public class ExternalDataSource  implements Serializable {
  

  private static class PlatformEnumDeserializer extends StdDeserializer<PlatformEnum> {
    public PlatformEnumDeserializer() {
      super(PlatformEnumDeserializer.class);
    }

    @Override
    public PlatformEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PlatformEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The platform that was the source of the data.  Example: a CRM like SALESFORCE.
   */
 @JsonDeserialize(using = PlatformEnumDeserializer.class)
  public enum PlatformEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SALESFORCE("SALESFORCE");

    private String value;

    PlatformEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PlatformEnum fromString(String key) {
      if (key == null) return null;

      for (PlatformEnum value : PlatformEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PlatformEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PlatformEnum platform = null;
  private String url = null;

  
  /**
   * The platform that was the source of the data.  Example: a CRM like SALESFORCE.
   **/
  public ExternalDataSource platform(PlatformEnum platform) {
    this.platform = platform;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The platform that was the source of the data.  Example: a CRM like SALESFORCE.")
  @JsonProperty("platform")
  public PlatformEnum getPlatform() {
    return platform;
  }
  public void setPlatform(PlatformEnum platform) {
    this.platform = platform;
  }

  
  /**
   * An URL that links to the source record that contributed data to the associated entity.
   **/
  public ExternalDataSource url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An URL that links to the source record that contributed data to the associated entity.")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalDataSource externalDataSource = (ExternalDataSource) o;
    return Objects.equals(this.platform, externalDataSource.platform) &&
        Objects.equals(this.url, externalDataSource.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalDataSource {\n");
    
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

