package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Update coaching appointment request
 */
@ApiModel(description = "Update coaching appointment request")

public class UpdateCoachingAppointmentRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private Date dateStart = null;
  private Integer lengthInMinutes = null;
  private List<String> conversationIds = new ArrayList<String>();
  private List<String> documentIds = new ArrayList<String>();

  private static class StatusEnumDeserializer extends StdDeserializer<StatusEnum> {
    public StatusEnumDeserializer() {
      super(StatusEnumDeserializer.class);
    }

    @Override
    public StatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the coaching appointment.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    SCHEDULED("Scheduled"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StatusEnum fromString(String key) {
      if (key == null) return null;

      for (StatusEnum value : StatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StatusEnum status = null;

  
  /**
   * The name of coaching appointment.
   **/
  public UpdateCoachingAppointmentRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of coaching appointment.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The description of coaching appointment.
   **/
  public UpdateCoachingAppointmentRequest description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of coaching appointment.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   * The date/time the coaching appointment starts. Times will be rounded down to the minute. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public UpdateCoachingAppointmentRequest dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date/time the coaching appointment starts. Times will be rounded down to the minute. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }

  
  /**
   * The duration of coaching appointment in minutes.
   **/
  public UpdateCoachingAppointmentRequest lengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The duration of coaching appointment in minutes.")
  @JsonProperty("lengthInMinutes")
  public Integer getLengthInMinutes() {
    return lengthInMinutes;
  }
  public void setLengthInMinutes(Integer lengthInMinutes) {
    this.lengthInMinutes = lengthInMinutes;
  }

  
  /**
   * IDs of conversations associated with this coaching appointment.
   **/
  public UpdateCoachingAppointmentRequest conversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of conversations associated with this coaching appointment.")
  @JsonProperty("conversationIds")
  public List<String> getConversationIds() {
    return conversationIds;
  }
  public void setConversationIds(List<String> conversationIds) {
    this.conversationIds = conversationIds;
  }

  
  /**
   * IDs of documents associated with this coaching appointment.
   **/
  public UpdateCoachingAppointmentRequest documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "IDs of documents associated with this coaching appointment.")
  @JsonProperty("documentIds")
  public List<String> getDocumentIds() {
    return documentIds;
  }
  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }

  
  /**
   * The status of the coaching appointment.
   **/
  public UpdateCoachingAppointmentRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the coaching appointment.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateCoachingAppointmentRequest updateCoachingAppointmentRequest = (UpdateCoachingAppointmentRequest) o;
    return Objects.equals(this.name, updateCoachingAppointmentRequest.name) &&
        Objects.equals(this.description, updateCoachingAppointmentRequest.description) &&
        Objects.equals(this.dateStart, updateCoachingAppointmentRequest.dateStart) &&
        Objects.equals(this.lengthInMinutes, updateCoachingAppointmentRequest.lengthInMinutes) &&
        Objects.equals(this.conversationIds, updateCoachingAppointmentRequest.conversationIds) &&
        Objects.equals(this.documentIds, updateCoachingAppointmentRequest.documentIds) &&
        Objects.equals(this.status, updateCoachingAppointmentRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dateStart, lengthInMinutes, conversationIds, documentIds, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateCoachingAppointmentRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    lengthInMinutes: ").append(toIndentedString(lengthInMinutes)).append("\n");
    sb.append("    conversationIds: ").append(toIndentedString(conversationIds)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

