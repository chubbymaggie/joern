package cfg.nodes;

import java.util.Map;

import databaseNodes.NodeKeys;

public class CFGExitNode extends AbstractCFGNode
{

	@Override
	public String toString()
	{
		return "[EXIT]";
	}

	@Override
	public Map<String, Object> getProperties()
	{
		Map<String, Object> properties = super.getProperties();
		properties.put(NodeKeys.CODE, "EXIT");
		return properties;
	}

}
