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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * NetworkConnectivity
 */

public class NetworkConnectivity  implements Serializable {
  
  private String carrier = null;
  private Boolean bluetoothEnabled = null;
  private Boolean cellularEnabled = null;
  private Boolean wifiEnabled = null;

  public NetworkConnectivity() {
    if (ApiClient.LEGACY_EMPTY_LIST == true) { 
    }
  }

  
  /**
   * The name of the network carrier.
   **/
  public NetworkConnectivity carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "The name of the network carrier.")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  /**
   * Whether Bluetooth is enabled.
   **/
  public NetworkConnectivity bluetoothEnabled(Boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether Bluetooth is enabled.")
  @JsonProperty("bluetoothEnabled")
  public Boolean getBluetoothEnabled() {
    return bluetoothEnabled;
  }
  public void setBluetoothEnabled(Boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
  }


  /**
   * Whether Cellular is enabled.
   **/
  public NetworkConnectivity cellularEnabled(Boolean cellularEnabled) {
    this.cellularEnabled = cellularEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether Cellular is enabled.")
  @JsonProperty("cellularEnabled")
  public Boolean getCellularEnabled() {
    return cellularEnabled;
  }
  public void setCellularEnabled(Boolean cellularEnabled) {
    this.cellularEnabled = cellularEnabled;
  }


  /**
   * Whether Wi-Fi is enabled.
   **/
  public NetworkConnectivity wifiEnabled(Boolean wifiEnabled) {
    this.wifiEnabled = wifiEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", required = true, value = "Whether Wi-Fi is enabled.")
  @JsonProperty("wifiEnabled")
  public Boolean getWifiEnabled() {
    return wifiEnabled;
  }
  public void setWifiEnabled(Boolean wifiEnabled) {
    this.wifiEnabled = wifiEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NetworkConnectivity networkConnectivity = (NetworkConnectivity) o;

    return Objects.equals(this.carrier, networkConnectivity.carrier) &&
            Objects.equals(this.bluetoothEnabled, networkConnectivity.bluetoothEnabled) &&
            Objects.equals(this.cellularEnabled, networkConnectivity.cellularEnabled) &&
            Objects.equals(this.wifiEnabled, networkConnectivity.wifiEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, bluetoothEnabled, cellularEnabled, wifiEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NetworkConnectivity {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    bluetoothEnabled: ").append(toIndentedString(bluetoothEnabled)).append("\n");
    sb.append("    cellularEnabled: ").append(toIndentedString(cellularEnabled)).append("\n");
    sb.append("    wifiEnabled: ").append(toIndentedString(wifiEnabled)).append("\n");
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

