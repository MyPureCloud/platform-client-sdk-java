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
import com.mypurecloud.sdk.v2.model.EscalationTarget;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EscalationRuleResponse
 */

public class EscalationRuleResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String matchCriteria = null;
  private Integer priority = null;
  private String divisionId = null;
  private String description = null;
  private Date dateCreated = null;
  private Date dateModified = null;

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
  private String selfUri = null;

  public EscalationRuleResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * ID of the escalation rule.
   **/
  public EscalationRuleResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "ID of the escalation rule.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The name of the escalation rule.
   **/
  public EscalationRuleResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the escalation rule.")
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
  public EscalationRuleResponse matchCriteria(String matchCriteria) {
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
   * The priority of the escalation rule.
   **/
  public EscalationRuleResponse priority(Integer priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the escalation rule.")
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
  public EscalationRuleResponse divisionId(String divisionId) {
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
  public EscalationRuleResponse description(String description) {
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
   * Timestamp indicating when the escalation rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EscalationRuleResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the escalation rule was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * Timestamp indicating when the escalation rule was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public EscalationRuleResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Timestamp indicating when the escalation rule was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The status of the escalation rule.
   **/
  public EscalationRuleResponse status(StatusEnum status) {
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
   * The target integration configuration used for an open message escalation.
   **/
  public EscalationRuleResponse openEscalation(EscalationTarget openEscalation) {
    this.openEscalation = openEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for an open message escalation.")
  @JsonProperty("openEscalation")
  public EscalationTarget getOpenEscalation() {
    return openEscalation;
  }
  public void setOpenEscalation(EscalationTarget openEscalation) {
    this.openEscalation = openEscalation;
  }


  /**
   * The target integration configuration used for a Facebook message escalation.
   **/
  public EscalationRuleResponse facebookEscalation(EscalationTarget facebookEscalation) {
    this.facebookEscalation = facebookEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for a Facebook message escalation.")
  @JsonProperty("facebookEscalation")
  public EscalationTarget getFacebookEscalation() {
    return facebookEscalation;
  }
  public void setFacebookEscalation(EscalationTarget facebookEscalation) {
    this.facebookEscalation = facebookEscalation;
  }


  /**
   * The target integration configuration used for an Instagram message escalation.
   **/
  public EscalationRuleResponse instagramEscalation(EscalationTarget instagramEscalation) {
    this.instagramEscalation = instagramEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for an Instagram message escalation.")
  @JsonProperty("instagramEscalation")
  public EscalationTarget getInstagramEscalation() {
    return instagramEscalation;
  }
  public void setInstagramEscalation(EscalationTarget instagramEscalation) {
    this.instagramEscalation = instagramEscalation;
  }


  /**
   * The target integration configuration used for a X (formerly Twitter) message escalation.
   **/
  public EscalationRuleResponse twitterEscalation(EscalationTarget twitterEscalation) {
    this.twitterEscalation = twitterEscalation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The target integration configuration used for a X (formerly Twitter) message escalation.")
  @JsonProperty("twitterEscalation")
  public EscalationTarget getTwitterEscalation() {
    return twitterEscalation;
  }
  public void setTwitterEscalation(EscalationTarget twitterEscalation) {
    this.twitterEscalation = twitterEscalation;
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
    EscalationRuleResponse escalationRuleResponse = (EscalationRuleResponse) o;

    return Objects.equals(this.id, escalationRuleResponse.id) &&
            Objects.equals(this.name, escalationRuleResponse.name) &&
            Objects.equals(this.matchCriteria, escalationRuleResponse.matchCriteria) &&
            Objects.equals(this.priority, escalationRuleResponse.priority) &&
            Objects.equals(this.divisionId, escalationRuleResponse.divisionId) &&
            Objects.equals(this.description, escalationRuleResponse.description) &&
            Objects.equals(this.dateCreated, escalationRuleResponse.dateCreated) &&
            Objects.equals(this.dateModified, escalationRuleResponse.dateModified) &&
            Objects.equals(this.status, escalationRuleResponse.status) &&
            Objects.equals(this.openEscalation, escalationRuleResponse.openEscalation) &&
            Objects.equals(this.facebookEscalation, escalationRuleResponse.facebookEscalation) &&
            Objects.equals(this.instagramEscalation, escalationRuleResponse.instagramEscalation) &&
            Objects.equals(this.twitterEscalation, escalationRuleResponse.twitterEscalation) &&
            Objects.equals(this.selfUri, escalationRuleResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, matchCriteria, priority, divisionId, description, dateCreated, dateModified, status, openEscalation, facebookEscalation, instagramEscalation, twitterEscalation, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EscalationRuleResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matchCriteria: ").append(toIndentedString(matchCriteria)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    divisionId: ").append(toIndentedString(divisionId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    openEscalation: ").append(toIndentedString(openEscalation)).append("\n");
    sb.append("    facebookEscalation: ").append(toIndentedString(facebookEscalation)).append("\n");
    sb.append("    instagramEscalation: ").append(toIndentedString(instagramEscalation)).append("\n");
    sb.append("    twitterEscalation: ").append(toIndentedString(twitterEscalation)).append("\n");
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

