package org.mondo.editor.graphiti.diagram;

import org.eclipse.emf.ecore.EEnum;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.platform.IPlatformImageConstants;
import org.mondo.editor.graphiti.diagram.utils.DiagramUtils;

/**
 * Class to expand an EEnum object.
 * 
 * @author miso partner AnaPescador
 *
 */
public class ExpandEEnumFeature extends AbstractCustomFeature {

	public ExpandEEnumFeature(IFeatureProvider fp) {
        super(fp);
	}
	
	@Override
    public boolean canExecute(ICustomContext context) {
          boolean ret = false;
          PictogramElement[] pes = context.getPictogramElements();
          if (pes != null && pes.length == 1) {
                Object bo = getBusinessObjectForPictogramElement(pes[0]);
                if (bo instanceof EEnum) {
                	if (DiagramUtils.isCollapse((Shape)pes[0])){
                		ret = true;
                	}
                }
          }
          return ret;
    }

    @Override
    public String getName() {
          return "Expand";
    }

    @Override
    public String getDescription() {
          return "Expand EEnum";
    }

    @Override
    public String getImageId() {
          return IPlatformImageConstants.IMG_EDIT_EXPAND;
    }

    @Override
    public boolean isAvailable(IContext context) {
    	return true;
    }

    @Override
    public void execute(ICustomContext context) {   
    	PictogramElement[] pes = context.getPictogramElements();
    	DiagramUtils.expandEEnum((ContainerShape)pes[0], getFeatureProvider());
    }
	
}
