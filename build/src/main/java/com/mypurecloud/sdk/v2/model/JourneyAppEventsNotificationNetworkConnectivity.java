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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;
/**
 * JourneyAppEventsNotificationNetworkConnectivity
 */

public class JourneyAppEventsNotificationNetworkConnectivity  implements Serializable {
  
  private String carrier = null;
  private Boolean bluetoothEnabled = null;
  private Boolean cellularEnabled = null;
  private Boolean wifiEnabled = null;

  
  /**
   **/
  public JourneyAppEventsNotificationNetworkConnectivity carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("carrier")
  public String getCarrier() {
    return carrier;
  }
  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }


  /**
   **/
  public JourneyAppEventsNotificationNetworkConnectivity bluetoothEnabled(Boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("bluetoothEnabled")
  public Boolean getBluetoothEnabled() {
    return bluetoothEnabled;
  }
  public void setBluetoothEnabled(Boolean bluetoothEnabled) {
    this.bluetoothEnabled = bluetoothEnabled;
  }


  /**
   **/
  public JourneyAppEventsNotificationNetworkConnectivity cellularEnabled(Boolean cellularEnabled) {
    this.cellularEnabled = cellularEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
  @JsonProperty("cellularEnabled")
  public Boolean getCellularEnabled() {
    return cellularEnabled;
  }
  public void setCellularEnabled(Boolean cellularEnabled) {
    this.cellularEnabled = cellularEnabled;
  }


  /**
   **/
  public JourneyAppEventsNotificationNetworkConnectivity wifiEnabled(Boolean wifiEnabled) {
    this.wifiEnabled = wifiEnabled;
    return this;
  }
  
  @ApiModelProperty(example = "null", value = "")
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
    JourneyAppEventsNotificationNetworkConnectivity journeyAppEventsNotificationNetworkConnectivity = (JourneyAppEventsNotificationNetworkConnectivity) o;

    return Objects.equals(this.carrier, journeyAppEventsNotificationNetworkConnectivity.carrier) &&
            Objects.equals(this.bluetoothEnabled, journeyAppEventsNotificationNetworkConnectivity.bluetoothEnabled) &&
            Objects.equals(this.cellularEnabled, journeyAppEventsNotificationNetworkConnectivity.cellularEnabled) &&
            Objects.equals(this.wifiEnabled, journeyAppEventsNotificationNetworkConnectivity.wifiEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, bluetoothEnabled, cellularEnabled, wifiEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyAppEventsNotificationNetworkConnectivity {\n");
    
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

