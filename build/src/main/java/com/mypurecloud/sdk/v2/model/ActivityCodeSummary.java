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
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ActivityCodeSummary
 */

public class ActivityCodeSummary  implements Serializable {
  
  private String id = null;
  private String name = null;
  private List<SecondaryPresence> secondaryPresences = null;
  private String selfUri = null;

  public ActivityCodeSummary() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      secondaryPresences = new ArrayList<SecondaryPresence>();
    }
  }

  
  /**
   * The globally unique identifier for the object.
   **/
  public ActivityCodeSummary id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public ActivityCodeSummary name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The secondary presences of this activity code.
   **/
  public ActivityCodeSummary secondaryPresences(List<SecondaryPresence> secondaryPresences) {
    this.secondaryPresences = secondaryPresences;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The secondary presences of this activity code.")
  @JsonProperty("secondaryPresences")
  public List<SecondaryPresence> getSecondaryPresences() {
    return secondaryPresences;
  }
  public void setSecondaryPresences(List<SecondaryPresence> secondaryPresences) {
    this.secondaryPresences = secondaryPresences;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActivityCodeSummary activityCodeSummary = (ActivityCodeSummary) o;

    return Objects.equals(this.id, activityCodeSummary.id) &&
            Objects.equals(this.name, activityCodeSummary.name) &&
            Objects.equals(this.secondaryPresences, activityCodeSummary.secondaryPresences) &&
            Objects.equals(this.selfUri, activityCodeSummary.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, secondaryPresences, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActivityCodeSummary {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryPresences: ").append(toIndentedString(secondaryPresences)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

