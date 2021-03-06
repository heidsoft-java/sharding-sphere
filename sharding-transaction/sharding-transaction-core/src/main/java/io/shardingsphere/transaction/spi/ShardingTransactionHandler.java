/*
 * Copyright 2016-2018 shardingsphere.io.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingsphere.transaction.spi;

import io.shardingsphere.core.constant.transaction.TransactionType;
import io.shardingsphere.transaction.core.internal.context.ShardingTransactionContext;

/**
 * Sharding transaction handler SPI.
 *
 * @author zhaojun
 * 
 * @param <T> type of sharding transaction context
 */
public interface ShardingTransactionHandler<T extends ShardingTransactionContext> {
    
    /**
     * Do transaction operation using specific transaction manager.
     *
     * @param context sharding transaction context
     */
    void doInTransaction(T context);
    
    /**
     * Get transaction type.
     *
     * @return transaction type
     */
    TransactionType getTransactionType();
}
