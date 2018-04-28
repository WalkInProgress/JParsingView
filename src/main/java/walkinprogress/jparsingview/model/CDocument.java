package walkinprogress.jparsingview.model;

public class CDocument 
{
	public CDocument ( )
	{
		m_strName = new String ( );
		m_refRoot = new CNode ( );
	}
	
	public void linkNode ( CNode refParent, CNode refChild )
	{
		refParent.addChild(refChild);
	}
	public CNode linkNode ( CNode refParent, String strId )
	{
		CNode refNewNode = CNodeFactory.instance ( ).create ( );
		refNewNode.setName ( strId );
		refParent.addChild( refNewNode );
		return refNewNode;
	}	
	/*
	 * Data members
	 */
	String m_strName;
	CNode m_refRoot;
}