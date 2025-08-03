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
 * DefaultAnswer
 */

public class DefaultAnswer  implements Serializable {
  
  private String id = null;
  private Boolean notApplicable = null;

  public DefaultAnswer() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Selected default answer id for the question.
   **/
  public DefaultAnswer id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected default answer id for the question.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  @ApiModelProperty(example = "null", value = "Is true if the selected default answer for the question is N/A")
  @JsonProperty("notApplicable")
  public Boolean getNotApplicable() {
    return notApplicable;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DefaultAnswer defaultAnswer = (DefaultAnswer) o;

    return Objects.equals(this.id, defaultAnswer.id) &&
            Objects.equals(this.notApplicable, defaultAnswer.notApplicable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, notApplicable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DefaultAnswer {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    notApplicable: ").append(toIndentedString(notApplicable)).append("\n");
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

