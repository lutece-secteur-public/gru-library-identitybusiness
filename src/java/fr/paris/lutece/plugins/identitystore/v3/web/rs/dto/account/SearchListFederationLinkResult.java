package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

import java.util.List;

public class SearchListFederationLinkResult
{
    private List<FederationLinkDto> _listFederationLinks;

    public List<FederationLinkDto> getFederationLinks()
    {
        return _listFederationLinks;
    }

    public void setFederationLinks(List<FederationLinkDto> _listFederationLinks)
    {
        this._listFederationLinks = _listFederationLinks;
    }

    @Override
    public String toString() {
        return "SearchListFederationLinkResult{" +
                "_listFederationLinks=" + _listFederationLinks +
                '}';
    }
}
