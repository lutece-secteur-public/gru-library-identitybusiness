package fr.paris.lutece.plugins.identitystore.v3.web.rs.dto.account;

public class PaginationRangeDto {
    private String _strFirst;
    private String _strPrev;
    private String _strNext;
    private String _strLast;

    public String getFirst(  )
    {
        return _strFirst;
    }

    public void setFirst( String _strFirst )
    {
        this._strFirst = _strFirst;
    }

    public String getPrev(  )
    {
        return _strPrev;
    }

    public void setPrev( String _strPrev )
    {
        this._strPrev = _strPrev;
    }

    public String getNext(  )
    {
        return _strNext;
    }

    public void setNext( String _strNext )
    {
        this._strNext = _strNext;
    }

    public String getLast(  )
    {
        return _strLast;
    }

    public void setLast( String _strLast )
    {
        this._strLast = _strLast;
    }

    @Override
    public String toString() {
        return "PaginationRangeDto{" +
                "_strFirst='" + _strFirst + '\'' +
                ", _strPrev='" + _strPrev + '\'' +
                ", _strNext='" + _strNext + '\'' +
                ", _strLast='" + _strLast + '\'' +
                '}';
    }
}
