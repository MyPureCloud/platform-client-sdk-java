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
import com.mypurecloud.sdk.v2.model.EnrichFieldRules;
import com.mypurecloud.sdk.v2.model.ExternalOrganization;
import com.mypurecloud.sdk.v2.model.ExternalOrganizationIdentifier;
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ExternalOrganizationEnrichRequest
 */

public class ExternalOrganizationEnrichRequest  implements Serializable {
  
  private String id = null;
  private WritableStarrableDivision division = null;
  private List<ExternalOrganizationIdentifier> matchingIdentifiers = null;

  private static class ActionEnumDeserializer extends StdDeserializer<ActionEnum> {
    public ActionEnumDeserializer() {
      super(ActionEnumDeserializer.class);
    }

    @Override
    public ActionEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return ActionEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The action that should be taken based on any External Organization found by `matchingIdentifiers`.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPSERT("Upsert"),
    UPDATE("Update"),
    INSERT("Insert");

    private String value;

    ActionEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static ActionEnum fromString(String key) {
      if (key == null) return null;

      for (ActionEnum value : ActionEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return ActionEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private ActionEnum action = null;
  private ExternalOrganization externalOrganization = null;
  private EnrichFieldRules fieldRules = null;
  private String selfUri = null;

  public ExternalOrganizationEnrichRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      matchingIdentifiers = new ArrayList<ExternalOrganizationIdentifier>();
    }
  }

  
  /**
   * A user-specified tracker string, only useful in the Bulk-Enrich API. If one Bulk-Enrich operation in a request fails, the requested operation will be repeated in the Bulk API response, including this id field, allowing associating request and response operations.
   **/
  public ExternalOrganizationEnrichRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A user-specified tracker string, only useful in the Bulk-Enrich API. If one Bulk-Enrich operation in a request fails, the requested operation will be repeated in the Bulk API response, including this id field, allowing associating request and response operations.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The division to which this entity belongs.
   **/
  public ExternalOrganizationEnrichRequest division(WritableStarrableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public WritableStarrableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableStarrableDivision division) {
    this.division = division;
  }


  /**
   * An ordered list of one or more Identifiers which might each be claimed by an External Organization. `action` describes what to do with any possibly matching External Organization. Identifier lookups will occur in the order specified here.
   **/
  public ExternalOrganizationEnrichRequest matchingIdentifiers(List<ExternalOrganizationIdentifier> matchingIdentifiers) {
    this.matchingIdentifiers = matchingIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "An ordered list of one or more Identifiers which might each be claimed by an External Organization. `action` describes what to do with any possibly matching External Organization. Identifier lookups will occur in the order specified here.")
  @JsonProperty("matchingIdentifiers")
  public List<ExternalOrganizationIdentifier> getMatchingIdentifiers() {
    return matchingIdentifiers;
  }
  public void setMatchingIdentifiers(List<ExternalOrganizationIdentifier> matchingIdentifiers) {
    this.matchingIdentifiers = matchingIdentifiers;
  }


  /**
   * The action that should be taken based on any External Organization found by `matchingIdentifiers`.
   **/
  public ExternalOrganizationEnrichRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The action that should be taken based on any External Organization found by `matchingIdentifiers`.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   * Data to be added, either as an update to an existing External Organization or the body of a new External Organization. Omitting a field in this contract means that it will be treated as null in the `fieldRules` logic.
   **/
  public ExternalOrganizationEnrichRequest externalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data to be added, either as an update to an existing External Organization or the body of a new External Organization. Omitting a field in this contract means that it will be treated as null in the `fieldRules` logic.")
  @JsonProperty("externalOrganization")
  public ExternalOrganization getExternalOrganization() {
    return externalOrganization;
  }
  public void setExternalOrganization(ExternalOrganization externalOrganization) {
    this.externalOrganization = externalOrganization;
  }


  /**
   * Logic describing how to combine data from the submitted request with data found in the database.
   **/
  public ExternalOrganizationEnrichRequest fieldRules(EnrichFieldRules fieldRules) {
    this.fieldRules = fieldRules;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Logic describing how to combine data from the submitted request with data found in the database.")
  @JsonProperty("fieldRules")
  public EnrichFieldRules getFieldRules() {
    return fieldRules;
  }
  public void setFieldRules(EnrichFieldRules fieldRules) {
    this.fieldRules = fieldRules;
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
    ExternalOrganizationEnrichRequest externalOrganizationEnrichRequest = (ExternalOrganizationEnrichRequest) o;

    return Objects.equals(this.id, externalOrganizationEnrichRequest.id) &&
            Objects.equals(this.division, externalOrganizationEnrichRequest.division) &&
            Objects.equals(this.matchingIdentifiers, externalOrganizationEnrichRequest.matchingIdentifiers) &&
            Objects.equals(this.action, externalOrganizationEnrichRequest.action) &&
            Objects.equals(this.externalOrganization, externalOrganizationEnrichRequest.externalOrganization) &&
            Objects.equals(this.fieldRules, externalOrganizationEnrichRequest.fieldRules) &&
            Objects.equals(this.selfUri, externalOrganizationEnrichRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, matchingIdentifiers, action, externalOrganization, fieldRules, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExternalOrganizationEnrichRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    matchingIdentifiers: ").append(toIndentedString(matchingIdentifiers)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    externalOrganization: ").append(toIndentedString(externalOrganization)).append("\n");
    sb.append("    fieldRules: ").append(toIndentedString(fieldRules)).append("\n");
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

