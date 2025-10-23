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
 * ConversationAggregationSort
 */

public class ConversationAggregationSort  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the metric used for sorting values.
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NBLINDTRANSFERRED("nBlindTransferred"),
    NBOTINTERACTIONS("nBotInteractions"),
    NCOBROWSESESSIONS("nCobrowseSessions"),
    NCONNECTED("nConnected"),
    NCONSULT("nConsult"),
    NCONSULTTRANSFERRED("nConsultTransferred"),
    NCONVERSATIONS("nConversations"),
    NERROR("nError"),
    NOFFERED("nOffered"),
    NOUTBOUND("nOutbound"),
    NOUTBOUNDABANDONED("nOutboundAbandoned"),
    NOUTBOUNDATTEMPTED("nOutboundAttempted"),
    NOUTBOUNDCONNECTED("nOutboundConnected"),
    NOVERSLA("nOverSla"),
    NSTATETRANSITIONERROR("nStateTransitionError"),
    NTRANSFERRED("nTransferred"),
    OAUDIOMESSAGECOUNT("oAudioMessageCount"),
    OEXTERNALAUDIOMESSAGECOUNT("oExternalAudioMessageCount"),
    OEXTERNALMEDIACOUNT("oExternalMediaCount"),
    OMEDIACOUNT("oMediaCount"),
    OMESSAGECOUNT("oMessageCount"),
    OMESSAGESEGMENTCOUNT("oMessageSegmentCount"),
    OMESSAGETURN("oMessageTurn"),
    OSERVICETARGET("oServiceTarget"),
    TABANDON("tAbandon"),
    TACD("tAcd"),
    TACTIVECALLBACK("tActiveCallback"),
    TACTIVECALLBACKCOMPLETE("tActiveCallbackComplete"),
    TACW("tAcw"),
    TAGENTRESPONSETIME("tAgentResponseTime"),
    TAGENTVIDEOCONNECTED("tAgentVideoConnected"),
    TALERT("tAlert"),
    TANSWERED("tAnswered"),
    TAVERAGEAGENTRESPONSETIME("tAverageAgentResponseTime"),
    TAVERAGECUSTOMERRESPONSETIME("tAverageCustomerResponseTime"),
    TBARGING("tBarging"),
    TCOACHING("tCoaching"),
    TCOACHINGCOMPLETE("tCoachingComplete"),
    TCONNECTED("tConnected"),
    TCONTACTING("tContacting"),
    TDIALING("tDialing"),
    TFIRSTCONNECT("tFirstConnect"),
    TFIRSTDIAL("tFirstDial"),
    TFIRSTENGAGEMENT("tFirstEngagement"),
    TFIRSTRESPONSE("tFirstResponse"),
    TFLOWOUT("tFlowOut"),
    THANDLE("tHandle"),
    THELD("tHeld"),
    THELDCOMPLETE("tHeldComplete"),
    TIVR("tIvr"),
    TMONITORING("tMonitoring"),
    TMONITORINGCOMPLETE("tMonitoringComplete"),
    TNOTRESPONDING("tNotResponding"),
    TPARK("tPark"),
    TPARKCOMPLETE("tParkComplete"),
    TTALK("tTalk"),
    TTALKCOMPLETE("tTalkComplete"),
    TUSERRESPONSETIME("tUserResponseTime"),
    TVOICEMAIL("tVoicemail");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;

  private static class FunctionEnumDeserializer extends StdDeserializer<FunctionEnum> {
    public FunctionEnumDeserializer() {
      super(FunctionEnumDeserializer.class);
    }

    @Override
    public FunctionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FunctionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Aggregation function used for the sort metric.
   */
 @JsonDeserialize(using = FunctionEnumDeserializer.class)
  public enum FunctionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COUNT("count"),
    MAX("max"),
    MIN("min"),
    SUM("sum");

    private String value;

    FunctionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FunctionEnum fromString(String key) {
      if (key == null) return null;

      for (FunctionEnum value : FunctionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FunctionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FunctionEnum function = null;

  public ConversationAggregationSort() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Name of the metric used for sorting values.
   **/
  public ConversationAggregationSort name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Name of the metric used for sorting values.")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }


  /**
   * Aggregation function used for the sort metric.
   **/
  public ConversationAggregationSort function(FunctionEnum function) {
    this.function = function;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Aggregation function used for the sort metric.")
  @JsonProperty("function")
  public FunctionEnum getFunction() {
    return function;
  }
  public void setFunction(FunctionEnum function) {
    this.function = function;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationAggregationSort conversationAggregationSort = (ConversationAggregationSort) o;

    return Objects.equals(this.name, conversationAggregationSort.name) &&
            Objects.equals(this.function, conversationAggregationSort.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationAggregationSort {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
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

