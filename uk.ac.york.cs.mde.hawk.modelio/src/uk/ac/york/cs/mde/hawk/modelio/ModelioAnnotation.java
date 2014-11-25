package uk.ac.york.cs.mde.hawk.modelio;

import java.util.HashMap;

import org.eclipse.emf.ecore.EAnnotation;

import com.googlecode.hawk.core.model.IHawkAnnotation;



public class ModelioAnnotation implements IHawkAnnotation {

	EAnnotation ann;

	public ModelioAnnotation(EAnnotation a) {

		ann = a;

	}

	@Override
	public String getSource() {
		return ann.getSource();
	}

	@Override
	public HashMap<String, String> getDetails() {

		HashMap<String, String> m = new HashMap<String, String>();

		for (String s : ann.getDetails().keySet())
			m.put(s, ann.getDetails().get(s));

		return m;
	}

}
