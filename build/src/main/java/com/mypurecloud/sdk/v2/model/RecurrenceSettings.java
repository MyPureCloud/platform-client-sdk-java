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
import com.mypurecloud.sdk.v2.model.RecurrenceEndSettings;
import com.mypurecloud.sdk.v2.model.RecurrencePeriod;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecurrenceSettings
 */

public class RecurrenceSettings  implements Serializable {
  
  private RecurrenceEndSettings endAfter = null;
  private RecurrencePeriod recurrencePeriod = null;
  private RecurrencePeriod minimumTimeBetweenOccurrences = null;

  public RecurrenceSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * Settings controlling when to end the recurrence for the activity plan
   **/
  public RecurrenceSettings endAfter(RecurrenceEndSettings endAfter) {
    this.endAfter = endAfter;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Settings controlling when to end the recurrence for the activity plan")
  @JsonProperty("endAfter")
  public RecurrenceEndSettings getEndAfter() {
    return endAfter;
  }
  public void setEndAfter(RecurrenceEndSettings endAfter) {
    this.endAfter = endAfter;
  }


  /**
   * The recurrence period of the activity plan
   **/
  public RecurrenceSettings recurrencePeriod(RecurrencePeriod recurrencePeriod) {
    this.recurrencePeriod = recurrencePeriod;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The recurrence period of the activity plan")
  @JsonProperty("recurrencePeriod")
  public RecurrencePeriod getRecurrencePeriod() {
    return recurrencePeriod;
  }
  public void setRecurrencePeriod(RecurrencePeriod recurrencePeriod) {
    this.recurrencePeriod = recurrencePeriod;
  }


  /**
   * Constraint indicating the minimum time in hours between recurrences of the activity plan
   **/
  public RecurrenceSettings minimumTimeBetweenOccurrences(RecurrencePeriod minimumTimeBetweenOccurrences) {
    this.minimumTimeBetweenOccurrences = minimumTimeBetweenOccurrences;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Constraint indicating the minimum time in hours between recurrences of the activity plan")
  @JsonProperty("minimumTimeBetweenOccurrences")
  public RecurrencePeriod getMinimumTimeBetweenOccurrences() {
    return minimumTimeBetweenOccurrences;
  }
  public void setMinimumTimeBetweenOccurrences(RecurrencePeriod minimumTimeBetweenOccurrences) {
    this.minimumTimeBetweenOccurrences = minimumTimeBetweenOccurrences;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecurrenceSettings recurrenceSettings = (RecurrenceSettings) o;

    return Objects.equals(this.endAfter, recurrenceSettings.endAfter) &&
            Objects.equals(this.recurrencePeriod, recurrenceSettings.recurrencePeriod) &&
            Objects.equals(this.minimumTimeBetweenOccurrences, recurrenceSettings.minimumTimeBetweenOccurrences);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endAfter, recurrencePeriod, minimumTimeBetweenOccurrences);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecurrenceSettings {\n");
    
    sb.append("    endAfter: ").append(toIndentedString(endAfter)).append("\n");
    sb.append("    recurrencePeriod: ").append(toIndentedString(recurrencePeriod)).append("\n");
    sb.append("    minimumTimeBetweenOccurrences: ").append(toIndentedString(minimumTimeBetweenOccurrences)).append("\n");
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

