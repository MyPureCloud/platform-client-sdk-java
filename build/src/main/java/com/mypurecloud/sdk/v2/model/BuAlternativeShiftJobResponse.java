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
import com.mypurecloud.sdk.v2.model.AlternativeShiftBulkUpdateTradesResponseTemplate;
import com.mypurecloud.sdk.v2.model.AlternativeShiftOffersViewResponseTemplate;
import com.mypurecloud.sdk.v2.model.AlternativeShiftTradesViewResponseTemplate;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * BuAlternativeShiftJobResponse
 */

public class BuAlternativeShiftJobResponse  implements Serializable {
  
  private String id = null;

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
   * The status of the alternative shift job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PROCESSING("Processing"),
    COMPLETE("Complete"),
    ERROR("Error");

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

  private static class TypeEnumDeserializer extends StdDeserializer<TypeEnum> {
    public TypeEnumDeserializer() {
      super(TypeEnumDeserializer.class);
    }

    @Override
    public TypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of job
   */
 @JsonDeserialize(using = TypeEnumDeserializer.class)
  public enum TypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    LISTOFFERS("ListOffers"),
    SEARCHOFFERS("SearchOffers"),
    LISTUSERTRADES("ListUserTrades"),
    SEARCHTRADES("SearchTrades"),
    BULKUPDATETRADES("BulkUpdateTrades");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TypeEnum fromString(String key) {
      if (key == null) return null;

      for (TypeEnum value : TypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TypeEnum type = null;
  private String downloadUrl = null;
  private ErrorBody error = null;
  private AlternativeShiftOffersViewResponseTemplate viewOffersResults = null;
  private AlternativeShiftTradesViewResponseTemplate viewTradesResults = null;
  private AlternativeShiftBulkUpdateTradesResponseTemplate bulkUpdateTradesResults = null;
  private String selfUri = null;

  public BuAlternativeShiftJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The status of the alternative shift job
   **/
  public BuAlternativeShiftJobResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the alternative shift job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The type of job
   **/
  public BuAlternativeShiftJobResponse type(TypeEnum type) {
    this.type = type;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of job")
  @JsonProperty("type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }


  /**
   * The URL where completed results are available, only set if status == 'Complete'
   **/
  public BuAlternativeShiftJobResponse downloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The URL where completed results are available, only set if status == 'Complete'")
  @JsonProperty("downloadUrl")
  public String getDownloadUrl() {
    return downloadUrl;
  }
  public void setDownloadUrl(String downloadUrl) {
    this.downloadUrl = downloadUrl;
  }


  /**
   * Any error information, only set if the status == 'Error'
   **/
  public BuAlternativeShiftJobResponse error(ErrorBody error) {
    this.error = error;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Any error information, only set if the status == 'Error'")
  @JsonProperty("error")
  public ErrorBody getError() {
    return error;
  }
  public void setError(ErrorBody error) {
    this.error = error;
  }


  /**
   * Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListOffers' or 'SearchOffers'
   **/
  public BuAlternativeShiftJobResponse viewOffersResults(AlternativeShiftOffersViewResponseTemplate viewOffersResults) {
    this.viewOffersResults = viewOffersResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListOffers' or 'SearchOffers'")
  @JsonProperty("viewOffersResults")
  public AlternativeShiftOffersViewResponseTemplate getViewOffersResults() {
    return viewOffersResults;
  }
  public void setViewOffersResults(AlternativeShiftOffersViewResponseTemplate viewOffersResults) {
    this.viewOffersResults = viewOffersResults;
  }


  /**
   * Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListUserTrades' or 'SearchTrades'
   **/
  public BuAlternativeShiftJobResponse viewTradesResults(AlternativeShiftTradesViewResponseTemplate viewTradesResults) {
    this.viewTradesResults = viewTradesResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing data returned from the downloadUrl. Use if type == 'ListUserTrades' or 'SearchTrades'")
  @JsonProperty("viewTradesResults")
  public AlternativeShiftTradesViewResponseTemplate getViewTradesResults() {
    return viewTradesResults;
  }
  public void setViewTradesResults(AlternativeShiftTradesViewResponseTemplate viewTradesResults) {
    this.viewTradesResults = viewTradesResults;
  }


  /**
   * Schema template for deserializing data returned from the downloadUrl. Use if type == 'BulkUpdateTrades'
   **/
  public BuAlternativeShiftJobResponse bulkUpdateTradesResults(AlternativeShiftBulkUpdateTradesResponseTemplate bulkUpdateTradesResults) {
    this.bulkUpdateTradesResults = bulkUpdateTradesResults;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Schema template for deserializing data returned from the downloadUrl. Use if type == 'BulkUpdateTrades'")
  @JsonProperty("bulkUpdateTradesResults")
  public AlternativeShiftBulkUpdateTradesResponseTemplate getBulkUpdateTradesResults() {
    return bulkUpdateTradesResults;
  }
  public void setBulkUpdateTradesResults(AlternativeShiftBulkUpdateTradesResponseTemplate bulkUpdateTradesResults) {
    this.bulkUpdateTradesResults = bulkUpdateTradesResults;
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
    BuAlternativeShiftJobResponse buAlternativeShiftJobResponse = (BuAlternativeShiftJobResponse) o;

    return Objects.equals(this.id, buAlternativeShiftJobResponse.id) &&
            Objects.equals(this.status, buAlternativeShiftJobResponse.status) &&
            Objects.equals(this.type, buAlternativeShiftJobResponse.type) &&
            Objects.equals(this.downloadUrl, buAlternativeShiftJobResponse.downloadUrl) &&
            Objects.equals(this.error, buAlternativeShiftJobResponse.error) &&
            Objects.equals(this.viewOffersResults, buAlternativeShiftJobResponse.viewOffersResults) &&
            Objects.equals(this.viewTradesResults, buAlternativeShiftJobResponse.viewTradesResults) &&
            Objects.equals(this.bulkUpdateTradesResults, buAlternativeShiftJobResponse.bulkUpdateTradesResults) &&
            Objects.equals(this.selfUri, buAlternativeShiftJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, type, downloadUrl, error, viewOffersResults, viewTradesResults, bulkUpdateTradesResults, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BuAlternativeShiftJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    downloadUrl: ").append(toIndentedString(downloadUrl)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    viewOffersResults: ").append(toIndentedString(viewOffersResults)).append("\n");
    sb.append("    viewTradesResults: ").append(toIndentedString(viewTradesResults)).append("\n");
    sb.append("    bulkUpdateTradesResults: ").append(toIndentedString(bulkUpdateTradesResults)).append("\n");
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

