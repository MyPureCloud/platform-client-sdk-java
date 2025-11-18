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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * The representation of a case association on a journey session.
 */
@ApiModel(description = "The representation of a case association on a journey session.")

public class JourneyCaseAssociation  implements Serializable {
  
  private String id = null;
  private String caseReference = null;
  private Date dateAssociated = null;
  private String selfUri = null;
  private AddressableEntityRef _case = null;

  public JourneyCaseAssociation() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The ID of the association.
   **/
  public JourneyCaseAssociation id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The ID of the association.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The reference for the case that was associated with the journey session.
   **/
  public JourneyCaseAssociation caseReference(String caseReference) {
    this.caseReference = caseReference;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The reference for the case that was associated with the journey session.")
  @JsonProperty("caseReference")
  public String getCaseReference() {
    return caseReference;
  }
  public void setCaseReference(String caseReference) {
    this.caseReference = caseReference;
  }


  /**
   * The date of the association. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public JourneyCaseAssociation dateAssociated(Date dateAssociated) {
    this.dateAssociated = dateAssociated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date of the association. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAssociated")
  public Date getDateAssociated() {
    return dateAssociated;
  }
  public void setDateAssociated(Date dateAssociated) {
    this.dateAssociated = dateAssociated;
  }


  @ApiModelProperty(example = "null", value = "The URI for this object")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }


  /**
   * The case that was associated with the journey session.
   **/
  public JourneyCaseAssociation _case(AddressableEntityRef _case) {
    this._case = _case;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The case that was associated with the journey session.")
  @JsonProperty("case")
  public AddressableEntityRef getCase() {
    return _case;
  }
  public void setCase(AddressableEntityRef _case) {
    this._case = _case;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyCaseAssociation journeyCaseAssociation = (JourneyCaseAssociation) o;

    return Objects.equals(this.id, journeyCaseAssociation.id) &&
            Objects.equals(this.caseReference, journeyCaseAssociation.caseReference) &&
            Objects.equals(this.dateAssociated, journeyCaseAssociation.dateAssociated) &&
            Objects.equals(this.selfUri, journeyCaseAssociation.selfUri) &&
            Objects.equals(this._case, journeyCaseAssociation._case);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, caseReference, dateAssociated, selfUri, _case);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyCaseAssociation {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    caseReference: ").append(toIndentedString(caseReference)).append("\n");
    sb.append("    dateAssociated: ").append(toIndentedString(dateAssociated)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    _case: ").append(toIndentedString(_case)).append("\n");
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

