/*******************************************************************************
 * Copyright 2020 Pinterest, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package com.pinterest.orion.core.kafka;

public class KafkaConsumerGroupOffsetsAndLag {
    private long beginningOffset;
    private long endOffset;
    private long offset;
    private long lag;

    public KafkaConsumerGroupOffsetsAndLag(long beginningOffset, long endOffset, long offset, long lag) {
        this.beginningOffset = beginningOffset;
        this.endOffset = endOffset;
        this.offset = offset;
        this.lag = lag;
    }

    public long getBeginningOffset() {
        return beginningOffset;
    }

    public long getEndOffset() {
        return endOffset;
    }

    public long getOffset() {
        return offset;
    }

    public long getLag() {
        return lag;
    }
}
