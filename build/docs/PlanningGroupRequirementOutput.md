# PlanningGroupRequirementOutput


## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **id** | **String** | The ID of the planning group to which this output applies |  |
| **intervals** | **List&lt;Integer&gt;** | List of interval values that correspond with the requirements granularity that was requested |  [optional] |
| **errorDetails** | [**List&lt;LongTermRequirementsErrorDetail&gt;**](LongTermRequirementsErrorDetail) | Error details if the intervals cannot be provided for this planning group because of missing data or internal error |  [optional] |
| **serviceGoalDetails** | [**LongTermRequirementsServiceGoalDetail**](LongTermRequirementsServiceGoalDetail) | The service goal details used to generate the requirements |  [optional] |




_com.mypurecloud.sdk.v2:platform-client-v2:230.0.0_
