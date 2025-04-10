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
import com.mypurecloud.sdk.v2.model.CampaignRuleCondition;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CampaignRuleConditionGroup
 */

public class CampaignRuleConditionGroup  implements Serializable {
  
  private Boolean matchAnyConditions = null;
  private List<CampaignRuleCondition> conditions = null;

  public CampaignRuleConditionGroup() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      conditions = new ArrayList<CampaignRuleCondition>();
    }
  }

  
  /**
   * Whether or not this condition group should be evaluated as true if any of sub conditions is matched
   **/
  public CampaignRuleConditionGroup matchAnyConditions(Boolean matchAnyConditions) {
    this.matchAnyConditions = matchAnyConditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether or not this condition group should be evaluated as true if any of sub conditions is matched")
  @JsonProperty("matchAnyConditions")
  public Boolean getMatchAnyConditions() {
    return matchAnyConditions;
  }
  public void setMatchAnyConditions(Boolean matchAnyConditions) {
    this.matchAnyConditions = matchAnyConditions;
  }


  /**
   * The parameters for the CampaignRuleCondition.
   **/
  public CampaignRuleConditionGroup conditions(List<CampaignRuleCondition> conditions) {
    this.conditions = conditions;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The parameters for the CampaignRuleCondition.")
  @JsonProperty("conditions")
  public List<CampaignRuleCondition> getConditions() {
    return conditions;
  }
  public void setConditions(List<CampaignRuleCondition> conditions) {
    this.conditions = conditions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CampaignRuleConditionGroup campaignRuleConditionGroup = (CampaignRuleConditionGroup) o;

    return Objects.equals(this.matchAnyConditions, campaignRuleConditionGroup.matchAnyConditions) &&
            Objects.equals(this.conditions, campaignRuleConditionGroup.conditions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchAnyConditions, conditions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CampaignRuleConditionGroup {\n");
    
    sb.append("    matchAnyConditions: ").append(toIndentedString(matchAnyConditions)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
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

