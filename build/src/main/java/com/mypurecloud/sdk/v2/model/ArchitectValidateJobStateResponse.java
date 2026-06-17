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
import com.mypurecloud.sdk.v2.model.ArchitectJobMessage;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * ArchitectValidateJobStateResponse
 */

public class ArchitectValidateJobStateResponse  implements Serializable {
  
  private String id = null;

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
   * Status of the Architect Validate Job
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
    UPDATE("Update"),
    EXPORT("Export"),
    VALIDATE("Validate");

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
  private List<ArchitectJobMessage> messages = null;
  private String selfUri = null;

  public ArchitectValidateJobStateResponse() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      messages = new ArrayList<ArchitectJobMessage>();
    }
  }

  public ArchitectValidateJobStateResponse(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
      messages = new ArrayList<ArchitectJobMessage>();
    }
  }

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   * Status of the Architect Validate Job
   **/
  public ArchitectValidateJobStateResponse status(StatusEnum status) {
    this.status = status;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Status of the Architect Validate Job")
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
  public ArchitectValidateJobStateResponse command(CommandEnum command) {
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
  public ArchitectValidateJobStateResponse messages(List<ArchitectJobMessage> messages) {
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
    ArchitectValidateJobStateResponse architectValidateJobStateResponse = (ArchitectValidateJobStateResponse) o;

    return Objects.equals(this.id, architectValidateJobStateResponse.id) &&
            Objects.equals(this.status, architectValidateJobStateResponse.status) &&
            Objects.equals(this.command, architectValidateJobStateResponse.command) &&
            Objects.equals(this.messages, architectValidateJobStateResponse.messages) &&
            Objects.equals(this.selfUri, architectValidateJobStateResponse.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, command, messages, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArchitectValidateJobStateResponse {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

