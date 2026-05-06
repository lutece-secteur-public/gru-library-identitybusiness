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
package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public enum AttributeTreatmentType
{
    /**
     * Attribute must exist and have a different value (not APPROXIMATED) in the search response.
     */
    DIFFERENT( true, "Attribute must exist and have a different value (not APPROXIMATED)." ),
    /**
     * Attribute must exist and be approximated in the search response.
     */
    APPROXIMATED( true, "Attribute must exist and be approximated." ),
    /**
     * Attribute must exist and be strictly approximated in the search response, which means it cannot be equal.
     */
    STRICTLY_APPROXIMATED( false, "Attribute must exist and be strictly approximated, which means it cannot be equal." ),
    /**
     * Attribute must exist and be strictly equal in the search response.
     */
    STRICT( false, "Attribute must exist and be strictly equal." ),
    /**
     * Attribute must not exist in the search response.
     */
    ABSENT( true, "Attribute must not exist." );

    /**
     * Defines if the treatment type can be used for rules design.
     */
    private final boolean forRules;
    private final String description;

    AttributeTreatmentType( final boolean forRules, final String description )
    {
        this.forRules = forRules;
        this.description = description;
    }

    /**
     * Gives the list of {@link AttributeTreatmentType} that can be used for rules design.
     * 
     * @return
     */
    public static List<AttributeTreatmentType> valuesForRules( )
    {
        return Arrays.stream( values( ) ).filter( AttributeTreatmentType::isForRules ).collect( Collectors.toList( ) );
    }

    public boolean isForRules( )
    {
        return forRules;
    }

    public static String displayValues( boolean forRules )
    {
        return ( forRules ? valuesForRules() : Arrays.asList( values( ) ) )
                .stream( ).map( e -> e.name( ) + " - " + e.getDescription( ) )
                .collect(Collectors.joining( "," ) );
    }

    @Override
    public String toString( )
    {
        return "AttributeTreatmentType{" + " name='" + this.name( ) + '\'' + "forRules=" + forRules + '}';
    }

    public String getLabel( )
    {
        return this.name( );
    }

    public String getDescription( )
    {
        return this.description;
    }
}
