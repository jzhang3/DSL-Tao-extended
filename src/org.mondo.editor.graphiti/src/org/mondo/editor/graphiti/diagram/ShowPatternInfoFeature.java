package org.mondo.editor.graphiti.diagram;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.mondo.editor.graphiti.diagram.utils.DiagramUtils;

/**
 * Class to show all the pattern annotations.
 * 
 * @author miso partner AnaPescador
 *
 */
public class ShowPatternInfoFeature extends AbstractCustomFeature {
 
    private boolean hasDoneChanges = false;
      
    public ShowPatternInfoFeature(IFeatureProvider fp) {
        super(fp);
    }
 
    @Override
    public String getName() {
        return "Show Pattern Information";
    }
 
    @Override
    public String getDescription() {
        return "Show information related to patterns";
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
        boolean ret = false;
        PictogramElement[] pes = context.getPictogramElements();
        if (pes != null && pes.length == 1) {
        	if (pes[0] instanceof Diagram){
        		if (!DiagramUtils.isPatternInfo(getDiagram()))       		
        			ret = true;
            }
        }
        return ret;
    }
    
    @Override
    public void execute(ICustomContext context) {    
    	PictogramElement[] pes = context.getPictogramElements();
    	Object bo = getBusinessObjectForPictogramElement(pes[0]);
        if (bo instanceof EPackage) {
        	for (EClassifier eClassif: ((EPackage)bo).getEClassifiers()){
        		for (PictogramElement pe : Graphiti.getLinkService().getPictogramElements((Diagram) pes[0], eClassif)){
        			if (pe instanceof ContainerShape){
    					if (eClassif instanceof EClass) {
    						if (DiagramUtils.isExpand((ContainerShape)pe)){
	    						DiagramUtils.showPatternInfoEClass((ContainerShape)pe, getFeatureProvider());
	    						hasDoneChanges = true;
	    						for (EReference eRef : ((EClass) eClassif).getEReferences()){
	    	          				DiagramUtils.showPatternInfoEReference(getDiagram(), eRef);
	    	          			}
	    						break;
    						}
    					}
        			}
        		}
        	}
        	//box that contains applied patterns.
        	PictogramElement pe = DiagramUtils.getPatternInfoPictogram(getDiagram(), (EPackage)bo);
        	if (pe!=null){
        		pe.setVisible(true);
        		hasDoneChanges = true;
        	}
        	DiagramUtils.setPatternInfo(getDiagram(), true);
        }
    }
 
    @Override
    public boolean hasDoneChanges() {
           return this.hasDoneChanges;
    }
}