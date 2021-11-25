package com.mypurecloud.sdk.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import java.util.Objects;
import java.io.IOException;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.mypurecloud.sdk.v2.model.AuditQueryEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import java.io.Serializable;
/**
 * AuditQueryService
 */

public class AuditQueryService  implements Serializable {
  

  private static class NameEnumDeserializer extends StdDeserializer<NameEnum> {
    public NameEnumDeserializer() {
      super(NameEnumDeserializer.class);
    }

    @Override
    public NameEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return NameEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * Name of the Service
   */
 @JsonDeserialize(using = NameEnumDeserializer.class)
  public enum NameEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    ANALYTICSREPORTING("AnalyticsReporting"),
    ARCHITECT("Architect"),
    COACHING("Coaching"),
    CONTACTCENTER("ContactCenter"),
    CONTENTMANAGEMENT("ContentManagement"),
    DATATABLES("Datatables"),
    DIRECTORY("Directory"),
    DYNAMICSCHEMA("DynamicSchema"),
    GAMIFICATION("Gamification"),
    GROUPS("Groups"),
    INTEGRATIONS("Integrations"),
    KNOWLEDGE("Knowledge"),
    LANGUAGEUNDERSTANDING("LanguageUnderstanding"),
    LEARNING("Learning"),
    LIMITS("Limits"),
    OUTBOUND("Outbound"),
    PEOPLEPERMISSIONS("PeoplePermissions"),
    EMPLOYEEPERFORMANCE("EmployeePerformance"),
    PREDICTIVEENGAGEMENT("PredictiveEngagement"),
    PRESENCE("Presence"),
    QUALITY("Quality"),
    RESPONSEMANAGEMENT("ResponseManagement"),
    ROUTING("Routing"),
    SPEECHANDTEXTANALYTICS("SpeechAndTextAnalytics"),
    TELEPHONY("Telephony"),
    TOPICSDEFINITIONS("TopicsDefinitions"),
    TRIGGERS("Triggers"),
    PROCESSAUTOMATION("ProcessAutomation"),
    WEBDEPLOYMENTS("WebDeployments"),
    WEBHOOKS("Webhooks"),
    WORKFORCEMANAGEMENT("WorkforceManagement"),
    MESSAGING("Messaging"),
    SUPPORTABILITY("Supportability"),
    CALLBACK("Callback");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static NameEnum fromString(String key) {
      if (key == null) return null;

      for (NameEnum value : NameEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return NameEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private NameEnum name = null;
  private List<AuditQueryEntity> entities = new ArrayList<AuditQueryEntity>();

  
  /**
   * Name of the Service
   **/
  public AuditQueryService name(NameEnum name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Name of the Service")
  @JsonProperty("name")
  public NameEnum getName() {
    return name;
  }
  public void setName(NameEnum name) {
    this.name = name;
  }

  
  /**
   * List of Entities
   **/
  public AuditQueryService entities(List<AuditQueryEntity> entities) {
    this.entities = entities;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "List of Entities")
  @JsonProperty("entities")
  public List<AuditQueryEntity> getEntities() {
    return entities;
  }
  public void setEntities(List<AuditQueryEntity> entities) {
    this.entities = entities;
  }

  

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuditQueryService auditQueryService = (AuditQueryService) o;
    return Objects.equals(this.name, auditQueryService.name) &&
        Objects.equals(this.entities, auditQueryService.entities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, entities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuditQueryService {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    entities: ").append(toIndentedString(entities)).append("\n");
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

