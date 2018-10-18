package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AnalyticsQueryFilter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ObservationQuery
 */

public class ObservationQuery  implements Serializable {
  
  private AnalyticsQueryFilter filter = null;

  /**
   * Gets or Sets metrics
   */
  public enum MetricsEnum {
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
    NSURVEYSBOUNCED("nSurveysBounced"),
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
    TFLOWHANGUP("tFlowHangUp"),
    TFLOWEXIT("tFlowExit"),
    TFLOW("tFlow"),
    TFLOWOUTCOME("tFlowOutcome"),
    NFLOWOUTCOME("nFlowOutcome");

    private String value;

    MetricsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MetricsEnum fromString(String key) {
      if (key == null) return null;

      for (MetricsEnum value : MetricsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MetricsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MetricsEnum> metrics = new ArrayList<MetricsEnum>();

  
  /**
   * Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters
   **/
  public ObservationQuery filter(AnalyticsQueryFilter filter) {
    this.filter = filter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Filter to return a subset of observations. Expresses boolean logical predicates as well as dimensional filters")
  @JsonProperty("filter")
  public AnalyticsQueryFilter getFilter() {
    return filter;
  }
  public void setFilter(AnalyticsQueryFilter filter) {
    this.filter = filter;
  }

  
  /**
   * Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).
   **/
  public ObservationQuery metrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Behaves like a SQL SELECT clause. Enables retrieving only named metrics. If omitted, all metrics that are available will be returned (like SELECT *).")
  @JsonProperty("metrics")
  public List<MetricsEnum> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<MetricsEnum> metrics) {
    this.metrics = metrics;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservationQuery observationQuery = (ObservationQuery) o;
    return Objects.equals(this.filter, observationQuery.filter) &&
        Objects.equals(this.metrics, observationQuery.metrics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filter, metrics);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservationQuery {\n");
    
    sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
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

