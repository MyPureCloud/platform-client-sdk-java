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
import com.mypurecloud.sdk.v2.model.DatePickerAvailableDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DatePicker
 */

public class DatePicker  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private List<DatePickerAvailableDateTime> datePickerAvailableDateTimes = null;
  private Date dateSelected = null;

  public DatePicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      datePickerAvailableDateTimes = new ArrayList<DatePickerAvailableDateTime>();
    }
  }

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple DatePickers can be present.
   **/
  public DatePicker id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Optional unique identifier to help map component replies to form messages where multiple DatePickers can be present.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * Text to show in the title.
   **/
  public DatePicker title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the title.")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * Text to show in the description.
   **/
  public DatePicker subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Text to show in the description.")
  @JsonProperty("subtitle")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }


  /**
   * An array of available times objects.
   **/
  public DatePicker datePickerAvailableDateTimes(List<DatePickerAvailableDateTime> datePickerAvailableDateTimes) {
    this.datePickerAvailableDateTimes = datePickerAvailableDateTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of available times objects.")
  @JsonProperty("datePickerAvailableDateTimes")
  public List<DatePickerAvailableDateTime> getDatePickerAvailableDateTimes() {
    return datePickerAvailableDateTimes;
  }
  public void setDatePickerAvailableDateTimes(List<DatePickerAvailableDateTime> datePickerAvailableDateTimes) {
    this.datePickerAvailableDateTimes = datePickerAvailableDateTimes;
  }


  /**
   * Selected date response from end customer. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DatePicker dateSelected(Date dateSelected) {
    this.dateSelected = dateSelected;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Selected date response from end customer. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateSelected")
  public Date getDateSelected() {
    return dateSelected;
  }
  public void setDateSelected(Date dateSelected) {
    this.dateSelected = dateSelected;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatePicker datePicker = (DatePicker) o;

    return Objects.equals(this.id, datePicker.id) &&
            Objects.equals(this.title, datePicker.title) &&
            Objects.equals(this.subtitle, datePicker.subtitle) &&
            Objects.equals(this.datePickerAvailableDateTimes, datePicker.datePickerAvailableDateTimes) &&
            Objects.equals(this.dateSelected, datePicker.dateSelected);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, datePickerAvailableDateTimes, dateSelected);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatePicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    datePickerAvailableDateTimes: ").append(toIndentedString(datePickerAvailableDateTimes)).append("\n");
    sb.append("    dateSelected: ").append(toIndentedString(dateSelected)).append("\n");
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

