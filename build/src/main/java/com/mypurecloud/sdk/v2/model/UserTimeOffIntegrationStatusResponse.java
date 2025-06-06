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
import com.mypurecloud.sdk.v2.model.TimeOffRequestReference;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * UserTimeOffIntegrationStatusResponse
 */

public class UserTimeOffIntegrationStatusResponse  implements Serializable {
  
  private TimeOffRequestReference timeOffRequest = null;

  private static class IntegrationStatusEnumDeserializer extends StdDeserializer<IntegrationStatusEnum> {
    public IntegrationStatusEnumDeserializer() {
      super(IntegrationStatusEnumDeserializer.class);
    }

    @Override
    public IntegrationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IntegrationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The value of integration status for the time off request
   */
 @JsonDeserialize(using = IntegrationStatusEnumDeserializer.class)
  public enum IntegrationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    ERROR("Error"),
    AUTOMATICALLYCOMPLETE("AutomaticallyComplete"),
    MANUALLYCOMPLETE("ManuallyComplete");

    private String value;

    IntegrationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IntegrationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (IntegrationStatusEnum value : IntegrationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IntegrationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IntegrationStatusEnum integrationStatus = null;
  private UserReference user = null;

  public UserTimeOffIntegrationStatusResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The time off request associated with this integration status
   **/
  public UserTimeOffIntegrationStatusResponse timeOffRequest(TimeOffRequestReference timeOffRequest) {
    this.timeOffRequest = timeOffRequest;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The time off request associated with this integration status")
  @JsonProperty("timeOffRequest")
  public TimeOffRequestReference getTimeOffRequest() {
    return timeOffRequest;
  }
  public void setTimeOffRequest(TimeOffRequestReference timeOffRequest) {
    this.timeOffRequest = timeOffRequest;
  }


  /**
   * The value of integration status for the time off request
   **/
  public UserTimeOffIntegrationStatusResponse integrationStatus(IntegrationStatusEnum integrationStatus) {
    this.integrationStatus = integrationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of integration status for the time off request")
  @JsonProperty("integrationStatus")
  public IntegrationStatusEnum getIntegrationStatus() {
    return integrationStatus;
  }
  public void setIntegrationStatus(IntegrationStatusEnum integrationStatus) {
    this.integrationStatus = integrationStatus;
  }


  /**
   * The user to whom the time off request belongs
   **/
  public UserTimeOffIntegrationStatusResponse user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user to whom the time off request belongs")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserTimeOffIntegrationStatusResponse userTimeOffIntegrationStatusResponse = (UserTimeOffIntegrationStatusResponse) o;

    return Objects.equals(this.timeOffRequest, userTimeOffIntegrationStatusResponse.timeOffRequest) &&
            Objects.equals(this.integrationStatus, userTimeOffIntegrationStatusResponse.integrationStatus) &&
            Objects.equals(this.user, userTimeOffIntegrationStatusResponse.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeOffRequest, integrationStatus, user);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserTimeOffIntegrationStatusResponse {\n");
    
    sb.append("    timeOffRequest: ").append(toIndentedString(timeOffRequest)).append("\n");
    sb.append("    integrationStatus: ").append(toIndentedString(integrationStatus)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

