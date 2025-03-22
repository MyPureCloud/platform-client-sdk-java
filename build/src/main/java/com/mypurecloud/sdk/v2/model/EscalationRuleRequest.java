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
import com.mypurecloud.sdk.v2.model.EscalationTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EscalationRuleRequest
 */

public class EscalationRuleRequest  implements Serializable {
  
  private String name = null;
  private String matchCriteria = null;
  private Integer priority = null;
  private String divisionId = null;
  private String description = null;

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the escalation rule.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("Active"),
    PAUSED("Paused");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;
  private EscalationTarget openEscalation = null;
  private EscalationTarget facebookEscalation = null;
  private EscalationTarget instagramEscalation = null;
  private EscalationTarget twitterEscalation = null;

  
  /**
   * The name of the escalation rule.
   **/
  public EscalationRuleRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the escalation rule.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The criteria that defines when a social media message should be escalated.
   **/
  public EscalationRuleRequest matchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The criteria that defines when a social media message should be escalated.")
  @JsonProperty("matchCriteria")
  public String getMatchCriteria() {
    return matchCriteria;
  }
  public void setMatchCriteria(String matchCriteria) {
    this.matchCriteria = matchCriteria;
  }


  /**
   * The priority of the escalation rule. The lower the number the higer the priority. Once a rule is matched others are skipped.
   * minimum: 1
   **/
  public EscalationRuleRequest priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The priority of the escalation rule. The lower the number the higer the priority. Once a rule is matched others are skipped.")
  @JsonProperty("priority")
  public Integer getPriority() {
    return priority;
  }
  public void setPriority(Integer priority) {
    this.priority = priority;
  }


  /**
   * The ID of the division the social escalation rule belongs to.
   **/
  public EscalationRuleRequest divisionId(String divisionId) {
    this.divisionId = divisionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the division the social escalation rule belongs to.")
  @JsonProperty("divisionId")
  public String getDivisionId() {
    return divisionId;
  }
  public void setDivisionId(String divisionId) {
    this.divisionId = divisionId;
  }


  /**
   * A description of the social escalation rule.
   **/
  public EscalationRuleRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A description of the social escalation rule.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The status of the escalation rule.
   **/
  public EscalationRuleRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the escalation rule.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The target integration configuration used for an open social media message if the match criteria returns true.
   **/
  public EscalationRuleRequest openEscalation(EscalationTarget openEscalation) {
    this.openEscalation = openEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for an open social media message if the match criteria returns true.")
  @JsonProperty("openEscalation")
  public EscalationTarget getOpenEscalation() {
    return openEscalation;
  }
  public void setOpenEscalation(EscalationTarget openEscalation) {
    this.openEscalation = openEscalation;
  }


  /**
   * The target integration configuration used for a Facebook social media message if the match criteria returns true.
   **/
  public EscalationRuleRequest facebookEscalation(EscalationTarget facebookEscalation) {
    this.facebookEscalation = facebookEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for a Facebook social media message if the match criteria returns true.")
  @JsonProperty("facebookEscalation")
  public EscalationTarget getFacebookEscalation() {
    return facebookEscalation;
  }
  public void setFacebookEscalation(EscalationTarget facebookEscalation) {
    this.facebookEscalation = facebookEscalation;
  }


  /**
   * The target integration configuration used for an Instagram social media message if the match criteria returns true.
   **/
  public EscalationRuleRequest instagramEscalation(EscalationTarget instagramEscalation) {
    this.instagramEscalation = instagramEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for an Instagram social media message if the match criteria returns true.")
  @JsonProperty("instagramEscalation")
  public EscalationTarget getInstagramEscalation() {
    return instagramEscalation;
  }
  public void setInstagramEscalation(EscalationTarget instagramEscalation) {
    this.instagramEscalation = instagramEscalation;
  }


  /**
   * The target integration configuration used for a X (formerly Twitter) social media message if the match criteria returns true.
   **/
  public EscalationRuleRequest twitterEscalation(EscalationTarget twitterEscalation) {
    this.twitterEscalation = twitterEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for a X (formerly Twitter) social media message if the match criteria returns true.")
  @JsonProperty("twitterEscalation")
  public EscalationTarget getTwitterEscalation() {
    return twitterEscalation;
  }
  public void setTwitterEscalation(EscalationTarget twitterEscalation) {
    this.twitterEscalation = twitterEscalation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EscalationRuleRequest escalationRuleRequest = (EscalationRuleRequest) o;

    return Objects.equals(this.name, escalationRuleRequest.name) &&
            Objects.equals(this.matchCriteria, escalationRuleRequest.matchCriteria) &&
            Objects.equals(this.priority, escalationRuleRequest.priority) &&
            Objects.equals(this.divisionId, escalationRuleRequest.divisionId) &&
            Objects.equals(this.description, escalationRuleRequest.description) &&
            Objects.equals(this.status, escalationRuleRequest.status) &&
            Objects.equals(this.openEscalation, escalationRuleRequest.openEscalation) &&
            Objects.equals(this.facebookEscalation, escalationRuleRequest.facebookEscalation) &&
            Objects.equals(this.instagramEscalation, escalationRuleRequest.instagramEscalation) &&
            Objects.equals(this.twitterEscalation, escalationRuleRequest.twitterEscalation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, matchCriteria, priority, divisionId, description, status, openEscalation, facebookEscalation, instagramEscalation, twitterEscalation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationRuleRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    openEscalation: ").append(toIndentedString(openEscalation)).append("\n");
    sb.append("    facebookEscalation: ").append(toIndentedString(facebookEscalation)).append("\n");
    sb.append("    instagramEscalation: ").append(toIndentedString(instagramEscalation)).append("\n");
    sb.append("    twitterEscalation: ").append(toIndentedString(twitterEscalation)).append("\n");
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

