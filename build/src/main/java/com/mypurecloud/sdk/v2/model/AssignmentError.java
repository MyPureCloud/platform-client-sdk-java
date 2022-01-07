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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * AssignmentError
 */

public class AssignmentError  implements Serializable {
  
  private UserReference user = null;
  private String message = null;

  
  /**
   * A user that is failed to be removed from the performance profile
   **/
  public AssignmentError user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A user that is failed to be removed from the performance profile")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }

  
  /**
   * Error message from membership assignment
   **/
  public AssignmentError message(String message) {
    this.message = message;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Error message from membership assignment")
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }
  public void setMessage(String message) {
    this.message = message;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignmentError assignmentError = (AssignmentError) o;
    return Objects.equals(this.user, assignmentError.user) &&
        Objects.equals(this.message, assignmentError.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignmentError {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

