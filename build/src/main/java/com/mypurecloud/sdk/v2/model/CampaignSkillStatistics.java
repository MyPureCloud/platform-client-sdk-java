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

import java.io.Serializable;
/**
 * CampaignSkillStatistics
 */

public class CampaignSkillStatistics  implements Serializable {
  
  private Integer skillCombinations = null;
  private Integer eligibleSkilledAgents = null;

  public CampaignSkillStatistics() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Number of available skill combinations for the campaign")
  @JsonProperty("skillCombinations")
  public Integer getSkillCombinations() {
    return skillCombinations;
  }


  @ApiModelProperty(example = "null", value = "Number of eligible agents with skills for campaign")
  @JsonProperty("eligibleSkilledAgents")
  public Integer getEligibleSkilledAgents() {
    return eligibleSkilledAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignSkillStatistics campaignSkillStatistics = (CampaignSkillStatistics) o;

    return Objects.equals(this.skillCombinations, campaignSkillStatistics.skillCombinations) &&
            Objects.equals(this.eligibleSkilledAgents, campaignSkillStatistics.eligibleSkilledAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(skillCombinations, eligibleSkilledAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignSkillStatistics {\n");
    
    sb.append("    skillCombinations: ").append(toIndentedString(skillCombinations)).append("\n");
    sb.append("    eligibleSkilledAgents: ").append(toIndentedString(eligibleSkilledAgents)).append("\n");
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

