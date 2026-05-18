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
import com.mypurecloud.sdk.v2.model.WfmActivityPlanJobCompleteTopicActivityPlanSessionReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference
 */

public class WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference  implements Serializable {
  
  private String id = null;
  private List<WfmActivityPlanJobCompleteTopicActivityPlanSessionReference> sessions = null;

  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      sessions = new ArrayList<WfmActivityPlanJobCompleteTopicActivityPlanSessionReference>();
    }
  }

  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      sessions = new ArrayList<WfmActivityPlanJobCompleteTopicActivityPlanSessionReference>();
    }
  }

  
  /**
   **/
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference id(String id) {
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
  public WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference sessions(List<WfmActivityPlanJobCompleteTopicActivityPlanSessionReference> sessions) {
    this.sessions = sessions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("sessions")
  public List<WfmActivityPlanJobCompleteTopicActivityPlanSessionReference> getSessions() {
    return sessions;
  }
  public void setSessions(List<WfmActivityPlanJobCompleteTopicActivityPlanSessionReference> sessions) {
    this.sessions = sessions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference = (WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference) o;

    return Objects.equals(this.id, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference.id) &&
            Objects.equals(this.sessions, wfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference.sessions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmActivityPlanJobCompleteTopicActivityPlanOccurrenceReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
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

