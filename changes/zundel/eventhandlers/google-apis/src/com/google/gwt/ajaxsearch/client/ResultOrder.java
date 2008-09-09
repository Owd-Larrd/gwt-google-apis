/*
 * Copyright 2008 Google Inc.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.google.gwt.ajaxsearch.client;

import com.google.gwt.jsio.client.JSOpaque;

/**
 * Used with Search objects to determine the manner in which the associated
 * results will be displayed.
 * 
 * @see BlogSearch#setResultOrder(ResultOrder)
 * @see NewsSearch#setResultOrder(ResultOrder)
 * @see VideoSearch#setResultOrder(ResultOrder)
 */
public enum ResultOrder {

  /**
   * Order results in reverse chronological order.
   */
  DATE("DATE"),

  /**
   * Order results by relevance to the query.
   */
  RELEVANCE("RELEVANCE");

  private final JSOpaque value;

  private ResultOrder(String order) {
    value = new JSOpaque("$wnd.GSearch.ORDER_BY_" + order);
  }

  JSOpaque getValue() {
    return value;
  }
}