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
import com.mypurecloud.sdk.v2.model.CampaignRuleWarningParameters;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CampaignRuleWarning
 */

public class CampaignRuleWarning  implements Serializable {
  

  private static class CodeEnumDeserializer extends StdDeserializer<CodeEnum> {
    public CodeEnumDeserializer() {
      super(CodeEnumDeserializer.class);
    }

    @Override
    public CodeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CodeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Warning code for this warning.
   */
 @JsonDeserialize(using = CodeEnumDeserializer.class)
  public enum CodeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONDITIONSNOENTITIES("ConditionsNoEntities"),
    CONDITIONSNOSEQUENCES("ConditionsNoSequences"),
    CONDITIONSNOCAMPAIGNS("ConditionsNoCampaigns"),
    CONDITIONSNOMESSAGINGCAMPAIGNS("ConditionsNoMessagingCampaigns"),
    ACTIONNOENTITIES("ActionNoEntities"),
    ACTIONNOSEQUENCES("ActionNoSequences"),
    ACTIONNOCAMPAIGNS("ActionNoCampaigns"),
    ACTIONNOMESSAGINGCAMPAIGNS("ActionNoMessagingCampaigns"),
    NOQUEUE("NoQueue"),
    NOCONTENTTEMPLATES("NoContentTemplates"),
    NOSMSCONTENTTEMPLATE("NoSmsContentTemplate"),
    NOEMAILCONTENTTEMPLATE("NoEmailContentTemplate"),
    CONDITIONSWAITINGFORLINESONLYPREVIEWOREXTERNAL("ConditionsWaitingForLinesOnlyPreviewOrExternal"),
    CONDITIONSWAITINGFORAGENTSONLYAGENTLESS("ConditionsWaitingForAgentsOnlyAgentless");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CodeEnum fromString(String key) {
      if (key == null) return null;

      for (CodeEnum value : CodeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CodeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CodeEnum code = null;
  private String message = null;
  private CampaignRuleWarningParameters params = null;

  public CampaignRuleWarning() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Warning code for this warning.
   **/
  public CampaignRuleWarning code(CodeEnum code) {
    this.code = code;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Warning code for this warning.")
  @JsonProperty("code")
  public CodeEnum getCode() {
    return code;
  }
  public void setCode(CodeEnum code) {
    this.code = code;
  }


  /**
   * Warning message for this warning.
   **/
  public CampaignRuleWarning message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Warning message for this warning.")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }


  /**
   * Additional warning information
   **/
  public CampaignRuleWarning params(CampaignRuleWarningParameters params) {
    this.params = params;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional warning information")
  @JsonProperty("params")
  public CampaignRuleWarningParameters getParams() {
    return params;
  }
  public void setParams(CampaignRuleWarningParameters params) {
    this.params = params;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleWarning campaignRuleWarning = (CampaignRuleWarning) o;

    return Objects.equals(this.code, campaignRuleWarning.code) &&
            Objects.equals(this.message, campaignRuleWarning.message) &&
            Objects.equals(this.params, campaignRuleWarning.params);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, message, params);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleWarning {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    params: ").append(toIndentedString(params)).append("\n");
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

