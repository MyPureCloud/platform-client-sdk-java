package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.PredictorSchedule;
import com.mypurecloud.sdk.v2.model.PredictorWorkloadBalancing;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Predictor
 */

public class Predictor  implements Serializable {
  
  private String id = null;
  private List<AddressableEntityRef> queues = new ArrayList<AddressableEntityRef>();
  private String kpi = null;
  private Integer routingTimeoutSeconds = null;
  private PredictorSchedule schedule = null;

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
   * The predictor state.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("Created"),
    ERROR("Error"),
    ACTIVE("Active");

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
  private Date dateCreated = null;
  private Date dateModified = null;
  private PredictorWorkloadBalancing workloadBalancingConfig = null;
  private String errorCode = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The queue IDs associated with the predictor.
   **/
  public Predictor queues(List<AddressableEntityRef> queues) {
    this.queues = queues;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The queue IDs associated with the predictor.")
  @JsonProperty("queues")
  public List<AddressableEntityRef> getQueues() {
    return queues;
  }
  public void setQueues(List<AddressableEntityRef> queues) {
    this.queues = queues;
  }

  
  /**
   * The KPI that the predictor attempts to maximize/minimize.
   **/
  public Predictor kpi(String kpi) {
    this.kpi = kpi;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The KPI that the predictor attempts to maximize/minimize.")
  @JsonProperty("kpi")
  public String getKpi() {
    return kpi;
  }
  public void setKpi(String kpi) {
    this.kpi = kpi;
  }

  
  /**
   * Number of seconds allocated to predictive routing before attempting a different routing method. This is a value between 12 and 900 seconds.
   **/
  public Predictor routingTimeoutSeconds(Integer routingTimeoutSeconds) {
    this.routingTimeoutSeconds = routingTimeoutSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Number of seconds allocated to predictive routing before attempting a different routing method. This is a value between 12 and 900 seconds.")
  @JsonProperty("routingTimeoutSeconds")
  public Integer getRoutingTimeoutSeconds() {
    return routingTimeoutSeconds;
  }
  public void setRoutingTimeoutSeconds(Integer routingTimeoutSeconds) {
    this.routingTimeoutSeconds = routingTimeoutSeconds;
  }

  
  /**
   * The predictor schedule that determines when the predictor is used for routing interactions.
   **/
  public Predictor schedule(PredictorSchedule schedule) {
    this.schedule = schedule;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The predictor schedule that determines when the predictor is used for routing interactions.")
  @JsonProperty("schedule")
  public PredictorSchedule getSchedule() {
    return schedule;
  }
  public void setSchedule(PredictorSchedule schedule) {
    this.schedule = schedule;
  }

  
  @ApiModelProperty(example = "null", value = "The predictor state.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  
  @ApiModelProperty(example = "null", value = "DateTime indicating when the predictor was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "DateTime indicating when the predictor was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }

  
  /**
   * The predictor balancing configuration to enable workload balancing.
   **/
  public Predictor workloadBalancingConfig(PredictorWorkloadBalancing workloadBalancingConfig) {
    this.workloadBalancingConfig = workloadBalancingConfig;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The predictor balancing configuration to enable workload balancing.")
  @JsonProperty("workloadBalancingConfig")
  public PredictorWorkloadBalancing getWorkloadBalancingConfig() {
    return workloadBalancingConfig;
  }
  public void setWorkloadBalancingConfig(PredictorWorkloadBalancing workloadBalancingConfig) {
    this.workloadBalancingConfig = workloadBalancingConfig;
  }

  
  @ApiModelProperty(example = "null", value = "Predictor error code - optional details on why the predictor went into error state.")
  @JsonProperty("errorCode")
  public String getErrorCode() {
    return errorCode;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Predictor predictor = (Predictor) o;
    return Objects.equals(this.id, predictor.id) &&
        Objects.equals(this.queues, predictor.queues) &&
        Objects.equals(this.kpi, predictor.kpi) &&
        Objects.equals(this.routingTimeoutSeconds, predictor.routingTimeoutSeconds) &&
        Objects.equals(this.schedule, predictor.schedule) &&
        Objects.equals(this.state, predictor.state) &&
        Objects.equals(this.dateCreated, predictor.dateCreated) &&
        Objects.equals(this.dateModified, predictor.dateModified) &&
        Objects.equals(this.workloadBalancingConfig, predictor.workloadBalancingConfig) &&
        Objects.equals(this.errorCode, predictor.errorCode) &&
        Objects.equals(this.selfUri, predictor.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, queues, kpi, routingTimeoutSeconds, schedule, state, dateCreated, dateModified, workloadBalancingConfig, errorCode, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Predictor {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    kpi: ").append(toIndentedString(kpi)).append("\n");
    sb.append("    routingTimeoutSeconds: ").append(toIndentedString(routingTimeoutSeconds)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    workloadBalancingConfig: ").append(toIndentedString(workloadBalancingConfig)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

