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
import com.mypurecloud.sdk.v2.model.CaseplanDataSchema;
import com.mypurecloud.sdk.v2.model.CustomerIntentReference;
import com.mypurecloud.sdk.v2.model.IntakeSetting;
import com.mypurecloud.sdk.v2.model.StarrableDivision;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CaseplanCreateResponse
 */

public class CaseplanCreateResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private StarrableDivision division = null;
  private String description = null;
  private String referencePrefix = null;
  private Integer defaultDueDurationInSeconds = null;
  private Integer defaultTtlSeconds = null;
  private UserReference defaultCaseOwner = null;
  private Integer latest = null;
  private Integer published = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date datePublished = null;
  private UserReference modifiedBy = null;
  private CustomerIntentReference customerIntent = null;

  private static class VersionStateEnumDeserializer extends StdDeserializer<VersionStateEnum> {
    public VersionStateEnumDeserializer() {
      super(VersionStateEnumDeserializer.class);
    }

    @Override
    public VersionStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return VersionStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The version state of the Caseplan.
   */
 @JsonDeserialize(using = VersionStateEnumDeserializer.class)
  public enum VersionStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    COPYING("Copying"),
    DRAFT("Draft"),
    PUBLISHED("Published");

    private String value;

    VersionStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static VersionStateEnum fromString(String key) {
      if (key == null) return null;

      for (VersionStateEnum value : VersionStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return VersionStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private VersionStateEnum versionState = null;
  private List<CaseplanDataSchema> dataSchemas = null;
  private List<IntakeSetting> intakeSettings = null;
  private String selfUri = null;

  public CaseplanCreateResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      dataSchemas = new ArrayList<CaseplanDataSchema>();
      intakeSettings = new ArrayList<IntakeSetting>();
    }
  }

  public CaseplanCreateResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      dataSchemas = new ArrayList<CaseplanDataSchema>();
      intakeSettings = new ArrayList<IntakeSetting>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The name of the Caseplan.
   **/
  public CaseplanCreateResponse name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the Caseplan.")
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
  public CaseplanCreateResponse division(StarrableDivision division) {
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
   * The description of the Caseplan.
   **/
  public CaseplanCreateResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the Caseplan.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The prefix used when creating the reference for Cases from the Caseplan.
   **/
  public CaseplanCreateResponse referencePrefix(String referencePrefix) {
    this.referencePrefix = referencePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The prefix used when creating the reference for Cases from the Caseplan.")
  @JsonProperty("referencePrefix")
  public String getReferencePrefix() {
    return referencePrefix;
  }
  public void setReferencePrefix(String referencePrefix) {
    this.referencePrefix = referencePrefix;
  }


  /**
   * The default due duration in seconds for Cases created from the Caseplan.
   **/
  public CaseplanCreateResponse defaultDueDurationInSeconds(Integer defaultDueDurationInSeconds) {
    this.defaultDueDurationInSeconds = defaultDueDurationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default due duration in seconds for Cases created from the Caseplan.")
  @JsonProperty("defaultDueDurationInSeconds")
  public Integer getDefaultDueDurationInSeconds() {
    return defaultDueDurationInSeconds;
  }
  public void setDefaultDueDurationInSeconds(Integer defaultDueDurationInSeconds) {
    this.defaultDueDurationInSeconds = defaultDueDurationInSeconds;
  }


  /**
   * The default TTL in seconds for Cases created from the Caseplan.
   **/
  public CaseplanCreateResponse defaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default TTL in seconds for Cases created from the Caseplan.")
  @JsonProperty("defaultTtlSeconds")
  public Integer getDefaultTtlSeconds() {
    return defaultTtlSeconds;
  }
  public void setDefaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
  }


  /**
   * The default case owner for Cases created from the Caseplan.
   **/
  public CaseplanCreateResponse defaultCaseOwner(UserReference defaultCaseOwner) {
    this.defaultCaseOwner = defaultCaseOwner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default case owner for Cases created from the Caseplan.")
  @JsonProperty("defaultCaseOwner")
  public UserReference getDefaultCaseOwner() {
    return defaultCaseOwner;
  }
  public void setDefaultCaseOwner(UserReference defaultCaseOwner) {
    this.defaultCaseOwner = defaultCaseOwner;
  }


  /**
   * The latest version of the Caseplan.
   **/
  public CaseplanCreateResponse latest(Integer latest) {
    this.latest = latest;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The latest version of the Caseplan.")
  @JsonProperty("latest")
  public Integer getLatest() {
    return latest;
  }
  public void setLatest(Integer latest) {
    this.latest = latest;
  }


  /**
   * The published version of the Caseplan.
   **/
  public CaseplanCreateResponse published(Integer published) {
    this.published = published;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The published version of the Caseplan.")
  @JsonProperty("published")
  public Integer getPublished() {
    return published;
  }
  public void setPublished(Integer published) {
    this.published = published;
  }


  /**
   * The Caseplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CaseplanCreateResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Caseplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The Caseplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CaseplanCreateResponse dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Caseplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The Caseplan publication date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CaseplanCreateResponse datePublished(Date datePublished) {
    this.datePublished = datePublished;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Caseplan publication date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }
  public void setDatePublished(Date datePublished) {
    this.datePublished = datePublished;
  }


  /**
   * The id of the User who modified the Caseplan.
   **/
  public CaseplanCreateResponse modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the User who modified the Caseplan.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The customer intent for the Cases created from the caseplan.
   **/
  public CaseplanCreateResponse customerIntent(CustomerIntentReference customerIntent) {
    this.customerIntent = customerIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The customer intent for the Cases created from the caseplan.")
  @JsonProperty("customerIntent")
  public CustomerIntentReference getCustomerIntent() {
    return customerIntent;
  }
  public void setCustomerIntent(CustomerIntentReference customerIntent) {
    this.customerIntent = customerIntent;
  }


  /**
   * The version state of the Caseplan.
   **/
  public CaseplanCreateResponse versionState(VersionStateEnum versionState) {
    this.versionState = versionState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The version state of the Caseplan.")
  @JsonProperty("versionState")
  public VersionStateEnum getVersionState() {
    return versionState;
  }
  public void setVersionState(VersionStateEnum versionState) {
    this.versionState = versionState;
  }


  /**
   * The schemas that define all data for cases from this Caseplan.
   **/
  public CaseplanCreateResponse dataSchemas(List<CaseplanDataSchema> dataSchemas) {
    this.dataSchemas = dataSchemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The schemas that define all data for cases from this Caseplan.")
  @JsonProperty("dataSchemas")
  public List<CaseplanDataSchema> getDataSchemas() {
    return dataSchemas;
  }
  public void setDataSchemas(List<CaseplanDataSchema> dataSchemas) {
    this.dataSchemas = dataSchemas;
  }


  /**
   * The intake format when collecting data for a case from this caseplan.
   **/
  public CaseplanCreateResponse intakeSettings(List<IntakeSetting> intakeSettings) {
    this.intakeSettings = intakeSettings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The intake format when collecting data for a case from this caseplan.")
  @JsonProperty("intakeSettings")
  public List<IntakeSetting> getIntakeSettings() {
    return intakeSettings;
  }
  public void setIntakeSettings(List<IntakeSetting> intakeSettings) {
    this.intakeSettings = intakeSettings;
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
    CaseplanCreateResponse caseplanCreateResponse = (CaseplanCreateResponse) o;

    return Objects.equals(this.id, caseplanCreateResponse.id) &&
            Objects.equals(this.name, caseplanCreateResponse.name) &&
            Objects.equals(this.division, caseplanCreateResponse.division) &&
            Objects.equals(this.description, caseplanCreateResponse.description) &&
            Objects.equals(this.referencePrefix, caseplanCreateResponse.referencePrefix) &&
            Objects.equals(this.defaultDueDurationInSeconds, caseplanCreateResponse.defaultDueDurationInSeconds) &&
            Objects.equals(this.defaultTtlSeconds, caseplanCreateResponse.defaultTtlSeconds) &&
            Objects.equals(this.defaultCaseOwner, caseplanCreateResponse.defaultCaseOwner) &&
            Objects.equals(this.latest, caseplanCreateResponse.latest) &&
            Objects.equals(this.published, caseplanCreateResponse.published) &&
            Objects.equals(this.dateCreated, caseplanCreateResponse.dateCreated) &&
            Objects.equals(this.dateModified, caseplanCreateResponse.dateModified) &&
            Objects.equals(this.datePublished, caseplanCreateResponse.datePublished) &&
            Objects.equals(this.modifiedBy, caseplanCreateResponse.modifiedBy) &&
            Objects.equals(this.customerIntent, caseplanCreateResponse.customerIntent) &&
            Objects.equals(this.versionState, caseplanCreateResponse.versionState) &&
            Objects.equals(this.dataSchemas, caseplanCreateResponse.dataSchemas) &&
            Objects.equals(this.intakeSettings, caseplanCreateResponse.intakeSettings) &&
            Objects.equals(this.selfUri, caseplanCreateResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, referencePrefix, defaultDueDurationInSeconds, defaultTtlSeconds, defaultCaseOwner, latest, published, dateCreated, dateModified, datePublished, modifiedBy, customerIntent, versionState, dataSchemas, intakeSettings, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseplanCreateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    referencePrefix: ").append(toIndentedString(referencePrefix)).append("\n");
    sb.append("    defaultDueDurationInSeconds: ").append(toIndentedString(defaultDueDurationInSeconds)).append("\n");
    sb.append("    defaultTtlSeconds: ").append(toIndentedString(defaultTtlSeconds)).append("\n");
    sb.append("    defaultCaseOwner: ").append(toIndentedString(defaultCaseOwner)).append("\n");
    sb.append("    latest: ").append(toIndentedString(latest)).append("\n");
    sb.append("    published: ").append(toIndentedString(published)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    customerIntent: ").append(toIndentedString(customerIntent)).append("\n");
    sb.append("    versionState: ").append(toIndentedString(versionState)).append("\n");
    sb.append("    dataSchemas: ").append(toIndentedString(dataSchemas)).append("\n");
    sb.append("    intakeSettings: ").append(toIndentedString(intakeSettings)).append("\n");
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

