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
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicContestMetrics;
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicContestPrizes;
import com.mypurecloud.sdk.v2.model.V2WemEngagementCelebrationUpdatesTopicContestWinners;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * V2WemEngagementCelebrationUpdatesTopicContestCompleteData
 */

public class V2WemEngagementCelebrationUpdatesTopicContestCompleteData  implements Serializable {
  
  private String dateEnd = null;

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
   * Gets or Sets anonymization
   */
 @JsonDeserialize(using = AnonymizationEnumDeserializer.class)
  public enum AnonymizationEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    UNKNOWN("UNKNOWN"),
    NO_ANONYMIZATION("NO_ANONYMIZATION"),
    ALL("ALL"),
    ALL_EXCEPT_TOP("ALL_EXCEPT_TOP");

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
  private List<V2WemEngagementCelebrationUpdatesTopicContestMetrics> metrics = null;
  private List<V2WemEngagementCelebrationUpdatesTopicContestPrizes> prizes = null;
  private List<V2WemEngagementCelebrationUpdatesTopicContestWinners> winners = null;

  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<V2WemEngagementCelebrationUpdatesTopicContestMetrics>();
      prizes = new ArrayList<V2WemEngagementCelebrationUpdatesTopicContestPrizes>();
      winners = new ArrayList<V2WemEngagementCelebrationUpdatesTopicContestWinners>();
    }
  }

  
  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData dateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("dateEnd")
  public String getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(String dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData anonymization(AnonymizationEnum anonymization) {
    this.anonymization = anonymization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("anonymization")
  public AnonymizationEnum getAnonymization() {
    return anonymization;
  }
  public void setAnonymization(AnonymizationEnum anonymization) {
    this.anonymization = anonymization;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData metrics(List<V2WemEngagementCelebrationUpdatesTopicContestMetrics> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("metrics")
  public List<V2WemEngagementCelebrationUpdatesTopicContestMetrics> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<V2WemEngagementCelebrationUpdatesTopicContestMetrics> metrics) {
    this.metrics = metrics;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData prizes(List<V2WemEngagementCelebrationUpdatesTopicContestPrizes> prizes) {
    this.prizes = prizes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("prizes")
  public List<V2WemEngagementCelebrationUpdatesTopicContestPrizes> getPrizes() {
    return prizes;
  }
  public void setPrizes(List<V2WemEngagementCelebrationUpdatesTopicContestPrizes> prizes) {
    this.prizes = prizes;
  }


  /**
   **/
  public V2WemEngagementCelebrationUpdatesTopicContestCompleteData winners(List<V2WemEngagementCelebrationUpdatesTopicContestWinners> winners) {
    this.winners = winners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("winners")
  public List<V2WemEngagementCelebrationUpdatesTopicContestWinners> getWinners() {
    return winners;
  }
  public void setWinners(List<V2WemEngagementCelebrationUpdatesTopicContestWinners> winners) {
    this.winners = winners;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2WemEngagementCelebrationUpdatesTopicContestCompleteData v2WemEngagementCelebrationUpdatesTopicContestCompleteData = (V2WemEngagementCelebrationUpdatesTopicContestCompleteData) o;

    return Objects.equals(this.dateEnd, v2WemEngagementCelebrationUpdatesTopicContestCompleteData.dateEnd) &&
            Objects.equals(this.anonymization, v2WemEngagementCelebrationUpdatesTopicContestCompleteData.anonymization) &&
            Objects.equals(this.metrics, v2WemEngagementCelebrationUpdatesTopicContestCompleteData.metrics) &&
            Objects.equals(this.prizes, v2WemEngagementCelebrationUpdatesTopicContestCompleteData.prizes) &&
            Objects.equals(this.winners, v2WemEngagementCelebrationUpdatesTopicContestCompleteData.winners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateEnd, anonymization, metrics, prizes, winners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2WemEngagementCelebrationUpdatesTopicContestCompleteData {\n");
    
    sb.append("    dateEnd: ").append(toIndentedString(dateEnd)).append("\n");
    sb.append("    anonymization: ").append(toIndentedString(anonymization)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    prizes: ").append(toIndentedString(prizes)).append("\n");
    sb.append("    winners: ").append(toIndentedString(winners)).append("\n");
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

