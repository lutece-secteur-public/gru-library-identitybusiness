/*
 * Copyright (c) 2002-2023, City of Paris
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
package fr.paris.lutece.plugins.identitystore.v3.web.rs;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.importing.BatchImportRequest;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.search.IdentitySearchRequest;
import fr.paris.lutece.plugins.identitystore.web.exception.IdentityStoreException;
import org.apache.commons.lang3.StringUtils;

public class BatchRequestValidator extends RequestValidator
{

    /**
     * singleton
     */
    private static BatchRequestValidator _singleton;

    /**
     * return singleton's instance
     *
     * @return IdentityRequestValidator
     */
    public static BatchRequestValidator instance( )
    {
        if ( _singleton == null )
        {
            _singleton = new BatchRequestValidator( );
        }

        return _singleton;
    }

    public void checkImportRequest( final BatchImportRequest request ) throws IdentityStoreException
    {
        if ( request.getBatch( ) == null )
        {
            throw new IdentityStoreException( "Provided batch is null." );
        }
        if ( request.getBatch( ).getIdentities( ).isEmpty( ) )
        {
            throw new IdentityStoreException( "Provided batch is empty, it should contain at least one Identity." );
        }
    }

    public void checkBatchReference( final String strBatchReference ) throws IdentityStoreException
    {
        if ( strBatchReference == null || strBatchReference.isEmpty( ) )
        {
            throw new IdentityStoreException( "Provided batch reference is null or empty." );
        }

    }

    public void checkBatchStatusMode( final String strMode ) throws IdentityStoreException
    {
        if ( strMode != null )
        {
            throw new IdentityStoreException( "Provided batch reference is null or empty." );
        }

    }
}
