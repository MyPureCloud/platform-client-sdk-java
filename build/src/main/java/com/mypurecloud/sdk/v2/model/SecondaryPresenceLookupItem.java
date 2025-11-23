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
import com.mypurecloud.sdk.v2.model.SecondaryPresence;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * SecondaryPresenceLookupItem
 */

public class SecondaryPresenceLookupItem  implements Serializable {
  
  private String lookupId = null;
  private SecondaryPresence secondaryPresence = null;

  public SecondaryPresenceLookupItem() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The lookupId of secondary presence id
   **/
  public SecondaryPresenceLookupItem lookupId(String lookupId) {
    this.lookupId = lookupId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The lookupId of secondary presence id")
  @JsonProperty("lookupId")
  public String getLookupId() {
    return lookupId;
  }
  public void setLookupId(String lookupId) {
    this.lookupId = lookupId;
  }


  /**
   * The secondary presence Id
   **/
  public SecondaryPresenceLookupItem secondaryPresence(SecondaryPresence secondaryPresence) {
    this.secondaryPresence = secondaryPresence;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The secondary presence Id")
  @JsonProperty("secondaryPresence")
  public SecondaryPresence getSecondaryPresence() {
    return secondaryPresence;
  }
  public void setSecondaryPresence(SecondaryPresence secondaryPresence) {
    this.secondaryPresence = secondaryPresence;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecondaryPresenceLookupItem secondaryPresenceLookupItem = (SecondaryPresenceLookupItem) o;

    return Objects.equals(this.lookupId, secondaryPresenceLookupItem.lookupId) &&
            Objects.equals(this.secondaryPresence, secondaryPresenceLookupItem.secondaryPresence);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lookupId, secondaryPresence);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecondaryPresenceLookupItem {\n");
    
    sb.append("    lookupId: ").append(toIndentedString(lookupId)).append("\n");
    sb.append("    secondaryPresence: ").append(toIndentedString(secondaryPresence)).append("\n");
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

