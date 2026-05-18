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
 * CampaignRuleCampaignWaitTimeSettings
 */

public class CampaignRuleCampaignWaitTimeSettings  implements Serializable {
  

  private static class WaitTypeEnumDeserializer extends StdDeserializer<WaitTypeEnum> {
    public WaitTypeEnumDeserializer() {
      super(WaitTypeEnumDeserializer.class);
    }

    @Override
    public WaitTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WaitTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Campaign wait type
   */
 @JsonDeserialize(using = WaitTypeEnumDeserializer.class)
  public enum WaitTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    WAITINGFORAGENTS("WaitingForAgents"),
    WAITINGFORCONTACTS("WaitingForContacts"),
    WAITINGFORLINES("WaitingForLines");

    private String value;

    WaitTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WaitTypeEnum fromString(String key) {
      if (key == null) return null;

      for (WaitTypeEnum value : WaitTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WaitTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WaitTypeEnum waitType = null;

  public CampaignRuleCampaignWaitTimeSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CampaignRuleCampaignWaitTimeSettings(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * Campaign wait type
   **/
  public CampaignRuleCampaignWaitTimeSettings waitType(WaitTypeEnum waitType) {
    this.waitType = waitType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Campaign wait type")
  @JsonProperty("waitType")
  public WaitTypeEnum getWaitType() {
    return waitType;
  }
  public void setWaitType(WaitTypeEnum waitType) {
    this.waitType = waitType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleCampaignWaitTimeSettings campaignRuleCampaignWaitTimeSettings = (CampaignRuleCampaignWaitTimeSettings) o;

    return Objects.equals(this.waitType, campaignRuleCampaignWaitTimeSettings.waitType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(waitType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleCampaignWaitTimeSettings {\n");
    
    sb.append("    waitType: ").append(toIndentedString(waitType)).append("\n");
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

