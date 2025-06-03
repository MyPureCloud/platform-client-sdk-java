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
import com.mypurecloud.sdk.v2.model.ConversationContentDatePickerAvailableTime;
import com.mypurecloud.sdk.v2.model.ConversationContentLocation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * DateTimePicker content object.
 */
@ApiModel(description = "DateTimePicker content object.")

public class ConversationContentDatePicker  implements Serializable {
  
  private String id = null;
  private String title = null;
  private String subtitle = null;
  private String imageUrl = null;
  private Date dateMinimum = null;
  private Date dateMaximum = null;
  private ConversationContentLocation location = null;
  private List<ConversationContentDatePickerAvailableTime> availableTimes = null;

  private static class DateDisplayFormatEnumDeserializer extends StdDeserializer<DateDisplayFormatEnum> {
    public DateDisplayFormatEnumDeserializer() {
      super(DateDisplayFormatEnumDeserializer.class);
    }

    @Override
    public DateDisplayFormatEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return DateDisplayFormatEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The format the date should be presented to the end user.
   */
 @JsonDeserialize(using = DateDisplayFormatEnumDeserializer.class)
  public enum DateDisplayFormatEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DAYMONTHYEAR("dayMonthYear"),
    MONTHDAYYEAR("monthDayYear"),
    YEARMONTHDAY("yearMonthDay");

    private String value;

    DateDisplayFormatEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static DateDisplayFormatEnum fromString(String key) {
      if (key == null) return null;

      for (DateDisplayFormatEnum value : DateDisplayFormatEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return DateDisplayFormatEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private DateDisplayFormatEnum dateDisplayFormat = null;

  public ConversationContentDatePicker() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      availableTimes = new ArrayList<ConversationContentDatePickerAvailableTime>();
    }
  }

  
  /**
   * Optional unique identifier to help map component replies to form messages where multiple DatePickers can be present.
   **/
  public ConversationContentDatePicker id(String id) {
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
  public ConversationContentDatePicker title(String title) {
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
  public ConversationContentDatePicker subtitle(String subtitle) {
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
  public ConversationContentDatePicker imageUrl(String imageUrl) {
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
   * The minimum Date Enabled in the datepicker calendar, format: ISO 8601.
   **/
  public ConversationContentDatePicker dateMinimum(Date dateMinimum) {
    this.dateMinimum = dateMinimum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The minimum Date Enabled in the datepicker calendar, format: ISO 8601.")
  @JsonProperty("dateMinimum")
  public Date getDateMinimum() {
    return dateMinimum;
  }
  public void setDateMinimum(Date dateMinimum) {
    this.dateMinimum = dateMinimum;
  }


  /**
   * The maximum Date Enabled in the datepicker calendar, format: ISO 8601.
   **/
  public ConversationContentDatePicker dateMaximum(Date dateMaximum) {
    this.dateMaximum = dateMaximum;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The maximum Date Enabled in the datepicker calendar, format: ISO 8601.")
  @JsonProperty("dateMaximum")
  public Date getDateMaximum() {
    return dateMaximum;
  }
  public void setDateMaximum(Date dateMaximum) {
    this.dateMaximum = dateMaximum;
  }


  /**
   * Location of the event.
   **/
  public ConversationContentDatePicker location(ConversationContentLocation location) {
    this.location = location;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Location of the event.")
  @JsonProperty("location")
  public ConversationContentLocation getLocation() {
    return location;
  }
  public void setLocation(ConversationContentLocation location) {
    this.location = location;
  }


  /**
   * An array of available times objects.
   **/
  public ConversationContentDatePicker availableTimes(List<ConversationContentDatePickerAvailableTime> availableTimes) {
    this.availableTimes = availableTimes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An array of available times objects.")
  @JsonProperty("availableTimes")
  public List<ConversationContentDatePickerAvailableTime> getAvailableTimes() {
    return availableTimes;
  }
  public void setAvailableTimes(List<ConversationContentDatePickerAvailableTime> availableTimes) {
    this.availableTimes = availableTimes;
  }


  /**
   * The format the date should be presented to the end user.
   **/
  public ConversationContentDatePicker dateDisplayFormat(DateDisplayFormatEnum dateDisplayFormat) {
    this.dateDisplayFormat = dateDisplayFormat;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The format the date should be presented to the end user.")
  @JsonProperty("dateDisplayFormat")
  public DateDisplayFormatEnum getDateDisplayFormat() {
    return dateDisplayFormat;
  }
  public void setDateDisplayFormat(DateDisplayFormatEnum dateDisplayFormat) {
    this.dateDisplayFormat = dateDisplayFormat;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationContentDatePicker conversationContentDatePicker = (ConversationContentDatePicker) o;

    return Objects.equals(this.id, conversationContentDatePicker.id) &&
            Objects.equals(this.title, conversationContentDatePicker.title) &&
            Objects.equals(this.subtitle, conversationContentDatePicker.subtitle) &&
            Objects.equals(this.imageUrl, conversationContentDatePicker.imageUrl) &&
            Objects.equals(this.dateMinimum, conversationContentDatePicker.dateMinimum) &&
            Objects.equals(this.dateMaximum, conversationContentDatePicker.dateMaximum) &&
            Objects.equals(this.location, conversationContentDatePicker.location) &&
            Objects.equals(this.availableTimes, conversationContentDatePicker.availableTimes) &&
            Objects.equals(this.dateDisplayFormat, conversationContentDatePicker.dateDisplayFormat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, subtitle, imageUrl, dateMinimum, dateMaximum, location, availableTimes, dateDisplayFormat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationContentDatePicker {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    dateMinimum: ").append(toIndentedString(dateMinimum)).append("\n");
    sb.append("    dateMaximum: ").append(toIndentedString(dateMaximum)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    availableTimes: ").append(toIndentedString(availableTimes)).append("\n");
    sb.append("    dateDisplayFormat: ").append(toIndentedString(dateDisplayFormat)).append("\n");
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

