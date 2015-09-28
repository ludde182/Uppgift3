package t3.isprojekt.uppg3.controller;

import java.awt.Desktop;
import java.io.File;
public class Controller {

	public void openDocument(String s) {
			try {
				Desktop desktop = null;
				if (Desktop.isDesktopSupported()) {
					desktop = Desktop.getDesktop();
				}
				desktop.open(new File(s));
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
	}
}
