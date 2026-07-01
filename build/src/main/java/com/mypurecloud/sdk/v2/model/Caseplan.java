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
import com.mypurecloud.sdk.v2.model.CustomerIntentReference;
import com.mypurecloud.sdk.v2.model.StarrableDivision;
import com.mypurecloud.sdk.v2.model.UserReference;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * Caseplan
 */

public class Caseplan  implements Serializable {
  
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
  private String selfUri = null;

  public Caseplan() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public Caseplan(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
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
  public Caseplan name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Caseplan.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * The division to which this Caseplan belongs.
   **/
  public Caseplan division(StarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The division to which this Caseplan belongs.")
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
  public Caseplan description(String description) {
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
  public Caseplan referencePrefix(String referencePrefix) {
    this.referencePrefix = referencePrefix;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The prefix used when creating the reference for Cases from the Caseplan.")
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
  public Caseplan defaultDueDurationInSeconds(Integer defaultDueDurationInSeconds) {
    this.defaultDueDurationInSeconds = defaultDueDurationInSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default due duration in seconds for Cases created from the Caseplan.")
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
  public Caseplan defaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The default TTL in seconds for Cases created from the Caseplan.")
  @JsonProperty("defaultTtlSeconds")
  public Integer getDefaultTtlSeconds() {
    return defaultTtlSeconds;
  }
  public void setDefaultTtlSeconds(Integer defaultTtlSeconds) {
    this.defaultTtlSeconds = defaultTtlSeconds;
  }


  /**
   * The default Case owner for Cases created from the Caseplan.
   **/
  public Caseplan defaultCaseOwner(UserReference defaultCaseOwner) {
    this.defaultCaseOwner = defaultCaseOwner;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The default Case owner for Cases created from the Caseplan.")
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
  public Caseplan latest(Integer latest) {
    this.latest = latest;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The latest version of the Caseplan.")
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
  public Caseplan published(Integer published) {
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
  public Caseplan dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Caseplan creation date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  public Caseplan dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Caseplan modification date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
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
  public Caseplan datePublished(Date datePublished) {
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
   * The ID of the User who modified the Caseplan.
   **/
  public Caseplan modifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the User who modified the Caseplan.")
  @JsonProperty("modifiedBy")
  public UserReference getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(UserReference modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   * The customer intent for Cases created from this Caseplan.
   **/
  public Caseplan customerIntent(CustomerIntentReference customerIntent) {
    this.customerIntent = customerIntent;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The customer intent for Cases created from this Caseplan.")
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
  public Caseplan versionState(VersionStateEnum versionState) {
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
    Caseplan caseplan = (Caseplan) o;

    return Objects.equals(this.id, caseplan.id) &&
            Objects.equals(this.name, caseplan.name) &&
            Objects.equals(this.division, caseplan.division) &&
            Objects.equals(this.description, caseplan.description) &&
            Objects.equals(this.referencePrefix, caseplan.referencePrefix) &&
            Objects.equals(this.defaultDueDurationInSeconds, caseplan.defaultDueDurationInSeconds) &&
            Objects.equals(this.defaultTtlSeconds, caseplan.defaultTtlSeconds) &&
            Objects.equals(this.defaultCaseOwner, caseplan.defaultCaseOwner) &&
            Objects.equals(this.latest, caseplan.latest) &&
            Objects.equals(this.published, caseplan.published) &&
            Objects.equals(this.dateCreated, caseplan.dateCreated) &&
            Objects.equals(this.dateModified, caseplan.dateModified) &&
            Objects.equals(this.datePublished, caseplan.datePublished) &&
            Objects.equals(this.modifiedBy, caseplan.modifiedBy) &&
            Objects.equals(this.customerIntent, caseplan.customerIntent) &&
            Objects.equals(this.versionState, caseplan.versionState) &&
            Objects.equals(this.selfUri, caseplan.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, description, referencePrefix, defaultDueDurationInSeconds, defaultTtlSeconds, defaultCaseOwner, latest, published, dateCreated, dateModified, datePublished, modifiedBy, customerIntent, versionState, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Caseplan {\n");
    
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

