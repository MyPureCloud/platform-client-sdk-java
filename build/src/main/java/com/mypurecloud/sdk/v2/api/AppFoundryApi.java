package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.AppFoundryListingCategory;
import com.mypurecloud.sdk.v2.model.PagedListingEntity;


import com.mypurecloud.sdk.v2.api.request.GetAppfoundryPlatformNameCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetAppfoundryPlatformNameCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetAppfoundryPlatformNameCategorySubCategoryNameRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class AppFoundryApi {
  private final ApiClient pcapiClient;

  public AppFoundryApi() {
    this(Configuration.getDefaultApiClient());
  }

  public AppFoundryApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Return a structured hierarchy of available listing categories
   * 
   * @param platformName  (required)
   * @return List<AppFoundryListingCategory>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AppFoundryListingCategory> getAppfoundryPlatformNameCategories(String platformName) throws IOException, ApiException {
    return  getAppfoundryPlatformNameCategories(createGetAppfoundryPlatformNameCategoriesRequest(platformName));
  }

  /**
   * Return a structured hierarchy of available listing categories
   * 
   * @param platformName  (required)
   * @return List<AppFoundryListingCategory>
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AppFoundryListingCategory>> getAppfoundryPlatformNameCategoriesWithHttpInfo(String platformName) throws IOException {
    return getAppfoundryPlatformNameCategories(createGetAppfoundryPlatformNameCategoriesRequest(platformName).withHttpInfo());
  }

  private GetAppfoundryPlatformNameCategoriesRequest createGetAppfoundryPlatformNameCategoriesRequest(String platformName) {
    return GetAppfoundryPlatformNameCategoriesRequest.builder()
            .withPlatformName(platformName)
    
            .build();
  }

  /**
   * Return a structured hierarchy of available listing categories
   * 
   * @param request The request object
   * @return List<AppFoundryListingCategory>
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public List<AppFoundryListingCategory> getAppfoundryPlatformNameCategories(GetAppfoundryPlatformNameCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<List<AppFoundryListingCategory>> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<List<AppFoundryListingCategory>>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Return a structured hierarchy of available listing categories
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<List<AppFoundryListingCategory>> getAppfoundryPlatformNameCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<List<AppFoundryListingCategory>>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<List<AppFoundryListingCategory>> response = (ApiResponse<List<AppFoundryListingCategory>>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<List<AppFoundryListingCategory>> response = (ApiResponse<List<AppFoundryListingCategory>>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get listings that are part of the specified root category or a contained subcategory
   * 
   * @param platformName  (required)
   * @param categoryName Name of category to request listings from (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return PagedListingEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PagedListingEntity getAppfoundryPlatformNameCategory(String platformName, String categoryName, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getAppfoundryPlatformNameCategory(createGetAppfoundryPlatformNameCategoryRequest(platformName, categoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Get listings that are part of the specified root category or a contained subcategory
   * 
   * @param platformName  (required)
   * @param categoryName Name of category to request listings from (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return PagedListingEntity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PagedListingEntity> getAppfoundryPlatformNameCategoryWithHttpInfo(String platformName, String categoryName, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException {
    return getAppfoundryPlatformNameCategory(createGetAppfoundryPlatformNameCategoryRequest(platformName, categoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetAppfoundryPlatformNameCategoryRequest createGetAppfoundryPlatformNameCategoryRequest(String platformName, String categoryName, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) {
    return GetAppfoundryPlatformNameCategoryRequest.builder()
            .withPlatformName(platformName)
    
            .withCategoryName(categoryName)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Get listings that are part of the specified root category or a contained subcategory
   * 
   * @param request The request object
   * @return PagedListingEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PagedListingEntity getAppfoundryPlatformNameCategory(GetAppfoundryPlatformNameCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PagedListingEntity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PagedListingEntity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get listings that are part of the specified root category or a contained subcategory
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PagedListingEntity> getAppfoundryPlatformNameCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PagedListingEntity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get listings that are part of the specified subcategory
   * 
   * @param platformName  (required)
   * @param categoryName Name of category to request listings from (required)
   * @param subCategoryName Name of subcategory to request listings from (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return PagedListingEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PagedListingEntity getAppfoundryPlatformNameCategorySubCategoryName(String platformName, String categoryName, String subCategoryName, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException, ApiException {
    return  getAppfoundryPlatformNameCategorySubCategoryName(createGetAppfoundryPlatformNameCategorySubCategoryNameRequest(platformName, categoryName, subCategoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage));
  }

  /**
   * Get listings that are part of the specified subcategory
   * 
   * @param platformName  (required)
   * @param categoryName Name of category to request listings from (required)
   * @param subCategoryName Name of subcategory to request listings from (required)
   * @param pageSize The total page size requested (optional, default to 25)
   * @param pageNumber The page number requested (optional, default to 1)
   * @param sortBy variable name requested to sort by (optional)
   * @param expand variable name requested by expand list (optional)
   * @param nextPage next page token (optional)
   * @param previousPage Previous page token (optional)
   * @return PagedListingEntity
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PagedListingEntity> getAppfoundryPlatformNameCategorySubCategoryNameWithHttpInfo(String platformName, String categoryName, String subCategoryName, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) throws IOException {
    return getAppfoundryPlatformNameCategorySubCategoryName(createGetAppfoundryPlatformNameCategorySubCategoryNameRequest(platformName, categoryName, subCategoryName, pageSize, pageNumber, sortBy, expand, nextPage, previousPage).withHttpInfo());
  }

  private GetAppfoundryPlatformNameCategorySubCategoryNameRequest createGetAppfoundryPlatformNameCategorySubCategoryNameRequest(String platformName, String categoryName, String subCategoryName, Integer pageSize, Integer pageNumber, String sortBy, List<Object> expand, String nextPage, String previousPage) {
    return GetAppfoundryPlatformNameCategorySubCategoryNameRequest.builder()
            .withPlatformName(platformName)
    
            .withCategoryName(categoryName)
    
            .withSubCategoryName(subCategoryName)
    
            .withPageSize(pageSize)
    
            .withPageNumber(pageNumber)
    
            .withSortBy(sortBy)
    
            .withExpand(expand)
    
            .withNextPage(nextPage)
    
            .withPreviousPage(previousPage)
    
            .build();
  }

  /**
   * Get listings that are part of the specified subcategory
   * 
   * @param request The request object
   * @return PagedListingEntity
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public PagedListingEntity getAppfoundryPlatformNameCategorySubCategoryName(GetAppfoundryPlatformNameCategorySubCategoryNameRequest request) throws IOException, ApiException {
    try {
      ApiResponse<PagedListingEntity> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<PagedListingEntity>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get listings that are part of the specified subcategory
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<PagedListingEntity> getAppfoundryPlatformNameCategorySubCategoryName(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<PagedListingEntity>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)exception;
      return response;
    }
    catch (Throwable exception) {
      if (pcapiClient.getShouldThrowErrors()) {
        if (exception instanceof IOException) {
          throw (IOException)exception;
        }
        throw new RuntimeException(exception);
      }
      @SuppressWarnings("unchecked")
      ApiResponse<PagedListingEntity> response = (ApiResponse<PagedListingEntity>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
