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
 * PushIntegration
 */

public class PushIntegration  implements Serializable {
  
  private String id = null;

  private static class ProviderEnumDeserializer extends StdDeserializer<ProviderEnum> {
    public ProviderEnumDeserializer() {
      super(ProviderEnumDeserializer.class);
    }

    @Override
    public ProviderEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ProviderEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The integration provider associated with the deployment
   */
 @JsonDeserialize(using = ProviderEnumDeserializer.class)
  public enum ProviderEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APNS("APNS"),
    FCM("FCM");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ProviderEnum fromString(String key) {
      if (key == null) return null;

      for (ProviderEnum value : ProviderEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ProviderEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ProviderEnum provider = null;

  public PushIntegration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The integration provider associated with the deployment
   **/
  public PushIntegration provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The integration provider associated with the deployment")
  @JsonProperty("provider")
  public ProviderEnum getProvider() {
    return provider;
  }
  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PushIntegration pushIntegration = (PushIntegration) o;

    return Objects.equals(this.id, pushIntegration.id) &&
            Objects.equals(this.provider, pushIntegration.provider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, provider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PushIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

