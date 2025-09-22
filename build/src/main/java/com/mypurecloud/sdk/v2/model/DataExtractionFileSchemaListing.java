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
import com.mypurecloud.sdk.v2.model.DataExtractionFileSchema;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * DataExtractionFileSchemaListing
 */

public class DataExtractionFileSchemaListing  implements Serializable {
  
  private List<DataExtractionFileSchema> entities = null;
  private String nextUri = null;
  private String selfUri = null;
  private String previousUri = null;
  private List<String> enabledDataSchemas = null;
  private ErrorBody errors = null;

  public DataExtractionFileSchemaListing() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      entities = new ArrayList<DataExtractionFileSchema>();
      enabledDataSchemas = new ArrayList<String>();
    }
  }

  
  /**
   **/
  public DataExtractionFileSchemaListing entities(List<DataExtractionFileSchema> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("entities")
  public List<DataExtractionFileSchema> getEntities() {
    return entities;
  }
  public void setEntities(List<DataExtractionFileSchema> entities) {
    this.entities = entities;
  }


  /**
   **/
  public DataExtractionFileSchemaListing nextUri(String nextUri) {
    this.nextUri = nextUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("nextUri")
  public String getNextUri() {
    return nextUri;
  }
  public void setNextUri(String nextUri) {
    this.nextUri = nextUri;
  }


  /**
   **/
  public DataExtractionFileSchemaListing selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  /**
   **/
  public DataExtractionFileSchemaListing previousUri(String previousUri) {
    this.previousUri = previousUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("previousUri")
  public String getPreviousUri() {
    return previousUri;
  }
  public void setPreviousUri(String previousUri) {
    this.previousUri = previousUri;
  }


  /**
   * The data schemas that are enabled for extraction
   **/
  public DataExtractionFileSchemaListing enabledDataSchemas(List<String> enabledDataSchemas) {
    this.enabledDataSchemas = enabledDataSchemas;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The data schemas that are enabled for extraction")
  @JsonProperty("enabledDataSchemas")
  public List<String> getEnabledDataSchemas() {
    return enabledDataSchemas;
  }
  public void setEnabledDataSchemas(List<String> enabledDataSchemas) {
    this.enabledDataSchemas = enabledDataSchemas;
  }


  /**
   **/
  public DataExtractionFileSchemaListing errors(ErrorBody errors) {
    this.errors = errors;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("errors")
  public ErrorBody getErrors() {
    return errors;
  }
  public void setErrors(ErrorBody errors) {
    this.errors = errors;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DataExtractionFileSchemaListing dataExtractionFileSchemaListing = (DataExtractionFileSchemaListing) o;

    return Objects.equals(this.entities, dataExtractionFileSchemaListing.entities) &&
            Objects.equals(this.nextUri, dataExtractionFileSchemaListing.nextUri) &&
            Objects.equals(this.selfUri, dataExtractionFileSchemaListing.selfUri) &&
            Objects.equals(this.previousUri, dataExtractionFileSchemaListing.previousUri) &&
            Objects.equals(this.enabledDataSchemas, dataExtractionFileSchemaListing.enabledDataSchemas) &&
            Objects.equals(this.errors, dataExtractionFileSchemaListing.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entities, nextUri, selfUri, previousUri, enabledDataSchemas, errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DataExtractionFileSchemaListing {\n");
    
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
    sb.append("    nextUri: ").append(toIndentedString(nextUri)).append("\n");
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    previousUri: ").append(toIndentedString(previousUri)).append("\n");
    sb.append("    enabledDataSchemas: ").append(toIndentedString(enabledDataSchemas)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

