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
import com.mypurecloud.sdk.v2.model.UserParam;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * RestErrorDetail
 */

public class RestErrorDetail  implements Serializable {
  
  private String error = null;
  private String details = null;
  private List<UserParam> userParams = null;

  public RestErrorDetail() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      userParams = new ArrayList<UserParam>();
    }
  }

  
  @ApiModelProperty(example = "null", required = true, value = "name of the error")
  @JsonProperty("error")
  public String getError() {
    return error;
  }


  @ApiModelProperty(example = "null", value = "additional information regarding the error")
  @JsonProperty("details")
  public String getDetails() {
    return details;
  }


  /**
   * parameters to be inserted into details.
   **/
  public RestErrorDetail userParams(List<UserParam> userParams) {
    this.userParams = userParams;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "parameters to be inserted into details.")
  @JsonProperty("userParams")
  public List<UserParam> getUserParams() {
    return userParams;
  }
  public void setUserParams(List<UserParam> userParams) {
    this.userParams = userParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RestErrorDetail restErrorDetail = (RestErrorDetail) o;

    return Objects.equals(this.error, restErrorDetail.error) &&
            Objects.equals(this.details, restErrorDetail.details) &&
            Objects.equals(this.userParams, restErrorDetail.userParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, details, userParams);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RestErrorDetail {\n");
    
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    userParams: ").append(toIndentedString(userParams)).append("\n");
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

