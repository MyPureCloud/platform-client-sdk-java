package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.LicenseUpdateStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * LicenseUpdateResponse
 */

public class LicenseUpdateResponse  implements Serializable {
  
  private List<LicenseUpdateStatus> statuses = new ArrayList<LicenseUpdateStatus>();

  
  /**
   **/
  public LicenseUpdateResponse statuses(List<LicenseUpdateStatus> statuses) {
    this.statuses = statuses;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("statuses")
  public List<LicenseUpdateStatus> getStatuses() {
    return statuses;
  }
  public void setStatuses(List<LicenseUpdateStatus> statuses) {
    this.statuses = statuses;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LicenseUpdateResponse licenseUpdateResponse = (LicenseUpdateResponse) o;
    return Objects.equals(this.statuses, licenseUpdateResponse.statuses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(statuses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LicenseUpdateResponse {\n");
    
    sb.append("    statuses: ").append(toIndentedString(statuses)).append("\n");
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

