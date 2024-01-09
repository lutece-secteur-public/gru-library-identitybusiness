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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.contract;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ServiceContractDto
{
    private int _nId;
    private String _strClientCode;
    private String _strName;
    private String _strMoaEntityName;
    private String _strMoeEntityName;
    private String _strMoeResponsibleName;
    private String _strMoaContactName;
    private String _strServiceType;
    private Date _dateStartingDate;
    private Date _dateEndingDate;
    private boolean _bAuthorizedCreation;
    private boolean _bAuthorizedUpdate;
    private boolean _bAuthorizedSearch;
    private boolean _bAuthorizedMerge;
    private boolean _bAuthorizedAccountUpdate;
    private boolean _bAuthorizedDeletion;
    private boolean _bAuthorizedImport;
    private boolean _bAuthorizedExport;
    private boolean _bAuthorizedDecertification;
    private boolean _bAuthorizedAgentHistoryRead;
    private int _nDataRetentionPeriodInMonths;
    private List<AttributeDefinitionDto> attributeDefinitions = new ArrayList<>( );

    public int getId( )
    {
        return _nId;
    }

    public void setId( int _nId )
    {
        this._nId = _nId;
    }

    public String getClientCode( )
    {
        return _strClientCode;
    }

    public void setClientCode( String _strClientCode )
    {
        this._strClientCode = _strClientCode;
    }

    public String getName( )
    {
        return _strName;
    }

    public void setName( String _strName )
    {
        this._strName = _strName;
    }

    public String getMoaEntityName( )
    {
        return _strMoaEntityName;
    }

    public void setMoaEntityName( String _strMoaEntityName )
    {
        this._strMoaEntityName = _strMoaEntityName;
    }

    public String getMoeEntityName( )
    {
        return _strMoeEntityName;
    }

    public void setMoeEntityName( String _strMoeEntityName )
    {
        this._strMoeEntityName = _strMoeEntityName;
    }

    public String getMoeResponsibleName( )
    {
        return _strMoeResponsibleName;
    }

    public void setMoeResponsibleName( String _strMoeResponsibleName )
    {
        this._strMoeResponsibleName = _strMoeResponsibleName;
    }

    public String getMoaContactName( )
    {
        return _strMoaContactName;
    }

    public void setMoaContactName( String _strMoaContactName )
    {
        this._strMoaContactName = _strMoaContactName;
    }

    public String getServiceType( )
    {
        return _strServiceType;
    }

    public void setServiceType( String _strServiceType )
    {
        this._strServiceType = _strServiceType;
    }

    public Date getStartingDate( )
    {
        return _dateStartingDate;
    }

    public void setStartingDate( Date _dateStartingDate )
    {
        this._dateStartingDate = _dateStartingDate;
    }

    public Date getEndingDate( )
    {
        return _dateEndingDate;
    }

    public void setEndingDate( Date _dateEndingDate )
    {
        this._dateEndingDate = _dateEndingDate;
    }

    public boolean isAuthorizedCreation( )
    {
        return _bAuthorizedCreation;
    }

    public void setAuthorizedCreation( boolean _bAuthorizedCreation )
    {
        this._bAuthorizedCreation = _bAuthorizedCreation;
    }

    public boolean isAuthorizedUpdate( )
    {
        return _bAuthorizedUpdate;
    }

    public void setAuthorizedUpdate( boolean _bAuthorizedUpdate )
    {
        this._bAuthorizedUpdate = _bAuthorizedUpdate;
    }

    public boolean isAuthorizedSearch( )
    {
        return _bAuthorizedSearch;
    }

    public void setAuthorizedSearch( boolean _bAuthorizedSearch )
    {
        this._bAuthorizedSearch = _bAuthorizedSearch;
    }

    public boolean isAuthorizedMerge( )
    {
        return _bAuthorizedMerge;
    }

    public void setAuthorizedMerge( boolean _bAuthorizedMerge )
    {
        this._bAuthorizedMerge = _bAuthorizedMerge;
    }

    public boolean isAuthorizedAccountUpdate( )
    {
        return _bAuthorizedAccountUpdate;
    }

    public void setAuthorizedAccountUpdate( boolean _bAuthorizedAccountUpdate )
    {
        this._bAuthorizedAccountUpdate = _bAuthorizedAccountUpdate;
    }

    public boolean isAuthorizedDeletion( )
    {
        return _bAuthorizedDeletion;
    }

    public void setAuthorizedDeletion( boolean _bAuthorizedDeletion )
    {
        this._bAuthorizedDeletion = _bAuthorizedDeletion;
    }

    public boolean isAuthorizedImport( )
    {
        return _bAuthorizedImport;
    }

    public void setAuthorizedImport( boolean _bAuthorizedImport )
    {
        this._bAuthorizedImport = _bAuthorizedImport;
    }

    public boolean isAuthorizedExport( )
    {
        return _bAuthorizedExport;
    }

    public void setAuthorizedExport( boolean _bAuthorizedExport )
    {
        this._bAuthorizedExport = _bAuthorizedExport;
    }

    public boolean isAuthorizedDecertification( )
    {
        return _bAuthorizedDecertification;
    }

    public void setAuthorizedDecertification( boolean _bAuthorizedDecertification )
    {
        this._bAuthorizedDecertification = _bAuthorizedDecertification;
    }

    public boolean isAuthorizedAgentHistoryRead( )
    {
        return _bAuthorizedAgentHistoryRead;
    }

    public void setAuthorizedAgentHistoryRead( boolean _bAuthorizedAgentHistoryRead )
    {
        this._bAuthorizedAgentHistoryRead = _bAuthorizedAgentHistoryRead;
    }

    public int getDataRetentionPeriodInMonths( )
    {
        return _nDataRetentionPeriodInMonths;
    }

    public void setDataRetentionPeriodInMonths( int _nDataRetentionPeriodInMonths )
    {
        this._nDataRetentionPeriodInMonths = _nDataRetentionPeriodInMonths;
    }

    public List<AttributeDefinitionDto> getAttributeDefinitions( )
    {
        return attributeDefinitions;
    }

    public void setAttributeDefinitions( List<AttributeDefinitionDto> attributeDefinitions )
    {
        this.attributeDefinitions = attributeDefinitions;
    }
}
