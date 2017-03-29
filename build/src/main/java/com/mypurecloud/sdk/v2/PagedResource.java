package com.mypurecloud.sdk.v2;

import java.util.List;

public interface PagedResource<T> {
    Integer getPageSize();
    void setPageSize(Integer pageSize);

    Integer getPageNumber();
    void setPageNumber(Integer pageNumber);

    Integer getPageCount();
    void setPageCount(Integer pageCount);

    Long getTotal();
    void setTotal(Long total);

    String getFirstUri();
    void setFirstUri(String firstUri);

    String getPreviousUri();
    void setPreviousUri(String previousUri);

    String getSelfUri();
    void setSelfUri(String selfUri);

    String getNextUri();
    void setNextUri(String nextUri);

    String getLastUri();
    void setLastUri(String lastUri);

    List<T> getEntities();
    void setEntities(List<T> entities);
}
