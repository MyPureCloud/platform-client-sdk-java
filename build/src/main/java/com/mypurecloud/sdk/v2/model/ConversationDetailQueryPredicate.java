package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.NumericRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ConversationDetailQueryPredicate
 */

public class ConversationDetailQueryPredicate  implements Serializable {
  

  /**
   * Optional type, can usually be inferred
   */
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DIMENSION("dimension"),
    PROPERTY("property"),
    METRIC("metric");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  /**
   * Left hand side for dimension predicates
   */
  public enum DimensionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CONVERSATIONEND("conversationEnd"),
    CONVERSATIONID("conversationId"),
    DIVISIONID("divisionId"),
    MEDIASTATSMINCONVERSATIONMOS("mediaStatsMinConversationMos"),
    MEDIASTATSMINCONVERSATIONRFACTOR("mediaStatsMinConversationRFactor"),
    ORIGINATINGDIRECTION("originatingDirection");

    private String value;

    DimensionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DimensionEnum fromString(String key) {
      if (key == null) return null;

      for (DimensionEnum value : DimensionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DimensionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DimensionEnum dimension = null;

  /**
   * Left hand side for metric predicates
   */
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NBLINDTRANSFERRED("nBlindTransferred"),
    NCONNECTED("nConnected"),
    NCONSULT("nConsult"),
    NCONSULTTRANSFERRED("nConsultTransferred"),
    NERROR("nError"),
    NFLOW("nFlow"),
    NFLOWOUTCOME("nFlowOutcome"),
    NFLOWOUTCOMEFAILED("nFlowOutcomeFailed"),
    NOFFERED("nOffered"),
    NOUTBOUND("nOutbound"),
    NOUTBOUNDABANDONED("nOutboundAbandoned"),
    NOUTBOUNDATTEMPTED("nOutboundAttempted"),
    NOUTBOUNDCONNECTED("nOutboundConnected"),
    NSTATETRANSITIONERROR("nStateTransitionError"),
    NTRANSFERRED("nTransferred"),
    TABANDON("tAbandon"),
    TACD("tAcd"),
    TACW("tAcw"),
    TAGENTRESPONSETIME("tAgentResponseTime"),
    TALERT("tAlert"),
    TANSWERED("tAnswered"),
    TCONTACTING("tContacting"),
    TCONVERSATIONDURATION("tConversationDuration"),
    TDIALING("tDialing"),
    TFLOW("tFlow"),
    TFLOWDISCONNECT("tFlowDisconnect"),
    TFLOWEXIT("tFlowExit"),
    TFLOWOUT("tFlowOut"),
    TFLOWOUTCOME("tFlowOutcome"),
    THANDLE("tHandle"),
    THELD("tHeld"),
    THELDCOMPLETE("tHeldComplete"),
    TIVR("tIvr"),
    TMONITORING("tMonitoring"),
    TNOTRESPONDING("tNotResponding"),
    TTALK("tTalk"),
    TTALKCOMPLETE("tTalkComplete"),
    TUSERRESPONSETIME("tUserResponseTime"),
    TVOICEMAIL("tVoicemail");

    private String value;

    MetricEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricEnum fromString(String key) {
      if (key == null) return null;

      for (MetricEnum value : MetricEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private MetricEnum metric = null;

  /**
   * Optional operator, default is matches
   */
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MATCHES("matches"),
    EXISTS("exists"),
    NOTEXISTS("notExists");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;
  private NumericRange range = null;

  
  /**
   * Optional type, can usually be inferred
   **/
  public ConversationDetailQueryPredicate type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional type, can usually be inferred")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * Left hand side for dimension predicates
   **/
  public ConversationDetailQueryPredicate dimension(DimensionEnum dimension) {
    this.dimension = dimension;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for dimension predicates")
  @JsonProperty("dimension")
  public DimensionEnum getDimension() {
    return dimension;
  }
  public void setDimension(DimensionEnum dimension) {
    this.dimension = dimension;
  }

  
  /**
   * Left hand side for metric predicates
   **/
  public ConversationDetailQueryPredicate metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Left hand side for metric predicates")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   * Optional operator, default is matches
   **/
  public ConversationDetailQueryPredicate operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional operator, default is matches")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }

  
  /**
   * Right hand side for dimension or metric predicates
   **/
  public ConversationDetailQueryPredicate value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension or metric predicates")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }

  
  /**
   * Right hand side for dimension or metric predicates
   **/
  public ConversationDetailQueryPredicate range(NumericRange range) {
    this.range = range;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Right hand side for dimension or metric predicates")
  @JsonProperty("range")
  public NumericRange getRange() {
    return range;
  }
  public void setRange(NumericRange range) {
    this.range = range;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationDetailQueryPredicate conversationDetailQueryPredicate = (ConversationDetailQueryPredicate) o;
    return Objects.equals(this.type, conversationDetailQueryPredicate.type) &&
        Objects.equals(this.dimension, conversationDetailQueryPredicate.dimension) &&
        Objects.equals(this.metric, conversationDetailQueryPredicate.metric) &&
        Objects.equals(this.operator, conversationDetailQueryPredicate.operator) &&
        Objects.equals(this.value, conversationDetailQueryPredicate.value) &&
        Objects.equals(this.range, conversationDetailQueryPredicate.range);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, dimension, metric, operator, value, range);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationDetailQueryPredicate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    range: ").append(toIndentedString(range)).append("\n");
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

