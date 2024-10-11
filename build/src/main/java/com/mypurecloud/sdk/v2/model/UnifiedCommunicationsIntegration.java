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
import com.mypurecloud.sdk.v2.model.UCI10n;
import com.mypurecloud.sdk.v2.model.UCIcon;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.io.Serializable;
/**
 * UC Integration UI configuration data
 */
@ApiModel(description = "UC Integration UI configuration data")

public class UnifiedCommunicationsIntegration  implements Serializable {
  
  private String id = null;
  private String name = null;
  private AddressableEntityRef ucIntegrationKey = null;

  private static class IntegrationPresenceSourceEnumDeserializer extends StdDeserializer<IntegrationPresenceSourceEnum> {
    public IntegrationPresenceSourceEnumDeserializer() {
      super(IntegrationPresenceSourceEnumDeserializer.class);
    }

    @Override
    public IntegrationPresenceSourceEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return IntegrationPresenceSourceEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * integrationPresenceType
   */
 @JsonDeserialize(using = IntegrationPresenceSourceEnumDeserializer.class)
  public enum IntegrationPresenceSourceEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    MICROSOFTTEAMS("MicrosoftTeams"),
    ZOOMPHONE("ZoomPhone"),
    EIGHTBYEIGHT("EightByEight");

    private String value;

    IntegrationPresenceSourceEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static IntegrationPresenceSourceEnum fromString(String key) {
      if (key == null) return null;

      for (IntegrationPresenceSourceEnum value : IntegrationPresenceSourceEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return IntegrationPresenceSourceEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private IntegrationPresenceSourceEnum integrationPresenceSource = null;
  private String pbxPermission = null;
  private UCIcon icon = null;
  private Map<String, UCIcon> badgeIcons = null;
  private Map<String, UCI10n> i10n = null;
  private Boolean polledPresence = null;
  private Integer pollIntervalSec = null;
  private Boolean includeBadge = null;
  private List<String> userPermissions = new ArrayList<String>();
  private List<String> oauthScopes = new ArrayList<String>();
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }


  /**
   **/
  public UnifiedCommunicationsIntegration name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }


  @ApiModelProperty(example = "null", required = true, value = "ucIntegrationKey")
  @JsonProperty("ucIntegrationKey")
  public AddressableEntityRef getUcIntegrationKey() {
    return ucIntegrationKey;
  }


  @ApiModelProperty(example = "null", required = true, value = "integrationPresenceType")
  @JsonProperty("integrationPresenceSource")
  public IntegrationPresenceSourceEnum getIntegrationPresenceSource() {
    return integrationPresenceSource;
  }


  @ApiModelProperty(example = "null", required = true, value = "pbxPermission")
  @JsonProperty("pbxPermission")
  public String getPbxPermission() {
    return pbxPermission;
  }


  @ApiModelProperty(example = "null", required = true, value = "icon")
  @JsonProperty("icon")
  public UCIcon getIcon() {
    return icon;
  }


  @ApiModelProperty(example = "null", required = true, value = "badgeIcon")
  @JsonProperty("badgeIcons")
  public Map<String, UCIcon> getBadgeIcons() {
    return badgeIcons;
  }


  @ApiModelProperty(example = "null", required = true, value = "i10n")
  @JsonProperty("i10n")
  public Map<String, UCI10n> getI10n() {
    return i10n;
  }


  @ApiModelProperty(example = "null", required = true, value = "polledPresence")
  @JsonProperty("polledPresence")
  public Boolean getPolledPresence() {
    return polledPresence;
  }


  @ApiModelProperty(example = "null", value = "pollIntervalSec")
  @JsonProperty("pollIntervalSec")
  public Integer getPollIntervalSec() {
    return pollIntervalSec;
  }


  @ApiModelProperty(example = "null", value = "includeBadge")
  @JsonProperty("includeBadge")
  public Boolean getIncludeBadge() {
    return includeBadge;
  }


  @ApiModelProperty(example = "null", required = true, value = "userPermissions")
  @JsonProperty("userPermissions")
  public List<String> getUserPermissions() {
    return userPermissions;
  }


  /**
   **/
  public UnifiedCommunicationsIntegration oauthScopes(List<String> oauthScopes) {
    this.oauthScopes = oauthScopes;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("oauthScopes")
  public List<String> getOauthScopes() {
    return oauthScopes;
  }
  public void setOauthScopes(List<String> oauthScopes) {
    this.oauthScopes = oauthScopes;
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
    UnifiedCommunicationsIntegration unifiedCommunicationsIntegration = (UnifiedCommunicationsIntegration) o;

    return Objects.equals(this.id, unifiedCommunicationsIntegration.id) &&
            Objects.equals(this.name, unifiedCommunicationsIntegration.name) &&
            Objects.equals(this.ucIntegrationKey, unifiedCommunicationsIntegration.ucIntegrationKey) &&
            Objects.equals(this.integrationPresenceSource, unifiedCommunicationsIntegration.integrationPresenceSource) &&
            Objects.equals(this.pbxPermission, unifiedCommunicationsIntegration.pbxPermission) &&
            Objects.equals(this.icon, unifiedCommunicationsIntegration.icon) &&
            Objects.equals(this.badgeIcons, unifiedCommunicationsIntegration.badgeIcons) &&
            Objects.equals(this.i10n, unifiedCommunicationsIntegration.i10n) &&
            Objects.equals(this.polledPresence, unifiedCommunicationsIntegration.polledPresence) &&
            Objects.equals(this.pollIntervalSec, unifiedCommunicationsIntegration.pollIntervalSec) &&
            Objects.equals(this.includeBadge, unifiedCommunicationsIntegration.includeBadge) &&
            Objects.equals(this.userPermissions, unifiedCommunicationsIntegration.userPermissions) &&
            Objects.equals(this.oauthScopes, unifiedCommunicationsIntegration.oauthScopes) &&
            Objects.equals(this.selfUri, unifiedCommunicationsIntegration.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, ucIntegrationKey, integrationPresenceSource, pbxPermission, icon, badgeIcons, i10n, polledPresence, pollIntervalSec, includeBadge, userPermissions, oauthScopes, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnifiedCommunicationsIntegration {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ucIntegrationKey: ").append(toIndentedString(ucIntegrationKey)).append("\n");
    sb.append("    integrationPresenceSource: ").append(toIndentedString(integrationPresenceSource)).append("\n");
    sb.append("    pbxPermission: ").append(toIndentedString(pbxPermission)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    badgeIcons: ").append(toIndentedString(badgeIcons)).append("\n");
    sb.append("    i10n: ").append(toIndentedString(i10n)).append("\n");
    sb.append("    polledPresence: ").append(toIndentedString(polledPresence)).append("\n");
    sb.append("    pollIntervalSec: ").append(toIndentedString(pollIntervalSec)).append("\n");
    sb.append("    includeBadge: ").append(toIndentedString(includeBadge)).append("\n");
    sb.append("    userPermissions: ").append(toIndentedString(userPermissions)).append("\n");
    sb.append("    oauthScopes: ").append(toIndentedString(oauthScopes)).append("\n");
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

