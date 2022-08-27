// Generated by delombok at Fri Aug 26 19:04:59 CDT 2022
package com.mercadopago.net;

import com.mercadopago.resources.ResultsPaging;
import java.util.List;

/**
 * MPResultsResourcesPage class.
 *
 * @param <T> class type
 */
public class MPResultsResourcesPage<T> extends MPResource {
  private ResultsPaging paging;
  private List<T> results;

  @java.lang.SuppressWarnings("all")
  public MPResultsResourcesPage() {
  }

  @java.lang.SuppressWarnings("all")
  public ResultsPaging getPaging() {
    return this.paging;
  }

  @java.lang.SuppressWarnings("all")
  public List<T> getResults() {
    return this.results;
  }

  @java.lang.SuppressWarnings("all")
  public void setPaging(final ResultsPaging paging) {
    this.paging = paging;
  }

  @java.lang.SuppressWarnings("all")
  public void setResults(final List<T> results) {
    this.results = results;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public java.lang.String toString() {
    return "MPResultsResourcesPage(paging=" + this.getPaging() + ", results=" + this.getResults() + ")";
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public boolean equals(final java.lang.Object o) {
    if (o == this) return true;
    if (!(o instanceof MPResultsResourcesPage)) return false;
    final MPResultsResourcesPage<?> other = (MPResultsResourcesPage<?>) o;
    if (!other.canEqual((java.lang.Object) this)) return false;
    if (!super.equals(o)) return false;
    final java.lang.Object this$paging = this.getPaging();
    final java.lang.Object other$paging = other.getPaging();
    if (this$paging == null ? other$paging != null : !this$paging.equals(other$paging)) return false;
    final java.lang.Object this$results = this.getResults();
    final java.lang.Object other$results = other.getResults();
    if (this$results == null ? other$results != null : !this$results.equals(other$results)) return false;
    return true;
  }

  @java.lang.SuppressWarnings("all")
  protected boolean canEqual(final java.lang.Object other) {
    return other instanceof MPResultsResourcesPage;
  }

  @java.lang.Override
  @java.lang.SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = super.hashCode();
    final java.lang.Object $paging = this.getPaging();
    result = result * PRIME + ($paging == null ? 43 : $paging.hashCode());
    final java.lang.Object $results = this.getResults();
    result = result * PRIME + ($results == null ? 43 : $results.hashCode());
    return result;
  }
}