package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MergeOperation
 */

public class MergeOperation  implements Serializable {
  
  private AddressableEntityRef sourceContact = null;
  private AddressableEntityRef targetContact = null;
  private AddressableEntityRef resultingContact = null;

  
  @ApiModelProperty(example = "null", value = "The source contact for the merge operation")
  @JsonProperty("sourceContact")
  public AddressableEntityRef getSourceContact() {
    return sourceContact;
  }

  
  @ApiModelProperty(example = "null", value = "The target contact for the merge operation")
  @JsonProperty("targetContact")
  public AddressableEntityRef getTargetContact() {
    return targetContact;
  }

  
  @ApiModelProperty(example = "null", value = "The contact created as a result of the merge operation")
  @JsonProperty("resultingContact")
  public AddressableEntityRef getResultingContact() {
    return resultingContact;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MergeOperation mergeOperation = (MergeOperation) o;
    return Objects.equals(this.sourceContact, mergeOperation.sourceContact) &&
        Objects.equals(this.targetContact, mergeOperation.targetContact) &&
        Objects.equals(this.resultingContact, mergeOperation.resultingContact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceContact, targetContact, resultingContact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MergeOperation {\n");
    
    sb.append("    sourceContact: ").append(toIndentedString(sourceContact)).append("\n");
    sb.append("    targetContact: ").append(toIndentedString(targetContact)).append("\n");
    sb.append("    resultingContact: ").append(toIndentedString(resultingContact)).append("\n");
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

