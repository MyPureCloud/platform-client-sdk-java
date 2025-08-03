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
import com.mypurecloud.sdk.v2.model.LongTermRequirementsServiceGoal;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LongTermRequirementsServiceGoalDetail
 */

public class LongTermRequirementsServiceGoalDetail  implements Serializable {
  
  private String id = null;
  private LongTermRequirementsServiceGoal serviceGoals = null;

  public LongTermRequirementsServiceGoalDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Service goal template ID
   **/
  public LongTermRequirementsServiceGoalDetail id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Service goal template ID")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The service goals used to generate the requirements 
   **/
  public LongTermRequirementsServiceGoalDetail serviceGoals(LongTermRequirementsServiceGoal serviceGoals) {
    this.serviceGoals = serviceGoals;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The service goals used to generate the requirements ")
  @JsonProperty("serviceGoals")
  public LongTermRequirementsServiceGoal getServiceGoals() {
    return serviceGoals;
  }
  public void setServiceGoals(LongTermRequirementsServiceGoal serviceGoals) {
    this.serviceGoals = serviceGoals;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LongTermRequirementsServiceGoalDetail longTermRequirementsServiceGoalDetail = (LongTermRequirementsServiceGoalDetail) o;

    return Objects.equals(this.id, longTermRequirementsServiceGoalDetail.id) &&
            Objects.equals(this.serviceGoals, longTermRequirementsServiceGoalDetail.serviceGoals);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, serviceGoals);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LongTermRequirementsServiceGoalDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serviceGoals: ").append(toIndentedString(serviceGoals)).append("\n");
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

