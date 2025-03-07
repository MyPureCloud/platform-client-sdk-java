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
import com.mypurecloud.sdk.v2.model.ContentDatePickerAvailableTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DatePicker content object.
 */
@ApiModel(description = "DatePicker content object.")

public class ContentDatePicker  implements Serializable {
  
  private String title = null;
  private String subtitle = null;
  private String imageUrl = null;
  private Date dateMinimum = null;
  private Date dateMaximum = null;
  private List<ContentDatePickerAvailableTime> availableTimes = new ArrayList<ContentDatePickerAvailableTime>();

  
  /**
   * Text to show in the title.
   **/
  public ContentDatePicker title(String title) {
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
  public ContentDatePicker subtitle(String subtitle) {
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
   * URL of an image
   **/
  public ContentDatePicker imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "URL of an image")
  @JsonProperty("imageUrl")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  /**
   * The minimum Date Enabled in the datepicker calendar. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContentDatePicker dateMinimum(Date dateMinimum) {
    this.dateMinimum = dateMinimum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum Date Enabled in the datepicker calendar. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateMinimum")
  public Date getDateMinimum() {
    return dateMinimum;
  }
  public void setDateMinimum(Date dateMinimum) {
    this.dateMinimum = dateMinimum;
  }


  /**
   * The maximum Date Enabled in the datepicker calendar. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContentDatePicker dateMaximum(Date dateMaximum) {
    this.dateMaximum = dateMaximum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum Date Enabled in the datepicker calendar. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateMaximum")
  public Date getDateMaximum() {
    return dateMaximum;
  }
  public void setDateMaximum(Date dateMaximum) {
    this.dateMaximum = dateMaximum;
  }


  /**
   * An array of available times objects.
   **/
  public ContentDatePicker availableTimes(List<ContentDatePickerAvailableTime> availableTimes) {
    this.availableTimes = availableTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An array of available times objects.")
  @JsonProperty("availableTimes")
  public List<ContentDatePickerAvailableTime> getAvailableTimes() {
    return availableTimes;
  }
  public void setAvailableTimes(List<ContentDatePickerAvailableTime> availableTimes) {
    this.availableTimes = availableTimes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContentDatePicker contentDatePicker = (ContentDatePicker) o;

    return Objects.equals(this.title, contentDatePicker.title) &&
            Objects.equals(this.subtitle, contentDatePicker.subtitle) &&
            Objects.equals(this.imageUrl, contentDatePicker.imageUrl) &&
            Objects.equals(this.dateMinimum, contentDatePicker.dateMinimum) &&
            Objects.equals(this.dateMaximum, contentDatePicker.dateMaximum) &&
            Objects.equals(this.availableTimes, contentDatePicker.availableTimes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, imageUrl, dateMinimum, dateMaximum, availableTimes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContentDatePicker {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    dateMinimum: ").append(toIndentedString(dateMinimum)).append("\n");
    sb.append("    dateMaximum: ").append(toIndentedString(dateMaximum)).append("\n");
    sb.append("    availableTimes: ").append(toIndentedString(availableTimes)).append("\n");
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

