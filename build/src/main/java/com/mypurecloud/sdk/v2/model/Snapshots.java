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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * Snapshots
 */

public class Snapshots  implements Serializable {
  
  private String id = null;
  private Integer daysInPast = null;

  
  /**
   * The snapshot Id
   **/
  public Snapshots id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The snapshot Id")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The number of days from today denoting when the snapshot was captured
   **/
  public Snapshots daysInPast(Integer daysInPast) {
    this.daysInPast = daysInPast;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of days from today denoting when the snapshot was captured")
  @JsonProperty("daysInPast")
  public Integer getDaysInPast() {
    return daysInPast;
  }
  public void setDaysInPast(Integer daysInPast) {
    this.daysInPast = daysInPast;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Snapshots snapshots = (Snapshots) o;

    return Objects.equals(this.id, snapshots.id) &&
            Objects.equals(this.daysInPast, snapshots.daysInPast);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, daysInPast);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Snapshots {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    daysInPast: ").append(toIndentedString(daysInPast)).append("\n");
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

