/*******************************************************************************
* Copyright (c) 2013 GigaSpaces Technologies Ltd. All rights reserved
* 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
* 
 * http://www.apache.org/licenses/LICENSE-2.0
* 
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
* an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
* specific language governing permissions and limitations under the License.
*******************************************************************************/
/**
 * 
 */
package org.cloudifysource.esc.driver.provisioning.smartcloud;

/**
 * 
 * An exception class used when API interactions with the smartcloud controller fail.
 * @author aharon
 * @since 2.3.0
 * 
 */
public class SmartCloudException extends Exception {

	/**
	 * .
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public SmartCloudException() {
	}

	/**
	 * @param message .
	 */
	public SmartCloudException(final String message) {
		super(message);
	}

	/**
	 * @param cause .
	 */
	public SmartCloudException(final Throwable cause) {
		super(cause);
	}

	/**
	 * @param message .
	 * @param cause .
	 */
	public SmartCloudException(final String message, final Throwable cause) {
		super(message, cause);

	}

}
