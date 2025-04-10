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

import java.io.Serializable;
/**
 * ContactEnrichOptions
 */

public class ContactEnrichOptions  implements Serializable {
  
  private Boolean promote = null;

  public ContactEnrichOptions() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * If true, any matched contact will have its type updated to Curated. If false, any matched contact will keep its original type in the operation.
   **/
  public ContactEnrichOptions promote(Boolean promote) {
    this.promote = promote;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "If true, any matched contact will have its type updated to Curated. If false, any matched contact will keep its original type in the operation.")
  @JsonProperty("promote")
  public Boolean getPromote() {
    return promote;
  }
  public void setPromote(Boolean promote) {
    this.promote = promote;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactEnrichOptions contactEnrichOptions = (ContactEnrichOptions) o;

    return Objects.equals(this.promote, contactEnrichOptions.promote);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promote);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactEnrichOptions {\n");
    
    sb.append("    promote: ").append(toIndentedString(promote)).append("\n");
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

