# Leaderboard


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **division** | [**Division**](Division) | The targeted division for this leaderboard |  [optional] |
| **metric** | [**AddressableEntityRef**](AddressableEntityRef) | The metric id if the leaderboard is about a specific metric |  [optional] |
| **dateStartWorkday** | [**LocalDate**](LocalDate) | Start workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **dateEndWorkday** | [**LocalDate**](LocalDate) | End workday used as the date range. Dates are represented as an ISO-8601 string. For example: yyyy-MM-dd |  [optional] |
| **leaders** | [**List&lt;LeaderboardItem&gt;**](LeaderboardItem) | The list of leaders generated. |  [optional] |
| **userRank** | [**LeaderboardItem**](LeaderboardItem) | The requesting user's rank |  [optional] |
| **performanceProfile** | [**AddressableEntityRef**](AddressableEntityRef) | The targeted performance profile for the average points |  [optional] |
{: class="table table-striped"}



