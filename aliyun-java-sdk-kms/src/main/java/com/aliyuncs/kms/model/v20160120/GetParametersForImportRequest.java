/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.kms.model.v20160120;

import com.aliyuncs.RpcAcsRequest;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.kms.Endpoint;

/**
 * @author auto create
 * @version 
 */
public class GetParametersForImportRequest extends RpcAcsRequest<GetParametersForImportResponse> {
	
	public GetParametersForImportRequest() {
		super("Kms", "2016-01-20", "GetParametersForImport", "kms");
		setProtocol(ProtocolType.HTTPS);
		try {
			this.getClass().getDeclaredField("ProductEndpointMap").set(this, Endpoint.endpointMap);
			this.getClass().getDeclaredField("ProductEndpointRegional").set(this, Endpoint.endpointRegionalType);
		} catch (Exception e) {}
	}

	private String keyId;

	private String wrappingAlgorithm;

	private String wrappingKeySpec;

	public String getKeyId() {
		return this.keyId;
	}

	public void setKeyId(String keyId) {
		this.keyId = keyId;
		if(keyId != null){
			putQueryParameter("KeyId", keyId);
		}
	}

	public String getWrappingAlgorithm() {
		return this.wrappingAlgorithm;
	}

	public void setWrappingAlgorithm(String wrappingAlgorithm) {
		this.wrappingAlgorithm = wrappingAlgorithm;
		if(wrappingAlgorithm != null){
			putQueryParameter("WrappingAlgorithm", wrappingAlgorithm);
		}
	}

	public String getWrappingKeySpec() {
		return this.wrappingKeySpec;
	}

	public void setWrappingKeySpec(String wrappingKeySpec) {
		this.wrappingKeySpec = wrappingKeySpec;
		if(wrappingKeySpec != null){
			putQueryParameter("WrappingKeySpec", wrappingKeySpec);
		}
	}

	@Override
	public Class<GetParametersForImportResponse> getResponseClass() {
		return GetParametersForImportResponse.class;
	}

}
