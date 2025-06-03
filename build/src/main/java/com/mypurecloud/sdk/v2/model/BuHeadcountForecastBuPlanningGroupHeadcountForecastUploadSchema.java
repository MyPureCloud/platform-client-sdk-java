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
import com.mypurecloud.sdk.v2.model.BuPlanningGroupHeadcountForecastUploadSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema
 */

public class BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema  implements Serializable {
  
  private List<BuPlanningGroupHeadcountForecastUploadSchema> entities = null;
  private Date referenceStartDate = null;

  public BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<BuPlanningGroupHeadcountForecastUploadSchema>();
    }
  }

  
  /**
   **/
  public BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema entities(List<BuPlanningGroupHeadcountForecastUploadSchema> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<BuPlanningGroupHeadcountForecastUploadSchema> getEntities() {
    return entities;
  }
  public void setEntities(List<BuPlanningGroupHeadcountForecastUploadSchema> entities) {
    this.entities = entities;
  }


  /**
   * Reference start date for the interval values in each forecast entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema referenceStartDate(Date referenceStartDate) {
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
    BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema buHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema = (BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema) o;

    return Objects.equals(this.entities, buHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema.entities) &&
            Objects.equals(this.referenceStartDate, buHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema.referenceStartDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, referenceStartDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuHeadcountForecastBuPlanningGroupHeadcountForecastUploadSchema {\n");
    
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

