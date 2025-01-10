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

import java.util.ArrayList;
import java.util.List;

public class IdentityDuplicateDefinition
{
    /**
     * Identités exclues des suspicions de doublons
     */
    protected List<IdentityDuplicateExclusion> duplicateExclusions = new ArrayList<>( );

    /**
     * Suspicion de doublon
     */
    protected IdentityDuplicateSuspicion duplicateSuspicion;

    /**
     * Flag indiquant si l'identité est susceptible d'avoir des doublons
     * 
     * @return true si l'identité est susceptible d'avoir des doublons
     */
    public boolean isSuspicious( )
    {
        return this.getDuplicateSuspicion( ) != null;
    }

    /**
     * Flag indiquant si l'identité est marquée comme n'étant pas un doublon d'une ou plusieurs autres identités
     * 
     * @return true si l'identité est marquée comme n'étant pas un doublon d'une ou plusieurs autres identités
     */
    public boolean isExcluded( )
    {
        return this.getDuplicateExclusions( ) != null && !this.getDuplicateExclusions( ).isEmpty( );
    }

    public List<IdentityDuplicateExclusion> getDuplicateExclusions( )
    {
        return duplicateExclusions;
    }

    public void setDuplicateExclusions( List<IdentityDuplicateExclusion> duplicateExclusions )
    {
        this.duplicateExclusions = duplicateExclusions;
    }

    public IdentityDuplicateSuspicion getDuplicateSuspicion( )
    {
        return duplicateSuspicion;
    }

    public void setDuplicateSuspicion( IdentityDuplicateSuspicion duplicateSuspicion )
    {
        this.duplicateSuspicion = duplicateSuspicion;
    }

    @Override
    public String toString() {
        return "IdentityDuplicateDefinition{" +
                "duplicateExclusions=" + duplicateExclusions +
                ", duplicateSuspicion=" + duplicateSuspicion +
                '}';
    }
}
