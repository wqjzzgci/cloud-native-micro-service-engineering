/*
 * MIT License
 *
 * Copyright (c) 2020 engineer365.org
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package org.engineer365.common;

import java.util.Map;

import org.slf4j.MDC;

/**
 */
public class LogTrace {

  public static final String USER_ID = "userId";
  public static final String ROLES = "roles";

  /**
   *
   * @return
   */
  public static Map<String, String> copy() {
    return MDC.getCopyOfContextMap();
  }

  /**
   *
   * @param userId
   */
  public static void setContext(RequestContext ctx) {
    var userId = ctx.getUserId();
    if (userId == null) {
      MDC.remove(USER_ID);
    } else {
      MDC.put(USER_ID, userId);
    }

    var roles = ctx.getRoles();
    if (roles == null) {
      MDC.remove(ROLES);
    } else {
      MDC.put(ROLES, roles.toString());
    }
  }

  /**
   *
   */
  public static void clear() {
    // done't use MDC.clear() because that will clear other MDC
    MDC.remove(USER_ID);
    MDC.remove(ROLES);
  }

}
