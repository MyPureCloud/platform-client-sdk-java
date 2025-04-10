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
import com.mypurecloud.sdk.v2.model.ContestDataMetrics;
import com.mypurecloud.sdk.v2.model.ContestDataPrizes;
import com.mypurecloud.sdk.v2.model.ContestDataWinners;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestCompleteData
 */

public class ContestCompleteData  implements Serializable {
  
  private LocalDate dateEnd = null;

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
   * Anonymization of the contest
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
  private List<ContestDataMetrics> metrics = null;
  private List<ContestDataPrizes> prizes = null;
  private List<ContestDataWinners> winners = null;

  public ContestCompleteData() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      metrics = new ArrayList<ContestDataMetrics>();
      prizes = new ArrayList<ContestDataPrizes>();
      winners = new ArrayList<ContestDataWinners>();
    }
  }

  
  /**
   * End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd
   **/
  public ContestCompleteData dateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "End date of the contest. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd")
  @JsonProperty("dateEnd")
  public LocalDate getDateEnd() {
    return dateEnd;
  }
  public void setDateEnd(LocalDate dateEnd) {
    this.dateEnd = dateEnd;
  }


  /**
   * Anonymization of the contest
   **/
  public ContestCompleteData anonymization(AnonymizationEnum anonymization) {
    this.anonymization = anonymization;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Anonymization of the contest")
  @JsonProperty("anonymization")
  public AnonymizationEnum getAnonymization() {
    return anonymization;
  }
  public void setAnonymization(AnonymizationEnum anonymization) {
    this.anonymization = anonymization;
  }


  /**
   * Metrics of the contest
   **/
  public ContestCompleteData metrics(List<ContestDataMetrics> metrics) {
    this.metrics = metrics;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Metrics of the contest")
  @JsonProperty("metrics")
  public List<ContestDataMetrics> getMetrics() {
    return metrics;
  }
  public void setMetrics(List<ContestDataMetrics> metrics) {
    this.metrics = metrics;
  }


  /**
   * Prizes of the contest
   **/
  public ContestCompleteData prizes(List<ContestDataPrizes> prizes) {
    this.prizes = prizes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Prizes of the contest")
  @JsonProperty("prizes")
  public List<ContestDataPrizes> getPrizes() {
    return prizes;
  }
  public void setPrizes(List<ContestDataPrizes> prizes) {
    this.prizes = prizes;
  }


  /**
   * Winners of the contest
   **/
  public ContestCompleteData winners(List<ContestDataWinners> winners) {
    this.winners = winners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Winners of the contest")
  @JsonProperty("winners")
  public List<ContestDataWinners> getWinners() {
    return winners;
  }
  public void setWinners(List<ContestDataWinners> winners) {
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
    ContestCompleteData contestCompleteData = (ContestCompleteData) o;

    return Objects.equals(this.dateEnd, contestCompleteData.dateEnd) &&
            Objects.equals(this.anonymization, contestCompleteData.anonymization) &&
            Objects.equals(this.metrics, contestCompleteData.metrics) &&
            Objects.equals(this.prizes, contestCompleteData.prizes) &&
            Objects.equals(this.winners, contestCompleteData.winners);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dateEnd, anonymization, metrics, prizes, winners);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestCompleteData {\n");
    
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

