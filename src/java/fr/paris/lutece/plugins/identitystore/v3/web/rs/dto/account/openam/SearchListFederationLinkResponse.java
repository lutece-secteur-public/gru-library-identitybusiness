package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account.openam;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;

import java.util.List;

public class SearchListFederationLinkResponse extends ResponseDto
{
    private List<FederationLinkDto> _listFederationLinks;

    public List<FederationLinkDto> get_listFederationLinks()
    {
        return _listFederationLinks;
    }

    public void set_listFederationLinks(List<FederationLinkDto> _listFederationLinks)
    {
        this._listFederationLinks = _listFederationLinks;
    }
}
