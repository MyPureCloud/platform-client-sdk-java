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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * OutboundMessagingMessagingCampaignConfigChangeContactSort
 */

public class OutboundMessagingMessagingCampaignConfigChangeContactSort  implements Serializable {
  
  private String fieldName = null;

  private static class DirectionEnumDeserializer extends StdDeserializer<DirectionEnum> {
    public DirectionEnumDeserializer() {
      super(DirectionEnumDeserializer.class);
    }

    @Override
    public DirectionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DirectionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets direction
   */
 @JsonDeserialize(using = DirectionEnumDeserializer.class)
  public enum DirectionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ASC("ASC"),
    DESC("DESC");

    private String value;

    DirectionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DirectionEnum fromString(String key) {
      if (key == null) return null;

      for (DirectionEnum value : DirectionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DirectionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DirectionEnum direction = null;
  private Boolean numeric = null;
  private Map<String, Object> additionalProperties = null;

  public OutboundMessagingMessagingCampaignConfigChangeContactSort() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeContactSort fieldName(String fieldName) {
    this.fieldName = fieldName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("fieldName")
  public String getFieldName() {
    return fieldName;
  }
  public void setFieldName(String fieldName) {
    this.fieldName = fieldName;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeContactSort direction(DirectionEnum direction) {
    this.direction = direction;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("direction")
  public DirectionEnum getDirection() {
    return direction;
  }
  public void setDirection(DirectionEnum direction) {
    this.direction = direction;
  }


  /**
   * Whether that column contains numeric data
   **/
  public OutboundMessagingMessagingCampaignConfigChangeContactSort numeric(Boolean numeric) {
    this.numeric = numeric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Whether that column contains numeric data")
  @JsonProperty("numeric")
  public Boolean getNumeric() {
    return numeric;
  }
  public void setNumeric(Boolean numeric) {
    this.numeric = numeric;
  }


  /**
   **/
  public OutboundMessagingMessagingCampaignConfigChangeContactSort additionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("additionalProperties")
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }
  public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessagingMessagingCampaignConfigChangeContactSort outboundMessagingMessagingCampaignConfigChangeContactSort = (OutboundMessagingMessagingCampaignConfigChangeContactSort) o;

    return Objects.equals(this.fieldName, outboundMessagingMessagingCampaignConfigChangeContactSort.fieldName) &&
            Objects.equals(this.direction, outboundMessagingMessagingCampaignConfigChangeContactSort.direction) &&
            Objects.equals(this.numeric, outboundMessagingMessagingCampaignConfigChangeContactSort.numeric) &&
            Objects.equals(this.additionalProperties, outboundMessagingMessagingCampaignConfigChangeContactSort.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldName, direction, numeric, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessagingMessagingCampaignConfigChangeContactSort {\n");
    
    sb.append("    fieldName: ").append(toIndentedString(fieldName)).append("\n");
    sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
    sb.append("    numeric: ").append(toIndentedString(numeric)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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

