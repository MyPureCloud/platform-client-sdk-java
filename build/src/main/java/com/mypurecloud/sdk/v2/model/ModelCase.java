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
import com.mypurecloud.sdk.v2.model.CaseExternalContactReference;
import com.mypurecloud.sdk.v2.model.CaseplanReference;
import com.mypurecloud.sdk.v2.model.CustomerIntentReference;
import com.mypurecloud.sdk.v2.model.StarrableDivision;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ModelCase
 */

public class ModelCase  implements Serializable {
  
  private String id = null;
  private String name = null;
  private StarrableDivision division = null;
  private Integer version = null;
  private String reference = null;
  private CaseplanReference caseplan = null;
  private String summary = null;
  private UserReference owner = null;

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
   * The status of the Case.
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    OPEN("Open"),
    INPROGRESS("InProgress"),
    TERMINATING("Terminating"),
    TERMINATED("Terminated"),
    CLOSED("Closed"),
    FAILED("Failed");

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

  private static class PriorityEnumDeserializer extends StdDeserializer<PriorityEnum> {
    public PriorityEnumDeserializer() {
      super(PriorityEnumDeserializer.class);
    }

    @Override
    public PriorityEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return PriorityEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The priority of the Case.
   */
 @JsonDeserialize(using = PriorityEnumDeserializer.class)
  public enum PriorityEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("Unknown"),
    URGENT("Urgent"),
    HIGH("High"),
    MEDIUM("Medium"),
    LOW("Low");

    private String value;

    PriorityEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static PriorityEnum fromString(String key) {
      if (key == null) return null;

      for (PriorityEnum value : PriorityEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return PriorityEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private PriorityEnum priority = null;
  private Date dateDue = null;
  private Date dateStarted = null;
  private Date dateClosed = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private UserReference modifiedBy = null;
  private CaseExternalContactReference externalContact = null;
  private CustomerIntentReference customerIntent = null;

  private static class CreationStatusEnumDeserializer extends StdDeserializer<CreationStatusEnum> {
    public CreationStatusEnumDeserializer() {
      super(CreationStatusEnumDeserializer.class);
    }

    @Override
    public CreationStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CreationStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The creation status of the Case
   */
 @JsonDeserialize(using = CreationStatusEnumDeserializer.class)
  public enum CreationStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("Pending"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private String value;

    CreationStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CreationStatusEnum fromString(String key) {
      if (key == null) return null;

      for (CreationStatusEnum value : CreationStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CreationStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CreationStatusEnum creationStatus = null;
  private Integer ttlSeconds = null;
  private String selfUri = null;

  public ModelCase() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Case.
   **/
  public ModelCase name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Case.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The division to which this entity belongs.
   **/
  public ModelCase division(StarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public StarrableDivision getDivision() {
    return division;
  }
  public void setDivision(StarrableDivision division) {
    this.division = division;
  }


  /**
   * The version of the Case.
   **/
  public ModelCase version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version of the Case.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The reference identifier of the Case.
   **/
  public ModelCase reference(String reference) {
    this.reference = reference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference identifier of the Case.")
  @JsonProperty("reference")
  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }


  /**
   * The Caseplan the case was created from.
   **/
  public ModelCase caseplan(CaseplanReference caseplan) {
    this.caseplan = caseplan;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Caseplan the case was created from.")
  @JsonProperty("caseplan")
  public CaseplanReference getCaseplan() {
    return caseplan;
  }
  public void setCaseplan(CaseplanReference caseplan) {
    this.caseplan = caseplan;
  }


  /**
   * Overview information for the Case.
   **/
  public ModelCase summary(String summary) {
    this.summary = summary;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Overview information for the Case.")
  @JsonProperty("summary")
  public String getSummary() {
    return summary;
  }
  public void setSummary(String summary) {
    this.summary = summary;
  }


  /**
   * The owner of the Case.
   **/
  public ModelCase owner(UserReference owner) {
    this.owner = owner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The owner of the Case.")
  @JsonProperty("owner")
  public UserReference getOwner() {
    return owner;
  }
  public void setOwner(UserReference owner) {
    this.owner = owner;
  }


  /**
   * The status of the Case.
   **/
  public ModelCase status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The status of the Case.")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The priority of the Case.
   **/
  public ModelCase priority(PriorityEnum priority) {
    this.priority = priority;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The priority of the Case.")
  @JsonProperty("priority")
  public PriorityEnum getPriority() {
    return priority;
  }
  public void setPriority(PriorityEnum priority) {
    this.priority = priority;
  }


  /**
   * The due date of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ModelCase dateDue(Date dateDue) {
    this.dateDue = dateDue;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The due date of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateDue")
  public Date getDateDue() {
    return dateDue;
  }
  public void setDateDue(Date dateDue) {
    this.dateDue = dateDue;
  }


  /**
   * The start time of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ModelCase dateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The start time of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStarted")
  public Date getDateStarted() {
    return dateStarted;
  }
  public void setDateStarted(Date dateStarted) {
    this.dateStarted = dateStarted;
  }


  /**
   * The completion time of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ModelCase dateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The completion time of the Case. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateClosed")
  public Date getDateClosed() {
    return dateClosed;
  }
  public void setDateClosed(Date dateClosed) {
    this.dateClosed = dateClosed;
  }


  /**
   * The date the Case was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ModelCase dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the Case was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The date the Case was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ModelCase dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date the Case was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The id of the User who modified the Case.
   **/
  public ModelCase modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the User who modified the Case.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The External Contact associated with the Case.
   **/
  public ModelCase externalContact(CaseExternalContactReference externalContact) {
    this.externalContact = externalContact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The External Contact associated with the Case.")
  @JsonProperty("externalContact")
  public CaseExternalContactReference getExternalContact() {
    return externalContact;
  }
  public void setExternalContact(CaseExternalContactReference externalContact) {
    this.externalContact = externalContact;
  }


  /**
   * The customer intent for the Case.
   **/
  public ModelCase customerIntent(CustomerIntentReference customerIntent) {
    this.customerIntent = customerIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer intent for the Case.")
  @JsonProperty("customerIntent")
  public CustomerIntentReference getCustomerIntent() {
    return customerIntent;
  }
  public void setCustomerIntent(CustomerIntentReference customerIntent) {
    this.customerIntent = customerIntent;
  }


  /**
   * The creation status of the Case
   **/
  public ModelCase creationStatus(CreationStatusEnum creationStatus) {
    this.creationStatus = creationStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creation status of the Case")
  @JsonProperty("creationStatus")
  public CreationStatusEnum getCreationStatus() {
    return creationStatus;
  }
  public void setCreationStatus(CreationStatusEnum creationStatus) {
    this.creationStatus = creationStatus;
  }


  /**
   * The time-to-live in seconds for the lifetime of the Case.
   **/
  public ModelCase ttlSeconds(Integer ttlSeconds) {
    this.ttlSeconds = ttlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The time-to-live in seconds for the lifetime of the Case.")
  @JsonProperty("ttlSeconds")
  public Integer getTtlSeconds() {
    return ttlSeconds;
  }
  public void setTtlSeconds(Integer ttlSeconds) {
    this.ttlSeconds = ttlSeconds;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ModelCase _case = (ModelCase) o;

    return Objects.equals(this.id, _case.id) &&
            Objects.equals(this.name, _case.name) &&
            Objects.equals(this.division, _case.division) &&
            Objects.equals(this.version, _case.version) &&
            Objects.equals(this.reference, _case.reference) &&
            Objects.equals(this.caseplan, _case.caseplan) &&
            Objects.equals(this.summary, _case.summary) &&
            Objects.equals(this.owner, _case.owner) &&
            Objects.equals(this.status, _case.status) &&
            Objects.equals(this.priority, _case.priority) &&
            Objects.equals(this.dateDue, _case.dateDue) &&
            Objects.equals(this.dateStarted, _case.dateStarted) &&
            Objects.equals(this.dateClosed, _case.dateClosed) &&
            Objects.equals(this.dateCreated, _case.dateCreated) &&
            Objects.equals(this.dateModified, _case.dateModified) &&
            Objects.equals(this.modifiedBy, _case.modifiedBy) &&
            Objects.equals(this.externalContact, _case.externalContact) &&
            Objects.equals(this.customerIntent, _case.customerIntent) &&
            Objects.equals(this.creationStatus, _case.creationStatus) &&
            Objects.equals(this.ttlSeconds, _case.ttlSeconds) &&
            Objects.equals(this.selfUri, _case.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, version, reference, caseplan, summary, owner, status, priority, dateDue, dateStarted, dateClosed, dateCreated, dateModified, modifiedBy, externalContact, customerIntent, creationStatus, ttlSeconds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ModelCase {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    caseplan: ").append(toIndentedString(caseplan)).append("\n");
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    dateDue: ").append(toIndentedString(dateDue)).append("\n");
    sb.append("    dateStarted: ").append(toIndentedString(dateStarted)).append("\n");
    sb.append("    dateClosed: ").append(toIndentedString(dateClosed)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    externalContact: ").append(toIndentedString(externalContact)).append("\n");
    sb.append("    customerIntent: ").append(toIndentedString(customerIntent)).append("\n");
    sb.append("    creationStatus: ").append(toIndentedString(creationStatus)).append("\n");
    sb.append("    ttlSeconds: ").append(toIndentedString(ttlSeconds)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
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

