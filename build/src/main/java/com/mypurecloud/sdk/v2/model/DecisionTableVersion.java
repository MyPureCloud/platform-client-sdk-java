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
import com.mypurecloud.sdk.v2.model.DecisionTableColumns;
import com.mypurecloud.sdk.v2.model.DecisionTableContract;
import com.mypurecloud.sdk.v2.model.Division;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DecisionTableVersion
 */

public class DecisionTableVersion  implements Serializable {
  
  private String id = null;
  private String name = null;
  private Division division = null;
  private Integer version = null;

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
   * Current status of this decision table version
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    PUBLISHED("Published"),
    ERROR("Error"),
    PREPARING("Preparing"),
    SUPERSEDED("Superseded");

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
  private String description = null;
  private Integer rowCount = null;
  private String rowsUri = null;
  private Date dateCreated = null;
  private Date dateModified = null;
  private Date datePublished = null;
  private DecisionTableColumns columns = null;
  private DecisionTableContract contract = null;
  private String selfUri = null;

  public DecisionTableVersion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public DecisionTableVersion name(String name) {
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
  public DecisionTableVersion division(Division division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division to which this entity belongs.")
  @JsonProperty("division")
  public Division getDivision() {
    return division;
  }
  public void setDivision(Division division) {
    this.division = division;
  }


  /**
   * The decision table version.
   **/
  public DecisionTableVersion version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table version.")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * Current status of this decision table version
   **/
  public DecisionTableVersion status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Current status of this decision table version")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The decision table description.
   **/
  public DecisionTableVersion description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The decision table description.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The number of rows in this decision table version.
   **/
  public DecisionTableVersion rowCount(Integer rowCount) {
    this.rowCount = rowCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The number of rows in this decision table version.")
  @JsonProperty("rowCount")
  public Integer getRowCount() {
    return rowCount;
  }
  public void setRowCount(Integer rowCount) {
    this.rowCount = rowCount;
  }


  /**
   * The rows URI for this decision table version.
   **/
  public DecisionTableVersion rowsUri(String rowsUri) {
    this.rowsUri = rowsUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The rows URI for this decision table version.")
  @JsonProperty("rowsUri")
  public String getRowsUri() {
    return rowsUri;
  }
  public void setRowsUri(String rowsUri) {
    this.rowsUri = rowsUri;
  }


  @ApiModelProperty(example = "null", value = "UTC date time indicating when this decision table version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "UTC date time indicating when this decision table version was last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "UTC date time indicating when this decision table version was published. Null if never published. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("datePublished")
  public Date getDatePublished() {
    return datePublished;
  }


  /**
   * The column definitions of this decision table version.
   **/
  public DecisionTableVersion columns(DecisionTableColumns columns) {
    this.columns = columns;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The column definitions of this decision table version.")
  @JsonProperty("columns")
  public DecisionTableColumns getColumns() {
    return columns;
  }
  public void setColumns(DecisionTableColumns columns) {
    this.columns = columns;
  }


  /**
   * The contract information for this decision table version.
   **/
  public DecisionTableVersion contract(DecisionTableContract contract) {
    this.contract = contract;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The contract information for this decision table version.")
  @JsonProperty("contract")
  public DecisionTableContract getContract() {
    return contract;
  }
  public void setContract(DecisionTableContract contract) {
    this.contract = contract;
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
    DecisionTableVersion decisionTableVersion = (DecisionTableVersion) o;

    return Objects.equals(this.id, decisionTableVersion.id) &&
            Objects.equals(this.name, decisionTableVersion.name) &&
            Objects.equals(this.division, decisionTableVersion.division) &&
            Objects.equals(this.version, decisionTableVersion.version) &&
            Objects.equals(this.status, decisionTableVersion.status) &&
            Objects.equals(this.description, decisionTableVersion.description) &&
            Objects.equals(this.rowCount, decisionTableVersion.rowCount) &&
            Objects.equals(this.rowsUri, decisionTableVersion.rowsUri) &&
            Objects.equals(this.dateCreated, decisionTableVersion.dateCreated) &&
            Objects.equals(this.dateModified, decisionTableVersion.dateModified) &&
            Objects.equals(this.datePublished, decisionTableVersion.datePublished) &&
            Objects.equals(this.columns, decisionTableVersion.columns) &&
            Objects.equals(this.contract, decisionTableVersion.contract) &&
            Objects.equals(this.selfUri, decisionTableVersion.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, division, version, status, description, rowCount, rowsUri, dateCreated, dateModified, datePublished, columns, contract, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DecisionTableVersion {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    rowCount: ").append(toIndentedString(rowCount)).append("\n");
    sb.append("    rowsUri: ").append(toIndentedString(rowsUri)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    datePublished: ").append(toIndentedString(datePublished)).append("\n");
    sb.append("    columns: ").append(toIndentedString(columns)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
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

