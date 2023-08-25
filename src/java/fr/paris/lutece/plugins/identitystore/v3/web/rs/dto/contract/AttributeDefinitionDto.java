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
    private AttributeRequirementDto attributeRequirement;
    private AttributeRightDto attributeRight;
    private List<CertificationProcessusDto> attributeCertifications = new ArrayList<>( );

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

    public AttributeRequirementDto getAttributeRequirement( )
    {
        return attributeRequirement;
    }

    public void setAttributeRequirement( AttributeRequirementDto attributeRequirement )
    {
        this.attributeRequirement = attributeRequirement;
    }

    public AttributeRightDto getAttributeRight( )
    {
        return attributeRight;
    }

    public void setAttributeRight( AttributeRightDto attributeRight )
    {
        this.attributeRight = attributeRight;
    }

    public List<CertificationProcessusDto> getAttributeCertifications( )
    {
        return attributeCertifications;
    }

    public void setAttributeCertifications( List<CertificationProcessusDto> attributeCertifications )
    {
        this.attributeCertifications = attributeCertifications;
    }
}
