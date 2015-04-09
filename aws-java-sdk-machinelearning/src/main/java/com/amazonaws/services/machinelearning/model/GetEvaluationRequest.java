/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.machinelearning.AmazonMachineLearning#getEvaluation(GetEvaluationRequest) GetEvaluation operation}.
 * <p>
 * Returns an <code>Evaluation</code> that includes metadata as well as
 * the current status of the <code>Evaluation</code> .
 * </p>
 *
 * @see com.amazonaws.services.machinelearning.AmazonMachineLearning#getEvaluation(GetEvaluationRequest)
 */
public class GetEvaluationRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     * each <code>MLModel</code> is recorded and cataloged. The ID provides
     * the means to access the information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String evaluationId;

    /**
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     * each <code>MLModel</code> is recorded and cataloged. The ID provides
     * the means to access the information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     *         each <code>MLModel</code> is recorded and cataloged. The ID provides
     *         the means to access the information.
     */
    public String getEvaluationId() {
        return evaluationId;
    }
    
    /**
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     * each <code>MLModel</code> is recorded and cataloged. The ID provides
     * the means to access the information.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     *         each <code>MLModel</code> is recorded and cataloged. The ID provides
     *         the means to access the information.
     */
    public void setEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
    }
    
    /**
     * The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     * each <code>MLModel</code> is recorded and cataloged. The ID provides
     * the means to access the information.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param evaluationId The ID of the <code>Evaluation</code> to retrieve. The evaluation of
     *         each <code>MLModel</code> is recorded and cataloged. The ID provides
     *         the means to access the information.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GetEvaluationRequest withEvaluationId(String evaluationId) {
        this.evaluationId = evaluationId;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEvaluationId() != null) sb.append("EvaluationId: " + getEvaluationId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getEvaluationId() == null) ? 0 : getEvaluationId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GetEvaluationRequest == false) return false;
        GetEvaluationRequest other = (GetEvaluationRequest)obj;
        
        if (other.getEvaluationId() == null ^ this.getEvaluationId() == null) return false;
        if (other.getEvaluationId() != null && other.getEvaluationId().equals(this.getEvaluationId()) == false) return false; 
        return true;
    }
    
    @Override
    public GetEvaluationRequest clone() {
        
            return (GetEvaluationRequest) super.clone();
    }

}
    