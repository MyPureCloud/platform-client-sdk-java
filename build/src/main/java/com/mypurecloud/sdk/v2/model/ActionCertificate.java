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
 * Details for an mTLS certificate
 */
@ApiModel(description = "Details for an mTLS certificate")

public class ActionCertificate  implements Serializable {
  

  private static class SigningAuthorityEnumDeserializer extends StdDeserializer<SigningAuthorityEnum> {
    public SigningAuthorityEnumDeserializer() {
      super(SigningAuthorityEnumDeserializer.class);
    }

    @Override
    public SigningAuthorityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return SigningAuthorityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Signing Authority for the certificate
   */
 @JsonDeserialize(using = SigningAuthorityEnumDeserializer.class)
  public enum SigningAuthorityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIGICERT("DigiCert"),
    GENESYS("Genesys");

    private String value;

    SigningAuthorityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static SigningAuthorityEnum fromString(String key) {
      if (key == null) return null;

      for (SigningAuthorityEnum value : SigningAuthorityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return SigningAuthorityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private SigningAuthorityEnum signingAuthority = null;
  private String certificate = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The certificate status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CURRENT("Current"),
    UPCOMING("Upcoming");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

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
   * The certificate type
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CLIENT("Client");

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

  public ActionCertificate() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The Signing Authority for the certificate
   **/
  public ActionCertificate signingAuthority(SigningAuthorityEnum signingAuthority) {
    this.signingAuthority = signingAuthority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Signing Authority for the certificate")
  @JsonProperty("signingAuthority")
  public SigningAuthorityEnum getSigningAuthority() {
    return signingAuthority;
  }
  public void setSigningAuthority(SigningAuthorityEnum signingAuthority) {
    this.signingAuthority = signingAuthority;
  }


  /**
   * The certificate string
   **/
  public ActionCertificate certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The certificate string")
  @JsonProperty("certificate")
  public String getCertificate() {
    return certificate;
  }
  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }


  /**
   * The certificate status
   **/
  public ActionCertificate status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The certificate status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The certificate type
   **/
  public ActionCertificate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The certificate type")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActionCertificate actionCertificate = (ActionCertificate) o;

    return Objects.equals(this.signingAuthority, actionCertificate.signingAuthority) &&
            Objects.equals(this.certificate, actionCertificate.certificate) &&
            Objects.equals(this.status, actionCertificate.status) &&
            Objects.equals(this.type, actionCertificate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signingAuthority, certificate, status, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActionCertificate {\n");
    
    sb.append("    signingAuthority: ").append(toIndentedString(signingAuthority)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

