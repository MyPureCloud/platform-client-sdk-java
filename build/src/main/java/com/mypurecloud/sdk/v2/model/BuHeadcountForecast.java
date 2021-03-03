package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.BuPlanningGroupHeadcountForecast;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuHeadcountForecast
 */

public class BuHeadcountForecast  implements Serializable {
  
  private List<BuPlanningGroupHeadcountForecast> entities = new ArrayList<BuPlanningGroupHeadcountForecast>();
  private Date referenceStartDate = null;

  
  /**
   **/
  public BuHeadcountForecast entities(List<BuPlanningGroupHeadcountForecast> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<BuPlanningGroupHeadcountForecast> getEntities() {
    return entities;
  }
  public void setEntities(List<BuPlanningGroupHeadcountForecast> entities) {
    this.entities = entities;
  }

  
  /**
   * Reference start date for the interval values in each forecast entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuHeadcountForecast referenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Reference start date for the interval values in each forecast entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("referenceStartDate")
  public Date getReferenceStartDate() {
    return referenceStartDate;
  }
  public void setReferenceStartDate(Date referenceStartDate) {
    this.referenceStartDate = referenceStartDate;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BuHeadcountForecast buHeadcountForecast = (BuHeadcountForecast) o;
    return Objects.equals(this.entities, buHeadcountForecast.entities) &&
        Objects.equals(this.referenceStartDate, buHeadcountForecast.referenceStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, referenceStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuHeadcountForecast {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    referenceStartDate: ").append(toIndentedString(referenceStartDate)).append("\n");
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

