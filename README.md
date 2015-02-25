hawk-drivers
============

Heterogenous model format drivers for Mondo/Hawk https://github.com/kb634/mondo-hawk

Includes Hawk drivers and standalone file readers for the follwing formats:

 * IFC (STEP and IFCXML)
 * Modelio (version 3.2)

Licences of original code are AGPL for IFC and GPLv3 for Modelio.

Instructions
============


In order to use these drivers with Hawk, follow these steps:

1. Clone the Hawk sources from:
		<git clone https://github.com/kb634/mondo-hawk.git>

2. Import the Hawk projects into an Eclipse workspace. Eclipse 4.3 (Kepler) is recommended if using the Modelio driver for Hawk. Ensure there are no compilation issues and all dependencies are resolved.

3. check out the Modelio 3.2 sources from:
		<svn checkout https://opensourceprojects.eu/svn/p/mondo/code/trunk/modelio modelio3.2-sources>

4. Import the Modelio projects into Eclipse. Again, ensure there are no compilation issues and all dependencies are resolved. The instruction from this page: http://forge.modelio.org/projects/modelio3-development-app/wiki particularly the link "Compile the Modelio plugins" may be helpful.

	The following Modelio projects are required by the Hawk modelio driver:
* org.modelio.core.project
* org.modelio.core.utils
* org.modelio.metamodel.emfapi
* org.modelio.core.kernel
* org.modelio.metamodel.data


5. Clone the Hawk IFC and Modelio drivers sources and import the drivers into the Eclipse workspace.

		<git clone https://github.com/seyyedshah/hawk-drivers.git>

6. Programatically create a Hawk instance as per the runtime examples under the project "_hawk_runtime_example" and index locations that contain 

7. (Optional) use the Hawk Eclipse UI available here:

		<https://github.com/seyyedshah/hawk-ui>
