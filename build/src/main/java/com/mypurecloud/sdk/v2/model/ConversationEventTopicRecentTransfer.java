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
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicDestination;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicInitiator;
import com.mypurecloud.sdk.v2.model.ConversationEventTopicModifiedBy;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

import java.io.Serializable;
/**
 * ConversationEventTopicRecentTransfer
 */

public class ConversationEventTopicRecentTransfer  implements Serializable {
  
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
  private ConversationEventTopicInitiator initiator = null;
  private ConversationEventTopicModifiedBy modifiedBy = null;
  private ConversationEventTopicDestination destination = null;

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

  
  /**
   * The id of the command.
   **/
  public ConversationEventTopicRecentTransfer id(String id) {
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
  public ConversationEventTopicRecentTransfer state(StateEnum state) {
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
  public ConversationEventTopicRecentTransfer dateIssued(Date dateIssued) {
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
  public ConversationEventTopicRecentTransfer initiator(ConversationEventTopicInitiator initiator) {
    this.initiator = initiator;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("initiator")
  public ConversationEventTopicInitiator getInitiator() {
    return initiator;
  }
  public void setInitiator(ConversationEventTopicInitiator initiator) {
    this.initiator = initiator;
  }


  /**
   **/
  public ConversationEventTopicRecentTransfer modifiedBy(ConversationEventTopicModifiedBy modifiedBy) {
    this.modifiedBy = modifiedBy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("modifiedBy")
  public ConversationEventTopicModifiedBy getModifiedBy() {
    return modifiedBy;
  }
  public void setModifiedBy(ConversationEventTopicModifiedBy modifiedBy) {
    this.modifiedBy = modifiedBy;
  }


  /**
   **/
  public ConversationEventTopicRecentTransfer destination(ConversationEventTopicDestination destination) {
    this.destination = destination;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("destination")
  public ConversationEventTopicDestination getDestination() {
    return destination;
  }
  public void setDestination(ConversationEventTopicDestination destination) {
    this.destination = destination;
  }


  /**
   * The type of transfer to perform.
   **/
  public ConversationEventTopicRecentTransfer transferType(TransferTypeEnum transferType) {
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
    ConversationEventTopicRecentTransfer conversationEventTopicRecentTransfer = (ConversationEventTopicRecentTransfer) o;

    return Objects.equals(this.id, conversationEventTopicRecentTransfer.id) &&
            Objects.equals(this.state, conversationEventTopicRecentTransfer.state) &&
            Objects.equals(this.dateIssued, conversationEventTopicRecentTransfer.dateIssued) &&
            Objects.equals(this.initiator, conversationEventTopicRecentTransfer.initiator) &&
            Objects.equals(this.modifiedBy, conversationEventTopicRecentTransfer.modifiedBy) &&
            Objects.equals(this.destination, conversationEventTopicRecentTransfer.destination) &&
            Objects.equals(this.transferType, conversationEventTopicRecentTransfer.transferType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, state, dateIssued, initiator, modifiedBy, destination, transferType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationEventTopicRecentTransfer {\n");
    
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

