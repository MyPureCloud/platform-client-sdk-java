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
import com.mypurecloud.sdk.v2.model.ExternalContact;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ReverseWhitepagesLookupResult
 */

public class ReverseWhitepagesLookupResult  implements Serializable {
  
  private List<ExternalContact> contacts = null;

  public ReverseWhitepagesLookupResult() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      contacts = new ArrayList<ExternalContact>();
    }
  }

  
  /**
   **/
  public ReverseWhitepagesLookupResult contacts(List<ExternalContact> contacts) {
    this.contacts = contacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("contacts")
  public List<ExternalContact> getContacts() {
    return contacts;
  }
  public void setContacts(List<ExternalContact> contacts) {
    this.contacts = contacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReverseWhitepagesLookupResult reverseWhitepagesLookupResult = (ReverseWhitepagesLookupResult) o;

    return Objects.equals(this.contacts, reverseWhitepagesLookupResult.contacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReverseWhitepagesLookupResult {\n");
    
    sb.append("    contacts: ").append(toIndentedString(contacts)).append("\n");
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

