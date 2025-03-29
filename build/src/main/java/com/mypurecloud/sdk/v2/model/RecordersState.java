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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * RecordersState
 */

public class RecordersState  implements Serializable {
  

  private static class AdhocStateEnumDeserializer extends StdDeserializer<AdhocStateEnum> {
    public AdhocStateEnumDeserializer() {
      super(AdhocStateEnumDeserializer.class);
    }

    @Override
    public AdhocStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AdhocStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the state of the adhoc recorder.
   */
 @JsonDeserialize(using = AdhocStateEnumDeserializer.class)
  public enum AdhocStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    NONE("NONE");

    private String value;

    AdhocStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AdhocStateEnum fromString(String key) {
      if (key == null) return null;

      for (AdhocStateEnum value : AdhocStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AdhocStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AdhocStateEnum adhocState = null;

  private static class CustomerExperienceStateEnumDeserializer extends StdDeserializer<CustomerExperienceStateEnum> {
    public CustomerExperienceStateEnumDeserializer() {
      super(CustomerExperienceStateEnumDeserializer.class);
    }

    @Override
    public CustomerExperienceStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CustomerExperienceStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the state of the customer experience recorder.
   */
 @JsonDeserialize(using = CustomerExperienceStateEnumDeserializer.class)
  public enum CustomerExperienceStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    NONE("NONE");

    private String value;

    CustomerExperienceStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CustomerExperienceStateEnum fromString(String key) {
      if (key == null) return null;

      for (CustomerExperienceStateEnum value : CustomerExperienceStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CustomerExperienceStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CustomerExperienceStateEnum customerExperienceState = null;

  private static class AgentExperienceStateEnumDeserializer extends StdDeserializer<AgentExperienceStateEnum> {
    public AgentExperienceStateEnumDeserializer() {
      super(AgentExperienceStateEnumDeserializer.class);
    }

    @Override
    public AgentExperienceStateEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return AgentExperienceStateEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Indicates the state of the agent experience recorder.
   */
 @JsonDeserialize(using = AgentExperienceStateEnumDeserializer.class)
  public enum AgentExperienceStateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ACTIVE("ACTIVE"),
    PAUSED("PAUSED"),
    NONE("NONE");

    private String value;

    AgentExperienceStateEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static AgentExperienceStateEnum fromString(String key) {
      if (key == null) return null;

      for (AgentExperienceStateEnum value : AgentExperienceStateEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return AgentExperienceStateEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private AgentExperienceStateEnum agentExperienceState = null;

  
  /**
   * Indicates the state of the adhoc recorder.
   **/
  public RecordersState adhocState(AdhocStateEnum adhocState) {
    this.adhocState = adhocState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the adhoc recorder.")
  @JsonProperty("adhocState")
  public AdhocStateEnum getAdhocState() {
    return adhocState;
  }
  public void setAdhocState(AdhocStateEnum adhocState) {
    this.adhocState = adhocState;
  }


  /**
   * Indicates the state of the customer experience recorder.
   **/
  public RecordersState customerExperienceState(CustomerExperienceStateEnum customerExperienceState) {
    this.customerExperienceState = customerExperienceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the customer experience recorder.")
  @JsonProperty("customerExperienceState")
  public CustomerExperienceStateEnum getCustomerExperienceState() {
    return customerExperienceState;
  }
  public void setCustomerExperienceState(CustomerExperienceStateEnum customerExperienceState) {
    this.customerExperienceState = customerExperienceState;
  }


  /**
   * Indicates the state of the agent experience recorder.
   **/
  public RecordersState agentExperienceState(AgentExperienceStateEnum agentExperienceState) {
    this.agentExperienceState = agentExperienceState;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Indicates the state of the agent experience recorder.")
  @JsonProperty("agentExperienceState")
  public AgentExperienceStateEnum getAgentExperienceState() {
    return agentExperienceState;
  }
  public void setAgentExperienceState(AgentExperienceStateEnum agentExperienceState) {
    this.agentExperienceState = agentExperienceState;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecordersState recordersState = (RecordersState) o;

    return Objects.equals(this.adhocState, recordersState.adhocState) &&
            Objects.equals(this.customerExperienceState, recordersState.customerExperienceState) &&
            Objects.equals(this.agentExperienceState, recordersState.agentExperienceState);
  }

  @Override
  public int hashCode() {
    return Objects.hash(adhocState, customerExperienceState, agentExperienceState);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecordersState {\n");
    
    sb.append("    adhocState: ").append(toIndentedString(adhocState)).append("\n");
    sb.append("    customerExperienceState: ").append(toIndentedString(customerExperienceState)).append("\n");
    sb.append("    agentExperienceState: ").append(toIndentedString(agentExperienceState)).append("\n");
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

