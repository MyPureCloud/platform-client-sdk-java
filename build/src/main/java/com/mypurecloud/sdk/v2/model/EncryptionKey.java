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
import com.mypurecloud.sdk.v2.model.LocalEncryptionConfiguration;
import com.mypurecloud.sdk.v2.model.User;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EncryptionKey
 */

public class EncryptionKey  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Date createDate = null;
  private String keydataSummary = null;
  private User user = null;
  private LocalEncryptionConfiguration localEncryptionConfiguration = null;

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
   * Key type used in this configuration
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
  private String kmsKeyArn = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public EncryptionKey name(String name) {
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
   * create date of the key pair. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EncryptionKey createDate(Date createDate) {
    this.createDate = createDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "create date of the key pair. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createDate")
  public Date getCreateDate() {
    return createDate;
  }
  public void setCreateDate(Date createDate) {
    this.createDate = createDate;
  }

  
  /**
   * key data summary (base 64 encoded public key)
   **/
  public EncryptionKey keydataSummary(String keydataSummary) {
    this.keydataSummary = keydataSummary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "key data summary (base 64 encoded public key)")
  @JsonProperty("keydataSummary")
  public String getKeydataSummary() {
    return keydataSummary;
  }
  public void setKeydataSummary(String keydataSummary) {
    this.keydataSummary = keydataSummary;
  }

  
  /**
   * user that requested generation of public key
   **/
  public EncryptionKey user(User user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "user that requested generation of public key")
  @JsonProperty("user")
  public User getUser() {
    return user;
  }
  public void setUser(User user) {
    this.user = user;
  }

  
  /**
   * Local configuration
   **/
  public EncryptionKey localEncryptionConfiguration(LocalEncryptionConfiguration localEncryptionConfiguration) {
    this.localEncryptionConfiguration = localEncryptionConfiguration;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Local configuration")
  @JsonProperty("localEncryptionConfiguration")
  public LocalEncryptionConfiguration getLocalEncryptionConfiguration() {
    return localEncryptionConfiguration;
  }
  public void setLocalEncryptionConfiguration(LocalEncryptionConfiguration localEncryptionConfiguration) {
    this.localEncryptionConfiguration = localEncryptionConfiguration;
  }

  
  /**
   * Key type used in this configuration
   **/
  public EncryptionKey keyConfigurationType(KeyConfigurationTypeEnum keyConfigurationType) {
    this.keyConfigurationType = keyConfigurationType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Key type used in this configuration")
  @JsonProperty("keyConfigurationType")
  public KeyConfigurationTypeEnum getKeyConfigurationType() {
    return keyConfigurationType;
  }
  public void setKeyConfigurationType(KeyConfigurationTypeEnum keyConfigurationType) {
    this.keyConfigurationType = keyConfigurationType;
  }

  
  /**
   * ARN of internal key to be wrapped by AWS KMS Symmetric key
   **/
  public EncryptionKey kmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ARN of internal key to be wrapped by AWS KMS Symmetric key")
  @JsonProperty("kmsKeyArn")
  public String getKmsKeyArn() {
    return kmsKeyArn;
  }
  public void setKmsKeyArn(String kmsKeyArn) {
    this.kmsKeyArn = kmsKeyArn;
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
    EncryptionKey encryptionKey = (EncryptionKey) o;
    return Objects.equals(this.id, encryptionKey.id) &&
        Objects.equals(this.name, encryptionKey.name) &&
        Objects.equals(this.createDate, encryptionKey.createDate) &&
        Objects.equals(this.keydataSummary, encryptionKey.keydataSummary) &&
        Objects.equals(this.user, encryptionKey.user) &&
        Objects.equals(this.localEncryptionConfiguration, encryptionKey.localEncryptionConfiguration) &&
        Objects.equals(this.keyConfigurationType, encryptionKey.keyConfigurationType) &&
        Objects.equals(this.kmsKeyArn, encryptionKey.kmsKeyArn) &&
        Objects.equals(this.selfUri, encryptionKey.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createDate, keydataSummary, user, localEncryptionConfiguration, keyConfigurationType, kmsKeyArn, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EncryptionKey {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    keydataSummary: ").append(toIndentedString(keydataSummary)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    localEncryptionConfiguration: ").append(toIndentedString(localEncryptionConfiguration)).append("\n");
    sb.append("    keyConfigurationType: ").append(toIndentedString(keyConfigurationType)).append("\n");
    sb.append("    kmsKeyArn: ").append(toIndentedString(kmsKeyArn)).append("\n");
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

