package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.GDPRSubject;
import com.mypurecloud.sdk.v2.model.ReplacementTerm;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * GDPRRequest
 */

public class GDPRRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private DomainEntityRef createdBy = null;
  private List<ReplacementTerm> replacementTerms = new ArrayList<ReplacementTerm>();

  private static class RequestTypeEnumDeserializer extends StdDeserializer<RequestTypeEnum> {
    public RequestTypeEnumDeserializer() {
      super(RequestTypeEnumDeserializer.class);
    }

    @Override
    public RequestTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return RequestTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of GDPR request
   */
 @JsonDeserialize(using = RequestTypeEnumDeserializer.class)
  public enum RequestTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    GDPR_EXPORT("GDPR_EXPORT"),
    GDPR_UPDATE("GDPR_UPDATE"),
    GDPR_DELETE("GDPR_DELETE");

    private String value;

    RequestTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static RequestTypeEnum fromString(String key) {
      if (key == null) return null;

      for (RequestTypeEnum value : RequestTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return RequestTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private RequestTypeEnum requestType = null;
  private Date createdDate = null;

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
   * The status of the request
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    INITIATED("INITIATED"),
    SEARCHING("SEARCHING"),
    UPDATING("UPDATING"),
    DELETING("DELETING"),
    COMPLETED("COMPLETED"),
    ERROR("ERROR"),
    FINALIZING("FINALIZING");

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
  private GDPRSubject subject = null;
  private String resultsUrl = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   **/
  public GDPRRequest name(String name) {
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

  
  @ApiModelProperty(example = "null", required = true, value = "The user that created this request")
  @JsonProperty("createdBy")
  public DomainEntityRef getCreatedBy() {
    return createdBy;
  }

  
  /**
   * The replacement terms for the provided search terms, in the case of a GDPR_UPDATE request
   **/
  public GDPRRequest replacementTerms(List<ReplacementTerm> replacementTerms) {
    this.replacementTerms = replacementTerms;
    return this;
  }
  
  @ApiModelProperty(example = "[ { \"type\": \"EMAIL\": \"existingValue\": \"personal.email@domain.com\", \"updatedValue\": \"updated.personal.email@domain.com\" } ]", value = "The replacement terms for the provided search terms, in the case of a GDPR_UPDATE request")
  @JsonProperty("replacementTerms")
  public List<ReplacementTerm> getReplacementTerms() {
    return replacementTerms;
  }
  public void setReplacementTerms(List<ReplacementTerm> replacementTerms) {
    this.replacementTerms = replacementTerms;
  }

  
  /**
   * The type of GDPR request
   **/
  public GDPRRequest requestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of GDPR request")
  @JsonProperty("requestType")
  public RequestTypeEnum getRequestType() {
    return requestType;
  }
  public void setRequestType(RequestTypeEnum requestType) {
    this.requestType = requestType;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "When the request was submitted. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("createdDate")
  public Date getCreatedDate() {
    return createdDate;
  }

  
  @ApiModelProperty(example = "null", required = true, value = "The status of the request")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }

  
  /**
   * The subject of the GDPR request
   **/
  public GDPRRequest subject(GDPRSubject subject) {
    this.subject = subject;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The subject of the GDPR request")
  @JsonProperty("subject")
  public GDPRSubject getSubject() {
    return subject;
  }
  public void setSubject(GDPRSubject subject) {
    this.subject = subject;
  }

  
  @ApiModelProperty(example = "null", value = "The location where the results of the request can be retrieved")
  @JsonProperty("resultsUrl")
  public String getResultsUrl() {
    return resultsUrl;
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
    GDPRRequest gDPRRequest = (GDPRRequest) o;
    return Objects.equals(this.id, gDPRRequest.id) &&
        Objects.equals(this.name, gDPRRequest.name) &&
        Objects.equals(this.createdBy, gDPRRequest.createdBy) &&
        Objects.equals(this.replacementTerms, gDPRRequest.replacementTerms) &&
        Objects.equals(this.requestType, gDPRRequest.requestType) &&
        Objects.equals(this.createdDate, gDPRRequest.createdDate) &&
        Objects.equals(this.status, gDPRRequest.status) &&
        Objects.equals(this.subject, gDPRRequest.subject) &&
        Objects.equals(this.resultsUrl, gDPRRequest.resultsUrl) &&
        Objects.equals(this.selfUri, gDPRRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, createdBy, replacementTerms, requestType, createdDate, status, subject, resultsUrl, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GDPRRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    replacementTerms: ").append(toIndentedString(replacementTerms)).append("\n");
    sb.append("    requestType: ").append(toIndentedString(requestType)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    resultsUrl: ").append(toIndentedString(resultsUrl)).append("\n");
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

