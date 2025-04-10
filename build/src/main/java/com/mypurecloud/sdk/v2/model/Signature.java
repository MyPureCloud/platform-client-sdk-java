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
 * Signature
 */

public class Signature  implements Serializable {
  
  private Boolean enabled = null;
  private String cannedResponseId = null;
  private Boolean alwaysIncluded = null;

  private static class InclusionTypeEnumDeserializer extends StdDeserializer<InclusionTypeEnum> {
    public InclusionTypeEnumDeserializer() {
      super(InclusionTypeEnumDeserializer.class);
    }

    @Override
    public InclusionTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return InclusionTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The configuration to indicate when the signature of a conversation has to be included
   */
 @JsonDeserialize(using = InclusionTypeEnumDeserializer.class)
  public enum InclusionTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    SEND("Send"),
    SENDONCE("SendOnce");

    private String value;

    InclusionTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static InclusionTypeEnum fromString(String key) {
      if (key == null) return null;

      for (InclusionTypeEnum value : InclusionTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return InclusionTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private InclusionTypeEnum inclusionType = null;

  public Signature() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * A toggle to enable the signature on email send.
   **/
  public Signature enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A toggle to enable the signature on email send.")
  @JsonProperty("enabled")
  public Boolean getEnabled() {
    return enabled;
  }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  /**
   * The identifier referring to an email signature canned response.
   **/
  public Signature cannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The identifier referring to an email signature canned response.")
  @JsonProperty("cannedResponseId")
  public String getCannedResponseId() {
    return cannedResponseId;
  }
  public void setCannedResponseId(String cannedResponseId) {
    this.cannedResponseId = cannedResponseId;
  }


  /**
   * A toggle that defines if a signature is always included or only set on the first email in an email chain.
   **/
  public Signature alwaysIncluded(Boolean alwaysIncluded) {
    this.alwaysIncluded = alwaysIncluded;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A toggle that defines if a signature is always included or only set on the first email in an email chain.")
  @JsonProperty("alwaysIncluded")
  public Boolean getAlwaysIncluded() {
    return alwaysIncluded;
  }
  public void setAlwaysIncluded(Boolean alwaysIncluded) {
    this.alwaysIncluded = alwaysIncluded;
  }


  /**
   * The configuration to indicate when the signature of a conversation has to be included
   **/
  public Signature inclusionType(InclusionTypeEnum inclusionType) {
    this.inclusionType = inclusionType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The configuration to indicate when the signature of a conversation has to be included")
  @JsonProperty("inclusionType")
  public InclusionTypeEnum getInclusionType() {
    return inclusionType;
  }
  public void setInclusionType(InclusionTypeEnum inclusionType) {
    this.inclusionType = inclusionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Signature signature = (Signature) o;

    return Objects.equals(this.enabled, signature.enabled) &&
            Objects.equals(this.cannedResponseId, signature.cannedResponseId) &&
            Objects.equals(this.alwaysIncluded, signature.alwaysIncluded) &&
            Objects.equals(this.inclusionType, signature.inclusionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, cannedResponseId, alwaysIncluded, inclusionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Signature {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    cannedResponseId: ").append(toIndentedString(cannedResponseId)).append("\n");
    sb.append("    alwaysIncluded: ").append(toIndentedString(alwaysIncluded)).append("\n");
    sb.append("    inclusionType: ").append(toIndentedString(inclusionType)).append("\n");
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

