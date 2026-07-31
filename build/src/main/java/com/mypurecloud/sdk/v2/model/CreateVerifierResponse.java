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
 * CreateVerifierResponse
 */

public class CreateVerifierResponse  implements Serializable {
  
  private String id = null;
  private String name = null;

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
   * The type of verifier.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TOTP("TOTP"),
    WEBAUTHN("WEBAUTHN");

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
  private Boolean enabled = null;
  private String keyUri = null;
  private Boolean _default = null;

  public CreateVerifierResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateVerifierResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The unique identifier of the verifier.
   **/
  public CreateVerifierResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier of the verifier.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the verifier.
   **/
  public CreateVerifierResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the verifier.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The type of verifier.
   **/
  public CreateVerifierResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of verifier.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * Indicates whether this verifier is enabled.
   **/
  public CreateVerifierResponse enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this verifier is enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The key URI for TOTP authenticator app registration.
   **/
  public CreateVerifierResponse keyUri(String keyUri) {
    this.keyUri = keyUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The key URI for TOTP authenticator app registration.")
  @JsonProperty("keyUri")
  public String getKeyUri() {
    return keyUri;
  }
  public void setKeyUri(String keyUri) {
    this.keyUri = keyUri;
  }


  /**
   * Indicates whether this is the default verifier.
   **/
  public CreateVerifierResponse _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this is the default verifier.")
  @JsonProperty("default")
  public Boolean getDefault() {
    return _default;
  }
  public void setDefault(Boolean _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateVerifierResponse createVerifierResponse = (CreateVerifierResponse) o;

    return Objects.equals(this.id, createVerifierResponse.id) &&
            Objects.equals(this.name, createVerifierResponse.name) &&
            Objects.equals(this.type, createVerifierResponse.type) &&
            Objects.equals(this.enabled, createVerifierResponse.enabled) &&
            Objects.equals(this.keyUri, createVerifierResponse.keyUri) &&
            Objects.equals(this._default, createVerifierResponse._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, enabled, keyUri, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerifierResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    keyUri: ").append(toIndentedString(keyUri)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

