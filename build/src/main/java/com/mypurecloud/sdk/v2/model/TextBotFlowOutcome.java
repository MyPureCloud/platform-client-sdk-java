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
import com.mypurecloud.sdk.v2.model.TextBotFlowMilestone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Flow Outcome data related to a bot flow which is exiting gracefully.
 */
@ApiModel(description = "Flow Outcome data related to a bot flow which is exiting gracefully.")

public class TextBotFlowOutcome  implements Serializable {
  
  private String outcomeId = null;

  private static class OutcomeValueEnumDeserializer extends StdDeserializer<OutcomeValueEnum> {
    public OutcomeValueEnumDeserializer() {
      super(OutcomeValueEnumDeserializer.class);
    }

    @Override
    public OutcomeValueEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OutcomeValueEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The value of the FlowOutcome.
   */
 @JsonDeserialize(using = OutcomeValueEnumDeserializer.class)
  public enum OutcomeValueEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SUCCESS("SUCCESS"),
    FAILURE("FAILURE");

    private String value;

    OutcomeValueEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OutcomeValueEnum fromString(String key) {
      if (key == null) return null;

      for (OutcomeValueEnum value : OutcomeValueEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OutcomeValueEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OutcomeValueEnum outcomeValue = null;
  private Date dateStart = null;
  private Date dateEnd = null;
  private List<TextBotFlowMilestone> milestones = new ArrayList<TextBotFlowMilestone>();

  
  /**
   * The Flow Outcome ID.
   **/
  public TextBotFlowOutcome outcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Flow Outcome ID.")
  @JsonProperty("outcomeId")
  public String getOutcomeId() {
    return outcomeId;
  }
  public void setOutcomeId(String outcomeId) {
    this.outcomeId = outcomeId;
  }

  
  /**
   * The value of the FlowOutcome.
   **/
  public TextBotFlowOutcome outcomeValue(OutcomeValueEnum outcomeValue) {
    this.outcomeValue = outcomeValue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The value of the FlowOutcome.")
  @JsonProperty("outcomeValue")
  public OutcomeValueEnum getOutcomeValue() {
    return outcomeValue;
  }
  public void setOutcomeValue(OutcomeValueEnum outcomeValue) {
    this.outcomeValue = outcomeValue;
  }

  
  /**
   * The timestamp for when the Flow Outcome began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TextBotFlowOutcome dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp for when the Flow Outcome began. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * The timestamp for when the Flow Outcome finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public TextBotFlowOutcome dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The timestamp for when the Flow Outcome finished. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }

  
  /**
   * The Flow Milestones for the Flow Outcome.
   **/
  public TextBotFlowOutcome milestones(List<TextBotFlowMilestone> milestones) {
    this.milestones = milestones;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Flow Milestones for the Flow Outcome.")
  @JsonProperty("milestones")
  public List<TextBotFlowMilestone> getMilestones() {
    return milestones;
  }
  public void setMilestones(List<TextBotFlowMilestone> milestones) {
    this.milestones = milestones;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TextBotFlowOutcome textBotFlowOutcome = (TextBotFlowOutcome) o;
    return Objects.equals(this.outcomeId, textBotFlowOutcome.outcomeId) &&
        Objects.equals(this.outcomeValue, textBotFlowOutcome.outcomeValue) &&
        Objects.equals(this.dateStart, textBotFlowOutcome.dateStart) &&
        Objects.equals(this.dateEnd, textBotFlowOutcome.dateEnd) &&
        Objects.equals(this.milestones, textBotFlowOutcome.milestones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outcomeId, outcomeValue, dateStart, dateEnd, milestones);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TextBotFlowOutcome {\n");
    
    sb.append("    outcomeId: ").append(toIndentedString(outcomeId)).append("\n");
    sb.append("    outcomeValue: ").append(toIndentedString(outcomeValue)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    milestones: ").append(toIndentedString(milestones)).append("\n");
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

