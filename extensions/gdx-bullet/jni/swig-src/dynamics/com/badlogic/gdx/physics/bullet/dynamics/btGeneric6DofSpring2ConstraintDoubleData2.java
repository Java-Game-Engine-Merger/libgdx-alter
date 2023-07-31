/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.dynamics;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.physics.bullet.collision.*;

public class btGeneric6DofSpring2ConstraintDoubleData2 extends BulletBase {
	private long swigCPtr;

	protected btGeneric6DofSpring2ConstraintDoubleData2 (final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}

	/** Construct a new btGeneric6DofSpring2ConstraintDoubleData2, normally you should not need this constructor it's intended for
	 * low-level usage. */
	public btGeneric6DofSpring2ConstraintDoubleData2 (long cPtr, boolean cMemoryOwn) {
		this("btGeneric6DofSpring2ConstraintDoubleData2", cPtr, cMemoryOwn);
		construct();
	}

	@Override
	protected void reset (long cPtr, boolean cMemoryOwn) {
		if (!destroyed) destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}

	public static long getCPtr (btGeneric6DofSpring2ConstraintDoubleData2 obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize () throws Throwable {
		if (!destroyed) destroy();
		super.finalize();
	}

	@Override
	protected synchronized void delete () {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				DynamicsJNI.delete_btGeneric6DofSpring2ConstraintDoubleData2(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

	public void setTypeConstraintData (btTypedConstraintDoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_typeConstraintData_set(swigCPtr, this,
			btTypedConstraintDoubleData.getCPtr(value), value);
	}

	public btTypedConstraintDoubleData getTypeConstraintData () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_typeConstraintData_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTypedConstraintDoubleData(cPtr, false);
	}

	public void setRbAFrame (btTransformDoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rbAFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value),
			value);
	}

	public btTransformDoubleData getRbAFrame () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rbAFrame_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
	}

	public void setRbBFrame (btTransformDoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rbBFrame_set(swigCPtr, this, btTransformDoubleData.getCPtr(value),
			value);
	}

	public btTransformDoubleData getRbBFrame () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rbBFrame_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btTransformDoubleData(cPtr, false);
	}

	public void setLinearUpperLimit (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearUpperLimit_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearUpperLimit () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearUpperLimit_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearLowerLimit (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearLowerLimit_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearLowerLimit () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearLowerLimit_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearBounce (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearBounce_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getLinearBounce () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearBounce_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearStopERP (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearStopERP_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getLinearStopERP () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearStopERP_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearStopCFM (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearStopCFM_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getLinearStopCFM () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearStopCFM_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearMotorERP (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearMotorERP_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getLinearMotorERP () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearMotorERP_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearMotorCFM (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearMotorCFM_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getLinearMotorCFM () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearMotorCFM_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearTargetVelocity (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearTargetVelocity_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearTargetVelocity () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearTargetVelocity_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearMaxMotorForce (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearMaxMotorForce_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearMaxMotorForce () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearMaxMotorForce_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearServoTarget (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearServoTarget_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearServoTarget () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearServoTarget_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearSpringStiffness (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringStiffness_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearSpringStiffness () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringStiffness_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearSpringDamping (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringDamping_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearSpringDamping () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringDamping_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearEquilibriumPoint (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearEquilibriumPoint_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getLinearEquilibriumPoint () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearEquilibriumPoint_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setLinearEnableMotor (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearEnableMotor_set(swigCPtr, this, value);
	}

	public String getLinearEnableMotor () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearEnableMotor_get(swigCPtr, this);
	}

	public void setLinearServoMotor (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearServoMotor_set(swigCPtr, this, value);
	}

	public String getLinearServoMotor () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearServoMotor_get(swigCPtr, this);
	}

	public void setLinearEnableSpring (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearEnableSpring_set(swigCPtr, this, value);
	}

	public String getLinearEnableSpring () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearEnableSpring_get(swigCPtr, this);
	}

	public void setLinearSpringStiffnessLimited (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringStiffnessLimited_set(swigCPtr, this, value);
	}

	public String getLinearSpringStiffnessLimited () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringStiffnessLimited_get(swigCPtr, this);
	}

	public void setLinearSpringDampingLimited (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringDampingLimited_set(swigCPtr, this, value);
	}

	public String getLinearSpringDampingLimited () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_linearSpringDampingLimited_get(swigCPtr, this);
	}

	public void setPadding1 (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_padding1_set(swigCPtr, this, value);
	}

	public String getPadding1 () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_padding1_get(swigCPtr, this);
	}

	public void setAngularUpperLimit (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularUpperLimit_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularUpperLimit () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularUpperLimit_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularLowerLimit (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularLowerLimit_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularLowerLimit () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularLowerLimit_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularBounce (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularBounce_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getAngularBounce () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularBounce_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularStopERP (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularStopERP_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getAngularStopERP () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularStopERP_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularStopCFM (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularStopCFM_set(swigCPtr, this, btVector3DoubleData.getCPtr(value),
			value);
	}

	public btVector3DoubleData getAngularStopCFM () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularStopCFM_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularMotorERP (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularMotorERP_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularMotorERP () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularMotorERP_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularMotorCFM (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularMotorCFM_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularMotorCFM () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularMotorCFM_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularTargetVelocity (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularTargetVelocity_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularTargetVelocity () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularTargetVelocity_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularMaxMotorForce (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularMaxMotorForce_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularMaxMotorForce () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularMaxMotorForce_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularServoTarget (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularServoTarget_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularServoTarget () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularServoTarget_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularSpringStiffness (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringStiffness_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularSpringStiffness () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringStiffness_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularSpringDamping (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringDamping_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularSpringDamping () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringDamping_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularEquilibriumPoint (btVector3DoubleData value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularEquilibriumPoint_set(swigCPtr, this,
			btVector3DoubleData.getCPtr(value), value);
	}

	public btVector3DoubleData getAngularEquilibriumPoint () {
		long cPtr = DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularEquilibriumPoint_get(swigCPtr, this);
		return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
	}

	public void setAngularEnableMotor (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularEnableMotor_set(swigCPtr, this, value);
	}

	public String getAngularEnableMotor () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularEnableMotor_get(swigCPtr, this);
	}

	public void setAngularServoMotor (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularServoMotor_set(swigCPtr, this, value);
	}

	public String getAngularServoMotor () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularServoMotor_get(swigCPtr, this);
	}

	public void setAngularEnableSpring (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularEnableSpring_set(swigCPtr, this, value);
	}

	public String getAngularEnableSpring () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularEnableSpring_get(swigCPtr, this);
	}

	public void setAngularSpringStiffnessLimited (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringStiffnessLimited_set(swigCPtr, this, value);
	}

	public String getAngularSpringStiffnessLimited () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringStiffnessLimited_get(swigCPtr, this);
	}

	public void setAngularSpringDampingLimited (String value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringDampingLimited_set(swigCPtr, this, value);
	}

	public String getAngularSpringDampingLimited () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_angularSpringDampingLimited_get(swigCPtr, this);
	}

	public void setRotateOrder (int value) {
		DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rotateOrder_set(swigCPtr, this, value);
	}

	public int getRotateOrder () {
		return DynamicsJNI.btGeneric6DofSpring2ConstraintDoubleData2_rotateOrder_get(swigCPtr, this);
	}

	public btGeneric6DofSpring2ConstraintDoubleData2 () {
		this(DynamicsJNI.new_btGeneric6DofSpring2ConstraintDoubleData2(), true);
	}

}
