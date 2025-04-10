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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactListFilterBulkRetrieveBody
 */

public class ContactListFilterBulkRetrieveBody  implements Serializable {
  
  private List<String> ids = null;

  public ContactListFilterBulkRetrieveBody() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      ids = new ArrayList<String>();
    }
  }

  
  /**
   * The IDs of the Contact List Filters to retrieve.
   **/
  public ContactListFilterBulkRetrieveBody ids(List<String> ids) {
    this.ids = ids;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The IDs of the Contact List Filters to retrieve.")
  @JsonProperty("ids")
  public List<String> getIds() {
    return ids;
  }
  public void setIds(List<String> ids) {
    this.ids = ids;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactListFilterBulkRetrieveBody contactListFilterBulkRetrieveBody = (ContactListFilterBulkRetrieveBody) o;

    return Objects.equals(this.ids, contactListFilterBulkRetrieveBody.ids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ids);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactListFilterBulkRetrieveBody {\n");
    
    sb.append("    ids: ").append(toIndentedString(ids)).append("\n");
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

