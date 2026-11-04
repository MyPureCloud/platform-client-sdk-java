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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * A place where a customer intent or category is used
 */
@ApiModel(description = "A place where a customer intent or category is used")

public class CustomerIntentUsage  implements Serializable {
  

  private static class EntityTypeEnumDeserializer extends StdDeserializer<EntityTypeEnum> {
    public EntityTypeEnumDeserializer() {
      super(EntityTypeEnumDeserializer.class);
    }

    @Override
    public EntityTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return EntityTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Whether the usage is for a customer intent or category
   */
 @JsonDeserialize(using = EntityTypeEnumDeserializer.class)
  public enum EntityTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INTENT("Intent"),
    CATEGORY("Category");

    private String value;

    EntityTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static EntityTypeEnum fromString(String key) {
      if (key == null) return null;

      for (EntityTypeEnum value : EntityTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return EntityTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private EntityTypeEnum entityType = null;

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
   * Type of the source using the customer intent or category
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
  private DomainEntityRef source = null;
  private Date dateCreated = null;

  public CustomerIntentUsage() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CustomerIntentUsage(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Whether the usage is for a customer intent or category")
  @JsonProperty("entityType")
  public EntityTypeEnum getEntityType() {
    return entityType;
  }


  @ApiModelProperty(example = "null", value = "Type of the source using the customer intent or category")
  @JsonProperty("sourceType")
  public SourceTypeEnum getSourceType() {
    return sourceType;
  }


  @ApiModelProperty(example = "null", value = "Source using the customer intent or category. The selfUri is included when the source type has an addressable Public API resource.")
  @JsonProperty("source")
  public DomainEntityRef getSource() {
    return source;
  }


  @ApiModelProperty(example = "null", value = "Creation date of the usage. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerIntentUsage customerIntentUsage = (CustomerIntentUsage) o;

    return Objects.equals(this.entityType, customerIntentUsage.entityType) &&
            Objects.equals(this.sourceType, customerIntentUsage.sourceType) &&
            Objects.equals(this.source, customerIntentUsage.source) &&
            Objects.equals(this.dateCreated, customerIntentUsage.dateCreated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityType, sourceType, source, dateCreated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerIntentUsage {\n");
    
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    sourceType: ").append(toIndentedString(sourceType)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

