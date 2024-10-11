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
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UpdateMuAgentWorkPlanFailureResponse
 */

public class UpdateMuAgentWorkPlanFailureResponse  implements Serializable {
  
  private UserReference user = null;

  private static class FailureEnumDeserializer extends StdDeserializer<FailureEnum> {
    public FailureEnumDeserializer() {
      super(FailureEnumDeserializer.class);
    }

    @Override
    public FailureEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return FailureEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The work plan update failure reason
   */
 @JsonDeserialize(using = FailureEnumDeserializer.class)
  public enum FailureEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    AGENTNOTINMANAGEMENTUNIT("AgentNotInManagementUnit"),
    OVERLAPPINGOVERRIDE("OverlappingOverride"),
    OVERRIDENOTFOUND("OverrideNotFound"),
    TOOMANYOVERRIDES("TooManyOverrides"),
    WORKPLANNOTFOUND("WorkPlanNotFound");

    private String value;

    FailureEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static FailureEnum fromString(String key) {
      if (key == null) return null;

      for (FailureEnum value : FailureEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return FailureEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private FailureEnum failure = null;
  private String notFoundWorkPlanId = null;

  
  /**
   * The user for whom the work plan update has failed
   **/
  public UpdateMuAgentWorkPlanFailureResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user for whom the work plan update has failed")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * The work plan update failure reason
   **/
  public UpdateMuAgentWorkPlanFailureResponse failure(FailureEnum failure) {
    this.failure = failure;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The work plan update failure reason")
  @JsonProperty("failure")
  public FailureEnum getFailure() {
    return failure;
  }
  public void setFailure(FailureEnum failure) {
    this.failure = failure;
  }


  /**
   * The id of the work plan that has not been found
   **/
  public UpdateMuAgentWorkPlanFailureResponse notFoundWorkPlanId(String notFoundWorkPlanId) {
    this.notFoundWorkPlanId = notFoundWorkPlanId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the work plan that has not been found")
  @JsonProperty("notFoundWorkPlanId")
  public String getNotFoundWorkPlanId() {
    return notFoundWorkPlanId;
  }
  public void setNotFoundWorkPlanId(String notFoundWorkPlanId) {
    this.notFoundWorkPlanId = notFoundWorkPlanId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateMuAgentWorkPlanFailureResponse updateMuAgentWorkPlanFailureResponse = (UpdateMuAgentWorkPlanFailureResponse) o;

    return Objects.equals(this.user, updateMuAgentWorkPlanFailureResponse.user) &&
            Objects.equals(this.failure, updateMuAgentWorkPlanFailureResponse.failure) &&
            Objects.equals(this.notFoundWorkPlanId, updateMuAgentWorkPlanFailureResponse.notFoundWorkPlanId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, failure, notFoundWorkPlanId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateMuAgentWorkPlanFailureResponse {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    failure: ").append(toIndentedString(failure)).append("\n");
    sb.append("    notFoundWorkPlanId: ").append(toIndentedString(notFoundWorkPlanId)).append("\n");
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

