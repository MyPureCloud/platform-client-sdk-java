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
import com.mypurecloud.sdk.v2.model.Credential;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Verifier
 */

public class Verifier  implements Serializable {
  
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
  private Credential credential = null;
  private Boolean _default = null;
  private String selfUri = null;

  public Verifier() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public Verifier(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public Verifier name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public Verifier type(TypeEnum type) {
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
  public Verifier enabled(Boolean enabled) {
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
   * The WebAuthn credential associated with this verifier.
   **/
  public Verifier credential(Credential credential) {
    this.credential = credential;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The WebAuthn credential associated with this verifier.")
  @JsonProperty("credential")
  public Credential getCredential() {
    return credential;
  }
  public void setCredential(Credential credential) {
    this.credential = credential;
  }


  /**
   * Indicates whether this is the default verifier.
   **/
  public Verifier _default(Boolean _default) {
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


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Verifier verifier = (Verifier) o;

    return Objects.equals(this.id, verifier.id) &&
            Objects.equals(this.name, verifier.name) &&
            Objects.equals(this.type, verifier.type) &&
            Objects.equals(this.enabled, verifier.enabled) &&
            Objects.equals(this.credential, verifier.credential) &&
            Objects.equals(this._default, verifier._default) &&
            Objects.equals(this.selfUri, verifier.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, type, enabled, credential, _default, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Verifier {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    credential: ").append(toIndentedString(credential)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

