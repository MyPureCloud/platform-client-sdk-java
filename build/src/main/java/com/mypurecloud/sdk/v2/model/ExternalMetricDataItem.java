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
import java.math.BigDecimal;
import java.time.LocalDate;

import java.io.Serializable;
/**
 * ExternalMetricDataItem
 */

public class ExternalMetricDataItem  implements Serializable {
  
  private String userId = null;
  private String userEmail = null;
  private String metricId = null;
  private LocalDate dateOccurred = null;
  private BigDecimal value = null;
  private Integer count = null;

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of the metric data. The default value is Total.
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    TOTAL("Total"),
    CUMULATIVE("Cumulative");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;

  
  /**
   * The user ID. Must provide either userId or userEmail, but not both.
   **/
  public ExternalMetricDataItem userId(String userId) {
    this.userId = userId;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user ID. Must provide either userId or userEmail, but not both.")
  @JsonProperty("userId")
  public String getUserId() {
    return userId;
  }
  public void setUserId(String userId) {
    this.userId = userId;
  }


  /**
   * The user main email used in user's GenesysCloud account. Must provide either userId or userEmail, but not both.
   **/
  public ExternalMetricDataItem userEmail(String userEmail) {
    this.userEmail = userEmail;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The user main email used in user's GenesysCloud account. Must provide either userId or userEmail, but not both.")
  @JsonProperty("userEmail")
  public String getUserEmail() {
    return userEmail;
  }
  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  /**
   * The ID of the external metric definition
   **/
  public ExternalMetricDataItem metricId(String metricId) {
    this.metricId = metricId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the external metric definition")
  @JsonProperty("metricId")
  public String getMetricId() {
    return metricId;
  }
  public void setMetricId(String metricId) {
    this.metricId = metricId;
  }


  /**
   * The date of the metric data. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ExternalMetricDataItem dateOccurred(LocalDate dateOccurred) {
    this.dateOccurred = dateOccurred;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date of the metric data. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateOccurred")
  public LocalDate getDateOccurred() {
    return dateOccurred;
  }
  public void setDateOccurred(LocalDate dateOccurred) {
    this.dateOccurred = dateOccurred;
  }


  /**
   * The value of the metric data. When value is null, the metric data will be deleted.
   **/
  public ExternalMetricDataItem value(BigDecimal value) {
    this.value = value;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The value of the metric data. When value is null, the metric data will be deleted.")
  @JsonProperty("value")
  public BigDecimal getValue() {
    return value;
  }
  public void setValue(BigDecimal value) {
    this.value = value;
  }


  /**
   * The number of data points. The default value is 0 when type is Cumulative and the metric data already exists, otherwise 1. When total count reaches 0, the metric data will be deleted.
   **/
  public ExternalMetricDataItem count(Integer count) {
    this.count = count;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of data points. The default value is 0 when type is Cumulative and the metric data already exists, otherwise 1. When total count reaches 0, the metric data will be deleted.")
  @JsonProperty("count")
  public Integer getCount() {
    return count;
  }
  public void setCount(Integer count) {
    this.count = count;
  }


  /**
   * The type of the metric data. The default value is Total.
   **/
  public ExternalMetricDataItem type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of the metric data. The default value is Total.")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExternalMetricDataItem externalMetricDataItem = (ExternalMetricDataItem) o;

    return Objects.equals(this.userId, externalMetricDataItem.userId) &&
            Objects.equals(this.userEmail, externalMetricDataItem.userEmail) &&
            Objects.equals(this.metricId, externalMetricDataItem.metricId) &&
            Objects.equals(this.dateOccurred, externalMetricDataItem.dateOccurred) &&
            Objects.equals(this.value, externalMetricDataItem.value) &&
            Objects.equals(this.count, externalMetricDataItem.count) &&
            Objects.equals(this.type, externalMetricDataItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userId, userEmail, metricId, dateOccurred, value, count, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalMetricDataItem {\n");
    
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    userEmail: ").append(toIndentedString(userEmail)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    dateOccurred: ").append(toIndentedString(dateOccurred)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

