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
 * CreateVerifierRequest
 */

public class CreateVerifierRequest  implements Serializable {
  

  private static class AlgorithmEnumDeserializer extends StdDeserializer<AlgorithmEnum> {
    public AlgorithmEnumDeserializer() {
      super(AlgorithmEnumDeserializer.class);
    }

    @Override
    public AlgorithmEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AlgorithmEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The hashing algorithm for the TOTP verifier.
   */
 @JsonDeserialize(using = AlgorithmEnumDeserializer.class)
  public enum AlgorithmEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SHA1("SHA1"),
    SHA256("SHA256"),
    SHA512("SHA512");

    private String value;

    AlgorithmEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AlgorithmEnum fromString(String key) {
      if (key == null) return null;

      for (AlgorithmEnum value : AlgorithmEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AlgorithmEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AlgorithmEnum algorithm = null;
  private Integer digits = null;
  private Boolean enabled = null;
  private String name = null;
  private Integer period = null;
  private Integer secretSize = null;
  private Boolean _default = null;

  public CreateVerifierRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CreateVerifierRequest(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The hashing algorithm for the TOTP verifier.
   **/
  public CreateVerifierRequest algorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The hashing algorithm for the TOTP verifier.")
  @JsonProperty("algorithm")
  public AlgorithmEnum getAlgorithm() {
    return algorithm;
  }
  public void setAlgorithm(AlgorithmEnum algorithm) {
    this.algorithm = algorithm;
  }


  /**
   * The number of digits in the TOTP code. Must be between 6 and 12.
   * minimum: 6
   * maximum: 12
   **/
  public CreateVerifierRequest digits(Integer digits) {
    this.digits = digits;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of digits in the TOTP code. Must be between 6 and 12.")
  @JsonProperty("digits")
  public Integer getDigits() {
    return digits;
  }
  public void setDigits(Integer digits) {
    this.digits = digits;
  }


  /**
   * Indicates whether this verifier will be enabled.
   **/
  public CreateVerifierRequest enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this verifier will be enabled.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The name of the verifier. Maximum length is 100 characters.
   **/
  public CreateVerifierRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the verifier. Maximum length is 100 characters.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The time period in seconds for the TOTP code.
   **/
  public CreateVerifierRequest period(Integer period) {
    this.period = period;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time period in seconds for the TOTP code.")
  @JsonProperty("period")
  public Integer getPeriod() {
    return period;
  }
  public void setPeriod(Integer period) {
    this.period = period;
  }


  /**
   * The size of the shared secret in bytes. Must be between 10 and 64.
   * minimum: 10
   * maximum: 64
   **/
  public CreateVerifierRequest secretSize(Integer secretSize) {
    this.secretSize = secretSize;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The size of the shared secret in bytes. Must be between 10 and 64.")
  @JsonProperty("secretSize")
  public Integer getSecretSize() {
    return secretSize;
  }
  public void setSecretSize(Integer secretSize) {
    this.secretSize = secretSize;
  }


  /**
   * Indicates whether this will be the default verifier.
   **/
  public CreateVerifierRequest _default(Boolean _default) {
    this._default = _default;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates whether this will be the default verifier.")
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
    CreateVerifierRequest createVerifierRequest = (CreateVerifierRequest) o;

    return Objects.equals(this.algorithm, createVerifierRequest.algorithm) &&
            Objects.equals(this.digits, createVerifierRequest.digits) &&
            Objects.equals(this.enabled, createVerifierRequest.enabled) &&
            Objects.equals(this.name, createVerifierRequest.name) &&
            Objects.equals(this.period, createVerifierRequest.period) &&
            Objects.equals(this.secretSize, createVerifierRequest.secretSize) &&
            Objects.equals(this._default, createVerifierRequest._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(algorithm, digits, enabled, name, period, secretSize, _default);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateVerifierRequest {\n");
    
    sb.append("    algorithm: ").append(toIndentedString(algorithm)).append("\n");
    sb.append("    digits: ").append(toIndentedString(digits)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    period: ").append(toIndentedString(period)).append("\n");
    sb.append("    secretSize: ").append(toIndentedString(secretSize)).append("\n");
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

