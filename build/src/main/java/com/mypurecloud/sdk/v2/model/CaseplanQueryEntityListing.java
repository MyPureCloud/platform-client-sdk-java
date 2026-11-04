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
import com.mypurecloud.sdk.v2.model.Caseplan;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * CaseplanQueryEntityListing
 */

public class CaseplanQueryEntityListing  implements Serializable {
  
  private List<Caseplan> entities = null;
  private String after = null;

  public CaseplanQueryEntityListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<Caseplan>();
    }
  }

  public CaseplanQueryEntityListing(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      entities = new ArrayList<Caseplan>();
    }
  }

  
  /**
   **/
  public CaseplanQueryEntityListing entities(List<Caseplan> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<Caseplan> getEntities() {
    return entities;
  }
  public void setEntities(List<Caseplan> entities) {
    this.entities = entities;
  }


  /**
   **/
  public CaseplanQueryEntityListing after(String after) {
    this.after = after;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("after")
  public String getAfter() {
    return after;
  }
  public void setAfter(String after) {
    this.after = after;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseplanQueryEntityListing caseplanQueryEntityListing = (CaseplanQueryEntityListing) o;

    return Objects.equals(this.entities, caseplanQueryEntityListing.entities) &&
            Objects.equals(this.after, caseplanQueryEntityListing.after);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, after);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseplanQueryEntityListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
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

