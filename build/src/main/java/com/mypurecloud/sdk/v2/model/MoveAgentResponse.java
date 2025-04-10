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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * MoveAgentResponse
 */

public class MoveAgentResponse  implements Serializable {
  
  private UserReference user = null;

  private static class ResultEnumDeserializer extends StdDeserializer<ResultEnum> {
    public ResultEnumDeserializer() {
      super(ResultEnumDeserializer.class);
    }

    @Override
    public ResultEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ResultEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The result of the move
   */
 @JsonDeserialize(using = ResultEnumDeserializer.class)
  public enum ResultEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ALREADYMOVED("AlreadyMoved"),
    DESTINATIONBUSINESSUNITAGENTLIMITEXCEEDED("DestinationBusinessUnitAgentLimitExceeded"),
    DESTINATIONMANAGEMENTUNITAGENTLIMITEXCEEDED("DestinationManagementUnitAgentLimitExceeded"),
    DESTINATIONMANAGEMENTUNITDOESNOTEXIST("DestinationManagementUnitDoesNotExist"),
    MOVESUCCESSFUL("MoveSuccessful"),
    MOVINGTODIFFERENTMANAGEMENTUNIT("MovingToDifferentManagementUnit"),
    NOTHINGTODO("NothingToDo"),
    SOURCEMANAGEMENTUNITNOTAUTHORIZED("SourceManagementUnitNotAuthorized");

    private String value;

    ResultEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ResultEnum fromString(String key) {
      if (key == null) return null;

      for (ResultEnum value : ResultEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ResultEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ResultEnum result = null;

  public MoveAgentResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The user associated with the move
   **/
  public MoveAgentResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user associated with the move")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The result of the move
   **/
  public MoveAgentResponse result(ResultEnum result) {
    this.result = result;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The result of the move")
  @JsonProperty("result")
  public ResultEnum getResult() {
    return result;
  }
  public void setResult(ResultEnum result) {
    this.result = result;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MoveAgentResponse moveAgentResponse = (MoveAgentResponse) o;

    return Objects.equals(this.user, moveAgentResponse.user) &&
            Objects.equals(this.result, moveAgentResponse.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MoveAgentResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

