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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.contract;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ServiceContractDto
{
    private String _strName;

    private String _strOrganizationalEntity;

    private String _strResponsibleName;

    private String _strContactName;

    private String _strServiceType;

    private Date _dateStartingDate;
    private Date _dateEndingDate;

    private boolean _bAuthorizedMerge;

    private boolean _bAuthorizedAccountUpdate;

    private boolean _bAuthorizedDeletion;

    private boolean _bAuthorizedImport;

    private boolean _bAuthorizedExport;

    private boolean _bIsAuthorizedDeleteValue;

    private boolean _bIsAuthorizedDeleteCertificate;

    private List<AttributeDefinitionDto> attributeDefinitions = new ArrayList<>( );

    public String getName( )
    {
        return _strName;
    }

    public void setName( String _strName )
    {
        this._strName = _strName;
    }

    public String getOrganizationalEntity( )
    {
        return _strOrganizationalEntity;
    }

    public void setOrganizationalEntity( String _strOrganizationalEntity )
    {
        this._strOrganizationalEntity = _strOrganizationalEntity;
    }

    public String getResponsibleName( )
    {
        return _strResponsibleName;
    }

    public void setResponsibleName( String _strResponsibleName )
    {
        this._strResponsibleName = _strResponsibleName;
    }

    public String getContactName( )
    {
        return _strContactName;
    }

    public void setContactName( String _strContactName )
    {
        this._strContactName = _strContactName;
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

    public boolean isIsAuthorizedDeleteValue( )
    {
        return _bIsAuthorizedDeleteValue;
    }

    public void setIsAuthorizedDeleteValue( boolean _bIsAuthorizedDeleteValue )
    {
        this._bIsAuthorizedDeleteValue = _bIsAuthorizedDeleteValue;
    }

    public boolean isIsAuthorizedDeleteCertificate( )
    {
        return _bIsAuthorizedDeleteCertificate;
    }

    public void setIsAuthorizedDeleteCertificate( boolean _bIsAuthorizedDeleteCertificate )
    {
        this._bIsAuthorizedDeleteCertificate = _bIsAuthorizedDeleteCertificate;
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
