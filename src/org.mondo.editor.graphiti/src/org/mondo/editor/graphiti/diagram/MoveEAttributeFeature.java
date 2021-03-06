package org.mondo.editor.graphiti.diagram;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;

/**
 * Class that not allows to move the EAttributes object within the EClass object.
 * 
 * @author miso partner AnaPescador
 *
 */
public class MoveEAttributeFeature extends DefaultMoveShapeFeature {

	public MoveEAttributeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		
		return false;
	}
}
