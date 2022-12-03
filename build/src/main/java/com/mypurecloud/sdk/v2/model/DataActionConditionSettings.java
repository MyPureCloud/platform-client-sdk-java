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
import com.mypurecloud.sdk.v2.model.DataActionContactColumnFieldMapping;
import com.mypurecloud.sdk.v2.model.DigitalDataActionConditionPredicate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DataActionConditionSettings
 */

public class DataActionConditionSettings  implements Serializable {
  
  private String dataActionId = null;
  private String contactIdField = null;
  private Boolean dataNotFoundResolution = null;
  private List<DigitalDataActionConditionPredicate> predicates = new ArrayList<DigitalDataActionConditionPredicate>();
  private List<DataActionContactColumnFieldMapping> contactColumnToDataActionFieldMappings = new ArrayList<DataActionContactColumnFieldMapping>();

  
  /**
   * The Data Action Id to use for this condition.
   **/
  public DataActionConditionSettings dataActionId(String dataActionId) {
    this.dataActionId = dataActionId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Data Action Id to use for this condition.")
  @JsonProperty("dataActionId")
  public String getDataActionId() {
    return dataActionId;
  }
  public void setDataActionId(String dataActionId) {
    this.dataActionId = dataActionId;
  }


  /**
   * The input field from the data action that the contactId will be passed into.
   **/
  public DataActionConditionSettings contactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The input field from the data action that the contactId will be passed into.")
  @JsonProperty("contactIdField")
  public String getContactIdField() {
    return contactIdField;
  }
  public void setContactIdField(String contactIdField) {
    this.contactIdField = contactIdField;
  }


  /**
   * The result of this condition if the data action returns a result indicating there was no data.
   **/
  public DataActionConditionSettings dataNotFoundResolution(Boolean dataNotFoundResolution) {
    this.dataNotFoundResolution = dataNotFoundResolution;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The result of this condition if the data action returns a result indicating there was no data.")
  @JsonProperty("dataNotFoundResolution")
  public Boolean getDataNotFoundResolution() {
    return dataNotFoundResolution;
  }
  public void setDataNotFoundResolution(Boolean dataNotFoundResolution) {
    this.dataNotFoundResolution = dataNotFoundResolution;
  }


  /**
   * A list of predicates defining the comparisons to use for this condition.
   **/
  public DataActionConditionSettings predicates(List<DigitalDataActionConditionPredicate> predicates) {
    this.predicates = predicates;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of predicates defining the comparisons to use for this condition.")
  @JsonProperty("predicates")
  public List<DigitalDataActionConditionPredicate> getPredicates() {
    return predicates;
  }
  public void setPredicates(List<DigitalDataActionConditionPredicate> predicates) {
    this.predicates = predicates;
  }


  /**
   * A list of mappings defining which contact data fields will be passed to which data action input fields.
   **/
  public DataActionConditionSettings contactColumnToDataActionFieldMappings(List<DataActionContactColumnFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "A list of mappings defining which contact data fields will be passed to which data action input fields.")
  @JsonProperty("contactColumnToDataActionFieldMappings")
  public List<DataActionContactColumnFieldMapping> getContactColumnToDataActionFieldMappings() {
    return contactColumnToDataActionFieldMappings;
  }
  public void setContactColumnToDataActionFieldMappings(List<DataActionContactColumnFieldMapping> contactColumnToDataActionFieldMappings) {
    this.contactColumnToDataActionFieldMappings = contactColumnToDataActionFieldMappings;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataActionConditionSettings dataActionConditionSettings = (DataActionConditionSettings) o;

    return Objects.equals(this.dataActionId, dataActionConditionSettings.dataActionId) &&
            Objects.equals(this.contactIdField, dataActionConditionSettings.contactIdField) &&
            Objects.equals(this.dataNotFoundResolution, dataActionConditionSettings.dataNotFoundResolution) &&
            Objects.equals(this.predicates, dataActionConditionSettings.predicates) &&
            Objects.equals(this.contactColumnToDataActionFieldMappings, dataActionConditionSettings.contactColumnToDataActionFieldMappings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataActionId, contactIdField, dataNotFoundResolution, predicates, contactColumnToDataActionFieldMappings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataActionConditionSettings {\n");
    
    sb.append("    dataActionId: ").append(toIndentedString(dataActionId)).append("\n");
    sb.append("    contactIdField: ").append(toIndentedString(contactIdField)).append("\n");
    sb.append("    dataNotFoundResolution: ").append(toIndentedString(dataNotFoundResolution)).append("\n");
    sb.append("    predicates: ").append(toIndentedString(predicates)).append("\n");
    sb.append("    contactColumnToDataActionFieldMappings: ").append(toIndentedString(contactColumnToDataActionFieldMappings)).append("\n");
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

