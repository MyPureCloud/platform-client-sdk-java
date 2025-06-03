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
import com.mypurecloud.sdk.v2.model.ContactImportField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContactImportSettings
 */

public class ContactImportSettings  implements Serializable {
  
  private String id = null;
  private String name = null;

  private static class MatchingCriteriaEnumDeserializer extends StdDeserializer<MatchingCriteriaEnum> {
    public MatchingCriteriaEnumDeserializer() {
      super(MatchingCriteriaEnumDeserializer.class);
    }

    @Override
    public MatchingCriteriaEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MatchingCriteriaEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets matchingCriteria
   */
 @JsonDeserialize(using = MatchingCriteriaEnumDeserializer.class)
  public enum MatchingCriteriaEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    EMAIL("Email"),
    PHONE("Phone");

    private String value;

    MatchingCriteriaEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MatchingCriteriaEnum fromString(String key) {
      if (key == null) return null;

      for (MatchingCriteriaEnum value : MatchingCriteriaEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MatchingCriteriaEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MatchingCriteriaEnum> matchingCriteria = null;
  private Boolean mergeContacts = null;
  private String externalSourceId = null;
  private List<ContactImportField> importFields = null;
  private Date dateCreated = null;
  private String selfUri = null;

  public ContactImportSettings() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      matchingCriteria = new ArrayList<MatchingCriteriaEnum>();
      importFields = new ArrayList<ContactImportField>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Display name for the settings
   **/
  public ContactImportSettings name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Display name for the settings")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Which fields you want to identity resolution based on. (e.g.: Email, Phone). It can be empty, populated only one of them or it can be both for now. The order of the items is important for identity resolution
   **/
  public ContactImportSettings matchingCriteria(List<MatchingCriteriaEnum> matchingCriteria) {
    this.matchingCriteria = matchingCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Which fields you want to identity resolution based on. (e.g.: Email, Phone). It can be empty, populated only one of them or it can be both for now. The order of the items is important for identity resolution")
  @JsonProperty("matchingCriteria")
  public List<MatchingCriteriaEnum> getMatchingCriteria() {
    return matchingCriteria;
  }
  public void setMatchingCriteria(List<MatchingCriteriaEnum> matchingCriteria) {
    this.matchingCriteria = matchingCriteria;
  }


  /**
   * Decides what happens when a record already found in the system. Action will be Upsert or Merge
   **/
  public ContactImportSettings mergeContacts(Boolean mergeContacts) {
    this.mergeContacts = mergeContacts;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Decides what happens when a record already found in the system. Action will be Upsert or Merge")
  @JsonProperty("mergeContacts")
  public Boolean getMergeContacts() {
    return mergeContacts;
  }
  public void setMergeContacts(Boolean mergeContacts) {
    this.mergeContacts = mergeContacts;
  }


  /**
   * Define the corresponding source system by the customer, the customer can have different externalId source, they can collect this id from contact service
   **/
  public ContactImportSettings externalSourceId(String externalSourceId) {
    this.externalSourceId = externalSourceId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Define the corresponding source system by the customer, the customer can have different externalId source, they can collect this id from contact service")
  @JsonProperty("externalSourceId")
  public String getExternalSourceId() {
    return externalSourceId;
  }
  public void setExternalSourceId(String externalSourceId) {
    this.externalSourceId = externalSourceId;
  }


  /**
   * Decides which field we need to send towards contact service
   **/
  public ContactImportSettings importFields(List<ContactImportField> importFields) {
    this.importFields = importFields;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Decides which field we need to send towards contact service")
  @JsonProperty("importFields")
  public List<ContactImportField> getImportFields() {
    return importFields;
  }
  public void setImportFields(List<ContactImportField> importFields) {
    this.importFields = importFields;
  }


  @ApiModelProperty(example = "null", value = "Creation date for the settings. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
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
    ContactImportSettings contactImportSettings = (ContactImportSettings) o;

    return Objects.equals(this.id, contactImportSettings.id) &&
            Objects.equals(this.name, contactImportSettings.name) &&
            Objects.equals(this.matchingCriteria, contactImportSettings.matchingCriteria) &&
            Objects.equals(this.mergeContacts, contactImportSettings.mergeContacts) &&
            Objects.equals(this.externalSourceId, contactImportSettings.externalSourceId) &&
            Objects.equals(this.importFields, contactImportSettings.importFields) &&
            Objects.equals(this.dateCreated, contactImportSettings.dateCreated) &&
            Objects.equals(this.selfUri, contactImportSettings.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, matchingCriteria, mergeContacts, externalSourceId, importFields, dateCreated, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactImportSettings {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    matchingCriteria: ").append(toIndentedString(matchingCriteria)).append("\n");
    sb.append("    mergeContacts: ").append(toIndentedString(mergeContacts)).append("\n");
    sb.append("    externalSourceId: ").append(toIndentedString(externalSourceId)).append("\n");
    sb.append("    importFields: ").append(toIndentedString(importFields)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
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

