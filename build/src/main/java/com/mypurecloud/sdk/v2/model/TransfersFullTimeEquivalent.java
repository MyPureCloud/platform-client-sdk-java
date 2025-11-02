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
 * TransfersFullTimeEquivalent
 */

public class TransfersFullTimeEquivalent  implements Serializable {
  
  private String destinationStaffingGroupId = null;

  private static class TransferTypeEnumDeserializer extends StdDeserializer<TransferTypeEnum> {
    public TransferTypeEnumDeserializer() {
      super(TransferTypeEnumDeserializer.class);
    }

    @Override
    public TransferTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransferTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The duration of the transfer full time equivalent from one staffing group to another
   */
 @JsonDeserialize(using = TransferTypeEnumDeserializer.class)
  public enum TransferTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PERMANENT("Permanent"),
    TEMPORARY("Temporary");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransferTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TransferTypeEnum value : TransferTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransferTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransferTypeEnum transferType = null;

  public TransfersFullTimeEquivalent() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The target staffing group that will receive the full time equivalent when agents are transferred from one staffing group to another
   **/
  public TransfersFullTimeEquivalent destinationStaffingGroupId(String destinationStaffingGroupId) {
    this.destinationStaffingGroupId = destinationStaffingGroupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target staffing group that will receive the full time equivalent when agents are transferred from one staffing group to another")
  @JsonProperty("destinationStaffingGroupId")
  public String getDestinationStaffingGroupId() {
    return destinationStaffingGroupId;
  }
  public void setDestinationStaffingGroupId(String destinationStaffingGroupId) {
    this.destinationStaffingGroupId = destinationStaffingGroupId;
  }


  /**
   * The duration of the transfer full time equivalent from one staffing group to another
   **/
  public TransfersFullTimeEquivalent transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration of the transfer full time equivalent from one staffing group to another")
  @JsonProperty("transferType")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }
  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TransfersFullTimeEquivalent transfersFullTimeEquivalent = (TransfersFullTimeEquivalent) o;

    return Objects.equals(this.destinationStaffingGroupId, transfersFullTimeEquivalent.destinationStaffingGroupId) &&
            Objects.equals(this.transferType, transfersFullTimeEquivalent.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destinationStaffingGroupId, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransfersFullTimeEquivalent {\n");
    
    sb.append("    destinationStaffingGroupId: ").append(toIndentedString(destinationStaffingGroupId)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

