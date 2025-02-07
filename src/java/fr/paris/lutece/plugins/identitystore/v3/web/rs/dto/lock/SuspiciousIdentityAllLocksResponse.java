package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.lock;

import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.common.ResponseDto;
import fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.crud.SuspiciousIdentityDto;

import java.util.List;

public class SuspiciousIdentityAllLocksResponse extends ResponseDto
{
    List<SuspiciousIdentityDto> suspiciousIdentityDtoList;

    public List<SuspiciousIdentityDto> getSuspiciousIdentityDtoList()
    {
        return suspiciousIdentityDtoList;
    }

    public void setSuspiciousIdentityDtoList(List<SuspiciousIdentityDto> suspiciousIdentityDtoList)
    {
        this.suspiciousIdentityDtoList = suspiciousIdentityDtoList;
    }
}
