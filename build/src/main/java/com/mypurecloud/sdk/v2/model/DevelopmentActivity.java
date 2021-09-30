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
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * Development Activity object
 */
@ApiModel(description = "Development Activity object")

public class DevelopmentActivity  implements Serializable {
  
  private String id = null;
  private Date dateCompleted = null;
  private UserReference createdBy = null;
  private Date dateCreated = null;
  private String selfUri = null;
  private String name = null;

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
   * The type of activity
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INFORMATIONAL("Informational"),
    COACHING("Coaching"),
    ASSESSEDCONTENT("AssessedContent"),
    ASSESSMENT("Assessment");

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
   * The status of the activity
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PLANNED("Planned"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    INVALIDSCHEDULE("InvalidSchedule");

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
  private Date dateDue = null;
  private UserReference facilitator = null;
  private List<UserReference> attendees = new ArrayList<UserReference>();
  private Boolean isOverdue = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  @ApiModelProperty(example = "null", value = "Date that activity was completed. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCompleted")
  public Date getDateCompleted() {
    return dateCompleted;
  }

  
  @ApiModelProperty(example = "null", value = "User that created activity")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }

  
  @ApiModelProperty(example = "null", value = "Date activity was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }

  
  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }

  
  /**
   * The name of the activity
   **/
  public DevelopmentActivity name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the activity")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The type of activity
   **/
  public DevelopmentActivity type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of activity")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  
  /**
   * The status of the activity
   **/
  public DevelopmentActivity status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the activity")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Due date for completion of the activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DevelopmentActivity dateDue(Date dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Due date for completion of the activity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDue")
  public Date getDateDue() {
    return dateDue;
  }
  public void setDateDue(Date dateDue) {
    this.dateDue = dateDue;
  }

  
  /**
   * Facilitator of the activity
   **/
  public DevelopmentActivity facilitator(UserReference facilitator) {
    this.facilitator = facilitator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Facilitator of the activity")
  @JsonProperty("facilitator")
  public UserReference getFacilitator() {
    return facilitator;
  }
  public void setFacilitator(UserReference facilitator) {
    this.facilitator = facilitator;
  }

  
  /**
   * List of users attending the activity
   **/
  public DevelopmentActivity attendees(List<UserReference> attendees) {
    this.attendees = attendees;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of users attending the activity")
  @JsonProperty("attendees")
  public List<UserReference> getAttendees() {
    return attendees;
  }
  public void setAttendees(List<UserReference> attendees) {
    this.attendees = attendees;
  }

  
  /**
   * Indicates if the activity is overdue
   **/
  public DevelopmentActivity isOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates if the activity is overdue")
  @JsonProperty("isOverdue")
  public Boolean getIsOverdue() {
    return isOverdue;
  }
  public void setIsOverdue(Boolean isOverdue) {
    this.isOverdue = isOverdue;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DevelopmentActivity developmentActivity = (DevelopmentActivity) o;
    return Objects.equals(this.id, developmentActivity.id) &&
        Objects.equals(this.dateCompleted, developmentActivity.dateCompleted) &&
        Objects.equals(this.createdBy, developmentActivity.createdBy) &&
        Objects.equals(this.dateCreated, developmentActivity.dateCreated) &&
        Objects.equals(this.selfUri, developmentActivity.selfUri) &&
        Objects.equals(this.name, developmentActivity.name) &&
        Objects.equals(this.type, developmentActivity.type) &&
        Objects.equals(this.status, developmentActivity.status) &&
        Objects.equals(this.dateDue, developmentActivity.dateDue) &&
        Objects.equals(this.facilitator, developmentActivity.facilitator) &&
        Objects.equals(this.attendees, developmentActivity.attendees) &&
        Objects.equals(this.isOverdue, developmentActivity.isOverdue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dateCompleted, createdBy, dateCreated, selfUri, name, type, status, dateDue, facilitator, attendees, isOverdue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DevelopmentActivity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dateCompleted: ").append(toIndentedString(dateCompleted)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    facilitator: ").append(toIndentedString(facilitator)).append("\n");
    sb.append("    attendees: ").append(toIndentedString(attendees)).append("\n");
    sb.append("    isOverdue: ").append(toIndentedString(isOverdue)).append("\n");
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

