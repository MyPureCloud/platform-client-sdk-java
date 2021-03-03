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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * The routing language assigned to a user.
 */
@ApiModel(description = "The routing language assigned to a user.")

public class ScimUserRoutingLanguage  implements Serializable {
  
  private String name = null;
  private Double proficiency = null;

  
  /**
   * The case-sensitive name of a routing language configured in Genesys Cloud.
   **/
  public ScimUserRoutingLanguage name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The case-sensitive name of a routing language configured in Genesys Cloud.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * A rating from 0.0 to 5.0 that indicates how fluent an agent is in a particular language. ACD interactions are routed to agents with higher proficiency ratings.
   **/
  public ScimUserRoutingLanguage proficiency(Double proficiency) {
    this.proficiency = proficiency;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A rating from 0.0 to 5.0 that indicates how fluent an agent is in a particular language. ACD interactions are routed to agents with higher proficiency ratings.")
  @JsonProperty("proficiency")
  public Double getProficiency() {
    return proficiency;
  }
  public void setProficiency(Double proficiency) {
    this.proficiency = proficiency;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScimUserRoutingLanguage scimUserRoutingLanguage = (ScimUserRoutingLanguage) o;
    return Objects.equals(this.name, scimUserRoutingLanguage.name) &&
        Objects.equals(this.proficiency, scimUserRoutingLanguage.proficiency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, proficiency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScimUserRoutingLanguage {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    proficiency: ").append(toIndentedString(proficiency)).append("\n");
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

