/**
 * 
 */
package de.hybris.platform.cuppy.data;

import de.hybris.platform.core.initialization.SystemSetup.Type;
import de.hybris.platform.core.initialization.SystemSetupContext;
import de.hybris.platform.cuppy.constants.CuppyConstants;
import de.hybris.platform.cuppy.systemsetup.CuppySystemSetup;

import java.util.Collections;

import javax.annotation.Resource;

import org.junit.Before;
import org.junit.Test;


/**
 * @author andreas.thaler
 * 
 */
public class L1Ger2010DataTest extends AbstractCompetitionDataTest
{
	@Resource
	private CuppySystemSetup cuppySystemSetup;

	public L1Ger2010DataTest()
	{
		super("1lger2010");
	}

	@Before
	public void setUpDate() throws Exception //NOPMD
	{
		cuppySystemSetup.import1LG2010(new SystemSetupContext(Collections.singletonMap(CuppyConstants.PARAM_1LGER2010, new String[]
		{ CuppyConstants.PARAM_1LGER2010_SETUP }), Type.NOTDEFINED, CuppyConstants.EXTENSIONNAME));
	}

	@Test
	public void testMatchData() throws Exception //NOPMD
	{
		testTeams(18, 0);
	}
}
