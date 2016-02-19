/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.rapidpm.microservice.optionals.metrics.jvm.model.jvm;

import java.io.Serializable;
import java.util.Objects;

public class GCInfos implements Serializable {

  private long collectionCount;
  private long collectionTime;

  public GCInfos collectionCount(final long collectionCount) {
    this.collectionCount = collectionCount;
    return this;
  }

  public GCInfos collectionTime(final long collectionTime) {
    this.collectionTime = collectionTime;
    return this;
  }

  @Override
  public int hashCode() {
    return Objects.hash(collectionCount, collectionTime);
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) return true;
    if (!(o instanceof GCInfos)) return false;
    final GCInfos gciNfos = (GCInfos) o;
    return collectionCount == gciNfos.collectionCount &&
        collectionTime == gciNfos.collectionTime;
  }

  @Override
  public String toString() {
    return "GCInfos{" +
        "collectionCount=" + collectionCount +
        ", collectionTime=" + collectionTime +
        '}';
  }

  public long getCollectionCount() {
    return collectionCount;
  }

  public long getCollectionTime() {
    return collectionTime;
  }
}
