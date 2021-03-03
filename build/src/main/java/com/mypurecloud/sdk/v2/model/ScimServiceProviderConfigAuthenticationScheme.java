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
 * Defines an authentication scheme in the SCIM service provider&#39;s configuration.
 */
@ApiModel(description = "Defines an authentication scheme in the SCIM service provider's configuration.")

public class ScimServiceProviderConfigAuthenticationScheme  implements Serializable {
  
  private String name = null;
  private String description = null;
  private String specUri = null;
  private String documentationUri = null;

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
   * The type of authentication scheme.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    OAUTH("oauth"),
    OAUTH2("oauth2"),
    OAUTHBEARERTOKEN("oauthbearertoken"),
    HTTPBASIC("httpbasic"),
    HTTPDIGEST("httpdigest");

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
  private Boolean primary = null;

  
  @ApiModelProperty(example = "null", required = true, value = "The name of the authentication scheme, for example, HTTP Basic.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The description of the authentication scheme.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  
  @ApiModelProperty(example = "null", value = "The HTTP-addressable URL that points to the authentication scheme's specification.")
  @JsonProperty("specUri")
  public String getSpecUri() {
    return specUri;
  }

  
  @ApiModelProperty(example = "null", value = "The HTTP-addressable URL that points to the authentication scheme's usage documentation.")
  @JsonProperty("documentationUri")
  public String getDocumentationUri() {
    return documentationUri;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The type of authentication scheme.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }

  
  @ApiModelProperty(example = "null", value = "Indicates whether this authentication scheme is the primary method of authentication.")
  @JsonProperty("primary")
  public Boolean getPrimary() {
    return primary;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimServiceProviderConfigAuthenticationScheme scimServiceProviderConfigAuthenticationScheme = (ScimServiceProviderConfigAuthenticationScheme) o;
    return Objects.equals(this.name, scimServiceProviderConfigAuthenticationScheme.name) &&
        Objects.equals(this.description, scimServiceProviderConfigAuthenticationScheme.description) &&
        Objects.equals(this.specUri, scimServiceProviderConfigAuthenticationScheme.specUri) &&
        Objects.equals(this.documentationUri, scimServiceProviderConfigAuthenticationScheme.documentationUri) &&
        Objects.equals(this.type, scimServiceProviderConfigAuthenticationScheme.type) &&
        Objects.equals(this.primary, scimServiceProviderConfigAuthenticationScheme.primary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, specUri, documentationUri, type, primary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimServiceProviderConfigAuthenticationScheme {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    specUri: ").append(toIndentedString(specUri)).append("\n");
    sb.append("    documentationUri: ").append(toIndentedString(documentationUri)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    primary: ").append(toIndentedString(primary)).append("\n");
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

