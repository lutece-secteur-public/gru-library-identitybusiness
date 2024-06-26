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

import java.sql.Timestamp;

public class DuplicateRuleSummaryDto
{
    private int _nId;
    private String _strName;
    private String _strCode;
    private String _strDescription;
    private int _nPriority;
    private int _nDuplicateCount;
    private Timestamp _dateDaemonLastExecDate;
    private boolean _bActive;
    private boolean _bDaemon;

    public int getId( )
    {
        return _nId;
    }

    public void setId( int _nId )
    {
        this._nId = _nId;
    }

    public String getName( )
    {
        return _strName;
    }

    public void setName( String _strName )
    {
        this._strName = _strName;
    }

    public String getCode( )
    {
        return _strCode;
    }

    public void setCode( String _strCode )
    {
        this._strCode = _strCode;
    }

    public String getDescription( )
    {
        return _strDescription;
    }

    public void setDescription( String _strDescription )
    {
        this._strDescription = _strDescription;
    }

    public int getDuplicateCount( )
    {
        return _nDuplicateCount;
    }

    public void setDuplicateCount( int _nDuplicateCount )
    {
        this._nDuplicateCount = _nDuplicateCount;
    }

    public int getPriority( )
    {
        return _nPriority;
    }

    public void setPriority( int _nPriority )
    {
        this._nPriority = _nPriority;
    }

    public Timestamp getDaemonLastExecDate( )
    {
        return _dateDaemonLastExecDate;
    }

    public void setDaemonLastExecDate( Timestamp _dateDaemonLastExecDate )
    {
        this._dateDaemonLastExecDate = _dateDaemonLastExecDate;
    }

    public boolean isActive() {
        return _bActive;
    }

    public void setActive(final boolean _bActive) {
        this._bActive = _bActive;
    }

    public boolean isDaemon() {
        return _bDaemon;
    }

    public void setDaemon(final boolean _bDaemon) {
        this._bDaemon = _bDaemon;
    }
}
