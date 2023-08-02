package fr.paris.lutece.plugins.identitystore.v2.business;

import java.util.List;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.CertifiedAttribute;

public interface IExternalAttributeSource {
	
	/**
	 * Complete the attribute list of the identity with external certified attributes
	 * - Attributes must be certified with a known certification process
	 * - do not add attributes that are already present in the central referential
	 * - do not send those attributes to the central referential
	 * 
	 * @param cuid
	 * @return the list of external attributes
	 */
	List<CertifiedAttribute> getAdditionnalAttributes( String cuid );
}
