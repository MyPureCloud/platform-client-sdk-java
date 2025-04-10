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
import com.mypurecloud.sdk.v2.model.UserSearchRulePart;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * UserSearchRule
 */

public class UserSearchRule  implements Serializable {
  
  private List<UserSearchRulePart> parts = null;

  public UserSearchRule() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      parts = new ArrayList<UserSearchRulePart>();
    }
  }

  
  /**
   * The parts of this rule; the results of these are ANDed together.
   **/
  public UserSearchRule parts(List<UserSearchRulePart> parts) {
    this.parts = parts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The parts of this rule; the results of these are ANDed together.")
  @JsonProperty("parts")
  public List<UserSearchRulePart> getParts() {
    return parts;
  }
  public void setParts(List<UserSearchRulePart> parts) {
    this.parts = parts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserSearchRule userSearchRule = (UserSearchRule) o;

    return Objects.equals(this.parts, userSearchRule.parts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserSearchRule {\n");
    
    sb.append("    parts: ").append(toIndentedString(parts)).append("\n");
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

