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
import com.mypurecloud.sdk.v2.model.DomainEntityRef;
import com.mypurecloud.sdk.v2.model.EdgeOfflineConfigurationNetwork;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * EdgeOfflineConfiguration
 */

public class EdgeOfflineConfiguration  implements Serializable {
  
  private String pairingId = null;
  private EdgeOfflineConfigurationNetwork network = null;
  private Boolean useVerificationCode = null;

  private static class CertTypeEnumDeserializer extends StdDeserializer<CertTypeEnum> {
    public CertTypeEnumDeserializer() {
      super(CertTypeEnumDeserializer.class);
    }

    @Override
    public CertTypeEnum deserialize(JsonParser jsonParser, DeserializationContext ctxt)
            throws IOException {
      JsonNode node = jsonParser.getCodec().readTree(jsonParser);
      return CertTypeEnum.fromString(node.toString().replace("\"", ""));
    }
  }
  /**
   * The type of Certificate Authority this Edge will use. Defaults to NotRequested if the Edge is already provisioned. PureCloud signed CA is recommended. Public CA signed by a trusted third party. China CA must be used if the Site's Location is in China.
   */
 @JsonDeserialize(using = CertTypeEnumDeserializer.class)
  public enum CertTypeEnum {
    OUTDATEDSDKVERSION("OutdatedSdkVersion"),
    PURECLOUD("PureCloud"),
    PUBLIC("Public"),
    CHINA("China"),
    NOTREQUESTED("NotRequested");

    private String value;

    CertTypeEnum(String value) {
      this.value = value;
    }

    @JsonCreator
    public static CertTypeEnum fromString(String key) {
      if (key == null) return null;

      for (CertTypeEnum value : CertTypeEnum.values()) {
        if (key.equalsIgnoreCase(value.toString())) {
          return value;
        }
      }

      return CertTypeEnum.values()[0];
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }
  private CertTypeEnum certType = null;
  private DomainEntityRef site = null;
  private String proxy = null;

  public EdgeOfflineConfiguration() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  public EdgeOfflineConfiguration(Boolean initWithEmptyList) {
    if (initWithEmptyList == true) { 
    }
  }

  
  /**
   * The pairingId for your hardware Edge in the format: 00000-00000-00000-00000-00000.
   **/
  public EdgeOfflineConfiguration pairingId(String pairingId) {
    this.pairingId = pairingId;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "The pairingId for your hardware Edge in the format: 00000-00000-00000-00000-00000.")
  @JsonProperty("pairingId")
  public String getPairingId() {
    return pairingId;
  }
  public void setPairingId(String pairingId) {
    this.pairingId = pairingId;
  }


  /**
   * Network settings for your hardware Edge.
   **/
  public EdgeOfflineConfiguration network(EdgeOfflineConfigurationNetwork network) {
    this.network = network;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Network settings for your hardware Edge.")
  @JsonProperty("network")
  public EdgeOfflineConfigurationNetwork getNetwork() {
    return network;
  }
  public void setNetwork(EdgeOfflineConfigurationNetwork network) {
    this.network = network;
  }


  /**
   * Boolean to know if the verification code will be used to provision the Edge. Only used if the Edge is being provisioned.
   **/
  public EdgeOfflineConfiguration useVerificationCode(Boolean useVerificationCode) {
    this.useVerificationCode = useVerificationCode;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Boolean to know if the verification code will be used to provision the Edge. Only used if the Edge is being provisioned.")
  @JsonProperty("useVerificationCode")
  public Boolean getUseVerificationCode() {
    return useVerificationCode;
  }
  public void setUseVerificationCode(Boolean useVerificationCode) {
    this.useVerificationCode = useVerificationCode;
  }


  /**
   * The type of Certificate Authority this Edge will use. Defaults to NotRequested if the Edge is already provisioned. PureCloud signed CA is recommended. Public CA signed by a trusted third party. China CA must be used if the Site's Location is in China.
   **/
  public EdgeOfflineConfiguration certType(CertTypeEnum certType) {
    this.certType = certType;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The type of Certificate Authority this Edge will use. Defaults to NotRequested if the Edge is already provisioned. PureCloud signed CA is recommended. Public CA signed by a trusted third party. China CA must be used if the Site's Location is in China.")
  @JsonProperty("certType")
  public CertTypeEnum getCertType() {
    return certType;
  }
  public void setCertType(CertTypeEnum certType) {
    this.certType = certType;
  }


  /**
   * The Site that will be associated to the Edge. Required if the Edge is being provisioned.
   **/
  public EdgeOfflineConfiguration site(DomainEntityRef site) {
    this.site = site;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The Site that will be associated to the Edge. Required if the Edge is being provisioned.")
  @JsonProperty("site")
  public DomainEntityRef getSite() {
    return site;
  }
  public void setSite(DomainEntityRef site) {
    this.site = site;
  }


  /**
   * Edge HTTP proxy configuration for the WAN port. The field can be a hostname, FQDN, IPv4 or IPv6 address. If port is not included, port 80 is assumed.
   **/
  public EdgeOfflineConfiguration proxy(String proxy) {
    this.proxy = proxy;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "Edge HTTP proxy configuration for the WAN port. The field can be a hostname, FQDN, IPv4 or IPv6 address. If port is not included, port 80 is assumed.")
  @JsonProperty("proxy")
  public String getProxy() {
    return proxy;
  }
  public void setProxy(String proxy) {
    this.proxy = proxy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EdgeOfflineConfiguration edgeOfflineConfiguration = (EdgeOfflineConfiguration) o;

    return Objects.equals(this.pairingId, edgeOfflineConfiguration.pairingId) &&
            Objects.equals(this.network, edgeOfflineConfiguration.network) &&
            Objects.equals(this.useVerificationCode, edgeOfflineConfiguration.useVerificationCode) &&
            Objects.equals(this.certType, edgeOfflineConfiguration.certType) &&
            Objects.equals(this.site, edgeOfflineConfiguration.site) &&
            Objects.equals(this.proxy, edgeOfflineConfiguration.proxy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pairingId, network, useVerificationCode, certType, site, proxy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EdgeOfflineConfiguration {\n");
    
    sb.append("    pairingId: ").append(toIndentedString(pairingId)).append("\n");
    sb.append("    network: ").append(toIndentedString(network)).append("\n");
    sb.append("    useVerificationCode: ").append(toIndentedString(useVerificationCode)).append("\n");
    sb.append("    certType: ").append(toIndentedString(certType)).append("\n");
    sb.append("    site: ").append(toIndentedString(site)).append("\n");
    sb.append("    proxy: ").append(toIndentedString(proxy)).append("\n");
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

