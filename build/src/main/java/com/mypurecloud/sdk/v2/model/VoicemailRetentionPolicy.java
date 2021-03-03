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
 * Governs how the voicemail is retained
 */
@ApiModel(description = "Governs how the voicemail is retained")

public class VoicemailRetentionPolicy  implements Serializable {
  

  private static class VoicemailRetentionPolicyTypeEnumDeserializer extends StdDeserializer<VoicemailRetentionPolicyTypeEnum> {
    public VoicemailRetentionPolicyTypeEnumDeserializer() {
      super(VoicemailRetentionPolicyTypeEnumDeserializer.class);
    }

    @Override
    public VoicemailRetentionPolicyTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VoicemailRetentionPolicyTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The retention policy type
   */
 @JsonDeserialize(using = VoicemailRetentionPolicyTypeEnumDeserializer.class)
  public enum VoicemailRetentionPolicyTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    RETAIN_INDEFINITELY("RETAIN_INDEFINITELY"),
    RETAIN_WITH_TTL("RETAIN_WITH_TTL"),
    IMMEDIATE_DELETE("IMMEDIATE_DELETE");

    private String value;

    VoicemailRetentionPolicyTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VoicemailRetentionPolicyTypeEnum fromString(String key) {
      if (key == null) return null;

      for (VoicemailRetentionPolicyTypeEnum value : VoicemailRetentionPolicyTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VoicemailRetentionPolicyTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VoicemailRetentionPolicyTypeEnum voicemailRetentionPolicyType = null;
  private Integer numberOfDays = null;

  
  /**
   * The retention policy type
   **/
  public VoicemailRetentionPolicy voicemailRetentionPolicyType(VoicemailRetentionPolicyTypeEnum voicemailRetentionPolicyType) {
    this.voicemailRetentionPolicyType = voicemailRetentionPolicyType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The retention policy type")
  @JsonProperty("voicemailRetentionPolicyType")
  public VoicemailRetentionPolicyTypeEnum getVoicemailRetentionPolicyType() {
    return voicemailRetentionPolicyType;
  }
  public void setVoicemailRetentionPolicyType(VoicemailRetentionPolicyTypeEnum voicemailRetentionPolicyType) {
    this.voicemailRetentionPolicyType = voicemailRetentionPolicyType;
  }

  
  /**
   * If retentionPolicyType == RETAIN_WITH_TTL, then this value represents the number of days for the TTL
   **/
  public VoicemailRetentionPolicy numberOfDays(Integer numberOfDays) {
    this.numberOfDays = numberOfDays;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If retentionPolicyType == RETAIN_WITH_TTL, then this value represents the number of days for the TTL")
  @JsonProperty("numberOfDays")
  public Integer getNumberOfDays() {
    return numberOfDays;
  }
  public void setNumberOfDays(Integer numberOfDays) {
    this.numberOfDays = numberOfDays;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicemailRetentionPolicy voicemailRetentionPolicy = (VoicemailRetentionPolicy) o;
    return Objects.equals(this.voicemailRetentionPolicyType, voicemailRetentionPolicy.voicemailRetentionPolicyType) &&
        Objects.equals(this.numberOfDays, voicemailRetentionPolicy.numberOfDays);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voicemailRetentionPolicyType, numberOfDays);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicemailRetentionPolicy {\n");
    
    sb.append("    voicemailRetentionPolicyType: ").append(toIndentedString(voicemailRetentionPolicyType)).append("\n");
    sb.append("    numberOfDays: ").append(toIndentedString(numberOfDays)).append("\n");
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

