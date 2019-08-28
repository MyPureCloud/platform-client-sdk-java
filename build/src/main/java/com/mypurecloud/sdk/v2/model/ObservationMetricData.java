package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ObservationValue;
import com.mypurecloud.sdk.v2.model.StatisticalSummary;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ObservationMetricData
 */

public class ObservationMetricData  implements Serializable {
  

  /**
   * Gets or Sets metric
   */
  public enum MetricEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TSEGMENTDURATION("tSegmentDuration"),
    TCONVERSATIONDURATION("tConversationDuration"),
    OTOTALCRITICALSCORE("oTotalCriticalScore"),
    OTOTALSCORE("oTotalScore"),
    NEVALUATIONS("nEvaluations"),
    TABANDON("tAbandon"),
    TIVR("tIvr"),
    TANSWERED("tAnswered"),
    TFLOWOUT("tFlowOut"),
    TACD("tAcd"),
    TTALK("tTalk"),
    THELD("tHeld"),
    TTALKCOMPLETE("tTalkComplete"),
    THELDCOMPLETE("tHeldComplete"),
    TACW("tAcw"),
    THANDLE("tHandle"),
    TCONTACTING("tContacting"),
    TDIALING("tDialing"),
    TWAIT("tWait"),
    TAGENTROUTINGSTATUS("tAgentRoutingStatus"),
    TORGANIZATIONPRESENCE("tOrganizationPresence"),
    TSYSTEMPRESENCE("tSystemPresence"),
    TUSERRESPONSETIME("tUserResponseTime"),
    TAGENTRESPONSETIME("tAgentResponseTime"),
    TVOICEMAIL("tVoicemail"),
    NSTATETRANSITIONERROR("nStateTransitionError"),
    NOFFERED("nOffered"),
    NOVERSLA("nOverSla"),
    NTRANSFERRED("nTransferred"),
    NBLINDTRANSFERRED("nBlindTransferred"),
    NCONSULTTRANSFERRED("nConsultTransferred"),
    NCONSULT("nConsult"),
    NCONNECTED("nConnected"),
    TALERT("tAlert"),
    TNOTRESPONDING("tNotResponding"),
    NOUTBOUND("nOutbound"),
    NOUTBOUNDATTEMPTED("nOutboundAttempted"),
    NOUTBOUNDCONNECTED("nOutboundConnected"),
    NOUTBOUNDABANDONED("nOutboundAbandoned"),
    NERROR("nError"),
    OSERVICETARGET("oServiceTarget"),
    OSERVICELEVEL("oServiceLevel"),
    TACTIVE("tActive"),
    TINACTIVE("tInactive"),
    OACTIVEUSERS("oActiveUsers"),
    OMEMBERUSERS("oMemberUsers"),
    OACTIVEQUEUES("oActiveQueues"),
    OMEMBERQUEUES("oMemberQueues"),
    OINTERACTING("oInteracting"),
    OWAITING("oWaiting"),
    OONQUEUEUSERS("oOnQueueUsers"),
    OOFFQUEUEUSERS("oOffQueueUsers"),
    OUSERPRESENCES("oUserPresences"),
    OUSERROUTINGSTATUSES("oUserRoutingStatuses"),
    NSURVEYSSENT("nSurveysSent"),
    NSURVEYSSTARTED("nSurveysStarted"),
    NSURVEYSABANDONED("nSurveysAbandoned"),
    NSURVEYSEXPIRED("nSurveysExpired"),
    NSURVEYERRORS("nSurveyErrors"),
    NSURVEYRESPONSES("nSurveyResponses"),
    NSURVEYANSWERRESPONSES("nSurveyAnswerResponses"),
    OSURVEYTOTALSCORE("oSurveyTotalScore"),
    OSURVEYQUESTIONGROUPSCORE("oSurveyQuestionGroupScore"),
    NSURVEYQUESTIONGROUPRESPONSES("nSurveyQuestionGroupResponses"),
    OSURVEYQUESTIONSCORE("oSurveyQuestionScore"),
    NSURVEYQUESTIONRESPONSES("nSurveyQuestionResponses"),
    NSURVEYNPSRESPONSES("nSurveyNpsResponses"),
    NSURVEYNPSPROMOTERS("nSurveyNpsPromoters"),
    NSURVEYNPSDETRACTORS("nSurveyNpsDetractors"),
    NFLOW("nFlow"),
    TFLOWDISCONNECT("tFlowDisconnect"),
    TFLOWEXIT("tFlowExit"),
    TFLOW("tFlow"),
    OFLOW("oFlow"),
    TFLOWOUTCOME("tFlowOutcome"),
    NFLOWOUTCOME("nFlowOutcome"),
    NFLOWOUTCOMEFAILED("nFlowOutcomeFailed"),
    NWEBACTIONSQUALIFIED("nWebActionsQualified"),
    NWEBACTIONSOFFERED("nWebActionsOffered"),
    NWEBACTIONSACCEPTED("nWebActionsAccepted"),
    NWEBACTIONSREJECTED("nWebActionsRejected"),
    NWEBACTIONSTIMEDOUT("nWebActionsTimedout"),
    NWEBACTIONSERRORED("nWebActionsErrored"),
    NWEBACTIONSIGNORED("nWebActionsIgnored"),
    NWEBACTIONSSTARTED("nWebActionsStarted"),
    NWEBACTIONSENGAGED("nWebActionsEngaged");

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
  private String qualifier = null;
  private StatisticalSummary stats = null;
  private Boolean truncated = null;
  private List<ObservationValue> observations = new ArrayList<ObservationValue>();

  
  /**
   **/
  public ObservationMetricData metric(MetricEnum metric) {
    this.metric = metric;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metric")
  public MetricEnum getMetric() {
    return metric;
  }
  public void setMetric(MetricEnum metric) {
    this.metric = metric;
  }

  
  /**
   **/
  public ObservationMetricData qualifier(String qualifier) {
    this.qualifier = qualifier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("qualifier")
  public String getQualifier() {
    return qualifier;
  }
  public void setQualifier(String qualifier) {
    this.qualifier = qualifier;
  }

  
  /**
   **/
  public ObservationMetricData stats(StatisticalSummary stats) {
    this.stats = stats;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("stats")
  public StatisticalSummary getStats() {
    return stats;
  }
  public void setStats(StatisticalSummary stats) {
    this.stats = stats;
  }

  
  /**
   * Flag for a truncated list of observations. If truncated, the first half of the list of observations will contain the oldest observations and the second half the newest observations.
   **/
  public ObservationMetricData truncated(Boolean truncated) {
    this.truncated = truncated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flag for a truncated list of observations. If truncated, the first half of the list of observations will contain the oldest observations and the second half the newest observations.")
  @JsonProperty("truncated")
  public Boolean getTruncated() {
    return truncated;
  }
  public void setTruncated(Boolean truncated) {
    this.truncated = truncated;
  }

  
  /**
   * List of observations sorted by timestamp in ascending order. This list may be truncated.
   **/
  public ObservationMetricData observations(List<ObservationValue> observations) {
    this.observations = observations;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of observations sorted by timestamp in ascending order. This list may be truncated.")
  @JsonProperty("observations")
  public List<ObservationValue> getObservations() {
    return observations;
  }
  public void setObservations(List<ObservationValue> observations) {
    this.observations = observations;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationMetricData observationMetricData = (ObservationMetricData) o;
    return Objects.equals(this.metric, observationMetricData.metric) &&
        Objects.equals(this.qualifier, observationMetricData.qualifier) &&
        Objects.equals(this.stats, observationMetricData.stats) &&
        Objects.equals(this.truncated, observationMetricData.truncated) &&
        Objects.equals(this.observations, observationMetricData.observations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, qualifier, stats, truncated, observations);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationMetricData {\n");
    
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    qualifier: ").append(toIndentedString(qualifier)).append("\n");
    sb.append("    stats: ").append(toIndentedString(stats)).append("\n");
    sb.append("    truncated: ").append(toIndentedString(truncated)).append("\n");
    sb.append("    observations: ").append(toIndentedString(observations)).append("\n");
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

