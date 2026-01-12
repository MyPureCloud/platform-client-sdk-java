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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * CustomerIntentAssignmentResponse
 */

public class CustomerIntentAssignmentResponse  implements Serializable {
  
  private DomainEntityRef customerIntent = null;
  private AddressableEntityRef category = null;
  private Date dateMostRecentlyAssigned = null;

  public CustomerIntentAssignmentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "Customer intent assigned")
  @JsonProperty("customerIntent")
  public DomainEntityRef getCustomerIntent() {
    return customerIntent;
  }


  @ApiModelProperty(example = "null", value = "Category of the customer intent")
  @JsonProperty("category")
  public AddressableEntityRef getCategory() {
    return category;
  }


  @ApiModelProperty(example = "null", value = "Date of the most recent assignment. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateMostRecentlyAssigned")
  public Date getDateMostRecentlyAssigned() {
    return dateMostRecentlyAssigned;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerIntentAssignmentResponse customerIntentAssignmentResponse = (CustomerIntentAssignmentResponse) o;

    return Objects.equals(this.customerIntent, customerIntentAssignmentResponse.customerIntent) &&
            Objects.equals(this.category, customerIntentAssignmentResponse.category) &&
            Objects.equals(this.dateMostRecentlyAssigned, customerIntentAssignmentResponse.dateMostRecentlyAssigned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerIntent, category, dateMostRecentlyAssigned);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerIntentAssignmentResponse {\n");
    
    sb.append("    customerIntent: ").append(toIndentedString(customerIntent)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dateMostRecentlyAssigned: ").append(toIndentedString(dateMostRecentlyAssigned)).append("\n");
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

