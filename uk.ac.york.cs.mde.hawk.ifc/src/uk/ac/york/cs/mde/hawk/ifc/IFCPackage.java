package uk.ac.york.cs.mde.hawk.ifc;

import java.util.HashSet;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;

import com.googlecode.hawk.core.model.*;

public class IFCPackage extends IFCObject implements IHawkPackage {

	private EPackage ep;
	private IHawkMetaModelResource r;

	public IFCPackage(EPackage e, IHawkMetaModelResource res) {

		super(e);
		ep = e;
		r = res;

	}

	@Override
	public String getName() {

		return ep.getName();
	}

	@Override
	public IHawkClass getClassifier(String string) {
		EClassifier e = ep.getEClassifier(string);
		if (e instanceof EClass)
			return new IFCClass(((EClass) e));
		else {
			System.err
					.println("attempt to call getEClassifier(String string) on a non-eclass, debug");
			return null;
		}
	}

	@Override
	public String getNsURI() {
		return ep.getNsURI();
	}

	@Override
	public HashSet<IHawkClass> getClasses() {

		HashSet<IHawkClass> ret = new HashSet<>();

		for (EClassifier e : ep.getEClassifiers())
			if (e instanceof EClass)
				ret.add(new IFCClass(((EClass) e)));

		return ret;
	}

	@Override
	public IHawkMetaModelResource getResource() {
		return r;
	}

	// @Override
	// public HawkMetaModelResource getResource() {
	// return new EMFMetaModelResource(ep.eResource(), p);
	// }
}
