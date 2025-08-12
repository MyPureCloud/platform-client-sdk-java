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
import com.mypurecloud.sdk.v2.model.ContestDisqualifiedAgents;
import com.mypurecloud.sdk.v2.model.ContestMetrics;
import com.mypurecloud.sdk.v2.model.ContestPrizes;
import com.mypurecloud.sdk.v2.model.ContestProfile;
import com.mypurecloud.sdk.v2.model.ContestWinners;
import com.mypurecloud.sdk.v2.model.UserReference;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContestsResponse
 */

public class ContestsResponse  implements Serializable {
  
  private String id = null;
  private WritableDivision division = null;
  private String title = null;
  private String description = null;
  private LocalDate dateStart = null;
  private LocalDate dateEnd = null;

  private static class WinningCriteriaEnumDeserializer extends StdDeserializer<WinningCriteriaEnum> {
    public WinningCriteriaEnumDeserializer() {
      super(WinningCriteriaEnumDeserializer.class);
    }

    @Override
    public WinningCriteriaEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return WinningCriteriaEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Contest winning criteria
   */
 @JsonDeserialize(using = WinningCriteriaEnumDeserializer.class)
  public enum WinningCriteriaEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    HIGHESTOVERALLSCORE("HighestOverallScore"),
    HIGHESTOVERALLPERCENTOFGOAL("HighestOverallPercentOfGoal");

    private String value;

    WinningCriteriaEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static WinningCriteriaEnum fromString(String key) {
      if (key == null) return null;

      for (WinningCriteriaEnum value : WinningCriteriaEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return WinningCriteriaEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private WinningCriteriaEnum winningCriteria = null;
  private Date dateAnnounced = null;
  private String announcementTimezone = null;

  private static class AnonymizationEnumDeserializer extends StdDeserializer<AnonymizationEnum> {
    public AnonymizationEnumDeserializer() {
      super(AnonymizationEnumDeserializer.class);
    }

    @Override
    public AnonymizationEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AnonymizationEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The Contest anonymization
   */
 @JsonDeserialize(using = AnonymizationEnumDeserializer.class)
  public enum AnonymizationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    NOANONYMIZATION("NoAnonymization"),
    ALL("All"),
    ALLEXCEPTTOP("AllExceptTop");

    private String value;

    AnonymizationEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AnonymizationEnum fromString(String key) {
      if (key == null) return null;

      for (AnonymizationEnum value : AnonymizationEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AnonymizationEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AnonymizationEnum anonymization = null;
  private List<ContestMetrics> metrics = null;
  private List<ContestPrizes> prizes = null;
  private Integer version = null;
  private UserReference createdBy = null;
  private ContestProfile profile = null;
  private List<UserReference> participants = null;

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
  private Integer participantCount = null;
  private Date dateFinalized = null;
  private Date dateCancelled = null;
  private Date dateModified = null;
  private Date dateScoresModified = null;
  private List<ContestWinners> winners = null;
  private List<ContestDisqualifiedAgents> disqualifiedAgents = null;
  private String selfUri = null;

  public ContestsResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<ContestMetrics>();
      prizes = new ArrayList<ContestPrizes>();
      participants = new ArrayList<UserReference>();
      winners = new ArrayList<ContestWinners>();
      disqualifiedAgents = new ArrayList<ContestDisqualifiedAgents>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The division for this performance profile associate to
   **/
  public ContestsResponse division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division for this performance profile associate to")
  @JsonProperty("division")
  public WritableDivision getDivision() {
    return division;
  }
  public void setDivision(WritableDivision division) {
    this.division = division;
  }


  /**
   * The Contest title
   **/
  public ContestsResponse title(String title) {
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
   * The Contest description
   **/
  public ContestsResponse description(String description) {
    this.description = description;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest description")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Start date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestsResponse dateStart(LocalDate dateStart) {
    this.dateStart = dateStart;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 01:00:00 CET 2024", required = true, value = "Start date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
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
  public ContestsResponse dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "Fri Jan 12 01:00:00 CET 2024", required = true, value = "End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * The Contest winning criteria
   **/
  public ContestsResponse winningCriteria(WinningCriteriaEnum winningCriteria) {
    this.winningCriteria = winningCriteria;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest winning criteria")
  @JsonProperty("winningCriteria")
  public WinningCriteriaEnum getWinningCriteria() {
    return winningCriteria;
  }
  public void setWinningCriteria(WinningCriteriaEnum winningCriteria) {
    this.winningCriteria = winningCriteria;
  }


  /**
   * The Contest's Announcement Datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsResponse dateAnnounced(Date dateAnnounced) {
    this.dateAnnounced = dateAnnounced;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest's Announcement Datetime. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateAnnounced")
  public Date getDateAnnounced() {
    return dateAnnounced;
  }
  public void setDateAnnounced(Date dateAnnounced) {
    this.dateAnnounced = dateAnnounced;
  }


  /**
   * The Contest's Announcement Timezone. Valid values are strings of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London
   **/
  public ContestsResponse announcementTimezone(String announcementTimezone) {
    this.announcementTimezone = announcementTimezone;
    return this;
  }
  
  @ApiModelProperty(example = "Europe/London", required = true, value = "The Contest's Announcement Timezone. Valid values are strings of the zone name as found in the IANA time zone database. For example: UTC, Etc/UTC, or Europe/London")
  @JsonProperty("announcementTimezone")
  public String getAnnouncementTimezone() {
    return announcementTimezone;
  }
  public void setAnnouncementTimezone(String announcementTimezone) {
    this.announcementTimezone = announcementTimezone;
  }


  /**
   * The Contest anonymization
   **/
  public ContestsResponse anonymization(AnonymizationEnum anonymization) {
    this.anonymization = anonymization;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest anonymization")
  @JsonProperty("anonymization")
  public AnonymizationEnum getAnonymization() {
    return anonymization;
  }
  public void setAnonymization(AnonymizationEnum anonymization) {
    this.anonymization = anonymization;
  }


  /**
   * The Contest's Metrics
   **/
  public ContestsResponse metrics(List<ContestMetrics> metrics) {
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
   * The Contest Prizes
   **/
  public ContestsResponse prizes(List<ContestPrizes> prizes) {
    this.prizes = prizes;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest Prizes")
  @JsonProperty("prizes")
  public List<ContestPrizes> getPrizes() {
    return prizes;
  }
  public void setPrizes(List<ContestPrizes> prizes) {
    this.prizes = prizes;
  }


  /**
   * The Contest Version
   **/
  public ContestsResponse version(Integer version) {
    this.version = version;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Version")
  @JsonProperty("version")
  public Integer getVersion() {
    return version;
  }
  public void setVersion(Integer version) {
    this.version = version;
  }


  /**
   * The creator of the contest
   **/
  public ContestsResponse createdBy(UserReference createdBy) {
    this.createdBy = createdBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The creator of the contest")
  @JsonProperty("createdBy")
  public UserReference getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(UserReference createdBy) {
    this.createdBy = createdBy;
  }


  /**
   * The performance profile
   **/
  public ContestsResponse profile(ContestProfile profile) {
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
   * The Contest's participants
   **/
  public ContestsResponse participants(List<UserReference> participants) {
    this.participants = participants;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest's participants")
  @JsonProperty("participants")
  public List<UserReference> getParticipants() {
    return participants;
  }
  public void setParticipants(List<UserReference> participants) {
    this.participants = participants;
  }


  /**
   * The Contest status
   **/
  public ContestsResponse status(StatusEnum status) {
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
   * The Number of participants in the contest
   **/
  public ContestsResponse participantCount(Integer participantCount) {
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
   * The Contest's finalize datetime, returned when a contest is complete. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z
   **/
  public ContestsResponse dateFinalized(Date dateFinalized) {
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
  public ContestsResponse dateCancelled(Date dateCancelled) {
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
  public ContestsResponse dateModified(Date dateModified) {
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
  public ContestsResponse dateScoresModified(Date dateScoresModified) {
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
   * The Contest Winners
   **/
  public ContestsResponse winners(List<ContestWinners> winners) {
    this.winners = winners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest Winners")
  @JsonProperty("winners")
  public List<ContestWinners> getWinners() {
    return winners;
  }
  public void setWinners(List<ContestWinners> winners) {
    this.winners = winners;
  }


  /**
   * The Contest's disqualified agents, returned when a contest is complete
   **/
  public ContestsResponse disqualifiedAgents(List<ContestDisqualifiedAgents> disqualifiedAgents) {
    this.disqualifiedAgents = disqualifiedAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest's disqualified agents, returned when a contest is complete")
  @JsonProperty("disqualifiedAgents")
  public List<ContestDisqualifiedAgents> getDisqualifiedAgents() {
    return disqualifiedAgents;
  }
  public void setDisqualifiedAgents(List<ContestDisqualifiedAgents> disqualifiedAgents) {
    this.disqualifiedAgents = disqualifiedAgents;
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
    ContestsResponse contestsResponse = (ContestsResponse) o;

    return Objects.equals(this.id, contestsResponse.id) &&
            Objects.equals(this.division, contestsResponse.division) &&
            Objects.equals(this.title, contestsResponse.title) &&
            Objects.equals(this.description, contestsResponse.description) &&
            Objects.equals(this.dateStart, contestsResponse.dateStart) &&
            Objects.equals(this.dateEnd, contestsResponse.dateEnd) &&
            Objects.equals(this.winningCriteria, contestsResponse.winningCriteria) &&
            Objects.equals(this.dateAnnounced, contestsResponse.dateAnnounced) &&
            Objects.equals(this.announcementTimezone, contestsResponse.announcementTimezone) &&
            Objects.equals(this.anonymization, contestsResponse.anonymization) &&
            Objects.equals(this.metrics, contestsResponse.metrics) &&
            Objects.equals(this.prizes, contestsResponse.prizes) &&
            Objects.equals(this.version, contestsResponse.version) &&
            Objects.equals(this.createdBy, contestsResponse.createdBy) &&
            Objects.equals(this.profile, contestsResponse.profile) &&
            Objects.equals(this.participants, contestsResponse.participants) &&
            Objects.equals(this.status, contestsResponse.status) &&
            Objects.equals(this.participantCount, contestsResponse.participantCount) &&
            Objects.equals(this.dateFinalized, contestsResponse.dateFinalized) &&
            Objects.equals(this.dateCancelled, contestsResponse.dateCancelled) &&
            Objects.equals(this.dateModified, contestsResponse.dateModified) &&
            Objects.equals(this.dateScoresModified, contestsResponse.dateScoresModified) &&
            Objects.equals(this.winners, contestsResponse.winners) &&
            Objects.equals(this.disqualifiedAgents, contestsResponse.disqualifiedAgents) &&
            Objects.equals(this.selfUri, contestsResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, title, description, dateStart, dateEnd, winningCriteria, dateAnnounced, announcementTimezone, anonymization, metrics, prizes, version, createdBy, profile, participants, status, participantCount, dateFinalized, dateCancelled, dateModified, dateScoresModified, winners, disqualifiedAgents, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestsResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    division: ").append(toIndentedString(division)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    dateStart: ").append(toIndentedString(dateStart)).append("\n");
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    winningCriteria: ").append(toIndentedString(winningCriteria)).append("\n");
    sb.append("    dateAnnounced: ").append(toIndentedString(dateAnnounced)).append("\n");
    sb.append("    announcementTimezone: ").append(toIndentedString(announcementTimezone)).append("\n");
    sb.append("    anonymization: ").append(toIndentedString(anonymization)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    prizes: ").append(toIndentedString(prizes)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    participantCount: ").append(toIndentedString(participantCount)).append("\n");
    sb.append("    dateFinalized: ").append(toIndentedString(dateFinalized)).append("\n");
    sb.append("    dateCancelled: ").append(toIndentedString(dateCancelled)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    dateScoresModified: ").append(toIndentedString(dateScoresModified)).append("\n");
    sb.append("    winners: ").append(toIndentedString(winners)).append("\n");
    sb.append("    disqualifiedAgents: ").append(toIndentedString(disqualifiedAgents)).append("\n");
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

