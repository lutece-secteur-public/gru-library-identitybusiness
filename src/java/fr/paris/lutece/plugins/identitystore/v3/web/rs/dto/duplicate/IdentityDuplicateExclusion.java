/*
 * Copyright (c) 2002-2024, City of Paris
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *  1. Redistributions of source code must retain the above copyright notice
 *     and the following disclaimer.
 *
 *  2. Redistributions in binary form must reproduce the above copyright notice
 *     and the following disclaimer in the documentation and/or other materials
 *     provided with the distribution.
 *
 *  3. Neither the name of 'Mairie de Paris' nor 'Lutece' nor the names of its
 *     contributors may be used to endorse or promote products derived from
 *     this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDERS OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 *
 * License 1.0
 */
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.duplicate;

import java.util.Date;

public class IdentityDuplicateExclusion
{
    /**
     * CUID de l'identité exclue
     */
    protected String excludedCustomerId;
    /**
     * Date d'exclusion
     */
    protected Date exclusionDate;

    protected String authorType;
    protected String authorName;

    public String getExcludedCustomerId( )
    {
        return excludedCustomerId;
    }

    public void setExcludedCustomerId( String excludedCustomerId )
    {
        this.excludedCustomerId = excludedCustomerId;
    }

    public Date getExclusionDate( )
    {
        return exclusionDate;
    }

    public void setExclusionDate( Date exclusionDate )
    {
        this.exclusionDate = exclusionDate;
    }

    public String getAuthorType( )
    {
        return authorType;
    }

    public void setAuthorType( String authorType )
    {
        this.authorType = authorType;
    }

    public String getAuthorName( )
    {
        return authorName;
    }

    public void setAuthorName( String authorName )
    {
        this.authorName = authorName;
    }

    @Override
    public String toString() {
        return "IdentityDuplicateExclusion{" +
                "excludedCustomerId='" + excludedCustomerId + '\'' +
                ", exclusionDate=" + exclusionDate +
                ", authorType='" + authorType + '\'' +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
