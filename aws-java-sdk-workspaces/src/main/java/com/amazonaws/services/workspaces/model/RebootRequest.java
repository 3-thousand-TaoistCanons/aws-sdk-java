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
package com.amazonaws.services.workspaces.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information used with the RebootWorkspaces operation to
 * reboot a WorkSpace.
 * </p>
 */
public class RebootRequest implements Serializable, Cloneable {

    /**
     * The identifier of the WorkSpace to reboot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     */
    private String workspaceId;

    /**
     * The identifier of the WorkSpace to reboot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @return The identifier of the WorkSpace to reboot.
     */
    public String getWorkspaceId() {
        return workspaceId;
    }
    
    /**
     * The identifier of the WorkSpace to reboot.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @param workspaceId The identifier of the WorkSpace to reboot.
     */
    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }
    
    /**
     * The identifier of the WorkSpace to reboot.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^ws-[0-9a-z]{8,63}$<br/>
     *
     * @param workspaceId The identifier of the WorkSpace to reboot.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RebootRequest withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
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
        if (getWorkspaceId() != null) sb.append("WorkspaceId: " + getWorkspaceId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getWorkspaceId() == null) ? 0 : getWorkspaceId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RebootRequest == false) return false;
        RebootRequest other = (RebootRequest)obj;
        
        if (other.getWorkspaceId() == null ^ this.getWorkspaceId() == null) return false;
        if (other.getWorkspaceId() != null && other.getWorkspaceId().equals(this.getWorkspaceId()) == false) return false; 
        return true;
    }
    
    @Override
    public RebootRequest clone() {
        try {
            return (RebootRequest) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    