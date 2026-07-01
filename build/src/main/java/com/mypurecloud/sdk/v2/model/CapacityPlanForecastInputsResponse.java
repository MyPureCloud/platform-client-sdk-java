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
import com.mypurecloud.sdk.v2.model.BusinessUnitReference;
import com.mypurecloud.sdk.v2.model.CapacityPlanForecastInputsTemplate;
import com.mypurecloud.sdk.v2.model.CapacityPlanReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * CapacityPlanForecastInputsResponse
 */

public class CapacityPlanForecastInputsResponse  implements Serializable {
  
  private BusinessUnitReference businessUnit = null;
  private CapacityPlanReference capacityPlan = null;
  private String downloadUrl = null;
  private CapacityPlanForecastInputsTemplate downloadTemplate = null;

  public CapacityPlanForecastInputsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public CapacityPlanForecastInputsResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The business unit to which the capacity plan forecast inputs belongs
   **/
  public CapacityPlanForecastInputsResponse businessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The business unit to which the capacity plan forecast inputs belongs")
  @JsonProperty("businessUnit")
  public BusinessUnitReference getBusinessUnit() {
    return businessUnit;
  }
  public void setBusinessUnit(BusinessUnitReference businessUnit) {
    this.businessUnit = businessUnit;
  }


  /**
   * The capacity plan associated with these forecast inputs
   **/
  public CapacityPlanForecastInputsResponse capacityPlan(CapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The capacity plan associated with these forecast inputs")
  @JsonProperty("capacityPlan")
  public CapacityPlanReference getCapacityPlan() {
    return capacityPlan;
  }
  public void setCapacityPlan(CapacityPlanReference capacityPlan) {
    this.capacityPlan = capacityPlan;
  }


  /**
   * The URL to get the forecast inputs for the capacity plan
   **/
  public CapacityPlanForecastInputsResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The URL to get the forecast inputs for the capacity plan")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Forecast inputs always come through downloadUrl, the schema included here is just for documentation
   **/
  public CapacityPlanForecastInputsResponse downloadTemplate(CapacityPlanForecastInputsTemplate downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Forecast inputs always come through downloadUrl, the schema included here is just for documentation")
  @JsonProperty("downloadTemplate")
  public CapacityPlanForecastInputsTemplate getDownloadTemplate() {
    return downloadTemplate;
  }
  public void setDownloadTemplate(CapacityPlanForecastInputsTemplate downloadTemplate) {
    this.downloadTemplate = downloadTemplate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CapacityPlanForecastInputsResponse capacityPlanForecastInputsResponse = (CapacityPlanForecastInputsResponse) o;

    return Objects.equals(this.businessUnit, capacityPlanForecastInputsResponse.businessUnit) &&
            Objects.equals(this.capacityPlan, capacityPlanForecastInputsResponse.capacityPlan) &&
            Objects.equals(this.downloadUrl, capacityPlanForecastInputsResponse.downloadUrl) &&
            Objects.equals(this.downloadTemplate, capacityPlanForecastInputsResponse.downloadTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessUnit, capacityPlan, downloadUrl, downloadTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CapacityPlanForecastInputsResponse {\n");
    
    sb.append("    businessUnit: ").append(toIndentedString(businessUnit)).append("\n");
    sb.append("    capacityPlan: ").append(toIndentedString(capacityPlan)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    downloadTemplate: ").append(toIndentedString(downloadTemplate)).append("\n");
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

