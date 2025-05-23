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
import com.mypurecloud.sdk.v2.model.WfmUserScheduleAdherenceUpdatedMuTopicSecondaryPresenceReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference
 */

public class WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference  implements Serializable {
  
  private String id = null;
  private List<WfmUserScheduleAdherenceUpdatedMuTopicSecondaryPresenceReference> secondaryPresences = null;

  public WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      secondaryPresences = new ArrayList<WfmUserScheduleAdherenceUpdatedMuTopicSecondaryPresenceReference>();
    }
  }

  
  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference secondaryPresences(List<WfmUserScheduleAdherenceUpdatedMuTopicSecondaryPresenceReference> secondaryPresences) {
    this.secondaryPresences = secondaryPresences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("secondaryPresences")
  public List<WfmUserScheduleAdherenceUpdatedMuTopicSecondaryPresenceReference> getSecondaryPresences() {
    return secondaryPresences;
  }
  public void setSecondaryPresences(List<WfmUserScheduleAdherenceUpdatedMuTopicSecondaryPresenceReference> secondaryPresences) {
    this.secondaryPresences = secondaryPresences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference wfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference = (WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference) o;

    return Objects.equals(this.id, wfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference.id) &&
            Objects.equals(this.secondaryPresences, wfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference.secondaryPresences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, secondaryPresences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmUserScheduleAdherenceUpdatedMuTopicActivityCodeReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    secondaryPresences: ").append(toIndentedString(secondaryPresences)).append("\n");
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

