// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.plugins.pt_assistant;

import javax.swing.JOptionPane;

import org.openstreetmap.josm.data.validation.OsmValidator;
import org.openstreetmap.josm.data.validation.Test;
import org.openstreetmap.josm.plugins.Plugin;
import org.openstreetmap.josm.plugins.PluginInformation;

/**
 * This is the main class of the PTAssistant plugin.
 *
 * @author daryagol / Darya Golovko
 * @param <PlatformsFirst>
 */
public class PTAssistantPlugin extends Plugin {

	/**
	 * Main constructor.
	 *
	 * @param info
	 *            Required information of the plugin. Obtained from the jar
	 *            file.
	 */
	public PTAssistantPlugin(PluginInformation info) {
		super(info);
		
		int arrayLength = OsmValidator.getAllAvailableTests().length;


		
		OsmValidator.addTest(PlatformsFirst.class);
		arrayLength = OsmValidator.getAllAvailableTests().length;
		JOptionPane.showMessageDialog(null, "after the addition, the array length is " + (new Integer(arrayLength)).toString());
		

//		JOptionPane.showMessageDialog(null, "before route");

		
		

		

	}


}
