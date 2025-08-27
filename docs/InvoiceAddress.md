# InvoiceAddress


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **getdateEffective** | [**LocalDate**](LocalDate) | The date when the Address became effective. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **addressType** | [**AddressTypeEnum**](#Enum--AddressTypeEnum) | The type of address. |  [optional] |
| **currencyIsoCode** | **String** | Contains the ISO code for any currency allowed by the organization. |  [optional] |
| **line1** | **String** | The first line of the Address. |  [optional] |
| **line2** | **String** | The second line of the Address. |  [optional] |
| **line3** | **String** | The third line of the Address. |  [optional] |
| **cityName** | **String** | The city name. |  [optional] |
| **postalCode** | **String** | The Postal or Zip Code. |  [optional] |
| **stateCode** | **String** | The code that reflects the geographic state for the Address. |  [optional] |
| **countryCode** | **String** | The code representing the country for the Address (ISO_3166). |  [optional] |
| **getcitySubdivision1** | **String** | The primary subdivision within a city (e.g., district, neighborhood). |  [optional] |
| **regionSubdivision1** | **String** | The primary administrative division within a region (e.g., state, province). |  [optional] |
| **regionSubdivision2** | **String** | A secondary subdivision within the primary region subdivision (e.g., county, district). |  [optional] |
| **country** | **String** | Stores the name of the country in which the address is situated. |  [optional] |


## Enum: AddressTypeEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| BILLTO | &quot;BillTo&quot; | 
| SHIPTO | &quot;ShipTo&quot; | 
| ENDUSER | &quot;EndUser&quot; | 
| SOLDTO | &quot;SoldTo&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
