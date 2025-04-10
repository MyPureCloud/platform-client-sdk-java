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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SelectedCustomCalculationColumns
 */

public class SelectedCustomCalculationColumns  implements Serializable {
  
  private AddressableEntityRef customCalculation = null;
  private Boolean restricted = null;
  private Boolean softDeleted = null;

  public SelectedCustomCalculationColumns() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Custom calculation added as a column
   **/
  public SelectedCustomCalculationColumns customCalculation(AddressableEntityRef customCalculation) {
    this.customCalculation = customCalculation;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Custom calculation added as a column")
  @JsonProperty("customCalculation")
  public AddressableEntityRef getCustomCalculation() {
    return customCalculation;
  }
  public void setCustomCalculation(AddressableEntityRef customCalculation) {
    this.customCalculation = customCalculation;
  }


  /**
   * Indicates if selected custom calculation column is deleted or access revoked for the user
   **/
  public SelectedCustomCalculationColumns restricted(Boolean restricted) {
    this.restricted = restricted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if selected custom calculation column is deleted or access revoked for the user")
  @JsonProperty("restricted")
  public Boolean getRestricted() {
    return restricted;
  }
  public void setRestricted(Boolean restricted) {
    this.restricted = restricted;
  }


  /**
   * Is selected custom calculation column soft deleted
   **/
  public SelectedCustomCalculationColumns softDeleted(Boolean softDeleted) {
    this.softDeleted = softDeleted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Is selected custom calculation column soft deleted")
  @JsonProperty("softDeleted")
  public Boolean getSoftDeleted() {
    return softDeleted;
  }
  public void setSoftDeleted(Boolean softDeleted) {
    this.softDeleted = softDeleted;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SelectedCustomCalculationColumns selectedCustomCalculationColumns = (SelectedCustomCalculationColumns) o;

    return Objects.equals(this.customCalculation, selectedCustomCalculationColumns.customCalculation) &&
            Objects.equals(this.restricted, selectedCustomCalculationColumns.restricted) &&
            Objects.equals(this.softDeleted, selectedCustomCalculationColumns.softDeleted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customCalculation, restricted, softDeleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SelectedCustomCalculationColumns {\n");
    
    sb.append("    customCalculation: ").append(toIndentedString(customCalculation)).append("\n");
    sb.append("    restricted: ").append(toIndentedString(restricted)).append("\n");
    sb.append("    softDeleted: ").append(toIndentedString(softDeleted)).append("\n");
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

