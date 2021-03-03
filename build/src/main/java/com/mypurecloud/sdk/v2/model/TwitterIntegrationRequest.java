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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * TwitterIntegrationRequest
 */

public class TwitterIntegrationRequest  implements Serializable {
  
  private String id = null;
  private String name = null;
  private String accessTokenKey = null;
  private String accessTokenSecret = null;
  private String consumerKey = null;
  private String consumerSecret = null;

  private static class TierEnumDeserializer extends StdDeserializer<TierEnum> {
    public TierEnumDeserializer() {
      super(TierEnumDeserializer.class);
    }

    @Override
    public TierEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return TierEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of twitter account to be used for the integration
   */
 @JsonDeserialize(using = TierEnumDeserializer.class)
  public enum TierEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PREMIUM("premium"),
    ENTERPRISE("enterprise");

    private String value;

    TierEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static TierEnum fromString(String key) {
      if (key == null) return null;

      for (TierEnum value : TierEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return TierEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private TierEnum tier = null;
  private String envName = null;
  private String selfUri = null;

  
  @ApiModelProperty(example = "null", value = "The globally unique identifier for the object.")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  
  /**
   * The name of the Twitter Integration
   **/
  public TwitterIntegrationRequest name(String name) {
    this.name = name;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The name of the Twitter Integration")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  
  /**
   * The Access Token Key from Twitter messenger
   **/
  public TwitterIntegrationRequest accessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Access Token Key from Twitter messenger")
  @JsonProperty("accessTokenKey")
  public String getAccessTokenKey() {
    return accessTokenKey;
  }
  public void setAccessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
  }

  
  /**
   * The Access Token Secret from Twitter messenger
   **/
  public TwitterIntegrationRequest accessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Access Token Secret from Twitter messenger")
  @JsonProperty("accessTokenSecret")
  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }
  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }

  
  /**
   * The Consumer Key from Twitter messenger
   **/
  public TwitterIntegrationRequest consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Consumer Key from Twitter messenger")
  @JsonProperty("consumerKey")
  public String getConsumerKey() {
    return consumerKey;
  }
  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  
  /**
   * The Consumer Secret from Twitter messenger
   **/
  public TwitterIntegrationRequest consumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The Consumer Secret from Twitter messenger")
  @JsonProperty("consumerSecret")
  public String getConsumerSecret() {
    return consumerSecret;
  }
  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }

  
  /**
   * The type of twitter account to be used for the integration
   **/
  public TwitterIntegrationRequest tier(TierEnum tier) {
    this.tier = tier;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The type of twitter account to be used for the integration")
  @JsonProperty("tier")
  public TierEnum getTier() {
    return tier;
  }
  public void setTier(TierEnum tier) {
    this.tier = tier;
  }

  
  /**
   * The Twitter environment name, e.g.: env-beta (required for premium tier)
   **/
  public TwitterIntegrationRequest envName(String envName) {
    this.envName = envName;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Twitter environment name, e.g.: env-beta (required for premium tier)")
  @JsonProperty("envName")
  public String getEnvName() {
    return envName;
  }
  public void setEnvName(String envName) {
    this.envName = envName;
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
    TwitterIntegrationRequest twitterIntegrationRequest = (TwitterIntegrationRequest) o;
    return Objects.equals(this.id, twitterIntegrationRequest.id) &&
        Objects.equals(this.name, twitterIntegrationRequest.name) &&
        Objects.equals(this.accessTokenKey, twitterIntegrationRequest.accessTokenKey) &&
        Objects.equals(this.accessTokenSecret, twitterIntegrationRequest.accessTokenSecret) &&
        Objects.equals(this.consumerKey, twitterIntegrationRequest.consumerKey) &&
        Objects.equals(this.consumerSecret, twitterIntegrationRequest.consumerSecret) &&
        Objects.equals(this.tier, twitterIntegrationRequest.tier) &&
        Objects.equals(this.envName, twitterIntegrationRequest.envName) &&
        Objects.equals(this.selfUri, twitterIntegrationRequest.selfUri);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accessTokenKey, accessTokenSecret, consumerKey, consumerSecret, tier, envName, selfUri);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwitterIntegrationRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accessTokenKey: ").append(toIndentedString(accessTokenKey)).append("\n");
    sb.append("    accessTokenSecret: ").append(toIndentedString(accessTokenSecret)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    tier: ").append(toIndentedString(tier)).append("\n");
    sb.append("    envName: ").append(toIndentedString(envName)).append("\n");
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

