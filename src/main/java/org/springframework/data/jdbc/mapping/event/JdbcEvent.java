/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.springframework.data.jdbc.mapping.event;

import java.util.Optional;

/**
 *
 * @author Oliver Gierke
 * @since 1.0
 */
public interface JdbcEvent {

	/**
	 * The identifier of the entity, triggering this event. Also available via {@link #getSource()}.
	 *
	 * @return the source of the event as an {@link Identifier}.
	 */
	Identifier getId();

	/**
	 * Returns the entity the event was triggered for.
	 *
	 * @return will never be {@literal null}.
	 */
	Optional<Object> getOptionalEntity();

}
