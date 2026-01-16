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
import com.mypurecloud.sdk.v2.model.ContactEnrichOptions;
import com.mypurecloud.sdk.v2.model.ContactIdentifier;
import com.mypurecloud.sdk.v2.model.EnrichFieldRules;
import com.mypurecloud.sdk.v2.model.ExternalContact;
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContactEnrichRequest
 */

public class ContactEnrichRequest  implements Serializable {
  
  private String id = null;
  private WritableStarrableDivision division = null;
  private List<ContactIdentifier> matchingIdentifiers = null;

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
   * The action that should be taken based on any Contacts found by `matchingIdentifiers`.
   */
 @JsonDeserialize(using = ActionEnumDeserializer.class)
  public enum ActionEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MERGE("Merge"),
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
  private ExternalContact contact = null;
  private EnrichFieldRules fieldRules = null;
  private ContactEnrichOptions options = null;

  public ContactEnrichRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      matchingIdentifiers = new ArrayList<ContactIdentifier>();
    }
  }

  
  /**
   * A user-specified tracker string, only useful in the Bulk-Enrich API. If one Bulk-Enrich operation in a request fails, the requested operation will be repeated in the Bulk API response, including this id field, allowing associating of request and response operations.
   **/
  public ContactEnrichRequest id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A user-specified tracker string, only useful in the Bulk-Enrich API. If one Bulk-Enrich operation in a request fails, the requested operation will be repeated in the Bulk API response, including this id field, allowing associating of request and response operations.")
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
  public ContactEnrichRequest division(WritableStarrableDivision division) {
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
   * An ordered list of one or more Identifiers which might each be claimed by a Contact. `action` describes what to do with any possibly matching Contacts. Identifier lookups will occur in the order specified here. Between 1 and 25.
   **/
  public ContactEnrichRequest matchingIdentifiers(List<ContactIdentifier> matchingIdentifiers) {
    this.matchingIdentifiers = matchingIdentifiers;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "An ordered list of one or more Identifiers which might each be claimed by a Contact. `action` describes what to do with any possibly matching Contacts. Identifier lookups will occur in the order specified here. Between 1 and 25.")
  @JsonProperty("matchingIdentifiers")
  public List<ContactIdentifier> getMatchingIdentifiers() {
    return matchingIdentifiers;
  }
  public void setMatchingIdentifiers(List<ContactIdentifier> matchingIdentifiers) {
    this.matchingIdentifiers = matchingIdentifiers;
  }


  /**
   * The action that should be taken based on any Contacts found by `matchingIdentifiers`.
   **/
  public ContactEnrichRequest action(ActionEnum action) {
    this.action = action;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The action that should be taken based on any Contacts found by `matchingIdentifiers`.")
  @JsonProperty("action")
  public ActionEnum getAction() {
    return action;
  }
  public void setAction(ActionEnum action) {
    this.action = action;
  }


  /**
   * Data to be added, either as an update to an existing Contact or the body of a new Contact. Omitting a field in this contract means that it will be treated as null in the `fieldRules` logic.
   **/
  public ContactEnrichRequest contact(ExternalContact contact) {
    this.contact = contact;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Data to be added, either as an update to an existing Contact or the body of a new Contact. Omitting a field in this contract means that it will be treated as null in the `fieldRules` logic.")
  @JsonProperty("contact")
  public ExternalContact getContact() {
    return contact;
  }
  public void setContact(ExternalContact contact) {
    this.contact = contact;
  }


  /**
   * Logic describing how to combine data from the submitted request with data found in the database.
   **/
  public ContactEnrichRequest fieldRules(EnrichFieldRules fieldRules) {
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


  /**
   * Additional options modifying the behavior of the API operation.
   **/
  public ContactEnrichRequest options(ContactEnrichOptions options) {
    this.options = options;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Additional options modifying the behavior of the API operation.")
  @JsonProperty("options")
  public ContactEnrichOptions getOptions() {
    return options;
  }
  public void setOptions(ContactEnrichOptions options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactEnrichRequest contactEnrichRequest = (ContactEnrichRequest) o;

    return Objects.equals(this.id, contactEnrichRequest.id) &&
            Objects.equals(this.division, contactEnrichRequest.division) &&
            Objects.equals(this.matchingIdentifiers, contactEnrichRequest.matchingIdentifiers) &&
            Objects.equals(this.action, contactEnrichRequest.action) &&
            Objects.equals(this.contact, contactEnrichRequest.contact) &&
            Objects.equals(this.fieldRules, contactEnrichRequest.fieldRules) &&
            Objects.equals(this.options, contactEnrichRequest.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, matchingIdentifiers, action, contact, fieldRules, options);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactEnrichRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    matchingIdentifiers: ").append(toIndentedString(matchingIdentifiers)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    fieldRules: ").append(toIndentedString(fieldRules)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

