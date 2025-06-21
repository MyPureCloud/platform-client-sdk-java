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
import com.mypurecloud.sdk.v2.model.AddressableEntityRef;
import com.mypurecloud.sdk.v2.model.GuideVersionResources;
import com.mypurecloud.sdk.v2.model.Variable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import java.io.Serializable;
/**
 * GuideVersion
 */

public class GuideVersion  implements Serializable {
  
  private String selfUri = null;
  private AddressableEntityRef guide = null;
  private String version = null;
  private String instruction = null;

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
   * The current state of the guide version.
   */
 @JsonDeserialize(using = StateEnumDeserializer.class)
  public enum StateEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    DRAFT("Draft"),
    TESTREADY("TestReady"),
    PRODUCTIONREADY("ProductionReady");

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
  private Date dateCreated = null;
  private Date dateModified = null;
  private List<Variable> variables = null;
  private GuideVersionResources resources = null;

  public GuideVersion() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
      variables = new ArrayList<Variable>();
    }
  }

  
  /**
   **/
  public GuideVersion selfUri(String selfUri) {
    this.selfUri = selfUri;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("selfUri")
  public String getSelfUri() {
    return selfUri;
  }
  public void setSelfUri(String selfUri) {
    this.selfUri = selfUri;
  }


  @ApiModelProperty(example = "null", value = "The guide this version belongs to.")
  @JsonProperty("guide")
  public AddressableEntityRef getGuide() {
    return guide;
  }


  @ApiModelProperty(example = "null", value = "Guide version.")
  @JsonProperty("version")
  public String getVersion() {
    return version;
  }


  @ApiModelProperty(example = "null", value = "The instruction given to this version of the guide, for how it should behave when interacting with a User.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }


  /**
   * The current state of the guide version.
   **/
  public GuideVersion state(StateEnum state) {
    this.state = state;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The current state of the guide version.")
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }
  public void setState(StateEnum state) {
    this.state = state;
  }


  @ApiModelProperty(example = "null", value = "The date and time the guide version was created. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateCreated")
  public Date getDateCreated() {
    return dateCreated;
  }


  @ApiModelProperty(example = "null", value = "The date and time the guide version was last modified. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z")
  @JsonProperty("dateModified")
  public Date getDateModified() {
    return dateModified;
  }


  @ApiModelProperty(example = "null", value = "The variables associated with this version of the guide. Includes input variables (provided) and output variables (captured during execution).")
  @JsonProperty("variables")
  public List<Variable> getVariables() {
    return variables;
  }


  /**
   * The resources associated with this version of the guide.
   **/
  public GuideVersion resources(GuideVersionResources resources) {
    this.resources = resources;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The resources associated with this version of the guide.")
  @JsonProperty("resources")
  public GuideVersionResources getResources() {
    return resources;
  }
  public void setResources(GuideVersionResources resources) {
    this.resources = resources;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GuideVersion guideVersion = (GuideVersion) o;

    return Objects.equals(this.selfUri, guideVersion.selfUri) &&
            Objects.equals(this.guide, guideVersion.guide) &&
            Objects.equals(this.version, guideVersion.version) &&
            Objects.equals(this.instruction, guideVersion.instruction) &&
            Objects.equals(this.state, guideVersion.state) &&
            Objects.equals(this.dateCreated, guideVersion.dateCreated) &&
            Objects.equals(this.dateModified, guideVersion.dateModified) &&
            Objects.equals(this.variables, guideVersion.variables) &&
            Objects.equals(this.resources, guideVersion.resources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(selfUri, guide, version, instruction, state, dateCreated, dateModified, variables, resources);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GuideVersion {\n");
    
    sb.append("    selfUri: ").append(toIndentedString(selfUri)).append("\n");
    sb.append("    guide: ").append(toIndentedString(guide)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    dateModified: ").append(toIndentedString(dateModified)).append("\n");
    sb.append("    variables: ").append(toIndentedString(variables)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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

