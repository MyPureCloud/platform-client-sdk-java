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
import com.mypurecloud.sdk.v2.model.ContestMetrics;
import com.mypurecloud.sdk.v2.model.ContestProfile;
import com.mypurecloud.sdk.v2.model.ContestRequesingParticipantDailyInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContestsEssentials
 */

public class ContestsEssentials  implements Serializable {
  
  private String id = null;
  private String title = null;

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
   * The Contest status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UPCOMING("Upcoming"),
    ONGOING("Ongoing"),
    PENDING("Pending"),
    RECENTLYCOMPLETED("RecentlyCompleted"),
    COMPLETED("Completed"),
    CANCELLED("Cancelled");

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
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;
  private ContestProfile profile = null;
  private Integer participantCount = null;
  private Date dateAnnounced = null;
  private Date dateFinalized = null;
  private Date dateCancelled = null;
  private Date dateModified = null;
  private Date dateScoresModified = null;
  private List<ContestMetrics> metrics = null;
  private ContestRequesingParticipantDailyInfo requestingParticipantContestInfo = null;
  private String selfUri = null;

  public ContestsEssentials() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<ContestMetrics>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The Contest title
   **/
  public ContestsEssentials title(String title) {
    this.title = title;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest title")
  @JsonProperty("title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }


  /**
   * The Contest status
   **/
  public ContestsEssentials status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * Start date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestsEssentials dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 00:00:00 UTC 2024", required = true, value = "Start date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateStart")
  public LocalDate getDateStart() {
    return dateStart;
  }
  public void setDateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
  }


  /**
   * End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestsEssentials dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 00:00:00 UTC 2024", required = true, value = "End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * The performance profile
   **/
  public ContestsEssentials profile(ContestProfile profile) {
    this.profile = profile;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The performance profile")
  @JsonProperty("profile")
  public ContestProfile getProfile() {
    return profile;
  }
  public void setProfile(ContestProfile profile) {
    this.profile = profile;
  }


  /**
   * The Number of participants in the contest
   **/
  public ContestsEssentials participantCount(Integer participantCount) {
    this.participantCount = participantCount;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Number of participants in the contest")
  @JsonProperty("participantCount")
  public Integer getParticipantCount() {
    return participantCount;
  }
  public void setParticipantCount(Integer participantCount) {
    this.participantCount = participantCount;
  }


  /**
   * The Contest's Announcement datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsEssentials dateAnnounced(Date dateAnnounced) {
    this.dateAnnounced = dateAnnounced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest's Announcement datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAnnounced")
  public Date getDateAnnounced() {
    return dateAnnounced;
  }
  public void setDateAnnounced(Date dateAnnounced) {
    this.dateAnnounced = dateAnnounced;
  }


  /**
   * The Contest's finalize datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsEssentials dateFinalized(Date dateFinalized) {
    this.dateFinalized = dateFinalized;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest's finalize datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateFinalized")
  public Date getDateFinalized() {
    return dateFinalized;
  }
  public void setDateFinalized(Date dateFinalized) {
    this.dateFinalized = dateFinalized;
  }


  /**
   * The Contest's cancelled datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsEssentials dateCancelled(Date dateCancelled) {
    this.dateCancelled = dateCancelled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest's cancelled datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCancelled")
  public Date getDateCancelled() {
    return dateCancelled;
  }
  public void setDateCancelled(Date dateCancelled) {
    this.dateCancelled = dateCancelled;
  }


  /**
   * The Contest's last modified datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsEssentials dateModified(Date dateModified) {
    this.dateModified = dateModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest's last modified datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }
  public void setDateModified(Date dateModified) {
    this.dateModified = dateModified;
  }


  /**
   * The datetime the contest scores were last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsEssentials dateScoresModified(Date dateScoresModified) {
    this.dateScoresModified = dateScoresModified;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The datetime the contest scores were last updated. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateScoresModified")
  public Date getDateScoresModified() {
    return dateScoresModified;
  }
  public void setDateScoresModified(Date dateScoresModified) {
    this.dateScoresModified = dateScoresModified;
  }


  /**
   * The Contest's Metrics
   **/
  public ContestsEssentials metrics(List<ContestMetrics> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest's Metrics")
  @JsonProperty("metrics")
  public List<ContestMetrics> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<ContestMetrics> metrics) {
    this.metrics = metrics;
  }


  /**
   * The Most Recent Contest Info for the requesting participant
   **/
  public ContestsEssentials requestingParticipantContestInfo(ContestRequesingParticipantDailyInfo requestingParticipantContestInfo) {
    this.requestingParticipantContestInfo = requestingParticipantContestInfo;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Most Recent Contest Info for the requesting participant")
  @JsonProperty("requestingParticipantContestInfo")
  public ContestRequesingParticipantDailyInfo getRequestingParticipantContestInfo() {
    return requestingParticipantContestInfo;
  }
  public void setRequestingParticipantContestInfo(ContestRequesingParticipantDailyInfo requestingParticipantContestInfo) {
    this.requestingParticipantContestInfo = requestingParticipantContestInfo;
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
    ContestsEssentials contestsEssentials = (ContestsEssentials) o;

    return Objects.equals(this.id, contestsEssentials.id) &&
            Objects.equals(this.title, contestsEssentials.title) &&
            Objects.equals(this.status, contestsEssentials.status) &&
            Objects.equals(this.dateStart, contestsEssentials.dateStart) &&
            Objects.equals(this.dateEnd, contestsEssentials.dateEnd) &&
            Objects.equals(this.profile, contestsEssentials.profile) &&
            Objects.equals(this.participantCount, contestsEssentials.participantCount) &&
            Objects.equals(this.dateAnnounced, contestsEssentials.dateAnnounced) &&
            Objects.equals(this.dateFinalized, contestsEssentials.dateFinalized) &&
            Objects.equals(this.dateCancelled, contestsEssentials.dateCancelled) &&
            Objects.equals(this.dateModified, contestsEssentials.dateModified) &&
            Objects.equals(this.dateScoresModified, contestsEssentials.dateScoresModified) &&
            Objects.equals(this.metrics, contestsEssentials.metrics) &&
            Objects.equals(this.requestingParticipantContestInfo, contestsEssentials.requestingParticipantContestInfo) &&
            Objects.equals(this.selfUri, contestsEssentials.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, status, dateStart, dateEnd, profile, participantCount, dateAnnounced, dateFinalized, dateCancelled, dateModified, dateScoresModified, metrics, requestingParticipantContestInfo, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestsEssentials {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    participantCount: ").append(toIndentedString(participantCount)).append("\n");
    sb.append("    dateAnnounced: ").append(toIndentedString(dateAnnounced)).append("\n");
    sb.append("    dateFinalized: ").append(toIndentedString(dateFinalized)).append("\n");
    sb.append("    dateCancelled: ").append(toIndentedString(dateCancelled)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateScoresModified: ").append(toIndentedString(dateScoresModified)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    requestingParticipantContestInfo: ").append(toIndentedString(requestingParticipantContestInfo)).append("\n");
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

