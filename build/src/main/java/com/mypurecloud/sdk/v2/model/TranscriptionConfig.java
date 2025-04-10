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
 * TranscriptionConfig
 */

public class TranscriptionConfig  implements Serializable {
  

  private static class VendorNameEnumDeserializer extends StdDeserializer<VendorNameEnum> {
    public VendorNameEnumDeserializer() {
      super(VendorNameEnumDeserializer.class);
    }

    @Override
    public VendorNameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VendorNameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The name of the vendor used for speech transcription.
   */
 @JsonDeserialize(using = VendorNameEnumDeserializer.class)
  public enum VendorNameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GOOGLEDIALOGFLOW("GoogleDialogflow"),
    UNKNOWN("Unknown"),
    GENESYS("Genesys");

    private String value;

    VendorNameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VendorNameEnum fromString(String key) {
      if (key == null) return null;

      for (VendorNameEnum value : VendorNameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VendorNameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VendorNameEnum vendorName = null;

  public TranscriptionConfig() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the vendor used for speech transcription.
   **/
  public TranscriptionConfig vendorName(VendorNameEnum vendorName) {
    this.vendorName = vendorName;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the vendor used for speech transcription.")
  @JsonProperty("vendorName")
  public VendorNameEnum getVendorName() {
    return vendorName;
  }
  public void setVendorName(VendorNameEnum vendorName) {
    this.vendorName = vendorName;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TranscriptionConfig transcriptionConfig = (TranscriptionConfig) o;

    return Objects.equals(this.vendorName, transcriptionConfig.vendorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vendorName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TranscriptionConfig {\n");
    
    sb.append("    vendorName: ").append(toIndentedString(vendorName)).append("\n");
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

