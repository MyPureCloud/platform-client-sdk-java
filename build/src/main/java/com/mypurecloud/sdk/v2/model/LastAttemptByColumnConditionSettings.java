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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * LastAttemptByColumnConditionSettings
 */

public class LastAttemptByColumnConditionSettings  implements Serializable {
  
  private String emailColumnName = null;
  private String smsColumnName = null;

  private static class OperatorEnumDeserializer extends StdDeserializer<OperatorEnum> {
    public OperatorEnumDeserializer() {
      super(OperatorEnumDeserializer.class);
    }

    @Override
    public OperatorEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return OperatorEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The operator to use when comparing values.
   */
 @JsonDeserialize(using = OperatorEnumDeserializer.class)
  public enum OperatorEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    BEFORE("Before"),
    AFTER("After");

    private String value;

    OperatorEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static OperatorEnum fromString(String key) {
      if (key == null) return null;

      for (OperatorEnum value : OperatorEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return OperatorEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private OperatorEnum operator = null;
  private String value = null;

  
  /**
   * The name of the contact column to evaluate for Email.
   **/
  public LastAttemptByColumnConditionSettings emailColumnName(String emailColumnName) {
    this.emailColumnName = emailColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the contact column to evaluate for Email.")
  @JsonProperty("emailColumnName")
  public String getEmailColumnName() {
    return emailColumnName;
  }
  public void setEmailColumnName(String emailColumnName) {
    this.emailColumnName = emailColumnName;
  }


  /**
   * The name of the contact column to evaluate for SMS.
   **/
  public LastAttemptByColumnConditionSettings smsColumnName(String smsColumnName) {
    this.smsColumnName = smsColumnName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the contact column to evaluate for SMS.")
  @JsonProperty("smsColumnName")
  public String getSmsColumnName() {
    return smsColumnName;
  }
  public void setSmsColumnName(String smsColumnName) {
    this.smsColumnName = smsColumnName;
  }


  /**
   * The operator to use when comparing values.
   **/
  public LastAttemptByColumnConditionSettings operator(OperatorEnum operator) {
    this.operator = operator;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The operator to use when comparing values.")
  @JsonProperty("operator")
  public OperatorEnum getOperator() {
    return operator;
  }
  public void setOperator(OperatorEnum operator) {
    this.operator = operator;
  }


  /**
   * The period value to compare against the contact's data.
   **/
  public LastAttemptByColumnConditionSettings value(String value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "P1DT1H1M", required = true, value = "The period value to compare against the contact's data.")
  @JsonProperty("value")
  public String getValue() {
    return value;
  }
  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LastAttemptByColumnConditionSettings lastAttemptByColumnConditionSettings = (LastAttemptByColumnConditionSettings) o;

    return Objects.equals(this.emailColumnName, lastAttemptByColumnConditionSettings.emailColumnName) &&
            Objects.equals(this.smsColumnName, lastAttemptByColumnConditionSettings.smsColumnName) &&
            Objects.equals(this.operator, lastAttemptByColumnConditionSettings.operator) &&
            Objects.equals(this.value, lastAttemptByColumnConditionSettings.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(emailColumnName, smsColumnName, operator, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LastAttemptByColumnConditionSettings {\n");
    
    sb.append("    emailColumnName: ").append(toIndentedString(emailColumnName)).append("\n");
    sb.append("    smsColumnName: ").append(toIndentedString(smsColumnName)).append("\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

