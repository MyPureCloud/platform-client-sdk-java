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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ReprocessJobResponse
 */

public class ReprocessJobResponse  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String description = null;
  private Date dateStart = null;
  private Date dateEnd = null;

  private static class MediaTypesEnumDeserializer extends StdDeserializer<MediaTypesEnum> {
    public MediaTypesEnumDeserializer() {
      super(MediaTypesEnumDeserializer.class);
    }

    @Override
    public MediaTypesEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return MediaTypesEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets mediaTypes
   */
 @JsonDeserialize(using = MediaTypesEnumDeserializer.class)
  public enum MediaTypesEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    CALL("Call"),
    CALLBACK("Callback"),
    CHAT("Chat"),
    EMAIL("Email"),
    MESSAGE("Message");

    private String value;

    MediaTypesEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static MediaTypesEnum fromString(String key) {
      if (key == null) return null;

      for (MediaTypesEnum value : MediaTypesEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return MediaTypesEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private List<MediaTypesEnum> mediaTypes = null;
  private List<String> programs = null;
  private List<String> dialects = null;
  private AddressableEntityRef createdBy = null;
  private Date dateCreated = null;

  private static class JobStatusEnumDeserializer extends StdDeserializer<JobStatusEnum> {
    public JobStatusEnumDeserializer() {
      super(JobStatusEnumDeserializer.class);
    }

    @Override
    public JobStatusEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return JobStatusEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The status of the job.
   */
 @JsonDeserialize(using = JobStatusEnumDeserializer.class)
  public enum JobStatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    QUEUED("Queued"),
    INPROGRESS("InProgress"),
    COMPLETED("Completed"),
    FAILED("Failed");

    private String value;

    JobStatusEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static JobStatusEnum fromString(String key) {
      if (key == null) return null;

      for (JobStatusEnum value : JobStatusEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return JobStatusEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private JobStatusEnum jobStatus = null;
  private Integer queueOrder = null;
  private Integer processedInteractionsCount = null;
  private Integer failedInteractionsCount = null;
  private Integer totalInteractionsCount = null;
  private String selfUri = null;

  public ReprocessJobResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      mediaTypes = new ArrayList<MediaTypesEnum>();
      programs = new ArrayList<String>();
      dialects = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public ReprocessJobResponse name(String name) {
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
   * The description of the job.
   **/
  public ReprocessJobResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The description of the job.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * The date from which the reprocessing should begin. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReprocessJobResponse dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date from which the reprocessing should begin. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The date at which the reprocessing should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReprocessJobResponse dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date at which the reprocessing should end. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Media types used to filter interactions.
   **/
  public ReprocessJobResponse mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Media types used to filter interactions.")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }


  /**
   * The mapped programs to be included in the job.
   **/
  public ReprocessJobResponse programs(List<String> programs) {
    this.programs = programs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The mapped programs to be included in the job.")
  @JsonProperty("programs")
  public List<String> getPrograms() {
    return programs;
  }
  public void setPrograms(List<String> programs) {
    this.programs = programs;
  }


  /**
   * Language dialects used to filter interactions.
   **/
  public ReprocessJobResponse dialects(List<String> dialects) {
    this.dialects = dialects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Language dialects used to filter interactions.")
  @JsonProperty("dialects")
  public List<String> getDialects() {
    return dialects;
  }
  public void setDialects(List<String> dialects) {
    this.dialects = dialects;
  }


  /**
   * The user who created the job.
   **/
  public ReprocessJobResponse createdBy(AddressableEntityRef createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The user who created the job.")
  @JsonProperty("createdBy")
  public AddressableEntityRef getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(AddressableEntityRef createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The date the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ReprocessJobResponse dateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The date the job was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }
  public void setDateCreated(Date dateCreated) {
    this.dateCreated = dateCreated;
  }


  /**
   * The status of the job.
   **/
  public ReprocessJobResponse jobStatus(JobStatusEnum jobStatus) {
    this.jobStatus = jobStatus;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The status of the job.")
  @JsonProperty("jobStatus")
  public JobStatusEnum getJobStatus() {
    return jobStatus;
  }
  public void setJobStatus(JobStatusEnum jobStatus) {
    this.jobStatus = jobStatus;
  }


  /**
   * The position of the job in the queued jobs.
   **/
  public ReprocessJobResponse queueOrder(Integer queueOrder) {
    this.queueOrder = queueOrder;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The position of the job in the queued jobs.")
  @JsonProperty("queueOrder")
  public Integer getQueueOrder() {
    return queueOrder;
  }
  public void setQueueOrder(Integer queueOrder) {
    this.queueOrder = queueOrder;
  }


  /**
   * The amount of interactions successfully reprocessed.
   **/
  public ReprocessJobResponse processedInteractionsCount(Integer processedInteractionsCount) {
    this.processedInteractionsCount = processedInteractionsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of interactions successfully reprocessed.")
  @JsonProperty("processedInteractionsCount")
  public Integer getProcessedInteractionsCount() {
    return processedInteractionsCount;
  }
  public void setProcessedInteractionsCount(Integer processedInteractionsCount) {
    this.processedInteractionsCount = processedInteractionsCount;
  }


  /**
   * The amount of failed interactions.
   **/
  public ReprocessJobResponse failedInteractionsCount(Integer failedInteractionsCount) {
    this.failedInteractionsCount = failedInteractionsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The amount of failed interactions.")
  @JsonProperty("failedInteractionsCount")
  public Integer getFailedInteractionsCount() {
    return failedInteractionsCount;
  }
  public void setFailedInteractionsCount(Integer failedInteractionsCount) {
    this.failedInteractionsCount = failedInteractionsCount;
  }


  /**
   * The amount of interactions in the job.
   **/
  public ReprocessJobResponse totalInteractionsCount(Integer totalInteractionsCount) {
    this.totalInteractionsCount = totalInteractionsCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The amount of interactions in the job.")
  @JsonProperty("totalInteractionsCount")
  public Integer getTotalInteractionsCount() {
    return totalInteractionsCount;
  }
  public void setTotalInteractionsCount(Integer totalInteractionsCount) {
    this.totalInteractionsCount = totalInteractionsCount;
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
    ReprocessJobResponse reprocessJobResponse = (ReprocessJobResponse) o;

    return Objects.equals(this.id, reprocessJobResponse.id) &&
            Objects.equals(this.name, reprocessJobResponse.name) &&
            Objects.equals(this.description, reprocessJobResponse.description) &&
            Objects.equals(this.dateStart, reprocessJobResponse.dateStart) &&
            Objects.equals(this.dateEnd, reprocessJobResponse.dateEnd) &&
            Objects.equals(this.mediaTypes, reprocessJobResponse.mediaTypes) &&
            Objects.equals(this.programs, reprocessJobResponse.programs) &&
            Objects.equals(this.dialects, reprocessJobResponse.dialects) &&
            Objects.equals(this.createdBy, reprocessJobResponse.createdBy) &&
            Objects.equals(this.dateCreated, reprocessJobResponse.dateCreated) &&
            Objects.equals(this.jobStatus, reprocessJobResponse.jobStatus) &&
            Objects.equals(this.queueOrder, reprocessJobResponse.queueOrder) &&
            Objects.equals(this.processedInteractionsCount, reprocessJobResponse.processedInteractionsCount) &&
            Objects.equals(this.failedInteractionsCount, reprocessJobResponse.failedInteractionsCount) &&
            Objects.equals(this.totalInteractionsCount, reprocessJobResponse.totalInteractionsCount) &&
            Objects.equals(this.selfUri, reprocessJobResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, dateStart, dateEnd, mediaTypes, programs, dialects, createdBy, dateCreated, jobStatus, queueOrder, processedInteractionsCount, failedInteractionsCount, totalInteractionsCount, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReprocessJobResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    dialects: ").append(toIndentedString(dialects)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
    sb.append("    queueOrder: ").append(toIndentedString(queueOrder)).append("\n");
    sb.append("    processedInteractionsCount: ").append(toIndentedString(processedInteractionsCount)).append("\n");
    sb.append("    failedInteractionsCount: ").append(toIndentedString(failedInteractionsCount)).append("\n");
    sb.append("    totalInteractionsCount: ").append(toIndentedString(totalInteractionsCount)).append("\n");
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

