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
import com.mypurecloud.sdk.v2.model.WfmActivityPlanRunJobCompleteTopicActivityPlanOccurrenceReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * WfmActivityPlanRunJobCompleteTopicActivityPlanReference
 */

public class WfmActivityPlanRunJobCompleteTopicActivityPlanReference  implements Serializable {
  
  private String id = null;
  private List<WfmActivityPlanRunJobCompleteTopicActivityPlanOccurrenceReference> occurrences = null;

  public WfmActivityPlanRunJobCompleteTopicActivityPlanReference() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      occurrences = new ArrayList<WfmActivityPlanRunJobCompleteTopicActivityPlanOccurrenceReference>();
    }
  }

  
  /**
   **/
  public WfmActivityPlanRunJobCompleteTopicActivityPlanReference id(String id) {
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
  public WfmActivityPlanRunJobCompleteTopicActivityPlanReference occurrences(List<WfmActivityPlanRunJobCompleteTopicActivityPlanOccurrenceReference> occurrences) {
    this.occurrences = occurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("occurrences")
  public List<WfmActivityPlanRunJobCompleteTopicActivityPlanOccurrenceReference> getOccurrences() {
    return occurrences;
  }
  public void setOccurrences(List<WfmActivityPlanRunJobCompleteTopicActivityPlanOccurrenceReference> occurrences) {
    this.occurrences = occurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WfmActivityPlanRunJobCompleteTopicActivityPlanReference wfmActivityPlanRunJobCompleteTopicActivityPlanReference = (WfmActivityPlanRunJobCompleteTopicActivityPlanReference) o;

    return Objects.equals(this.id, wfmActivityPlanRunJobCompleteTopicActivityPlanReference.id) &&
            Objects.equals(this.occurrences, wfmActivityPlanRunJobCompleteTopicActivityPlanReference.occurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, occurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WfmActivityPlanRunJobCompleteTopicActivityPlanReference {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    occurrences: ").append(toIndentedString(occurrences)).append("\n");
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

