package com.mypurecloud.sdk.v2.api;

import com.fasterxml.jackson.core.type.TypeReference;

import com.mypurecloud.sdk.v2.ApiException;
import com.mypurecloud.sdk.v2.ApiClient;
import com.mypurecloud.sdk.v2.ApiRequest;
import com.mypurecloud.sdk.v2.ApiResponse;
import com.mypurecloud.sdk.v2.Configuration;
import com.mypurecloud.sdk.v2.model.*;
import com.mypurecloud.sdk.v2.Pair;

import com.mypurecloud.sdk.v2.model.KnowledgeBase;
import com.mypurecloud.sdk.v2.model.ErrorBody;
import com.mypurecloud.sdk.v2.model.KnowledgeCategory;
import com.mypurecloud.sdk.v2.model.KnowledgeDocument;
import com.mypurecloud.sdk.v2.model.CategoryListing;
import com.mypurecloud.sdk.v2.model.KnowledgeExtendedCategory;
import com.mypurecloud.sdk.v2.model.DocumentListing;
import com.mypurecloud.sdk.v2.model.KnowledgeImport;
import com.mypurecloud.sdk.v2.model.KnowledgeTraining;
import com.mypurecloud.sdk.v2.model.TrainingListing;
import com.mypurecloud.sdk.v2.model.KnowledgeBaseListing;
import com.mypurecloud.sdk.v2.model.KnowledgeCategoryRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeDocumentBulkRequest;
import com.mypurecloud.sdk.v2.model.ImportStatusRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlRequest;
import com.mypurecloud.sdk.v2.model.UploadUrlResponse;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchRequest;
import com.mypurecloud.sdk.v2.model.KnowledgeSearchResponse;


import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageTrainingRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebaseLanguageTrainingsRequest;
import com.mypurecloud.sdk.v2.api.request.GetKnowledgeKnowledgebasesRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageCategoryRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeDocumentuploadsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageCategoriesRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseLanguageTrainingsRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebaseSearchRequest;
import com.mypurecloud.sdk.v2.api.request.PostKnowledgeKnowledgebasesRequest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KnowledgeApi {
  private final ApiClient pcapiClient;

  public KnowledgeApi() {
    this(Configuration.getDefaultApiClient());
  }

  public KnowledgeApi(ApiClient apiClient) {
    this.pcapiClient = apiClient;
  }

  
  /**
   * Delete knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase deleteKnowledgeKnowledgebase(String knowledgeBaseId) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebase(createDeleteKnowledgeKnowledgebaseRequest(knowledgeBaseId));
  }

  /**
   * Delete knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> deleteKnowledgeKnowledgebaseWithHttpInfo(String knowledgeBaseId) throws IOException {
    return deleteKnowledgeKnowledgebase(createDeleteKnowledgeKnowledgebaseRequest(knowledgeBaseId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseRequest createDeleteKnowledgeKnowledgebaseRequest(String knowledgeBaseId) {
    return DeleteKnowledgeKnowledgebaseRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .build();
  }

  /**
   * Delete knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase deleteKnowledgeKnowledgebase(DeleteKnowledgeKnowledgebaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> deleteKnowledgeKnowledgebase(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeCategory deleteKnowledgeKnowledgebaseLanguageCategory(String categoryId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebaseLanguageCategory(createDeleteKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode));
  }

  /**
   * Delete category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeCategory> deleteKnowledgeKnowledgebaseLanguageCategoryWithHttpInfo(String categoryId, String knowledgeBaseId, String languageCode) throws IOException {
    return deleteKnowledgeKnowledgebaseLanguageCategory(createDeleteKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLanguageCategoryRequest createDeleteKnowledgeKnowledgebaseLanguageCategoryRequest(String categoryId, String knowledgeBaseId, String languageCode) {
    return DeleteKnowledgeKnowledgebaseLanguageCategoryRequest.builder()
            .withCategoryId(categoryId)
    
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .build();
  }

  /**
   * Delete category
   * 
   * @param request The request object
   * @return KnowledgeCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeCategory deleteKnowledgeKnowledgebaseLanguageCategory(DeleteKnowledgeKnowledgebaseLanguageCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeCategory> deleteKnowledgeKnowledgebaseLanguageCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeCategory> response = (ApiResponse<KnowledgeCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeCategory> response = (ApiResponse<KnowledgeCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument deleteKnowledgeKnowledgebaseLanguageDocument(String documentId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  deleteKnowledgeKnowledgebaseLanguageDocument(createDeleteKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode));
  }

  /**
   * Delete document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> deleteKnowledgeKnowledgebaseLanguageDocumentWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode) throws IOException {
    return deleteKnowledgeKnowledgebaseLanguageDocument(createDeleteKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLanguageDocumentRequest createDeleteKnowledgeKnowledgebaseLanguageDocumentRequest(String documentId, String knowledgeBaseId, String languageCode) {
    return DeleteKnowledgeKnowledgebaseLanguageDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .build();
  }

  /**
   * Delete document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument deleteKnowledgeKnowledgebaseLanguageDocument(DeleteKnowledgeKnowledgebaseLanguageDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Delete document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> deleteKnowledgeKnowledgebaseLanguageDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Delete import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseLanguageDocumentsImport(String knowledgeBaseId, String languageCode, String importId) throws IOException, ApiException {
     deleteKnowledgeKnowledgebaseLanguageDocumentsImport(createDeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId));
  }

  /**
   * Delete import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseLanguageDocumentsImportWithHttpInfo(String knowledgeBaseId, String languageCode, String importId) throws IOException {
    return deleteKnowledgeKnowledgebaseLanguageDocumentsImport(createDeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId).withHttpInfo());
  }

  private DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest createDeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest(String knowledgeBaseId, String languageCode, String importId) {
    return DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withImportId(importId)
    
            .build();
  }

  /**
   * Delete import operation
   * 
   * @param request The request object
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public void deleteKnowledgeKnowledgebaseLanguageDocumentsImport(DeleteKnowledgeKnowledgebaseLanguageDocumentsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<Void> response = pcapiClient.invoke(request.withHttpInfo(), null);
      
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      
    }
  }

  /**
   * Delete import operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<Void> deleteKnowledgeKnowledgebaseLanguageDocumentsImport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, null);
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)exception;
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
      ApiResponse<Void> response = (ApiResponse<Void>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase getKnowledgeKnowledgebase(String knowledgeBaseId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebase(createGetKnowledgeKnowledgebaseRequest(knowledgeBaseId));
  }

  /**
   * Get knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> getKnowledgeKnowledgebaseWithHttpInfo(String knowledgeBaseId) throws IOException {
    return getKnowledgeKnowledgebase(createGetKnowledgeKnowledgebaseRequest(knowledgeBaseId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseRequest createGetKnowledgeKnowledgebaseRequest(String knowledgeBaseId) {
    return GetKnowledgeKnowledgebaseRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .build();
  }

  /**
   * Get knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase getKnowledgeKnowledgebase(GetKnowledgeKnowledgebaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> getKnowledgeKnowledgebase(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get categories
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @return CategoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryListing getKnowledgeKnowledgebaseLanguageCategories(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String name) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageCategories(createGetKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, name));
  }

  /**
   * Get categories
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter to return the categories that starts with the given category name. (optional)
   * @return CategoryListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryListing> getKnowledgeKnowledgebaseLanguageCategoriesWithHttpInfo(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String name) throws IOException {
    return getKnowledgeKnowledgebaseLanguageCategories(createGetKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, name).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageCategoriesRequest createGetKnowledgeKnowledgebaseLanguageCategoriesRequest(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String name) {
    return GetKnowledgeKnowledgebaseLanguageCategoriesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .withPageSize(pageSize)
    
            .withName(name)
    
            .build();
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return CategoryListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public CategoryListing getKnowledgeKnowledgebaseLanguageCategories(GetKnowledgeKnowledgebaseLanguageCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<CategoryListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<CategoryListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get categories
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<CategoryListing> getKnowledgeKnowledgebaseLanguageCategories(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<CategoryListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<CategoryListing> response = (ApiResponse<CategoryListing>)(ApiResponse<?>)exception;
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
      ApiResponse<CategoryListing> response = (ApiResponse<CategoryListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExtendedCategory getKnowledgeKnowledgebaseLanguageCategory(String categoryId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageCategory(createGetKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode));
  }

  /**
   * Get category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeExtendedCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExtendedCategory> getKnowledgeKnowledgebaseLanguageCategoryWithHttpInfo(String categoryId, String knowledgeBaseId, String languageCode) throws IOException {
    return getKnowledgeKnowledgebaseLanguageCategory(createGetKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageCategoryRequest createGetKnowledgeKnowledgebaseLanguageCategoryRequest(String categoryId, String knowledgeBaseId, String languageCode) {
    return GetKnowledgeKnowledgebaseLanguageCategoryRequest.builder()
            .withCategoryId(categoryId)
    
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .build();
  }

  /**
   * Get category
   * 
   * @param request The request object
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExtendedCategory getKnowledgeKnowledgebaseLanguageCategory(GetKnowledgeKnowledgebaseLanguageCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExtendedCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExtendedCategory> getKnowledgeKnowledgebaseLanguageCategory(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExtendedCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument getKnowledgeKnowledgebaseLanguageDocument(String documentId, String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocument(createGetKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode));
  }

  /**
   * Get document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> getKnowledgeKnowledgebaseLanguageDocumentWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocument(createGetKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentRequest createGetKnowledgeKnowledgebaseLanguageDocumentRequest(String documentId, String knowledgeBaseId, String languageCode) {
    return GetKnowledgeKnowledgebaseLanguageDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .build();
  }

  /**
   * Get document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument getKnowledgeKnowledgebaseLanguageDocument(GetKnowledgeKnowledgebaseLanguageDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> getKnowledgeKnowledgebaseLanguageDocument(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param categories Filter by categories ids, comma separated values expected. (optional)
   * @param title Filter by document title. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @param documentIds Comma-separated list of document identifiers to fetch by. (optional)
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentListing getKnowledgeKnowledgebaseLanguageDocuments(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String categories, String title, String sortBy, String sortOrder, List<String> documentIds) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocuments(createGetKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title, sortBy, sortOrder, documentIds));
  }

  /**
   * Get documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param categories Filter by categories ids, comma separated values expected. (optional)
   * @param title Filter by document title. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @param documentIds Comma-separated list of document identifiers to fetch by. (optional)
   * @return DocumentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentListing> getKnowledgeKnowledgebaseLanguageDocumentsWithHttpInfo(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String categories, String title, String sortBy, String sortOrder, List<String> documentIds) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocuments(createGetKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, categories, title, sortBy, sortOrder, documentIds).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentsRequest createGetKnowledgeKnowledgebaseLanguageDocumentsRequest(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String categories, String title, String sortBy, String sortOrder, List<String> documentIds) {
    return GetKnowledgeKnowledgebaseLanguageDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .withPageSize(pageSize)
    
            .withCategories(categories)
    
            .withTitle(title)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .withDocumentIds(documentIds)
    
            .build();
  }

  /**
   * Get documents
   * 
   * @param request The request object
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentListing getKnowledgeKnowledgebaseLanguageDocuments(GetKnowledgeKnowledgebaseLanguageDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentListing> getKnowledgeKnowledgebaseLanguageDocuments(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get import operation report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImport getKnowledgeKnowledgebaseLanguageDocumentsImport(String knowledgeBaseId, String languageCode, String importId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageDocumentsImport(createGetKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId));
  }

  /**
   * Get import operation report
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @return KnowledgeImport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImport> getKnowledgeKnowledgebaseLanguageDocumentsImportWithHttpInfo(String knowledgeBaseId, String languageCode, String importId) throws IOException {
    return getKnowledgeKnowledgebaseLanguageDocumentsImport(createGetKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest createGetKnowledgeKnowledgebaseLanguageDocumentsImportRequest(String knowledgeBaseId, String languageCode, String importId) {
    return GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withImportId(importId)
    
            .build();
  }

  /**
   * Get import operation report
   * 
   * @param request The request object
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImport getKnowledgeKnowledgebaseLanguageDocumentsImport(GetKnowledgeKnowledgebaseLanguageDocumentsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get import operation report
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImport> getKnowledgeKnowledgebaseLanguageDocumentsImport(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get training detail
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeTraining getKnowledgeKnowledgebaseLanguageTraining(String knowledgeBaseId, String languageCode, String trainingId) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageTraining(createGetKnowledgeKnowledgebaseLanguageTrainingRequest(knowledgeBaseId, languageCode, trainingId));
  }

  /**
   * Get training detail
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeTraining> getKnowledgeKnowledgebaseLanguageTrainingWithHttpInfo(String knowledgeBaseId, String languageCode, String trainingId) throws IOException {
    return getKnowledgeKnowledgebaseLanguageTraining(createGetKnowledgeKnowledgebaseLanguageTrainingRequest(knowledgeBaseId, languageCode, trainingId).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageTrainingRequest createGetKnowledgeKnowledgebaseLanguageTrainingRequest(String knowledgeBaseId, String languageCode, String trainingId) {
    return GetKnowledgeKnowledgebaseLanguageTrainingRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withTrainingId(trainingId)
    
            .build();
  }

  /**
   * Get training detail
   * 
   * @param request The request object
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeTraining getKnowledgeKnowledgebaseLanguageTraining(GetKnowledgeKnowledgebaseLanguageTrainingRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeTraining> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get training detail
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeTraining> getKnowledgeKnowledgebaseLanguageTraining(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeTraining>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param knowledgeDocumentsState Return the training with the specified state of the trained documents. (optional)
   * @return TrainingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrainingListing getKnowledgeKnowledgebaseLanguageTrainings(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String knowledgeDocumentsState) throws IOException, ApiException {
    return  getKnowledgeKnowledgebaseLanguageTrainings(createGetKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState));
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param knowledgeDocumentsState Return the training with the specified state of the trained documents. (optional)
   * @return TrainingListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrainingListing> getKnowledgeKnowledgebaseLanguageTrainingsWithHttpInfo(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String knowledgeDocumentsState) throws IOException {
    return getKnowledgeKnowledgebaseLanguageTrainings(createGetKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode, before, after, limit, pageSize, knowledgeDocumentsState).withHttpInfo());
  }

  private GetKnowledgeKnowledgebaseLanguageTrainingsRequest createGetKnowledgeKnowledgebaseLanguageTrainingsRequest(String knowledgeBaseId, String languageCode, String before, String after, String limit, String pageSize, String knowledgeDocumentsState) {
    return GetKnowledgeKnowledgebaseLanguageTrainingsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .withPageSize(pageSize)
    
            .withKnowledgeDocumentsState(knowledgeDocumentsState)
    
            .build();
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param request The request object
   * @return TrainingListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public TrainingListing getKnowledgeKnowledgebaseLanguageTrainings(GetKnowledgeKnowledgebaseLanguageTrainingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<TrainingListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<TrainingListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get all trainings information for a knowledgebase
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<TrainingListing> getKnowledgeKnowledgebaseLanguageTrainings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<TrainingListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<TrainingListing> response = (ApiResponse<TrainingListing>)(ApiResponse<?>)exception;
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
      ApiResponse<TrainingListing> response = (ApiResponse<TrainingListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Get knowledge bases
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter by Name. (optional)
   * @param coreLanguage Filter by core language. (optional)
   * @param published Filter by published status. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @return KnowledgeBaseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBaseListing getKnowledgeKnowledgebases(String before, String after, String limit, String pageSize, String name, String coreLanguage, Boolean published, String sortBy, String sortOrder) throws IOException, ApiException {
    return  getKnowledgeKnowledgebases(createGetKnowledgeKnowledgebasesRequest(before, after, limit, pageSize, name, coreLanguage, published, sortBy, sortOrder));
  }

  /**
   * Get knowledge bases
   * 
   * @param before The cursor that points to the start of the set of entities that has been returned. (optional)
   * @param after The cursor that points to the end of the set of entities that has been returned. (optional)
   * @param limit Number of entities to return. Maximum of 200. Deprecated in favour of pageSize, use CursorQueryParameters instead. (optional)
   * @param pageSize Number of entities to return. Maximum of 200. (optional)
   * @param name Filter by Name. (optional)
   * @param coreLanguage Filter by core language. (optional)
   * @param published Filter by published status. (optional)
   * @param sortBy Sort by. (optional)
   * @param sortOrder Sort Order. (optional)
   * @return KnowledgeBaseListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBaseListing> getKnowledgeKnowledgebasesWithHttpInfo(String before, String after, String limit, String pageSize, String name, String coreLanguage, Boolean published, String sortBy, String sortOrder) throws IOException {
    return getKnowledgeKnowledgebases(createGetKnowledgeKnowledgebasesRequest(before, after, limit, pageSize, name, coreLanguage, published, sortBy, sortOrder).withHttpInfo());
  }

  private GetKnowledgeKnowledgebasesRequest createGetKnowledgeKnowledgebasesRequest(String before, String after, String limit, String pageSize, String name, String coreLanguage, Boolean published, String sortBy, String sortOrder) {
    return GetKnowledgeKnowledgebasesRequest.builder()
            .withBefore(before)
    
            .withAfter(after)
    
            .withLimit(limit)
    
            .withPageSize(pageSize)
    
            .withName(name)
    
            .withCoreLanguage(coreLanguage)
    
            .withPublished(published)
    
            .withSortBy(sortBy)
    
            .withSortOrder(sortOrder)
    
            .build();
  }

  /**
   * Get knowledge bases
   * 
   * @param request The request object
   * @return KnowledgeBaseListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBaseListing getKnowledgeKnowledgebases(GetKnowledgeKnowledgebasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBaseListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBaseListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Get knowledge bases
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBaseListing> getKnowledgeKnowledgebases(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBaseListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBaseListing> response = (ApiResponse<KnowledgeBaseListing>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeBaseListing> response = (ApiResponse<KnowledgeBaseListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase patchKnowledgeKnowledgebase(String knowledgeBaseId, KnowledgeBase body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebase(createPatchKnowledgeKnowledgebaseRequest(knowledgeBaseId, body));
  }

  /**
   * Update knowledge base
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> patchKnowledgeKnowledgebaseWithHttpInfo(String knowledgeBaseId, KnowledgeBase body) throws IOException {
    return patchKnowledgeKnowledgebase(createPatchKnowledgeKnowledgebaseRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseRequest createPatchKnowledgeKnowledgebaseRequest(String knowledgeBaseId, KnowledgeBase body) {
    return PatchKnowledgeKnowledgebaseRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase patchKnowledgeKnowledgebase(PatchKnowledgeKnowledgebaseRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> patchKnowledgeKnowledgebase(ApiRequest<KnowledgeBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExtendedCategory patchKnowledgeKnowledgebaseLanguageCategory(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageCategory(createPatchKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode, body));
  }

  /**
   * Update category
   * 
   * @param categoryId Category ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExtendedCategory> patchKnowledgeKnowledgebaseLanguageCategoryWithHttpInfo(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageCategory(createPatchKnowledgeKnowledgebaseLanguageCategoryRequest(categoryId, knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageCategoryRequest createPatchKnowledgeKnowledgebaseLanguageCategoryRequest(String categoryId, String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
    return PatchKnowledgeKnowledgebaseLanguageCategoryRequest.builder()
            .withCategoryId(categoryId)
    
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update category
   * 
   * @param request The request object
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExtendedCategory patchKnowledgeKnowledgebaseLanguageCategory(PatchKnowledgeKnowledgebaseLanguageCategoryRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExtendedCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExtendedCategory> patchKnowledgeKnowledgebaseLanguageCategory(ApiRequest<KnowledgeCategoryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExtendedCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument patchKnowledgeKnowledgebaseLanguageDocument(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageDocument(createPatchKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode, body));
  }

  /**
   * Update document
   * 
   * @param documentId Document ID (required)
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> patchKnowledgeKnowledgebaseLanguageDocumentWithHttpInfo(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageDocument(createPatchKnowledgeKnowledgebaseLanguageDocumentRequest(documentId, knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageDocumentRequest createPatchKnowledgeKnowledgebaseLanguageDocumentRequest(String documentId, String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) {
    return PatchKnowledgeKnowledgebaseLanguageDocumentRequest.builder()
            .withDocumentId(documentId)
    
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument patchKnowledgeKnowledgebaseLanguageDocument(PatchKnowledgeKnowledgebaseLanguageDocumentRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> patchKnowledgeKnowledgebaseLanguageDocument(ApiRequest<KnowledgeDocumentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Update documents collection
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentListing patchKnowledgeKnowledgebaseLanguageDocuments(String knowledgeBaseId, String languageCode, List<KnowledgeDocumentBulkRequest> body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageDocuments(createPatchKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Update documents collection
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return DocumentListing
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentListing> patchKnowledgeKnowledgebaseLanguageDocumentsWithHttpInfo(String knowledgeBaseId, String languageCode, List<KnowledgeDocumentBulkRequest> body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageDocuments(createPatchKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageDocumentsRequest createPatchKnowledgeKnowledgebaseLanguageDocumentsRequest(String knowledgeBaseId, String languageCode, List<KnowledgeDocumentBulkRequest> body) {
    return PatchKnowledgeKnowledgebaseLanguageDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Update documents collection
   * 
   * @param request The request object
   * @return DocumentListing
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public DocumentListing patchKnowledgeKnowledgebaseLanguageDocuments(PatchKnowledgeKnowledgebaseLanguageDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<DocumentListing> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<DocumentListing>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Update documents collection
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<DocumentListing> patchKnowledgeKnowledgebaseLanguageDocuments(ApiRequest<List<KnowledgeDocumentBulkRequest>> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<DocumentListing>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)exception;
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
      ApiResponse<DocumentListing> response = (ApiResponse<DocumentListing>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Start import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImport patchKnowledgeKnowledgebaseLanguageDocumentsImport(String knowledgeBaseId, String languageCode, String importId, ImportStatusRequest body) throws IOException, ApiException {
    return  patchKnowledgeKnowledgebaseLanguageDocumentsImport(createPatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId, body));
  }

  /**
   * Start import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param importId Import ID (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImport> patchKnowledgeKnowledgebaseLanguageDocumentsImportWithHttpInfo(String knowledgeBaseId, String languageCode, String importId, ImportStatusRequest body) throws IOException {
    return patchKnowledgeKnowledgebaseLanguageDocumentsImport(createPatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest(knowledgeBaseId, languageCode, importId, body).withHttpInfo());
  }

  private PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest createPatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest(String knowledgeBaseId, String languageCode, String importId, ImportStatusRequest body) {
    return PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withImportId(importId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Start import operation
   * 
   * @param request The request object
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImport patchKnowledgeKnowledgebaseLanguageDocumentsImport(PatchKnowledgeKnowledgebaseLanguageDocumentsImportRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Start import operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImport> patchKnowledgeKnowledgebaseLanguageDocumentsImport(ApiRequest<ImportStatusRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postKnowledgeDocumentuploads(UploadUrlRequest body) throws IOException, ApiException {
    return  postKnowledgeDocumentuploads(createPostKnowledgeDocumentuploadsRequest(body));
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param body query (required)
   * @return UploadUrlResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postKnowledgeDocumentuploadsWithHttpInfo(UploadUrlRequest body) throws IOException {
    return postKnowledgeDocumentuploads(createPostKnowledgeDocumentuploadsRequest(body).withHttpInfo());
  }

  private PostKnowledgeDocumentuploadsRequest createPostKnowledgeDocumentuploadsRequest(UploadUrlRequest body) {
    return PostKnowledgeDocumentuploadsRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request The request object
   * @return UploadUrlResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public UploadUrlResponse postKnowledgeDocumentuploads(PostKnowledgeDocumentuploadsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<UploadUrlResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<UploadUrlResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Creates a presigned URL for uploading a knowledge import file with a set of documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<UploadUrlResponse> postKnowledgeDocumentuploads(ApiRequest<UploadUrlRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<UploadUrlResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<UploadUrlResponse> response = (ApiResponse<UploadUrlResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create new category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExtendedCategory postKnowledgeKnowledgebaseLanguageCategories(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageCategories(createPostKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Create new category
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeExtendedCategory
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExtendedCategory> postKnowledgeKnowledgebaseLanguageCategoriesWithHttpInfo(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageCategories(createPostKnowledgeKnowledgebaseLanguageCategoriesRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageCategoriesRequest createPostKnowledgeKnowledgebaseLanguageCategoriesRequest(String knowledgeBaseId, String languageCode, KnowledgeCategoryRequest body) {
    return PostKnowledgeKnowledgebaseLanguageCategoriesRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create new category
   * 
   * @param request The request object
   * @return KnowledgeExtendedCategory
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeExtendedCategory postKnowledgeKnowledgebaseLanguageCategories(PostKnowledgeKnowledgebaseLanguageCategoriesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeExtendedCategory> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeExtendedCategory>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new category
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeExtendedCategory> postKnowledgeKnowledgebaseLanguageCategories(ApiRequest<KnowledgeCategoryRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeExtendedCategory>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeExtendedCategory> response = (ApiResponse<KnowledgeExtendedCategory>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create document
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument postKnowledgeKnowledgebaseLanguageDocuments(String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageDocuments(createPostKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Create document
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeDocument
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> postKnowledgeKnowledgebaseLanguageDocumentsWithHttpInfo(String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageDocuments(createPostKnowledgeKnowledgebaseLanguageDocumentsRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageDocumentsRequest createPostKnowledgeKnowledgebaseLanguageDocumentsRequest(String knowledgeBaseId, String languageCode, KnowledgeDocumentRequest body) {
    return PostKnowledgeKnowledgebaseLanguageDocumentsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create document
   * 
   * @param request The request object
   * @return KnowledgeDocument
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeDocument postKnowledgeKnowledgebaseLanguageDocuments(PostKnowledgeKnowledgebaseLanguageDocumentsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeDocument> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeDocument>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create document
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeDocument> postKnowledgeKnowledgebaseLanguageDocuments(ApiRequest<KnowledgeDocumentRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeDocument>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeDocument> response = (ApiResponse<KnowledgeDocument>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImport postKnowledgeKnowledgebaseLanguageDocumentsImports(String knowledgeBaseId, String languageCode, KnowledgeImport body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageDocumentsImports(createPostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest(knowledgeBaseId, languageCode, body));
  }

  /**
   * Create import operation
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param body  (required)
   * @return KnowledgeImport
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImport> postKnowledgeKnowledgebaseLanguageDocumentsImportsWithHttpInfo(String knowledgeBaseId, String languageCode, KnowledgeImport body) throws IOException {
    return postKnowledgeKnowledgebaseLanguageDocumentsImports(createPostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest(knowledgeBaseId, languageCode, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest createPostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest(String knowledgeBaseId, String languageCode, KnowledgeImport body) {
    return PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Create import operation
   * 
   * @param request The request object
   * @return KnowledgeImport
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeImport postKnowledgeKnowledgebaseLanguageDocumentsImports(PostKnowledgeKnowledgebaseLanguageDocumentsImportsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeImport> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeImport>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create import operation
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeImport> postKnowledgeKnowledgebaseLanguageDocumentsImports(ApiRequest<KnowledgeImport> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeImport>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeImport> response = (ApiResponse<KnowledgeImport>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Promote trained documents from draft state to active.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainingPromote(String knowledgeBaseId, String languageCode, String trainingId) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageTrainingPromote(createPostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest(knowledgeBaseId, languageCode, trainingId));
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @param trainingId Training ID (required)
   * @return KnowledgeTraining
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingPromoteWithHttpInfo(String knowledgeBaseId, String languageCode, String trainingId) throws IOException {
    return postKnowledgeKnowledgebaseLanguageTrainingPromote(createPostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest(knowledgeBaseId, languageCode, trainingId).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest createPostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest(String knowledgeBaseId, String languageCode, String trainingId) {
    return PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .withTrainingId(trainingId)
    
            .build();
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param request The request object
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainingPromote(PostKnowledgeKnowledgebaseLanguageTrainingPromoteRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeTraining> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Promote trained documents from draft state to active.
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingPromote(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeTraining>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Trigger training
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainings(String knowledgeBaseId, String languageCode) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseLanguageTrainings(createPostKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode));
  }

  /**
   * Trigger training
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param languageCode Language code, format: iso2-LOCALE (required)
   * @return KnowledgeTraining
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainingsWithHttpInfo(String knowledgeBaseId, String languageCode) throws IOException {
    return postKnowledgeKnowledgebaseLanguageTrainings(createPostKnowledgeKnowledgebaseLanguageTrainingsRequest(knowledgeBaseId, languageCode).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseLanguageTrainingsRequest createPostKnowledgeKnowledgebaseLanguageTrainingsRequest(String knowledgeBaseId, String languageCode) {
    return PostKnowledgeKnowledgebaseLanguageTrainingsRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withLanguageCode(languageCode)
    
            .build();
  }

  /**
   * Trigger training
   * 
   * @param request The request object
   * @return KnowledgeTraining
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeTraining postKnowledgeKnowledgebaseLanguageTrainings(PostKnowledgeKnowledgebaseLanguageTrainingsRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeTraining> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeTraining>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Trigger training
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeTraining> postKnowledgeKnowledgebaseLanguageTrainings(ApiRequest<Void> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeTraining>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeTraining> response = (ApiResponse<KnowledgeTraining>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Search Documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (optional)
   * @return KnowledgeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSearchResponse postKnowledgeKnowledgebaseSearch(String knowledgeBaseId, KnowledgeSearchRequest body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebaseSearch(createPostKnowledgeKnowledgebaseSearchRequest(knowledgeBaseId, body));
  }

  /**
   * Search Documents
   * 
   * @param knowledgeBaseId Knowledge base ID (required)
   * @param body  (optional)
   * @return KnowledgeSearchResponse
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearchWithHttpInfo(String knowledgeBaseId, KnowledgeSearchRequest body) throws IOException {
    return postKnowledgeKnowledgebaseSearch(createPostKnowledgeKnowledgebaseSearchRequest(knowledgeBaseId, body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebaseSearchRequest createPostKnowledgeKnowledgebaseSearchRequest(String knowledgeBaseId, KnowledgeSearchRequest body) {
    return PostKnowledgeKnowledgebaseSearchRequest.builder()
            .withKnowledgeBaseId(knowledgeBaseId)
    
            .withBody(body)
    
            .build();
  }

  /**
   * Search Documents
   * 
   * @param request The request object
   * @return KnowledgeSearchResponse
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeSearchResponse postKnowledgeKnowledgebaseSearch(PostKnowledgeKnowledgebaseSearchRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeSearchResponse> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeSearchResponse>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Search Documents
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeSearchResponse> postKnowledgeKnowledgebaseSearch(ApiRequest<KnowledgeSearchRequest> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeSearchResponse>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeSearchResponse> response = (ApiResponse<KnowledgeSearchResponse>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
  /**
   * Create new knowledge base
   * 
   * @param body  (required)
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase postKnowledgeKnowledgebases(KnowledgeBase body) throws IOException, ApiException {
    return  postKnowledgeKnowledgebases(createPostKnowledgeKnowledgebasesRequest(body));
  }

  /**
   * Create new knowledge base
   * 
   * @param body  (required)
   * @return KnowledgeBase
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> postKnowledgeKnowledgebasesWithHttpInfo(KnowledgeBase body) throws IOException {
    return postKnowledgeKnowledgebases(createPostKnowledgeKnowledgebasesRequest(body).withHttpInfo());
  }

  private PostKnowledgeKnowledgebasesRequest createPostKnowledgeKnowledgebasesRequest(KnowledgeBase body) {
    return PostKnowledgeKnowledgebasesRequest.builder()
            .withBody(body)
    
            .build();
  }

  /**
   * Create new knowledge base
   * 
   * @param request The request object
   * @return KnowledgeBase
   * @throws ApiException if the request fails on the server
   * @throws IOException if the request fails to be processed
   */
  public KnowledgeBase postKnowledgeKnowledgebases(PostKnowledgeKnowledgebasesRequest request) throws IOException, ApiException {
    try {
      ApiResponse<KnowledgeBase> response = pcapiClient.invoke(request.withHttpInfo(), new TypeReference<KnowledgeBase>() {});
      return response.getBody();
    }
    catch (ApiException | IOException exception) {
      if (pcapiClient.getShouldThrowErrors()) throw exception;
      return null;
    }
  }

  /**
   * Create new knowledge base
   * 
   * @param request The request object
   * @return the response
   * @throws IOException if the request fails to be processed
   */
  public ApiResponse<KnowledgeBase> postKnowledgeKnowledgebases(ApiRequest<KnowledgeBase> request) throws IOException {
    try {
      return pcapiClient.invoke(request, new TypeReference<KnowledgeBase>() {});
    }
    catch (ApiException exception) {
      @SuppressWarnings("unchecked")
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)exception;
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
      ApiResponse<KnowledgeBase> response = (ApiResponse<KnowledgeBase>)(ApiResponse<?>)(new ApiException(exception));
      return response;
    }
  }

  
}
