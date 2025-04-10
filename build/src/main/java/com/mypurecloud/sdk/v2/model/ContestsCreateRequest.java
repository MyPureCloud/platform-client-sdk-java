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
import com.mypurecloud.sdk.v2.model.ContestPrizes;
import com.mypurecloud.sdk.v2.model.WritableDivision;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * ContestsCreateRequest
 */

public class ContestsCreateRequest  implements Serializable {
  
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
  private String profileId = null;
  private List<String> participantIds = null;
  private String selfUri = null;

  public ContestsCreateRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<ContestMetrics>();
      prizes = new ArrayList<ContestPrizes>();
      participantIds = new ArrayList<String>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * The division for this performance profile associate to. Only set for DEFAULT profile.
   **/
  public ContestsCreateRequest division(WritableDivision division) {
    this.division = division;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The division for this performance profile associate to. Only set for DEFAULT profile.")
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
  public ContestsCreateRequest title(String title) {
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
  public ContestsCreateRequest description(String description) {
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
  public ContestsCreateRequest dateStart(LocalDate dateStart) {
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
  public ContestsCreateRequest dateEnd(LocalDate dateEnd) {
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
   * The Contest winning criteria
   **/
  public ContestsCreateRequest winningCriteria(WinningCriteriaEnum winningCriteria) {
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
  public ContestsCreateRequest dateAnnounced(Date dateAnnounced) {
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
  public ContestsCreateRequest announcementTimezone(String announcementTimezone) {
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
  public ContestsCreateRequest anonymization(AnonymizationEnum anonymization) {
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
  public ContestsCreateRequest metrics(List<ContestMetrics> metrics) {
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
  public ContestsCreateRequest prizes(List<ContestPrizes> prizes) {
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
   * The Contest profile
   **/
  public ContestsCreateRequest profileId(String profileId) {
    this.profileId = profileId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest profile")
  @JsonProperty("profileId")
  public String getProfileId() {
    return profileId;
  }
  public void setProfileId(String profileId) {
    this.profileId = profileId;
  }


  /**
   * The Contest's participants
   **/
  public ContestsCreateRequest participantIds(List<String> participantIds) {
    this.participantIds = participantIds;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest's participants")
  @JsonProperty("participantIds")
  public List<String> getParticipantIds() {
    return participantIds;
  }
  public void setParticipantIds(List<String> participantIds) {
    this.participantIds = participantIds;
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
    ContestsCreateRequest contestsCreateRequest = (ContestsCreateRequest) o;

    return Objects.equals(this.id, contestsCreateRequest.id) &&
            Objects.equals(this.division, contestsCreateRequest.division) &&
            Objects.equals(this.title, contestsCreateRequest.title) &&
            Objects.equals(this.description, contestsCreateRequest.description) &&
            Objects.equals(this.dateStart, contestsCreateRequest.dateStart) &&
            Objects.equals(this.dateEnd, contestsCreateRequest.dateEnd) &&
            Objects.equals(this.winningCriteria, contestsCreateRequest.winningCriteria) &&
            Objects.equals(this.dateAnnounced, contestsCreateRequest.dateAnnounced) &&
            Objects.equals(this.announcementTimezone, contestsCreateRequest.announcementTimezone) &&
            Objects.equals(this.anonymization, contestsCreateRequest.anonymization) &&
            Objects.equals(this.metrics, contestsCreateRequest.metrics) &&
            Objects.equals(this.prizes, contestsCreateRequest.prizes) &&
            Objects.equals(this.profileId, contestsCreateRequest.profileId) &&
            Objects.equals(this.participantIds, contestsCreateRequest.participantIds) &&
            Objects.equals(this.selfUri, contestsCreateRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, division, title, description, dateStart, dateEnd, winningCriteria, dateAnnounced, announcementTimezone, anonymization, metrics, prizes, profileId, participantIds, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestsCreateRequest {\n");
    
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
    sb.append("    profileId: ").append(toIndentedString(profileId)).append("\n");
    sb.append("    participantIds: ").append(toIndentedString(participantIds)).append("\n");
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

