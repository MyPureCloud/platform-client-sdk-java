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
import com.mypurecloud.sdk.v2.model.KeyPerformanceIndicatorAssessment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BenefitAssessment
 */

public class BenefitAssessment  implements Serializable {
  
  private String id = null;
  private List<AddressableEntityRef> queues = new ArrayList<AddressableEntityRef>();
  private List<KeyPerformanceIndicatorAssessment> kpiAssessments = new ArrayList<KeyPerformanceIndicatorAssessment>();

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
   * State of the benefit assessment.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CREATED("Created"),
    FINISHED("Finished"),
    FAILED("Failed");

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
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "The list of queues that are assessed for Predictive Routing benefit.")
  @JsonProperty("queues")
  public List<AddressableEntityRef> getQueues() {
    return queues;
  }

  
  @ApiModelProperty(example = "null", value = "A set of key performance indicators applied on the queue to determine suitability of Predictive Routing.")
  @JsonProperty("kpiAssessments")
  public List<KeyPerformanceIndicatorAssessment> getKpiAssessments() {
    return kpiAssessments;
  }

  
  @ApiModelProperty(example = "null", value = "State of the benefit assessment.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  
  @ApiModelProperty(example = "null", value = "Creation Date of the benefit assessment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "Modified Date of the benefit assessment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
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
    BenefitAssessment benefitAssessment = (BenefitAssessment) o;
    return Objects.equals(this.id, benefitAssessment.id) &&
        Objects.equals(this.queues, benefitAssessment.queues) &&
        Objects.equals(this.kpiAssessments, benefitAssessment.kpiAssessments) &&
        Objects.equals(this.state, benefitAssessment.state) &&
        Objects.equals(this.dateCreated, benefitAssessment.dateCreated) &&
        Objects.equals(this.dateModified, benefitAssessment.dateModified) &&
        Objects.equals(this.selfUri, benefitAssessment.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, queues, kpiAssessments, state, dateCreated, dateModified, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitAssessment {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    queues: ").append(toIndentedString(queues)).append("\n");
    sb.append("    kpiAssessments: ").append(toIndentedString(kpiAssessments)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
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

