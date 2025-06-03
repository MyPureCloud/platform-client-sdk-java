# ImportTemplate


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The globally unique identifier for the object. |  [optional] |
| **name** | **String** | The name of the import template. |  [optional] |
| **dateCreated** | [**Date**](Date) | Creation time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **dateModified** | [**Date**](Date) | Last modified time of the entity. Date time is represented as an ISO-8601 string. For example: yyyy-MM-ddTHH:mm:ss[.mmm]Z |  [optional] |
| **version** | **Integer** | Required for updates, must match the version number of the most recent update |  [optional] |
| **contactListTemplate** | [**DomainEntityRef**](DomainEntityRef) | ContactListTemplate for this ImportTemplate. |  |
| **contactListFilter** | [**DomainEntityRef**](DomainEntityRef) | ContactListFilter for this ImportTemplate. |  [optional] |
| **useSplittingCriteria** | **Boolean** | Whether or not to use splitting criteria. Default is false. |  [optional] |
| **splittingInformation** | [**SplittingInformation**](SplittingInformation) | How to split contact records, required if useSplittingCriteria is true. |  [optional] |
| **listNameFormat** | [**ListNameFormatEnum**](#Enum--ListNameFormatEnum) | The list name format for target ContactLists. When Custom is provided, customListNameFormatValue is required. |  [optional] |
| **customListNameFormatValue** | **String** | Custom value for the list name format, at least %N is required. Any character other than the specified tokens will be used as is. Available tokens: %N: ListNamePrefix; %P: Part number; %F: Filter name; %C: Column value; YYYY: year; MM: month; DD: day; hh: hour; mm: minute; ss: second. |  [optional] |
| **importStatus** | [**ImportStatus**](ImportStatus) | The status of the import process. |  [optional] |
| **selfUri** | **String** | The URI for this object |  [optional] |


## Enum: ListNameFormatEnum

| Name | Value |
| ---- | ----- |
| OUTDATEDSDKVERSION | &quot;OutdatedSdkVersion&quot; | 
| LISTNAMEPREFIX | &quot;ListNamePrefix&quot; | 
| LISTNAMEPREFIXMONTHDAYYEAR | &quot;ListNamePrefixMonthDayYear&quot; | 
| LISTNAMEPREFIXMONTHDAYYEARHOURMINUTESECOND | &quot;ListNamePrefixMonthDayYearHourMinuteSecond&quot; | 
| LISTNAMEPREFIXPART | &quot;ListNamePrefixPart&quot; | 
| LISTNAMEPREFIXMONTHDAYYEARPART | &quot;ListNamePrefixMonthDayYearPart&quot; | 
| LISTNAMEPREFIXMONTHDAYYEARHOURMINUTESECONDPART | &quot;ListNamePrefixMonthDayYearHourMinuteSecondPart&quot; | 
| CUSTOM | &quot;Custom&quot; | 




_com.mypurecloud.sdk.v2:platform-client-v2:226.0.0_
