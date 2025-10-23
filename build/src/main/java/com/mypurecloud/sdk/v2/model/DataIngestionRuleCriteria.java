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
 * DataIngestionRuleCriteria
 */

public class DataIngestionRuleCriteria  implements Serializable {
  

  private static class EffectivePlatformEnumDeserializer extends StdDeserializer<EffectivePlatformEnum> {
    public EffectivePlatformEnumDeserializer() {
      super(EffectivePlatformEnumDeserializer.class);
    }

    @Override
    public EffectivePlatformEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EffectivePlatformEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The effective platform for the data ingestion rule.
   */
 @JsonDeserialize(using = EffectivePlatformEnumDeserializer.class)
  public enum EffectivePlatformEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    FACEBOOK("Facebook"),
    INSTAGRAM("Instagram"),
    TWITTER("Twitter"),
    OPEN("Open"),
    GOOGLEBUSINESSPROFILE("GoogleBusinessProfile");

    private String value;

    EffectivePlatformEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EffectivePlatformEnum fromString(String key) {
      if (key == null) return null;

      for (EffectivePlatformEnum value : EffectivePlatformEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EffectivePlatformEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EffectivePlatformEnum effectivePlatform = null;
  private String id = null;
  private String name = null;

  public DataIngestionRuleCriteria() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The effective platform for the data ingestion rule.
   **/
  public DataIngestionRuleCriteria effectivePlatform(EffectivePlatformEnum effectivePlatform) {
    this.effectivePlatform = effectivePlatform;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The effective platform for the data ingestion rule.")
  @JsonProperty("effectivePlatform")
  public EffectivePlatformEnum getEffectivePlatform() {
    return effectivePlatform;
  }
  public void setEffectivePlatform(EffectivePlatformEnum effectivePlatform) {
    this.effectivePlatform = effectivePlatform;
  }


  /**
   * The ID of the data ingestion rule.
   **/
  public DataIngestionRuleCriteria id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the data ingestion rule.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @ApiModelProperty(example = "null", value = "The name of the data ingestion rule. Only populated when expanded.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataIngestionRuleCriteria dataIngestionRuleCriteria = (DataIngestionRuleCriteria) o;

    return Objects.equals(this.effectivePlatform, dataIngestionRuleCriteria.effectivePlatform) &&
            Objects.equals(this.id, dataIngestionRuleCriteria.id) &&
            Objects.equals(this.name, dataIngestionRuleCriteria.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectivePlatform, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataIngestionRuleCriteria {\n");
    
    sb.append("    effectivePlatform: ").append(toIndentedString(effectivePlatform)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

