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
import com.mypurecloud.sdk.v2.model.WfmVersionedEntityMetadata;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AdminBulkUpdateAlternativeShiftTradeState
 */

public class AdminBulkUpdateAlternativeShiftTradeState  implements Serializable {
  
  private String tradeId = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The new alternative shift trade state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    APPROVED("Approved"),
    DENIED("Denied");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private WfmVersionedEntityMetadata metadata = null;

  
  /**
   * The ID of the trade for this alternative shift trade
   **/
  public AdminBulkUpdateAlternativeShiftTradeState tradeId(String tradeId) {
    this.tradeId = tradeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the trade for this alternative shift trade")
  @JsonProperty("tradeId")
  public String getTradeId() {
    return tradeId;
  }
  public void setTradeId(String tradeId) {
    this.tradeId = tradeId;
  }


  /**
   * The new alternative shift trade state
   **/
  public AdminBulkUpdateAlternativeShiftTradeState state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The new alternative shift trade state")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * Version metadata for this alternative shift trade
   **/
  public AdminBulkUpdateAlternativeShiftTradeState metadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Version metadata for this alternative shift trade")
  @JsonProperty("metadata")
  public WfmVersionedEntityMetadata getMetadata() {
    return metadata;
  }
  public void setMetadata(WfmVersionedEntityMetadata metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AdminBulkUpdateAlternativeShiftTradeState adminBulkUpdateAlternativeShiftTradeState = (AdminBulkUpdateAlternativeShiftTradeState) o;

    return Objects.equals(this.tradeId, adminBulkUpdateAlternativeShiftTradeState.tradeId) &&
            Objects.equals(this.state, adminBulkUpdateAlternativeShiftTradeState.state) &&
            Objects.equals(this.metadata, adminBulkUpdateAlternativeShiftTradeState.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tradeId, state, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdminBulkUpdateAlternativeShiftTradeState {\n");
    
    sb.append("    tradeId: ").append(toIndentedString(tradeId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

