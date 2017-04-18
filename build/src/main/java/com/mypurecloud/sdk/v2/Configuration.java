package com.mypurecloud.sdk.v2;


public class Configuration {
  private static ApiClient defaultApiClient = null;

  /**
   * Get the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static ApiClient getDefaultApiClient() {
    if (defaultApiClient == null)
      defaultApiClient = new ApiClient();
    return defaultApiClient;
   }

  /**
   * Set the default API client, which would be used when creating API
   * instances without providing an API client.
   */
  public static void setDefaultApiClient(ApiClient apiClient) {
    defaultApiClient = apiClient;
  }
}
