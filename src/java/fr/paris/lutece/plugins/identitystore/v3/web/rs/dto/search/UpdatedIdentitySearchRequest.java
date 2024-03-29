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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search;

import com.fasterxml.jackson.annotation.JsonProperty;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.history.IdentityChangeType;

import java.util.ArrayList;
import java.util.List;

public class UpdatedIdentitySearchRequest
{
    /**
     * max number of days since the last update
     */
    @JsonProperty( "days" )
    protected Integer days;

    /**
     * filters on specific change types
     */
    @JsonProperty( "identity_change_types" )
    protected List<IdentityChangeType> identityChangeTypes = new ArrayList<>( );

    /**
     * filters on specific updated attributes
     */
    @JsonProperty( "updated_attributes" )
    protected List<SearchUpdatedAttribute> updatedAttributes = new ArrayList<>( );

    /**
     * Size of each page
     */
    @JsonProperty( "size" )
    private Integer size;

    /**
     * Desired page number
     */
    @JsonProperty( "page" )
    private Integer page;

    /**
     * Query result limit
     */
    @JsonProperty( "max" )
    private Integer max;

    public Integer getDays( )
    {
        return days;
    }

    public void setDays( final Integer days )
    {
        this.days = days;
    }

    public List<IdentityChangeType> getIdentityChangeTypes( )
    {
        return identityChangeTypes;
    }

    public List<SearchUpdatedAttribute> getUpdatedAttributes( )
    {
        return updatedAttributes;
    }

    public Integer getSize( )
    {
        return size;
    }

    public void setSize( final Integer size )
    {
        this.size = size;
    }

    public Integer getPage( )
    {
        return page;
    }

    public void setPage( final Integer page )
    {
        this.page = page;
    }

    public Integer getMax( )
    {
        return max;
    }

    public void setMax( final Integer max )
    {
        this.max = max;
    }
}
