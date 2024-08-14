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
 * A Video event.
 */
@ApiModel(description = "A Video event.")

public class ConversationEventVideo  implements Serializable {
  

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Describes the type of Video event.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OFFERING("Offering"),
    OFFERINGEXPIRED("OfferingExpired"),
    OFFERINGACCEPTED("OfferingAccepted"),
    OFFERINGREJECTED("OfferingRejected");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String offeringId = null;
  private String jwt = null;

  
  /**
   * Describes the type of Video event.
   **/
  public ConversationEventVideo type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Describes the type of Video event.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The Video offering ID.
   **/
  public ConversationEventVideo offeringId(String offeringId) {
    this.offeringId = offeringId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Video offering ID.")
  @JsonProperty("offeringId")
  public String getOfferingId() {
    return offeringId;
  }
  public void setOfferingId(String offeringId) {
    this.offeringId = offeringId;
  }


  /**
   * The Video offering JWT token.
   **/
  public ConversationEventVideo jwt(String jwt) {
    this.jwt = jwt;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Video offering JWT token.")
  @JsonProperty("jwt")
  public String getJwt() {
    return jwt;
  }
  public void setJwt(String jwt) {
    this.jwt = jwt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationEventVideo conversationEventVideo = (ConversationEventVideo) o;

    return Objects.equals(this.type, conversationEventVideo.type) &&
            Objects.equals(this.offeringId, conversationEventVideo.offeringId) &&
            Objects.equals(this.jwt, conversationEventVideo.jwt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, offeringId, jwt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventVideo {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    offeringId: ").append(toIndentedString(offeringId)).append("\n");
    sb.append("    jwt: ").append(toIndentedString(jwt)).append("\n");
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

