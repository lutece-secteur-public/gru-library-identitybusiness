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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.history;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.RequestAuthor;

import java.sql.Timestamp;

/**
 * AttributeChange
 */
public class IdentityChange
{
    protected Integer id;
    protected IdentityChangeType _identityChangeType;
    protected RequestAuthor _author;
    protected String _strChangeStatus;
    protected String _strChangeMessage;
    protected String _strClientCode;
    protected String _strCustomerId;
    protected String _strConnectionId;
    protected Timestamp _dateCreationDate;
    protected Timestamp _dateLastUpdateDate;
    protected Timestamp _modificationDate;
    protected boolean _bIsMonParisActive;
    protected boolean _bIsDeleted;
    protected Timestamp _dateExpirationDate;
    protected String _strMasterCustomerId;
    protected boolean _bIsMerged;
    protected Timestamp _dateMergeDate;

    public IdentityChange( )
    {
    }

    /**
     * Returns the type of the IdentityChangeType
     *
     * @return The IdentityChangeType
     */
    public IdentityChangeType getChangeType( )
    {
        return _identityChangeType;
    }

    /**
     * Sets the type of the IdentityChange
     *
     * @param identityChangeType
     *            The IdentityChangeType
     */
    public void setChangeType( IdentityChangeType identityChangeType )
    {
        _identityChangeType = identityChangeType;
    }

    /**
     * get author
     * 
     * @return the author
     */
    public RequestAuthor getAuthor( )
    {
        return _author;
    }

    /**
     * set author
     *
     * @param author
     */
    public void setAuthor( RequestAuthor author )
    {
        this._author = author;
    }

    /**
     * get change status
     *
     * @return the status
     */
    public String getChangeStatus( )
    {
        return _strChangeStatus;
    }

    /**
     * set change status
     *
     * @param changeStatus
     */
    public void setChangeStatus( String changeStatus )
    {
        this._strChangeStatus = changeStatus;
    }

    /**
     * get change message
     * 
     * @return the message
     */
    public String getChangeMessage( )
    {
        return _strChangeMessage;
    }

    /**
     * set change message
     *
     * @param changeMessage
     */
    public void setChangeMessage( String changeMessage )
    {
        this._strChangeMessage = changeMessage;
    }

    /**
     * get client code
     *
     * @return the code
     */
    public String getClientCode( )
    {
        return _strClientCode;
    }

    /**
     * set client code
     *
     * @param clientCode
     */
    public void setClientCode( String clientCode )
    {
        this._strClientCode = clientCode;
    }

    /**
     * get modification date
     *
     * @return the date
     */
    public Timestamp getModificationDate( )
    {
        return _modificationDate;
    }

    /**
     * set modification date
     *
     * @param modificationDate
     */
    public void setModificationDate( Timestamp modificationDate )
    {
        this._modificationDate = modificationDate;
    }

    /**
     * get customer id
     * 
     * @return the cuid
     */
    public String getCustomerId( )
    {
        return _strCustomerId;
    }

    /**
     * set customer id
     *
     * @param customerId
     */
    public void setCustomerId( String customerId )
    {
        this._strCustomerId = customerId;
    }

    public Integer getId( )
    {
        return id;
    }

    public void setId( Integer id )
    {
        this.id = id;
    }

    public String getConnectionId( )
    {
        return _strConnectionId;
    }

    public void setConnectionId( String _strConnectionId )
    {
        this._strConnectionId = _strConnectionId;
    }

    public Timestamp getCreationDate( )
    {
        return _dateCreationDate;
    }

    public void setCreationDate( Timestamp _dateCreationDate )
    {
        this._dateCreationDate = _dateCreationDate;
    }

    public Timestamp getLastUpdateDate( )
    {
        return _dateLastUpdateDate;
    }

    public void setLastUpdateDate( Timestamp _dateLastUpdateDate )
    {
        this._dateLastUpdateDate = _dateLastUpdateDate;
    }

    public boolean isMonParisActive( )
    {
        return _bIsMonParisActive;
    }

    public void setMonParisActive( boolean _bIsMonParisActive )
    {
        this._bIsMonParisActive = _bIsMonParisActive;
    }

    public boolean isDeleted( )
    {
        return _bIsDeleted;
    }

    public void setDeleted( boolean _bIsDeleted )
    {
        this._bIsDeleted = _bIsDeleted;
    }

    public Timestamp getExpirationDate( )
    {
        return _dateExpirationDate;
    }

    public void setExpirationDate( Timestamp _dateExpirationDate )
    {
        this._dateExpirationDate = _dateExpirationDate;
    }

    public String getMasterCustomerId( )
    {
        return _strMasterCustomerId;
    }

    public void setMasterCustomerId( String _strMasterCustomerId )
    {
        this._strMasterCustomerId = _strMasterCustomerId;
    }

    public boolean isMerged( )
    {
        return _bIsMerged;
    }

    public void setMerged( boolean _bIsMerged )
    {
        this._bIsMerged = _bIsMerged;
    }

    public Timestamp getMergeDate( )
    {
        return _dateMergeDate;
    }

    public void setMergeDate( Timestamp _dateMergeDate )
    {
        this._dateMergeDate = _dateMergeDate;
    }
}
