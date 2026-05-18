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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification
 */

public class DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification  implements Serializable {
  
  private List<String> skillCombination = null;
  private Long totalCount = null;
  private Long processedCount = null;
  private BigDecimal completionPercentage = null;

  public DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      skillCombination = new ArrayList<String>();
    }
  }

  public DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      skillCombination = new ArrayList<String>();
    }
  }

  
  /**
   * Array of skill identifiers that make up this skill combination
   **/
  public DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification skillCombination(List<String> skillCombination) {
    this.skillCombination = skillCombination;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Array of skill identifiers that make up this skill combination")
  @JsonProperty("skillCombination")
  public List<String> getSkillCombination() {
    return skillCombination;
  }
  public void setSkillCombination(List<String> skillCombination) {
    this.skillCombination = skillCombination;
  }


  /**
   * The total number of contacts for this skill combination
   **/
  public DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification totalCount(Long totalCount) {
    this.totalCount = totalCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The total number of contacts for this skill combination")
  @JsonProperty("totalCount")
  public Long getTotalCount() {
    return totalCount;
  }
  public void setTotalCount(Long totalCount) {
    this.totalCount = totalCount;
  }


  /**
   * The number of processed contacts for this skill combination
   **/
  public DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification processedCount(Long processedCount) {
    this.processedCount = processedCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of processed contacts for this skill combination")
  @JsonProperty("processedCount")
  public Long getProcessedCount() {
    return processedCount;
  }
  public void setProcessedCount(Long processedCount) {
    this.processedCount = processedCount;
  }


  /**
   * The completion percentage for this skill combination
   **/
  public DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification completionPercentage(BigDecimal completionPercentage) {
    this.completionPercentage = completionPercentage;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion percentage for this skill combination")
  @JsonProperty("completionPercentage")
  public BigDecimal getCompletionPercentage() {
    return completionPercentage;
  }
  public void setCompletionPercentage(BigDecimal completionPercentage) {
    this.completionPercentage = completionPercentage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification dialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification = (DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification) o;

    return Objects.equals(this.skillCombination, dialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification.skillCombination) &&
            Objects.equals(this.totalCount, dialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification.totalCount) &&
            Objects.equals(this.processedCount, dialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification.processedCount) &&
            Objects.equals(this.completionPercentage, dialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification.completionPercentage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillCombination, totalCount, processedCount, completionPercentage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialerCampaignSkillCombinationStatsEventSkillCombinationDetailNotification {\n");
    
    sb.append("    skillCombination: ").append(toIndentedString(skillCombination)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    processedCount: ").append(toIndentedString(processedCount)).append("\n");
    sb.append("    completionPercentage: ").append(toIndentedString(completionPercentage)).append("\n");
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

