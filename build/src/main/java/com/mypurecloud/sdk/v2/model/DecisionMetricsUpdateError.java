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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DecisionMetricsUpdateError
 */

public class DecisionMetricsUpdateError  implements Serializable {
  
  private UserReference user = null;

  private static class ErrorsEnumDeserializer extends StdDeserializer<ErrorsEnum> {
    public ErrorsEnumDeserializer() {
      super(ErrorsEnumDeserializer.class);
    }

    @Override
    public ErrorsEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ErrorsEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets errors
   */
 @JsonDeserialize(using = ErrorsEnumDeserializer.class)
  public enum ErrorsEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INVALIDUSER("InvalidUser"),
    INVALIDPERFORMANCERANK("InvalidPerformanceRank"),
    INVALIDTIEBREAKER("InvalidTieBreaker");

    private String value;

    ErrorsEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ErrorsEnum fromString(String key) {
      if (key == null) return null;

      for (ErrorsEnum value : ErrorsEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ErrorsEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<ErrorsEnum> errors = null;

  public DecisionMetricsUpdateError() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      errors = new ArrayList<ErrorsEnum>();
    }
  }

  public DecisionMetricsUpdateError(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      errors = new ArrayList<ErrorsEnum>();
    }
  }

  
  /**
   * The user for the decision metrics row where errors were found
   **/
  public DecisionMetricsUpdateError user(UserReference user) {
    this.user = user;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user for the decision metrics row where errors were found")
  @JsonProperty("user")
  public UserReference getUser() {
    return user;
  }
  public void setUser(UserReference user) {
    this.user = user;
  }


  /**
   * Errors found during the update process
   **/
  public DecisionMetricsUpdateError errors(List<ErrorsEnum> errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Errors found during the update process")
  @JsonProperty("errors")
  public List<ErrorsEnum> getErrors() {
    return errors;
  }
  public void setErrors(List<ErrorsEnum> errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DecisionMetricsUpdateError decisionMetricsUpdateError = (DecisionMetricsUpdateError) o;

    return Objects.equals(this.user, decisionMetricsUpdateError.user) &&
            Objects.equals(this.errors, decisionMetricsUpdateError.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(user, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionMetricsUpdateError {\n");
    
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

