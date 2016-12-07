/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.green.transform.v20161206;

import com.aliyuncs.green.model.v20161206.SampleFeedbackResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SampleFeedbackResponseUnmarshaller {

	public static SampleFeedbackResponse unmarshall(SampleFeedbackResponse sampleFeedbackResponse, UnmarshallerContext context) {
		
		sampleFeedbackResponse.setCode(context.stringValue("SampleFeedbackResponse.Code"));
		sampleFeedbackResponse.setMsg(context.stringValue("SampleFeedbackResponse.Msg"));
	 
	 	return sampleFeedbackResponse;
	}
}