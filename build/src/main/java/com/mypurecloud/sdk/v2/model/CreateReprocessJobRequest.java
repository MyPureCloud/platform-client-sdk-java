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
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * CreateReprocessJobRequest
 */

public class CreateReprocessJobRequest  implements Serializable {
  
  private String name = null;
  private String description = null;
  private Date dateStart = null;
  private Date dateEnd = null;
  private List<String> programs = null;

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
  private List<String> dialects = null;

  public CreateReprocessJobRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      programs = new ArrayList<String>();
      mediaTypes = new ArrayList<MediaTypesEnum>();
      dialects = new ArrayList<String>();
    }
  }

  
  /**
   * The name given for the job.
   **/
  public CreateReprocessJobRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name given for the job.")
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
  public CreateReprocessJobRequest description(String description) {
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
   * The start date for the search criteria. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CreateReprocessJobRequest dateStart(Date dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The start date for the search criteria. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateStart")
  public Date getDateStart() {
    return dateStart;
  }
  public void setDateStart(Date dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * The end date for the search criteria. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public CreateReprocessJobRequest dateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The end date for the search criteria. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateEnd")
  public Date getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(Date dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * A list of program IDs to filter conversations by.
   **/
  public CreateReprocessJobRequest programs(List<String> programs) {
    this.programs = programs;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "A list of program IDs to filter conversations by.")
  @JsonProperty("programs")
  public List<String> getPrograms() {
    return programs;
  }
  public void setPrograms(List<String> programs) {
    this.programs = programs;
  }


  /**
   * The types of conversations to reprocess.
   **/
  public CreateReprocessJobRequest mediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The types of conversations to reprocess.")
  @JsonProperty("mediaTypes")
  public List<MediaTypesEnum> getMediaTypes() {
    return mediaTypes;
  }
  public void setMediaTypes(List<MediaTypesEnum> mediaTypes) {
    this.mediaTypes = mediaTypes;
  }


  /**
   * The dialects to filter by the conversations.
   **/
  public CreateReprocessJobRequest dialects(List<String> dialects) {
    this.dialects = dialects;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The dialects to filter by the conversations.")
  @JsonProperty("dialects")
  public List<String> getDialects() {
    return dialects;
  }
  public void setDialects(List<String> dialects) {
    this.dialects = dialects;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateReprocessJobRequest createReprocessJobRequest = (CreateReprocessJobRequest) o;

    return Objects.equals(this.name, createReprocessJobRequest.name) &&
            Objects.equals(this.description, createReprocessJobRequest.description) &&
            Objects.equals(this.dateStart, createReprocessJobRequest.dateStart) &&
            Objects.equals(this.dateEnd, createReprocessJobRequest.dateEnd) &&
            Objects.equals(this.programs, createReprocessJobRequest.programs) &&
            Objects.equals(this.mediaTypes, createReprocessJobRequest.mediaTypes) &&
            Objects.equals(this.dialects, createReprocessJobRequest.dialects);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, dateStart, dateEnd, programs, mediaTypes, dialects);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateReprocessJobRequest {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    programs: ").append(toIndentedString(programs)).append("\n");
    sb.append("    mediaTypes: ").append(toIndentedString(mediaTypes)).append("\n");
    sb.append("    dialects: ").append(toIndentedString(dialects)).append("\n");
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

