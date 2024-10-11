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
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * ExternalContactsSettings
 */

public class ExternalContactsSettings  implements Serializable {
  
  private Boolean manuallyAssignDivisionsToInteractions = null;
  private Boolean manuallyAssignDivisionsToContacts = null;

  
  /**
   **/
  public ExternalContactsSettings manuallyAssignDivisionsToInteractions(Boolean manuallyAssignDivisionsToInteractions) {
    this.manuallyAssignDivisionsToInteractions = manuallyAssignDivisionsToInteractions;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manuallyAssignDivisionsToInteractions")
  public Boolean getManuallyAssignDivisionsToInteractions() {
    return manuallyAssignDivisionsToInteractions;
  }
  public void setManuallyAssignDivisionsToInteractions(Boolean manuallyAssignDivisionsToInteractions) {
    this.manuallyAssignDivisionsToInteractions = manuallyAssignDivisionsToInteractions;
  }


  /**
   **/
  public ExternalContactsSettings manuallyAssignDivisionsToContacts(Boolean manuallyAssignDivisionsToContacts) {
    this.manuallyAssignDivisionsToContacts = manuallyAssignDivisionsToContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("manuallyAssignDivisionsToContacts")
  public Boolean getManuallyAssignDivisionsToContacts() {
    return manuallyAssignDivisionsToContacts;
  }
  public void setManuallyAssignDivisionsToContacts(Boolean manuallyAssignDivisionsToContacts) {
    this.manuallyAssignDivisionsToContacts = manuallyAssignDivisionsToContacts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalContactsSettings externalContactsSettings = (ExternalContactsSettings) o;

    return Objects.equals(this.manuallyAssignDivisionsToInteractions, externalContactsSettings.manuallyAssignDivisionsToInteractions) &&
            Objects.equals(this.manuallyAssignDivisionsToContacts, externalContactsSettings.manuallyAssignDivisionsToContacts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(manuallyAssignDivisionsToInteractions, manuallyAssignDivisionsToContacts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalContactsSettings {\n");
    
    sb.append("    manuallyAssignDivisionsToInteractions: ").append(toIndentedString(manuallyAssignDivisionsToInteractions)).append("\n");
    sb.append("    manuallyAssignDivisionsToContacts: ").append(toIndentedString(manuallyAssignDivisionsToContacts)).append("\n");
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

