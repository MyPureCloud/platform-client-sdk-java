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
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicTransferDestination;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicTransferInitiator;
import com.mypurecloud.sdk.v2.model.QueueConversationEventTopicTransferModifedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * QueueConversationEventTopicTransferResponse
 */

public class QueueConversationEventTopicTransferResponse  implements Serializable {
  
  private String id = null;

  private static class StateEnumDeserializer extends StdDeserializer<StateEnum> {
    public StateEnumDeserializer() {
      super(StateEnumDeserializer.class);
    }

    @Override
    public StateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return StateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Gets or Sets state
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PENDING("pending"),
    ACTIVE("active"),
    COMPLETE("complete"),
    CANCELED("canceled"),
    FAILED("failed"),
    TIMEOUT("timeout"),
    UNKNOWN("unknown");

    private String value;

    StateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static StateEnum fromString(String key) {
      if (key == null) return null;

      for (StateEnum value : StateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return StateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private StateEnum state = null;
  private Date dateIssued = null;
  private QueueConversationEventTopicTransferInitiator initiator = null;
  private QueueConversationEventTopicTransferModifedBy modifiedBy = null;
  private QueueConversationEventTopicTransferDestination destination = null;

  private static class TransferTypeEnumDeserializer extends StdDeserializer<TransferTypeEnum> {
    public TransferTypeEnumDeserializer() {
      super(TransferTypeEnumDeserializer.class);
    }

    @Override
    public TransferTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TransferTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of transfer to perform.
   */
 @JsonDeserialize(using = TransferTypeEnumDeserializer.class)
  public enum TransferTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ATTENDED("attended"),
    UNATTENDED("unattended");

    private String value;

    TransferTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TransferTypeEnum fromString(String key) {
      if (key == null) return null;

      for (TransferTypeEnum value : TransferTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TransferTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TransferTypeEnum transferType = null;

  public QueueConversationEventTopicTransferResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The id of the command.
   **/
  public QueueConversationEventTopicTransferResponse id(String id) {
    this.id = id;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The id of the command.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }


  /**
   **/
  public QueueConversationEventTopicTransferResponse state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  /**
   * The date/time that this command was issued.
   **/
  public QueueConversationEventTopicTransferResponse dateIssued(Date dateIssued) {
    this.dateIssued = dateIssued;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The date/time that this command was issued.")
  @JsonProperty("dateIssued")
  public Date getDateIssued() {
    return dateIssued;
  }
  public void setDateIssued(Date dateIssued) {
    this.dateIssued = dateIssued;
  }


  /**
   **/
  public QueueConversationEventTopicTransferResponse initiator(QueueConversationEventTopicTransferInitiator initiator) {
    this.initiator = initiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiator")
  public QueueConversationEventTopicTransferInitiator getInitiator() {
    return initiator;
  }
  public void setInitiator(QueueConversationEventTopicTransferInitiator initiator) {
    this.initiator = initiator;
  }


  /**
   **/
  public QueueConversationEventTopicTransferResponse modifiedBy(QueueConversationEventTopicTransferModifedBy modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public QueueConversationEventTopicTransferModifedBy getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(QueueConversationEventTopicTransferModifedBy modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public QueueConversationEventTopicTransferResponse destination(QueueConversationEventTopicTransferDestination destination) {
    this.destination = destination;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destination")
  public QueueConversationEventTopicTransferDestination getDestination() {
    return destination;
  }
  public void setDestination(QueueConversationEventTopicTransferDestination destination) {
    this.destination = destination;
  }


  /**
   * The type of transfer to perform.
   **/
  public QueueConversationEventTopicTransferResponse transferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of transfer to perform.")
  @JsonProperty("transferType")
  public TransferTypeEnum getTransferType() {
    return transferType;
  }
  public void setTransferType(TransferTypeEnum transferType) {
    this.transferType = transferType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueueConversationEventTopicTransferResponse queueConversationEventTopicTransferResponse = (QueueConversationEventTopicTransferResponse) o;

    return Objects.equals(this.id, queueConversationEventTopicTransferResponse.id) &&
            Objects.equals(this.state, queueConversationEventTopicTransferResponse.state) &&
            Objects.equals(this.dateIssued, queueConversationEventTopicTransferResponse.dateIssued) &&
            Objects.equals(this.initiator, queueConversationEventTopicTransferResponse.initiator) &&
            Objects.equals(this.modifiedBy, queueConversationEventTopicTransferResponse.modifiedBy) &&
            Objects.equals(this.destination, queueConversationEventTopicTransferResponse.destination) &&
            Objects.equals(this.transferType, queueConversationEventTopicTransferResponse.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, dateIssued, initiator, modifiedBy, destination, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueueConversationEventTopicTransferResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateIssued: ").append(toIndentedString(dateIssued)).append("\n");
    sb.append("    initiator: ").append(toIndentedString(initiator)).append("\n");
    sb.append("    modifiedBy: ").append(toIndentedString(modifiedBy)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    transferType: ").append(toIndentedString(transferType)).append("\n");
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

