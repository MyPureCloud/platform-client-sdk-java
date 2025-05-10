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
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ContactImportJobRequest
 */

public class ContactImportJobRequest  implements Serializable {
  
  private String settingsId = null;
  private WritableStarrableDivision division = null;

  public ContactImportJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Settings id
   **/
  public ContactImportJobRequest settingsId(String settingsId) {
    this.settingsId = settingsId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings id")
  @JsonProperty("settingsId")
  public String getSettingsId() {
    return settingsId;
  }
  public void setSettingsId(String settingsId) {
    this.settingsId = settingsId;
  }


  /**
   * The division to import into
   **/
  public ContactImportJobRequest division(WritableStarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to import into")
  @JsonProperty("division")
  public WritableStarrableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableStarrableDivision division) {
    this.division = division;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactImportJobRequest contactImportJobRequest = (ContactImportJobRequest) o;

    return Objects.equals(this.settingsId, contactImportJobRequest.settingsId) &&
            Objects.equals(this.division, contactImportJobRequest.division);
  }

  @Override
  public int hashCode() {
    return Objects.hash(settingsId, division);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactImportJobRequest {\n");
    
    sb.append("    settingsId: ").append(toIndentedString(settingsId)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
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

