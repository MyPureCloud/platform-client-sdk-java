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
 * IdentifierVertex
 */

public class IdentifierVertex  implements Serializable {
  
  private String vertexId = null;

  private static class NormalizedTypeEnumDeserializer extends StdDeserializer<NormalizedTypeEnum> {
    public NormalizedTypeEnumDeserializer() {
      super(NormalizedTypeEnumDeserializer.class);
    }

    @Override
    public NormalizedTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NormalizedTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The normalized type of this identifier
   */
 @JsonDeserialize(using = NormalizedTypeEnumDeserializer.class)
  public enum NormalizedTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PHONE("Phone"),
    EMAIL("Email"),
    EXTERNALID("ExternalId"),
    TWITTERID("TwitterId"),
    TWITTERHANDLE("TwitterHandle"),
    FACEBOOKID("FacebookId"),
    INSTAGRAMID("InstagramId"),
    INSTAGRAMHANDLE("InstagramHandle");

    private String value;

    NormalizedTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NormalizedTypeEnum fromString(String key) {
      if (key == null) return null;

      for (NormalizedTypeEnum value : NormalizedTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NormalizedTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NormalizedTypeEnum normalizedType = null;
  private String normalizedValue = null;

  public IdentifierVertex() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public IdentifierVertex(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The ID of the vertex in the cluster graph. This ID is only unique within the graph!")
  @JsonProperty("vertexId")
  public String getVertexId() {
    return vertexId;
  }


  @ApiModelProperty(example = "null", value = "The normalized type of this identifier")
  @JsonProperty("normalizedType")
  public NormalizedTypeEnum getNormalizedType() {
    return normalizedType;
  }


  @ApiModelProperty(example = "null", value = "The normalized value of this identifier")
  @JsonProperty("normalizedValue")
  public String getNormalizedValue() {
    return normalizedValue;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentifierVertex identifierVertex = (IdentifierVertex) o;

    return Objects.equals(this.vertexId, identifierVertex.vertexId) &&
            Objects.equals(this.normalizedType, identifierVertex.normalizedType) &&
            Objects.equals(this.normalizedValue, identifierVertex.normalizedValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vertexId, normalizedType, normalizedValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentifierVertex {\n");
    
    sb.append("    vertexId: ").append(toIndentedString(vertexId)).append("\n");
    sb.append("    normalizedType: ").append(toIndentedString(normalizedType)).append("\n");
    sb.append("    normalizedValue: ").append(toIndentedString(normalizedValue)).append("\n");
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

