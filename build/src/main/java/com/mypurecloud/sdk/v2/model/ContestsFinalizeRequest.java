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
import com.mypurecloud.sdk.v2.model.ContestWinnersRequest;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ContestsFinalizeRequest
 */

public class ContestsFinalizeRequest  implements Serializable {
  

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
   * The Contest finalization status
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
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
  private List<ContestWinnersRequest> winners = null;
  private List<ContestDisqualifiedAgents> disqualifiedAgents = null;

  public ContestsFinalizeRequest() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      winners = new ArrayList<ContestWinnersRequest>();
      disqualifiedAgents = new ArrayList<ContestDisqualifiedAgents>();
    }
  }

  
  /**
   * The Contest finalization status
   **/
  public ContestsFinalizeRequest status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Contest finalization status")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The Contest finalization winners
   **/
  public ContestsFinalizeRequest winners(List<ContestWinnersRequest> winners) {
    this.winners = winners;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest finalization winners")
  @JsonProperty("winners")
  public List<ContestWinnersRequest> getWinners() {
    return winners;
  }
  public void setWinners(List<ContestWinnersRequest> winners) {
    this.winners = winners;
  }


  /**
   * The Contest finalization disqualified agents
   **/
  public ContestsFinalizeRequest disqualifiedAgents(List<ContestDisqualifiedAgents> disqualifiedAgents) {
    this.disqualifiedAgents = disqualifiedAgents;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Contest finalization disqualified agents")
  @JsonProperty("disqualifiedAgents")
  public List<ContestDisqualifiedAgents> getDisqualifiedAgents() {
    return disqualifiedAgents;
  }
  public void setDisqualifiedAgents(List<ContestDisqualifiedAgents> disqualifiedAgents) {
    this.disqualifiedAgents = disqualifiedAgents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContestsFinalizeRequest contestsFinalizeRequest = (ContestsFinalizeRequest) o;

    return Objects.equals(this.status, contestsFinalizeRequest.status) &&
            Objects.equals(this.winners, contestsFinalizeRequest.winners) &&
            Objects.equals(this.disqualifiedAgents, contestsFinalizeRequest.disqualifiedAgents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, winners, disqualifiedAgents);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContestsFinalizeRequest {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    winners: ").append(toIndentedString(winners)).append("\n");
    sb.append("    disqualifiedAgents: ").append(toIndentedString(disqualifiedAgents)).append("\n");
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

