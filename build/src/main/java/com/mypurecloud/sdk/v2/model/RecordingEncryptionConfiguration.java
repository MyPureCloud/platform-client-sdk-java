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
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordingEncryptionConfiguration
 */

public class RecordingEncryptionConfiguration  implements Serializable {
  
  private String id = null;
  private String url = null;
  private String apiId = null;
  private String apiKey = null;

  private static class KeyConfigurationTypeEnumDeserializer extends StdDeserializer<KeyConfigurationTypeEnum> {
    public KeyConfigurationTypeEnumDeserializer() {
      super(KeyConfigurationTypeEnumDeserializer.class);
    }

    @Override
    public KeyConfigurationTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return KeyConfigurationTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Type should be LocalKeyManager or KmsSymmetric when create or update Key configurations; 'Native' for disabling configuration.
   */
 @JsonDeserialize(using = KeyConfigurationTypeEnumDeserializer.class)
  public enum KeyConfigurationTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    KMSSYMMETRIC("KmsSymmetric"),
    LOCALKEYMANAGER("LocalKeyManager"),
    NATIVE("Native"),
    NONE("None");

    private String value;

    KeyConfigurationTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static KeyConfigurationTypeEnum fromString(String key) {
      if (key == null) return null;

      for (KeyConfigurationTypeEnum value : KeyConfigurationTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return KeyConfigurationTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private KeyConfigurationTypeEnum keyConfigurationType = null;
  private ErrorBody lastError = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * When keyConfigurationType is LocalKeyManager, this should be the url for decryption and must specify the path to where GenesysCloud can requests decryption. When keyConfigurationType is KmsSymmetric, this should be the arn to the key alias for the master key
   **/
  public RecordingEncryptionConfiguration url(String url) {
    this.url = url;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "When keyConfigurationType is LocalKeyManager, this should be the url for decryption and must specify the path to where GenesysCloud can requests decryption. When keyConfigurationType is KmsSymmetric, this should be the arn to the key alias for the master key")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  /**
   * The api id for Hawk Authentication. Null if keyConfigurationType is KmsSymmetric
   **/
  public RecordingEncryptionConfiguration apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The api id for Hawk Authentication. Null if keyConfigurationType is KmsSymmetric")
  @JsonProperty("apiId")
  public String getApiId() {
    return apiId;
  }
  public void setApiId(String apiId) {
    this.apiId = apiId;
  }


  /**
   * The api shared symmetric key used for hawk authentication. Null if keyConfigurationType is KmsSymmetric
   **/
  public RecordingEncryptionConfiguration apiKey(String apiKey) {
    this.apiKey = apiKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The api shared symmetric key used for hawk authentication. Null if keyConfigurationType is KmsSymmetric")
  @JsonProperty("apiKey")
  public String getApiKey() {
    return apiKey;
  }
  public void setApiKey(String apiKey) {
    this.apiKey = apiKey;
  }


  /**
   * Type should be LocalKeyManager or KmsSymmetric when create or update Key configurations; 'Native' for disabling configuration.
   **/
  public RecordingEncryptionConfiguration keyConfigurationType(KeyConfigurationTypeEnum keyConfigurationType) {
    this.keyConfigurationType = keyConfigurationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Type should be LocalKeyManager or KmsSymmetric when create or update Key configurations; 'Native' for disabling configuration.")
  @JsonProperty("keyConfigurationType")
  public KeyConfigurationTypeEnum getKeyConfigurationType() {
    return keyConfigurationType;
  }
  public void setKeyConfigurationType(KeyConfigurationTypeEnum keyConfigurationType) {
    this.keyConfigurationType = keyConfigurationType;
  }


  /**
   * The error message related to the configuration
   **/
  public RecordingEncryptionConfiguration lastError(ErrorBody lastError) {
    this.lastError = lastError;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The error message related to the configuration")
  @JsonProperty("lastError")
  public ErrorBody getLastError() {
    return lastError;
  }
  public void setLastError(ErrorBody lastError) {
    this.lastError = lastError;
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
    RecordingEncryptionConfiguration recordingEncryptionConfiguration = (RecordingEncryptionConfiguration) o;

    return Objects.equals(this.id, recordingEncryptionConfiguration.id) &&
            Objects.equals(this.url, recordingEncryptionConfiguration.url) &&
            Objects.equals(this.apiId, recordingEncryptionConfiguration.apiId) &&
            Objects.equals(this.apiKey, recordingEncryptionConfiguration.apiKey) &&
            Objects.equals(this.keyConfigurationType, recordingEncryptionConfiguration.keyConfigurationType) &&
            Objects.equals(this.lastError, recordingEncryptionConfiguration.lastError) &&
            Objects.equals(this.selfUri, recordingEncryptionConfiguration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, url, apiId, apiKey, keyConfigurationType, lastError, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordingEncryptionConfiguration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    keyConfigurationType: ").append(toIndentedString(keyConfigurationType)).append("\n");
    sb.append("    lastError: ").append(toIndentedString(lastError)).append("\n");
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

