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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import java.util.ArrayList;
import java.util.List;

public class AttributeKeyDto
{
    private String _strName;
    private String _strKeyName;
    private String _strDescription;
    private AttributeType _keyType;
    private boolean _bCertifiable;
    private boolean _bPivot;
    private int _nKeyWeight;
    private boolean _bMandatoryForCreation;
    private String _strValidationRegex;
    private String _strValidationErrorMessage;
    private String _strValidationErrorMessageKey;
    private List<AttributeValueDto> _listValues = new ArrayList<>( );

    public String getName( )
    {
        return _strName;
    }

    public void setName( String strName )
    {
        this._strName = strName;
    }

    public String getKeyName( )
    {
        return _strKeyName;
    }

    public void setKeyName( String strKeyName )
    {
        this._strKeyName = strKeyName;
    }

    public String getDescription( )
    {
        return _strDescription;
    }

    public void setDescription( String strDescription )
    {
        this._strDescription = strDescription;
    }

    public AttributeType getType( )
    {
        return _keyType;
    }

    public void setType( AttributeType keyType )
    {
        this._keyType = keyType;
    }

    public boolean isCertifiable( )
    {
        return _bCertifiable;
    }

    public void setCertifiable( boolean bCertifiable )
    {
        this._bCertifiable = bCertifiable;
    }

    public boolean isPivot( )
    {
        return _bPivot;
    }

    public void setPivot( boolean bPivot )
    {
        this._bPivot = bPivot;
    }

    public int getKeyWeight( )
    {
        return _nKeyWeight;
    }

    public void setKeyWeight( int nKeyWeight )
    {
        this._nKeyWeight = nKeyWeight;
    }

    public boolean isMandatoryForCreation( )
    {
        return _bMandatoryForCreation;
    }

    public void setMandatoryForCreation( boolean _bMandatoryForCreation )
    {
        this._bMandatoryForCreation = _bMandatoryForCreation;
    }

    public String getValidationRegex( )
    {
        return _strValidationRegex;
    }

    public void setValidationRegex( String _strValidationRegex )
    {
        this._strValidationRegex = _strValidationRegex;
    }

    public String getValidationErrorMessage( )
    {
        return _strValidationErrorMessage;
    }

    public void setValidationErrorMessage( String _strValidationErrorMessage )
    {
        this._strValidationErrorMessage = _strValidationErrorMessage;
    }

    public String getValidationErrorMessageKey( )
    {
        return _strValidationErrorMessageKey;
    }

    public void setValidationErrorMessageKey( String _strValidationErrorMessageKey )
    {
        this._strValidationErrorMessageKey = _strValidationErrorMessageKey;
    }

    public List<AttributeValueDto> getValues( )
    {
        return _listValues;
    }

    public void setValues( List<AttributeValueDto> values )
    {
        this._listValues = values;
    }
}
