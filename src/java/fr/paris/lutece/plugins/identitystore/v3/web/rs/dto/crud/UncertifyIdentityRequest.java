package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class UncertifyIdentityRequest {

    @JsonProperty("attribute_key_list")
    private List<String> attributeKeyList = new ArrayList<>( );

    public List<String> getAttributeKeyList() {
        return attributeKeyList;
    }

    public void setAttributeKeyList(final List<String> attributeKeyList) {
        this.attributeKeyList = attributeKeyList;
    }
}
