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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.ArchitectJobMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ArchitectJobStateResponse
 */

public class ArchitectJobStateResponse  implements Serializable {
  
  private String id = null;
  private AddressableEntityRef flow = null;

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
   * Status of the Architect Job
   */
 @JsonDeserialize(using = StatusEnumDeserializer.class)
  public enum StatusEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    REGISTERED("Registered"),
    STARTED("Started"),
    SUCCESS("Success"),
    FAILURE("Failure");

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

  private static class CommandEnumDeserializer extends StdDeserializer<CommandEnum> {
    public CommandEnumDeserializer() {
      super(CommandEnumDeserializer.class);
    }

    @Override
    public CommandEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CommandEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The command executed by the Architect Job
   */
 @JsonDeserialize(using = CommandEnumDeserializer.class)
  public enum CommandEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PUBLISH("Publish"),
    CREATE("Create"),
    UPDATE("Update");

    private String value;

    CommandEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CommandEnum fromString(String key) {
      if (key == null) return null;

      for (CommandEnum value : CommandEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CommandEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CommandEnum command = null;
  private List<ArchitectJobMessage> messages = new ArrayList<ArchitectJobMessage>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Flow created from the Architect Job
   **/
  public ArchitectJobStateResponse flow(AddressableEntityRef flow) {
    this.flow = flow;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Flow created from the Architect Job")
  @JsonProperty("flow")
  public AddressableEntityRef getFlow() {
    return flow;
  }
  public void setFlow(AddressableEntityRef flow) {
    this.flow = flow;
  }


  /**
   * Status of the Architect Job
   **/
  public ArchitectJobStateResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the Architect Job")
  @JsonProperty("status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  /**
   * The command executed by the Architect Job
   **/
  public ArchitectJobStateResponse command(CommandEnum command) {
    this.command = command;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The command executed by the Architect Job")
  @JsonProperty("command")
  public CommandEnum getCommand() {
    return command;
  }
  public void setCommand(CommandEnum command) {
    this.command = command;
  }


  /**
   * Warnings and Errors messages of the Architect Job
   **/
  public ArchitectJobStateResponse messages(List<ArchitectJobMessage> messages) {
    this.messages = messages;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Warnings and Errors messages of the Architect Job")
  @JsonProperty("messages")
  public List<ArchitectJobMessage> getMessages() {
    return messages;
  }
  public void setMessages(List<ArchitectJobMessage> messages) {
    this.messages = messages;
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
    ArchitectJobStateResponse architectJobStateResponse = (ArchitectJobStateResponse) o;

    return Objects.equals(this.id, architectJobStateResponse.id) &&
            Objects.equals(this.flow, architectJobStateResponse.flow) &&
            Objects.equals(this.status, architectJobStateResponse.status) &&
            Objects.equals(this.command, architectJobStateResponse.command) &&
            Objects.equals(this.messages, architectJobStateResponse.messages) &&
            Objects.equals(this.selfUri, architectJobStateResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, flow, status, command, messages, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectJobStateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    flow: ").append(toIndentedString(flow)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
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

