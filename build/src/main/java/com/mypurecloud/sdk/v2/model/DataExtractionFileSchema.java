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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * DataExtractionFileSchema
 */

public class DataExtractionFileSchema  implements Serializable {
  
  private String id = null;
  private String dataSchema = null;
  private Date dateCreated = null;
  private Date dateExpires = null;

  public DataExtractionFileSchema() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The unique identifier for the file
   **/
  public DataExtractionFileSchema id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The unique identifier for the file")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   * The data schema the file belongs to
   **/
  public DataExtractionFileSchema dataSchema(String dataSchema) {
    this.dataSchema = dataSchema;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data schema the file belongs to")
  @JsonProperty("dataSchema")
  public String getDataSchema() {
    return dataSchema;
  }
  public void setDataSchema(String dataSchema) {
    this.dataSchema = dataSchema;
  }


  /**
   * The date and time when this file was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DataExtractionFileSchema dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time when this file was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The date and time when this file becomes unavailable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public DataExtractionFileSchema dateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date and time when this file becomes unavailable. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateExpires")
  public Date getDateExpires() {
    return dateExpires;
  }
  public void setDateExpires(Date dateExpires) {
    this.dateExpires = dateExpires;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExtractionFileSchema dataExtractionFileSchema = (DataExtractionFileSchema) o;

    return Objects.equals(this.id, dataExtractionFileSchema.id) &&
            Objects.equals(this.dataSchema, dataExtractionFileSchema.dataSchema) &&
            Objects.equals(this.dateCreated, dataExtractionFileSchema.dateCreated) &&
            Objects.equals(this.dateExpires, dataExtractionFileSchema.dateExpires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, dataSchema, dateCreated, dateExpires);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataExtractionFileSchema {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataSchema: ").append(toIndentedString(dataSchema)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateExpires: ").append(toIndentedString(dateExpires)).append("\n");
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

