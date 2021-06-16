Platform API version: 4770


Switching guava dependency from Android to JRE

# Major Changes (27 changes)

**GET /api/v2/architect/schedulegroups** (1 change)

* Parameter divisionId was added

**GET /api/v2/architect/schedules** (1 change)

* Parameter divisionId was added

**GET /api/v2/gamification/metrics/{metricId}** (1 change)

* Parameter performance profile id was added

**PUT /api/v2/gamification/metrics/{metricId}** (1 change)

* Parameter performance profile id was added

**GET /api/v2/journey/actiontemplates** (2 changes)

* Parameter queryFields was added
* Parameter queryValue was added

**PerformanceProfile** (3 changes)

* Required property reportingIntervals was added
* Required property active was added
* Required property maxLeaderboardRankSize was added

**EntityListing** (5 changes)

* Property pageSize was removed
* Property pageNumber was removed
* Property total was removed
* Property pageCount was removed
* Property entities was changed from DataTableImportJob[] to object[]

**AuditLogMessage** (5 changes)

* Enum value ConversationMessaging was removed from property serviceName
* Enum value PhoneNumber was removed from property entityType
* Enum value Recipient was removed from property entityType
* Enum value Account was removed from property entityType
* Enum value DefaultSupportedContent was removed from property entityType

**AuditRealtimeQueryRequest** (1 change)

* Enum value ConversationMessaging was removed from property serviceName

**AuditQueryExecutionStatusResponse** (1 change)

* Enum value ConversationMessaging was removed from property serviceName

**AuditQueryEntity** (4 changes)

* Enum value PhoneNumber was removed from property name
* Enum value Recipient was removed from property name
* Enum value Account was removed from property name
* Enum value DefaultSupportedContent was removed from property name

**AuditQueryService** (1 change)

* Enum value ConversationMessaging was removed from property name

**AuditQueryRequest** (1 change)

* Enum value ConversationMessaging was removed from property serviceName


# Minor Changes (43 changes)

**/api/v2/workforcemanagement/agents/{agentId}/managementunit** (2 changes)

* Path was added
* Operation GET was added

**/api/v2/workforcemanagement/agents/me/managementunit** (2 changes)

* Path was added
* Operation GET was added

**PerformanceProfile** (2 changes)

* Optional property division was added
* Optional property dateCreated was added

**ReportingInterval** (1 change)

* Model was added

**ViewFilter** (1 change)

* Optional property isNotResponding was added

**Leaderboard** (1 change)

* Optional property userRank was added

**WorkPlan** (1 change)

* Optional property valid was added

**WorkPlanActivity** (1 change)

* Optional property validationId was added

**WorkPlanShift** (1 change)

* Optional property validationId was added

**WorkPlanListItemResponse** (1 change)

* Optional property valid was added

**WorkPlanValidationRequest** (1 change)

* Optional property valid was added

**AgentManagementUnitReference** (1 change)

* Model was added

**AuditLogMessage** (9 changes)

* Enum value Datatables was added to property serviceName
* Enum value Messaging was added to property serviceName
* Enum value Bulk was added to property entityType
* Enum value Row was added to property entityType
* Enum value Schema was added to property entityType
* Enum value ConversationPhoneNumber was added to property entityType
* Enum value ConversationRecipient was added to property entityType
* Enum value ConversationAccount was added to property entityType
* Enum value ConversationDefaultSupportedContent was added to property entityType

**AuditRealtimeQueryRequest** (2 changes)

* Enum value Datatables was added to property serviceName
* Enum value Messaging was added to property serviceName

**AuditQueryExecutionStatusResponse** (2 changes)

* Enum value Datatables was added to property serviceName
* Enum value Messaging was added to property serviceName

**AuditQueryEntity** (7 changes)

* Enum value Bulk was added to property name
* Enum value Row was added to property name
* Enum value Schema was added to property name
* Enum value ConversationPhoneNumber was added to property name
* Enum value ConversationRecipient was added to property name
* Enum value ConversationAccount was added to property name
* Enum value ConversationDefaultSupportedContent was added to property name

**AuditQueryService** (2 changes)

* Enum value Datatables was added to property name
* Enum value Messaging was added to property name

**AuditQueryRequest** (2 changes)

* Enum value Datatables was added to property serviceName
* Enum value Messaging was added to property serviceName

**JourneyAggregateQueryPredicate** (1 change)

* Enum value journeyBlockingEmergencyScheduleGroupId was added to property dimension

**JourneyAggregationQuery** (1 change)

* Enum value journeyBlockingEmergencyScheduleGroupId was added to property groupBy

**CrossPlatformPolicyUpdate** (1 change)

* Model was added

**PolicyUpdate** (1 change)

* Model was added


# Point Changes (21 changes)

**GET /api/v2/gamification/leaderboard** (1 change)

* Summary was changed

**GET /api/v2/gamification/leaderboard/all** (1 change)

* Summary was changed

**GET /api/v2/gamification/scorecards/users/{userId}** (1 change)

* Description was changed for parameter workday

**GET /api/v2/gamification/scorecards/users/{userId}/attendance** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/users/{userId}/points/trends** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/users/{userId}/points/alltime** (1 change)

* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/users/{userId}/values/trends** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/users/values/trends** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday

**GET /api/v2/journey/actiontemplates** (1 change)

* Description was changed for parameter state

**GET /api/v2/gamification/scorecards** (1 change)

* Description was changed for parameter workday

**GET /api/v2/gamification/scorecards/attendance** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/points/alltime** (1 change)

* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/points/trends** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday

**GET /api/v2/gamification/scorecards/values/trends** (2 changes)

* Description was changed for parameter startWorkday
* Description was changed for parameter endWorkday
