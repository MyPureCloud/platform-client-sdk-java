package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.TimeOffRequestLookup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * TimeOffRequestLookupList
 */

public class TimeOffRequestLookupList  implements Serializable {
  
  private List<TimeOffRequestLookup> entities = new ArrayList<TimeOffRequestLookup>();

  
  /**
   * List of time off request look up objects
   **/
  public TimeOffRequestLookupList entities(List<TimeOffRequestLookup> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "List of time off request look up objects")
  @JsonProperty("entities")
  public List<TimeOffRequestLookup> getEntities() {
    return entities;
  }
  public void setEntities(List<TimeOffRequestLookup> entities) {
    this.entities = entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TimeOffRequestLookupList timeOffRequestLookupList = (TimeOffRequestLookupList) o;
    return Objects.equals(this.entities, timeOffRequestLookupList.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TimeOffRequestLookupList {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

