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

import java.util.ArrayList;
import java.util.List;

public class AttributeDefinitionDto
{
    private String _strName;
    private String _strKeyName;
    private String _strDescription;
    private AttributeType _keyType;
    private boolean _bCertifiable;
    private boolean _bPivot;
    private int _nKeyWeight;
    private AttributeRequirement attributeRequirement;
    private AttributeRight attributeRight;
    private List<CertificationProcessus> attributeCertifications = new ArrayList<>( );

    public String getName( )
    {
        return _strName;
    }

    public void setName( String _strName )
    {
        this._strName = _strName;
    }

    public String getKeyName( )
    {
        return _strKeyName;
    }

    public void setKeyName( String _strKeyName )
    {
        this._strKeyName = _strKeyName;
    }

    public String getDescription( )
    {
        return _strDescription;
    }

    public void setDescription( String _strDescription )
    {
        this._strDescription = _strDescription;
    }

    public AttributeType getType( )
    {
        return _keyType;
    }

    public void setType( AttributeType _keyType )
    {
        this._keyType = _keyType;
    }

    public boolean isCertifiable( )
    {
        return _bCertifiable;
    }

    public void setCertifiable( boolean _bCertifiable )
    {
        this._bCertifiable = _bCertifiable;
    }

    public boolean isPivot( )
    {
        return _bPivot;
    }

    public void setPivot( boolean _bPivot )
    {
        this._bPivot = _bPivot;
    }

    public int getKeyWeight( )
    {
        return _nKeyWeight;
    }

    public void setKeyWeight( int _nKeyWeight )
    {
        this._nKeyWeight = _nKeyWeight;
    }

    public AttributeRequirement getAttributeRequirement( )
    {
        return attributeRequirement;
    }

    public void setAttributeRequirement( AttributeRequirement attributeRequirement )
    {
        this.attributeRequirement = attributeRequirement;
    }

    public AttributeRight getAttributeRight( )
    {
        return attributeRight;
    }

    public void setAttributeRight( AttributeRight attributeRight )
    {
        this.attributeRight = attributeRight;
    }

    public List<CertificationProcessus> getAttributeCertifications( )
    {
        return attributeCertifications;
    }

    public void setAttributeCertifications( List<CertificationProcessus> attributeCertifications )
    {
        this.attributeCertifications = attributeCertifications;
    }
}
