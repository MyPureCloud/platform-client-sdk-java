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
import com.mypurecloud.sdk.v2.model.WritableStarrableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * EvaluationFormDivisionView
 */

public class EvaluationFormDivisionView  implements Serializable {
  
  private String id = null;
  private String name = null;
  private WritableStarrableDivision division = null;
  private String contextId = null;
  private Date modifiedDate = null;
  private String dialect = null;
  private String selfUri = null;

  public EvaluationFormDivisionView() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public EvaluationFormDivisionView(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public EvaluationFormDivisionView name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
  public EvaluationFormDivisionView division(WritableStarrableDivision division) {
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


  @ApiModelProperty(example = "null", required = true, value = "Unique Id for all versions of this form")
  @JsonProperty("contextId")
  public String getContextId() {
    return contextId;
  }


  @ApiModelProperty(example = "null", value = "Last modified date. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("modifiedDate")
  public Date getModifiedDate() {
    return modifiedDate;
  }


  /**
   * The language dialect for this evaluation form. Supported dialects: ar, cs, da, de, en-US, es, fi, fr, fr-CA, he, hi, it, ja, ko, nl, no, pl, pt-BR, pt-PT, ru, sv, th, tr, uk, zh-CN, zh-TW
   **/
  public EvaluationFormDivisionView dialect(String dialect) {
    this.dialect = dialect;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The language dialect for this evaluation form. Supported dialects: ar, cs, da, de, en-US, es, fi, fr, fr-CA, he, hi, it, ja, ko, nl, no, pl, pt-BR, pt-PT, ru, sv, th, tr, uk, zh-CN, zh-TW")
  @JsonProperty("dialect")
  public String getDialect() {
    return dialect;
  }
  public void setDialect(String dialect) {
    this.dialect = dialect;
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
    EvaluationFormDivisionView evaluationFormDivisionView = (EvaluationFormDivisionView) o;

    return Objects.equals(this.id, evaluationFormDivisionView.id) &&
            Objects.equals(this.name, evaluationFormDivisionView.name) &&
            Objects.equals(this.division, evaluationFormDivisionView.division) &&
            Objects.equals(this.contextId, evaluationFormDivisionView.contextId) &&
            Objects.equals(this.modifiedDate, evaluationFormDivisionView.modifiedDate) &&
            Objects.equals(this.dialect, evaluationFormDivisionView.dialect) &&
            Objects.equals(this.selfUri, evaluationFormDivisionView.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, contextId, modifiedDate, dialect, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EvaluationFormDivisionView {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    contextId: ").append(toIndentedString(contextId)).append("\n");
    sb.append("    modifiedDate: ").append(toIndentedString(modifiedDate)).append("\n");
    sb.append("    dialect: ").append(toIndentedString(dialect)).append("\n");
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

